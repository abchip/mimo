/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.ContextStatus;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getPicture <em>Picture</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextDescriptionImpl extends EntityIdentifiableImpl implements ContextDescription {
	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getCurrencyUom() <em>Currency Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUom()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCurrencyUom() <em>Currency Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUom()
	 * @generated
	 * @ordered
	 */
	protected String currencyUom = CURRENCY_UOM_EDEFAULT;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPicture() <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected static final String PICTURE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPicture() <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected String picture = PICTURE_EDEFAULT;
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ContextStatus STATUS_EDEFAULT = ContextStatus.ACTIVE;
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ContextStatus status = STATUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected String tenant = TENANT_EDEFAULT;
	/**
	 * The default value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ZONE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTimeZone() <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZone()
	 * @generated
	 * @ordered
	 */
	protected String timeZone = TIME_ZONE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS, oldAnonymous, anonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUom() {
		return currencyUom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(String newCurrencyUom) {
		String oldCurrencyUom = currencyUom;
		currencyUom = newCurrencyUom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__CURRENCY_UOM, oldCurrencyUom, currencyUom));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPicture() {
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicture(String newPicture) {
		String oldPicture = picture;
		picture = newPicture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__PICTURE, oldPicture, picture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ContextStatus newStatus) {
		ContextStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenant(String newTenant) {
		String oldTenant = tenant;
		tenant = newTenant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__TENANT, oldTenant, tenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeZone(String newTimeZone) {
		String oldTimeZone = timeZone;
		timeZone = newTimeZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__TIME_ZONE, oldTimeZone, timeZone));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS:
				return isAnonymous();
			case ContextPackage.CONTEXT_DESCRIPTION__CURRENCY_UOM:
				return getCurrencyUom();
			case ContextPackage.CONTEXT_DESCRIPTION__ID:
				return getId();
			case ContextPackage.CONTEXT_DESCRIPTION__LOCALE:
				return getLocale();
			case ContextPackage.CONTEXT_DESCRIPTION__PICTURE:
				return getPicture();
			case ContextPackage.CONTEXT_DESCRIPTION__STATUS:
				return getStatus();
			case ContextPackage.CONTEXT_DESCRIPTION__TENANT:
				return getTenant();
			case ContextPackage.CONTEXT_DESCRIPTION__TIME_ZONE:
				return getTimeZone();
			case ContextPackage.CONTEXT_DESCRIPTION__USER:
				return getUser();
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
			case ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS:
				setAnonymous((Boolean)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__CURRENCY_UOM:
				setCurrencyUom((String)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__ID:
				setId((String)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__LOCALE:
				setLocale((String)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__PICTURE:
				setPicture((String)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__STATUS:
				setStatus((ContextStatus)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__TENANT:
				setTenant((String)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__TIME_ZONE:
				setTimeZone((String)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__USER:
				setUser((String)newValue);
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
			case ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS:
				setAnonymous(ANONYMOUS_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__CURRENCY_UOM:
				setCurrencyUom(CURRENCY_UOM_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__ID:
				setId(ID_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__LOCALE:
				setLocale(LOCALE_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__PICTURE:
				setPicture(PICTURE_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__TENANT:
				setTenant(TENANT_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__TIME_ZONE:
				setTimeZone(TIME_ZONE_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__USER:
				setUser(USER_EDEFAULT);
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
			case ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS:
				return anonymous != ANONYMOUS_EDEFAULT;
			case ContextPackage.CONTEXT_DESCRIPTION__CURRENCY_UOM:
				return CURRENCY_UOM_EDEFAULT == null ? currencyUom != null : !CURRENCY_UOM_EDEFAULT.equals(currencyUom);
			case ContextPackage.CONTEXT_DESCRIPTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContextPackage.CONTEXT_DESCRIPTION__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
			case ContextPackage.CONTEXT_DESCRIPTION__PICTURE:
				return PICTURE_EDEFAULT == null ? picture != null : !PICTURE_EDEFAULT.equals(picture);
			case ContextPackage.CONTEXT_DESCRIPTION__STATUS:
				return status != STATUS_EDEFAULT;
			case ContextPackage.CONTEXT_DESCRIPTION__TENANT:
				return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
			case ContextPackage.CONTEXT_DESCRIPTION__TIME_ZONE:
				return TIME_ZONE_EDEFAULT == null ? timeZone != null : !TIME_ZONE_EDEFAULT.equals(timeZone);
			case ContextPackage.CONTEXT_DESCRIPTION__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
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
		result.append(" (anonymous: ");
		result.append(anonymous);
		result.append(", currencyUom: ");
		result.append(currencyUom);
		result.append(", id: ");
		result.append(id);
		result.append(", locale: ");
		result.append(locale);
		result.append(", picture: ");
		result.append(picture);
		result.append(", status: ");
		result.append(status);
		result.append(", tenant: ");
		result.append(tenant);
		result.append(", timeZone: ");
		result.append(timeZone);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} // ContextDescriptionImpl
