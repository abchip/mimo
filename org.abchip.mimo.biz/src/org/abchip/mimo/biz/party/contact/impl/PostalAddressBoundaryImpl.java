/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.PostalAddressBoundary;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postal Address Boundary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressBoundaryImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressBoundaryImpl#getGeoId <em>Geo Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalAddressBoundaryImpl extends BizEntityImpl implements PostalAddressBoundary {
	/**
	 * The default value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechId = CONTACT_MECH_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGeoId() <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo geoId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalAddressBoundaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.POSTAL_ADDRESS_BOUNDARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoId() {
		if (geoId != null && ((EObject)geoId).eIsProxy()) {
			InternalEObject oldGeoId = (InternalEObject)geoId;
			geoId = (Geo)eResolveProxy(oldGeoId);
			if (geoId != oldGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.POSTAL_ADDRESS_BOUNDARY__GEO_ID, oldGeoId, geoId));
			}
		}
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoId() {
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(Geo newGeoId) {
		Geo oldGeoId = geoId;
		geoId = newGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS_BOUNDARY__GEO_ID, oldGeoId, geoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		String oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS_BOUNDARY__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.POSTAL_ADDRESS_BOUNDARY__CONTACT_MECH_ID:
				return getContactMechId();
			case ContactPackage.POSTAL_ADDRESS_BOUNDARY__GEO_ID:
				if (resolve) return getGeoId();
				return basicGetGeoId();
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
			case ContactPackage.POSTAL_ADDRESS_BOUNDARY__CONTACT_MECH_ID:
				setContactMechId((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS_BOUNDARY__GEO_ID:
				setGeoId((Geo)newValue);
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
			case ContactPackage.POSTAL_ADDRESS_BOUNDARY__CONTACT_MECH_ID:
				setContactMechId(CONTACT_MECH_ID_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS_BOUNDARY__GEO_ID:
				setGeoId((Geo)null);
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
			case ContactPackage.POSTAL_ADDRESS_BOUNDARY__CONTACT_MECH_ID:
				return CONTACT_MECH_ID_EDEFAULT == null ? contactMechId != null : !CONTACT_MECH_ID_EDEFAULT.equals(contactMechId);
			case ContactPackage.POSTAL_ADDRESS_BOUNDARY__GEO_ID:
				return geoId != null;
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
		result.append(" (contactMechId: ");
		result.append(contactMechId);
		result.append(')');
		return result.toString();
	}

} //PostalAddressBoundaryImpl