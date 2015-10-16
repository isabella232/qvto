/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSFactory
 * @model kind="package"
 * @generated
 */
public interface ImperativeOCLCSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imperativeoclcs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/qvt/pivot/1.0/ImperativeOCLCS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imperativeoclcs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImperativeOCLCSPackage eINSTANCE = org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.StatementCSImpl <em>Statement CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.StatementCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getStatementCS()
	 * @generated
	 */
	int STATEMENT_CS = 19;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

	/**
	 * The number of structural features of the '<em>Statement CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CS_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssertExpCSImpl <em>Assert Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssertExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getAssertExpCS()
	 * @generated
	 */
	int ASSERT_EXP_CS = 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__CSI = STATEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__PARENT = STATEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__PIVOT = STATEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__ORIGINAL_XMI_ID = STATEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__OWNED_ANNOTATIONS = STATEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__HAS_ERROR = STATEMENT_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__LOCAL_LEFT = STATEMENT_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__LOCAL_PARENT = STATEMENT_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__LOCAL_RIGHT = STATEMENT_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__PRECEDENCE = STATEMENT_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__OWNED_ASSERTION = STATEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__OWNED_LOG = STATEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS__SEVERITY = STATEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assert Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_CS_FEATURE_COUNT = STATEMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssignExpCSImpl <em>Assign Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssignExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getAssignExpCS()
	 * @generated
	 */
	int ASSIGN_EXP_CS = 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__CSI = STATEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__PARENT = STATEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__PIVOT = STATEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__ORIGINAL_XMI_ID = STATEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__OWNED_ANNOTATIONS = STATEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__HAS_ERROR = STATEMENT_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__LOCAL_LEFT = STATEMENT_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__LOCAL_PARENT = STATEMENT_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__LOCAL_RIGHT = STATEMENT_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__PRECEDENCE = STATEMENT_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__OWNED_LEFT = STATEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__OWNED_VALUE = STATEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assign Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__ASSIGN_OP = STATEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS__OWNED_DEFAULT = STATEMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assign Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_CS_FEATURE_COUNT = STATEMENT_CS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.BreakExpCSImpl <em>Break Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.BreakExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getBreakExpCS()
	 * @generated
	 */
	int BREAK_EXP_CS = 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__CSI = STATEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__PARENT = STATEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__PIVOT = STATEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__ORIGINAL_XMI_ID = STATEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__OWNED_ANNOTATIONS = STATEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__HAS_ERROR = STATEMENT_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__LOCAL_LEFT = STATEMENT_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__LOCAL_PARENT = STATEMENT_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__LOCAL_RIGHT = STATEMENT_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS__PRECEDENCE = STATEMENT_CS__PRECEDENCE;

	/**
	 * The number of structural features of the '<em>Break Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_CS_FEATURE_COUNT = STATEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralExpCSImpl <em>Dict Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getDictLiteralExpCS()
	 * @generated
	 */
	int DICT_LITERAL_EXP_CS = 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__CSI = EssentialOCLCSPackage.LITERAL_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__PARENT = EssentialOCLCSPackage.LITERAL_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__PIVOT = EssentialOCLCSPackage.LITERAL_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.LITERAL_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.LITERAL_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.LITERAL_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.LITERAL_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS__OWNED_PARTS = EssentialOCLCSPackage.LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dict Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.LITERAL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralPartCSImpl <em>Dict Literal Part CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralPartCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getDictLiteralPartCS()
	 * @generated
	 */
	int DICT_LITERAL_PART_CS = 4;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_CS__CSI = BaseCSPackage.MODEL_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_CS__PARENT = BaseCSPackage.MODEL_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_CS__PIVOT = BaseCSPackage.MODEL_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_CS__ORIGINAL_XMI_ID = BaseCSPackage.MODEL_ELEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_CS__OWNED_ANNOTATIONS = BaseCSPackage.MODEL_ELEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_CS__OWNED_KEY = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_CS__OWNED_VALUE = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dict Literal Part CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_CS_FEATURE_COUNT = BaseCSPackage.MODEL_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictTypeCSImpl <em>Dict Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictTypeCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getDictTypeCS()
	 * @generated
	 */
	int DICT_TYPE_CS = 5;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_TYPE_CS__CSI = BaseCSPackage.TYPED_REF_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_TYPE_CS__PARENT = BaseCSPackage.TYPED_REF_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_TYPE_CS__PIVOT = BaseCSPackage.TYPED_REF_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_TYPE_CS__OWNED_MULTIPLICITY = BaseCSPackage.TYPED_REF_CS__OWNED_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Owned Key Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_TYPE_CS__OWNED_KEY_TYPE_REF = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Value Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_TYPE_CS__OWNED_VALUE_TYPE_REF = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dict Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_TYPE_CS_FEATURE_COUNT = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ExpressionBlockCSImpl <em>Expression Block CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ExpressionBlockCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getExpressionBlockCS()
	 * @generated
	 */
	int EXPRESSION_BLOCK_CS = 12;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS__OWNED_EXPS = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Block CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BLOCK_CS_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ComputeExpCSImpl <em>Compute Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ComputeExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getComputeExpCS()
	 * @generated
	 */
	int COMPUTE_EXP_CS = 6;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__CSI = EXPRESSION_BLOCK_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__PARENT = EXPRESSION_BLOCK_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__PIVOT = EXPRESSION_BLOCK_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__ORIGINAL_XMI_ID = EXPRESSION_BLOCK_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__OWNED_ANNOTATIONS = EXPRESSION_BLOCK_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__HAS_ERROR = EXPRESSION_BLOCK_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__LOCAL_LEFT = EXPRESSION_BLOCK_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EXPRESSION_BLOCK_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__LOCAL_PARENT = EXPRESSION_BLOCK_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__LOCAL_RIGHT = EXPRESSION_BLOCK_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EXPRESSION_BLOCK_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__PRECEDENCE = EXPRESSION_BLOCK_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__OWNED_EXPS = EXPRESSION_BLOCK_CS__OWNED_EXPS;

	/**
	 * The feature id for the '<em><b>Owned Result Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS__OWNED_RESULT_VAR = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compute Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_CS_FEATURE_COUNT = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ContinueExpCSImpl <em>Continue Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ContinueExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getContinueExpCS()
	 * @generated
	 */
	int CONTINUE_EXP_CS = 7;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__CSI = STATEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__PARENT = STATEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__PIVOT = STATEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__ORIGINAL_XMI_ID = STATEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__OWNED_ANNOTATIONS = STATEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__HAS_ERROR = STATEMENT_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__LOCAL_LEFT = STATEMENT_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__LOCAL_PARENT = STATEMENT_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__LOCAL_RIGHT = STATEMENT_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS__PRECEDENCE = STATEMENT_CS__PRECEDENCE;

	/**
	 * The number of structural features of the '<em>Continue Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_CS_FEATURE_COUNT = STATEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeLoopExpCSImpl <em>Imperative Loop Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeLoopExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getImperativeLoopExpCS()
	 * @generated
	 */
	int IMPERATIVE_LOOP_EXP_CS = 9;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__CSI = EssentialOCLCSPackage.CALL_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__PARENT = EssentialOCLCSPackage.CALL_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__PIVOT = EssentialOCLCSPackage.CALL_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.CALL_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.CALL_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.CALL_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Is Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__IS_PRE = EssentialOCLCSPackage.CALL_EXP_CS__IS_PRE;

	/**
	 * The feature id for the '<em><b>Owned Curly Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__OWNED_PATH_NAME = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Owned Round Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Square Bracketed Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__SOURCE_TYPE = EssentialOCLCSPackage.CALL_EXP_CS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Source Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__SOURCE_TYPE_VALUE = EssentialOCLCSPackage.CALL_EXP_CS__SOURCE_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__ARGUMENTS = EssentialOCLCSPackage.CALL_EXP_CS__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__SOURCE = EssentialOCLCSPackage.CALL_EXP_CS__SOURCE;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__OWNED_BODY = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS__NAME = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Imperative Loop Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeIterateExpCSImpl <em>Imperative Iterate Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeIterateExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getImperativeIterateExpCS()
	 * @generated
	 */
	int IMPERATIVE_ITERATE_EXP_CS = 8;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__CSI = IMPERATIVE_LOOP_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__PARENT = IMPERATIVE_LOOP_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__PIVOT = IMPERATIVE_LOOP_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__ORIGINAL_XMI_ID = IMPERATIVE_LOOP_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__OWNED_ANNOTATIONS = IMPERATIVE_LOOP_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__HAS_ERROR = IMPERATIVE_LOOP_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__LOCAL_LEFT = IMPERATIVE_LOOP_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = IMPERATIVE_LOOP_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__LOCAL_PARENT = IMPERATIVE_LOOP_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__LOCAL_RIGHT = IMPERATIVE_LOOP_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = IMPERATIVE_LOOP_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__PRECEDENCE = IMPERATIVE_LOOP_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Is Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__IS_PRE = IMPERATIVE_LOOP_EXP_CS__IS_PRE;

	/**
	 * The feature id for the '<em><b>Owned Curly Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE = IMPERATIVE_LOOP_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__OWNED_PATH_NAME = IMPERATIVE_LOOP_EXP_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Owned Round Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE = IMPERATIVE_LOOP_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Square Bracketed Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES = IMPERATIVE_LOOP_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__SOURCE_TYPE = IMPERATIVE_LOOP_EXP_CS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Source Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__SOURCE_TYPE_VALUE = IMPERATIVE_LOOP_EXP_CS__SOURCE_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__ARGUMENTS = IMPERATIVE_LOOP_EXP_CS__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__SOURCE = IMPERATIVE_LOOP_EXP_CS__SOURCE;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__OWNED_CONDITION = IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__OWNED_TARGET = IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET;

	/**
	 * The feature id for the '<em><b>Owned Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__OWNED_ITERATOR = IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__OWNED_BODY = IMPERATIVE_LOOP_EXP_CS__OWNED_BODY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS__NAME = IMPERATIVE_LOOP_EXP_CS__NAME;

	/**
	 * The number of structural features of the '<em>Imperative Iterate Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_CS_FEATURE_COUNT = IMPERATIVE_LOOP_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.InstantiationExpCSImpl <em>Instantiation Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.InstantiationExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getInstantiationExpCS()
	 * @generated
	 */
	int INSTANTIATION_EXP_CS = 10;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__CSI = STATEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__PARENT = STATEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__PIVOT = STATEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__ORIGINAL_XMI_ID = STATEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__OWNED_ANNOTATIONS = STATEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__HAS_ERROR = STATEMENT_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__LOCAL_LEFT = STATEMENT_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__LOCAL_PARENT = STATEMENT_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__LOCAL_RIGHT = STATEMENT_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__PRECEDENCE = STATEMENT_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Class Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__OWNED_CLASS_REF = STATEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__OWNED_ARGUMENTS = STATEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Extent Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS__OWNED_EXTENT_REF = STATEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instantiation Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_CS_FEATURE_COUNT = STATEMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.CatchExpCSImpl <em>Catch Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.CatchExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getCatchExpCS()
	 * @generated
	 */
	int CATCH_EXP_CS = 11;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__CSI = EXPRESSION_BLOCK_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__PARENT = EXPRESSION_BLOCK_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__PIVOT = EXPRESSION_BLOCK_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__ORIGINAL_XMI_ID = EXPRESSION_BLOCK_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__OWNED_ANNOTATIONS = EXPRESSION_BLOCK_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__HAS_ERROR = EXPRESSION_BLOCK_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__LOCAL_LEFT = EXPRESSION_BLOCK_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EXPRESSION_BLOCK_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__LOCAL_PARENT = EXPRESSION_BLOCK_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__LOCAL_RIGHT = EXPRESSION_BLOCK_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EXPRESSION_BLOCK_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__PRECEDENCE = EXPRESSION_BLOCK_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__OWNED_EXPS = EXPRESSION_BLOCK_CS__OWNED_EXPS;

	/**
	 * The feature id for the '<em><b>Owned Exception Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__OWNED_EXCEPTION_REFS = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS__VAR_NAME = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Catch Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_CS_FEATURE_COUNT = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ForExpCSImpl <em>For Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ForExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getForExpCS()
	 * @generated
	 */
	int FOR_EXP_CS = 13;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__CSI = IMPERATIVE_LOOP_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__PARENT = IMPERATIVE_LOOP_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__PIVOT = IMPERATIVE_LOOP_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__ORIGINAL_XMI_ID = IMPERATIVE_LOOP_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__OWNED_ANNOTATIONS = IMPERATIVE_LOOP_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__HAS_ERROR = IMPERATIVE_LOOP_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__LOCAL_LEFT = IMPERATIVE_LOOP_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = IMPERATIVE_LOOP_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__LOCAL_PARENT = IMPERATIVE_LOOP_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__LOCAL_RIGHT = IMPERATIVE_LOOP_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = IMPERATIVE_LOOP_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__PRECEDENCE = IMPERATIVE_LOOP_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Is Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__IS_PRE = IMPERATIVE_LOOP_EXP_CS__IS_PRE;

	/**
	 * The feature id for the '<em><b>Owned Curly Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE = IMPERATIVE_LOOP_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__OWNED_PATH_NAME = IMPERATIVE_LOOP_EXP_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Owned Round Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE = IMPERATIVE_LOOP_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Square Bracketed Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES = IMPERATIVE_LOOP_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__SOURCE_TYPE = IMPERATIVE_LOOP_EXP_CS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Source Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__SOURCE_TYPE_VALUE = IMPERATIVE_LOOP_EXP_CS__SOURCE_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__ARGUMENTS = IMPERATIVE_LOOP_EXP_CS__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__SOURCE = IMPERATIVE_LOOP_EXP_CS__SOURCE;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__OWNED_CONDITION = IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Owned Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__OWNED_TARGET = IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET;

	/**
	 * The feature id for the '<em><b>Owned Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__OWNED_ITERATOR = IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__OWNED_BODY = IMPERATIVE_LOOP_EXP_CS__OWNED_BODY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__NAME = IMPERATIVE_LOOP_EXP_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS__IS_ONE = IMPERATIVE_LOOP_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>For Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_CS_FEATURE_COUNT = IMPERATIVE_LOOP_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ListTypeCSImpl <em>List Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ListTypeCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getListTypeCS()
	 * @generated
	 */
	int LIST_TYPE_CS = 14;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_CS__CSI = BaseCSPackage.TYPED_REF_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_CS__PARENT = BaseCSPackage.TYPED_REF_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_CS__PIVOT = BaseCSPackage.TYPED_REF_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_CS__OWNED_MULTIPLICITY = BaseCSPackage.TYPED_REF_CS__OWNED_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Owned Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_CS__OWNED_TYPE_REF = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_CS_FEATURE_COUNT = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ListLiteralExpCSImpl <em>List Literal Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ListLiteralExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getListLiteralExpCS()
	 * @generated
	 */
	int LIST_LITERAL_EXP_CS = 15;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__CSI = EssentialOCLCSPackage.LITERAL_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__PARENT = EssentialOCLCSPackage.LITERAL_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__PIVOT = EssentialOCLCSPackage.LITERAL_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.LITERAL_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.LITERAL_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.LITERAL_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.LITERAL_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.LITERAL_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS__OWNED_PARTS = EssentialOCLCSPackage.LITERAL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Literal Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.LITERAL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.LogExpCSImpl <em>Log Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.LogExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getLogExpCS()
	 * @generated
	 */
	int LOG_EXP_CS = 16;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__CSI = EssentialOCLCSPackage.CALL_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__PARENT = EssentialOCLCSPackage.CALL_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__PIVOT = EssentialOCLCSPackage.CALL_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.CALL_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.CALL_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.CALL_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Is Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__IS_PRE = EssentialOCLCSPackage.CALL_EXP_CS__IS_PRE;

	/**
	 * The feature id for the '<em><b>Owned Curly Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__OWNED_PATH_NAME = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Owned Round Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Square Bracketed Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__SOURCE_TYPE = EssentialOCLCSPackage.CALL_EXP_CS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Source Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__SOURCE_TYPE_VALUE = EssentialOCLCSPackage.CALL_EXP_CS__SOURCE_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__ARGUMENTS = EssentialOCLCSPackage.CALL_EXP_CS__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__SOURCE = EssentialOCLCSPackage.CALL_EXP_CS__SOURCE;

	/**
	 * The feature id for the '<em><b>Owned Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__OWNED_MESSAGE = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__OWNED_ELEMENT = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__SEVERITY = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS__OWNED_CONDITION = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Log Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.RaiseExpCSImpl <em>Raise Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.RaiseExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getRaiseExpCS()
	 * @generated
	 */
	int RAISE_EXP_CS = 17;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__CSI = STATEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__PARENT = STATEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__PIVOT = STATEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__ORIGINAL_XMI_ID = STATEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__OWNED_ANNOTATIONS = STATEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__HAS_ERROR = STATEMENT_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__LOCAL_LEFT = STATEMENT_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__LOCAL_PARENT = STATEMENT_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__LOCAL_RIGHT = STATEMENT_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__PRECEDENCE = STATEMENT_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Exception Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__OWNED_EXCEPTION_REF = STATEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS__OWNED_ARGUMENTS = STATEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Raise Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_CS_FEATURE_COUNT = STATEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ReturnExpCSImpl <em>Return Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ReturnExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getReturnExpCS()
	 * @generated
	 */
	int RETURN_EXP_CS = 18;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__CSI = EssentialOCLCSPackage.EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__PARENT = EssentialOCLCSPackage.EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__PIVOT = EssentialOCLCSPackage.EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS__OWNED_VALUE = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchAltCSImpl <em>Switch Alt CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchAltCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getSwitchAltCS()
	 * @generated
	 */
	int SWITCH_ALT_CS = 20;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__CSI = STATEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__PARENT = STATEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__PIVOT = STATEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__ORIGINAL_XMI_ID = STATEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__OWNED_ANNOTATIONS = STATEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__HAS_ERROR = STATEMENT_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__LOCAL_LEFT = STATEMENT_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__LOCAL_LEFTMOST_DESCENDANT = STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__LOCAL_PARENT = STATEMENT_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__LOCAL_RIGHT = STATEMENT_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__LOCAL_RIGHTMOST_DESCENDANT = STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__PRECEDENCE = STATEMENT_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__OWNED_CONDITION = STATEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS__OWNED_BODY = STATEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Alt CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_ALT_CS_FEATURE_COUNT = STATEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchExpCSImpl <em>Switch Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getSwitchExpCS()
	 * @generated
	 */
	int SWITCH_EXP_CS = 21;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__CSI = STATEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__PARENT = STATEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__PIVOT = STATEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__ORIGINAL_XMI_ID = STATEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__OWNED_ANNOTATIONS = STATEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__HAS_ERROR = STATEMENT_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__LOCAL_LEFT = STATEMENT_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__LOCAL_PARENT = STATEMENT_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__LOCAL_RIGHT = STATEMENT_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__PRECEDENCE = STATEMENT_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Alt Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__OWNED_ALT_PARTS = STATEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS__OWNED_ELSE_PART = STATEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_CS_FEATURE_COUNT = STATEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.TryExpCSImpl <em>Try Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.TryExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getTryExpCS()
	 * @generated
	 */
	int TRY_EXP_CS = 22;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__CSI = EXPRESSION_BLOCK_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__PARENT = EXPRESSION_BLOCK_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__PIVOT = EXPRESSION_BLOCK_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__ORIGINAL_XMI_ID = EXPRESSION_BLOCK_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__OWNED_ANNOTATIONS = EXPRESSION_BLOCK_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__HAS_ERROR = EXPRESSION_BLOCK_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__LOCAL_LEFT = EXPRESSION_BLOCK_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EXPRESSION_BLOCK_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__LOCAL_PARENT = EXPRESSION_BLOCK_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__LOCAL_RIGHT = EXPRESSION_BLOCK_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EXPRESSION_BLOCK_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__PRECEDENCE = EXPRESSION_BLOCK_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__OWNED_EXPS = EXPRESSION_BLOCK_CS__OWNED_EXPS;

	/**
	 * The feature id for the '<em><b>Owned Catchs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS__OWNED_CATCHS = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Try Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_CS_FEATURE_COUNT = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.VarDeclarationCSImpl <em>Var Declaration CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.VarDeclarationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getVarDeclarationCS()
	 * @generated
	 */
	int VAR_DECLARATION_CS = 23;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS__CSI = EssentialOCLCSPackage.VARIABLE_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS__PARENT = EssentialOCLCSPackage.VARIABLE_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS__PIVOT = EssentialOCLCSPackage.VARIABLE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.VARIABLE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.VARIABLE_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS__NAME = EssentialOCLCSPackage.VARIABLE_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS__OWNED_INIT_EXPRESSION = EssentialOCLCSPackage.VARIABLE_CS__OWNED_INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS__OWNED_TYPE = EssentialOCLCSPackage.VARIABLE_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Init Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS__INIT_OP = EssentialOCLCSPackage.VARIABLE_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Declaration CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_CS_FEATURE_COUNT = EssentialOCLCSPackage.VARIABLE_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.VarsInitializationCSImpl <em>Vars Initialization CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.VarsInitializationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getVarsInitializationCS()
	 * @generated
	 */
	int VARS_INITIALIZATION_CS = 24;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__CSI = STATEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__PARENT = STATEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__PIVOT = STATEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__ORIGINAL_XMI_ID = STATEMENT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__OWNED_ANNOTATIONS = STATEMENT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__HAS_ERROR = STATEMENT_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__LOCAL_LEFT = STATEMENT_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__LOCAL_LEFTMOST_DESCENDANT = STATEMENT_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__LOCAL_PARENT = STATEMENT_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__LOCAL_RIGHT = STATEMENT_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__LOCAL_RIGHTMOST_DESCENDANT = STATEMENT_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__PRECEDENCE = STATEMENT_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Var Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS__OWNED_VAR_DECLARATIONS = STATEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vars Initialization CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARS_INITIALIZATION_CS_FEATURE_COUNT = STATEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.WhileExpCSImpl <em>While Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.WhileExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getWhileExpCS()
	 * @generated
	 */
	int WHILE_EXP_CS = 25;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__CSI = EXPRESSION_BLOCK_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__PARENT = EXPRESSION_BLOCK_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__PIVOT = EXPRESSION_BLOCK_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__ORIGINAL_XMI_ID = EXPRESSION_BLOCK_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__OWNED_ANNOTATIONS = EXPRESSION_BLOCK_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__HAS_ERROR = EXPRESSION_BLOCK_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__LOCAL_LEFT = EXPRESSION_BLOCK_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EXPRESSION_BLOCK_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__LOCAL_PARENT = EXPRESSION_BLOCK_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__LOCAL_RIGHT = EXPRESSION_BLOCK_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EXPRESSION_BLOCK_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__PRECEDENCE = EXPRESSION_BLOCK_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__OWNED_EXPS = EXPRESSION_BLOCK_CS__OWNED_EXPS;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__OWNED_CONDITION = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Result Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS__OWNED_RESULT_VAR = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_CS_FEATURE_COUNT = EXPRESSION_BLOCK_CS_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS <em>Assert Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS
	 * @generated
	 */
	EClass getAssertExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getOwnedAssertion <em>Owned Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Assertion</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getOwnedAssertion()
	 * @see #getAssertExpCS()
	 * @generated
	 */
	EReference getAssertExpCS_OwnedAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getOwnedLog <em>Owned Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Log</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getOwnedLog()
	 * @see #getAssertExpCS()
	 * @generated
	 */
	EReference getAssertExpCS_OwnedLog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getSeverity()
	 * @see #getAssertExpCS()
	 * @generated
	 */
	EAttribute getAssertExpCS_Severity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS <em>Assign Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS
	 * @generated
	 */
	EClass getAssignExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedLeft <em>Owned Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Left</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedLeft()
	 * @see #getAssignExpCS()
	 * @generated
	 */
	EReference getAssignExpCS_OwnedLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedValue <em>Owned Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Value</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedValue()
	 * @see #getAssignExpCS()
	 * @generated
	 */
	EReference getAssignExpCS_OwnedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getAssignOp <em>Assign Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assign Op</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getAssignOp()
	 * @see #getAssignExpCS()
	 * @generated
	 */
	EAttribute getAssignExpCS_AssignOp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedDefault <em>Owned Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Default</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedDefault()
	 * @see #getAssignExpCS()
	 * @generated
	 */
	EReference getAssignExpCS_OwnedDefault();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.BreakExpCS <em>Break Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.BreakExpCS
	 * @generated
	 */
	EClass getBreakExpCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralExpCS <em>Dict Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dict Literal Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralExpCS
	 * @generated
	 */
	EClass getDictLiteralExpCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralExpCS#getOwnedParts <em>Owned Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parts</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralExpCS#getOwnedParts()
	 * @see #getDictLiteralExpCS()
	 * @generated
	 */
	EReference getDictLiteralExpCS_OwnedParts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS <em>Dict Literal Part CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dict Literal Part CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS
	 * @generated
	 */
	EClass getDictLiteralPartCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS#getOwnedKey <em>Owned Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Key</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS#getOwnedKey()
	 * @see #getDictLiteralPartCS()
	 * @generated
	 */
	EReference getDictLiteralPartCS_OwnedKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS#getOwnedValue <em>Owned Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Value</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS#getOwnedValue()
	 * @see #getDictLiteralPartCS()
	 * @generated
	 */
	EReference getDictLiteralPartCS_OwnedValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS <em>Dict Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dict Type CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS
	 * @generated
	 */
	EClass getDictTypeCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS#getOwnedKeyTypeRef <em>Owned Key Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Key Type Ref</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS#getOwnedKeyTypeRef()
	 * @see #getDictTypeCS()
	 * @generated
	 */
	EReference getDictTypeCS_OwnedKeyTypeRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS#getOwnedValueTypeRef <em>Owned Value Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Value Type Ref</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS#getOwnedValueTypeRef()
	 * @see #getDictTypeCS()
	 * @generated
	 */
	EReference getDictTypeCS_OwnedValueTypeRef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ComputeExpCS <em>Compute Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ComputeExpCS
	 * @generated
	 */
	EClass getComputeExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ComputeExpCS#getOwnedResultVar <em>Owned Result Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Result Var</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ComputeExpCS#getOwnedResultVar()
	 * @see #getComputeExpCS()
	 * @generated
	 */
	EReference getComputeExpCS_OwnedResultVar();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ContinueExpCS <em>Continue Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ContinueExpCS
	 * @generated
	 */
	EClass getContinueExpCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeIterateExpCS <em>Imperative Iterate Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Iterate Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeIterateExpCS
	 * @generated
	 */
	EClass getImperativeIterateExpCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS <em>Imperative Loop Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Loop Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS
	 * @generated
	 */
	EClass getImperativeLoopExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedCondition <em>Owned Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Condition</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedCondition()
	 * @see #getImperativeLoopExpCS()
	 * @generated
	 */
	EReference getImperativeLoopExpCS_OwnedCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedTarget <em>Owned Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Target</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedTarget()
	 * @see #getImperativeLoopExpCS()
	 * @generated
	 */
	EReference getImperativeLoopExpCS_OwnedTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedIterator <em>Owned Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Iterator</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedIterator()
	 * @see #getImperativeLoopExpCS()
	 * @generated
	 */
	EReference getImperativeLoopExpCS_OwnedIterator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedBody <em>Owned Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Body</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getOwnedBody()
	 * @see #getImperativeLoopExpCS()
	 * @generated
	 */
	EReference getImperativeLoopExpCS_OwnedBody();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS#getName()
	 * @see #getImperativeLoopExpCS()
	 * @generated
	 */
	EAttribute getImperativeLoopExpCS_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS <em>Instantiation Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS
	 * @generated
	 */
	EClass getInstantiationExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedClassRef <em>Owned Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Class Ref</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedClassRef()
	 * @see #getInstantiationExpCS()
	 * @generated
	 */
	EReference getInstantiationExpCS_OwnedClassRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedArguments <em>Owned Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Arguments</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedArguments()
	 * @see #getInstantiationExpCS()
	 * @generated
	 */
	EReference getInstantiationExpCS_OwnedArguments();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedExtentRef <em>Owned Extent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Extent Ref</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedExtentRef()
	 * @see #getInstantiationExpCS()
	 * @generated
	 */
	EReference getInstantiationExpCS_OwnedExtentRef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.CatchExpCS <em>Catch Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.CatchExpCS
	 * @generated
	 */
	EClass getCatchExpCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.CatchExpCS#getOwnedExceptionRefs <em>Owned Exception Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Exception Refs</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.CatchExpCS#getOwnedExceptionRefs()
	 * @see #getCatchExpCS()
	 * @generated
	 */
	EReference getCatchExpCS_OwnedExceptionRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.CatchExpCS#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.CatchExpCS#getVarName()
	 * @see #getCatchExpCS()
	 * @generated
	 */
	EAttribute getCatchExpCS_VarName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS <em>Expression Block CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Block CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS
	 * @generated
	 */
	EClass getExpressionBlockCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS#getOwnedExps <em>Owned Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Exps</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS#getOwnedExps()
	 * @see #getExpressionBlockCS()
	 * @generated
	 */
	EReference getExpressionBlockCS_OwnedExps();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ForExpCS <em>For Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ForExpCS
	 * @generated
	 */
	EClass getForExpCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ForExpCS#getIsOne <em>Is One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is One</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ForExpCS#getIsOne()
	 * @see #getForExpCS()
	 * @generated
	 */
	EAttribute getForExpCS_IsOne();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS <em>List Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS
	 * @generated
	 */
	EClass getListTypeCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS#getOwnedTypeRef <em>Owned Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Type Ref</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS#getOwnedTypeRef()
	 * @see #getListTypeCS()
	 * @generated
	 */
	EReference getListTypeCS_OwnedTypeRef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ListLiteralExpCS <em>List Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Literal Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ListLiteralExpCS
	 * @generated
	 */
	EClass getListLiteralExpCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ListLiteralExpCS#getOwnedParts <em>Owned Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parts</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ListLiteralExpCS#getOwnedParts()
	 * @see #getListLiteralExpCS()
	 * @generated
	 */
	EReference getListLiteralExpCS_OwnedParts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS <em>Log Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS
	 * @generated
	 */
	EClass getLogExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedMessage <em>Owned Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Message</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedMessage()
	 * @see #getLogExpCS()
	 * @generated
	 */
	EReference getLogExpCS_OwnedMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Element</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedElement()
	 * @see #getLogExpCS()
	 * @generated
	 */
	EReference getLogExpCS_OwnedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getSeverity()
	 * @see #getLogExpCS()
	 * @generated
	 */
	EAttribute getLogExpCS_Severity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedCondition <em>Owned Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Condition</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedCondition()
	 * @see #getLogExpCS()
	 * @generated
	 */
	EReference getLogExpCS_OwnedCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS <em>Raise Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS
	 * @generated
	 */
	EClass getRaiseExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS#getOwnedExceptionRef <em>Owned Exception Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Exception Ref</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS#getOwnedExceptionRef()
	 * @see #getRaiseExpCS()
	 * @generated
	 */
	EReference getRaiseExpCS_OwnedExceptionRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS#getOwnedArguments <em>Owned Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Arguments</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS#getOwnedArguments()
	 * @see #getRaiseExpCS()
	 * @generated
	 */
	EReference getRaiseExpCS_OwnedArguments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ReturnExpCS <em>Return Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ReturnExpCS
	 * @generated
	 */
	EClass getReturnExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ReturnExpCS#getOwnedValue <em>Owned Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Value</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ReturnExpCS#getOwnedValue()
	 * @see #getReturnExpCS()
	 * @generated
	 */
	EReference getReturnExpCS_OwnedValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.StatementCS <em>Statement CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.StatementCS
	 * @generated
	 */
	EClass getStatementCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS <em>Switch Alt CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Alt CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS
	 * @generated
	 */
	EClass getSwitchAltCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS#getOwnedCondition <em>Owned Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Condition</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS#getOwnedCondition()
	 * @see #getSwitchAltCS()
	 * @generated
	 */
	EReference getSwitchAltCS_OwnedCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS#getOwnedBody <em>Owned Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Body</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS#getOwnedBody()
	 * @see #getSwitchAltCS()
	 * @generated
	 */
	EReference getSwitchAltCS_OwnedBody();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS <em>Switch Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS
	 * @generated
	 */
	EClass getSwitchExpCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getOwnedAltParts <em>Owned Alt Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Alt Parts</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getOwnedAltParts()
	 * @see #getSwitchExpCS()
	 * @generated
	 */
	EReference getSwitchExpCS_OwnedAltParts();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getOwnedElsePart <em>Owned Else Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Else Part</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getOwnedElsePart()
	 * @see #getSwitchExpCS()
	 * @generated
	 */
	EReference getSwitchExpCS_OwnedElsePart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.TryExpCS <em>Try Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.TryExpCS
	 * @generated
	 */
	EClass getTryExpCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.TryExpCS#getOwnedCatchs <em>Owned Catchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Catchs</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.TryExpCS#getOwnedCatchs()
	 * @see #getTryExpCS()
	 * @generated
	 */
	EReference getTryExpCS_OwnedCatchs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS <em>Var Declaration CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Declaration CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS
	 * @generated
	 */
	EClass getVarDeclarationCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS#getInitOp <em>Init Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Op</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS#getInitOp()
	 * @see #getVarDeclarationCS()
	 * @generated
	 */
	EAttribute getVarDeclarationCS_InitOp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.VarsInitializationCS <em>Vars Initialization CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vars Initialization CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.VarsInitializationCS
	 * @generated
	 */
	EClass getVarsInitializationCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.VarsInitializationCS#getOwnedVarDeclarations <em>Owned Var Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Var Declarations</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.VarsInitializationCS#getOwnedVarDeclarations()
	 * @see #getVarsInitializationCS()
	 * @generated
	 */
	EReference getVarsInitializationCS_OwnedVarDeclarations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS <em>While Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS
	 * @generated
	 */
	EClass getWhileExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS#getOwnedCondition <em>Owned Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Condition</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS#getOwnedCondition()
	 * @see #getWhileExpCS()
	 * @generated
	 */
	EReference getWhileExpCS_OwnedCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS#getOwnedResultVar <em>Owned Result Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Result Var</em>'.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS#getOwnedResultVar()
	 * @see #getWhileExpCS()
	 * @generated
	 */
	EReference getWhileExpCS_OwnedResultVar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImperativeOCLCSFactory getImperativeOCLCSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssertExpCSImpl <em>Assert Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssertExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getAssertExpCS()
		 * @generated
		 */
		EClass ASSERT_EXP_CS = eINSTANCE.getAssertExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_EXP_CS__OWNED_ASSERTION = eINSTANCE.getAssertExpCS_OwnedAssertion();

		/**
		 * The meta object literal for the '<em><b>Owned Log</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_EXP_CS__OWNED_LOG = eINSTANCE.getAssertExpCS_OwnedLog();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_EXP_CS__SEVERITY = eINSTANCE.getAssertExpCS_Severity();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssignExpCSImpl <em>Assign Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssignExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getAssignExpCS()
		 * @generated
		 */
		EClass ASSIGN_EXP_CS = eINSTANCE.getAssignExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_EXP_CS__OWNED_LEFT = eINSTANCE.getAssignExpCS_OwnedLeft();

		/**
		 * The meta object literal for the '<em><b>Owned Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_EXP_CS__OWNED_VALUE = eINSTANCE.getAssignExpCS_OwnedValue();

		/**
		 * The meta object literal for the '<em><b>Assign Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN_EXP_CS__ASSIGN_OP = eINSTANCE.getAssignExpCS_AssignOp();

		/**
		 * The meta object literal for the '<em><b>Owned Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_EXP_CS__OWNED_DEFAULT = eINSTANCE.getAssignExpCS_OwnedDefault();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.BreakExpCSImpl <em>Break Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.BreakExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getBreakExpCS()
		 * @generated
		 */
		EClass BREAK_EXP_CS = eINSTANCE.getBreakExpCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralExpCSImpl <em>Dict Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getDictLiteralExpCS()
		 * @generated
		 */
		EClass DICT_LITERAL_EXP_CS = eINSTANCE.getDictLiteralExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_LITERAL_EXP_CS__OWNED_PARTS = eINSTANCE.getDictLiteralExpCS_OwnedParts();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralPartCSImpl <em>Dict Literal Part CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralPartCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getDictLiteralPartCS()
		 * @generated
		 */
		EClass DICT_LITERAL_PART_CS = eINSTANCE.getDictLiteralPartCS();

		/**
		 * The meta object literal for the '<em><b>Owned Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_LITERAL_PART_CS__OWNED_KEY = eINSTANCE.getDictLiteralPartCS_OwnedKey();

		/**
		 * The meta object literal for the '<em><b>Owned Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_LITERAL_PART_CS__OWNED_VALUE = eINSTANCE.getDictLiteralPartCS_OwnedValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictTypeCSImpl <em>Dict Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictTypeCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getDictTypeCS()
		 * @generated
		 */
		EClass DICT_TYPE_CS = eINSTANCE.getDictTypeCS();

		/**
		 * The meta object literal for the '<em><b>Owned Key Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_TYPE_CS__OWNED_KEY_TYPE_REF = eINSTANCE.getDictTypeCS_OwnedKeyTypeRef();

		/**
		 * The meta object literal for the '<em><b>Owned Value Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_TYPE_CS__OWNED_VALUE_TYPE_REF = eINSTANCE.getDictTypeCS_OwnedValueTypeRef();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ComputeExpCSImpl <em>Compute Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ComputeExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getComputeExpCS()
		 * @generated
		 */
		EClass COMPUTE_EXP_CS = eINSTANCE.getComputeExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Result Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE_EXP_CS__OWNED_RESULT_VAR = eINSTANCE.getComputeExpCS_OwnedResultVar();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ContinueExpCSImpl <em>Continue Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ContinueExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getContinueExpCS()
		 * @generated
		 */
		EClass CONTINUE_EXP_CS = eINSTANCE.getContinueExpCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeIterateExpCSImpl <em>Imperative Iterate Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeIterateExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getImperativeIterateExpCS()
		 * @generated
		 */
		EClass IMPERATIVE_ITERATE_EXP_CS = eINSTANCE.getImperativeIterateExpCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeLoopExpCSImpl <em>Imperative Loop Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeLoopExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getImperativeLoopExpCS()
		 * @generated
		 */
		EClass IMPERATIVE_LOOP_EXP_CS = eINSTANCE.getImperativeLoopExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION = eINSTANCE.getImperativeLoopExpCS_OwnedCondition();

		/**
		 * The meta object literal for the '<em><b>Owned Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET = eINSTANCE.getImperativeLoopExpCS_OwnedTarget();

		/**
		 * The meta object literal for the '<em><b>Owned Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR = eINSTANCE.getImperativeLoopExpCS_OwnedIterator();

		/**
		 * The meta object literal for the '<em><b>Owned Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_LOOP_EXP_CS__OWNED_BODY = eINSTANCE.getImperativeLoopExpCS_OwnedBody();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPERATIVE_LOOP_EXP_CS__NAME = eINSTANCE.getImperativeLoopExpCS_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.InstantiationExpCSImpl <em>Instantiation Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.InstantiationExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getInstantiationExpCS()
		 * @generated
		 */
		EClass INSTANTIATION_EXP_CS = eINSTANCE.getInstantiationExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Class Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_EXP_CS__OWNED_CLASS_REF = eINSTANCE.getInstantiationExpCS_OwnedClassRef();

		/**
		 * The meta object literal for the '<em><b>Owned Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_EXP_CS__OWNED_ARGUMENTS = eINSTANCE.getInstantiationExpCS_OwnedArguments();

		/**
		 * The meta object literal for the '<em><b>Owned Extent Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_EXP_CS__OWNED_EXTENT_REF = eINSTANCE.getInstantiationExpCS_OwnedExtentRef();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.CatchExpCSImpl <em>Catch Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.CatchExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getCatchExpCS()
		 * @generated
		 */
		EClass CATCH_EXP_CS = eINSTANCE.getCatchExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Exception Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EXP_CS__OWNED_EXCEPTION_REFS = eINSTANCE.getCatchExpCS_OwnedExceptionRefs();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH_EXP_CS__VAR_NAME = eINSTANCE.getCatchExpCS_VarName();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ExpressionBlockCSImpl <em>Expression Block CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ExpressionBlockCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getExpressionBlockCS()
		 * @generated
		 */
		EClass EXPRESSION_BLOCK_CS = eINSTANCE.getExpressionBlockCS();

		/**
		 * The meta object literal for the '<em><b>Owned Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BLOCK_CS__OWNED_EXPS = eINSTANCE.getExpressionBlockCS_OwnedExps();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ForExpCSImpl <em>For Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ForExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getForExpCS()
		 * @generated
		 */
		EClass FOR_EXP_CS = eINSTANCE.getForExpCS();

		/**
		 * The meta object literal for the '<em><b>Is One</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_EXP_CS__IS_ONE = eINSTANCE.getForExpCS_IsOne();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ListTypeCSImpl <em>List Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ListTypeCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getListTypeCS()
		 * @generated
		 */
		EClass LIST_TYPE_CS = eINSTANCE.getListTypeCS();

		/**
		 * The meta object literal for the '<em><b>Owned Type Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TYPE_CS__OWNED_TYPE_REF = eINSTANCE.getListTypeCS_OwnedTypeRef();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ListLiteralExpCSImpl <em>List Literal Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ListLiteralExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getListLiteralExpCS()
		 * @generated
		 */
		EClass LIST_LITERAL_EXP_CS = eINSTANCE.getListLiteralExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_LITERAL_EXP_CS__OWNED_PARTS = eINSTANCE.getListLiteralExpCS_OwnedParts();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.LogExpCSImpl <em>Log Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.LogExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getLogExpCS()
		 * @generated
		 */
		EClass LOG_EXP_CS = eINSTANCE.getLogExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_EXP_CS__OWNED_MESSAGE = eINSTANCE.getLogExpCS_OwnedMessage();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_EXP_CS__OWNED_ELEMENT = eINSTANCE.getLogExpCS_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_EXP_CS__SEVERITY = eINSTANCE.getLogExpCS_Severity();

		/**
		 * The meta object literal for the '<em><b>Owned Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_EXP_CS__OWNED_CONDITION = eINSTANCE.getLogExpCS_OwnedCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.RaiseExpCSImpl <em>Raise Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.RaiseExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getRaiseExpCS()
		 * @generated
		 */
		EClass RAISE_EXP_CS = eINSTANCE.getRaiseExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Exception Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXP_CS__OWNED_EXCEPTION_REF = eINSTANCE.getRaiseExpCS_OwnedExceptionRef();

		/**
		 * The meta object literal for the '<em><b>Owned Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXP_CS__OWNED_ARGUMENTS = eINSTANCE.getRaiseExpCS_OwnedArguments();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ReturnExpCSImpl <em>Return Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ReturnExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getReturnExpCS()
		 * @generated
		 */
		EClass RETURN_EXP_CS = eINSTANCE.getReturnExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_EXP_CS__OWNED_VALUE = eINSTANCE.getReturnExpCS_OwnedValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.StatementCSImpl <em>Statement CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.StatementCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getStatementCS()
		 * @generated
		 */
		EClass STATEMENT_CS = eINSTANCE.getStatementCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchAltCSImpl <em>Switch Alt CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchAltCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getSwitchAltCS()
		 * @generated
		 */
		EClass SWITCH_ALT_CS = eINSTANCE.getSwitchAltCS();

		/**
		 * The meta object literal for the '<em><b>Owned Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_ALT_CS__OWNED_CONDITION = eINSTANCE.getSwitchAltCS_OwnedCondition();

		/**
		 * The meta object literal for the '<em><b>Owned Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_ALT_CS__OWNED_BODY = eINSTANCE.getSwitchAltCS_OwnedBody();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchExpCSImpl <em>Switch Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getSwitchExpCS()
		 * @generated
		 */
		EClass SWITCH_EXP_CS = eINSTANCE.getSwitchExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Alt Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXP_CS__OWNED_ALT_PARTS = eINSTANCE.getSwitchExpCS_OwnedAltParts();

		/**
		 * The meta object literal for the '<em><b>Owned Else Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXP_CS__OWNED_ELSE_PART = eINSTANCE.getSwitchExpCS_OwnedElsePart();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.TryExpCSImpl <em>Try Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.TryExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getTryExpCS()
		 * @generated
		 */
		EClass TRY_EXP_CS = eINSTANCE.getTryExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Catchs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_EXP_CS__OWNED_CATCHS = eINSTANCE.getTryExpCS_OwnedCatchs();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.VarDeclarationCSImpl <em>Var Declaration CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.VarDeclarationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getVarDeclarationCS()
		 * @generated
		 */
		EClass VAR_DECLARATION_CS = eINSTANCE.getVarDeclarationCS();

		/**
		 * The meta object literal for the '<em><b>Init Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_DECLARATION_CS__INIT_OP = eINSTANCE.getVarDeclarationCS_InitOp();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.VarsInitializationCSImpl <em>Vars Initialization CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.VarsInitializationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getVarsInitializationCS()
		 * @generated
		 */
		EClass VARS_INITIALIZATION_CS = eINSTANCE.getVarsInitializationCS();

		/**
		 * The meta object literal for the '<em><b>Owned Var Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARS_INITIALIZATION_CS__OWNED_VAR_DECLARATIONS = eINSTANCE.getVarsInitializationCS_OwnedVarDeclarations();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.WhileExpCSImpl <em>While Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.WhileExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeOCLCSPackageImpl#getWhileExpCS()
		 * @generated
		 */
		EClass WHILE_EXP_CS = eINSTANCE.getWhileExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_EXP_CS__OWNED_CONDITION = eINSTANCE.getWhileExpCS_OwnedCondition();

		/**
		 * The meta object literal for the '<em><b>Owned Result Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_EXP_CS__OWNED_RESULT_VAR = eINSTANCE.getWhileExpCS_OwnedResultVar();

	}

} //ImperativeOCLCSPackage
