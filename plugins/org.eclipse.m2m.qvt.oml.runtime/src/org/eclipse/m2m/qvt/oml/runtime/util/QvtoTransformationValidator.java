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
package org.eclipse.m2m.qvt.oml.runtime.util;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.QvtMessage;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledModule;
import org.eclipse.m2m.internal.qvt.oml.compiler.QvtCompilerFacade;
import org.eclipse.m2m.internal.qvt.oml.compiler.QvtCompilerOptions;
import org.eclipse.m2m.internal.qvt.oml.runtime.util.Messages;
import org.eclipse.osgi.util.NLS;

/**
 * @author sboyko
 */
public class QvtoTransformationValidator {

	private QvtoTransformationValidator() {}

	public static final int QVTO_ROOT_DIAGNOSTIC = 1;
	public static final int QVTO_CHILD_DIAGNOSTIC = 2;

	public static Diagnostic validateQvtoScript(URI uriTransf, IProgressMonitor monitor, Map<String, String> options) {
		try {
			QvtCompilerOptions compilerOptions = new QvtCompilerOptions();
			compilerOptions.setGenerateCompletionData(false);
	    	CompiledModule compiledModule = QvtCompilerFacade.getCompiledModule(uriTransf, compilerOptions, monitor).getCompiledModule();

	    	return fillCompilationDiagnostic(compiledModule, uriTransf);
		}
		catch (MdaException e) {
			return new BasicDiagnostic(Diagnostic.ERROR, uriTransf.toString(), QVTO_ROOT_DIAGNOSTIC,
	    			e.getMessage(), new Object[0]);
		}
	}

    private static Diagnostic fillCompilationDiagnostic(CompiledModule compiledModule, URI uri) {
    	BasicDiagnostic result = new BasicDiagnostic(Diagnostic.INFO, uri.toString(), QVTO_ROOT_DIAGNOSTIC,
    			NLS.bind(Messages.moduleDiagnosticChain, uri.toString()), new Object[0]);
		for (QvtMessage msg : compiledModule.getMessages()) {
			result.add(createDiagnostic(msg, uri));
		}
		return result;
	}

	private static Diagnostic createDiagnostic(QvtMessage msg, URI uri) {
		return new BasicDiagnostic(
				msg.getSeverity() == QvtMessage.SEVERITY_ERROR ? Diagnostic.ERROR : Diagnostic.WARNING,
				uri.toString(),
				QVTO_CHILD_DIAGNOSTIC,
				msg.getMessage(),
				new Object[0]
				);
	}

}
