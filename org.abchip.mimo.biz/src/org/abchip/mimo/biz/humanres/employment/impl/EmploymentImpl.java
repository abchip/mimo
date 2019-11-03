/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.employment.Employment;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getTerminationReasonId <em>Termination Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getTerminationTypeId <em>Termination Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmploymentImpl extends BizEntityImpl implements Employment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdFrom = ROLE_TYPE_ID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdTo = ROLE_TYPE_ID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String partyIdFrom = PARTY_ID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected String partyIdTo = PARTY_ID_TO_EDEFAULT;

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
	 * The default value of the '{@link #getTerminationReasonId() <em>Termination Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationReasonId()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMINATION_REASON_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationReasonId() <em>Termination Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationReasonId()
	 * @generated
	 * @ordered
	 */
	protected String terminationReasonId = TERMINATION_REASON_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminationTypeId() <em>Termination Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMINATION_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationTypeId() <em>Termination Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationTypeId()
	 * @generated
	 * @ordered
	 */
	protected String terminationTypeId = TERMINATION_TYPE_ID_EDEFAULT;

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
	protected EmploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.EMPLOYMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(String newPartyIdFrom) {
		String oldPartyIdFrom = partyIdFrom;
		partyIdFrom = newPartyIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(String newPartyIdTo) {
		String oldPartyIdTo = partyIdTo;
		partyIdTo = newPartyIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeIdFrom() {
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdFrom(String newRoleTypeIdFrom) {
		String oldRoleTypeIdFrom = roleTypeIdFrom;
		roleTypeIdFrom = newRoleTypeIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_FROM, oldRoleTypeIdFrom, roleTypeIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(String newRoleTypeIdTo) {
		String oldRoleTypeIdTo = roleTypeIdTo;
		roleTypeIdTo = newRoleTypeIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTerminationReasonId() {
		return terminationReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminationReasonId(String newTerminationReasonId) {
		String oldTerminationReasonId = terminationReasonId;
		terminationReasonId = newTerminationReasonId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID, oldTerminationReasonId, terminationReasonId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTerminationTypeId() {
		return terminationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminationTypeId(String newTerminationTypeId) {
		String oldTerminationTypeId = terminationTypeId;
		terminationTypeId = newTerminationTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID, oldTerminationTypeId, terminationTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_FROM:
				return getRoleTypeIdFrom();
			case EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_TO:
				return getRoleTypeIdTo();
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM:
				return getPartyIdFrom();
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_TO:
				return getPartyIdTo();
			case EmploymentPackage.EMPLOYMENT__FROM_DATE:
				return getFromDate();
			case EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID:
				return getTerminationReasonId();
			case EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID:
				return getTerminationTypeId();
			case EmploymentPackage.EMPLOYMENT__THRU_DATE:
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
			case EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM:
				setPartyIdFrom((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_TO:
				setPartyIdTo((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID:
				setTerminationReasonId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID:
				setTerminationTypeId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__THRU_DATE:
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
			case EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom(ROLE_TYPE_ID_FROM_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo(ROLE_TYPE_ID_TO_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM:
				setPartyIdFrom(PARTY_ID_FROM_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_TO:
				setPartyIdTo(PARTY_ID_TO_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID:
				setTerminationReasonId(TERMINATION_REASON_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID:
				setTerminationTypeId(TERMINATION_TYPE_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT__THRU_DATE:
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
			case EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_FROM:
				return ROLE_TYPE_ID_FROM_EDEFAULT == null ? roleTypeIdFrom != null : !ROLE_TYPE_ID_FROM_EDEFAULT.equals(roleTypeIdFrom);
			case EmploymentPackage.EMPLOYMENT__ROLE_TYPE_ID_TO:
				return ROLE_TYPE_ID_TO_EDEFAULT == null ? roleTypeIdTo != null : !ROLE_TYPE_ID_TO_EDEFAULT.equals(roleTypeIdTo);
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM:
				return PARTY_ID_FROM_EDEFAULT == null ? partyIdFrom != null : !PARTY_ID_FROM_EDEFAULT.equals(partyIdFrom);
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_TO:
				return PARTY_ID_TO_EDEFAULT == null ? partyIdTo != null : !PARTY_ID_TO_EDEFAULT.equals(partyIdTo);
			case EmploymentPackage.EMPLOYMENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID:
				return TERMINATION_REASON_ID_EDEFAULT == null ? terminationReasonId != null : !TERMINATION_REASON_ID_EDEFAULT.equals(terminationReasonId);
			case EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID:
				return TERMINATION_TYPE_ID_EDEFAULT == null ? terminationTypeId != null : !TERMINATION_TYPE_ID_EDEFAULT.equals(terminationTypeId);
			case EmploymentPackage.EMPLOYMENT__THRU_DATE:
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
		result.append(" (roleTypeIdFrom: ");
		result.append(roleTypeIdFrom);
		result.append(", roleTypeIdTo: ");
		result.append(roleTypeIdTo);
		result.append(", partyIdFrom: ");
		result.append(partyIdFrom);
		result.append(", partyIdTo: ");
		result.append(partyIdTo);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", terminationReasonId: ");
		result.append(terminationReasonId);
		result.append(", terminationTypeId: ");
		result.append(terminationTypeId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //EmploymentImpl
