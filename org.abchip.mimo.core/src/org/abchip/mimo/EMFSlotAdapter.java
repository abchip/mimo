/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.impl.SlotImpl;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFSlotAdapter extends SlotImpl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ETypedElement element;

	public EMFSlotAdapter(ETypedElement element) {
		this(element, element.getName());
	}

	public EMFSlotAdapter(ETypedElement element, String name) {
		this.element = element;
		if (name != null)
			this.name = name;
		else
			this.name = element.getName();

		this.cardinality = new EMFCardinalityAdapter(element);

		
		if (element instanceof EStructuralFeature) {
			EStructuralFeature eStructuralFeature = ((EStructuralFeature) this.element);
			this.defaultValue = eStructuralFeature.getDefaultValueLiteral();
			this.transient_ = eStructuralFeature.isTransient();
			this.volatile_ = eStructuralFeature.isVolatile();
		}
	}

	@Override
	public Entity getValue(String nsPrefix) {

		EAnnotation eAnnotation = this.element.getEAnnotation(nsPrefix);

		if (eAnnotation == null)
			return null;

		EObject eObject = EcoreUtil.create((EClass) eAnnotation.getReferences().get(0));

		for (String key : eAnnotation.getDetails().keySet()) {
			EStructuralFeature dataDefFeature = eObject.eClass().getEStructuralFeature(key);

			if (dataDefFeature == null)
				continue;

			if (dataDefFeature.getDefaultValue() instanceof Number)
				eObject.eSet(dataDefFeature, Integer.parseInt(eAnnotation.getDetails().get(key)));
			else
				eObject.eSet(dataDefFeature, eAnnotation.getDetails().get(key));
		}

		return (Entity) eObject;
	}

	@Override
	public String toString() {
		return this.element.toString();
	}

	@Override
	public String getDataClassName() {
		return element.getEType().getInstanceClassName();
	}
}