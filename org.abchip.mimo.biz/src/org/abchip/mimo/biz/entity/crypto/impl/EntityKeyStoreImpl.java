/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.crypto.impl;

import org.abchip.mimo.biz.entity.crypto.CryptoPackage;
import org.abchip.mimo.biz.entity.crypto.EntityKeyStore;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Key Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.crypto.impl.EntityKeyStoreImpl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.crypto.impl.EntityKeyStoreImpl#getKeyText <em>Key Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityKeyStoreImpl extends BizEntityImpl implements EntityKeyStore {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityKeyStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoPackage.Literals.ENTITY_KEY_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyName() {
		return (String)eGet(CryptoPackage.Literals.ENTITY_KEY_STORE__KEY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyName(String newKeyName) {
		eSet(CryptoPackage.Literals.ENTITY_KEY_STORE__KEY_NAME, newKeyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyText() {
		return (String)eGet(CryptoPackage.Literals.ENTITY_KEY_STORE__KEY_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyText(String newKeyText) {
		eSet(CryptoPackage.Literals.ENTITY_KEY_STORE__KEY_TEXT, newKeyText);
	}

} //EntityKeyStoreImpl
