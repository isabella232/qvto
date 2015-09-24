/*******************************************************************************
 * Copyright (c) 2007, 2015 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.transform.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.common.MDAConstants;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper;
import org.eclipse.m2m.tests.qvt.oml.transform.ModelTestData;
import org.eclipse.m2m.tests.qvt.oml.transform.api.QvtoTransfHelperTests.ApiTestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author sboyko
 */
@SuppressWarnings("deprecation")
@RunWith(Parameterized.class)
public class ImportedTransfTestCase extends ApiTestCase {
	
    public ImportedTransfTestCase(ModelTestData data) {
        super(data);
    }
        
    @Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {
    	return Collections.<ModelTestData>singletonList(new ApiTestData("imports", Collections.<String>emptyList(), Arrays.asList("imports.qvto", "q1.qvto", "q2.qvto", "nested2/q4.qvto", "nested/q3.qvto"))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
    }
    
    @Override
    @Test
    public void runTest() throws Exception {
		IFile qvtoFile = getIFile(getData().getName() + MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT);
    	
		List<URI> importedTransformations = new QvtoTransformationHelper(qvtoFile).getImportedTransformations();
		
		Iterator<URI> itrImported = importedTransformations.iterator();
		List<URI> expected = getData().getExpected(getProject());
		for (URI uri : expected) {
			if (!itrImported.hasNext()) {
				throw new Exception("Missed imported model URI"); //$NON-NLS-1$
			}
			URI nextImport = itrImported.next();
			if (!nextImport.equals(uri)) {
				throw new Exception("Unexpected imported model URI: " + nextImport); //$NON-NLS-1$
			}
		}
    }
    
}
