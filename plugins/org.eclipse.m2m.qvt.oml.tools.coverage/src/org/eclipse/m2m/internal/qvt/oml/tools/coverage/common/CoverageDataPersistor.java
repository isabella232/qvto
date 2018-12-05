/*****************************************************************************
 * Copyright (c) 2014,2018 ASML Netherlands B.V. and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *  ASML Netherlands B.V. - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.tools.coverage.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.eclipse.m2m.qvt.oml.tools.coverage.Activator;

public class CoverageDataPersistor {

    private static final String DIR_SEP = System.getProperty("file.separator");
    private static final String TMP_DIR = System.getProperty("java.io.tmpdir");
    private static final String DIR_PATH = TMP_DIR + DIR_SEP + "CoverageData" + DIR_SEP;
    
    private CoverageDataPersistor() {
    }

	public static CoverageData load() {
        try {
            CoverageData data = new CoverageData();

            // Since transDatas were saved separately, reattach them now
            File folder = new File(DIR_PATH);
            for (File transDataFile : folder.listFiles()) {
                ObjectInputStream stream = new ObjectInputStream(new FileInputStream(transDataFile));
                TransformationCoverageData transData = (TransformationCoverageData) stream.readObject();
                stream.close();
                data.add(transData);
            }
            return data;
        } catch (Exception e) {
        	Activator.error("Failed to load coverage data", e);
        }

        return null;
    }

	public static void save(CoverageData data) {
        try {
            prepareDirectories();

            // Save any transdatas in a new file
            for (TransformationCoverageData transData : data.getData()) {
            	if (!transData.isModified()) {
            		continue;
            	}
            	
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(DIR_PATH + transData.hashCode()));
                os.writeObject(transData);
                os.close();
                
                transData.setModified(false);
            }
        } catch (Exception e) {
        	Activator.error("Failed to persist coverage data", e);
        }
    }

    public static void cleanupDirectories() {
    	prepareDirectories();
    	
        for (File file : new File(DIR_PATH).listFiles()) {
            file.delete();
        }
    }

    private static void prepareDirectories() {
        // Make sure directory exists, and if not, create it
        File dir = new File(DIR_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

}
