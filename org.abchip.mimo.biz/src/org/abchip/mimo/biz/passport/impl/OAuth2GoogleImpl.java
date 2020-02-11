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
import org.abchip.mimo.biz.passport.OAuth2Google;
import org.abchip.mimo.biz.passport.PassportPackage;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth2 Google</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl#getClientSecret <em>Client Secret</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl#getIconUrl <em>Icon Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl#getLocalRedirectUri <em>Local Redirect Uri</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuth2GoogleImpl extends BizEntityImpl implements OAuth2Google {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuth2GoogleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PassportPackage.Literals.OAUTH2_GOOGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		return (ProductStore)eGet(PassportPackage.Literals.OAUTH2_GOOGLE__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(PassportPackage.Literals.OAUTH2_GOOGLE__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(PassportPackage.Literals.OAUTH2_GOOGLE__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(PassportPackage.Literals.OAUTH2_GOOGLE__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientId() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_GOOGLE__CLIENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientId(String newClientId) {
		eSet(PassportPackage.Literals.OAUTH2_GOOGLE__CLIENT_ID, newClientId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientSecret() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_GOOGLE__CLIENT_SECRET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientSecret(String newClientSecret) {
		eSet(PassportPackage.Literals.OAUTH2_GOOGLE__CLIENT_SECRET, newClientSecret);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIconUrl() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_GOOGLE__ICON_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconUrl(String newIconUrl) {
		eSet(PassportPackage.Literals.OAUTH2_GOOGLE__ICON_URL, newIconUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalRedirectUri() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_GOOGLE__LOCAL_REDIRECT_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalRedirectUri(String newLocalRedirectUri) {
		eSet(PassportPackage.Literals.OAUTH2_GOOGLE__LOCAL_REDIRECT_URI, newLocalRedirectUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnUrl() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_GOOGLE__RETURN_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnUrl(String newReturnUrl) {
		eSet(PassportPackage.Literals.OAUTH2_GOOGLE__RETURN_URL, newReturnUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(PassportPackage.Literals.OAUTH2_GOOGLE__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(PassportPackage.Literals.OAUTH2_GOOGLE__THRU_DATE, newThruDate);
	}

} //OAuth2GoogleImpl
