/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assign Op CS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssignOpCS()
 * @model
 * @generated
 */
public enum AssignOpCS implements Enumerator {
	/**
	 * The '<em><b>Single</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(0, "Single", ":="),

	/**
	 * The '<em><b>Multi With Reset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_WITH_RESET_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_WITH_RESET(1, "MultiWithReset", "::="),

	/**
	 * The '<em><b>Multi Without Reset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_WITHOUT_RESET_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_WITHOUT_RESET(2, "MultiWithoutReset", "+=");

	/**
	 * The '<em><b>Single</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE
	 * @model name="Single" literal=":="
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 0;

	/**
	 * The '<em><b>Multi With Reset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI WITH RESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_WITH_RESET
	 * @model name="MultiWithReset" literal="::="
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_WITH_RESET_VALUE = 1;

	/**
	 * The '<em><b>Multi Without Reset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI WITHOUT RESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_WITHOUT_RESET
	 * @model name="MultiWithoutReset" literal="+="
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_WITHOUT_RESET_VALUE = 2;

	/**
	 * An array of all the '<em><b>Assign Op CS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssignOpCS[] VALUES_ARRAY =
		new AssignOpCS[] {
			SINGLE,
			MULTI_WITH_RESET,
			MULTI_WITHOUT_RESET,
		};

	/**
	 * A public read-only list of all the '<em><b>Assign Op CS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssignOpCS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assign Op CS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssignOpCS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignOpCS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assign Op CS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssignOpCS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignOpCS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assign Op CS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssignOpCS get(int value) {
		switch (value) {
			case SINGLE_VALUE: return SINGLE;
			case MULTI_WITH_RESET_VALUE: return MULTI_WITH_RESET;
			case MULTI_WITHOUT_RESET_VALUE: return MULTI_WITHOUT_RESET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssignOpCS(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AssignOpCS
