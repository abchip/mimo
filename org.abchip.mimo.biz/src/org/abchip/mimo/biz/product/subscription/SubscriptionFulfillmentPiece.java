/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Fulfillment Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionActivityId <em>Subscription Activity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionId <em>Subscription Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionFulfillmentPiece()
 * @model
 * @generated
 */
public interface SubscriptionFulfillmentPiece extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Subscription Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' reference.
	 * @see #setSubscriptionId(Subscription)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionFulfillmentPiece_SubscriptionId()
	 * @model keys="subscriptionId"
	 * @generated
	 */
	Subscription getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionId <em>Subscription Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Id</em>' reference.
	 * @see #getSubscriptionId()
	 * @generated
	 */
	void setSubscriptionId(Subscription value);

	/**
	 * Returns the value of the '<em><b>Subscription Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Activity Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Activity Id</em>' attribute.
	 * @see #setSubscriptionActivityId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionFulfillmentPiece_SubscriptionActivityId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSubscriptionActivityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionActivityId <em>Subscription Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Activity Id</em>' attribute.
	 * @see #getSubscriptionActivityId()
	 * @generated
	 */
	void setSubscriptionActivityId(String value);

} // SubscriptionFulfillmentPiece
