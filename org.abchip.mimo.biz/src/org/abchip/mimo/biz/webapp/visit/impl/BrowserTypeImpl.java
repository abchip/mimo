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
import org.abchip.mimo.biz.webapp.visit.BrowserType;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browser Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl#getBrowserTypeId <em>Browser Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl#getBrowserName <em>Browser Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl#getBrowserVersion <em>Browser Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowserTypeImpl extends BizEntityImpl implements BrowserType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getBrowserTypeId() <em>Browser Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String BROWSER_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrowserTypeId() <em>Browser Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserTypeId()
	 * @generated
	 * @ordered
	 */
	protected String browserTypeId = BROWSER_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrowserName() <em>Browser Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserName()
	 * @generated
	 * @ordered
	 */
	protected static final String BROWSER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrowserName() <em>Browser Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserName()
	 * @generated
	 * @ordered
	 */
	protected String browserName = BROWSER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrowserVersion() <em>Browser Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String BROWSER_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrowserVersion() <em>Browser Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrowserVersion()
	 * @generated
	 * @ordered
	 */
	protected String browserVersion = BROWSER_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowserTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.BROWSER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrowserTypeId() {
		return browserTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserTypeId(String newBrowserTypeId) {
		String oldBrowserTypeId = browserTypeId;
		browserTypeId = newBrowserTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.BROWSER_TYPE__BROWSER_TYPE_ID, oldBrowserTypeId, browserTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrowserName() {
		return browserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserName(String newBrowserName) {
		String oldBrowserName = browserName;
		browserName = newBrowserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.BROWSER_TYPE__BROWSER_NAME, oldBrowserName, browserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrowserVersion() {
		return browserVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserVersion(String newBrowserVersion) {
		String oldBrowserVersion = browserVersion;
		browserVersion = newBrowserVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.BROWSER_TYPE__BROWSER_VERSION, oldBrowserVersion, browserVersion));
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
			case VisitPackage.BROWSER_TYPE__BROWSER_TYPE_ID:
				return getBrowserTypeId();
			case VisitPackage.BROWSER_TYPE__BROWSER_NAME:
				return getBrowserName();
			case VisitPackage.BROWSER_TYPE__BROWSER_VERSION:
				return getBrowserVersion();
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
			case VisitPackage.BROWSER_TYPE__BROWSER_TYPE_ID:
				setBrowserTypeId((String)newValue);
				return;
			case VisitPackage.BROWSER_TYPE__BROWSER_NAME:
				setBrowserName((String)newValue);
				return;
			case VisitPackage.BROWSER_TYPE__BROWSER_VERSION:
				setBrowserVersion((String)newValue);
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
			case VisitPackage.BROWSER_TYPE__BROWSER_TYPE_ID:
				setBrowserTypeId(BROWSER_TYPE_ID_EDEFAULT);
				return;
			case VisitPackage.BROWSER_TYPE__BROWSER_NAME:
				setBrowserName(BROWSER_NAME_EDEFAULT);
				return;
			case VisitPackage.BROWSER_TYPE__BROWSER_VERSION:
				setBrowserVersion(BROWSER_VERSION_EDEFAULT);
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
			case VisitPackage.BROWSER_TYPE__BROWSER_TYPE_ID:
				return BROWSER_TYPE_ID_EDEFAULT == null ? browserTypeId != null : !BROWSER_TYPE_ID_EDEFAULT.equals(browserTypeId);
			case VisitPackage.BROWSER_TYPE__BROWSER_NAME:
				return BROWSER_NAME_EDEFAULT == null ? browserName != null : !BROWSER_NAME_EDEFAULT.equals(browserName);
			case VisitPackage.BROWSER_TYPE__BROWSER_VERSION:
				return BROWSER_VERSION_EDEFAULT == null ? browserVersion != null : !BROWSER_VERSION_EDEFAULT.equals(browserVersion);
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
		result.append(" (browserTypeId: ");
		result.append(browserTypeId);
		result.append(", browserName: ");
		result.append(browserName);
		result.append(", browserVersion: ");
		result.append(browserVersion);
		result.append(')');
		return result.toString();
	}

} //BrowserTypeImpl
