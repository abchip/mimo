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

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.FrameImpl;
import org.eclipse.emf.ecore.EEnum;

public class EMFFrameEnumAdapter<E extends Entity> extends FrameImpl<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EEnum eEnum;

	public EMFFrameEnumAdapter(EEnum eEnum) {
		super();

		this.eEnum = eEnum;
		this.enum_ = true;

		eSet(EntityPackage.FRAME__NAME, this.eEnum.getName());

		this.setFrameText();
	}

	@Override
	public Frame<? super E> ako() {
		return null;
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
	public Object getValue(Entity entity, String slotName, boolean default_, boolean resolve) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setValue(Entity entity, String slot, Object value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public URI getURI() {
		return super.getURI();
		// return URI.create(EcoreUtil.getURI(eEnum).toString());
	}

	@Override
	public E createEntity() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getPackageName() {
		System.out.println(eEnum);
		return null;
	}

	private void setFrameText() {

		String text = MimoUtils.firstToUpper(this.getName());

		if (text != null)
			eSet(EntityPackage.FRAME__TEXT, text);
	}
}