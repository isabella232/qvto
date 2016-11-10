/*******************************************************************************
 * Copyright (c) 2008, 2016 Borland Software Corporation and others.
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
package org.eclipse.m2m.internal.qvt.oml.blackbox.java;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.internal.qvt.oml.NLS;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.ast.binding.ASTBindingHelper;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalModuleEnv;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnit;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.LoadContext;
import org.eclipse.m2m.internal.qvt.oml.common.util.StringLineNumberProvider;
import org.eclipse.m2m.internal.qvt.oml.cst.CSTFactory;
import org.eclipse.m2m.internal.qvt.oml.emf.util.EmfUtilPlugin;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;

public abstract class JavaBlackboxProvider extends BlackboxProvider {

	public static final String CLASS_NAME_SEPARATOR = "."; //$NON-NLS-1$
	
	static InstanceAdapterFactory createInstanceAdapterFactory(final Class<?> javaModuleClass) {
		return new InstanceAdapterFactory() {
			public Object createAdapter(EObject moduleInstance) {
				try {
					return javaModuleClass.newInstance();
				} catch (InstantiationException e) {
					// FIXME - choose a better exception
					throw new IllegalArgumentException("Illegal adapter instance", e); //$NON-NLS-1$
				} catch (IllegalAccessException e) {
					// FIXME - choose a better exception
					throw new IllegalArgumentException("Illegal adapter instance", e); //$NON-NLS-1$
				}
			}
		};
	}
	
	private JavaModuleLoader createJavaModuleLoader() {
		return new JavaModuleLoader() {
			JavaMethodHandlerFactory handlerFactory;

			@Override
			protected void loadModule(QvtOperationalModuleEnv moduleEnv, final Class<?> javaModuleClass) {
				handlerFactory = new JavaMethodHandlerFactory(moduleEnv.getOCLStandardLibrary());

				Module module = moduleEnv.getModuleContextType();
				// FIXME - workaround to make Environment available with the
				// module for
				// non-transformation execution context
				ASTBindingHelper.createCST2ASTBinding(CSTFactory.eINSTANCE.createLibraryCS(), module, moduleEnv);

				setInstanceAdapterFactory(module, createInstanceAdapterFactory(javaModuleClass));
			}

			@Override
			protected void loadOperation(EOperation operation, Method javaOperation) {
				setOperationHandler(operation, handlerFactory.createHandler(javaOperation), true);
			}
		};
	}
	
	public abstract class JavaUnitDescriptor extends BlackboxUnitDescriptor {

		public BlackboxUnit unit;
		
		private List<ModuleHandle> fModules = new LinkedList<ModuleHandle>();
		
		public JavaUnitDescriptor(String unitQualifiedName) {
			super(JavaBlackboxProvider.this, unitQualifiedName);
		}

		protected void addModuleHandle(ModuleHandle moduleHandle) {
			fModules.add(moduleHandle);
		}

		@Override
		public BlackboxUnit load(LoadContext context) {
						
			if (unit != null) {
				return unit;
			}

			JavaModuleLoader javaModuleLoader = createJavaModuleLoader();
			Resource unitResource = new EcoreResourceFactoryImpl().createResource(getURI());

			BasicDiagnostic errors = null;
			List<QvtOperationalModuleEnv> loadedModules = new LinkedList<QvtOperationalModuleEnv>();

			for (ModuleHandle moduleHandle : fModules) {
				Diagnostic diagnostic = javaModuleLoader.loadModule(moduleHandle, context);

				if (EmfUtilPlugin.isSuccess(diagnostic)) {
					QvtOperationalModuleEnv nextModuleEnv = javaModuleLoader.getLoadedModule();
					nextModuleEnv.getTypeResolver().getResource().setURI(getURI());
					ASTBindingHelper.createModuleSourceBinding(nextModuleEnv.getModuleContextType(), getURI(),
							new StringLineNumberProvider("")); //$NON-NLS-1$

					loadedModules.add(nextModuleEnv);
					unitResource.getContents().add(nextModuleEnv.getModuleContextType());

					if (diagnostic.getSeverity() != Diagnostic.OK) {
						QvtPlugin.logDiagnostic(diagnostic);
					}
				} else {
					if (errors == null) {
						String message = NLS.bind(JavaBlackboxMessages.BlackboxUnitLoadFailed, getQualifiedName());
						errors = DiagnosticUtil.createErrorDiagnostic(message);
					}

					errors.add(diagnostic);
				}
			}

			if (errors != null) {
				final Diagnostic failDiagnostic = errors;
				
				unit = new BlackboxUnit() {

					public List<QvtOperationalModuleEnv> getElements() {
						return Collections.emptyList();
					}

					public Diagnostic getDiagnostic() {
						return failDiagnostic;
					}
					
				};
				
				handleBlackboxError(failDiagnostic);
			}
			else {
				unit = createBlackboxUnit(loadedModules);
			}
			
			return unit;
		}
		
		protected void handleBlackboxError(Diagnostic diagnostic) {};
	}

}
