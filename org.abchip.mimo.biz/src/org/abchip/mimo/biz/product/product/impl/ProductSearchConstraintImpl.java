/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.product.product.ProductSearchConstraint;
import org.abchip.mimo.biz.product.product.ProductSearchResult;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Search Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#getProductSearchResultId <em>Product Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#getConstraintSeqId <em>Constraint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#getAnyPrefix <em>Any Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#getAnySuffix <em>Any Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#getHighValue <em>High Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#isIncludeSubCategories <em>Include Sub Categories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#getInfoString <em>Info String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#isIsAnd <em>Is And</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl#isRemoveStems <em>Remove Stems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSearchConstraintImpl extends BizEntityImpl implements ProductSearchConstraint {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSearchConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintName() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintName(String newConstraintName) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_NAME, newConstraintName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintSeqId() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintSeqId(String newConstraintSeqId) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID, newConstraintSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnyPrefix() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__ANY_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnyPrefix(String newAnyPrefix) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__ANY_PREFIX, newAnyPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnySuffix() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__ANY_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnySuffix(String newAnySuffix) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__ANY_SUFFIX, newAnySuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHighValue() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__HIGH_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighValue(String newHighValue) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__HIGH_VALUE, newHighValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeSubCategories() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeSubCategories(boolean newIncludeSubCategories) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES, newIncludeSubCategories);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfoString() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__INFO_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoString(String newInfoString) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__INFO_STRING, newInfoString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAnd() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__IS_AND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAnd(boolean newIsAnd) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__IS_AND, newIsAnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLowValue() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__LOW_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowValue(String newLowValue) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__LOW_VALUE, newLowValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoveStems() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__REMOVE_STEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveStems(boolean newRemoveStems) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__REMOVE_STEMS, newRemoveStems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductSearchResult getProductSearchResultId() {
		return (ProductSearchResult)eGet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__PRODUCT_SEARCH_RESULT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductSearchResultId(ProductSearchResult newProductSearchResultId) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_CONSTRAINT__PRODUCT_SEARCH_RESULT_ID, newProductSearchResultId);
	}

} //ProductSearchConstraintImpl
