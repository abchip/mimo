/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accommodation Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationMapId <em>Accommodation Map Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationClassId <em>Accommodation Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationMapTypeId <em>Accommodation Map Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getNumberOfSpaces <em>Number Of Spaces</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getAccommodationMap()
 * @model
 * @generated
 */
public interface AccommodationMap extends BizEntityTyped<AccommodationMapType> {
	/**
	 * Returns the value of the '<em><b>Accommodation Map Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Map Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Map Id</em>' attribute.
	 * @see #setAccommodationMapId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getAccommodationMap_AccommodationMapId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAccommodationMapId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationMapId <em>Accommodation Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Map Id</em>' attribute.
	 * @see #getAccommodationMapId()
	 * @generated
	 */
	void setAccommodationMapId(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Spaces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Spaces</em>' attribute.
	 * @see #setNumberOfSpaces(long)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getAccommodationMap_NumberOfSpaces()
	 * @model
	 * @generated
	 */
	long getNumberOfSpaces();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getNumberOfSpaces <em>Number Of Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Spaces</em>' attribute.
	 * @see #getNumberOfSpaces()
	 * @generated
	 */
	void setNumberOfSpaces(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort' route='accommodationMapId'"
	 * @generated
	 */
	List<String> workEfforts();

	/**
	 * Returns the value of the '<em><b>Accommodation Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Class Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Class Id</em>' attribute.
	 * @see #setAccommodationClassId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getAccommodationMap_AccommodationClassId()
	 * @model annotation="mimo-ent-domain frame='AccommodationClass'"
	 * @generated
	 */
	String getAccommodationClassId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationClassId <em>Accommodation Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Class Id</em>' attribute.
	 * @see #getAccommodationClassId()
	 * @generated
	 */
	void setAccommodationClassId(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getAccommodationMap_FixedAssetId()
	 * @model annotation="mimo-ent-domain frame='FixedAsset'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Accommodation Map Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Map Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Map Type Id</em>' attribute.
	 * @see #setAccommodationMapTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getAccommodationMap_AccommodationMapTypeId()
	 * @model annotation="mimo-ent-domain frame='AccommodationMapType'"
	 * @generated
	 */
	String getAccommodationMapTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationMapTypeId <em>Accommodation Map Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Map Type Id</em>' attribute.
	 * @see #getAccommodationMapTypeId()
	 * @generated
	 */
	void setAccommodationMapTypeId(String value);

} // AccommodationMap
