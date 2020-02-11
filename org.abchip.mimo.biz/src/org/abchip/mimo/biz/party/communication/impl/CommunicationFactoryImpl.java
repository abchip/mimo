/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication.impl;

import org.abchip.mimo.biz.party.communication.*;
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
public class CommunicationFactoryImpl extends EFactoryImpl implements CommunicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationFactory init() {
		try {
			CommunicationFactory theCommunicationFactory = (CommunicationFactory)EPackage.Registry.INSTANCE.getEFactory(CommunicationPackage.eNS_URI);
			if (theCommunicationFactory != null) {
				return theCommunicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationFactoryImpl() {
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
			case CommunicationPackage.COMM_CONTENT_ASSOC_TYPE: return (EObject)createCommContentAssocType();
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC: return (EObject)createCommEventContentAssoc();
			case CommunicationPackage.COMMUNICATION_EVENT: return (EObject)createCommunicationEvent();
			case CommunicationPackage.COMMUNICATION_EVENT_PRODUCT: return (EObject)createCommunicationEventProduct();
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP: return (EObject)createCommunicationEventPrpTyp();
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE: return (EObject)createCommunicationEventPurpose();
			case CommunicationPackage.COMMUNICATION_EVENT_ROLE: return (EObject)createCommunicationEventRole();
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE: return (EObject)createCommunicationEventType();
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
	public CommContentAssocType createCommContentAssocType() {
		CommContentAssocTypeImpl commContentAssocType = new CommContentAssocTypeImpl();
		return commContentAssocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommEventContentAssoc createCommEventContentAssoc() {
		CommEventContentAssocImpl commEventContentAssoc = new CommEventContentAssocImpl();
		return commEventContentAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEvent createCommunicationEvent() {
		CommunicationEventImpl communicationEvent = new CommunicationEventImpl();
		return communicationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventProduct createCommunicationEventProduct() {
		CommunicationEventProductImpl communicationEventProduct = new CommunicationEventProductImpl();
		return communicationEventProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventPrpTyp createCommunicationEventPrpTyp() {
		CommunicationEventPrpTypImpl communicationEventPrpTyp = new CommunicationEventPrpTypImpl();
		return communicationEventPrpTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventPurpose createCommunicationEventPurpose() {
		CommunicationEventPurposeImpl communicationEventPurpose = new CommunicationEventPurposeImpl();
		return communicationEventPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventRole createCommunicationEventRole() {
		CommunicationEventRoleImpl communicationEventRole = new CommunicationEventRoleImpl();
		return communicationEventRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventType createCommunicationEventType() {
		CommunicationEventTypeImpl communicationEventType = new CommunicationEventTypeImpl();
		return communicationEventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationPackage getCommunicationPackage() {
		return (CommunicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationPackage getPackage() {
		return CommunicationPackage.eINSTANCE;
	}

} //CommunicationFactoryImpl
