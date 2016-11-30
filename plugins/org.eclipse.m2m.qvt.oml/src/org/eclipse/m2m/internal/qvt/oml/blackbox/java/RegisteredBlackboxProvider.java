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
 *     Christopher Gerking - bug 326871
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.blackbox.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.NLS;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.ast.parser.ValidationMessages;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;


public class RegisteredBlackboxProvider extends JavaBlackboxProvider {
	
	private static final String URI_BLACKBOX_REGISTERED_QUERY = "registered"; //$NON-NLS-1$

	private static final String EXTENSION_POINT = "javaBlackboxUnits"; //$NON-NLS-1$
		
	private static final String UNIT_ELEM = "unit";	//$NON-NLS-1$
	private static final String LIBRARY_ELEM = "library"; //$NON-NLS-1$	
	private static final String CLASS_ATTR = "class"; //$NON-NLS-1$
	private static final String NAME_ATTR = "name";	//$NON-NLS-1$
	private static final String NAMESPACE_ATTR = "namespace"; //$NON-NLS-1$
	private static final String DESC_ATTR = "description"; //$NON-NLS-1$

	private static final String METAMODEL_ELEM = "metamodel"; //$NON-NLS-1$
	private static final String NSURI_ATTR = "nsURI"; //$NON-NLS-1$
	
	private final Map<String, BlackboxUnitDescriptor> fDescriptorMap = new LinkedHashMap<String, BlackboxUnitDescriptor>();
	private Map<String, JavaBlackboxUnitDescription> fDescriptions;
		
	public RegisteredBlackboxProvider() {}	

	@Override
	public BlackboxUnitDescriptor getUnitDescriptor(String qualifiedName, ResolutionContext resolutionContext) {
		JavaBlackboxUnitDescription description = getDescriptions().get(qualifiedName);
		if (description == null) {
			return null;
		}
		
		BlackboxUnitDescriptor descriptor = fDescriptorMap.get(qualifiedName);
		if (descriptor == null) {
			descriptor = new RegisteredUnitDescriptor(description.fConfigurationElement, description.fQualifiedName, description.fDescription);
			fDescriptorMap.put(qualifiedName, descriptor);
		}
		
		return descriptor;
	}

	@Override
	public Collection<BlackboxUnitDescriptor> getUnitDescriptors(ResolutionContext resolutionContext) {
		List<BlackboxUnitDescriptor> result = Collections.emptyList();

		if (resolutionContext.getDeclaredLibraries().isEmpty()) {
			result = new LinkedList<BlackboxUnitDescriptor>();

			for (String libId : getDescriptions().keySet()) {
				result.add(getUnitDescriptor(libId, resolutionContext));
			}
		}
		else {
			for (URI libraryUri : resolutionContext.getDeclaredLibraries().keySet()) {
				if (URI_BLACKBOX_REGISTERED_QUERY.equals(libraryUri.query())) {
					BlackboxUnitDescriptor descriptor = getUnitDescriptor(libraryUri.segment(0), resolutionContext);
					if (descriptor != null) {
						if (result.isEmpty()) {
							result = new LinkedList<BlackboxUnitDescriptor>();
						}
						result.add(descriptor);
					}
				}
			}
		}
		
		return result;
	}
	
	@Override
	public void cleanup() {
		fDescriptorMap.clear();
	}
	
	private Map<String, JavaBlackboxUnitDescription> getDescriptions() {
		if (fDescriptions == null) {
			fDescriptions = readDescriptions();
		}
		return fDescriptions;
	}
	

	private class RegisteredUnitDescriptor extends JavaUnitDescriptor {		
		
		RegisteredUnitDescriptor(IConfigurationElement configurationElement, String unitQualifiedName, String description) {
			super(unitQualifiedName);
			
			if(configurationElement.getName().equals(LIBRARY_ELEM)) {
				addModuleHandle(configurationElement);				
			} else {
				IConfigurationElement[] libraries = configurationElement.getChildren(LIBRARY_ELEM);			
				for (IConfigurationElement moduleElement : libraries) {
					addModuleHandle(moduleElement);
				}
			}
		}
		
		private void addModuleHandle(IConfigurationElement moduleElement) {
			String bundleId = moduleElement.getContributor().getName();
			String className = moduleElement.getAttribute(CLASS_ATTR);
			String moduleName = moduleElement.getAttribute(NAME_ATTR);
			if(moduleName == null) {
				// derive the name from the java class name
				moduleName = getSimpleNameFromJavaClass(className);
			}
			
			ModuleHandle moduleHandle = new RegisteredModuleHandle(bundleId, className, moduleName, readUsedPackagesNsURIs(moduleElement));
			addModuleHandle(moduleHandle);
		}
		
