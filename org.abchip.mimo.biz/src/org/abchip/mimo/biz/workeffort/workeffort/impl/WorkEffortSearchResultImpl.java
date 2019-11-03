/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Search Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl#getWorkEffortSearchResultId <em>Work Effort Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl#isIsAscending <em>Is Ascending</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl#getNumResults <em>Num Results</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl#getOrderByName <em>Order By Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl#getSearchDate <em>Search Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl#getSecondsTotal <em>Seconds Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchResultImpl#getWorkEffortSearchConstraints <em>Work Effort Search Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortSearchResultImpl extends BizEntityImpl implements WorkEffortSearchResult {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getWorkEffortSearchResultId() <em>Work Effort Search Result Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortSearchResultId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_SEARCH_RESULT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortSearchResultId() <em>Work Effort Search Result Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortSearchResultId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortSearchResultId = WORK_EFFORT_SEARCH_RESULT_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getWorkEffortSearchConstraints() <em>Work Effort Search Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortSearchConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortSearchConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortSearchResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT;
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
		long oldNumResults = numResults;
		numResults = newNumResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS, oldNumResults, numResults));
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
		String oldOrderByName = orderByName;
		orderByName = newOrderByName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME, oldOrderByName, orderByName));
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
		Date oldSearchDate = searchDate;
		searchDate = newSearchDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE, oldSearchDate, searchDate));
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
		double oldSecondsTotal = secondsTotal;
		secondsTotal = newSecondsTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL, oldSecondsTotal, secondsTotal));
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
		String oldVisitId = visitId;
		visitId = newVisitId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__VISIT_ID, oldVisitId, visitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortSearchResultId() {
		return workEffortSearchResultId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortSearchResultId(String newWorkEffortSearchResultId) {
		String oldWorkEffortSearchResultId = workEffortSearchResultId;
		workEffortSearchResultId = newWorkEffortSearchResultId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID, oldWorkEffortSearchResultId, workEffortSearchResultId));
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
		boolean oldIsAscending = isAscending;
		isAscending = newIsAscending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING, oldIsAscending, isAscending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortSearchConstraints() {
		if (workEffortSearchConstraints == null) {
			workEffortSearchConstraints = new EDataTypeUniqueEList<String>(String.class, this, WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS);
		}
		return workEffortSearchConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID:
				return getWorkEffortSearchResultId();
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING:
				return isIsAscending();
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS:
				return getNumResults();
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME:
				return getOrderByName();
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE:
				return getSearchDate();
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL:
				return getSecondsTotal();
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__VISIT_ID:
				return getVisitId();
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS:
				return getWorkEffortSearchConstraints();
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
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID:
				setWorkEffortSearchResultId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING:
				setIsAscending((Boolean)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS:
				setNumResults((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME:
				setOrderByName((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE:
				setSearchDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL:
				setSecondsTotal((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS:
				getWorkEffortSearchConstraints().clear();
				getWorkEffortSearchConstraints().addAll((Collection<? extends String>)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID:
				setWorkEffortSearchResultId(WORK_EFFORT_SEARCH_RESULT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING:
				setIsAscending(IS_ASCENDING_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS:
				setNumResults(NUM_RESULTS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME:
				setOrderByName(ORDER_BY_NAME_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE:
				setSearchDate(SEARCH_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL:
				setSecondsTotal(SECONDS_TOTAL_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS:
				getWorkEffortSearchConstraints().clear();
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
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID:
				return WORK_EFFORT_SEARCH_RESULT_ID_EDEFAULT == null ? workEffortSearchResultId != null : !WORK_EFFORT_SEARCH_RESULT_ID_EDEFAULT.equals(workEffortSearchResultId);
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING:
				return isAscending != IS_ASCENDING_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS:
				return numResults != NUM_RESULTS_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME:
				return ORDER_BY_NAME_EDEFAULT == null ? orderByName != null : !ORDER_BY_NAME_EDEFAULT.equals(orderByName);
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE:
				return SEARCH_DATE_EDEFAULT == null ? searchDate != null : !SEARCH_DATE_EDEFAULT.equals(searchDate);
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL:
				return secondsTotal != SECONDS_TOTAL_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case WorkeffortPackage.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS:
				return workEffortSearchConstraints != null && !workEffortSearchConstraints.isEmpty();
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
		result.append(" (workEffortSearchResultId: ");
		result.append(workEffortSearchResultId);
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
		result.append(", workEffortSearchConstraints: ");
		result.append(workEffortSearchConstraints);
		result.append(')');
		return result.toString();
	}

} //WorkEffortSearchResultImpl
