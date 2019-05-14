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

import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.SlotImpl;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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

		if(element instanceof EAttribute)
			this.key = ((EAttribute)element).isID();
		
		EAnnotation eAnnotation = element.getEAnnotation(Slot.NS_PREFIX_SLOT);

		if (eAnnotation != null && !eAnnotation.getReferences().isEmpty()) {
			EObject eObject = EcoreUtil.create((EClass) eAnnotation.getReferences().get(0));

			for (String key : eAnnotation.getDetails().keySet()) {

				EStructuralFeature dataDefFeature = eObject.eClass().getEStructuralFeature(key);
				if (dataDefFeature != null) {
					if (dataDefFeature.getDefaultValue() instanceof Number)
						eObject.eSet(dataDefFeature, Integer.parseInt(eAnnotation.getDetails().get(key)));
					else
						eObject.eSet(dataDefFeature, eAnnotation.getDetails().get(key));
				} else {
					if (key.equals("derived"))
						this.derived = true;
					else if (key.equals("key"))
						this.key = true;
				}
			}

			if (eObject instanceof Domain)
				this.domain = (Domain) eObject;
		}

		if (element instanceof EStructuralFeature) {
			EStructuralFeature eStructuralFeature = ((EStructuralFeature) this.element);
			this.defaultValue = eStructuralFeature.getDefaultValueLiteral();
		}

		if (element instanceof EReference) {
			EReference eReference = (EReference) element;
			if (this.domain == null)
				this.domain = EntityFactory.eINSTANCE.createDomain();
			if (this.getDomain().getFrame() == null)
				this.getDomain().setFrame(eReference.getEType().getName());
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