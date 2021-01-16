/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity.impl;

import java.util.List;

import org.abchip.mimo.E4FrameClassAdapter;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Object</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {

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
		return stringValue();
	}

	private <E extends Entity> String stringValue() {

		Frame<E> isa = this.isa();
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
				if ("info".equals(slot.getGroup()))
					continue;
				if (!this.eIsSet(slot))
					continue;

				Object value = this.eGet(slot, false, false);
				if (value == null)
					continue;

				if (isa.isHasToString() && !slot.isToString())
					continue;

				if (!first)
					result.append(", ");

				if (value instanceof List<?>) {
					List<?> listValue = (List<?>) value;
					// if (listValue.size() > 3)
					// result.append(slot.getName() + ": " + listValue.subList(0, 2));
					// else
					result.append(slot.getName() + ": " + listValue);
				} else if (value instanceof EntityIdentifiable) {
					EntityIdentifiable valueIdentifiable = (EntityIdentifiable) value;
					result.append(slot.getName() + ": " + valueIdentifiable.getID());
				} else {
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
	@SuppressWarnings("unchecked")
	@Override
	public <E extends Entity> Frame<E> isa() {
		for (Adapter adapter : eClass().eAdapters()) {
			if (adapter instanceof E4FrameClassAdapter)
				return (Frame<E>) adapter;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eSet(Slot slot, Object value) {

		EStructuralFeature eFeature = slot.getEStructuralFeature();
		if (eFeature == null)
			return;

		this.eSet(eFeature, value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object eGet(Slot slot, boolean default_, boolean resolve) {
		Object value = null;

		EStructuralFeature eStructuralFeature = slot.getEStructuralFeature();
		if (eStructuralFeature == null)
			return null;

		value = this.eGet(eStructuralFeature, resolve);

		if (value == null && default_)
			value = eStructuralFeature.getDefaultValue();

		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(Slot slot) {
		EStructuralFeature eStructuralFeature = slot.getEStructuralFeature();
		if (eStructuralFeature == null)
			return false;
		
		return this.eIsSet(eStructuralFeature);
	}
} // EntityImpl
