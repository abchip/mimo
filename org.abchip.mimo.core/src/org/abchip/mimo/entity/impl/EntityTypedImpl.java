/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import java.util.Map.Entry;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.EntityType;
import org.abchip.mimo.entity.EntityTyped;
import org.abchip.mimo.entity.Frame;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Typed</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityTypedImpl<T extends EntityType<?>> extends EntityIdentifiableImpl implements EntityTyped<T> {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY_TYPED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void init(Context context) {

		EAnnotation eTypeAnnotation = this.eClass().getEAnnotation(Frame.NS_PREFIX_FRAME_TYPE);
		if (eTypeAnnotation == null)
			return;

		assert eTypeAnnotation.getDetails().size() == 1;

		for (Entry<String, String> constraint : eTypeAnnotation.getDetails().entrySet()) {
			try {
				EStructuralFeature eFeature = this.eClass().getEStructuralFeature(constraint.getKey());
				eSet(context, eFeature, constraint.getValue());
			} catch (Exception e) {
				e.toString();
			}

			break;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T getType() {

		EAnnotation eTypeAnnotation = this.eClass().getEAnnotation(Frame.NS_PREFIX_FRAME_TYPE);
		if (eTypeAnnotation == null)
			return null;

		assert eTypeAnnotation.getDetails().size() == 1;

		for (Entry<String, String> constraint : eTypeAnnotation.getDetails().entrySet()) {
			EStructuralFeature eFeature = this.eClass().getEStructuralFeature(constraint.getKey());
			return (T) eGet(eFeature);
		}
		
		return null;
	}
} // EntityTypedImpl
