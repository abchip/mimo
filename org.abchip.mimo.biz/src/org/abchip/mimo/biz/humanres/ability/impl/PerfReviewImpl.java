/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PerfReview;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perf Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getEmployeePartyId <em>Employee Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getPerfReviewId <em>Perf Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getEmplPositionId <em>Empl Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getManagerPartyId <em>Manager Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getManagerRoleTypeId <em>Manager Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerfReviewImpl extends BizEntityImpl implements PerfReview {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEmployeePartyId() <em>Employee Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeePartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeePartyId() <em>Employee Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeePartyId()
	 * @generated
	 * @ordered
	 */
	protected String employeePartyId = EMPLOYEE_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmployeeRoleTypeId() <em>Employee Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeRoleTypeId() <em>Employee Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String employeeRoleTypeId = EMPLOYEE_ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerfReviewId() <em>Perf Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfReviewId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERF_REVIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerfReviewId() <em>Perf Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfReviewId()
	 * @generated
	 * @ordered
	 */
	protected String perfReviewId = PERF_REVIEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

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
	 * The default value of the '{@link #getManagerPartyId() <em>Manager Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagerPartyId() <em>Manager Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPartyId()
	 * @generated
	 * @ordered
	 */
	protected String managerPartyId = MANAGER_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getManagerRoleTypeId() <em>Manager Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagerRoleTypeId() <em>Manager Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String managerRoleTypeId = MANAGER_ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected String paymentId = PAYMENT_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfReviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbilityPackage.Literals.PERF_REVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__COMMENTS, oldComments, comments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__EMPL_POSITION_ID, oldEmplPositionId, emplPositionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmployeePartyId() {
		return employeePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeePartyId(String newEmployeePartyId) {
		String oldEmployeePartyId = employeePartyId;
		employeePartyId = newEmployeePartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__EMPLOYEE_PARTY_ID, oldEmployeePartyId, employeePartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmployeeRoleTypeId() {
		return employeeRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeeRoleTypeId(String newEmployeeRoleTypeId) {
		String oldEmployeeRoleTypeId = employeeRoleTypeId;
		employeeRoleTypeId = newEmployeeRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID, oldEmployeeRoleTypeId, employeeRoleTypeId));
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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManagerPartyId() {
		return managerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagerPartyId(String newManagerPartyId) {
		String oldManagerPartyId = managerPartyId;
		managerPartyId = newManagerPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__MANAGER_PARTY_ID, oldManagerPartyId, managerPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManagerRoleTypeId() {
		return managerRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagerRoleTypeId(String newManagerRoleTypeId) {
		String oldManagerRoleTypeId = managerRoleTypeId;
		managerRoleTypeId = newManagerRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__MANAGER_ROLE_TYPE_ID, oldManagerRoleTypeId, managerRoleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(String newPaymentId) {
		String oldPaymentId = paymentId;
		paymentId = newPaymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerfReviewId() {
		return perfReviewId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfReviewId(String newPerfReviewId) {
		String oldPerfReviewId = perfReviewId;
		perfReviewId = newPerfReviewId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__PERF_REVIEW_ID, oldPerfReviewId, perfReviewId));
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
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_PARTY_ID:
				return getEmployeePartyId();
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID:
				return getEmployeeRoleTypeId();
			case AbilityPackage.PERF_REVIEW__PERF_REVIEW_ID:
				return getPerfReviewId();
			case AbilityPackage.PERF_REVIEW__COMMENTS:
				return getComments();
			case AbilityPackage.PERF_REVIEW__EMPL_POSITION_ID:
				return getEmplPositionId();
			case AbilityPackage.PERF_REVIEW__FROM_DATE:
				return getFromDate();
			case AbilityPackage.PERF_REVIEW__MANAGER_PARTY_ID:
				return getManagerPartyId();
			case AbilityPackage.PERF_REVIEW__MANAGER_ROLE_TYPE_ID:
				return getManagerRoleTypeId();
			case AbilityPackage.PERF_REVIEW__PAYMENT_ID:
				return getPaymentId();
			case AbilityPackage.PERF_REVIEW__THRU_DATE:
				return getThruDate();
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
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_PARTY_ID:
				setEmployeePartyId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID:
				setEmployeeRoleTypeId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__PERF_REVIEW_ID:
				setPerfReviewId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__COMMENTS:
				setComments((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__EMPL_POSITION_ID:
				setEmplPositionId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__MANAGER_PARTY_ID:
				setManagerPartyId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__MANAGER_ROLE_TYPE_ID:
				setManagerRoleTypeId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__PAYMENT_ID:
				setPaymentId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__THRU_DATE:
				setThruDate((Date)newValue);
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
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_PARTY_ID:
				setEmployeePartyId(EMPLOYEE_PARTY_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID:
				setEmployeeRoleTypeId(EMPLOYEE_ROLE_TYPE_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__PERF_REVIEW_ID:
				setPerfReviewId(PERF_REVIEW_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__EMPL_POSITION_ID:
				setEmplPositionId(EMPL_POSITION_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__MANAGER_PARTY_ID:
				setManagerPartyId(MANAGER_PARTY_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__MANAGER_ROLE_TYPE_ID:
				setManagerRoleTypeId(MANAGER_ROLE_TYPE_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__PAYMENT_ID:
				setPaymentId(PAYMENT_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_PARTY_ID:
				return EMPLOYEE_PARTY_ID_EDEFAULT == null ? employeePartyId != null : !EMPLOYEE_PARTY_ID_EDEFAULT.equals(employeePartyId);
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID:
				return EMPLOYEE_ROLE_TYPE_ID_EDEFAULT == null ? employeeRoleTypeId != null : !EMPLOYEE_ROLE_TYPE_ID_EDEFAULT.equals(employeeRoleTypeId);
			case AbilityPackage.PERF_REVIEW__PERF_REVIEW_ID:
				return PERF_REVIEW_ID_EDEFAULT == null ? perfReviewId != null : !PERF_REVIEW_ID_EDEFAULT.equals(perfReviewId);
			case AbilityPackage.PERF_REVIEW__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case AbilityPackage.PERF_REVIEW__EMPL_POSITION_ID:
				return EMPL_POSITION_ID_EDEFAULT == null ? emplPositionId != null : !EMPL_POSITION_ID_EDEFAULT.equals(emplPositionId);
			case AbilityPackage.PERF_REVIEW__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case AbilityPackage.PERF_REVIEW__MANAGER_PARTY_ID:
				return MANAGER_PARTY_ID_EDEFAULT == null ? managerPartyId != null : !MANAGER_PARTY_ID_EDEFAULT.equals(managerPartyId);
			case AbilityPackage.PERF_REVIEW__MANAGER_ROLE_TYPE_ID:
				return MANAGER_ROLE_TYPE_ID_EDEFAULT == null ? managerRoleTypeId != null : !MANAGER_ROLE_TYPE_ID_EDEFAULT.equals(managerRoleTypeId);
			case AbilityPackage.PERF_REVIEW__PAYMENT_ID:
				return PAYMENT_ID_EDEFAULT == null ? paymentId != null : !PAYMENT_ID_EDEFAULT.equals(paymentId);
			case AbilityPackage.PERF_REVIEW__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (employeePartyId: ");
		result.append(employeePartyId);
		result.append(", employeeRoleTypeId: ");
		result.append(employeeRoleTypeId);
		result.append(", perfReviewId: ");
		result.append(perfReviewId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", emplPositionId: ");
		result.append(emplPositionId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", managerPartyId: ");
		result.append(managerPartyId);
		result.append(", managerRoleTypeId: ");
		result.append(managerRoleTypeId);
		result.append(", paymentId: ");
		result.append(paymentId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PerfReviewImpl
