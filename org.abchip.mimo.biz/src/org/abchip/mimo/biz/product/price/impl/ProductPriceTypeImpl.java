/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.price.ProductPriceType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Price Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceTypeImpl#getProductPriceTypeId <em>Product Price Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPriceTypeImpl extends BizEntityTypeImpl<ProductPrice> implements ProductPriceType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductPriceTypeId() <em>Product Price Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPriceTypeId() <em>Product Price Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productPriceTypeId = PRODUCT_PRICE_TYPE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPriceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRODUCT_PRICE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceTypeId() {
		return productPriceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceTypeId(String newProductPriceTypeId) {
		String oldProductPriceTypeId = productPriceTypeId;
		productPriceTypeId = newProductPriceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_TYPE__PRODUCT_PRICE_TYPE_ID, oldProductPriceTypeId, productPriceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE_TYPE__PRODUCT_PRICE_TYPE_ID:
				return getProductPriceTypeId();
			case PricePackage.PRODUCT_PRICE_TYPE__DESCRIPTION:
				return getDescription();
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
			case PricePackage.PRODUCT_PRICE_TYPE__PRODUCT_PRICE_TYPE_ID:
				setProductPriceTypeId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case PricePackage.PRODUCT_PRICE_TYPE__PRODUCT_PRICE_TYPE_ID:
				setProductPriceTypeId(PRODUCT_PRICE_TYPE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case PricePackage.PRODUCT_PRICE_TYPE__PRODUCT_PRICE_TYPE_ID:
				return PRODUCT_PRICE_TYPE_ID_EDEFAULT == null ? productPriceTypeId != null : !PRODUCT_PRICE_TYPE_ID_EDEFAULT.equals(productPriceTypeId);
			case PricePackage.PRODUCT_PRICE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (productPriceTypeId: ");
		result.append(productPriceTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProductPriceTypeImpl