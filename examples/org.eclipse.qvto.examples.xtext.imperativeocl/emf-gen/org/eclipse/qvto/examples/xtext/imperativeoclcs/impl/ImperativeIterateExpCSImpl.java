/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeIterateExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperative Iterate Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImperativeIterateExpCSImpl extends ImperativeLoopExpCSImpl implements ImperativeIterateExpCS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImperativeIterateExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.IMPERATIVE_ITERATE_EXP_CS;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(BaseCSVisitor<R> visitor) {
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitImperativeIterateExpCS(this);
	}

} //ImperativeIterateExpCSImpl
