/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.util.Date;

import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.SlotImpl;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
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

		eSet(EntityPackage.SLOT__NAME, element.getName());

		if (element instanceof EStructuralFeature) {
			EStructuralFeature eStructuralFeature = ((EStructuralFeature) this.element);
			eSet(EntityPackage.SLOT__DEFAULT_VALUE, eStructuralFeature.getDefaultValueLiteral());
			eSet(EntityPackage.SLOT__DERIVED, eStructuralFeature.isDerived());
		} else if (element instanceof EOperation)
			eSet(EntityPackage.SLOT__DERIVED, true);

		this.setSlotText(frame);

		eSet(EntityPackage.SLOT__CARDINALITY, new EMFCardinalityAdapter(element));

		if (element instanceof EAttribute)
			eSet(EntityPackage.SLOT__KEY, ((EAttribute) element).isID());

		EAnnotation eAnnotation = element.getEAnnotation(Slot.NS_PREFIX_SLOT);
		if (eAnnotation != null) {
			for (String key : eAnnotation.getDetails().keySet()) {
				if (key.equals("key"))
					eSet(EntityPackage.SLOT__KEY, true);
				else if (key.equals("toString"))
					eSet(EntityPackage.SLOT__TO_STRING, true);
				else if (key.equals("group"))
					eSet(EntityPackage.SLOT__GROUP, eAnnotation.getDetails().get(key));
			}
		}

		EAnnotation eAnnotationFormat = element.getEAnnotation(Slot.NS_PREFIX_FORMAT);
		if (eAnnotationFormat != null) {
			for (String key : eAnnotationFormat.getDetails().keySet()) {
				if (key.equals("length"))
					eSet(EntityPackage.SLOT__LENGTH, Integer.parseInt(eAnnotationFormat.getDetails().get(key)));
				else if (key.equals("precision"))
					eSet(EntityPackage.SLOT__PRECISION, Integer.parseInt(eAnnotationFormat.getDetails().get(key)));
				else if (key.equals("scale"))
					eSet(EntityPackage.SLOT__SCALE, Integer.parseInt(eAnnotationFormat.getDetails().get(key)));
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

	protected ETypedElement getETypedElement() {
		return this.element;
	}

	private void setSlotText(Frame<?> frame) {

		String text = null;
		// remove prefix from slotText
		if (this.getName().toLowerCase().startsWith(frame.getName().toLowerCase()))
			text = this.getName().substring(frame.getName().length());
		else if (!frame.getSuperNames().isEmpty()) {
			for (String superName : frame.getSuperNames()) {

				if (this.getName().toLowerCase().equals(superName.toLowerCase()))
					break;

				if (this.getName().toLowerCase().startsWith(superName.toLowerCase())) {
					text = this.getName().substring(superName.length());
					break;
				}
			}
		}

		if (text == null)
			text = MimoUtils.firstToUpper(this.getName());

		if (text != null)
			eSet(EntityPackage.SLOT__TEXT, text);
	}

	private void setSlotDomain() {

		Domain domain = null;

		// reference
		if (element instanceof EReference) {
			domain = EntityFactory.eINSTANCE.createDomain();
			domain.setFrame(element.getEType().getName());

			if (((EReference) element).isContainment())
				eSet(EntityPackage.SLOT__CONTAINMENT, true);
		}
		// enum
		else if (element.getEType() instanceof EEnum) {
			domain = EntityFactory.eINSTANCE.createDomain();
			domain.setFrame(element.getEType().getName());
		}

		if (domain != null) 
			eSet(EntityPackage.SLOT__DOMAIN, domain);
	}

	@Override
	public boolean isBoolean() {
		if (this.getDataClassName() == null)
			return false;

		if (this.getDataClassName().equals(Boolean.class.getSimpleName().toLowerCase()))
			return true;

		return false;
	}

	@Override
	public boolean isDate() {
		if (this.getDataClassName() == null)
			return false;

		if (this.getDataClassName().equals(Date.class.getCanonicalName()))
			return true;

		return false;
	}

	@Override
	public boolean isEnum() {

		if (this.getDataClassName() == null)
			return false;

		if (element.getEType() instanceof EEnum)
			return true;

		return false;
	}

	@Override
	public boolean isNumeric() {

		if (this.getDataClassName() == null)
			return false;

		Class<?> klass = element.getEType().getInstanceClass();
		if (klass.isPrimitive()) {
			if (klass.getName().equals("long") || klass.getName().equals("integer") || klass.getName().equals("short") || klass.getName().equals("float") || klass.getName().equals("double"))
				return true;
		} else if (Number.class.isAssignableFrom(klass))
			return true;

		return false;
	}

	@Override
	public boolean isString() {

		if (this.getDataClassName() == null)
			return false;

		if (this.getDataClassName().equals(String.class.getCanonicalName()))
			return true;
		else if (this.getDataClassName().equals(char.class.getCanonicalName()))
			return true;

		return false;
	}

	private String getDataClassName() {
		return element.getEType().getInstanceClassName();
	}
}