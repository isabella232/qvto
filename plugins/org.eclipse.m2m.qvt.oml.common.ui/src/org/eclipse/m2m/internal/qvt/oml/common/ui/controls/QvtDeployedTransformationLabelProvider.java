/*******************************************************************************
 * Copyright (c) 2007, 2016 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.common.ui.controls;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.m2m.internal.qvt.oml.common.project.DeployedTransformation;
import org.eclipse.m2m.internal.qvt.oml.common.ui.CommonPluginImages;
import org.eclipse.swt.graphics.Image;


public class QvtDeployedTransformationLabelProvider extends LabelProvider {
    @Override
	public Image getImage(Object element) {
        if(element instanceof DeployedTransformation) {
            return CommonPluginImages.getInstance().getImage(CommonPluginImages.COMPILED_TRANSFORMATION);
        }
        
        return super.getImage(element);
    }
}
