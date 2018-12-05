/*******************************************************************************
 * Copyright (c) 2013, 2018 S. Boyko and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *   
 * Contributors:
 *     Sergey Boyko - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.editor.ui.quickoutline.actions;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "org.eclipse.m2m.internal.qvt.oml.editor.ui.quickoutline.actions.messages"; //$NON-NLS-1$
    public static String LexicalSortingAction_description;
    public static String LexicalSortingAction_label;
    public static String LexicalSortingAction_tooltip;
    public static String ShowFQNAction_description;
    public static String ShowFQNAction_label;
    public static String ShowFQNAction_tooltip;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
