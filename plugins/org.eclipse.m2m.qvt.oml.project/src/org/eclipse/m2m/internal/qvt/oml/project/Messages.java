/*******************************************************************************
 * Copyright (c) 2009, 2019 Borland Software Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.project;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

    private static final String BUNDLE_NAME = "org.eclipse.m2m.internal.qvt.oml.project.messages"; //$NON-NLS-1$

    private Messages() {
    }

    public static String InvalidSourceContainer;

    public static String Builder_Build;
    public static String Builder_Clean;

    static {
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }
}
