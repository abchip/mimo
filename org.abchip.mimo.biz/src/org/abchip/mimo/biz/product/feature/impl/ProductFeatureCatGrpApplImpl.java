/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.feature.FeaturePackage;
import org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl;
import org.abchip.mimo.biz.product.feature.ProductFeatureGroup;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature Cat Grp Appl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCatGrpApplImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCatGrpApplImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCatGrpApplImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCatGrpApplImpl#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureCatGrpApplImpl extends BizEntityImpl implements ProductFeatureCatGrpAppl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategoryId;

	/**
	 * The cached value of the '{@link #getProductFeatureGroupId() <em>Product Feature Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureGroupId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeatureGroup productFeatureGroupId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureCatGrpApplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		if (productCategoryId != null && ((EObject)productCategoryId).eIsProxy()) {
			InternalEObject oldProductCategoryId = (InternalEObject)productCategoryId;
			productCategoryId = (ProductCategory)eResolveProxy(oldProductCategoryId);
			if (productCategoryId != oldProductCategoryId) {
			}
		}
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		productCategoryId = newProductCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureGroup getProductFeatureGroupId() {
		if (productFeatureGroupId != null && ((EObject)productFeatureGroupId).eIsProxy()) {
			InternalEObject oldProductFeatureGroupId = (InternalEObject)productFeatureGroupId;
			productFeatureGroupId = (ProductFeatureGroup)eResolveProxy(oldProductFeatureGroupId);
			if (productFeatureGroupId != oldProductFeatureGroupId) {
			}
		}
		return productFeatureGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeatureGroup basicGetProductFeatureGroupId() {
		return productFeatureGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureGroupId(ProductFeatureGroup newProductFeatureGroupId) {
		productFeatureGroupId = newProductFeatureGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__FROM_DATE:
				return getFromDate();
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__THRU_DATE:
				return getThruDate();
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_FEATURE_GROUP_ID:
				if (resolve) return getProductFeatureGroupId();
				return basicGetProductFeatureGroupId();
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
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_FEATURE_GROUP_ID:
				setProductFeatureGroupId((ProductFeatureGroup)newValue);
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
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_FEATURE_GROUP_ID:
				setProductFeatureGroupId((ProductFeatureGroup)null);
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
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_FEATURE_GROUP_ID:
				return productFeatureGroupId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductFeatureCatGrpApplImpl
