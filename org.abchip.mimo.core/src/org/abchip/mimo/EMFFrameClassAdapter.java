/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.FrameImpl;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.log.Logger;

public class EMFFrameClassAdapter<E extends Entity> extends FrameImpl<E> {

	private static final Logger LOGGER = Logs.getLogger(EMFFrameClassAdapter.class);
	
	private static final long serialVersionUID = 1L;
	private EClass eClass;
	private Map<String, Slot> slots = null;

	private Map<String, E> entities = null;

	public EMFFrameClassAdapter(Map<String, E> entities, EClass eClass) {
		super();

		this.entities = entities;
		this.eClass = eClass;

		eSet(EntityPackage.FRAME__NAME, this.eClass.getName());
		eSet(EntityPackage.FRAME__ABSTRACT, eClass.isAbstract());

		this.setFrameText();

		for (Frame<?> superFrame : getSuperFrames())
			getSuperNames().add(superFrame.getName());

		// TODO super
		EAnnotation eFrameAnnotation = eClass.getEAnnotation(Frame.NS_PREFIX_FRAME);
		if (eFrameAnnotation != null) {
			String formula = eFrameAnnotation.getDetails().get("formula");
			if (formula != null)
				eSet(EntityPackage.FRAME__TEXT_FORMULA, formula);
			String autoIncrement = eFrameAnnotation.getDetails().get("autoIncrement");
			if (autoIncrement != null)
				eSet(EntityPackage.FRAME__AUTO_INCREMENT, Boolean.parseBoolean(autoIncrement));
		}

		List<String> keys = new ArrayList<String>();

		// load features
		boolean hasToString = false;
		for (EStructuralFeature structuralFeature : eClass.getEAllStructuralFeatures()) {

			Slot slot = new EMFSlotAdapter(this, structuralFeature);

			// set keys
			if (slot.isKey()) {
				Slot relativeKey = null;
				for (String keyName : keys) {
					EMFSlotAdapter slotKey = (EMFSlotAdapter) this.getSlot(keyName);
					if (slotKey.getETypedElement().eContainer().equals(eClass))
						relativeKey = slotKey;
				}

				if (relativeKey == null) {
					Lists.addFirst(keys, slot.getName());
					Lists.addFirst(this.getSlots(), slot);
				} else {
					Lists.addAfter(keys, relativeKey.getName(), slot.getName());
					Lists.addAfter(this.getSlots(), relativeKey, slot);
				}
			} else
				this.getSlots().add(slot);

			if (slot.isToString())
				hasToString = true;
		}

		if (hasToString)
			eSet(EntityPackage.FRAME__HAS_TO_STRING, true);

		this.getKeys().addAll(keys);

		// load operations
		for (EOperation operation : eClass.getEAllOperations()) {

			EAnnotation eAnnotation = operation.getEAnnotation(Slot.NS_PREFIX_SLOT);
			if (eAnnotation == null)
				continue;

			// other operation
			this.getSlots().add(new EMFSlotAdapter(this, operation));
		}

		this.slots = new HashMap<String, Slot>();
		for (Slot slot : getSlots())
			this.slots.put(slot.getName(), slot);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Frame<? super E> ako() {

		EList<EClass> classes = this.eClass.getESuperTypes();
		if (classes == null || classes.isEmpty())
			return null;

		EClass eAko = classes.get(0);
		Frame<? super E> akoFrame = null;

		if (this.entities != null) {
			akoFrame = (Frame<? super E>) this.entities.get(eAko.getName());
			if (akoFrame != null)
				return akoFrame;
		}

		akoFrame = new EMFFrameClassAdapter(this.entities, eAko);
		if (this.entities != null)
			this.entities.put(eAko.getName(), (E) akoFrame);

		return akoFrame;
	}

	@Override
	public String toString() {
		return eClass.toString();
	}

	@Override
	public Slot getSlot(String name) {

		if (this.slots != null)
			return this.slots.get(name);

		for (Slot slot : getSlots())
			if (slot.getName().equals(name))
				return slot;

		return null;
	}

	@Override
	public Object getValue(Entity entity, String slotName, boolean default_, boolean resolve) {

		if (entity instanceof EObject)
			return getValue((EObject) entity, slotName, default_, resolve);
		else
			return getValue((Object) entity, slotName, default_, resolve);
	}

	@Override
	public void setValue(Entity entity, String slot, Object value) {
		if (entity instanceof EObject)
			setValue((EObject) entity, slot, value);
	}

	private Object getValue(EObject eObject, String slotName, boolean default_, boolean resolve) {
		Object value = null;

		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(slotName);
		if (eStructuralFeature != null)
			value = eObject.eGet(eStructuralFeature, resolve);
		else {
			value = getValue((Object) eObject, slotName, default_, resolve);
		}

		if(value == null && default_)
			value = eStructuralFeature.getDefaultValue();
		
		return value;
	}

	private Object getValue(Object object, String slotName, boolean default_, boolean resolve) {
		Object value = null;

		try {
			String methodName = null;
			if (slotName.startsWith("is"))
				methodName = slotName;
			else if (slotName.startsWith("get"))
				methodName = slotName;
			else
				methodName = "get" + Strings.firstToUpper(slotName);
			Method method = object.getClass().getMethod(methodName, new Class[] {});
			if (method != null)
				value = method.invoke(object, new Object[] {});
		} catch (NoSuchMethodException e) {
			e.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	private void setValue(EObject eObject, String slot, Object value) {

		EStructuralFeature eFeature = eClass.getEStructuralFeature(slot);
		if (eFeature == null)
			return;

		if (value == null) {
			eObject.eUnset(eFeature);
			return;
		}

		if (eFeature instanceof EReference) {
			if (value instanceof EntityIdentifiable) {
				EntityIdentifiable entityIdentifiable = (EntityIdentifiable) value;
				eObject.eSet(eFeature, entityIdentifiable);
			} else {
				EReference eReference = (EReference) eFeature;
				EClassifier eClassifier = eReference.getEType();
				Frame<?> frameRef = (Frame<?>) this.entities.get(eClassifier.getName());
				if (frameRef != null) {
					Entity entity = frameRef.createProxy(value.toString());
					if (entity != null)
						eObject.eSet(eFeature, entity);
				} else
					LOGGER.warn("Unexpected condition {}", "bvtw4a87ny4r9tycsa9et6");
			}

		} else {
			try {
				eObject.eSet(eFeature, value);
			} catch (ClassCastException e) {
				try {
					if (eFeature.getEType() instanceof EDataType) {
						value = EcoreUtil.createFromString((EDataType) eFeature.getEType(), value.toString());
						eObject.eSet(eFeature, value);
					}
				} catch (Exception e1) {
					LOGGER.error(e.getMessage());
				}
			} catch (Exception e) {
				e.toString();
			}
		}
	}

	@Override
	public java.net.URI getURI() {
		if(eResource() != null)
			return super.getURI();
		else
			return java.net.URI.create(EcoreUtil.getURI(eClass).toString());
	}

	@SuppressWarnings("unchecked")
	@Override
	public E createEntity() {
		return (E) EcoreUtil.create(eClass);
	}

	@Override
	public String getPackageName() {

		StringBuffer sb = new StringBuffer();
		EPackage ePackage = eClass.getEPackage();
		while (ePackage != null) {
			if (sb.length() == 0)
				sb.insert(0, ePackage.getName());
			else
				sb.insert(0, ePackage.getName() + ".");

			ePackage = ePackage.getESuperPackage();
		}

		return sb.toString();
	}

	private void setFrameText() {

		String text = Strings.firstToUpper(this.getName());

		if (text != null)
			eSet(EntityPackage.FRAME__TEXT, text);
	}
}