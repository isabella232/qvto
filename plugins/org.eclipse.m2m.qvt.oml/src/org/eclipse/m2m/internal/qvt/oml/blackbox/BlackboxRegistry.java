package org.eclipse.m2m.internal.qvt.oml.blackbox;

import java.util.ArrayList;
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
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.StandaloneBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.expressions.ImperativeOperation;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.internal.qvt.oml.stdlib.CallHandler;

/*
 * TODO - handle collisions of multiple descriptors of the same qualified name
 */
public class BlackboxRegistry {

	public static BlackboxRegistry INSTANCE = EMFPlugin.IS_ECLIPSE_RUNNING ? new BlackboxRegistry.Eclipse() : new BlackboxRegistry();
	
	private StandaloneBlackboxProvider fStandaloneProvider = new StandaloneBlackboxProvider();
	
	public BlackboxRegistry() {
		super();
	}
	
	public List<? extends AbstractBlackboxProvider> getProviders() {
		return Collections.singletonList(fStandaloneProvider);
	};
	
	public AbstractCompilationUnitDescriptor getCompilationUnitDescriptor(String qualifiedName, ResolutionContext context) {
		for (AbstractBlackboxProvider provider : getProviders()) {
			AbstractCompilationUnitDescriptor descriptor = provider.getModuleDescriptor(qualifiedName, context);
			if(descriptor != null) {
				return descriptor;
			}
		}
		
		return null;
	}

	public CompilationUnit loadCompilationUnit(AbstractCompilationUnitDescriptor descriptor, LoadContext loadContext)
			throws BlackboxException {
				if(descriptor == null) {
					throw new IllegalArgumentException("Null blackbox descriptor"); //$NON-NLS-1$
				}
				
				AbstractBlackboxProvider provider = descriptor.getProvider();
				return provider.loadCompilationUnit(descriptor, loadContext);
			}

	public List<AbstractCompilationUnitDescriptor> getCompilationUnitDescriptors(ResolutionContext loadContext) {
		ArrayList<AbstractCompilationUnitDescriptor> result = new ArrayList<AbstractCompilationUnitDescriptor>();
		
		for (AbstractBlackboxProvider provider : getProviders()) {
			for (AbstractCompilationUnitDescriptor abstractCompilationUnitDescriptor : provider.getModuleDescriptors(loadContext)) {
				result.add(abstractCompilationUnitDescriptor);
			}
		}
		
		return result;
	}

	public void cleanup() {
		for (AbstractBlackboxProvider provider : getProviders()) {
			provider.cleanup();
		}
	}

	public Collection<CallHandler> getBlackboxCallHandler(ImperativeOperation operation, QvtOperationalModuleEnv env) {
		Collection<CallHandler> result = Collections.emptyList();
		for (AbstractBlackboxProvider provider : getProviders()) {			
			Collection<CallHandler> handlers = provider.getBlackboxCallHandler(operation, env);
			if (!handlers.isEmpty()) {
				if (result.isEmpty()) {
					result = new LinkedList<CallHandler>();
				}
				result.addAll(handlers);
			}			
		}		
		return result;
	}

	public Collection<CallHandler> getBlackboxCallHandler(OperationalTransformation transformation, QvtOperationalModuleEnv env) {
		Collection<CallHandler> result = Collections.emptyList();
		for (AbstractBlackboxProvider provider : getProviders()) {			
			Collection<CallHandler> handlers = provider.getBlackboxCallHandler(transformation, env);
			if (!handlers.isEmpty()) {
				if (result.isEmpty()) {
					result = new LinkedList<CallHandler>();
				}
				result.addAll(handlers);
			}			
		}		
		return result;
	}

	public void addStandaloneModules(Class<?>... classes) {
		for (Class<?> cls : classes) {
			fStandaloneProvider.registerDescriptor(cls);
		}
	}
	
	private static class Eclipse extends BlackboxRegistry {
		
		private static final String CLASS_ATTR = "class"; //$NON-NLS-1$

		private static final String PROVIDER_ELEMENT = "provider"; //$NON-NLS-1$

		private static final String BLACKBOX_PROVIDER_EXTENSION = "blackboxProvider"; //$NON-NLS-1$

		private List<? extends AbstractBlackboxProvider> fProviders;
		
		@Override
		public List<? extends AbstractBlackboxProvider> getProviders() {
			List<AbstractBlackboxProvider> providers = new LinkedList<AbstractBlackboxProvider>(fProviders);
			providers.addAll(super.getProviders());
			return providers;
		}

		Eclipse() {
			try {
				fProviders = readProviders();
			} catch (RuntimeException e) {
				fProviders = Collections.emptyList();
				QvtPlugin.error(e);
			}
		}
		
	    private static List<AbstractBlackboxProvider> readProviders() {
	        List<AbstractBlackboxProvider> providers = new LinkedList<AbstractBlackboxProvider>();
	        
	        IConfigurationElement[] configs =
	            Platform.getExtensionRegistry().getConfigurationElementsFor(
	                QvtPlugin.ID, BLACKBOX_PROVIDER_EXTENSION);
	
	        for (IConfigurationElement element : configs) {
	            if (element.getName().equals(PROVIDER_ELEMENT)) {
	                try {
	                	Object extension = element.createExecutableExtension(CLASS_ATTR);
	                	if(extension instanceof AbstractBlackboxProvider == false) {
	                		QvtPlugin.error("Provider must implement AbstractBlackboxProvider interface: " + extension); //$NON-NLS-1$
	                		continue;
	                	}
	
	                	providers.add((AbstractBlackboxProvider)extension);
	                } catch (CoreException e) {
	                    QvtPlugin.getDefault().log(e.getStatus());
	                }
	            }
	        }
	        
	        return providers;
	    }
	}

}