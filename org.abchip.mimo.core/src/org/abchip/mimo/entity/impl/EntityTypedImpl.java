/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import java.util.Map.Entry;

import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.EntityType;
import org.abchip.mimo.entity.EntityTyped;
import org.abchip.mimo.entity.Frame;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityTypedImpl<T extends EntityType<?>> extends EntityIdentifiableImpl implements EntityTyped<T> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EntityTypedImpl() {
		super();
				
		EAnnotation eFrameAnnotation = this.eClass().getEAnnotation(Frame.NS_PREFIX_FRAME_CONSTRAINTS);
		if (eFrameAnnotation == null) 
			return;

		for(Entry<String, String> constraint: eFrameAnnotation.getDetails().entrySet()) {
			try {
				EStructuralFeature eFeature = this.eClass().getEStructuralFeature(constraint.getKey());
				if(eFeature == null)
					"".toString();
				eSet(eFeature, constraint.getValue());
			}
			catch(Exception e) {
				e.toString();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY_TYPED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T getType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //EntityTypedImpl
