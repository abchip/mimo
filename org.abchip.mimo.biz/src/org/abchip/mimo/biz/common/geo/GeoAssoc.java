/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoIdTo <em>Geo Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeoAssoc()
 * @model
 * @generated
 */
public interface GeoAssoc extends BizEntityTyped<GeoAssocType> {
	/**
	 * Returns the value of the '<em><b>Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id</em>' attribute.
	 * @see #setGeoId(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeoAssoc_GeoId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoId <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id</em>' attribute.
	 * @see #getGeoId()
	 * @generated
	 */
	void setGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Geo Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id To</em>' attribute.
	 * @see #setGeoIdTo(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeoAssoc_GeoIdTo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getGeoIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoIdTo <em>Geo Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id To</em>' attribute.
	 * @see #getGeoIdTo()
	 * @generated
	 */
	void setGeoIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Geo Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Assoc Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Assoc Type Id</em>' attribute.
	 * @see #setGeoAssocTypeId(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeoAssoc_GeoAssocTypeId()
	 * @model annotation="mimo-ent-domain frame='GeoAssocType'"
	 * @generated
	 */
	String getGeoAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Assoc Type Id</em>' attribute.
	 * @see #getGeoAssocTypeId()
	 * @generated
	 */
	void setGeoAssocTypeId(String value);

} // GeoAssoc
