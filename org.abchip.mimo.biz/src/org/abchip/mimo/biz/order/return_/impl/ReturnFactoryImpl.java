/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import org.abchip.mimo.biz.order.return_.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReturnFactoryImpl extends EFactoryImpl implements ReturnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReturnFactory init() {
		try {
			ReturnFactory theReturnFactory = (ReturnFactory)EPackage.Registry.INSTANCE.getEFactory(ReturnPackage.eNS_URI);
			if (theReturnFactory != null) {
				return theReturnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReturnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReturnPackage.COMMUNICATION_EVENT_RETURN: return (EObject)createCommunicationEventReturn();
			case ReturnPackage.RETURN_ADJUSTMENT: return (EObject)createReturnAdjustment();
			case ReturnPackage.RETURN_ADJUSTMENT_TYPE: return (EObject)createReturnAdjustmentType();
			case ReturnPackage.RETURN_CONTACT_MECH: return (EObject)createReturnContactMech();
			case ReturnPackage.RETURN_HEADER: return (EObject)createReturnHeader();
			case ReturnPackage.RETURN_HEADER_TYPE: return (EObject)createReturnHeaderType();
			case ReturnPackage.RETURN_ITEM: return (EObject)createReturnItem();
			case ReturnPackage.RETURN_ITEM_BILLING: return (EObject)createReturnItemBilling();
			case ReturnPackage.RETURN_ITEM_RESPONSE: return (EObject)createReturnItemResponse();
			case ReturnPackage.RETURN_ITEM_SHIPMENT: return (EObject)createReturnItemShipment();
			case ReturnPackage.RETURN_ITEM_TYPE: return (EObject)createReturnItemType();
			case ReturnPackage.RETURN_ITEM_TYPE_MAP: return (EObject)createReturnItemTypeMap();
			case ReturnPackage.RETURN_REASON: return (EObject)createReturnReason();
			case ReturnPackage.RETURN_STATUS: return (EObject)createReturnStatus();
			case ReturnPackage.RETURN_TYPE: return (EObject)createReturnType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventReturn createCommunicationEventReturn() {
		CommunicationEventReturnImpl communicationEventReturn = new CommunicationEventReturnImpl();
		return communicationEventReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnAdjustment createReturnAdjustment() {
		ReturnAdjustmentImpl returnAdjustment = new ReturnAdjustmentImpl();
		return returnAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnAdjustmentType createReturnAdjustmentType() {
		ReturnAdjustmentTypeImpl returnAdjustmentType = new ReturnAdjustmentTypeImpl();
		return returnAdjustmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnContactMech createReturnContactMech() {
		ReturnContactMechImpl returnContactMech = new ReturnContactMechImpl();
		return returnContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeader createReturnHeader() {
		ReturnHeaderImpl returnHeader = new ReturnHeaderImpl();
		return returnHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeaderType createReturnHeaderType() {
		ReturnHeaderTypeImpl returnHeaderType = new ReturnHeaderTypeImpl();
		return returnHeaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnItem createReturnItem() {
		ReturnItemImpl returnItem = new ReturnItemImpl();
		return returnItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnItemBilling createReturnItemBilling() {
		ReturnItemBillingImpl returnItemBilling = new ReturnItemBillingImpl();
		return returnItemBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnItemResponse createReturnItemResponse() {
		ReturnItemResponseImpl returnItemResponse = new ReturnItemResponseImpl();
		return returnItemResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnItemShipment createReturnItemShipment() {
		ReturnItemShipmentImpl returnItemShipment = new ReturnItemShipmentImpl();
		return returnItemShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnItemType createReturnItemType() {
		ReturnItemTypeImpl returnItemType = new ReturnItemTypeImpl();
		return returnItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnItemTypeMap createReturnItemTypeMap() {
		ReturnItemTypeMapImpl returnItemTypeMap = new ReturnItemTypeMapImpl();
		return returnItemTypeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnReason createReturnReason() {
		ReturnReasonImpl returnReason = new ReturnReasonImpl();
		return returnReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnStatus createReturnStatus() {
		ReturnStatusImpl returnStatus = new ReturnStatusImpl();
		return returnStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnPackage getReturnPackage() {
		return (ReturnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReturnPackage getPackage() {
		return ReturnPackage.eINSTANCE;
	}

} //ReturnFactoryImpl
