/*******************************************************************************
 * Copyright (c) 2016, 2018 Eclipse Modeling Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     S.Boyko - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.ui.wizards.project;

public class PluginReference {

	private final String id;
	private final String version;

	/**
	 * 
	 * Constructs a plug-in reference to be used in the template framework
	 * 
	 * @param id
	 * 			the id of the plug-in
	 * @param version
	 * 			the version of the plug-in
	 */
	public PluginReference(String id, String version) {
		this.id = id;
		this.version = version;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof PluginReference) {
			PluginReference source = (PluginReference) object;
			if (id == null) {
				return false;
			}
			return id.equals(source.getId())
					&& ((version == null && source.getVersion() == null) || version.equals(source.getVersion()));
		}
		return false;
	}

	@Override
	public int hashCode() {
		if (id != null) {
			return id.hashCode() + (version == null ? 0 : version.hashCode());
		}
		return super.hashCode();
	}

	public String getVersion() {
		return version;
	}

	public String getId() {
		return id;
	}

}
