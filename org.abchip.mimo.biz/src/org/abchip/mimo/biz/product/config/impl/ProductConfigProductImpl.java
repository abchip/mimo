/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.ProductConfigItem;
import org.abchip.mimo.biz.product.config.ProductConfigProduct;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Config Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigProductImpl#getConfigOptionId <em>Config Option Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigProductImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigProductImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigProductImpl#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigProductImpl#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductConfigProductImpl extends BizEntityImpl implements ProductConfigProduct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getConfigOptionId() <em>Config Option Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigOptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_OPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigOptionId() <em>Config Option Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigOptionId()
	 * @generated
	 * @ordered
	 */
	protected String configOptionId = CONFIG_OPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigItemId() <em>Config Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemId()
	 * @generated
	 * @ordered
	 */
	protected ProductConfigItem configItemId;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductConfigProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PRODUCT_CONFIG_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigOptionId() {
		return configOptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigOptionId(String newConfigOptionId) {
		configOptionId = newConfigOptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		productId = newProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		sequenceNum = newSequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigItem getConfigItemId() {
		if (configItemId != null && ((EObject)configItemId).eIsProxy()) {
			InternalEObject oldConfigItemId = (InternalEObject)configItemId;
			configItemId = (ProductConfigItem)eResolveProxy(oldConfigItemId);
			if (configItemId != oldConfigItemId) {
			}
		}
		return configItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductConfigItem basicGetConfigItemId() {
		return configItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemId(ProductConfigItem newConfigItemId) {
		configItemId = newConfigItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__CONFIG_OPTION_ID:
				return getConfigOptionId();
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__QUANTITY:
				return getQuantity();
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__SEQUENCE_NUM:
				return getSequenceNum();
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__CONFIG_ITEM_ID:
				if (resolve) return getConfigItemId();
				return basicGetConfigItemId();
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
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
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__CONFIG_OPTION_ID:
				setConfigOptionId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__CONFIG_ITEM_ID:
				setConfigItemId((ProductConfigItem)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__PRODUCT_ID:
				setProductId((Product)newValue);
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
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__CONFIG_OPTION_ID:
				setConfigOptionId(CONFIG_OPTION_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__CONFIG_ITEM_ID:
				setConfigItemId((ProductConfigItem)null);
				return;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__PRODUCT_ID:
				setProductId((Product)null);
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
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__CONFIG_OPTION_ID:
				return CONFIG_OPTION_ID_EDEFAULT == null ? configOptionId != null : !CONFIG_OPTION_ID_EDEFAULT.equals(configOptionId);
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__CONFIG_ITEM_ID:
				return configItemId != null;
			case ConfigPackage.PRODUCT_CONFIG_PRODUCT__PRODUCT_ID:
				return productId != null;
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
		result.append(" (configOptionId: ");
		result.append(configOptionId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //ProductConfigProductImpl
