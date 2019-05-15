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

import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.FrameImpl;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFFrameAdapter<E extends Entity> extends FrameImpl<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EClass eClass;

	public EMFFrameAdapter(EClass eClass) {
		super();

		this.eClass = eClass;

		this.name = this.eClass.getName();
		
		this.abstract_ = eClass.isAbstract();

		for (Frame<?> superFrame : getSuperFrames())
			getSuperNames().add(superFrame.getName());

		EAnnotation eTextAnnotation = eClass.getEAnnotation(Frame.NS_PREFIX_FRAME);
		if (eTextAnnotation != null) {
			String formula = eTextAnnotation.getDetails().get("formula");
			if(formula != null)
				this.textFormula = formula;
		}

		// load features
		for (EStructuralFeature structuralFeature : eClass.getEAllStructuralFeatures()) {
			Slot slot = new EMFSlotAdapter(structuralFeature);		
			this.getSlots().add(slot);
			// set keys
			if(slot.isKey())
				this.getKeys().add(slot.getName());
		}

		// load operations
		for (EOperation operation : eClass.getEAllOperations()) {

			EAnnotation eAnnotation = operation.getEAnnotation(Slot.NS_PREFIX_SLOT);
			if (eAnnotation == null)
				continue;

			// other operation
			this.getSlots().add(new EMFSlotAdapter(operation));
		}
		
	}

	@Override
	public String getResource() {
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Frame<?> ako() {

		EList<EClass> classes = this.eClass.getESuperTypes();
		if (classes == null || classes.isEmpty())
			return null;

		EClass eAko = classes.get(0);
		return new EMFFrameAdapter(eAko);
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
	public Object getValue(E entity, String slotName) {

		if (entity instanceof EObject)
			return getValue((EObject) entity, slotName);
		else
			return getValue((Object) entity, slotName);
	}

	@Override
	public void unsetValue(E entity, Slot slot) {
		if (entity instanceof EObject)
			unsetValue((EObject) entity, slot);
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
			if (method != null) {
				value = method.invoke(object, new Object[] {});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	private void unsetValue(EObject eObject, Slot slot) {

		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(slot.getName());
		if (eStructuralFeature != null)
			eObject.eUnset(eStructuralFeature);
	}

	@Override
	public URI getURI() {
		return URI.create(EcoreUtil.getURI(eClass).toString());
	}

	@SuppressWarnings("unchecked")
	@Override
	public Class<E> getEntityClass() {
		return (Class<E>) eClass.getInstanceClass();
	}

	@Override
	public List<Frame<?>> getSuperFrames() {

		List<Frame<?>> frames = new ArrayList<Frame<?>>();
		addFrames(this, frames);

		return frames;
	}

	private void addFrames(Frame<?> frame, List<Frame<?>> frames) {
		Frame<?> ako = frame.ako();
		if (ako != null) {
			frames.add(ako);
			addFrames(ako, frames);
		}
	}
}