/**
 *  Copyright (c) 2017, 2021 ABChip and others.
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
import org.abchip.mimo.data.ObjectDef;
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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class E4SlotAdapter extends SlotImpl {

	private EStructuralFeature feature;

	public E4SlotAdapter(Frame<?> frame, EStructuralFeature feature) {
		this.feature = feature;

		eSet(EntityPackage.SLOT__NAME, feature.getName());

		EStructuralFeature eStructuralFeature = ((EStructuralFeature) feature);
		eSet(EntityPackage.SLOT__DEFAULT_VALUE, eStructuralFeature.getDefaultValueLiteral());
		eSet(EntityPackage.SLOT__DERIVED, eStructuralFeature.isDerived());
		eSet(EntityPackage.SLOT__TRANSIENT, eStructuralFeature.isTransient());

		this.setSlotText(frame);

		eSet(EntityPackage.SLOT__CARDINALITY, new E4CardinalityAdapter(feature));

		if (feature instanceof EAttribute)
			eSet(EntityPackage.SLOT__KEY, ((EAttribute) feature).isID());

		EAnnotation eAnnotation = feature.getEAnnotation(Slot.NS_PREFIX_SLOT);
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

		this.setSlotDomain();
	}

	private void setSlotDataDef() {

		Class<?> klass = feature.getEType().getInstanceClass();

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
		} else if (klass == Object.class) {
			ObjectDef objectDef = DataFactory.eINSTANCE.createObjectDef();
			dataDef = objectDef;
		} else if (klass == byte[].class) {
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
		} else if (feature.getEType() instanceof EEnum) {
			@SuppressWarnings("rawtypes")
			EnumDef enumDef = DataFactory.eINSTANCE.createEnumDef();
			enumDef.setEnum((EEnum) feature.getEType());
			dataDef = enumDef;
		} else if (this.getDataClassName().equals(String.class.getCanonicalName()) || this.getDataClassName().equals(char.class.getCanonicalName())
				|| this.getDataClassName().equals(URI.class.getCanonicalName()) || EntityIdentifiable.class.isAssignableFrom(feature.getEType().getInstanceClass())) {
			StringDef stringDef = DataFactory.eINSTANCE.createStringDef();
			dataDef = stringDef;
		}

		this.setDataDef(dataDef);
	}

	@Override
	public String toString() {
		return this.feature.toString();
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
		if (feature instanceof EReference) {
			domain = EntityFactory.eINSTANCE.createDomain();
			domain.setFrame(feature.getEType().getName());

			if (((EReference) feature).isContainment())
				eSet(EntityPackage.SLOT__CONTAINMENT, true);
		}
		// enum
		else if (feature.getEType() instanceof EEnum) {
			domain = EntityFactory.eINSTANCE.createDomain();
			domain.setFrame(feature.getEType().getName());
		}

		if (domain != null)
			eSet(EntityPackage.SLOT__DOMAIN, domain);
	}

	private String getDataClassName() {
		return feature.getEType().getInstanceClassName();
	}

	@Override
	public EStructuralFeature getEStructuralFeature() {
		return feature;
	}
}