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

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.entity.impl.FrameImpl;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;

public class E4FrameEnumAdapter<E extends Entity> extends FrameImpl<E> {

	private EEnum eEnum;

	public E4FrameEnumAdapter(EEnum eEnum) {
		super();

		this.eEnum = eEnum;
		this.enum_ = true;

		eSet(EntityPackage.FRAME__NAME, this.eEnum.getName());

		this.setFrameText();
	}

	public EEnum getEEnum() {
		return this.eEnum;
	}

	@Override
	public String toString() {
		return eEnum.toString();
	}

	@Override
	public Slot getSlot(String name) {

		for (Slot slot : getAllSlots())
			if (slot.getName().equals(name))
				return slot;

		return null;
	}

	@Override
	public URI getURI() {
		return super.getURI();
		// return URI.create(EcoreUtil.getURI(eEnum).toString());
	}

	private void setFrameText() {

		String text = Strings.firstToUpper(this.getName());

		if (text != null)
			eSet(EntityPackage.FRAME__TEXT, text);
	}

	@Override
	public EClassifier getEClassifier() {
		return eEnum;
	}
}