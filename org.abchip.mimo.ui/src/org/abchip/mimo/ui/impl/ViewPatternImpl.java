/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.impl;

import org.abchip.mimo.entity.impl.EntityImpl;

import org.abchip.mimo.ui.UIPackage;
import org.abchip.mimo.ui.ViewPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.impl.ViewPatternImpl#getAllow <em>Allow</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.impl.ViewPatternImpl#getMask <em>Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewPatternImpl extends EntityImpl implements ViewPattern {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getAllow() <em>Allow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllow()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllow() <em>Allow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllow()
	 * @generated
	 * @ordered
	 */
	protected String allow = ALLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final String MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected String mask = MASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UIPackage.Literals.VIEW_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllow() {
		return allow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllow(String newAllow) {
		String oldAllow = allow;
		allow = newAllow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.VIEW_PATTERN__ALLOW, oldAllow, allow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMask(String newMask) {
		String oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.VIEW_PATTERN__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UIPackage.VIEW_PATTERN__ALLOW:
				return getAllow();
			case UIPackage.VIEW_PATTERN__MASK:
				return getMask();
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
			case UIPackage.VIEW_PATTERN__ALLOW:
				setAllow((String)newValue);
				return;
			case UIPackage.VIEW_PATTERN__MASK:
				setMask((String)newValue);
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
			case UIPackage.VIEW_PATTERN__ALLOW:
				setAllow(ALLOW_EDEFAULT);
				return;
			case UIPackage.VIEW_PATTERN__MASK:
				setMask(MASK_EDEFAULT);
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
			case UIPackage.VIEW_PATTERN__ALLOW:
				return ALLOW_EDEFAULT == null ? allow != null : !ALLOW_EDEFAULT.equals(allow);
			case UIPackage.VIEW_PATTERN__MASK:
				return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
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
		result.append(" (allow: ");
		result.append(allow);
		result.append(", mask: ");
		result.append(mask);
		result.append(')');
		return result.toString();
	}

} //ViewPatternImpl
