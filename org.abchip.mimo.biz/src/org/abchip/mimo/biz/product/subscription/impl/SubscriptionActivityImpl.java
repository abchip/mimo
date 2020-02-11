/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.subscription.SubscriptionActivity;
import org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionActivityImpl#getSubscriptionActivityId <em>Subscription Activity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionActivityImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionActivityImpl#getDateSent <em>Date Sent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionActivityImpl#getSubscriptionFulfillmentPieces <em>Subscription Fulfillment Pieces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionActivityImpl extends BizEntityImpl implements SubscriptionActivity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubscriptionPackage.Literals.SUBSCRIPTION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION_ACTIVITY__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION_ACTIVITY__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateSent() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION_ACTIVITY__DATE_SENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateSent(Date newDateSent) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION_ACTIVITY__DATE_SENT, newDateSent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SubscriptionFulfillmentPiece> getSubscriptionFulfillmentPieces() {
		return (List<SubscriptionFulfillmentPiece>)eGet(SubscriptionPackage.Literals.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_FULFILLMENT_PIECES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionActivityId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_ACTIVITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionActivityId(String newSubscriptionActivityId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_ACTIVITY_ID, newSubscriptionActivityId);
	}

} //SubscriptionActivityImpl
