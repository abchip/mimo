/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.screen.impl;

import org.abchip.mimo.biz.common.screen.CustomScreen;
import org.abchip.mimo.biz.common.screen.CustomScreenType;
import org.abchip.mimo.biz.common.screen.ScreenPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getCustomScreenId <em>Custom Screen Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getCustomScreenLocation <em>Custom Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getCustomScreenName <em>Custom Screen Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getCustomScreenTypeId <em>Custom Screen Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomScreenImpl extends BizEntityTypedImpl<CustomScreenType> implements CustomScreen {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCustomScreenId() <em>Custom Screen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_SCREEN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomScreenId() <em>Custom Screen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenId()
	 * @generated
	 * @ordered
	 */
	protected String customScreenId = CUSTOM_SCREEN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomScreenLocation() <em>Custom Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_SCREEN_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomScreenLocation() <em>Custom Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenLocation()
	 * @generated
	 * @ordered
	 */
	protected String customScreenLocation = CUSTOM_SCREEN_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomScreenName() <em>Custom Screen Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_SCREEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomScreenName() <em>Custom Screen Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenName()
	 * @generated
	 * @ordered
	 */
	protected String customScreenName = CUSTOM_SCREEN_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getCustomScreenTypeId() <em>Custom Screen Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenTypeId()
	 * @generated
	 * @ordered
	 */
	protected CustomScreenType customScreenTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomScreenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenPackage.Literals.CUSTOM_SCREEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomScreenId() {
		return customScreenId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenId(String newCustomScreenId) {
		String oldCustomScreenId = customScreenId;
		customScreenId = newCustomScreenId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_ID, oldCustomScreenId, customScreenId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomScreenLocation() {
		return customScreenLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenLocation(String newCustomScreenLocation) {
		String oldCustomScreenLocation = customScreenLocation;
		customScreenLocation = newCustomScreenLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_LOCATION, oldCustomScreenLocation, customScreenLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomScreenName() {
		return customScreenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenName(String newCustomScreenName) {
		String oldCustomScreenName = customScreenName;
		customScreenName = newCustomScreenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_NAME, oldCustomScreenName, customScreenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomScreenType getCustomScreenTypeId() {
		if (customScreenTypeId != null && ((EObject)customScreenTypeId).eIsProxy()) {
			InternalEObject oldCustomScreenTypeId = (InternalEObject)customScreenTypeId;
			customScreenTypeId = (CustomScreenType)eResolveProxy(oldCustomScreenTypeId);
			if (customScreenTypeId != oldCustomScreenTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID, oldCustomScreenTypeId, customScreenTypeId));
			}
		}
		return customScreenTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomScreenType basicGetCustomScreenTypeId() {
		return customScreenTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenTypeId(CustomScreenType newCustomScreenTypeId) {
		CustomScreenType oldCustomScreenTypeId = customScreenTypeId;
		customScreenTypeId = newCustomScreenTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID, oldCustomScreenTypeId, customScreenTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ScreenPackage.CUSTOM_SCREEN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_ID:
				return getCustomScreenId();
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_LOCATION:
				return getCustomScreenLocation();
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_NAME:
				return getCustomScreenName();
			case ScreenPackage.CUSTOM_SCREEN__DESCRIPTION:
				return getDescription();
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID:
				if (resolve) return getCustomScreenTypeId();
				return basicGetCustomScreenTypeId();
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
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_ID:
				setCustomScreenId((String)newValue);
				return;
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_LOCATION:
				setCustomScreenLocation((String)newValue);
				return;
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_NAME:
				setCustomScreenName((String)newValue);
				return;
			case ScreenPackage.CUSTOM_SCREEN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID:
				setCustomScreenTypeId((CustomScreenType)newValue);
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
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_ID:
				setCustomScreenId(CUSTOM_SCREEN_ID_EDEFAULT);
				return;
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_LOCATION:
				setCustomScreenLocation(CUSTOM_SCREEN_LOCATION_EDEFAULT);
				return;
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_NAME:
				setCustomScreenName(CUSTOM_SCREEN_NAME_EDEFAULT);
				return;
			case ScreenPackage.CUSTOM_SCREEN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID:
				setCustomScreenTypeId((CustomScreenType)null);
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
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_ID:
				return CUSTOM_SCREEN_ID_EDEFAULT == null ? customScreenId != null : !CUSTOM_SCREEN_ID_EDEFAULT.equals(customScreenId);
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_LOCATION:
				return CUSTOM_SCREEN_LOCATION_EDEFAULT == null ? customScreenLocation != null : !CUSTOM_SCREEN_LOCATION_EDEFAULT.equals(customScreenLocation);
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_NAME:
				return CUSTOM_SCREEN_NAME_EDEFAULT == null ? customScreenName != null : !CUSTOM_SCREEN_NAME_EDEFAULT.equals(customScreenName);
			case ScreenPackage.CUSTOM_SCREEN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ScreenPackage.CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID:
				return customScreenTypeId != null;
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
		result.append(" (customScreenId: ");
		result.append(customScreenId);
		result.append(", customScreenLocation: ");
		result.append(customScreenLocation);
		result.append(", customScreenName: ");
		result.append(customScreenName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CustomScreenImpl
