/*******************************************************************************
 * Copyright (c) 2016 Uwe Ritzmann and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Uwe Ritzmann - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestQvtUnparser.class})
public class UnparserTests {
    
    static class TestData {
        public TestData(String dir, int errCount) { 
        	this(dir, errCount, -1);
        }
        
        public TestData(String dir, int errCount, int warnCount) {
        	this(dir, errCount, warnCount, 0);
        }
        
        public TestData(String dir, int errCount, int warnCount, int eclipseDiffCount) {
            myDir = dir; 
            myErrCount = errCount; 
            myWarnCount = warnCount;
            myEclipseDiffCount = eclipseDiffCount;
            usesSourceAnnotations = false;
        }
        
        public String getDir() { return myDir; }
        public int getErrCount() { return myErrCount; }
        public int getWarnCount() { return myWarnCount; }
        public int getEclipseDiffCount() { return myEclipseDiffCount; }
        
        public int getAllProblemsCount() {
			return myErrCount + myWarnCount;
		}
        
        public boolean usesSourceAnnotations() {
        	return usesSourceAnnotations;
		}
        
        private final String myDir;
        private final int myErrCount;
        private final int myWarnCount;
        private final int myEclipseDiffCount;
        private boolean usesSourceAnnotations;

        /**
         * Creates that should be check for match of compilation problems with expected problem 
         * annotation in the test QVT sources 
         */
        public static TestData createSourceChecked(String dir, int errCount, int warnCount) {
        	return createSourceChecked(dir, errCount, warnCount, 0);
        }

        public static TestData createSourceChecked(String dir, int errCount, int warnCount, int eclipseDiffCount) {
        	TestData data = new TestData(dir, errCount, warnCount, eclipseDiffCount);
        	data.usesSourceAnnotations = true; 
        	return data;
        }

        public String toString() {
        	return "TestData " + myDir + " --> " + myErrCount + "/" + myWarnCount + "/" + myEclipseDiffCount;
        }
        
    }    
}
