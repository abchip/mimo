/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.product.ProductMeter;
import org.abchip.mimo.biz.product.product.ProductMeterType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Meter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMeterTypeImpl#getProductMeterTypeId <em>Product Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMeterTypeImpl#getDefaultUomId <em>Default Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMeterTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductMeterTypeImpl extends BizEntityTypeImpl<ProductMeter> implements ProductMeterType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductMeterTypeId() <em>Product Meter Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMeterTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_METER_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductMeterTypeId() <em>Product Meter Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMeterTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productMeterTypeId = PRODUCT_METER_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultUomId() <em>Default Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultUomId() <em>Default Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUomId()
	 * @generated
	 * @ordered
	 */
	protected String defaultUomId = DEFAULT_UOM_ID_EDEFAULT;

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
	protected ProductMeterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_METER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultUomId() {
		return defaultUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultUomId(String newDefaultUomId) {
		String oldDefaultUomId = defaultUomId;
		defaultUomId = newDefaultUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_METER_TYPE__DEFAULT_UOM_ID, oldDefaultUomId, defaultUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_METER_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> intervalFixedAssetMaints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> intervalProductMaints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productMeters() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductMeterTypeId() {
		return productMeterTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductMeterTypeId(String newProductMeterTypeId) {
		String oldProductMeterTypeId = productMeterTypeId;
		productMeterTypeId = newProductMeterTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_METER_TYPE__PRODUCT_METER_TYPE_ID, oldProductMeterTypeId, productMeterTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_METER_TYPE__PRODUCT_METER_TYPE_ID:
				return getProductMeterTypeId();
			case ProductPackage.PRODUCT_METER_TYPE__DEFAULT_UOM_ID:
				return getDefaultUomId();
			case ProductPackage.PRODUCT_METER_TYPE__DESCRIPTION:
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
			case ProductPackage.PRODUCT_METER_TYPE__PRODUCT_METER_TYPE_ID:
				setProductMeterTypeId((String)newValue);
				return;
			case ProductPackage.PRODUCT_METER_TYPE__DEFAULT_UOM_ID:
				setDefaultUomId((String)newValue);
				return;
			case ProductPackage.PRODUCT_METER_TYPE__DESCRIPTION:
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
			case ProductPackage.PRODUCT_METER_TYPE__PRODUCT_METER_TYPE_ID:
				setProductMeterTypeId(PRODUCT_METER_TYPE_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_METER_TYPE__DEFAULT_UOM_ID:
				setDefaultUomId(DEFAULT_UOM_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_METER_TYPE__DESCRIPTION:
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
			case ProductPackage.PRODUCT_METER_TYPE__PRODUCT_METER_TYPE_ID:
				return PRODUCT_METER_TYPE_ID_EDEFAULT == null ? productMeterTypeId != null : !PRODUCT_METER_TYPE_ID_EDEFAULT.equals(productMeterTypeId);
			case ProductPackage.PRODUCT_METER_TYPE__DEFAULT_UOM_ID:
				return DEFAULT_UOM_ID_EDEFAULT == null ? defaultUomId != null : !DEFAULT_UOM_ID_EDEFAULT.equals(defaultUomId);
			case ProductPackage.PRODUCT_METER_TYPE__DESCRIPTION:
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
		result.append(" (productMeterTypeId: ");
		result.append(productMeterTypeId);
		result.append(", defaultUomId: ");
		result.append(defaultUomId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProductMeterTypeImpl
