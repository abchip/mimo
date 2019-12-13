/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.data.impl;

import org.abchip.mimo.data.BinaryDef;
import org.abchip.mimo.data.BinaryType;
import org.abchip.mimo.data.DataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.data.impl.BinaryDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.abchip.mimo.data.impl.BinaryDefImpl#isUnsigned <em>Unsigned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryDefImpl extends DataDefImpl<byte[]> implements BinaryDef {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryType TYPE_EDEFAULT = BinaryType.BYTE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BinaryType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSIGNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected boolean unsigned = UNSIGNED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.BINARY_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(BinaryType newType) {
		BinaryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.BINARY_DEF__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnsigned() {
		return unsigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsigned(boolean newUnsigned) {
		boolean oldUnsigned = unsigned;
		unsigned = newUnsigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.BINARY_DEF__UNSIGNED, oldUnsigned, unsigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.BINARY_DEF__TYPE:
				return getType();
			case DataPackage.BINARY_DEF__UNSIGNED:
				return isUnsigned();
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
			case DataPackage.BINARY_DEF__TYPE:
				setType((BinaryType)newValue);
				return;
			case DataPackage.BINARY_DEF__UNSIGNED:
				setUnsigned((Boolean)newValue);
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
			case DataPackage.BINARY_DEF__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DataPackage.BINARY_DEF__UNSIGNED:
				setUnsigned(UNSIGNED_EDEFAULT);
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
			case DataPackage.BINARY_DEF__TYPE:
				return type != TYPE_EDEFAULT;
			case DataPackage.BINARY_DEF__UNSIGNED:
				return unsigned != UNSIGNED_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", unsigned: ");
		result.append(unsigned);
		result.append(')');
		return result.toString();
	}

} //BinaryDefImpl