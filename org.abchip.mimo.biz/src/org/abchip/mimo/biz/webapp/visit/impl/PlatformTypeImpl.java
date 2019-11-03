/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.webapp.visit.PlatformType;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl#getPlatformTypeId <em>Platform Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl#getPlatformName <em>Platform Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl#getPlatformVersion <em>Platform Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformTypeImpl extends BizEntityImpl implements PlatformType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPlatformTypeId() <em>Platform Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformTypeId() <em>Platform Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformTypeId()
	 * @generated
	 * @ordered
	 */
	protected String platformTypeId = PLATFORM_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatformName() <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformName() <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformName()
	 * @generated
	 * @ordered
	 */
	protected String platformName = PLATFORM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatformVersion() <em>Platform Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformVersion() <em>Platform Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformVersion()
	 * @generated
	 * @ordered
	 */
	protected String platformVersion = PLATFORM_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.PLATFORM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatformTypeId() {
		return platformTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformTypeId(String newPlatformTypeId) {
		String oldPlatformTypeId = platformTypeId;
		platformTypeId = newPlatformTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.PLATFORM_TYPE__PLATFORM_TYPE_ID, oldPlatformTypeId, platformTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatformName() {
		return platformName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformName(String newPlatformName) {
		String oldPlatformName = platformName;
		platformName = newPlatformName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.PLATFORM_TYPE__PLATFORM_NAME, oldPlatformName, platformName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatformVersion() {
		return platformVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformVersion(String newPlatformVersion) {
		String oldPlatformVersion = platformVersion;
		platformVersion = newPlatformVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.PLATFORM_TYPE__PLATFORM_VERSION, oldPlatformVersion, platformVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> userAgents() {
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
			case VisitPackage.PLATFORM_TYPE__PLATFORM_TYPE_ID:
				return getPlatformTypeId();
			case VisitPackage.PLATFORM_TYPE__PLATFORM_NAME:
				return getPlatformName();
			case VisitPackage.PLATFORM_TYPE__PLATFORM_VERSION:
				return getPlatformVersion();
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
			case VisitPackage.PLATFORM_TYPE__PLATFORM_TYPE_ID:
				setPlatformTypeId((String)newValue);
				return;
			case VisitPackage.PLATFORM_TYPE__PLATFORM_NAME:
				setPlatformName((String)newValue);
				return;
			case VisitPackage.PLATFORM_TYPE__PLATFORM_VERSION:
				setPlatformVersion((String)newValue);
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
			case VisitPackage.PLATFORM_TYPE__PLATFORM_TYPE_ID:
				setPlatformTypeId(PLATFORM_TYPE_ID_EDEFAULT);
				return;
			case VisitPackage.PLATFORM_TYPE__PLATFORM_NAME:
				setPlatformName(PLATFORM_NAME_EDEFAULT);
				return;
			case VisitPackage.PLATFORM_TYPE__PLATFORM_VERSION:
				setPlatformVersion(PLATFORM_VERSION_EDEFAULT);
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
			case VisitPackage.PLATFORM_TYPE__PLATFORM_TYPE_ID:
				return PLATFORM_TYPE_ID_EDEFAULT == null ? platformTypeId != null : !PLATFORM_TYPE_ID_EDEFAULT.equals(platformTypeId);
			case VisitPackage.PLATFORM_TYPE__PLATFORM_NAME:
				return PLATFORM_NAME_EDEFAULT == null ? platformName != null : !PLATFORM_NAME_EDEFAULT.equals(platformName);
			case VisitPackage.PLATFORM_TYPE__PLATFORM_VERSION:
				return PLATFORM_VERSION_EDEFAULT == null ? platformVersion != null : !PLATFORM_VERSION_EDEFAULT.equals(platformVersion);
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
		result.append(" (platformTypeId: ");
		result.append(platformTypeId);
		result.append(", platformName: ");
		result.append(platformName);
		result.append(", platformVersion: ");
		result.append(platformVersion);
		result.append(')');
		return result.toString();
	}

} //PlatformTypeImpl
