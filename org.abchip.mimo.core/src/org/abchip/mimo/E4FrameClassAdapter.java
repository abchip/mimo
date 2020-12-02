/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.FrameImpl;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.log.Logger;

public class E4FrameClassAdapter<E extends Entity> extends FrameImpl<E> implements Adapter {

	private static final Logger LOGGER = Logs.getLogger(E4FrameClassAdapter.class);

	private EClass eClass;
	private Map<String, Slot> slots = null;
	protected Notifier target = null;

	public E4FrameClassAdapter(Frame<? super E> ako, EClass eClass) {
		super();

		eClass.eAdapters().add(this);

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
					if (slotKey.getEStructuralFeature().eContainer().equals(eClass))
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

		this.slots = new HashMap<String, Slot>();
		for (Slot slot : getSlots())
			this.slots.put(slot.getName(), slot);
	}

	@Override
	public EClass getEClassifier() {
		return eClass;
	}

	@Override
	public String toString() {
		return super.toString();
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
	public java.net.URI getURI() {
		if (eResource() != null)
			return super.getURI();
		else
			return java.net.URI.create(EcoreUtil.getURI(eClass).toString());
	}

	private void setFrameText() {

		String text = Strings.firstToUpper(this.getName());

		if (text != null)
			eSet(EntityPackage.FRAME__TEXT, text);
	}

	public boolean isAdapterForType(Object type) {
		return false;
	}

	public void notifyChanged(Notification msg) {
		msg.toString();
	}

	public Notifier getTarget() {
		return target;
	}

	public void setTarget(Notifier newTarget) {
		target = newTarget;
	}
}