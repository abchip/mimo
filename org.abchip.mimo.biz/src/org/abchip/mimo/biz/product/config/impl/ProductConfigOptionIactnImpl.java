/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.ProductConfigItem;
import org.abchip.mimo.biz.product.config.ProductConfigOptionIactn;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Config Option Iactn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigItemIdTo <em>Config Item Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigOptionId <em>Config Option Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigOptionIdTo <em>Config Option Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigIactnTypeId <em>Config Iactn Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductConfigOptionIactnImpl extends BizEntityImpl implements ProductConfigOptionIactn {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductConfigOptionIactnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigIactnTypeId() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigIactnTypeId(String newConfigIactnTypeId) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID, newConfigIactnTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigOptionId() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigOptionId(String newConfigOptionId) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID, newConfigOptionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigOptionIdTo() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigOptionIdTo(String newConfigOptionIdTo) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO, newConfigOptionIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return (Long)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigItem getConfigItemId() {
		return (ProductConfigItem)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemId(ProductConfigItem newConfigItemId) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID, newConfigItemId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigItem getConfigItemIdTo() {
		return (ProductConfigItem)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemIdTo(ProductConfigItem newConfigItemIdTo) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO, newConfigItemIdTo);
	}

} //ProductConfigOptionIactnImpl
