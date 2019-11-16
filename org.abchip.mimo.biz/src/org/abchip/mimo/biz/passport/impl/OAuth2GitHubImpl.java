/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.passport.OAuth2GitHub;
import org.abchip.mimo.biz.passport.PassportPackage;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth2 Git Hub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl#getClientSecret <em>Client Secret</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl#getLocalRedirectUri <em>Local Redirect Uri</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl#getProductStoreId <em>Product Store Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuth2GitHubImpl extends BizEntityImpl implements OAuth2GitHub {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientId() <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientId()
	 * @generated
	 * @ordered
	 */
	protected String clientId = CLIENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientSecret() <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientSecret() <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSecret()
	 * @generated
	 * @ordered
	 */
	protected String clientSecret = CLIENT_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconUrl() <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconUrl() <em>Icon Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconUrl()
	 * @generated
	 * @ordered
	 */
	protected String iconUrl = ICON_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalRedirectUri() <em>Local Redirect Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalRedirectUri()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_REDIRECT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalRedirectUri() <em>Local Redirect Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalRedirectUri()
	 * @generated
	 * @ordered
	 */
	protected String localRedirectUri = LOCAL_REDIRECT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnUrl() <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnUrl() <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected String returnUrl = RETURN_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuth2GitHubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PassportPackage.Literals.OAUTH2_GIT_HUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PassportPackage.OAUTH2_GIT_HUB__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_GIT_HUB__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_GIT_HUB__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientId() {
		return clientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientId(String newClientId) {
		String oldClientId = clientId;
		clientId = newClientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_GIT_HUB__CLIENT_ID, oldClientId, clientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientSecret() {
		return clientSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientSecret(String newClientSecret) {
		String oldClientSecret = clientSecret;
		clientSecret = newClientSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_GIT_HUB__CLIENT_SECRET, oldClientSecret, clientSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIconUrl() {
		return iconUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconUrl(String newIconUrl) {
		String oldIconUrl = iconUrl;
		iconUrl = newIconUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_GIT_HUB__ICON_URL, oldIconUrl, iconUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalRedirectUri() {
		return localRedirectUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalRedirectUri(String newLocalRedirectUri) {
		String oldLocalRedirectUri = localRedirectUri;
		localRedirectUri = newLocalRedirectUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_GIT_HUB__LOCAL_REDIRECT_URI, oldLocalRedirectUri, localRedirectUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnUrl(String newReturnUrl) {
		String oldReturnUrl = returnUrl;
		returnUrl = newReturnUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_GIT_HUB__RETURN_URL, oldReturnUrl, returnUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_GIT_HUB__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PassportPackage.OAUTH2_GIT_HUB__FROM_DATE:
				return getFromDate();
			case PassportPackage.OAUTH2_GIT_HUB__CLIENT_ID:
				return getClientId();
			case PassportPackage.OAUTH2_GIT_HUB__CLIENT_SECRET:
				return getClientSecret();
			case PassportPackage.OAUTH2_GIT_HUB__ICON_URL:
				return getIconUrl();
			case PassportPackage.OAUTH2_GIT_HUB__LOCAL_REDIRECT_URI:
				return getLocalRedirectUri();
			case PassportPackage.OAUTH2_GIT_HUB__RETURN_URL:
				return getReturnUrl();
			case PassportPackage.OAUTH2_GIT_HUB__THRU_DATE:
				return getThruDate();
			case PassportPackage.OAUTH2_GIT_HUB__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
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
			case PassportPackage.OAUTH2_GIT_HUB__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__CLIENT_ID:
				setClientId((String)newValue);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__CLIENT_SECRET:
				setClientSecret((String)newValue);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__ICON_URL:
				setIconUrl((String)newValue);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__LOCAL_REDIRECT_URI:
				setLocalRedirectUri((String)newValue);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__RETURN_URL:
				setReturnUrl((String)newValue);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
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
			case PassportPackage.OAUTH2_GIT_HUB__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__CLIENT_ID:
				setClientId(CLIENT_ID_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__CLIENT_SECRET:
				setClientSecret(CLIENT_SECRET_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__ICON_URL:
				setIconUrl(ICON_URL_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__LOCAL_REDIRECT_URI:
				setLocalRedirectUri(LOCAL_REDIRECT_URI_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__RETURN_URL:
				setReturnUrl(RETURN_URL_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_GIT_HUB__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
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
			case PassportPackage.OAUTH2_GIT_HUB__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PassportPackage.OAUTH2_GIT_HUB__CLIENT_ID:
				return CLIENT_ID_EDEFAULT == null ? clientId != null : !CLIENT_ID_EDEFAULT.equals(clientId);
			case PassportPackage.OAUTH2_GIT_HUB__CLIENT_SECRET:
				return CLIENT_SECRET_EDEFAULT == null ? clientSecret != null : !CLIENT_SECRET_EDEFAULT.equals(clientSecret);
			case PassportPackage.OAUTH2_GIT_HUB__ICON_URL:
				return ICON_URL_EDEFAULT == null ? iconUrl != null : !ICON_URL_EDEFAULT.equals(iconUrl);
			case PassportPackage.OAUTH2_GIT_HUB__LOCAL_REDIRECT_URI:
				return LOCAL_REDIRECT_URI_EDEFAULT == null ? localRedirectUri != null : !LOCAL_REDIRECT_URI_EDEFAULT.equals(localRedirectUri);
			case PassportPackage.OAUTH2_GIT_HUB__RETURN_URL:
				return RETURN_URL_EDEFAULT == null ? returnUrl != null : !RETURN_URL_EDEFAULT.equals(returnUrl);
			case PassportPackage.OAUTH2_GIT_HUB__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PassportPackage.OAUTH2_GIT_HUB__PRODUCT_STORE_ID:
				return productStoreId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", clientId: ");
		result.append(clientId);
		result.append(", clientSecret: ");
		result.append(clientSecret);
		result.append(", iconUrl: ");
		result.append(iconUrl);
		result.append(", localRedirectUri: ");
		result.append(localRedirectUri);
		result.append(", returnUrl: ");
		result.append(returnUrl);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //OAuth2GitHubImpl
