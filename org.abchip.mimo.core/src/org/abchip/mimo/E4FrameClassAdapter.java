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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.FrameImpl;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.common.util.URI;
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

public class E4FrameClassAdapter<E extends Entity> extends FrameImpl<E> {

	private static final Logger LOGGER = Logs.getLogger(E4FrameClassAdapter.class);

	private EClass eClass;
	private Map<String, Slot> slots = null;

	public E4FrameClassAdapter(Frame<? super E> ako, EClass eClass) {
		super();

		this.ako = ako;
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

			Slot slot = new E4SlotAdapter(this, structuralFeature);

			if (slot.getDataDef() == null) {
				LOGGER.warn("Invalid conversion slot {} for frame {}", slot.getName(), this.getName());
				continue;
			}

			// set keys
			if (slot.isKey()) {
				Slot relativeKey = null;
				for (String keyName : keys) {
					E4SlotAdapter slotKey = (E4SlotAdapter) this.getSlot(keyName);
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
			this.getSlots().add(new E4SlotAdapter(this, operation));
		}

		this.slots = new HashMap<String, Slot>();
		for (Slot slot : getSlots())
			this.slots.put(slot.getName(), slot);
	}

	@Override
	public EClass getEClass() {
		return eClass;
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
	public Object getValue(E entity, String slotName, boolean default_, boolean resolve) {

		if (entity instanceof EObject)
			return getValue((EObject) entity, slotName, default_, resolve);
		else
			return getValue((Object) entity, slotName, default_, resolve);
	}

	@Override
	public void setValue(E entity, String slot, Object value) {

		EStructuralFeature eFeature = eClass.getEStructuralFeature(slot);
		if (eFeature == null)
			return;

		EObject eObject = (EObject) entity;

		if (value == null) {
			eObject.eUnset(eFeature);
			return;
		}

		URI uri = EcoreUtil.getURI(eObject);
		String tenant = uri.authority();
		try {
			if (eFeature.isMany()) {
				List<Object> values = new ArrayList<Object>();
				for (Object object : (Collection<?>) value)
					values.add(buildValue(entity, tenant, eFeature, object));
				eObject.eSet(eFeature, values);
			} else {
				Object object = buildValue(entity, tenant, eFeature, value);
				eObject.eSet(eFeature, object);
			}
		} catch (Exception e) {
			if (eFeature.getEType() instanceof EDataType) {
				value = EcoreUtil.createFromString((EDataType) eFeature.getEType(), value.toString());
				eObject.eSet(eFeature, value);
			}
		}
	}

	private Object getValue(EObject eObject, String slotName, boolean default_, boolean resolve) {
		Object value = null;

		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(slotName);
		if (eStructuralFeature != null)
			value = eObject.eGet(eStructuralFeature, resolve);
		else {
			value = getValue((Object) eObject, slotName, default_, resolve);
		}

		if (value == null && default_)
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

	private Object buildValue(Entity entity, String tenant, EStructuralFeature eFeature, Object value) {

		Object object = null;

		if (eFeature instanceof EReference) {
			if (value instanceof EntityIdentifiable) {
				EntityIdentifiable entityIdentifiable = (EntityIdentifiable) value;
				object = entityIdentifiable;
			} else {
				EReference eReference = (EReference) eFeature;
				EClassifier eClassifier = eReference.getEType();

				if (entity.getResource() != null) {
					Context context = entity.getResource().getContext();

					@SuppressWarnings("unchecked")
					Frame<EntityIdentifiable> frameRef = (Frame<EntityIdentifiable>) context.createProxy(Frame.class, eClassifier.getName());
					if (frameRef != null) {
						object = context.createProxy(frameRef, value.toString(), tenant);
					} else
						LOGGER.warn("Unexpected condition {}", "bvtw4a87ny4r9tycsa9et6");
				} else
					LOGGER.warn("Unexpected condition {}", "bwytn56wn086b7");
			}

		} else
			object = value;

		return object;
	}

	@Override
	public java.net.URI getURI() {
		if (eResource() != null)
			return super.getURI();
		else
			return java.net.URI.create(EcoreUtil.getURI(eClass).toString());
	}

	@Override
	public String getPackageName() {

		EPackage ePackage = eClass.getEPackage();
		String packageName = ePackage.getNsPrefix().replaceAll("-", ".");
		return packageName;
	}

	private void setFrameText() {

		String text = Strings.firstToUpper(this.getName());

		if (text != null)
			eSet(EntityPackage.FRAME__TEXT, text);
	}
}