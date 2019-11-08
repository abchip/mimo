/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.net.URI;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityEnum;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.FrameImpl;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFFrameEnumAdapter<E extends Entity> extends FrameImpl<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EEnum eEnum;

	public EMFFrameEnumAdapter(EEnum eEnum) {
		super();

		this.eEnum = eEnum;

		this.name = this.eEnum.getName();

		EAnnotation eTextAnnotation = eEnum.getEAnnotation(Frame.NS_PREFIX_FRAME);
		if (eTextAnnotation != null) {
			String formula = eTextAnnotation.getDetails().get("formula");
			if(formula != null)
				this.textFormula = formula;
		}
	}

	@Override
	public String getResource() {
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Frame<? super E> ako() {
		Frame<? super E> akoFrame = (Frame<? super E>) EMFFrameHelper.getFrames().get(EntityEnum.class.getSimpleName());
		if (akoFrame != null)
			return akoFrame;
		else
			return new EMFFrameClassAdapter(EntityPackage.eINSTANCE.getEntityEnum());

	}

	protected EEnum getEEnum() {
		return this.eEnum;
	}

	@Override
	public String toString() {
		return eEnum.toString();
	}

	@Override
	public Slot getSlot(String name) {

		for (Slot slot : getSlots())
			if (slot.getName().equals(name))
				return slot;

		return null;
	}

	@Override
	public Object getValue(Entity entity, String slotName, boolean resolve) {
		return null;
	}

	@Override
	public void setValue(Entity entity, String slot, Object value) {
	}

	@Override
	public URI getURI() {
		return URI.create(EcoreUtil.getURI(eEnum).toString());
	}
}