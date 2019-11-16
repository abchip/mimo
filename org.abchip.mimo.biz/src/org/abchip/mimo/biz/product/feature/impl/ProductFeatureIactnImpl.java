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
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.feature.ProductFeatureIactn;
import org.abchip.mimo.biz.product.feature.ProductFeatureIactnType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature Iactn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl#getProductFeatureIactnTypeId <em>Product Feature Iactn Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl#getProductFeatureIdTo <em>Product Feature Id To</em>}</li>
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
	 * The cached value of the '{@link #getProductFeatureIactnTypeId() <em>Product Feature Iactn Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureIactnTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeatureIactnType productFeatureIactnTypeId;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature productFeatureId;

	/**
	 * The cached value of the '{@link #getProductFeatureIdTo() <em>Product Feature Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureIdTo()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature productFeatureIdTo;

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
	public ProductFeatureIactnType getProductFeatureIactnTypeId() {
		if (productFeatureIactnTypeId != null && ((EObject)productFeatureIactnTypeId).eIsProxy()) {
			InternalEObject oldProductFeatureIactnTypeId = (InternalEObject)productFeatureIactnTypeId;
			productFeatureIactnTypeId = (ProductFeatureIactnType)eResolveProxy(oldProductFeatureIactnTypeId);
			if (productFeatureIactnTypeId != oldProductFeatureIactnTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID, oldProductFeatureIactnTypeId, productFeatureIactnTypeId));
			}
		}
		return productFeatureIactnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeatureIactnType basicGetProductFeatureIactnTypeId() {
		return productFeatureIactnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureIactnTypeId(ProductFeatureIactnType newProductFeatureIactnTypeId) {
		ProductFeatureIactnType oldProductFeatureIactnTypeId = productFeatureIactnTypeId;
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
	public ProductFeature getProductFeatureId() {
		if (productFeatureId != null && ((EObject)productFeatureId).eIsProxy()) {
			InternalEObject oldProductFeatureId = (InternalEObject)productFeatureId;
			productFeatureId = (ProductFeature)eResolveProxy(oldProductFeatureId);
			if (productFeatureId != oldProductFeatureId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
			}
		}
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature basicGetProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(ProductFeature newProductFeatureId) {
		ProductFeature oldProductFeatureId = productFeatureId;
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
	public ProductFeature getProductFeatureIdTo() {
		if (productFeatureIdTo != null && ((EObject)productFeatureIdTo).eIsProxy()) {
			InternalEObject oldProductFeatureIdTo = (InternalEObject)productFeatureIdTo;
			productFeatureIdTo = (ProductFeature)eResolveProxy(oldProductFeatureIdTo);
			if (productFeatureIdTo != oldProductFeatureIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO, oldProductFeatureIdTo, productFeatureIdTo));
			}
		}
		return productFeatureIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature basicGetProductFeatureIdTo() {
		return productFeatureIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureIdTo(ProductFeature newProductFeatureIdTo) {
		ProductFeature oldProductFeatureIdTo = productFeatureIdTo;
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
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_ID:
				return getProductId();
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID:
				if (resolve) return getProductFeatureIactnTypeId();
				return basicGetProductFeatureIactnTypeId();
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID:
				if (resolve) return getProductFeatureId();
				return basicGetProductFeatureId();
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO:
				if (resolve) return getProductFeatureIdTo();
				return basicGetProductFeatureIdTo();
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
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID:
				setProductFeatureIactnTypeId((ProductFeatureIactnType)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO:
				setProductFeatureIdTo((ProductFeature)newValue);
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
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID:
				setProductFeatureIactnTypeId((ProductFeatureIactnType)null);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)null);
				return;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO:
				setProductFeatureIdTo((ProductFeature)null);
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
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID:
				return productFeatureIactnTypeId != null;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID:
				return productFeatureId != null;
			case FeaturePackage.PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO:
				return productFeatureIdTo != null;
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
		result.append(')');
		return result.toString();
	}

} //ProductFeatureIactnImpl
