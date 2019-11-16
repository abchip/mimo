/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position.impl;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.humanres.position.EmplPosition;
import org.abchip.mimo.biz.humanres.position.EmplPositionType;
import org.abchip.mimo.biz.humanres.position.PositionPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getEmplPositionId <em>Empl Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getActualFromDate <em>Actual From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getActualThruDate <em>Actual Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getEstimatedFromDate <em>Estimated From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getEstimatedThruDate <em>Estimated Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#isExemptFlag <em>Exempt Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#isFulltimeFlag <em>Fulltime Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#isSalaryFlag <em>Salary Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#isTemporaryFlag <em>Temporary Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionImpl#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplPositionImpl extends BizEntityTypedImpl<EmplPositionType> implements EmplPosition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEmplPositionId() <em>Empl Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPL_POSITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplPositionId() <em>Empl Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionId()
	 * @generated
	 * @ordered
	 */
	protected String emplPositionId = EMPL_POSITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualFromDate() <em>Actual From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualFromDate() <em>Actual From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date actualFromDate = ACTUAL_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualThruDate() <em>Actual Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualThruDate() <em>Actual Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date actualThruDate = ACTUAL_THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected String budgetId = BUDGET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBudgetItemSeqId() <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBudgetItemSeqId() <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String budgetItemSeqId = BUDGET_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedFromDate() <em>Estimated From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedFromDate() <em>Estimated From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedFromDate = ESTIMATED_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedThruDate() <em>Estimated Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedThruDate() <em>Estimated Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedThruDate = ESTIMATED_THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isExemptFlag() <em>Exempt Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExemptFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXEMPT_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExemptFlag() <em>Exempt Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExemptFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean exemptFlag = EXEMPT_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isFulltimeFlag() <em>Fulltime Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFulltimeFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FULLTIME_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFulltimeFlag() <em>Fulltime Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFulltimeFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean fulltimeFlag = FULLTIME_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isSalaryFlag() <em>Salary Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSalaryFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SALARY_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSalaryFlag() <em>Salary Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSalaryFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean salaryFlag = SALARY_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isTemporaryFlag() <em>Temporary Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemporaryFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPORARY_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTemporaryFlag() <em>Temporary Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemporaryFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean temporaryFlag = TEMPORARY_FLAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getEmplPositionTypeId() <em>Empl Position Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionTypeId()
	 * @generated
	 * @ordered
	 */
	protected EmplPositionType emplPositionTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmplPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PositionPackage.Literals.EMPL_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualFromDate() {
		return actualFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualFromDate(Date newActualFromDate) {
		Date oldActualFromDate = actualFromDate;
		actualFromDate = newActualFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__ACTUAL_FROM_DATE, oldActualFromDate, actualFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualThruDate() {
		return actualThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualThruDate(Date newActualThruDate) {
		Date oldActualThruDate = actualThruDate;
		actualThruDate = newActualThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__ACTUAL_THRU_DATE, oldActualThruDate, actualThruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetId() {
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(String newBudgetId) {
		String oldBudgetId = budgetId;
		budgetId = newBudgetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__BUDGET_ID, oldBudgetId, budgetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetItemSeqId() {
		return budgetItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemSeqId(String newBudgetItemSeqId) {
		String oldBudgetItemSeqId = budgetItemSeqId;
		budgetItemSeqId = newBudgetItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__BUDGET_ITEM_SEQ_ID, oldBudgetItemSeqId, budgetItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmplPositionId() {
		return emplPositionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionId(String newEmplPositionId) {
		String oldEmplPositionId = emplPositionId;
		emplPositionId = newEmplPositionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__EMPL_POSITION_ID, oldEmplPositionId, emplPositionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionType getEmplPositionTypeId() {
		if (emplPositionTypeId != null && ((EObject)emplPositionTypeId).eIsProxy()) {
			InternalEObject oldEmplPositionTypeId = (InternalEObject)emplPositionTypeId;
			emplPositionTypeId = (EmplPositionType)eResolveProxy(oldEmplPositionTypeId);
			if (emplPositionTypeId != oldEmplPositionTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PositionPackage.EMPL_POSITION__EMPL_POSITION_TYPE_ID, oldEmplPositionTypeId, emplPositionTypeId));
			}
		}
		return emplPositionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplPositionType basicGetEmplPositionTypeId() {
		return emplPositionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionTypeId(EmplPositionType newEmplPositionTypeId) {
		EmplPositionType oldEmplPositionTypeId = emplPositionTypeId;
		emplPositionTypeId = newEmplPositionTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__EMPL_POSITION_TYPE_ID, oldEmplPositionTypeId, emplPositionTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedFromDate() {
		return estimatedFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedFromDate(Date newEstimatedFromDate) {
		Date oldEstimatedFromDate = estimatedFromDate;
		estimatedFromDate = newEstimatedFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__ESTIMATED_FROM_DATE, oldEstimatedFromDate, estimatedFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedThruDate() {
		return estimatedThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedThruDate(Date newEstimatedThruDate) {
		Date oldEstimatedThruDate = estimatedThruDate;
		estimatedThruDate = newEstimatedThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__ESTIMATED_THRU_DATE, oldEstimatedThruDate, estimatedThruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExemptFlag() {
		return exemptFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExemptFlag(boolean newExemptFlag) {
		boolean oldExemptFlag = exemptFlag;
		exemptFlag = newExemptFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__EXEMPT_FLAG, oldExemptFlag, exemptFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFulltimeFlag() {
		return fulltimeFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFulltimeFlag(boolean newFulltimeFlag) {
		boolean oldFulltimeFlag = fulltimeFlag;
		fulltimeFlag = newFulltimeFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__FULLTIME_FLAG, oldFulltimeFlag, fulltimeFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PositionPackage.EMPL_POSITION__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSalaryFlag() {
		return salaryFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalaryFlag(boolean newSalaryFlag) {
		boolean oldSalaryFlag = salaryFlag;
		salaryFlag = newSalaryFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__SALARY_FLAG, oldSalaryFlag, salaryFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PositionPackage.EMPL_POSITION__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTemporaryFlag() {
		return temporaryFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporaryFlag(boolean newTemporaryFlag) {
		boolean oldTemporaryFlag = temporaryFlag;
		temporaryFlag = newTemporaryFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION__TEMPORARY_FLAG, oldTemporaryFlag, temporaryFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> employmentApps() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PositionPackage.EMPL_POSITION__EMPL_POSITION_ID:
				return getEmplPositionId();
			case PositionPackage.EMPL_POSITION__ACTUAL_FROM_DATE:
				return getActualFromDate();
			case PositionPackage.EMPL_POSITION__ACTUAL_THRU_DATE:
				return getActualThruDate();
			case PositionPackage.EMPL_POSITION__BUDGET_ID:
				return getBudgetId();
			case PositionPackage.EMPL_POSITION__BUDGET_ITEM_SEQ_ID:
				return getBudgetItemSeqId();
			case PositionPackage.EMPL_POSITION__ESTIMATED_FROM_DATE:
				return getEstimatedFromDate();
			case PositionPackage.EMPL_POSITION__ESTIMATED_THRU_DATE:
				return getEstimatedThruDate();
			case PositionPackage.EMPL_POSITION__EXEMPT_FLAG:
				return isExemptFlag();
			case PositionPackage.EMPL_POSITION__FULLTIME_FLAG:
				return isFulltimeFlag();
			case PositionPackage.EMPL_POSITION__SALARY_FLAG:
				return isSalaryFlag();
			case PositionPackage.EMPL_POSITION__TEMPORARY_FLAG:
				return isTemporaryFlag();
			case PositionPackage.EMPL_POSITION__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case PositionPackage.EMPL_POSITION__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case PositionPackage.EMPL_POSITION__EMPL_POSITION_TYPE_ID:
				if (resolve) return getEmplPositionTypeId();
				return basicGetEmplPositionTypeId();
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
			case PositionPackage.EMPL_POSITION__EMPL_POSITION_ID:
				setEmplPositionId((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION__ACTUAL_FROM_DATE:
				setActualFromDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION__ACTUAL_THRU_DATE:
				setActualThruDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION__BUDGET_ID:
				setBudgetId((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION__ESTIMATED_FROM_DATE:
				setEstimatedFromDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION__ESTIMATED_THRU_DATE:
				setEstimatedThruDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION__EXEMPT_FLAG:
				setExemptFlag((Boolean)newValue);
				return;
			case PositionPackage.EMPL_POSITION__FULLTIME_FLAG:
				setFulltimeFlag((Boolean)newValue);
				return;
			case PositionPackage.EMPL_POSITION__SALARY_FLAG:
				setSalaryFlag((Boolean)newValue);
				return;
			case PositionPackage.EMPL_POSITION__TEMPORARY_FLAG:
				setTemporaryFlag((Boolean)newValue);
				return;
			case PositionPackage.EMPL_POSITION__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case PositionPackage.EMPL_POSITION__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case PositionPackage.EMPL_POSITION__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId((EmplPositionType)newValue);
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
			case PositionPackage.EMPL_POSITION__EMPL_POSITION_ID:
				setEmplPositionId(EMPL_POSITION_ID_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__ACTUAL_FROM_DATE:
				setActualFromDate(ACTUAL_FROM_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__ACTUAL_THRU_DATE:
				setActualThruDate(ACTUAL_THRU_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__BUDGET_ID:
				setBudgetId(BUDGET_ID_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId(BUDGET_ITEM_SEQ_ID_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__ESTIMATED_FROM_DATE:
				setEstimatedFromDate(ESTIMATED_FROM_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__ESTIMATED_THRU_DATE:
				setEstimatedThruDate(ESTIMATED_THRU_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__EXEMPT_FLAG:
				setExemptFlag(EXEMPT_FLAG_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__FULLTIME_FLAG:
				setFulltimeFlag(FULLTIME_FLAG_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__SALARY_FLAG:
				setSalaryFlag(SALARY_FLAG_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__TEMPORARY_FLAG:
				setTemporaryFlag(TEMPORARY_FLAG_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case PositionPackage.EMPL_POSITION__PARTY_ID:
				setPartyId((Party)null);
				return;
			case PositionPackage.EMPL_POSITION__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId((EmplPositionType)null);
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
			case PositionPackage.EMPL_POSITION__EMPL_POSITION_ID:
				return EMPL_POSITION_ID_EDEFAULT == null ? emplPositionId != null : !EMPL_POSITION_ID_EDEFAULT.equals(emplPositionId);
			case PositionPackage.EMPL_POSITION__ACTUAL_FROM_DATE:
				return ACTUAL_FROM_DATE_EDEFAULT == null ? actualFromDate != null : !ACTUAL_FROM_DATE_EDEFAULT.equals(actualFromDate);
			case PositionPackage.EMPL_POSITION__ACTUAL_THRU_DATE:
				return ACTUAL_THRU_DATE_EDEFAULT == null ? actualThruDate != null : !ACTUAL_THRU_DATE_EDEFAULT.equals(actualThruDate);
			case PositionPackage.EMPL_POSITION__BUDGET_ID:
				return BUDGET_ID_EDEFAULT == null ? budgetId != null : !BUDGET_ID_EDEFAULT.equals(budgetId);
			case PositionPackage.EMPL_POSITION__BUDGET_ITEM_SEQ_ID:
				return BUDGET_ITEM_SEQ_ID_EDEFAULT == null ? budgetItemSeqId != null : !BUDGET_ITEM_SEQ_ID_EDEFAULT.equals(budgetItemSeqId);
			case PositionPackage.EMPL_POSITION__ESTIMATED_FROM_DATE:
				return ESTIMATED_FROM_DATE_EDEFAULT == null ? estimatedFromDate != null : !ESTIMATED_FROM_DATE_EDEFAULT.equals(estimatedFromDate);
			case PositionPackage.EMPL_POSITION__ESTIMATED_THRU_DATE:
				return ESTIMATED_THRU_DATE_EDEFAULT == null ? estimatedThruDate != null : !ESTIMATED_THRU_DATE_EDEFAULT.equals(estimatedThruDate);
			case PositionPackage.EMPL_POSITION__EXEMPT_FLAG:
				return exemptFlag != EXEMPT_FLAG_EDEFAULT;
			case PositionPackage.EMPL_POSITION__FULLTIME_FLAG:
				return fulltimeFlag != FULLTIME_FLAG_EDEFAULT;
			case PositionPackage.EMPL_POSITION__SALARY_FLAG:
				return salaryFlag != SALARY_FLAG_EDEFAULT;
			case PositionPackage.EMPL_POSITION__TEMPORARY_FLAG:
				return temporaryFlag != TEMPORARY_FLAG_EDEFAULT;
			case PositionPackage.EMPL_POSITION__STATUS_ID:
				return statusId != null;
			case PositionPackage.EMPL_POSITION__PARTY_ID:
				return partyId != null;
			case PositionPackage.EMPL_POSITION__EMPL_POSITION_TYPE_ID:
				return emplPositionTypeId != null;
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
		result.append(" (emplPositionId: ");
		result.append(emplPositionId);
		result.append(", actualFromDate: ");
		result.append(actualFromDate);
		result.append(", actualThruDate: ");
		result.append(actualThruDate);
		result.append(", budgetId: ");
		result.append(budgetId);
		result.append(", budgetItemSeqId: ");
		result.append(budgetItemSeqId);
		result.append(", estimatedFromDate: ");
		result.append(estimatedFromDate);
		result.append(", estimatedThruDate: ");
		result.append(estimatedThruDate);
		result.append(", exemptFlag: ");
		result.append(exemptFlag);
		result.append(", fulltimeFlag: ");
		result.append(fulltimeFlag);
		result.append(", salaryFlag: ");
		result.append(salaryFlag);
		result.append(", temporaryFlag: ");
		result.append(temporaryFlag);
		result.append(')');
		return result.toString();
	}

} //EmplPositionImpl
