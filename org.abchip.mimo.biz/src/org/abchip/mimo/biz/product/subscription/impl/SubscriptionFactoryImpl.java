/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import org.abchip.mimo.biz.product.subscription.*;
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
public class SubscriptionFactoryImpl extends EFactoryImpl implements SubscriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubscriptionFactory init() {
		try {
			SubscriptionFactory theSubscriptionFactory = (SubscriptionFactory)EPackage.Registry.INSTANCE.getEFactory(SubscriptionPackage.eNS_URI);
			if (theSubscriptionFactory != null) {
				return theSubscriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SubscriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionFactoryImpl() {
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
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE: return (EObject)createProductSubscriptionResource();
			case SubscriptionPackage.SUBSCRIPTION: return (EObject)createSubscription();
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY: return (EObject)createSubscriptionActivity();
			case SubscriptionPackage.SUBSCRIPTION_ATTRIBUTE: return (EObject)createSubscriptionAttribute();
			case SubscriptionPackage.SUBSCRIPTION_COMM_EVENT: return (EObject)createSubscriptionCommEvent();
			case SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE: return (EObject)createSubscriptionFulfillmentPiece();
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE: return (EObject)createSubscriptionResource();
			case SubscriptionPackage.SUBSCRIPTION_TYPE: return (EObject)createSubscriptionType();
			case SubscriptionPackage.SUBSCRIPTION_TYPE_ATTR: return (EObject)createSubscriptionTypeAttr();
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
	public ProductSubscriptionResource createProductSubscriptionResource() {
		ProductSubscriptionResourceImpl productSubscriptionResource = new ProductSubscriptionResourceImpl();
		return productSubscriptionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionActivity createSubscriptionActivity() {
		SubscriptionActivityImpl subscriptionActivity = new SubscriptionActivityImpl();
		return subscriptionActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionAttribute createSubscriptionAttribute() {
		SubscriptionAttributeImpl subscriptionAttribute = new SubscriptionAttributeImpl();
		return subscriptionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionCommEvent createSubscriptionCommEvent() {
		SubscriptionCommEventImpl subscriptionCommEvent = new SubscriptionCommEventImpl();
		return subscriptionCommEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionFulfillmentPiece createSubscriptionFulfillmentPiece() {
		SubscriptionFulfillmentPieceImpl subscriptionFulfillmentPiece = new SubscriptionFulfillmentPieceImpl();
		return subscriptionFulfillmentPiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionResource createSubscriptionResource() {
		SubscriptionResourceImpl subscriptionResource = new SubscriptionResourceImpl();
		return subscriptionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionType createSubscriptionType() {
		SubscriptionTypeImpl subscriptionType = new SubscriptionTypeImpl();
		return subscriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionTypeAttr createSubscriptionTypeAttr() {
		SubscriptionTypeAttrImpl subscriptionTypeAttr = new SubscriptionTypeAttrImpl();
		return subscriptionTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionPackage getSubscriptionPackage() {
		return (SubscriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SubscriptionPackage getPackage() {
		return SubscriptionPackage.eINSTANCE;
	}

} //SubscriptionFactoryImpl
