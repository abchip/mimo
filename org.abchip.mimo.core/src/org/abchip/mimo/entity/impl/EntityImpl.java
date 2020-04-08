/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity.impl;

import java.util.List;

import org.abchip.mimo.EMFFrameClassAdapter;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.util.Frames;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Object</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY;
	}

	@Override
	public String toString() {

		Frame<?> isa = this.isa();
		StringBuilder result = new StringBuilder(isa.getName());

		if (eIsProxy()) {
			result.append(" (eProxyURI: ");
			result.append(eProxyURI());
			if (eDynamicClass() != null) {
				result.append(" eClass: ");
				result.append(eDynamicClass());
			}
			result.append(')');
		} else if (eDynamicClass() != null) {
			result.append(" (eClass: ");
			result.append(eDynamicClass());
			result.append(')');
		} else {
			result.append('(');

			boolean first = true;
			for (Slot slot : isa.getSlots()) {
				if (slot.isDerived())
					continue;

				Object value = isa.getValue(this, slot.getName(), false, false);
				if (value == null)
					continue;

				if (isa.isHasToString() && !slot.isToString())
					continue;

				if (value instanceof List<?>) {
					List<?> listValue = (List<?>) value;
					if (listValue.isEmpty())
						continue;

					if (!first)
						result.append(", ");

					if (listValue.size() > 3)
						result.append(slot.getName() + ": " + listValue.subList(0, 2));
					else
						result.append(slot.getName() + ": " + listValue);
				} else {

					if (!first)
						result.append(", ");

					result.append(slot.getName() + ": " + value);
				}

				first = false;
			}

			result.append(')');
		}

		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings({ "unchecked" })
	@Override
	public <E extends Entity> Frame<E> isa() {
		Frame<E> isa = (Frame<E>) Frames.getFrames().get(eClass().getName());
		if (isa != null)
			return isa;

		isa = (Frame<E>) new EMFFrameClassAdapter<Frame<E>>(null, eClass());
		return isa;
	}

} // EntityImpl
