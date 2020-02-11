/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentSearchConstraint;
import org.abchip.mimo.biz.content.content.ContentSearchResult;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Search Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getContentSearchResultId <em>Content Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getContentSearchConstraints <em>Content Search Constraints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#isIsAscending <em>Is Ascending</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getNumResults <em>Num Results</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getOrderByName <em>Order By Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getSearchDate <em>Search Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getSecondsTotal <em>Seconds Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getVisitId <em>Visit Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentSearchResultImpl extends BizEntityImpl implements ContentSearchResult {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentSearchResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_SEARCH_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentSearchResultId() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentSearchResultId(String newContentSearchResultId) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID, newContentSearchResultId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ContentSearchConstraint> getContentSearchConstraints() {
		return (List<ContentSearchConstraint>)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAscending() {
		return (Boolean)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__IS_ASCENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAscending(boolean newIsAscending) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__IS_ASCENDING, newIsAscending);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumResults() {
		return (Long)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__NUM_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumResults(long newNumResults) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__NUM_RESULTS, newNumResults);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderByName() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__ORDER_BY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderByName(String newOrderByName) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__ORDER_BY_NAME, newOrderByName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSearchDate() {
		return (Date)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__SEARCH_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchDate(Date newSearchDate) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__SEARCH_DATE, newSearchDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSecondsTotal() {
		return (Double)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__SECONDS_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondsTotal(double newSecondsTotal) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__SECONDS_TOTAL, newSecondsTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__VISIT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__VISIT_ID, newVisitId);
	}

} //ContentSearchResultImpl
