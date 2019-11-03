/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.abchip.mimo.biz.product.subscription.SubscriptionResource;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl#getSubscriptionResourceId <em>Subscription Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl#getParentResourceId <em>Parent Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl#getServiceNameOnExpiry <em>Service Name On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl#getWebSiteId <em>Web Site Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionResourceImpl extends BizEntityImpl implements SubscriptionResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSubscriptionResourceId() <em>Subscription Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionResourceId() <em>Subscription Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionResourceId()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionResourceId = SUBSCRIPTION_RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentResourceId() <em>Parent Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentResourceId() <em>Parent Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentResourceId()
	 * @generated
	 * @ordered
	 */
	protected String parentResourceId = PARENT_RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceNameOnExpiry() <em>Service Name On Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameOnExpiry()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_ON_EXPIRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceNameOnExpiry() <em>Service Name On Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameOnExpiry()
	 * @generated
	 * @ordered
	 */
	protected String serviceNameOnExpiry = SERVICE_NAME_ON_EXPIRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebSiteId() <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_SITE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebSiteId() <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected String webSiteId = WEB_SITE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubscriptionPackage.Literals.SUBSCRIPTION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_RESOURCE__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_RESOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceNameOnExpiry() {
		return serviceNameOnExpiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceNameOnExpiry(String newServiceNameOnExpiry) {
		String oldServiceNameOnExpiry = serviceNameOnExpiry;
		serviceNameOnExpiry = newServiceNameOnExpiry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_RESOURCE__SERVICE_NAME_ON_EXPIRY, oldServiceNameOnExpiry, serviceNameOnExpiry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebSiteId() {
		return webSiteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSiteId(String newWebSiteId) {
		String oldWebSiteId = webSiteId;
		webSiteId = newWebSiteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_RESOURCE__WEB_SITE_ID, oldWebSiteId, webSiteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childSubscriptionResources() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> subscriptions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentResourceId() {
		return parentResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentResourceId(String newParentResourceId) {
		String oldParentResourceId = parentResourceId;
		parentResourceId = newParentResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_RESOURCE__PARENT_RESOURCE_ID, oldParentResourceId, parentResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionResourceId() {
		return subscriptionResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionResourceId(String newSubscriptionResourceId) {
		String oldSubscriptionResourceId = subscriptionResourceId;
		subscriptionResourceId = newSubscriptionResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID, oldSubscriptionResourceId, subscriptionResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID:
				return getSubscriptionResourceId();
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__CONTENT_ID:
				return getContentId();
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__DESCRIPTION:
				return getDescription();
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__PARENT_RESOURCE_ID:
				return getParentResourceId();
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__SERVICE_NAME_ON_EXPIRY:
				return getServiceNameOnExpiry();
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__WEB_SITE_ID:
				return getWebSiteId();
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
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID:
				setSubscriptionResourceId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__PARENT_RESOURCE_ID:
				setParentResourceId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__SERVICE_NAME_ON_EXPIRY:
				setServiceNameOnExpiry((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__WEB_SITE_ID:
				setWebSiteId((String)newValue);
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
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID:
				setSubscriptionResourceId(SUBSCRIPTION_RESOURCE_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__PARENT_RESOURCE_ID:
				setParentResourceId(PARENT_RESOURCE_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__SERVICE_NAME_ON_EXPIRY:
				setServiceNameOnExpiry(SERVICE_NAME_ON_EXPIRY_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__WEB_SITE_ID:
				setWebSiteId(WEB_SITE_ID_EDEFAULT);
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
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID:
				return SUBSCRIPTION_RESOURCE_ID_EDEFAULT == null ? subscriptionResourceId != null : !SUBSCRIPTION_RESOURCE_ID_EDEFAULT.equals(subscriptionResourceId);
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__PARENT_RESOURCE_ID:
				return PARENT_RESOURCE_ID_EDEFAULT == null ? parentResourceId != null : !PARENT_RESOURCE_ID_EDEFAULT.equals(parentResourceId);
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__SERVICE_NAME_ON_EXPIRY:
				return SERVICE_NAME_ON_EXPIRY_EDEFAULT == null ? serviceNameOnExpiry != null : !SERVICE_NAME_ON_EXPIRY_EDEFAULT.equals(serviceNameOnExpiry);
			case SubscriptionPackage.SUBSCRIPTION_RESOURCE__WEB_SITE_ID:
				return WEB_SITE_ID_EDEFAULT == null ? webSiteId != null : !WEB_SITE_ID_EDEFAULT.equals(webSiteId);
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
		result.append(" (subscriptionResourceId: ");
		result.append(subscriptionResourceId);
		result.append(", contentId: ");
		result.append(contentId);
		result.append(", description: ");
		result.append(description);
		result.append(", parentResourceId: ");
		result.append(parentResourceId);
		result.append(", serviceNameOnExpiry: ");
		result.append(serviceNameOnExpiry);
		result.append(", webSiteId: ");
		result.append(webSiteId);
		result.append(')');
		return result.toString();
	}

} //SubscriptionResourceImpl
