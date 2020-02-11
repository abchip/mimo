/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.subscription.Subscription;
import org.abchip.mimo.biz.product.subscription.SubscriptionActivity;
import org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Fulfillment Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionFulfillmentPieceImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionFulfillmentPieceImpl#getSubscriptionActivityId <em>Subscription Activity Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionFulfillmentPieceImpl extends BizEntityImpl implements SubscriptionFulfillmentPiece {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionFulfillmentPieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubscriptionPackage.Literals.SUBSCRIPTION_FULFILLMENT_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscription getSubscriptionId() {
		return (Subscription)eGet(SubscriptionPackage.Literals.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionId(Subscription newSubscriptionId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ID, newSubscriptionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionActivity getSubscriptionActivityId() {
		return (SubscriptionActivity)eGet(SubscriptionPackage.Literals.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ACTIVITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionActivityId(SubscriptionActivity newSubscriptionActivityId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ACTIVITY_ID, newSubscriptionActivityId);
	}

} //SubscriptionFulfillmentPieceImpl