		private List<String> readUsedPackagesNsURIs(IConfigurationElement moduleConfigElement) {
			ArrayList<String> uris = new ArrayList<String>(3);
			for (IConfigurationElement nextElement : moduleConfigElement.getChildren(METAMODEL_ELEM)) {
				String nsURI = nextElement.getAttribute(NSURI_ATTR);
				if(nsURI != null) {
					uris.add(nsURI);
				}
			}
			
			return uris;
		}
		
		@Override
		protected String getUnitQuery() {
			return URI_BLACKBOX_REGISTERED_QUERY;
		}
		
		@Override
		protected void handleBlackboxError(Diagnostic diagnostic) {
			if(diagnostic != null) {
				QvtPlugin.logDiagnostic(diagnostic);					
			} else {
				QvtPlugin.error(NLS.bind(ValidationMessages.FailedToLoadUnit, 
						new Object[] { getQualifiedName() }));
			}
		}
			
	}
	
	private static String getPackageNameFromJavaClass(String className) {
		int lastSeparatorPos = className.lastIndexOf(CLASS_NAME_SEPARATOR);
		if (lastSeparatorPos < 0) {
			return null;
		}

		return className.substring(0, lastSeparatorPos);
	}

	private static String getSimpleNameFromJavaClass(String className) {
		int lastSeparatorPos = className.lastIndexOf(CLASS_NAME_SEPARATOR);
		if (lastSeparatorPos < 0) {
			return className;
		}

		return className.substring(lastSeparatorPos + 1);
	}
	
	
	static class JavaBlackboxUnitDescription {
		final IConfigurationElement fConfigurationElement;
		final String fQualifiedName;
		final String fDescription;
		
		JavaBlackboxUnitDescription(IConfigurationElement configurationElement, String unitQualifiedName, String description) {
			fConfigurationElement = configurationElement;
			fQualifiedName = unitQualifiedName;
			fDescription = description;
		}
	}

	private static Map<String, JavaBlackboxUnitDescription> readDescriptions() {
		Map<String, JavaBlackboxUnitDescription> descriptions = new LinkedHashMap<String, JavaBlackboxUnitDescription>();
        
        for (IConfigurationElement elem : Platform.getExtensionRegistry().getConfigurationElementsFor(QvtPlugin.ID, EXTENSION_POINT)) {
            try {
            	JavaBlackboxUnitDescription descriptor = createDescription(elem);
            	if(!descriptions.containsKey(descriptor.fQualifiedName)) {
					descriptions.put(descriptor.fQualifiedName, descriptor);
            	} else {
            		String message = NLS.bind(JavaBlackboxMessages.UnitAlreadyRegisteredContributionIgnored,
            				descriptor.fQualifiedName, elem.getContributor().getName());
					QvtPlugin.error(message);
            	}
            } catch (IllegalArgumentException e) {
            	QvtPlugin.error("Failed to read java black-box definition: " + e.getMessage()); //$NON-NLS-1$
            }
        }

        return descriptions;
    }
        
	private static JavaBlackboxUnitDescription createDescription(IConfigurationElement configurationElement) throws IllegalArgumentException {
		if(UNIT_ELEM.equals(configurationElement.getName())) {
			String name = configurationElement.getAttribute(NAME_ATTR);
			String namespace = configurationElement.getAttribute(NAMESPACE_ATTR);		
			if(namespace == null) {
				namespace = configurationElement.getContributor().getName();
			}
			
			String description = configurationElement.getAttribute(DESC_ATTR);		
			String qualifiedName = namespace.length() == 0 ? name : namespace + CLASS_NAME_SEPARATOR + name;
			return new JavaBlackboxUnitDescription(configurationElement, qualifiedName, description);
		} else if(LIBRARY_ELEM.equals(configurationElement.getName())) {
			return new JavaBlackboxUnitDescription(configurationElement, deriveQualifiedNameFromSimpleDefinition(configurationElement), null);
		}
		
		throw new IllegalArgumentException("Unsupported configuration element " + configurationElement); //$NON-NLS-1$		
	}
    		
	private static String deriveQualifiedNameFromSimpleDefinition(IConfigurationElement moduleElement) {
		String className = moduleElement.getAttribute(CLASS_ATTR);		
		String name = moduleElement.getAttribute(NAME_ATTR);				
		if(name == null) {
			return className;
		}
		// name overridden in descriptor
		String packageName = getPackageNameFromJavaClass(className);
		if(packageName == null) {
			return name; // default package
		}
		return packageName + CLASS_NAME_SEPARATOR + name;
	}
	
}
