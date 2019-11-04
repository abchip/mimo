/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.preference.impl;

import org.abchip.mimo.biz.content.preference.PreferencePackage;
import org.abchip.mimo.biz.content.preference.WebPreferenceType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Preference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebPreferenceTypeImpl#getWebPreferenceTypeId <em>Web Preference Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.impl.WebPreferenceTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebPreferenceTypeImpl extends BizEntityImpl implements WebPreferenceType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getWebPreferenceTypeId() <em>Web Preference Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPreferenceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_PREFERENCE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebPreferenceTypeId() <em>Web Preference Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPreferenceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String webPreferenceTypeId = WEB_PREFERENCE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebPreferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencePackage.Literals.WEB_PREFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencePackage.WEB_PREFERENCE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebPreferenceTypeId() {
		return webPreferenceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebPreferenceTypeId(String newWebPreferenceTypeId) {
		String oldWebPreferenceTypeId = webPreferenceTypeId;
		webPreferenceTypeId = newWebPreferenceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencePackage.WEB_PREFERENCE_TYPE__WEB_PREFERENCE_TYPE_ID, oldWebPreferenceTypeId, webPreferenceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PreferencePackage.WEB_PREFERENCE_TYPE__WEB_PREFERENCE_TYPE_ID:
				return getWebPreferenceTypeId();
			case PreferencePackage.WEB_PREFERENCE_TYPE__DESCRIPTION:
				return getDescription();
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
			case PreferencePackage.WEB_PREFERENCE_TYPE__WEB_PREFERENCE_TYPE_ID:
				setWebPreferenceTypeId((String)newValue);
				return;
			case PreferencePackage.WEB_PREFERENCE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case PreferencePackage.WEB_PREFERENCE_TYPE__WEB_PREFERENCE_TYPE_ID:
				setWebPreferenceTypeId(WEB_PREFERENCE_TYPE_ID_EDEFAULT);
				return;
			case PreferencePackage.WEB_PREFERENCE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case PreferencePackage.WEB_PREFERENCE_TYPE__WEB_PREFERENCE_TYPE_ID:
				return WEB_PREFERENCE_TYPE_ID_EDEFAULT == null ? webPreferenceTypeId != null : !WEB_PREFERENCE_TYPE_ID_EDEFAULT.equals(webPreferenceTypeId);
			case PreferencePackage.WEB_PREFERENCE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (webPreferenceTypeId: ");
		result.append(webPreferenceTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //WebPreferenceTypeImpl