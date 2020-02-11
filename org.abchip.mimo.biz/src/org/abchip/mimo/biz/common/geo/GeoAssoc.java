/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo;

import org.abchip.mimo.biz.BizEntity;

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
 * @model annotation="mimo-ent-frame title='Geographic Boundary Association'"
 * @generated
 */
public interface GeoAssoc extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id</em>' reference.
	 * @see #setGeoId(Geo)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeoAssoc_GeoId()
	 * @model keys="geoId" required="true"
	 *        annotation="mimo-ent-slot key='true' help='The enclosed geo'"
	 * @generated
	 */
	Geo getGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoId <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id</em>' reference.
	 * @see #getGeoId()
	 * @generated
	 */
	void setGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>Geo Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id To</em>' reference.
	 * @see #setGeoIdTo(Geo)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeoAssoc_GeoIdTo()
	 * @model keys="geoId" required="true"
	 *        annotation="mimo-ent-slot key='true' help='The enclosing geo'"
	 * @generated
	 */
	Geo getGeoIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoIdTo <em>Geo Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id To</em>' reference.
	 * @see #getGeoIdTo()
	 * @generated
	 */
	void setGeoIdTo(Geo value);

	/**
	 * Returns the value of the '<em><b>Geo Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Assoc Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Assoc Type Id</em>' reference.
	 * @see #setGeoAssocTypeId(GeoAssocType)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeoAssoc_GeoAssocTypeId()
	 * @model keys="geoAssocTypeId"
	 * @generated
	 */
	GeoAssocType getGeoAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Assoc Type Id</em>' reference.
	 * @see #getGeoAssocTypeId()
	 * @generated
	 */
	void setGeoAssocTypeId(GeoAssocType value);

} // GeoAssoc
