/*******************************************************************************
 * Copyright (c) 2007, 2016 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     Christopher Gerking - bugs 289982, 326871, 427237
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.blackbox;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEvaluationEnv;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalModuleEnv;
import org.eclipse.m2m.internal.qvt.oml.ast.parser.QvtOperationalParserUtil;
import org.eclipse.m2m.internal.qvt.oml.compiler.BlackboxUnitResolver;
import org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils;
import org.eclipse.m2m.internal.qvt.oml.evaluator.ModuleInstance;
import org.eclipse.m2m.internal.qvt.oml.evaluator.ModuleInstanceFactory;
import org.eclipse.m2m.internal.qvt.oml.expressions.ImperativeOperation;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.internal.qvt.oml.stdlib.CallHandler;
import org.eclipse.m2m.internal.qvt.oml.stdlib.CallHandlerAdapter;

public abstract class BlackboxProvider {
		
	public interface InstanceAdapterFactory {
		Object createAdapter(EObject moduleInstance);
	}

	protected BlackboxProvider() {}

	protected static void setInstanceAdapterFactory(Module module, final InstanceAdapterFactory factory) {
		ModuleInstanceFactory moduleInstanceFactory = (ModuleInstanceFactory) module
				.getEFactoryInstance();
		moduleInstanceFactory
				.addPostCreateHandler(new ModuleInstanceFactory.PostCreateHandler() {
					public void created(ModuleInstance moduleInstance) {
						Object adapterInstance = factory
								.createAdapter(moduleInstance);
						moduleInstance
								.getAdapter(ModuleInstance.Internal.class)
								.addAdapter(adapterInstance);
					}
				});
	}

	protected static void setOperationHandler(EOperation operation,
			final CallHandler handler, boolean adaptSource) {
		CallHandler actualHandler = handler;
		if (adaptSource) {
			actualHandler = new CallHandler() {
				public Object invoke(ModuleInstance module, Object source,
						Object[] args, QvtOperationalEvaluationEnv evalEnv) {
					return handler.invoke(module, source, args, evalEnv);
				}
			};
		}

		CallHandlerAdapter.attach(operation, actualHandler);
	}

	public abstract Collection<? extends BlackboxUnitDescriptor> getUnitDescriptors(
			ResolutionContext resolutionContext);

	public abstract BlackboxUnitDescriptor getUnitDescriptor(
			String qualifiedName, ResolutionContext resolutionContext);
	
	public abstract void cleanup();
		
	public Collection<CallHandler> getBlackboxCallHandlers(ImperativeOperation operation, QvtOperationalModuleEnv env) {
		Collection<CallHandler> result = Collections.emptyList();
				
		ResolutionContext context = createLookupContext(env);
		
		for (BlackboxUnitDescriptor descriptor : getUnitDescriptors(context)) {
			
			assert (env.getImportedNativeLibs().isEmpty() || env.getImportedNativeLibs().containsKey(descriptor.getURI()));
			
			BlackboxUnit unit = descriptor.load(new LoadContext(env.getEPackageRegistry()));
			
			IStatus status = BasicDiagnostic.toIStatus(unit.getDiagnostic());
			if (!status.isOK()) {
				continue;
			}
			
			for (QvtOperationalModuleEnv blackboxEnv : unit.getElements()) {
				
				Module blackboxModule = blackboxEnv.getModuleContextType();
				
				if (!env.getImportedNativeLibs().isEmpty()) {
					Set<String> importedLibs = env.getImportedNativeLibs().get(descriptor.getURI());
					if (!importedLibs.contains(blackboxModule.getName())) {
						continue;
					}
				}
				
				for(EOperation blackboxOperation : blackboxModule.getEOperations()) {
					
					if (OperationMatcher.matchOperation(env, operation, blackboxOperation)) {
						if (result.isEmpty()) {
							result = new LinkedList<CallHandler>();
						}
						result.add(CallHandlerAdapter.getDispatcher(blackboxOperation));
					}
				}
			}
		}
		
		return result;
	}

	public Collection<CallHandler> getBlackboxCallHandlers(OperationalTransformation transformation, QvtOperationalModuleEnv env) {
		Collection<CallHandler> result = Collections.emptyList();
		
		ResolutionContext context = createLookupContext(env);
		
		for (BlackboxUnitDescriptor descriptor : getUnitDescriptors(context)) {
			
			assert (env.getImportedNativeLibs().isEmpty() || env.getImportedNativeLibs().containsKey(descriptor.getURI()));
			
			BlackboxUnit unit = descriptor.load(new LoadContext(env.getEPackageRegistry()));
			
			for (QvtOperationalModuleEnv blackboxEnv : unit.getElements()) {
				
				Module blackboxModule = blackboxEnv.getModuleContextType();
				
				if (!env.getImportedNativeLibs().isEmpty()) {
					Set<String> importedLibs = env.getImportedNativeLibs().get(descriptor.getURI());
					if (!importedLibs.contains(blackboxModule.getName())) {
						continue;
					}
				}
				
				for(EOperation blackboxOperation : blackboxModule.getEOperations()) {
					
					if (OperationMatcher.matchOperation(env, transformation, blackboxOperation)) {
						if (result.isEmpty()) {
							result = new LinkedList<CallHandler>();
						}
						result.add(CallHandlerAdapter.getDispatcher(blackboxOperation));
					}
				}
				
			}
		}
		
		return result;
	}
		
	private ResolutionContext createLookupContext(QvtOperationalModuleEnv env) {
		URI fileUri = QvtOperationalParserUtil.getSourceURI(env);
		ResolutionContext context = (fileUri == null) 
				? new ResolutionContextImpl(BlackboxUnitResolver.GLOBAL_CONTEXT, env.getImportedNativeLibs()) 
				: new ResolutionContextImpl(fileUri, env.getImportedNativeLibs());
		return context;
	}
	
	protected static IProject getProject(ResolutionContext resolutionContext) {
		IResource resource = URIUtils.getResource(resolutionContext.getURI());

		if (resource == null || !resource.exists()) {
			return null;
		}

		return resource.getProject();
	}
}
