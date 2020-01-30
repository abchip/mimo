/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.impl;

import org.abchip.mimo.entity.impl.EntityImpl;

import org.abchip.mimo.ui.UIPackage;
import org.abchip.mimo.ui.ViewNumberAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Number Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.impl.ViewNumberAttributeImpl#getMaxlength <em>Maxlength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewNumberAttributeImpl extends EntityImpl implements ViewNumberAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxlength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXLENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxlength()
	 * @generated
	 * @ordered
	 */
	protected int maxlength = MAXLENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewNumberAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UIPackage.Literals.VIEW_NUMBER_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxlength() {
		return maxlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxlength(int newMaxlength) {
		int oldMaxlength = maxlength;
		maxlength = newMaxlength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.VIEW_NUMBER_ATTRIBUTE__MAXLENGTH, oldMaxlength, maxlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UIPackage.VIEW_NUMBER_ATTRIBUTE__MAXLENGTH:
				return getMaxlength();
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
			case UIPackage.VIEW_NUMBER_ATTRIBUTE__MAXLENGTH:
				setMaxlength((Integer)newValue);
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
			case UIPackage.VIEW_NUMBER_ATTRIBUTE__MAXLENGTH:
				setMaxlength(MAXLENGTH_EDEFAULT);
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
			case UIPackage.VIEW_NUMBER_ATTRIBUTE__MAXLENGTH:
				return maxlength != MAXLENGTH_EDEFAULT;
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
		result.append(" (maxlength: ");
		result.append(maxlength);
		result.append(')');
		return result.toString();
	}

} //ViewNumberAttributeImpl
