/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentSearchResult;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Search Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getContentSearchResultId <em>Content Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#isIsAscending <em>Is Ascending</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getNumResults <em>Num Results</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getOrderByName <em>Order By Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getSearchDate <em>Search Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getSecondsTotal <em>Seconds Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchResultImpl#getContentSearchConstraints <em>Content Search Constraints</em>}</li>
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
	 * The default value of the '{@link #getContentSearchResultId() <em>Content Search Result Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentSearchResultId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_SEARCH_RESULT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentSearchResultId() <em>Content Search Result Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentSearchResultId()
	 * @generated
	 * @ordered
	 */
	protected String contentSearchResultId = CONTENT_SEARCH_RESULT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAscending() <em>Is Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAscending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASCENDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAscending() <em>Is Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAscending()
	 * @generated
	 * @ordered
	 */
	protected boolean isAscending = IS_ASCENDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumResults() <em>Num Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumResults()
	 * @generated
	 * @ordered
	 */
	protected static final long NUM_RESULTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumResults() <em>Num Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumResults()
	 * @generated
	 * @ordered
	 */
	protected long numResults = NUM_RESULTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderByName() <em>Order By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderByName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_BY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderByName() <em>Order By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderByName()
	 * @generated
	 * @ordered
	 */
	protected String orderByName = ORDER_BY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchDate() <em>Search Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SEARCH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchDate() <em>Search Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchDate()
	 * @generated
	 * @ordered
	 */
	protected Date searchDate = SEARCH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondsTotal() <em>Seconds Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsTotal()
	 * @generated
	 * @ordered
	 */
	protected static final double SECONDS_TOTAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSecondsTotal() <em>Seconds Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondsTotal()
	 * @generated
	 * @ordered
	 */
	protected double secondsTotal = SECONDS_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContentSearchConstraints() <em>Content Search Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentSearchConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contentSearchConstraints;

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
		return contentSearchResultId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentSearchResultId(String newContentSearchResultId) {
		contentSearchResultId = newContentSearchResultId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAscending() {
		return isAscending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAscending(boolean newIsAscending) {
		isAscending = newIsAscending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumResults() {
		return numResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumResults(long newNumResults) {
		numResults = newNumResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderByName() {
		return orderByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderByName(String newOrderByName) {
		orderByName = newOrderByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSearchDate() {
		return searchDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchDate(Date newSearchDate) {
		searchDate = newSearchDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSecondsTotal() {
		return secondsTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondsTotal(double newSecondsTotal) {
		secondsTotal = newSecondsTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		visitId = newVisitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getContentSearchConstraints() {
		if (contentSearchConstraints == null) {
			contentSearchConstraints = new BasicInternalEList<String>(String.class);
		}
		return contentSearchConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID:
				return getContentSearchResultId();
			case ContentPackage.CONTENT_SEARCH_RESULT__IS_ASCENDING:
				return isIsAscending();
			case ContentPackage.CONTENT_SEARCH_RESULT__NUM_RESULTS:
				return getNumResults();
			case ContentPackage.CONTENT_SEARCH_RESULT__ORDER_BY_NAME:
				return getOrderByName();
			case ContentPackage.CONTENT_SEARCH_RESULT__SEARCH_DATE:
				return getSearchDate();
			case ContentPackage.CONTENT_SEARCH_RESULT__SECONDS_TOTAL:
				return getSecondsTotal();
			case ContentPackage.CONTENT_SEARCH_RESULT__VISIT_ID:
				return getVisitId();
			case ContentPackage.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_CONSTRAINTS:
				return getContentSearchConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentPackage.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID:
				setContentSearchResultId((String)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__IS_ASCENDING:
				setIsAscending((Boolean)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__NUM_RESULTS:
				setNumResults((Long)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__ORDER_BY_NAME:
				setOrderByName((String)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__SEARCH_DATE:
				setSearchDate((Date)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__SECONDS_TOTAL:
				setSecondsTotal((Double)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_CONSTRAINTS:
				getContentSearchConstraints().clear();
				getContentSearchConstraints().addAll((Collection<? extends String>)newValue);
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
			case ContentPackage.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID:
				setContentSearchResultId(CONTENT_SEARCH_RESULT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__IS_ASCENDING:
				setIsAscending(IS_ASCENDING_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__NUM_RESULTS:
				setNumResults(NUM_RESULTS_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__ORDER_BY_NAME:
				setOrderByName(ORDER_BY_NAME_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__SEARCH_DATE:
				setSearchDate(SEARCH_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__SECONDS_TOTAL:
				setSecondsTotal(SECONDS_TOTAL_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_CONSTRAINTS:
				getContentSearchConstraints().clear();
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
			case ContentPackage.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID:
				return CONTENT_SEARCH_RESULT_ID_EDEFAULT == null ? contentSearchResultId != null : !CONTENT_SEARCH_RESULT_ID_EDEFAULT.equals(contentSearchResultId);
			case ContentPackage.CONTENT_SEARCH_RESULT__IS_ASCENDING:
				return isAscending != IS_ASCENDING_EDEFAULT;
			case ContentPackage.CONTENT_SEARCH_RESULT__NUM_RESULTS:
				return numResults != NUM_RESULTS_EDEFAULT;
			case ContentPackage.CONTENT_SEARCH_RESULT__ORDER_BY_NAME:
				return ORDER_BY_NAME_EDEFAULT == null ? orderByName != null : !ORDER_BY_NAME_EDEFAULT.equals(orderByName);
			case ContentPackage.CONTENT_SEARCH_RESULT__SEARCH_DATE:
				return SEARCH_DATE_EDEFAULT == null ? searchDate != null : !SEARCH_DATE_EDEFAULT.equals(searchDate);
			case ContentPackage.CONTENT_SEARCH_RESULT__SECONDS_TOTAL:
				return secondsTotal != SECONDS_TOTAL_EDEFAULT;
			case ContentPackage.CONTENT_SEARCH_RESULT__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case ContentPackage.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_CONSTRAINTS:
				return contentSearchConstraints != null && !contentSearchConstraints.isEmpty();
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
		result.append(" (contentSearchResultId: ");
		result.append(contentSearchResultId);
		result.append(", isAscending: ");
		result.append(isAscending);
		result.append(", numResults: ");
		result.append(numResults);
		result.append(", orderByName: ");
		result.append(orderByName);
		result.append(", searchDate: ");
		result.append(searchDate);
		result.append(", secondsTotal: ");
		result.append(secondsTotal);
		result.append(", visitId: ");
		result.append(visitId);
		result.append(", contentSearchConstraints: ");
		result.append(contentSearchConstraints);
		result.append(')');
		return result.toString();
	}

} //ContentSearchResultImpl
