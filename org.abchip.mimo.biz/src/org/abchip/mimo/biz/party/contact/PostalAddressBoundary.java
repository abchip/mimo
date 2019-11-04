/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.geo.Geo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddressBoundary#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddressBoundary#getGeoId <em>Geo Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddressBoundary()
 * @model
 * @generated
 */
public interface PostalAddressBoundary extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id</em>' reference.
	 * @see #setGeoId(Geo)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddressBoundary_GeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddressBoundary#getGeoId <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id</em>' reference.
	 * @see #getGeoId()
	 * @generated
	 */
	void setGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #setContactMechId(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddressBoundary_ContactMechId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddressBoundary#getContactMechId <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(String value);

} // PostalAddressBoundary
