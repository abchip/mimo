/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.mrp;

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
 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpFactory
 * @model kind="package"
 * @generated
 */
public interface MrpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mrp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/manufacturing/mrp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-mrp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MrpPackage eINSTANCE = org.abchip.mimo.biz.manufacturing.mrp.impl.MrpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl
	 * @see org.abchip.mimo.biz.manufacturing.mrp.impl.MrpPackageImpl#getMrpEvent()
	 * @generated
	 */
	int MRP_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mrp Event Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__MRP_EVENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__EVENT_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mrp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__MRP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__EVENT_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Late</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__IS_LATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventTypeImpl
	 * @see org.abchip.mimo.biz.manufacturing.mrp.impl.MrpPackageImpl#getMrpEventType()
	 * @generated
	 */
	int MRP_EVENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Mrp Event Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__MRP_EVENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRP_EVENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEvent
	 * @generated
	 */
	EClass getMrpEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getMrpId <em>Mrp Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mrp Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getMrpId()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_MrpId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getProductId()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EReference getMrpEvent_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getEventDate <em>Event Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Date</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getEventDate()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_EventDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getMrpEventTypeId <em>Mrp Event Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mrp Event Type Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getMrpEventTypeId()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EReference getMrpEvent_MrpEventTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getEventName()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_EventName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getFacilityId()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EReference getMrpEvent_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#isIsLate <em>Is Late</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Late</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#isIsLate()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_IsLate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getQuantity()
	 * @see #getMrpEvent()
	 * @generated
	 */
	EAttribute getMrpEvent_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEventType
	 * @generated
	 */
	EClass getMrpEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEventType#getMrpEventTypeId <em>Mrp Event Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mrp Event Type Id</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEventType#getMrpEventTypeId()
	 * @see #getMrpEventType()
	 * @generated
	 */
	EAttribute getMrpEventType_MrpEventTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEventType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpEventType#getDescription()
	 * @see #getMrpEventType()
	 * @generated
	 */
	EAttribute getMrpEventType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MrpFactory getMrpFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl
		 * @see org.abchip.mimo.biz.manufacturing.mrp.impl.MrpPackageImpl#getMrpEvent()
		 * @generated
		 */
		EClass MRP_EVENT = eINSTANCE.getMrpEvent();

		/**
		 * The meta object literal for the '<em><b>Mrp Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__MRP_ID = eINSTANCE.getMrpEvent_MrpId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRP_EVENT__PRODUCT_ID = eINSTANCE.getMrpEvent_ProductId();

		/**
		 * The meta object literal for the '<em><b>Event Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__EVENT_DATE = eINSTANCE.getMrpEvent_EventDate();

		/**
		 * The meta object literal for the '<em><b>Mrp Event Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRP_EVENT__MRP_EVENT_TYPE_ID = eINSTANCE.getMrpEvent_MrpEventTypeId();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__EVENT_NAME = eINSTANCE.getMrpEvent_EventName();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRP_EVENT__FACILITY_ID = eINSTANCE.getMrpEvent_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Is Late</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__IS_LATE = eINSTANCE.getMrpEvent_IsLate();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT__QUANTITY = eINSTANCE.getMrpEvent_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventTypeImpl
		 * @see org.abchip.mimo.biz.manufacturing.mrp.impl.MrpPackageImpl#getMrpEventType()
		 * @generated
		 */
		EClass MRP_EVENT_TYPE = eINSTANCE.getMrpEventType();

		/**
		 * The meta object literal for the '<em><b>Mrp Event Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT_TYPE__MRP_EVENT_TYPE_ID = eINSTANCE.getMrpEventType_MrpEventTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRP_EVENT_TYPE__DESCRIPTION = eINSTANCE.getMrpEventType_Description();

	}

} //MrpPackage
