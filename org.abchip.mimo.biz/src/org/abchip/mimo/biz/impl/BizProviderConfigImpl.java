/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.impl;

import org.abchip.mimo.biz.BizLoginType;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.BizProviderConfig;
import org.abchip.mimo.biz.BizProviderUser;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OF Biz Provider Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderConfigImpl#getLoginType <em>Login Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderConfigImpl#getPublicUser <em>Public User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderConfigImpl#getSystemUser <em>System User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BizProviderConfigImpl extends EntityImpl implements BizProviderConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BizProviderConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BizPackage.Literals.BIZ_PROVIDER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eGet(BizPackage.Literals.BIZ_PROVIDER_CONFIG__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eSet(BizPackage.Literals.BIZ_PROVIDER_CONFIG__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizProviderUser getPublicUser() {
		return (BizProviderUser)eGet(BizPackage.Literals.BIZ_PROVIDER_CONFIG__PUBLIC_USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicUser(BizProviderUser newPublicUser) {
		eSet(BizPackage.Literals.BIZ_PROVIDER_CONFIG__PUBLIC_USER, newPublicUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizProviderUser getSystemUser() {
		return (BizProviderUser)eGet(BizPackage.Literals.BIZ_PROVIDER_CONFIG__SYSTEM_USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemUser(BizProviderUser newSystemUser) {
		eSet(BizPackage.Literals.BIZ_PROVIDER_CONFIG__SYSTEM_USER, newSystemUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizLoginType getLoginType() {
		return (BizLoginType)eGet(BizPackage.Literals.BIZ_PROVIDER_CONFIG__LOGIN_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginType(BizLoginType newLoginType) {
		eSet(BizPackage.Literals.BIZ_PROVIDER_CONFIG__LOGIN_TYPE, newLoginType);
	}

} //BizProviderConfigImpl
