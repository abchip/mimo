/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.FrameImpl;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFFrameClassAdapter<E extends Entity> extends FrameImpl<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EClass eClass;

	public EMFFrameClassAdapter(EClass eClass) {
		super();

		this.eClass = eClass;

		this.name = this.eClass.getName();

		this.abstract_ = eClass.isAbstract();

		for (Frame<?> superFrame : getSuperFrames())
			getSuperNames().add(superFrame.getName());

		// TODO super
		EAnnotation eFrameAnnotation = eClass.getEAnnotation(Frame.NS_PREFIX_FRAME);
		if (eFrameAnnotation != null) {
			String formula = eFrameAnnotation.getDetails().get("formula");
			if (formula != null)
				this.textFormula = formula;
			String autoIncrement = eFrameAnnotation.getDetails().get("autoIncrement");
			if (autoIncrement != null)
				this.autoIncrement = Boolean.parseBoolean(autoIncrement);
		}

		List<String> keys = new ArrayList<String>();

		// load features
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
					Lists.qINSTANCE.addFirst(keys, slot.getName());
					Lists.qINSTANCE.addFirst(this.getSlots(), slot);
				} else {
					Lists.qINSTANCE.addAfter(keys, relativeKey.getName(), slot.getName());
					Lists.qINSTANCE.addAfter(this.getSlots(), relativeKey, slot);
				}
			} else
				this.getSlots().add(slot);
		}

		this.slotsNumber = this.getSlots().size();

		this.getKeys().addAll(keys);

		// load operations
		for (EOperation operation : eClass.getEAllOperations()) {

			EAnnotation eAnnotation = operation.getEAnnotation(Slot.NS_PREFIX_SLOT);
			if (eAnnotation == null)
				continue;

			// other operation
			this.getSlots().add(new EMFSlotAdapter(this, operation));
		}

		this.routesNumber = this.getSlots().size() - this.slotsNumber;
	}

	@Override
	public String getResource() {
		return "emf";
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Frame<? super E> ako() {

		EList<EClass> classes = this.eClass.getESuperTypes();
		if (classes == null || classes.isEmpty())
			return null;

		EClass eAko = classes.get(0);
		Frame<? super E> akoFrame = (Frame<? super E>) EMFFrameHelper.getFrames().get(eAko.getName());
		if (akoFrame != null)
			return akoFrame;
		else
			return new EMFFrameClassAdapter(eAko);
	}

	public EClass getEClass() {
		return this.eClass;
	}

	@Override
	public String toString() {
		return eClass.toString();
	}

	@Override
	public Slot getSlot(String name) {

		for (Slot slot : getSlots())
			if (slot.getName().equals(name))
				return slot;

		return null;
	}

	@Override
	public Object getValue(Entity entity, String slotName) {

		if (entity instanceof EObject)
			return getValue((EObject) entity, slotName);
		else
			return getValue((Object) entity, slotName);
	}

	@Override
	public void setValue(Entity entity, String slot, Object value) {
		if (entity instanceof EObject)
			setValue((EObject) entity, slot, value);
	}

	private Object getValue(EObject eObject, String slotName) {
		Object value = null;

		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(slotName);
		if (eStructuralFeature != null)
			value = eObject.eGet(eStructuralFeature);
		else {
			value = getValue((Object) eObject, slotName);
		}

		return value;
	}

	private Object getValue(Object object, String slotName) {
		Object value = null;

		try {
			String methodName = null;
			if (slotName.startsWith("is"))
				methodName = slotName;
			else
				methodName = "get" + Strings.qINSTANCE.firstToUpper(slotName);
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
			EReference eReference = (EReference)eFeature;
			EClassifier eClassifier = eReference.getEType();
			if(eClassifier instanceof EClass) {
				EClass eClass = (EClass)eClassifier;
				InternalEObject eValue = (InternalEObject) EcoreUtil.create(eClass);
				eValue.eSetProxyURI(org.eclipse.emf.common.util.URI.createURI(value.toString()));
				if(eValue instanceof EntityNameable) {
					Entity entity = (Entity)eValue;
					Frame<?> domainFrame = entity.isa();
					for(String key: domainFrame.getKeys()) {
						domainFrame.setValue(entity, key, value.toString());
						break;
					}					
				}
				eObject.eSet(eFeature, eValue);
			}
			else
				"".toString();
		} else {
			try {
				eObject.eSet(eFeature, value);
			} catch (ClassCastException e) {
				if (eFeature.getEType() instanceof EDataType) {
					value = EcoreUtil.createFromString((EDataType) eFeature.getEType(), value.toString());
					eObject.eSet(eFeature, value);
				}
			} catch (Exception e) {
				e.toString();
			}
		}
	}

	@Override
	public URI getURI() {
		return URI.create(EcoreUtil.getURI(eClass).toString());
	}
}