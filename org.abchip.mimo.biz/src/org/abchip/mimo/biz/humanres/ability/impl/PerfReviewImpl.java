/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PerfReview;
import org.abchip.mimo.biz.humanres.position.EmplPosition;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perf Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getPerfReviewId <em>Perf Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getManagerRoleTypeId <em>Manager Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getEmployeePartyId <em>Employee Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getManagerPartyId <em>Manager Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewImpl#getEmplPositionId <em>Empl Position Id</em>}</li>
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
	 * The cached value of the '{@link #getEmployeePartyId() <em>Employee Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeePartyId()
	 * @generated
	 * @ordered
	 */
	protected Party employeePartyId;

	/**
	 * The cached value of the '{@link #getManagerPartyId() <em>Manager Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party managerPartyId;

	/**
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected Payment paymentId;

	/**
	 * The cached value of the '{@link #getEmplPositionId() <em>Empl Position Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionId()
	 * @generated
	 * @ordered
	 */
	protected EmplPosition emplPositionId;

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
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPosition getEmplPositionId() {
		if (emplPositionId != null && ((EObject)emplPositionId).eIsProxy()) {
			InternalEObject oldEmplPositionId = (InternalEObject)emplPositionId;
			emplPositionId = (EmplPosition)eResolveProxy(oldEmplPositionId);
			if (emplPositionId != oldEmplPositionId) {
			}
		}
		return emplPositionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplPosition basicGetEmplPositionId() {
		return emplPositionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionId(EmplPosition newEmplPositionId) {
		emplPositionId = newEmplPositionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getEmployeePartyId() {
		if (employeePartyId != null && ((EObject)employeePartyId).eIsProxy()) {
			InternalEObject oldEmployeePartyId = (InternalEObject)employeePartyId;
			employeePartyId = (Party)eResolveProxy(oldEmployeePartyId);
			if (employeePartyId != oldEmployeePartyId) {
			}
		}
		return employeePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetEmployeePartyId() {
		return employeePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeePartyId(Party newEmployeePartyId) {
		employeePartyId = newEmployeePartyId;
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
		employeeRoleTypeId = newEmployeeRoleTypeId;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getManagerPartyId() {
		if (managerPartyId != null && ((EObject)managerPartyId).eIsProxy()) {
			InternalEObject oldManagerPartyId = (InternalEObject)managerPartyId;
			managerPartyId = (Party)eResolveProxy(oldManagerPartyId);
			if (managerPartyId != oldManagerPartyId) {
			}
		}
		return managerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetManagerPartyId() {
		return managerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagerPartyId(Party newManagerPartyId) {
		managerPartyId = newManagerPartyId;
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
		managerRoleTypeId = newManagerRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment getPaymentId() {
		if (paymentId != null && ((EObject)paymentId).eIsProxy()) {
			InternalEObject oldPaymentId = (InternalEObject)paymentId;
			paymentId = (Payment)eResolveProxy(oldPaymentId);
			if (paymentId != oldPaymentId) {
			}
		}
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment basicGetPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(Payment newPaymentId) {
		paymentId = newPaymentId;
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
		perfReviewId = newPerfReviewId;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID:
				return getEmployeeRoleTypeId();
			case AbilityPackage.PERF_REVIEW__PERF_REVIEW_ID:
				return getPerfReviewId();
			case AbilityPackage.PERF_REVIEW__COMMENTS:
				return getComments();
			case AbilityPackage.PERF_REVIEW__FROM_DATE:
				return getFromDate();
			case AbilityPackage.PERF_REVIEW__MANAGER_ROLE_TYPE_ID:
				return getManagerRoleTypeId();
			case AbilityPackage.PERF_REVIEW__THRU_DATE:
				return getThruDate();
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_PARTY_ID:
				if (resolve) return getEmployeePartyId();
				return basicGetEmployeePartyId();
			case AbilityPackage.PERF_REVIEW__MANAGER_PARTY_ID:
				if (resolve) return getManagerPartyId();
				return basicGetManagerPartyId();
			case AbilityPackage.PERF_REVIEW__PAYMENT_ID:
				if (resolve) return getPaymentId();
				return basicGetPaymentId();
			case AbilityPackage.PERF_REVIEW__EMPL_POSITION_ID:
				if (resolve) return getEmplPositionId();
				return basicGetEmplPositionId();
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
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID:
				setEmployeeRoleTypeId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__PERF_REVIEW_ID:
				setPerfReviewId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__COMMENTS:
				setComments((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__MANAGER_ROLE_TYPE_ID:
				setManagerRoleTypeId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_PARTY_ID:
				setEmployeePartyId((Party)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__MANAGER_PARTY_ID:
				setManagerPartyId((Party)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__PAYMENT_ID:
				setPaymentId((Payment)newValue);
				return;
			case AbilityPackage.PERF_REVIEW__EMPL_POSITION_ID:
				setEmplPositionId((EmplPosition)newValue);
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
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID:
				setEmployeeRoleTypeId(EMPLOYEE_ROLE_TYPE_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__PERF_REVIEW_ID:
				setPerfReviewId(PERF_REVIEW_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__MANAGER_ROLE_TYPE_ID:
				setManagerRoleTypeId(MANAGER_ROLE_TYPE_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_PARTY_ID:
				setEmployeePartyId((Party)null);
				return;
			case AbilityPackage.PERF_REVIEW__MANAGER_PARTY_ID:
				setManagerPartyId((Party)null);
				return;
			case AbilityPackage.PERF_REVIEW__PAYMENT_ID:
				setPaymentId((Payment)null);
				return;
			case AbilityPackage.PERF_REVIEW__EMPL_POSITION_ID:
				setEmplPositionId((EmplPosition)null);
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
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_ROLE_TYPE_ID:
				return EMPLOYEE_ROLE_TYPE_ID_EDEFAULT == null ? employeeRoleTypeId != null : !EMPLOYEE_ROLE_TYPE_ID_EDEFAULT.equals(employeeRoleTypeId);
			case AbilityPackage.PERF_REVIEW__PERF_REVIEW_ID:
				return PERF_REVIEW_ID_EDEFAULT == null ? perfReviewId != null : !PERF_REVIEW_ID_EDEFAULT.equals(perfReviewId);
			case AbilityPackage.PERF_REVIEW__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case AbilityPackage.PERF_REVIEW__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case AbilityPackage.PERF_REVIEW__MANAGER_ROLE_TYPE_ID:
				return MANAGER_ROLE_TYPE_ID_EDEFAULT == null ? managerRoleTypeId != null : !MANAGER_ROLE_TYPE_ID_EDEFAULT.equals(managerRoleTypeId);
			case AbilityPackage.PERF_REVIEW__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case AbilityPackage.PERF_REVIEW__EMPLOYEE_PARTY_ID:
				return employeePartyId != null;
			case AbilityPackage.PERF_REVIEW__MANAGER_PARTY_ID:
				return managerPartyId != null;
			case AbilityPackage.PERF_REVIEW__PAYMENT_ID:
				return paymentId != null;
			case AbilityPackage.PERF_REVIEW__EMPL_POSITION_ID:
				return emplPositionId != null;
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
		result.append(" (employeeRoleTypeId: ");
		result.append(employeeRoleTypeId);
		result.append(", perfReviewId: ");
		result.append(perfReviewId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", managerRoleTypeId: ");
		result.append(managerRoleTypeId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PerfReviewImpl
