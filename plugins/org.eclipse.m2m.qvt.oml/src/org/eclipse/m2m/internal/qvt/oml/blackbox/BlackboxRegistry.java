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
package org.eclipse.m2m.internal.qvt.oml.blackbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalModuleEnv;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.RegisteredBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.StandaloneBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.expressions.ImperativeOperation;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.internal.qvt.oml.stdlib.CallHandler;

/*
 * TODO - handle collisions of multiple descriptors of the same qualified name
 */
public class BlackboxRegistry {

	public static final BlackboxRegistry INSTANCE = EMFPlugin.IS_ECLIPSE_RUNNING ? new BlackboxRegistry.Eclipse()
			: new BlackboxRegistry();

	private final StandaloneBlackboxProvider fStandaloneProvider = new StandaloneBlackboxProvider();
	private final List<BlackboxProvider> fProviders;

	public BlackboxRegistry() {
		fProviders = Collections.<BlackboxProvider>singletonList(fStandaloneProvider);
	}

	protected List<? extends BlackboxProvider> getProviders() {
		return fProviders;
	}

	public BlackboxUnitDescriptor getBlackboxUnitDescriptor(String qualifiedName, ResolutionContext context) {
		for (BlackboxProvider provider : getProviders()) {
			BlackboxUnitDescriptor descriptor = provider.getUnitDescriptor(qualifiedName, context);
			if (descriptor != null) {
				return descriptor;
			}
		}
		return null;
	}

	public List<BlackboxUnitDescriptor> getBlackboxUnitDescriptors(ResolutionContext loadContext) {
		ArrayList<BlackboxUnitDescriptor> result = new ArrayList<BlackboxUnitDescriptor>();
		for (BlackboxProvider provider : getProviders()) {
			result.addAll(provider.getUnitDescriptors(loadContext));
		}
		return result;
	}

	public void cleanup() {
		for (BlackboxProvider provider : getProviders()) {
			provider.cleanup();
		}
	}

	public Collection<CallHandler> getBlackboxCallHandlers(ImperativeOperation operation, QvtOperationalModuleEnv env) {
		for (BlackboxProvider provider : getProviders()) {
			Collection<CallHandler> handlers = provider.getBlackboxCallHandlers(operation, env);
			if (!handlers.isEmpty()) {
				return handlers;
			}
		}
		
		return Collections.emptyList();
	}

	public Collection<CallHandler> getBlackboxCallHandlers(OperationalTransformation transformation, QvtOperationalModuleEnv env) {
		for (BlackboxProvider provider : getProviders()) {
			Collection<CallHandler> handlers = provider.getBlackboxCallHandlers(transformation, env);
			if (!handlers.isEmpty()) {			
				return handlers;
			}
		}
		
		return Collections.emptyList();
	}
	
	public void addStandaloneModule(Class<?> cls, String unitQualifiedName, String moduleName, String... packageURIs) {
		fStandaloneProvider.registerDescriptor(cls, unitQualifiedName, moduleName, packageURIs);
	}


	private static class Eclipse extends BlackboxRegistry {

		private static final String CLASS_ATTR = "class"; //$NON-NLS-1$

		private static final String PROVIDER_ELEMENT = "provider"; //$NON-NLS-1$

		private static final String BLACKBOX_PROVIDER_EXTENSION = "blackboxProvider"; //$NON-NLS-1$

		private final List<BlackboxProvider> fProviders;

		@Override
		protected List<? extends BlackboxProvider> getProviders() {
			return fProviders;
		}

		Eclipse() {
			fProviders = new LinkedList<BlackboxProvider>();
			readProviders(fProviders);
			fProviders.addAll(super.getProviders());
		}

		private void readProviders(List<BlackboxProvider> providers) {
			IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor(QvtPlugin.ID,
					BLACKBOX_PROVIDER_EXTENSION);

			for (IConfigurationElement element : configs) {
				try {
					if (element.getName().equals(PROVIDER_ELEMENT)) {
						Object extension = element.createExecutableExtension(CLASS_ATTR);
						if (extension instanceof BlackboxProvider == false) {
							QvtPlugin.error("Provider must implement AbstractBlackboxProvider interface: " + extension); //$NON-NLS-1$
							continue;
						}

						providers.add((BlackboxProvider) extension);
					}
				} catch (CoreException e) {
					QvtPlugin.getDefault().log(e.getStatus());
				} catch (RuntimeException e) {
					QvtPlugin.error(e);
				}
			}
			
			if (providers.isEmpty()) {
				providers.addAll(Arrays.asList(new RegisteredBlackboxProvider()));
			}
		}
	}

}
