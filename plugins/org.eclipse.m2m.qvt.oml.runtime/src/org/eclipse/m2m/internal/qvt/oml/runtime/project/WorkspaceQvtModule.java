/*******************************************************************************
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.runtime.project;


import org.eclipse.core.resources.IFile;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.compiler.QVTOCompiler;
import org.eclipse.m2m.internal.qvt.oml.compiler.QvtCompilerOptions;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtCompilerFacade.CompilationResult;

public class WorkspaceQvtModule extends QvtModule {
    
	public WorkspaceQvtModule(IFile transformationFile) {
        myTransformationFile = transformationFile;
        myModule = null;
        myCompiler = null;
    }
	
	@Override
	public String toString() {
        return myTransformationFile.getFullPath().toString();
    }
    
    @Override
    public Module getModule() throws MdaException {
        if(myModule == null) {
            QvtCompilerOptions options = getQvtCompilerOptions();
            if (options == null) {
                options = new QvtCompilerOptions();
            }
            
        	CompilationResult result = QvtCompilerFacade.getCompiledModule(myTransformationFile, options, null);
        	myUnit = result.getCompiledModule();
//            QvtEngine engine = QvtEngine.getInstance(myTransformationFile);
//            myUnit = engine.compileUnit(new EclipseFile(myTransformationFile), getQvtCompilerOptions(), null);
            
            if (!options.isModuleWithErrorAllowed()) {
            	checkModuleErrors(myUnit);
            }

            // FIXME - 
            myModule = myUnit.getModules().isEmpty() ? null : myUnit.getModules().get(0);
            myCompiler = result.getCompiler();
        }
        
        return myModule;
    }

    @Override
    public CompiledUnit getUnit() throws MdaException {
    	getModule();
    	return myUnit;
    }
    
	@Override
	public QVTOCompiler getCompiler() throws MdaException {
		getModule();
		return myCompiler;
	}
	
    public IFile getTransformationFile() {
        return myTransformationFile;
    }
    
    private final IFile myTransformationFile;
    private Module myModule;
    private CompiledUnit myUnit;    
    private QVTOCompiler myCompiler;
}
