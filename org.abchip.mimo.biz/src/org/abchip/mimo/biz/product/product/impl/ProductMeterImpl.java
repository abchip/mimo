/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductMeter;
import org.abchip.mimo.biz.product.product.ProductMeterType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMeterImpl#getMeterName <em>Meter Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMeterImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMeterImpl#getProductMeterTypeId <em>Product Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMeterImpl#getMeterUomId <em>Meter Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductMeterImpl extends BizEntityTypedImpl<ProductMeterType> implements ProductMeter {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getMeterName() <em>Meter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterName()
	 * @generated
	 * @ordered
	 */
	protected static final String METER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeterName() <em>Meter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterName()
	 * @generated
	 * @ordered
	 */
	protected String meterName = METER_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getProductMeterTypeId() <em>Product Meter Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMeterTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductMeterType productMeterTypeId;

	/**
	 * The cached value of the '{@link #getMeterUomId() <em>Meter Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom meterUomId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeterName() {
		return meterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterName(String newMeterName) {
		meterName = newMeterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getMeterUomId() {
		if (meterUomId != null && ((EObject)meterUomId).eIsProxy()) {
			InternalEObject oldMeterUomId = (InternalEObject)meterUomId;
			meterUomId = (Uom)eResolveProxy(oldMeterUomId);
			if (meterUomId != oldMeterUomId) {
			}
		}
		return meterUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetMeterUomId() {
		return meterUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterUomId(Uom newMeterUomId) {
		meterUomId = newMeterUomId;
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
	public ProductMeterType getProductMeterTypeId() {
		if (productMeterTypeId != null && ((EObject)productMeterTypeId).eIsProxy()) {
			InternalEObject oldProductMeterTypeId = (InternalEObject)productMeterTypeId;
			productMeterTypeId = (ProductMeterType)eResolveProxy(oldProductMeterTypeId);
			if (productMeterTypeId != oldProductMeterTypeId) {
			}
		}
		return productMeterTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductMeterType basicGetProductMeterTypeId() {
		return productMeterTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductMeterTypeId(ProductMeterType newProductMeterTypeId) {
		productMeterTypeId = newProductMeterTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_METER__METER_NAME:
				return getMeterName();
			case ProductPackage.PRODUCT_METER__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case ProductPackage.PRODUCT_METER__PRODUCT_METER_TYPE_ID:
				if (resolve) return getProductMeterTypeId();
				return basicGetProductMeterTypeId();
			case ProductPackage.PRODUCT_METER__METER_UOM_ID:
				if (resolve) return getMeterUomId();
				return basicGetMeterUomId();
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
			case ProductPackage.PRODUCT_METER__METER_NAME:
				setMeterName((String)newValue);
				return;
			case ProductPackage.PRODUCT_METER__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case ProductPackage.PRODUCT_METER__PRODUCT_METER_TYPE_ID:
				setProductMeterTypeId((ProductMeterType)newValue);
				return;
			case ProductPackage.PRODUCT_METER__METER_UOM_ID:
				setMeterUomId((Uom)newValue);
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
			case ProductPackage.PRODUCT_METER__METER_NAME:
				setMeterName(METER_NAME_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_METER__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case ProductPackage.PRODUCT_METER__PRODUCT_METER_TYPE_ID:
				setProductMeterTypeId((ProductMeterType)null);
				return;
			case ProductPackage.PRODUCT_METER__METER_UOM_ID:
				setMeterUomId((Uom)null);
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
			case ProductPackage.PRODUCT_METER__METER_NAME:
				return METER_NAME_EDEFAULT == null ? meterName != null : !METER_NAME_EDEFAULT.equals(meterName);
			case ProductPackage.PRODUCT_METER__PRODUCT_ID:
				return productId != null;
			case ProductPackage.PRODUCT_METER__PRODUCT_METER_TYPE_ID:
				return productMeterTypeId != null;
			case ProductPackage.PRODUCT_METER__METER_UOM_ID:
				return meterUomId != null;
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
		result.append(" (meterName: ");
		result.append(meterName);
		result.append(')');
		return result.toString();
	}

} //ProductMeterImpl
