package org.abchip.mimo;

import org.abchip.mimo.entity.impl.EntityEnumImpl;
import org.eclipse.emf.ecore.EEnumLiteral;

public class EMFEntityEnumAdapter extends EntityEnumImpl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EMFEntityEnumAdapter(EEnumLiteral eEnumLiteral) {
		this.name = eEnumLiteral.getName();
		this.text = eEnumLiteral.getLiteral();
	}
}
