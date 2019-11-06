/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.promo.ProductPromo;
import org.abchip.mimo.biz.product.promo.ProductPromoCategory;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCategoryImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCategoryImpl#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCategoryImpl#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCategoryImpl#getAndGroupId <em>And Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCategoryImpl#isIncludeSubCategories <em>Include Sub Categories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCategoryImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCategoryImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCategoryImpl#getProductPromoApplEnumId <em>Product Promo Appl Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPromoCategoryImpl extends BizEntityImpl implements ProductPromoCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductPromoRuleId() <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoRuleId() <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoRuleId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoRuleId = PRODUCT_PROMO_RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoActionSeqId() <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoActionSeqId() <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoActionSeqId = PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoCondSeqId() <em>Product Promo Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCondSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoCondSeqId() <em>Product Promo Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCondSeqId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoCondSeqId = PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAndGroupId() <em>And Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String AND_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAndGroupId() <em>And Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndGroupId()
	 * @generated
	 * @ordered
	 */
	protected String andGroupId = AND_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeSubCategories() <em>Include Sub Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubCategories()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_SUB_CATEGORIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeSubCategories() <em>Include Sub Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubCategories()
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubCategories = INCLUDE_SUB_CATEGORIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected ProductPromo productPromoId;

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
	 * The cached value of the '{@link #getProductPromoApplEnumId() <em>Product Promo Appl Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoApplEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration productPromoApplEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPromoCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromoPackage.Literals.PRODUCT_PROMO_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAndGroupId() {
		return andGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAndGroupId(String newAndGroupId) {
		andGroupId = newAndGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeSubCategories() {
		return includeSubCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeSubCategories(boolean newIncludeSubCategories) {
		includeSubCategories = newIncludeSubCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoActionSeqId() {
		return productPromoActionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoActionSeqId(String newProductPromoActionSeqId) {
		productPromoActionSeqId = newProductPromoActionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getProductPromoApplEnumId() {
		if (productPromoApplEnumId != null && ((EObject)productPromoApplEnumId).eIsProxy()) {
			InternalEObject oldProductPromoApplEnumId = (InternalEObject)productPromoApplEnumId;
			productPromoApplEnumId = (Enumeration)eResolveProxy(oldProductPromoApplEnumId);
			if (productPromoApplEnumId != oldProductPromoApplEnumId) {
			}
		}
		return productPromoApplEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetProductPromoApplEnumId() {
		return productPromoApplEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoApplEnumId(Enumeration newProductPromoApplEnumId) {
		productPromoApplEnumId = newProductPromoApplEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoCondSeqId() {
		return productPromoCondSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCondSeqId(String newProductPromoCondSeqId) {
		productPromoCondSeqId = newProductPromoCondSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoRuleId() {
		return productPromoRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoRuleId(String newProductPromoRuleId) {
		productPromoRuleId = newProductPromoRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromo getProductPromoId() {
		if (productPromoId != null && ((EObject)productPromoId).eIsProxy()) {
			InternalEObject oldProductPromoId = (InternalEObject)productPromoId;
			productPromoId = (ProductPromo)eResolveProxy(oldProductPromoId);
			if (productPromoId != oldProductPromoId) {
			}
		}
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPromo basicGetProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(ProductPromo newProductPromoId) {
		productPromoId = newProductPromoId;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_RULE_ID:
				return getProductPromoRuleId();
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ACTION_SEQ_ID:
				return getProductPromoActionSeqId();
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_COND_SEQ_ID:
				return getProductPromoCondSeqId();
			case PromoPackage.PRODUCT_PROMO_CATEGORY__AND_GROUP_ID:
				return getAndGroupId();
			case PromoPackage.PRODUCT_PROMO_CATEGORY__INCLUDE_SUB_CATEGORIES:
				return isIncludeSubCategories();
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ID:
				if (resolve) return getProductPromoId();
				return basicGetProductPromoId();
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_APPL_ENUM_ID:
				if (resolve) return getProductPromoApplEnumId();
				return basicGetProductPromoApplEnumId();
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
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_COND_SEQ_ID:
				setProductPromoCondSeqId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__AND_GROUP_ID:
				setAndGroupId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__INCLUDE_SUB_CATEGORIES:
				setIncludeSubCategories((Boolean)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_APPL_ENUM_ID:
				setProductPromoApplEnumId((Enumeration)newValue);
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
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId(PRODUCT_PROMO_RULE_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId(PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_COND_SEQ_ID:
				setProductPromoCondSeqId(PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__AND_GROUP_ID:
				setAndGroupId(AND_GROUP_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__INCLUDE_SUB_CATEGORIES:
				setIncludeSubCategories(INCLUDE_SUB_CATEGORIES_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)null);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
				return;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_APPL_ENUM_ID:
				setProductPromoApplEnumId((Enumeration)null);
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
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_RULE_ID:
				return PRODUCT_PROMO_RULE_ID_EDEFAULT == null ? productPromoRuleId != null : !PRODUCT_PROMO_RULE_ID_EDEFAULT.equals(productPromoRuleId);
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ACTION_SEQ_ID:
				return PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT == null ? productPromoActionSeqId != null : !PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT.equals(productPromoActionSeqId);
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_COND_SEQ_ID:
				return PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT == null ? productPromoCondSeqId != null : !PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT.equals(productPromoCondSeqId);
			case PromoPackage.PRODUCT_PROMO_CATEGORY__AND_GROUP_ID:
				return AND_GROUP_ID_EDEFAULT == null ? andGroupId != null : !AND_GROUP_ID_EDEFAULT.equals(andGroupId);
			case PromoPackage.PRODUCT_PROMO_CATEGORY__INCLUDE_SUB_CATEGORIES:
				return includeSubCategories != INCLUDE_SUB_CATEGORIES_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_ID:
				return productPromoId != null;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
			case PromoPackage.PRODUCT_PROMO_CATEGORY__PRODUCT_PROMO_APPL_ENUM_ID:
				return productPromoApplEnumId != null;
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
		result.append(" (productPromoRuleId: ");
		result.append(productPromoRuleId);
		result.append(", productPromoActionSeqId: ");
		result.append(productPromoActionSeqId);
		result.append(", productPromoCondSeqId: ");
		result.append(productPromoCondSeqId);
		result.append(", andGroupId: ");
		result.append(andGroupId);
		result.append(", includeSubCategories: ");
		result.append(includeSubCategories);
		result.append(')');
		return result.toString();
	}

} //ProductPromoCategoryImpl
