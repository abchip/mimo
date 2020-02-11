/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request.impl;

import org.abchip.mimo.biz.order.request.*;
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
public class RequestFactoryImpl extends EFactoryImpl implements RequestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequestFactory init() {
		try {
			RequestFactory theRequestFactory = (RequestFactory)EPackage.Registry.INSTANCE.getEFactory(RequestPackage.eNS_URI);
			if (theRequestFactory != null) {
				return theRequestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFactoryImpl() {
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
			case RequestPackage.CUST_REQUEST: return (EObject)createCustRequest();
			case RequestPackage.CUST_REQUEST_ATTRIBUTE: return (EObject)createCustRequestAttribute();
			case RequestPackage.CUST_REQUEST_CATEGORY: return (EObject)createCustRequestCategory();
			case RequestPackage.CUST_REQUEST_COMM_EVENT: return (EObject)createCustRequestCommEvent();
			case RequestPackage.CUST_REQUEST_CONTENT: return (EObject)createCustRequestContent();
			case RequestPackage.CUST_REQUEST_ITEM: return (EObject)createCustRequestItem();
			case RequestPackage.CUST_REQUEST_ITEM_NOTE: return (EObject)createCustRequestItemNote();
			case RequestPackage.CUST_REQUEST_ITEM_WORK_EFFORT: return (EObject)createCustRequestItemWorkEffort();
			case RequestPackage.CUST_REQUEST_NOTE: return (EObject)createCustRequestNote();
			case RequestPackage.CUST_REQUEST_PARTY: return (EObject)createCustRequestParty();
			case RequestPackage.CUST_REQUEST_RESOLUTION: return (EObject)createCustRequestResolution();
			case RequestPackage.CUST_REQUEST_STATUS: return (EObject)createCustRequestStatus();
			case RequestPackage.CUST_REQUEST_TYPE: return (EObject)createCustRequestType();
			case RequestPackage.CUST_REQUEST_TYPE_ATTR: return (EObject)createCustRequestTypeAttr();
			case RequestPackage.CUST_REQUEST_WORK_EFFORT: return (EObject)createCustRequestWorkEffort();
			case RequestPackage.RESPONDING_PARTY: return (EObject)createRespondingParty();
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
	public CustRequest createCustRequest() {
		CustRequestImpl custRequest = new CustRequestImpl();
		return custRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestAttribute createCustRequestAttribute() {
		CustRequestAttributeImpl custRequestAttribute = new CustRequestAttributeImpl();
		return custRequestAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestCategory createCustRequestCategory() {
		CustRequestCategoryImpl custRequestCategory = new CustRequestCategoryImpl();
		return custRequestCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestCommEvent createCustRequestCommEvent() {
		CustRequestCommEventImpl custRequestCommEvent = new CustRequestCommEventImpl();
		return custRequestCommEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestContent createCustRequestContent() {
		CustRequestContentImpl custRequestContent = new CustRequestContentImpl();
		return custRequestContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestItem createCustRequestItem() {
		CustRequestItemImpl custRequestItem = new CustRequestItemImpl();
		return custRequestItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestItemNote createCustRequestItemNote() {
		CustRequestItemNoteImpl custRequestItemNote = new CustRequestItemNoteImpl();
		return custRequestItemNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestItemWorkEffort createCustRequestItemWorkEffort() {
		CustRequestItemWorkEffortImpl custRequestItemWorkEffort = new CustRequestItemWorkEffortImpl();
		return custRequestItemWorkEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestNote createCustRequestNote() {
		CustRequestNoteImpl custRequestNote = new CustRequestNoteImpl();
		return custRequestNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestParty createCustRequestParty() {
		CustRequestPartyImpl custRequestParty = new CustRequestPartyImpl();
		return custRequestParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestResolution createCustRequestResolution() {
		CustRequestResolutionImpl custRequestResolution = new CustRequestResolutionImpl();
		return custRequestResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestStatus createCustRequestStatus() {
		CustRequestStatusImpl custRequestStatus = new CustRequestStatusImpl();
		return custRequestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestType createCustRequestType() {
		CustRequestTypeImpl custRequestType = new CustRequestTypeImpl();
		return custRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestTypeAttr createCustRequestTypeAttr() {
		CustRequestTypeAttrImpl custRequestTypeAttr = new CustRequestTypeAttrImpl();
		return custRequestTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestWorkEffort createCustRequestWorkEffort() {
		CustRequestWorkEffortImpl custRequestWorkEffort = new CustRequestWorkEffortImpl();
		return custRequestWorkEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RespondingParty createRespondingParty() {
		RespondingPartyImpl respondingParty = new RespondingPartyImpl();
		return respondingParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestPackage getRequestPackage() {
		return (RequestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequestPackage getPackage() {
		return RequestPackage.eINSTANCE;
	}

} //RequestFactoryImpl
