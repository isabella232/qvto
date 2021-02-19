package org.eclipse.m2m.internal.qvt.oml.compiler;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.m2m.internal.qvt.oml.emf.util.EmfUtil;

@SuppressWarnings("serial")
public class PlatformNamespaceUriResourceMap extends HashMap<URI, Resource> {
	
	private EPackage.Registry registry;
	
	public PlatformNamespaceUriResourceMap(EPackage.Registry registry) {
		this.registry = registry;
	}
	
	public Resource get(Object key) {
		Resource resource = super.get(key);
		
		if (key instanceof URI) {
			URI uri = (URI) key;
			
			if (uri.isPlatformResource()) {
				if (!URIConverter.INSTANCE.exists(uri, null)) {
					URI platformPluginUri = URI.createPlatformPluginURI(uri.toPlatformString(false), false);
					return get(platformPluginUri);
				}
			}
			else if (uri.isPlatformPlugin()) {
				if (resource == null) {
												
					Resource pluginResource = null;
					try {
						pluginResource = EmfUtil.loadResource(uri);
						EPackage rootPackage = EmfUtil.getFirstEPackageContent(pluginResource);
							
						if (rootPackage != null) {
							EPackage ePackage = registry.getEPackage(rootPackage.getNsURI());
																		
							if (ePackage != null) {
								resource = ePackage.eResource();
								put(uri, resource);
							}
						}
					}
					catch (Throwable t) {}
					finally {
						if (pluginResource != null) {
							pluginResource.unload();
						}
					}
				}
			}
		}				
		
		return resource;
	}

}
