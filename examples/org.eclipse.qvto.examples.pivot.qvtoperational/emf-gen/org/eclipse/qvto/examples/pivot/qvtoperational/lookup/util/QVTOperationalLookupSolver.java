/*******************************************************************************
 * <copyright>
 * Copyright (c) 2013, 2016 Willink Transformations, University of York, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *   Adolfo Sanchez-Barbudo (University of York) - Bug397429
 * </copyright>
 *
 * This code is auto-generated
 * from: org.eclipse.qvto.examples.pivot.qvtoperational/model/QVTOperational.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.qvto.examples.pivot.qvtoperational.lookup.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.internal.lookup.util.PivotLookupResult;
import org.eclipse.ocl.pivot.internal.lookup.util.PivotLookupResultImpl;
import org.eclipse.ocl.pivot.internal.lookup.util.PivotSingleResultLookupEnvironment;
import org.eclipse.qvto.examples.pivot.imperativeocl.lookup.util.ImperativeOCLLookupSolver;
import org.eclipse.qvto.examples.pivot.qvtoperational.util.QVTOperationalUnqualifiedLookupVisitor;

public class QVTOperationalLookupSolver extends ImperativeOCLLookupSolver {
	
		public QVTOperationalLookupSolver (@NonNull Executor executor) {
		super(executor);
	}
	
	
	public PivotLookupResult<org.eclipse.qvto.examples.pivot.qvtoperational.ModelType> _lookupModelType(org.eclipse.ocl.pivot.util.Visitable context, java.lang.String mName) {
		PivotSingleResultLookupEnvironment _lookupEnv = new PivotSingleResultLookupEnvironment(executor, org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage.Literals.MODEL_TYPE,mName);
		QVTOperationalUnqualifiedLookupVisitor _lookupVisitor = new QVTOperationalUnqualifiedLookupVisitor(_lookupEnv);
		context.accept(_lookupVisitor);
		return new PivotLookupResultImpl<org.eclipse.qvto.examples.pivot.qvtoperational.ModelType>
				(_lookupEnv.getNamedElementsByKind(org.eclipse.qvto.examples.pivot.qvtoperational.ModelType.class));
	}
}
