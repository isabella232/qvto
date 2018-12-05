/*******************************************************************************
 * Copyright (c) 2008, 2018 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml;

import java.io.File;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalStdLibrary;
import org.eclipse.m2m.internal.qvt.oml.expressions.Library;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModuleImport;
import org.eclipse.m2m.tests.qvt.oml.ParserTests.TestData;
import org.eclipse.m2m.tests.qvt.oml.util.TestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class QvtLibraryASTTest extends TestQvtParser {
	
	public QvtLibraryASTTest(TestData data) {
		super(data);
	}
	
	@Parameters
	public static Iterable<TestData> data() {
		return Collections.singletonList(new TestData("blackboxlibASTmodel", 0, 0)); //$NON-NLS-N$
	}
			    
	@Override
	@Test
	public void runTest() throws Exception {
		super.runTest();
				
		checkLibrary((Library)QvtOperationalStdLibrary.INSTANCE.getStdLibModule());
		EList<ModuleImport> moduleImports = getCompiledResults()[0].getModules().get(0).getModuleImport();		
		assertEquals(moduleImports.size(), 2);
		
		for (ModuleImport nextImport : moduleImports) {
			checkLibrary((Library)nextImport.getImportedModule());
		}
	}
	
	private void checkLibrary(Library library) {
		File libFile = new File(getDestinationFolder(), library.getName());
		TestUtil.assertPersistableAST(QvtOperationalStdLibrary.INSTANCE.getStdLibModule(), 
				URI.createURI(libFile.toURI().toString(), true)); //$NON-NLS-1$
		
		assertTrue("library file " + libFile + " must have been saved", libFile.exists()); //$NON-NLS-1$		
	}
}
