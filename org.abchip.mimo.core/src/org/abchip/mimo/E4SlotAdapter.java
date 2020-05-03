/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.net.URI;
import java.util.Date;

import org.abchip.mimo.data.BinaryDef;
import org.abchip.mimo.data.BooleanDef;
import org.abchip.mimo.data.DataDef;
import org.abchip.mimo.data.DataFactory;
import org.abchip.mimo.data.DatetimeDef;
import org.abchip.mimo.data.DatetimeType;
import org.abchip.mimo.data.EntityDef;
import org.abchip.mimo.data.EnumDef;
import org.abchip.mimo.data.NumericDef;
import org.abchip.mimo.data.NumericType;
import org.abchip.mimo.data.StringDef;
import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.SlotImpl;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;

public class E4SlotAdapter extends SlotImpl {


	private ETypedElement element;

	public E4SlotAdapter(Frame<?> frame, ETypedElement element) {
		this.element = element;

		eSet(EntityPackage.SLOT__NAME, element.getName());

		if (element instanceof EStructuralFeature) {
			EStructuralFeature eStructuralFeature = ((EStructuralFeature) this.element);
			eSet(EntityPackage.SLOT__DEFAULT_VALUE, eStructuralFeature.getDefaultValueLiteral());
			eSet(EntityPackage.SLOT__DERIVED, eStructuralFeature.isDerived());
			eSet(EntityPackage.SLOT__TRANSIENT, eStructuralFeature.isTransient());
		} else if (element instanceof EOperation)
			eSet(EntityPackage.SLOT__DERIVED, true);

		this.setSlotText(frame);

		eSet(EntityPackage.SLOT__CARDINALITY, new E4CardinalityAdapter(element));

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

		this.setSlotDataDef();

		/*
		 * EAnnotation eAnnotationFormat =
		 * element.getEAnnotation(Slot.NS_PREFIX_FORMAT); if (eAnnotationFormat != null)
		 * { for (String key : eAnnotationFormat.getDetails().keySet()) { if
		 * (key.equals("length")) eSet(EntityPackage.SLOT__LENGTH,
		 * Integer.parseInt(eAnnotationFormat.getDetails().get(key))); else if
		 * (key.equals("precision")) eSet(EntityPackage.SLOT__PRECISION,
		 * Integer.parseInt(eAnnotationFormat.getDetails().get(key))); else if
		 * (key.equals("scale")) eSet(EntityPackage.SLOT__SCALE,
		 * Integer.parseInt(eAnnotationFormat.getDetails().get(key))); } }
		 */

		this.setSlotDomain();
	}

	private void setSlotDataDef() {

		Class<?> klass = element.getEType().getInstanceClass();

		DataDef<?> dataDef = null;
		if (klass.isPrimitive()) {

			switch (klass.getName()) {
				case "long":
				case "short":
				case "float":
				case "double": {
					NumericDef numericDef = DataFactory.eINSTANCE.createNumericDef();
					numericDef.setType(NumericType.getByName(Strings.firstToUpper(klass.getName())));
					dataDef = numericDef;
					break;
				}
				case "int": {
					NumericDef numericDef = DataFactory.eINSTANCE.createNumericDef();
					numericDef.setType(NumericType.INTEGER);
					dataDef = numericDef;
					break;
				}
				case "boolean": {
					BooleanDef booleanDef = DataFactory.eINSTANCE.createBooleanDef();
					dataDef = booleanDef;
					break;
				}
			}
		} else if (Number.class.isAssignableFrom(klass)) {
			NumericDef numericDef = DataFactory.eINSTANCE.createNumericDef();
			numericDef.setType(NumericType.BIG_DECIMAL);
			dataDef = numericDef;
		} else if (klass == byte[].class || klass == Object.class) {
			BinaryDef binaryDef = DataFactory.eINSTANCE.createBinaryDef();
			dataDef = binaryDef;
		} else if (Entity.class.isAssignableFrom(klass)) {
			EntityDef entityDef = DataFactory.eINSTANCE.createEntityDef();
			dataDef = entityDef;
		} else if (Boolean.class.isAssignableFrom(klass)) {
			BooleanDef booleanDef = DataFactory.eINSTANCE.createBooleanDef();
			dataDef = booleanDef;
		} else if (Date.class.isAssignableFrom(klass)) {
			DatetimeDef datetimeDef = DataFactory.eINSTANCE.createDatetimeDef();
			datetimeDef.setType(DatetimeType.TIME_STAMP);
			dataDef = datetimeDef;
		} else if (element.getEType() instanceof EEnum) {
			EnumDef<?> enumDef = DataFactory.eINSTANCE.createEnumDef();
			dataDef = enumDef;
		} else if (this.getDataClassName().equals(String.class.getCanonicalName()) || this.getDataClassName().equals(char.class.getCanonicalName())
				|| this.getDataClassName().equals(URI.class.getCanonicalName()) || EntityIdentifiable.class.isAssignableFrom(this.getETypedElement().getEType().getInstanceClass())) {
			StringDef stringDef = DataFactory.eINSTANCE.createStringDef();
			dataDef = stringDef;
		}

		this.setDataDef(dataDef);
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
			text = Strings.firstToUpper(this.getName());

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

	private String getDataClassName() {
		return element.getEType().getInstanceClassName();
	}
}