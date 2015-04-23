/**
 * <copyright>
 * Copyright (c) 2013 Willink Transformations, University of York, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Adolfo Sanchez-Barbudo (University of York) - Initial API and implementation
 * </copyright>
 */
package org.eclipse.qvto.examples.pivot.imperativeocl.manager;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;


/**
 * OCL MetamodelManager extension for the ImperativeOCL language 
 * 
 * @author adolfosbh
 *
 */
public class ImperativeOCLMetamodelManager extends PivotMetamodelManager {

	public ImperativeOCLMetamodelManager(EnvironmentFactoryInternal environmentFactory, ResourceSet asResourceSet) {
		super(environmentFactory, asResourceSet);
		// TODO Auto-generated constructor stub
	}
}