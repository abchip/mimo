/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import org.abchip.mimo.entity.Cardinality;
import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Cardinality</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.impl.CardinalityImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.CardinalityImpl#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CardinalityImpl extends EntityImpl implements Cardinality {
	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.CARDINALITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.CARDINALITY__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.CARDINALITY__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMandatory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiple() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.CARDINALITY__MAX:
				return getMax();
			case EntityPackage.CARDINALITY__MIN:
				return getMin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.CARDINALITY__MAX:
				setMax((Integer)newValue);
				return;
			case EntityPackage.CARDINALITY__MIN:
				setMin((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityPackage.CARDINALITY__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case EntityPackage.CARDINALITY__MIN:
				setMin(MIN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityPackage.CARDINALITY__MAX:
				return max != MAX_EDEFAULT;
			case EntityPackage.CARDINALITY__MIN:
				return min != MIN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (max: ");
		result.append(max);
		result.append(", min: ");
		result.append(min);
		result.append(')');
		return result.toString();
	}

} // CardinalityImpl
