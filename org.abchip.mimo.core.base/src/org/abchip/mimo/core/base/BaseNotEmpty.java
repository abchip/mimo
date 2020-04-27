package org.abchip.mimo.core.base;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAnnotationValidator;

public class BaseNotEmpty implements EAnnotationValidator {

	public BaseNotEmpty() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAnnotationSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValidLocation(EAnnotation eAnnotation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validate(EAnnotation eAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

}
