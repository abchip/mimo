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
 * A representation of the model object '<em><b>Subscription Type Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getSubscriptionTypeId <em>Subscription Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionTypeAttr()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SubscriptionTypeAttr extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionTypeAttr_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionTypeAttr_AttrName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Type Id</em>' attribute.
	 * @see #setSubscriptionTypeId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionTypeAttr_SubscriptionTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSubscriptionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getSubscriptionTypeId <em>Subscription Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Type Id</em>' attribute.
	 * @see #getSubscriptionTypeId()
	 * @generated
	 */
	void setSubscriptionTypeId(String value);

} // SubscriptionTypeAttr
