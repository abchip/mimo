/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.ProductConfigItem;
import org.abchip.mimo.biz.product.config.ProductConfigOption;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Config Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getConfigItemName <em>Config Item Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getConfigItemProductConfigOptions <em>Config Item Product Config Options</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getConfigItemTypeId <em>Config Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getLongDescription <em>Long Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductConfigItemImpl extends BizEntityImpl implements ProductConfigItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductConfigItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PRODUCT_CONFIG_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigItemName() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemName(String newConfigItemName) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_NAME, newConfigItemName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductConfigOption> getConfigItemProductConfigOptions() {
		return (List<ProductConfigOption>)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_PRODUCT_CONFIG_OPTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigItemTypeId() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemTypeId(String newConfigItemTypeId) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_TYPE_ID, newConfigItemTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageUrl() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageUrl(String newImageUrl) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__IMAGE_URL, newImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongDescription() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__LONG_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDescription(String newLongDescription) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__LONG_DESCRIPTION, newLongDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigItemId() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemId(String newConfigItemId) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_ID, newConfigItemId);
	}

} //ProductConfigItemImpl
