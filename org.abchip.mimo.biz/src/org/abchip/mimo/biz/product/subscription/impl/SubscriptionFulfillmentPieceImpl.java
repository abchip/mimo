/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Fulfillment Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionFulfillmentPieceImpl#getSubscriptionActivityId <em>Subscription Activity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionFulfillmentPieceImpl#getSubscriptionId <em>Subscription Id</em>}</li>
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
	 * The default value of the '{@link #getSubscriptionActivityId() <em>Subscription Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionActivityId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_ACTIVITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionActivityId() <em>Subscription Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionActivityId()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionActivityId = SUBSCRIPTION_ACTIVITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionId = SUBSCRIPTION_ID_EDEFAULT;

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
	public String getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionId(String newSubscriptionId) {
		String oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionActivityId() {
		return subscriptionActivityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionActivityId(String newSubscriptionActivityId) {
		String oldSubscriptionActivityId = subscriptionActivityId;
		subscriptionActivityId = newSubscriptionActivityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ACTIVITY_ID, oldSubscriptionActivityId, subscriptionActivityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ACTIVITY_ID:
				return getSubscriptionActivityId();
			case SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ID:
				return getSubscriptionId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ACTIVITY_ID:
				setSubscriptionActivityId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ID:
				setSubscriptionId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ACTIVITY_ID:
				setSubscriptionActivityId(SUBSCRIPTION_ACTIVITY_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ID:
				setSubscriptionId(SUBSCRIPTION_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ACTIVITY_ID:
				return SUBSCRIPTION_ACTIVITY_ID_EDEFAULT == null ? subscriptionActivityId != null : !SUBSCRIPTION_ACTIVITY_ID_EDEFAULT.equals(subscriptionActivityId);
			case SubscriptionPackage.SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ID:
				return SUBSCRIPTION_ID_EDEFAULT == null ? subscriptionId != null : !SUBSCRIPTION_ID_EDEFAULT.equals(subscriptionId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (subscriptionActivityId: ");
		result.append(subscriptionActivityId);
		result.append(", subscriptionId: ");
		result.append(subscriptionId);
		result.append(')');
		return result.toString();
	}

} //SubscriptionFulfillmentPieceImpl
