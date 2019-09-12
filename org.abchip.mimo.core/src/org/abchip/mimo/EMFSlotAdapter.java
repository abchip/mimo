/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.SlotImpl;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

	public EMFSlotAdapter(Frame<?> frame, ETypedElement element) {
		this.element = element;

		this.name = element.getName();

		if (element instanceof EStructuralFeature) {
			EStructuralFeature eStructuralFeature = ((EStructuralFeature) this.element);
			this.defaultValue = eStructuralFeature.getDefaultValueLiteral();
		}

		this.setSlotText(frame);

		this.cardinality = new EMFCardinalityAdapter(element);

		if (element instanceof EAttribute)
			this.key = ((EAttribute) element).isID();

		EAnnotation eAnnotation = element.getEAnnotation(Slot.NS_PREFIX_SLOT);
		if (eAnnotation != null) {
			for (String key : eAnnotation.getDetails().keySet()) {
				if (key.equals("derived"))
					this.derived = true;
				else if (key.equals("key"))
					this.key = true;
				else if (key.equals("group"))
					this.group = eAnnotation.getDetails().get(key);
			}
		}

		this.setSlotDomain();
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

	protected ETypedElement getETypedElement() {
		return this.element;
	}

	private void setSlotText(Frame<?> frame) {

		// remove prefix from slotText
		if (this.getName().toLowerCase().startsWith(frame.getName().toLowerCase()))
			this.text = this.getName().substring(frame.getName().length());
		else if (!frame.getSuperNames().isEmpty()) {
			for (String superName : frame.getSuperNames()) {
				if (this.getName().toLowerCase().startsWith(superName.toLowerCase())) {
					this.text = this.getName().substring(superName.length());
					break;
				}
			}
		}

		if (this.text == null)
			this.text = Strings.qINSTANCE.firstToUpper(this.getName());
	}

	private void setSlotDomain() {

		EAnnotation eAnnotation = this.getETypedElement().getEAnnotation(Slot.NS_PREFIX_DOMAIN);
		if (eAnnotation != null) {
			EObject eObject = EcoreUtil.create(EntityPackage.eINSTANCE.getDomain());

			for (String key : eAnnotation.getDetails().keySet()) {
				EStructuralFeature dataDefFeature = eObject.eClass().getEStructuralFeature(key);
				if (dataDefFeature == null)
					continue;
				if (dataDefFeature.getDefaultValue() instanceof Number)
					eObject.eSet(dataDefFeature, Integer.parseInt(eAnnotation.getDetails().get(key)));
				else
					eObject.eSet(dataDefFeature, eAnnotation.getDetails().get(key));
			}

			this.domain = (Domain) eObject;
		}

		if (this.domain == null || this.getDomain().getFrame() == null) {

			// reference
			if (element instanceof EReference) {
				if (this.domain == null)
					this.domain = EntityFactory.eINSTANCE.createDomain();
				if (this.getDomain().getFrame() == null)
					this.getDomain().setFrame(element.getEType().getName());
				this.containment = ((EReference) element).isContainment();
			}
			// enum
			else if (element.getEType() instanceof EEnum) {
				if (this.domain == null)
					this.domain = EntityFactory.eINSTANCE.createDomain();
				if (this.getDomain().getFrame() == null)
					this.getDomain().setFrame(element.getEType().getName());
			} else if (element instanceof EAttribute) {

			} else
				"".toString();
		}
		
		if(this.domain != null)
			this.route = this.domain.getRoute() != null;
	}
}