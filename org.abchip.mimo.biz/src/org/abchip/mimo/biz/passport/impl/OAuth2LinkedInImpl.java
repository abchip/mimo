/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth2 Linked In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getLiveReturnUrl <em>Live Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getLocalRedirectUri <em>Local Redirect Uri</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getTestReturnUrl <em>Test Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl#getThruDate <em>Thru Date</em>}</li>
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
		return (ProductStore)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiKey() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__API_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiKey(String newApiKey) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__API_KEY, newApiKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIconUrl() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__ICON_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconUrl(String newIconUrl) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__ICON_URL, newIconUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiveReturnUrl() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__LIVE_RETURN_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiveReturnUrl(String newLiveReturnUrl) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__LIVE_RETURN_URL, newLiveReturnUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalRedirectUri() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalRedirectUri(String newLocalRedirectUri) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI, newLocalRedirectUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecretKey() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__SECRET_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecretKey(String newSecretKey) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__SECRET_KEY, newSecretKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestReturnUrl() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__TEST_RETURN_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestReturnUrl(String newTestReturnUrl) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__TEST_RETURN_URL, newTestReturnUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__THRU_DATE, newThruDate);
	}

} //OAuth2LinkedInImpl
