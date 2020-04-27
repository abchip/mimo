package org.abchip.mimo.core.base;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;

public class BaseValidationDelegate implements ValidationDelegate {

	public BaseValidationDelegate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, Map<Object, Object> context, EOperation invariant, String expression) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, Map<Object, Object> context, String constraint, String expression) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validate(EDataType eDataType, Object value, Map<Object, Object> context, String constraint, String expression) {
		// TODO Auto-generated method stub
		return false;
	}

}
