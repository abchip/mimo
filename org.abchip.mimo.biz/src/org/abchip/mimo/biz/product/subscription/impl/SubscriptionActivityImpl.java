/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.subscription.SubscriptionActivity;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateSent() <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSent()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateSent() <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSent()
	 * @generated
	 * @ordered
	 */
	protected Date dateSent = DATE_SENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscriptionFulfillmentPieces() <em>Subscription Fulfillment Pieces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionFulfillmentPieces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subscriptionFulfillmentPieces;

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
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateSent() {
		return dateSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateSent(Date newDateSent) {
		dateSent = newDateSent;
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
		subscriptionActivityId = newSubscriptionActivityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSubscriptionFulfillmentPieces() {
		if (subscriptionFulfillmentPieces == null) {
			subscriptionFulfillmentPieces = new BasicInternalEList<String>(String.class);
		}
		return subscriptionFulfillmentPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_ACTIVITY_ID:
				return getSubscriptionActivityId();
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__COMMENTS:
				return getComments();
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__DATE_SENT:
				return getDateSent();
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_FULFILLMENT_PIECES:
				return getSubscriptionFulfillmentPieces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_ACTIVITY_ID:
				setSubscriptionActivityId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__COMMENTS:
				setComments((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__DATE_SENT:
				setDateSent((Date)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_FULFILLMENT_PIECES:
				getSubscriptionFulfillmentPieces().clear();
				getSubscriptionFulfillmentPieces().addAll((Collection<? extends String>)newValue);
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
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_ACTIVITY_ID:
				setSubscriptionActivityId(SUBSCRIPTION_ACTIVITY_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__DATE_SENT:
				setDateSent(DATE_SENT_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_FULFILLMENT_PIECES:
				getSubscriptionFulfillmentPieces().clear();
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
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_ACTIVITY_ID:
				return SUBSCRIPTION_ACTIVITY_ID_EDEFAULT == null ? subscriptionActivityId != null : !SUBSCRIPTION_ACTIVITY_ID_EDEFAULT.equals(subscriptionActivityId);
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__DATE_SENT:
				return DATE_SENT_EDEFAULT == null ? dateSent != null : !DATE_SENT_EDEFAULT.equals(dateSent);
			case SubscriptionPackage.SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_FULFILLMENT_PIECES:
				return subscriptionFulfillmentPieces != null && !subscriptionFulfillmentPieces.isEmpty();
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
		result.append(", comments: ");
		result.append(comments);
		result.append(", dateSent: ");
		result.append(dateSent);
		result.append(", subscriptionFulfillmentPieces: ");
		result.append(subscriptionFulfillmentPieces);
		result.append(')');
		return result.toString();
	}

} //SubscriptionActivityImpl
