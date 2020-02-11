/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

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
		return (Long)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumResults(long newNumResults) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS, newNumResults);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderByName() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderByName(String newOrderByName) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME, newOrderByName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSearchDate() {
		return (Date)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchDate(Date newSearchDate) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE, newSearchDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSecondsTotal() {
		return (Double)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondsTotal(double newSecondsTotal) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL, newSecondsTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__VISIT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__VISIT_ID, newVisitId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortSearchConstraint> getWorkEffortSearchConstraints() {
		return (List<WorkEffortSearchConstraint>)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortSearchResultId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortSearchResultId(String newWorkEffortSearchResultId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID, newWorkEffortSearchResultId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAscending() {
		return (Boolean)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAscending(boolean newIsAscending) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING, newIsAscending);
	}

} //WorkEffortSearchResultImpl
