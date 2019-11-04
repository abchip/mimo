/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.party.contact.ContactMechTypePurpose;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Mech Type Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypePurposeImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypePurposeImpl#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactMechTypePurposeImpl extends BizEntityImpl implements ContactMechTypePurpose {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getContactMechTypeId() <em>Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContactMechTypeId() <em>Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechTypeId = CONTACT_MECH_TYPE_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getContactMechPurposeTypeId() <em>Contact Mech Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContactMechPurposeType contactMechPurposeTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactMechTypePurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.CONTACT_MECH_TYPE_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechTypeId() {
		return contactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(String newContactMechTypeId) {
		String oldContactMechTypeId = contactMechTypeId;
		contactMechTypeId = newContactMechTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE_ID, oldContactMechTypeId, contactMechTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechPurposeType getContactMechPurposeTypeId() {
		if (contactMechPurposeTypeId != null && ((EObject)contactMechPurposeTypeId).eIsProxy()) {
			InternalEObject oldContactMechPurposeTypeId = (InternalEObject)contactMechPurposeTypeId;
			contactMechPurposeTypeId = (ContactMechPurposeType)eResolveProxy(oldContactMechPurposeTypeId);
			if (contactMechPurposeTypeId != oldContactMechPurposeTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID, oldContactMechPurposeTypeId, contactMechPurposeTypeId));
			}
		}
		return contactMechPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMechPurposeType basicGetContactMechPurposeTypeId() {
		return contactMechPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechPurposeTypeId(ContactMechPurposeType newContactMechPurposeTypeId) {
		ContactMechPurposeType oldContactMechPurposeTypeId = contactMechPurposeTypeId;
		contactMechPurposeTypeId = newContactMechPurposeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID, oldContactMechPurposeTypeId, contactMechPurposeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE_ID:
				return getContactMechTypeId();
			case ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID:
				if (resolve) return getContactMechPurposeTypeId();
				return basicGetContactMechPurposeTypeId();
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
			case ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId((String)newValue);
				return;
			case ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID:
				setContactMechPurposeTypeId((ContactMechPurposeType)newValue);
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
			case ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId(CONTACT_MECH_TYPE_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID:
				setContactMechPurposeTypeId((ContactMechPurposeType)null);
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
			case ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE_ID:
				return CONTACT_MECH_TYPE_ID_EDEFAULT == null ? contactMechTypeId != null : !CONTACT_MECH_TYPE_ID_EDEFAULT.equals(contactMechTypeId);
			case ContactPackage.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID:
				return contactMechPurposeTypeId != null;
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
		result.append(" (contactMechTypeId: ");
		result.append(contactMechTypeId);
		result.append(')');
		return result.toString();
	}

} //ContactMechTypePurposeImpl
