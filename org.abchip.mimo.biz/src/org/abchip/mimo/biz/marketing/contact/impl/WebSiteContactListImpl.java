/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.contact.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.contact.ContactList;
import org.abchip.mimo.biz.marketing.contact.ContactPackage;
import org.abchip.mimo.biz.marketing.contact.WebSiteContactList;
import org.abchip.mimo.biz.webapp.website.WebSite;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site Contact List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.WebSiteContactListImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.WebSiteContactListImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.WebSiteContactListImpl#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.WebSiteContactListImpl#getContactListId <em>Contact List Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSiteContactListImpl extends BizEntityImpl implements WebSiteContactList {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;


	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;


	/**
	 * The cached value of the '{@link #getWebSiteId() <em>Web Site Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected WebSite webSiteId;


	/**
	 * The cached value of the '{@link #getContactListId() <em>Contact List Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactListId()
	 * @generated
	 * @ordered
	 */
	protected ContactList contactListId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteContactListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.WEB_SITE_CONTACT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactList getContactListId() {
		if (contactListId != null && ((EObject)contactListId).eIsProxy()) {
			InternalEObject oldContactListId = (InternalEObject)contactListId;
			contactListId = (ContactList)eResolveProxy(oldContactListId);
			if (contactListId != oldContactListId) {
			}
		}
		return contactListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactList basicGetContactListId() {
		return contactListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactListId(ContactList newContactListId) {
		contactListId = newContactListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSite getWebSiteId() {
		if (webSiteId != null && ((EObject)webSiteId).eIsProxy()) {
			InternalEObject oldWebSiteId = (InternalEObject)webSiteId;
			webSiteId = (WebSite)eResolveProxy(oldWebSiteId);
			if (webSiteId != oldWebSiteId) {
			}
		}
		return webSiteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebSite basicGetWebSiteId() {
		return webSiteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSiteId(WebSite newWebSiteId) {
		webSiteId = newWebSiteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.WEB_SITE_CONTACT_LIST__FROM_DATE:
				return getFromDate();
			case ContactPackage.WEB_SITE_CONTACT_LIST__THRU_DATE:
				return getThruDate();
			case ContactPackage.WEB_SITE_CONTACT_LIST__WEB_SITE_ID:
				if (resolve) return getWebSiteId();
				return basicGetWebSiteId();
			case ContactPackage.WEB_SITE_CONTACT_LIST__CONTACT_LIST_ID:
				if (resolve) return getContactListId();
				return basicGetContactListId();
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
			case ContactPackage.WEB_SITE_CONTACT_LIST__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ContactPackage.WEB_SITE_CONTACT_LIST__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case ContactPackage.WEB_SITE_CONTACT_LIST__WEB_SITE_ID:
				setWebSiteId((WebSite)newValue);
				return;
			case ContactPackage.WEB_SITE_CONTACT_LIST__CONTACT_LIST_ID:
				setContactListId((ContactList)newValue);
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
			case ContactPackage.WEB_SITE_CONTACT_LIST__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ContactPackage.WEB_SITE_CONTACT_LIST__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case ContactPackage.WEB_SITE_CONTACT_LIST__WEB_SITE_ID:
				setWebSiteId((WebSite)null);
				return;
			case ContactPackage.WEB_SITE_CONTACT_LIST__CONTACT_LIST_ID:
				setContactListId((ContactList)null);
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
			case ContactPackage.WEB_SITE_CONTACT_LIST__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ContactPackage.WEB_SITE_CONTACT_LIST__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case ContactPackage.WEB_SITE_CONTACT_LIST__WEB_SITE_ID:
				return webSiteId != null;
			case ContactPackage.WEB_SITE_CONTACT_LIST__CONTACT_LIST_ID:
				return contactListId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //WebSiteContactListImpl
