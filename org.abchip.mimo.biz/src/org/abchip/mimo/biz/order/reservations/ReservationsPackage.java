/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.reservations;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.order.reservations.ReservationsFactory
 * @model kind="package"
 * @generated
 */
public interface ReservationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reservations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/order/reservations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-reservations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReservationsPackage eINSTANCE = org.abchip.mimo.biz.order.reservations.impl.ReservationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.reservations.impl.AccommodationSpotImpl <em>Accommodation Spot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.reservations.impl.AccommodationSpotImpl
	 * @see org.abchip.mimo.biz.order.reservations.impl.ReservationsPackageImpl#getAccommodationSpot()
	 * @generated
	 */
	int ACCOMMODATION_SPOT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Accommodation Spot Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__ACCOMMODATION_SPOT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accommodation Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__ACCOMMODATION_CLASS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Number Of Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT__NUMBER_OF_SPACES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Accommodation Spot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_SPOT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot <em>Accommodation Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accommodation Spot</em>'.
	 * @see org.abchip.mimo.biz.order.reservations.AccommodationSpot
	 * @generated
	 */
	EClass getAccommodationSpot();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getAccommodationSpotId <em>Accommodation Spot Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accommodation Spot Id</em>'.
	 * @see org.abchip.mimo.biz.order.reservations.AccommodationSpot#getAccommodationSpotId()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EAttribute getAccommodationSpot_AccommodationSpotId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getAccommodationClassId <em>Accommodation Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accommodation Class Id</em>'.
	 * @see org.abchip.mimo.biz.order.reservations.AccommodationSpot#getAccommodationClassId()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EReference getAccommodationSpot_AccommodationClassId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.reservations.AccommodationSpot#getDescription()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EAttribute getAccommodationSpot_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.order.reservations.AccommodationSpot#getFixedAssetId()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EReference getAccommodationSpot_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.reservations.AccommodationSpot#getNumberOfSpaces <em>Number Of Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Spaces</em>'.
	 * @see org.abchip.mimo.biz.order.reservations.AccommodationSpot#getNumberOfSpaces()
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	EAttribute getAccommodationSpot_NumberOfSpaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReservationsFactory getReservationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.reservations.impl.AccommodationSpotImpl <em>Accommodation Spot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.reservations.impl.AccommodationSpotImpl
		 * @see org.abchip.mimo.biz.order.reservations.impl.ReservationsPackageImpl#getAccommodationSpot()
		 * @generated
		 */
		EClass ACCOMMODATION_SPOT = eINSTANCE.getAccommodationSpot();

		/**
		 * The meta object literal for the '<em><b>Accommodation Spot Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_SPOT__ACCOMMODATION_SPOT_ID = eINSTANCE.getAccommodationSpot_AccommodationSpotId();

		/**
		 * The meta object literal for the '<em><b>Accommodation Class Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMMODATION_SPOT__ACCOMMODATION_CLASS_ID = eINSTANCE.getAccommodationSpot_AccommodationClassId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_SPOT__DESCRIPTION = eINSTANCE.getAccommodationSpot_Description();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMMODATION_SPOT__FIXED_ASSET_ID = eINSTANCE.getAccommodationSpot_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Number Of Spaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_SPOT__NUMBER_OF_SPACES = eINSTANCE.getAccommodationSpot_NumberOfSpaces();

	}

} //ReservationsPackage
