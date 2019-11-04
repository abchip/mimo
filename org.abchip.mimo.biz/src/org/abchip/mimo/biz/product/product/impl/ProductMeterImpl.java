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
import org.abchip.mimo.biz.product.product.ProductMeter;
import org.abchip.mimo.biz.product.product.ProductMeterType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMeterImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMeterImpl#getMeterName <em>Meter Name</em>}</li>
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
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

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
		String oldMeterName = meterName;
		meterName = newMeterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_METER__METER_NAME, oldMeterName, meterName));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_METER__METER_UOM_ID, oldMeterUomId, meterUomId));
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
		Uom oldMeterUomId = meterUomId;
		meterUomId = newMeterUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_METER__METER_UOM_ID, oldMeterUomId, meterUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_METER__PRODUCT_ID, oldProductId, productId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_METER__PRODUCT_METER_TYPE_ID, oldProductMeterTypeId, productMeterTypeId));
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
		ProductMeterType oldProductMeterTypeId = productMeterTypeId;
		productMeterTypeId = newProductMeterTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_METER__PRODUCT_METER_TYPE_ID, oldProductMeterTypeId, productMeterTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_METER__PRODUCT_ID:
				return getProductId();
			case ProductPackage.PRODUCT_METER__METER_NAME:
				return getMeterName();
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
			case ProductPackage.PRODUCT_METER__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case ProductPackage.PRODUCT_METER__METER_NAME:
				setMeterName((String)newValue);
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
			case ProductPackage.PRODUCT_METER__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_METER__METER_NAME:
				setMeterName(METER_NAME_EDEFAULT);
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
			case ProductPackage.PRODUCT_METER__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case ProductPackage.PRODUCT_METER__METER_NAME:
				return METER_NAME_EDEFAULT == null ? meterName != null : !METER_NAME_EDEFAULT.equals(meterName);
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", meterName: ");
		result.append(meterName);
		result.append(')');
		return result.toString();
	}

} //ProductMeterImpl