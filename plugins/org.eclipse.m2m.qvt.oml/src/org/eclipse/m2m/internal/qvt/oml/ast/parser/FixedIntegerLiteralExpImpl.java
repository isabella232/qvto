package org.eclipse.m2m.internal.qvt.oml.ast.parser;

import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.impl.IntegerLiteralExpImpl;

public class FixedIntegerLiteralExpImpl extends IntegerLiteralExpImpl {

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.INTEGER_LITERAL_EXP__INTEGER_SYMBOL :
				return integerSymbol;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackage.INTEGER_LITERAL_EXP__EXTENDED_INTEGER_SYMBOL :
				extendedIntegerSymbol = (Long) newValue;
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcorePackage.INTEGER_LITERAL_EXP__EXTENDED_INTEGER_SYMBOL :
				extendedIntegerSymbol = EXTENDED_INTEGER_SYMBOL_EDEFAULT;
				return;
		}
		super.eUnset(featureID);
	}
	
}
