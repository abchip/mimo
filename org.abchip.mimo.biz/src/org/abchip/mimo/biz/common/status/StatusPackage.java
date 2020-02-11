/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.status;

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
 * @see org.abchip.mimo.biz.common.status.StatusFactory
 * @model kind="package"
 * @generated
 */
public interface StatusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "status";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/status";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-status";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatusPackage eINSTANCE = org.abchip.mimo.biz.common.status.impl.StatusPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.status.impl.StatusItemImpl
	 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusItem()
	 * @generated
	 */
	int STATUS_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Main Status Valid Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__MAIN_STATUS_VALID_CHANGES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__SEQUENCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shipment Statuss</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__SHIPMENT_STATUSS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__STATUS_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__STATUS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.status.impl.StatusTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.status.impl.StatusTypeImpl
	 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Status Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__STATUS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl <em>Valid Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl
	 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusValidChange()
	 * @generated
	 */
	int STATUS_VALID_CHANGE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__STATUS_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__CONDITION_EXPRESSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__TRANSITION_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Valid Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.status.StatusItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem
	 * @generated
	 */
	EClass getStatusItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusItem#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getStatusId()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getDescription()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.common.status.StatusItem#getMainStatusValidChanges <em>Main Status Valid Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main Status Valid Changes</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getMainStatusValidChanges()
	 * @see #getStatusItem()
	 * @generated
	 */
	EReference getStatusItem_MainStatusValidChanges();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusItem#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getSequenceId()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_SequenceId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.common.status.StatusItem#getShipmentStatuss <em>Shipment Statuss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shipment Statuss</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getShipmentStatuss()
	 * @see #getStatusItem()
	 * @generated
	 */
	EReference getStatusItem_ShipmentStatuss();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusItem#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Code</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getStatusCode()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_StatusCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.status.StatusItem#getStatusTypeId <em>Status Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getStatusTypeId()
	 * @see #getStatusItem()
	 * @generated
	 */
	EReference getStatusItem_StatusTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.status.StatusType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType
	 * @generated
	 */
	EClass getStatusType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusType#getStatusTypeId <em>Status Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType#getStatusTypeId()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_StatusTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType#getDescription()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType#isHasTable()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.status.StatusType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType#getParentTypeId()
	 * @see #getStatusType()
	 * @generated
	 */
	EReference getStatusType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.status.StatusValidChange <em>Valid Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Change</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange
	 * @generated
	 */
	EClass getStatusValidChange();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange#getStatusId()
	 * @see #getStatusValidChange()
	 * @generated
	 */
	EReference getStatusValidChange_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getStatusIdTo <em>Status Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id To</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange#getStatusIdTo()
	 * @see #getStatusValidChange()
	 * @generated
	 */
	EReference getStatusValidChange_StatusIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Expression</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange#getConditionExpression()
	 * @see #getStatusValidChange()
	 * @generated
	 */
	EAttribute getStatusValidChange_ConditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getTransitionName <em>Transition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Name</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange#getTransitionName()
	 * @see #getStatusValidChange()
	 * @generated
	 */
	EAttribute getStatusValidChange_TransitionName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatusFactory getStatusFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.status.impl.StatusItemImpl
		 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusItem()
		 * @generated
		 */
		EClass STATUS_ITEM = eINSTANCE.getStatusItem();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__STATUS_ID = eINSTANCE.getStatusItem_StatusId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__DESCRIPTION = eINSTANCE.getStatusItem_Description();

		/**
		 * The meta object literal for the '<em><b>Main Status Valid Changes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_ITEM__MAIN_STATUS_VALID_CHANGES = eINSTANCE.getStatusItem_MainStatusValidChanges();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__SEQUENCE_ID = eINSTANCE.getStatusItem_SequenceId();

		/**
		 * The meta object literal for the '<em><b>Shipment Statuss</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_ITEM__SHIPMENT_STATUSS = eINSTANCE.getStatusItem_ShipmentStatuss();

		/**
		 * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__STATUS_CODE = eINSTANCE.getStatusItem_StatusCode();

		/**
		 * The meta object literal for the '<em><b>Status Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_ITEM__STATUS_TYPE_ID = eINSTANCE.getStatusItem_StatusTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.status.impl.StatusTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.status.impl.StatusTypeImpl
		 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusType()
		 * @generated
		 */
		EClass STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '<em><b>Status Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__STATUS_TYPE_ID = eINSTANCE.getStatusType_StatusTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__DESCRIPTION = eINSTANCE.getStatusType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__HAS_TABLE = eINSTANCE.getStatusType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_TYPE__PARENT_TYPE_ID = eINSTANCE.getStatusType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl <em>Valid Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl
		 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusValidChange()
		 * @generated
		 */
		EClass STATUS_VALID_CHANGE = eINSTANCE.getStatusValidChange();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_VALID_CHANGE__STATUS_ID = eINSTANCE.getStatusValidChange_StatusId();

		/**
		 * The meta object literal for the '<em><b>Status Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_VALID_CHANGE__STATUS_ID_TO = eINSTANCE.getStatusValidChange_StatusIdTo();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_VALID_CHANGE__CONDITION_EXPRESSION = eINSTANCE.getStatusValidChange_ConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Transition Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_VALID_CHANGE__TRANSITION_NAME = eINSTANCE.getStatusValidChange_TransitionName();

	}

} //StatusPackage
