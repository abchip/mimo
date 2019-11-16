/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.crypto.impl;

import org.abchip.mimo.biz.entity.crypto.CryptoPackage;
import org.abchip.mimo.biz.entity.crypto.EntityKeyStore;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Key Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.crypto.impl.EntityKeyStoreImpl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.crypto.impl.EntityKeyStoreImpl#getKeyText <em>Key Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityKeyStoreImpl extends BizEntityImpl implements EntityKeyStore {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected String keyName = KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyText() <em>Key Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyText()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyText() <em>Key Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyText()
	 * @generated
	 * @ordered
	 */
	protected String keyText = KEY_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityKeyStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoPackage.Literals.ENTITY_KEY_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyName() {
		return keyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyName(String newKeyName) {
		String oldKeyName = keyName;
		keyName = newKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoPackage.ENTITY_KEY_STORE__KEY_NAME, oldKeyName, keyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyText() {
		return keyText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyText(String newKeyText) {
		String oldKeyText = keyText;
		keyText = newKeyText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoPackage.ENTITY_KEY_STORE__KEY_TEXT, oldKeyText, keyText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoPackage.ENTITY_KEY_STORE__KEY_NAME:
				return getKeyName();
			case CryptoPackage.ENTITY_KEY_STORE__KEY_TEXT:
				return getKeyText();
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
			case CryptoPackage.ENTITY_KEY_STORE__KEY_NAME:
				setKeyName((String)newValue);
				return;
			case CryptoPackage.ENTITY_KEY_STORE__KEY_TEXT:
				setKeyText((String)newValue);
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
			case CryptoPackage.ENTITY_KEY_STORE__KEY_NAME:
				setKeyName(KEY_NAME_EDEFAULT);
				return;
			case CryptoPackage.ENTITY_KEY_STORE__KEY_TEXT:
				setKeyText(KEY_TEXT_EDEFAULT);
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
			case CryptoPackage.ENTITY_KEY_STORE__KEY_NAME:
				return KEY_NAME_EDEFAULT == null ? keyName != null : !KEY_NAME_EDEFAULT.equals(keyName);
			case CryptoPackage.ENTITY_KEY_STORE__KEY_TEXT:
				return KEY_TEXT_EDEFAULT == null ? keyText != null : !KEY_TEXT_EDEFAULT.equals(keyText);
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
		result.append(" (keyName: ");
		result.append(keyName);
		result.append(", keyText: ");
		result.append(keyText);
		result.append(')');
		return result.toString();
	}

} //EntityKeyStoreImpl
