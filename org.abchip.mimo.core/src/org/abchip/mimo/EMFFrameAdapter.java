/**
 *  Copyright (c) 2017, 2018 ABChip and others.
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
import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFFrameAdapter<E extends Entity> extends EntityImpl implements Frame<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EClass eClass;
	private List<Slot> slots;

	private static final String nsPrefix = "il-data";

	public EMFFrameAdapter(EClass eClass) {
		super();
		this.eClass = eClass;
	}

	@Override
	public String getName() {
		return this.eClass.getName();
	}

	@Override
	public String getResource() {
		return null;
	}

	@Override
	public List<Slot> getSlots() {

		if (this.slots == null)
			synchronized (this) {
				if (slots == null) {
					this.slots = new ArrayList<Slot>();

					for (EStructuralFeature structuralFeature : eClass.getEAllStructuralFeatures())
						this.slots.add(new EMFSlotAdapter(structuralFeature));

					for (EOperation operation : eClass.getEAllOperations()) {

						EAnnotation eAnnotation = operation.getEAnnotation(nsPrefix);
						if (eAnnotation == null)
							continue;

						if (operation.getName().length() > 3 && operation.getName().startsWith("get") && operation.getEParameters().isEmpty()) {
							String name = operation.getName().substring(3);
							name = Strings.qINSTANCE.firstToLower(name);
							this.slots.add(new EMFSlotAdapter(operation, name));

							continue;
						}

						this.slots.add(new EMFSlotAdapter(operation));
					}
				}
			}

		return this.slots;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Frame<?> ako() {

		EClass eAko = this.eClass.getESuperTypes().get(0);
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
	public Object getValue(E entity, Slot slot) {

		if (entity instanceof EObject)
			return getValue((EObject) entity, slot);
		else
			return getValue((Object) entity, slot);
	}

	private Object getValue(EObject eObject, Slot slot) {
		Object value = null;

		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(slot.getName());
		if (eStructuralFeature != null)
			value = eObject.eGet(eStructuralFeature);
		else {
			value = getValue((Object) eObject, slot);
		}

		return value;
	}

	private Object getValue(Object object, Slot slot) {
		Object value = null;

		try {
			String methodName = null;
			if (slot.getName().startsWith("is"))
				methodName = slot.getName();
			else
				methodName = "get" + Strings.qINSTANCE.firstToUpper(slot.getName());
			Method method = object.getClass().getMethod(methodName, new Class[] {});
			if (method != null) {
				value = method.invoke(object, new Object[] {});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	@Override
	public URI getURI() {
		return URI.create(EcoreUtil.getURI(eClass).toString());
	}

	@Override
	public boolean isAbstract() {
		return eClass.isAbstract();
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
	
	private void addFrames(Frame<?> frame, List<Frame<?>>frames) {
		if(frame.ako() != null)
			frames.add(frame.ako());
	}	
}