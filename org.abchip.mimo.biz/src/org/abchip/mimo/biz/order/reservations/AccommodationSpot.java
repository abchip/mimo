/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.reservations;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;

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
	 * Returns the value of the '<em><b>Accommodation Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Class Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Class Id</em>' reference.
	 * @see #setAccommodationClassId(AccommodationClass)
	 * @see org.abchip.mimo.biz.order.reservations.ReservationsPackage#getAccommodationSpot_AccommodationClassId()
	 * @model keys="accommodationClassId"
	 * @generated
	 */
	AccommodationClass getAccommodationClassId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getAccommodationClassId <em>Accommodation Class Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Class Id</em>' reference.
	 * @see #getAccommodationClassId()
	 * @generated
	 */
	void setAccommodationClassId(AccommodationClass value);

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #setFixedAssetId(FixedAsset)
	 * @see org.abchip.mimo.biz.order.reservations.ReservationsPackage#getAccommodationSpot_FixedAssetId()
	 * @model keys="fixedAssetId"
	 * @generated
	 */
	FixedAsset getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getFixedAssetId <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(FixedAsset value);

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
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
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

} // AccommodationSpot
