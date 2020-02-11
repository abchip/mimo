/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getSubscriptionActivityId <em>Subscription Activity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getDateSent <em>Date Sent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getSubscriptionFulfillmentPieces <em>Subscription Fulfillment Pieces</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionActivity()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface SubscriptionActivity extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionActivity_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Date Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Sent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Sent</em>' attribute.
	 * @see #setDateSent(Date)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionActivity_DateSent()
	 * @model
	 * @generated
	 */
	Date getDateSent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getDateSent <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Sent</em>' attribute.
	 * @see #getDateSent()
	 * @generated
	 */
	void setDateSent(Date value);

	/**
	 * Returns the value of the '<em><b>Subscription Fulfillment Pieces</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Fulfillment Pieces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Fulfillment Pieces</em>' reference list.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionActivity_SubscriptionFulfillmentPieces()
	 * @model derived="true"
	 * @generated
	 */
	List<SubscriptionFulfillmentPiece> getSubscriptionFulfillmentPieces();

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionActivity_SubscriptionActivityId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSubscriptionActivityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getSubscriptionActivityId <em>Subscription Activity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Activity Id</em>' attribute.
	 * @see #getSubscriptionActivityId()
	 * @generated
	 */
	void setSubscriptionActivityId(String value);

} // SubscriptionActivity
