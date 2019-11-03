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
 * A representation of the model object '<em><b>Subscription Comm Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent#getCommunicationEventId <em>Communication Event Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionCommEvent()
 * @model
 * @generated
 */
public interface SubscriptionCommEvent extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Id</em>' attribute.
	 * @see #setCommunicationEventId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionCommEvent_CommunicationEventId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEvent'"
	 * @generated
	 */
	String getCommunicationEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent#getCommunicationEventId <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Id</em>' attribute.
	 * @see #getCommunicationEventId()
	 * @generated
	 */
	void setCommunicationEventId(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #setSubscriptionId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionCommEvent_SubscriptionId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Subscription'"
	 * @generated
	 */
	String getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Id</em>' attribute.
	 * @see #getSubscriptionId()
	 * @generated
	 */
	void setSubscriptionId(String value);

} // SubscriptionCommEvent
