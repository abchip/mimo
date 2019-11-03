/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.feature.FeaturePackage;
import org.abchip.mimo.biz.product.feature.ProductFeatureIactn;
import org.abchip.mimo.biz.product.feature.ProductFeatureIactnType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature Iactn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl#getProductFeatureIdTo <em>Product Feature Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl#getProductFeatureIactnTypeId <em>Product Feature Iactn Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureIactnImpl extends BizEntityTypedImpl<ProductFeatureIactnType> implements ProductFeatureIactn {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureId = PRODUCT_FEATURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductFeatureIdTo() <em>Product Feature Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureIdTo() <em>Product Feature Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureIdTo()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureIdTo = PRODUCT_FEATURE_ID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductFeatureIactnTypeId() <em>Product Feature Iactn Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureIactnTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_IACTN_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureIactnTypeId() <em>Product Feature Iactn Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureIactnTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureIactnTypeId = PRODUCT_FEATURE_IACTN_TYPE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureIactnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.PRODUCT_FEATURE_IACTN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureIactnTypeId() {
		return productFeatureIactnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureIactnTypeId(String newProductFeatureIactnTypeId) {
		String oldProductFeatureIactnTypeId = productFeatureIactnTypeId;
		productFeatureIactnTypeId = newProductFeatureIactnTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID, oldProductFeatureIactnTypeId, productFeatureIactnTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		String oldProductFeatureId = productFeatureId;
		productFeatureId = newProductFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureIdTo() {
		return productFeatureIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureIdTo(String newProductFeatureIdTo) {
		String oldProductFeatureIdTo = productFeatureIdTo;
		productFeatureIdTo = newProductFeatureIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO, oldProductFeatureIdTo, productFeatureIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO:
				return getProductFeatureIdTo();
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID:
				return getProductFeatureIactnTypeId();
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_ID:
				return getProductId();
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
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO:
				setProductFeatureIdTo((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID:
				setProductFeatureIactnTypeId((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_ID:
				setProductId((String)newValue);
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
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO:
				setProductFeatureIdTo(PRODUCT_FEATURE_ID_TO_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID:
				setProductFeatureIactnTypeId(PRODUCT_FEATURE_IACTN_TYPE_ID_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
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
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO:
				return PRODUCT_FEATURE_ID_TO_EDEFAULT == null ? productFeatureIdTo != null : !PRODUCT_FEATURE_ID_TO_EDEFAULT.equals(productFeatureIdTo);
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID:
				return PRODUCT_FEATURE_IACTN_TYPE_ID_EDEFAULT == null ? productFeatureIactnTypeId != null : !PRODUCT_FEATURE_IACTN_TYPE_ID_EDEFAULT.equals(productFeatureIactnTypeId);
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
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
		result.append(" (productFeatureId: ");
		result.append(productFeatureId);
		result.append(", productFeatureIdTo: ");
		result.append(productFeatureIdTo);
		result.append(", productFeatureIactnTypeId: ");
		result.append(productFeatureIactnTypeId);
		result.append(", productId: ");
		result.append(productId);
		result.append(')');
		return result.toString();
	}

} //ProductFeatureIactnImpl
