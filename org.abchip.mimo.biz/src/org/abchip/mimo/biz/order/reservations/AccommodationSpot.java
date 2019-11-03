/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.reservations;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accommodation Spot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getAccommodationSpotId <em>Accommodation Spot Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getAccommodationClassId <em>Accommodation Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getNumberOfSpaces <em>Number Of Spaces</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.reservations.ReservationsPackage#getAccommodationSpot()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface AccommodationSpot extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Accommodation Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Class Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Class Id</em>' attribute.
	 * @see #setAccommodationClassId(String)
	 * @see org.abchip.mimo.biz.order.reservations.ReservationsPackage#getAccommodationSpot_AccommodationClassId()
	 * @model annotation="mimo-ent-domain frame='AccommodationClass'"
	 * @generated
	 */
	String getAccommodationClassId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getAccommodationClassId <em>Accommodation Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Class Id</em>' attribute.
	 * @see #getAccommodationClassId()
	 * @generated
	 */
	void setAccommodationClassId(String value);

	/**
	 * Returns the value of the '<em><b>Accommodation Spot Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Spot Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Spot Id</em>' attribute.
	 * @see #setAccommodationSpotId(String)
	 * @see org.abchip.mimo.biz.order.reservations.ReservationsPackage#getAccommodationSpot_AccommodationSpotId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAccommodationSpotId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getAccommodationSpotId <em>Accommodation Spot Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Spot Id</em>' attribute.
	 * @see #getAccommodationSpotId()
	 * @generated
	 */
	void setAccommodationSpotId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.order.reservations.ReservationsPackage#getAccommodationSpot_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.order.reservations.ReservationsPackage#getAccommodationSpot_FixedAssetId()
	 * @model annotation="mimo-ent-domain frame='FixedAsset'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

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
	 * @see org.abchip.mimo.biz.order.reservations.ReservationsPackage#getAccommodationSpot_NumberOfSpaces()
	 * @model
	 * @generated
	 */
	long getNumberOfSpaces();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getNumberOfSpaces <em>Number Of Spaces</em>}' attribute.
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
	 *        annotation="mimo-ent-domain frame='WorkEffort' route='accommodationSpotId'"
	 * @generated
	 */
	List<String> workEfforts();

} // AccommodationSpot
