/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Search Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getWorkEffortSearchResultId <em>Work Effort Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getConstraintSeqId <em>Constraint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getAnyPrefix <em>Any Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getAnySuffix <em>Any Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getHighValue <em>High Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#isIncludeSubWorkEfforts <em>Include Sub Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getInfoString <em>Info String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#isIsAnd <em>Is And</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#isRemoveStems <em>Remove Stems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortSearchConstraintImpl extends BizEntityImpl implements WorkEffortSearchConstraint {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortSearchConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintName() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintName(String newConstraintName) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_NAME, newConstraintName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintSeqId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintSeqId(String newConstraintSeqId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID, newConstraintSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnyPrefix() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__ANY_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnyPrefix(String newAnyPrefix) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__ANY_PREFIX, newAnyPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnySuffix() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__ANY_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnySuffix(String newAnySuffix) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__ANY_SUFFIX, newAnySuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHighValue() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__HIGH_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighValue(String newHighValue) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__HIGH_VALUE, newHighValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeSubWorkEfforts() {
		return (Boolean)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__INCLUDE_SUB_WORK_EFFORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeSubWorkEfforts(boolean newIncludeSubWorkEfforts) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__INCLUDE_SUB_WORK_EFFORTS, newIncludeSubWorkEfforts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfoString() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__INFO_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoString(String newInfoString) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__INFO_STRING, newInfoString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAnd() {
		return (Boolean)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__IS_AND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAnd(boolean newIsAnd) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__IS_AND, newIsAnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLowValue() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__LOW_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowValue(String newLowValue) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__LOW_VALUE, newLowValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoveStems() {
		return (Boolean)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__REMOVE_STEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveStems(boolean newRemoveStems) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__REMOVE_STEMS, newRemoveStems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortSearchResult getWorkEffortSearchResultId() {
		return (WorkEffortSearchResult)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__WORK_EFFORT_SEARCH_RESULT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortSearchResultId(WorkEffortSearchResult newWorkEffortSearchResultId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__WORK_EFFORT_SEARCH_RESULT_ID, newWorkEffortSearchResultId);
	}

} //WorkEffortSearchConstraintImpl
