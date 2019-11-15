/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.webapp.website.WebSite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getSubscriptionResourceId <em>Subscription Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getServiceNameOnExpiry <em>Service Name On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getParentResourceId <em>Parent Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getWebSiteId <em>Web Site Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionResource()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SubscriptionResource extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' reference.
	 * @see #setContentId(Content)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionResource_ContentId()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getContentId <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' reference.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(Content value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionResource_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Service Name On Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name On Expiry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name On Expiry</em>' attribute.
	 * @see #setServiceNameOnExpiry(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionResource_ServiceNameOnExpiry()
	 * @model
	 * @generated
	 */
	String getServiceNameOnExpiry();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getServiceNameOnExpiry <em>Service Name On Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name On Expiry</em>' attribute.
	 * @see #getServiceNameOnExpiry()
	 * @generated
	 */
	void setServiceNameOnExpiry(String value);

	/**
	 * Returns the value of the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Id</em>' reference.
	 * @see #setWebSiteId(WebSite)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionResource_WebSiteId()
	 * @model keys="webSiteId"
	 * @generated
	 */
	WebSite getWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getWebSiteId <em>Web Site Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Id</em>' reference.
	 * @see #getWebSiteId()
	 * @generated
	 */
	void setWebSiteId(WebSite value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SubscriptionResource' route='parentResourceId'"
	 * @generated
	 */
	List<String> childSubscriptionResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='subscriptionResourceId'"
	 * @generated
	 */
	List<String> subscriptions();

	/**
	 * Returns the value of the '<em><b>Parent Resource Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Resource Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resource Id</em>' reference.
	 * @see #setParentResourceId(SubscriptionResource)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionResource_ParentResourceId()
	 * @model keys="subscriptionResourceId"
	 * @generated
	 */
	SubscriptionResource getParentResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getParentResourceId <em>Parent Resource Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource Id</em>' reference.
	 * @see #getParentResourceId()
	 * @generated
	 */
	void setParentResourceId(SubscriptionResource value);

	/**
	 * Returns the value of the '<em><b>Subscription Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Resource Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Resource Id</em>' attribute.
	 * @see #setSubscriptionResourceId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscriptionResource_SubscriptionResourceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSubscriptionResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getSubscriptionResourceId <em>Subscription Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Resource Id</em>' attribute.
	 * @see #getSubscriptionResourceId()
	 * @generated
	 */
	void setSubscriptionResourceId(String value);

} // SubscriptionResource
