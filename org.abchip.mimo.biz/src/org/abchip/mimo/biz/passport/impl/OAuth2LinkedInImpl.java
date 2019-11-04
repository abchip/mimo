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
import org.abchip.mimo.biz.passport.OAuth2LinkedIn;
import org.abchip.mimo.biz.passport.PassportPackage;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth2 Linked In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getLiveReturnUrl <em>Live Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getLocalRedirectUri <em>Local Redirect Uri</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getTestReturnUrl <em>Test Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getProductStoreId <em>Product Store Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuth2LinkedInImpl extends BizEntityImpl implements OAuth2LinkedIn {
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
	 * The default value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected String apiKey = API_KEY_EDEFAULT;

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
	 * The default value of the '{@link #getLiveReturnUrl() <em>Live Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiveReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String LIVE_RETURN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiveReturnUrl() <em>Live Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiveReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected String liveReturnUrl = LIVE_RETURN_URL_EDEFAULT;

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
	 * The default value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected String secretKey = SECRET_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestReturnUrl() <em>Test Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_RETURN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestReturnUrl() <em>Test Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected String testReturnUrl = TEST_RETURN_URL_EDEFAULT;

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
	protected OAuth2LinkedInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PassportPackage.Literals.OAUTH2_LINKED_IN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PassportPackage.OAUTH2_LINKED_IN__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_LINKED_IN__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_LINKED_IN__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiKey(String newApiKey) {
		String oldApiKey = apiKey;
		apiKey = newApiKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_LINKED_IN__API_KEY, oldApiKey, apiKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_LINKED_IN__ICON_URL, oldIconUrl, iconUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiveReturnUrl() {
		return liveReturnUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiveReturnUrl(String newLiveReturnUrl) {
		String oldLiveReturnUrl = liveReturnUrl;
		liveReturnUrl = newLiveReturnUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_LINKED_IN__LIVE_RETURN_URL, oldLiveReturnUrl, liveReturnUrl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI, oldLocalRedirectUri, localRedirectUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecretKey(String newSecretKey) {
		String oldSecretKey = secretKey;
		secretKey = newSecretKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_LINKED_IN__SECRET_KEY, oldSecretKey, secretKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestReturnUrl() {
		return testReturnUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestReturnUrl(String newTestReturnUrl) {
		String oldTestReturnUrl = testReturnUrl;
		testReturnUrl = newTestReturnUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_LINKED_IN__TEST_RETURN_URL, oldTestReturnUrl, testReturnUrl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.OAUTH2_LINKED_IN__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PassportPackage.OAUTH2_LINKED_IN__FROM_DATE:
				return getFromDate();
			case PassportPackage.OAUTH2_LINKED_IN__API_KEY:
				return getApiKey();
			case PassportPackage.OAUTH2_LINKED_IN__ICON_URL:
				return getIconUrl();
			case PassportPackage.OAUTH2_LINKED_IN__LIVE_RETURN_URL:
				return getLiveReturnUrl();
			case PassportPackage.OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI:
				return getLocalRedirectUri();
			case PassportPackage.OAUTH2_LINKED_IN__SECRET_KEY:
				return getSecretKey();
			case PassportPackage.OAUTH2_LINKED_IN__TEST_RETURN_URL:
				return getTestReturnUrl();
			case PassportPackage.OAUTH2_LINKED_IN__THRU_DATE:
				return getThruDate();
			case PassportPackage.OAUTH2_LINKED_IN__PRODUCT_STORE_ID:
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
			case PassportPackage.OAUTH2_LINKED_IN__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__API_KEY:
				setApiKey((String)newValue);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__ICON_URL:
				setIconUrl((String)newValue);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__LIVE_RETURN_URL:
				setLiveReturnUrl((String)newValue);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI:
				setLocalRedirectUri((String)newValue);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__SECRET_KEY:
				setSecretKey((String)newValue);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__TEST_RETURN_URL:
				setTestReturnUrl((String)newValue);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__PRODUCT_STORE_ID:
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
			case PassportPackage.OAUTH2_LINKED_IN__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__API_KEY:
				setApiKey(API_KEY_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__ICON_URL:
				setIconUrl(ICON_URL_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__LIVE_RETURN_URL:
				setLiveReturnUrl(LIVE_RETURN_URL_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI:
				setLocalRedirectUri(LOCAL_REDIRECT_URI_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__SECRET_KEY:
				setSecretKey(SECRET_KEY_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__TEST_RETURN_URL:
				setTestReturnUrl(TEST_RETURN_URL_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PassportPackage.OAUTH2_LINKED_IN__PRODUCT_STORE_ID:
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
			case PassportPackage.OAUTH2_LINKED_IN__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PassportPackage.OAUTH2_LINKED_IN__API_KEY:
				return API_KEY_EDEFAULT == null ? apiKey != null : !API_KEY_EDEFAULT.equals(apiKey);
			case PassportPackage.OAUTH2_LINKED_IN__ICON_URL:
				return ICON_URL_EDEFAULT == null ? iconUrl != null : !ICON_URL_EDEFAULT.equals(iconUrl);
			case PassportPackage.OAUTH2_LINKED_IN__LIVE_RETURN_URL:
				return LIVE_RETURN_URL_EDEFAULT == null ? liveReturnUrl != null : !LIVE_RETURN_URL_EDEFAULT.equals(liveReturnUrl);
			case PassportPackage.OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI:
				return LOCAL_REDIRECT_URI_EDEFAULT == null ? localRedirectUri != null : !LOCAL_REDIRECT_URI_EDEFAULT.equals(localRedirectUri);
			case PassportPackage.OAUTH2_LINKED_IN__SECRET_KEY:
				return SECRET_KEY_EDEFAULT == null ? secretKey != null : !SECRET_KEY_EDEFAULT.equals(secretKey);
			case PassportPackage.OAUTH2_LINKED_IN__TEST_RETURN_URL:
				return TEST_RETURN_URL_EDEFAULT == null ? testReturnUrl != null : !TEST_RETURN_URL_EDEFAULT.equals(testReturnUrl);
			case PassportPackage.OAUTH2_LINKED_IN__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PassportPackage.OAUTH2_LINKED_IN__PRODUCT_STORE_ID:
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
		result.append(", apiKey: ");
		result.append(apiKey);
		result.append(", iconUrl: ");
		result.append(iconUrl);
		result.append(", liveReturnUrl: ");
		result.append(liveReturnUrl);
		result.append(", localRedirectUri: ");
		result.append(localRedirectUri);
		result.append(", secretKey: ");
		result.append(secretKey);
		result.append(", testReturnUrl: ");
		result.append(testReturnUrl);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //OAuth2LinkedInImpl
