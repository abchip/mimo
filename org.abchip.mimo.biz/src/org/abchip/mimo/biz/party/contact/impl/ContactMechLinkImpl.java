/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactMechLink;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Mech Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechLinkImpl#getContactMechIdFrom <em>Contact Mech Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechLinkImpl#getContactMechIdTo <em>Contact Mech Id To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactMechLinkImpl extends BizEntityImpl implements ContactMechLink {
	/**
	 * The default value of the '{@link #getContactMechIdFrom() <em>Contact Mech Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_FROM_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getContactMechIdFrom() <em>Contact Mech Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String contactMechIdFrom = CONTACT_MECH_ID_FROM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContactMechIdTo() <em>Contact Mech Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechIdTo()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechIdTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactMechLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.CONTACT_MECH_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechIdFrom() {
		return contactMechIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechIdFrom(String newContactMechIdFrom) {
		String oldContactMechIdFrom = contactMechIdFrom;
		contactMechIdFrom = newContactMechIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_FROM, oldContactMechIdFrom, contactMechIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechIdTo() {
		if (contactMechIdTo != null && ((EObject)contactMechIdTo).eIsProxy()) {
			InternalEObject oldContactMechIdTo = (InternalEObject)contactMechIdTo;
			contactMechIdTo = (ContactMech)eResolveProxy(oldContactMechIdTo);
			if (contactMechIdTo != oldContactMechIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_TO, oldContactMechIdTo, contactMechIdTo));
			}
		}
		return contactMechIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechIdTo() {
		return contactMechIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechIdTo(ContactMech newContactMechIdTo) {
		ContactMech oldContactMechIdTo = contactMechIdTo;
		contactMechIdTo = newContactMechIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_TO, oldContactMechIdTo, contactMechIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_FROM:
				return getContactMechIdFrom();
			case ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_TO:
				if (resolve) return getContactMechIdTo();
				return basicGetContactMechIdTo();
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
			case ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_FROM:
				setContactMechIdFrom((String)newValue);
				return;
			case ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_TO:
				setContactMechIdTo((ContactMech)newValue);
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
			case ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_FROM:
				setContactMechIdFrom(CONTACT_MECH_ID_FROM_EDEFAULT);
				return;
			case ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_TO:
				setContactMechIdTo((ContactMech)null);
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
			case ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_FROM:
				return CONTACT_MECH_ID_FROM_EDEFAULT == null ? contactMechIdFrom != null : !CONTACT_MECH_ID_FROM_EDEFAULT.equals(contactMechIdFrom);
			case ContactPackage.CONTACT_MECH_LINK__CONTACT_MECH_ID_TO:
				return contactMechIdTo != null;
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
		result.append(" (contactMechIdFrom: ");
		result.append(contactMechIdFrom);
		result.append(')');
		return result.toString();
	}

} //ContactMechLinkImpl
