/*******************************************************************************
 * Copyright (c) 2009, 2016 Christopher Gerking and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.runtime.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.ClassModuleHandle;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.DelegatingJavaBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.StandaloneBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.compiler.ResolverUtils;
import org.osgi.framework.Bundle;
import org.osgi.framework.wiring.BundleWiring;

public class BundleBlackboxProvider extends DelegatingJavaBlackboxProvider {
	
	private final Map<Bundle, Collection<BlackboxUnitDescriptor>> bundleDescriptors = new HashMap<Bundle, Collection<BlackboxUnitDescriptor>>();
		
	public BundleBlackboxProvider() {
		super(new StandaloneBlackboxProvider());
	}	
    	
	@Override
	public BlackboxUnitDescriptor getLocalUnitDescriptor(String qualifiedName, ResolutionContext resolutionContext) {
		
		Bundle bundle = getBundle(resolutionContext);
			
		if (bundle != null) {
			return getDescriptor(bundle, qualifiedName);
		}
		else {
			
			IProject project = getProject(resolutionContext);
			
			if (project != null) {
				Collection<Bundle> requiredBundles = DependencyTracker.findRequiredBundles(project, false);
								
				for (Bundle requiredBundle : requiredBundles) {
					BlackboxUnitDescriptor descriptor = getDescriptor(requiredBundle, qualifiedName);
					
					if (descriptor != null) return descriptor;
				}
			}
		}
		
		return null;
	}
	
	@Override
	public Collection<BlackboxUnitDescriptor> getLocalUnitDescriptors(ResolutionContext resolutionContext) {
		
		Bundle bundle = getBundle(resolutionContext);
		
		if (bundle != null) {
			return getDescriptors(bundle);
		}
		else {
			IProject project = getProject(resolutionContext);
			
			if (project != null) {
			
				Collection<Bundle> requiredBundles = DependencyTracker.findRequiredBundles(project, false);
				
				Collection<BlackboxUnitDescriptor> descriptors = new ArrayList<BlackboxUnitDescriptor>();
				
				for (Bundle requiredBundle : requiredBundles) {
					descriptors.addAll(getDescriptors(requiredBundle));
				}
				
				return descriptors;
			}
		}
			
		return Collections.emptyList();
	}
	
	private static Bundle getBundle(ResolutionContext resolutionContext) {
		URI contextUri = resolutionContext.getURI();
		
		if (contextUri.isPlatformPlugin() && contextUri.segmentCount() > 1) {	
			return Platform.getBundle(contextUri.segment(1));
		}
		else {
			return null;
		}
	}
	
	private Collection<BlackboxUnitDescriptor> getDescriptors(Bundle bundle) {
		
		if (bundleDescriptors.containsKey(bundle)) {
			return bundleDescriptors.get(bundle);
		}
		else {
			BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);
			
			Collection<String> classResources = bundleWiring.listResources("/", "*.class", BundleWiring.LISTRESOURCES_RECURSE);
			
			Collection<BlackboxUnitDescriptor> descriptors = new ArrayList<BlackboxUnitDescriptor>(classResources.size());
			
			for (String classResource : classResources) {			

				IPath path = Path.fromOSString(classResource).removeFileExtension();
			    	
		    	String className = ResolverUtils.toQualifiedName(path);
		    	
		    	Class<?> cls = null;
		    	
		    	try {
		    		cls = bundle.loadClass(className);
		    	}
		    	catch(Throwable t) {
		    		className = ResolverUtils.toQualifiedName(path.removeFirstSegments(1));
		    		
		    		try {
		    			cls = bundle.loadClass(className);
		    		}
		    		catch(ClassNotFoundException e) {
		    			continue;
		    		}
		    	}
		    				    	
		        descriptors.add(new BundleUnitDescriptor(cls, bundle, className));
			}
			
			bundleDescriptors.put(bundle, descriptors);
			
			return descriptors;
		}
	}
	
	private BlackboxUnitDescriptor getDescriptor(Bundle bundle, String qualifiedName) {
		
		try {
			Class<?> cls = bundle.loadClass(qualifiedName);
		
			return new BundleUnitDescriptor(cls, bundle, qualifiedName);
		}
		catch(ClassNotFoundException e) {
			return null;
		}
	}
	
	@Override
	public void cleanup() {
		bundleDescriptors.clear();
	}
		
	private class BundleUnitDescriptor extends JavaUnitDescriptor {		
		
		BundleUnitDescriptor(Class<?> cls, final Bundle bundle, String unitQualifiedName) {
			super(unitQualifiedName);
			
			addModuleHandle(new ClassModuleHandle(cls) {
				@Override
				public String toString() {			
					return super.toString() + ", bundle: " + bundle.getBundleId(); //$NON-NLS-1$
				}
			});
		}		
	}

}
