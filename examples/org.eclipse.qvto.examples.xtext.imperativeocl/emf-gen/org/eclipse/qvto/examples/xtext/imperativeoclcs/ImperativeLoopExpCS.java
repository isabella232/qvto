/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.essentialoclcs.CallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Loop Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedCondition <em>Owned Condition</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedTarget <em>Owned Target</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedIterator <em>Owned Iterator</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedBody <em>Owned Body</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getImperativeLoopExpCS()
 * @model
 * @generated
 */
public interface ImperativeLoopExpCS extends CallExpCS, StatementCS {
	/**
	 * Returns the value of the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Condition</em>' containment reference.
	 * @see #setOwnedCondition(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getImperativeLoopExpCS_OwnedCondition()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getOwnedCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedCondition <em>Owned Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Condition</em>' containment reference.
	 * @see #getOwnedCondition()
	 * @generated
	 */
	void setOwnedCondition(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Owned Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Target</em>' containment reference.
	 * @see #setOwnedTarget(VariableCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getImperativeLoopExpCS_OwnedTarget()
	 * @model containment="true"
	 * @generated
	 */
	VariableCS getOwnedTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedTarget <em>Owned Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Target</em>' containment reference.
	 * @see #getOwnedTarget()
	 * @generated
	 */
	void setOwnedTarget(VariableCS value);

	/**
	 * Returns the value of the '<em><b>Owned Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Iterator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Iterator</em>' containment reference.
	 * @see #setOwnedIterator(VariableCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getImperativeLoopExpCS_OwnedIterator()
	 * @model containment="true"
	 * @generated
	 */
	VariableCS getOwnedIterator();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedIterator <em>Owned Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Iterator</em>' containment reference.
	 * @see #getOwnedIterator()
	 * @generated
	 */
	void setOwnedIterator(VariableCS value);

	/**
	 * Returns the value of the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Body</em>' containment reference.
	 * @see #setOwnedBody(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getImperativeLoopExpCS_OwnedBody()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getOwnedBody();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedBody <em>Owned Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Body</em>' containment reference.
	 * @see #getOwnedBody()
	 * @generated
	 */
	void setOwnedBody(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getImperativeLoopExpCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ImperativeLoopExpCS
