/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.product.product.ProductSearchConstraint;
import org.abchip.mimo.biz.product.product.ProductSearchResult;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Search Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl#getProductSearchResultId <em>Product Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl#isIsAscending <em>Is Ascending</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl#getNumResults <em>Num Results</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl#getOrderByName <em>Order By Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl#getProductSearchConstraints <em>Product Search Constraints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl#getSearchDate <em>Search Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl#getSecondsTotal <em>Seconds Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl#getVisitId <em>Visit Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSearchResultImpl extends BizEntityImpl implements ProductSearchResult {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSearchResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_SEARCH_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumResults() {
		return (Long)eGet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__NUM_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumResults(long newNumResults) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__NUM_RESULTS, newNumResults);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderByName() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__ORDER_BY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderByName(String newOrderByName) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__ORDER_BY_NAME, newOrderByName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductSearchConstraint> getProductSearchConstraints() {
		return (List<ProductSearchConstraint>)eGet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSearchDate() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__SEARCH_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchDate(Date newSearchDate) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__SEARCH_DATE, newSearchDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSecondsTotal() {
		return (Double)eGet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__SECONDS_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondsTotal(double newSecondsTotal) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__SECONDS_TOTAL, newSecondsTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__VISIT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__VISIT_ID, newVisitId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductSearchResultId() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_RESULT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductSearchResultId(String newProductSearchResultId) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_RESULT_ID, newProductSearchResultId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAscending() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__IS_ASCENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAscending(boolean newIsAscending) {
		eSet(ProductPackage.Literals.PRODUCT_SEARCH_RESULT__IS_ASCENDING, newIsAscending);
	}

} //ProductSearchResultImpl
