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
import org.abchip.mimo.biz.humanres.employment.TerminationReason;
import org.abchip.mimo.biz.humanres.employment.TerminationType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getTerminationReasonId <em>Termination Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentImpl#getTerminationTypeId <em>Termination Type Id</em>}</li>
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
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdTo;

	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdFrom;

	/**
	 * The cached value of the '{@link #getTerminationReasonId() <em>Termination Reason Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationReasonId()
	 * @generated
	 * @ordered
	 */
	protected TerminationReason terminationReasonId;

	/**
	 * The cached value of the '{@link #getTerminationTypeId() <em>Termination Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationTypeId()
	 * @generated
	 * @ordered
	 */
	protected TerminationType terminationTypeId;

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
	public Party getPartyIdFrom() {
		if (partyIdFrom != null && ((EObject)partyIdFrom).eIsProxy()) {
			InternalEObject oldPartyIdFrom = (InternalEObject)partyIdFrom;
			partyIdFrom = (Party)eResolveProxy(oldPartyIdFrom);
			if (partyIdFrom != oldPartyIdFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
			}
		}
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		Party oldPartyIdFrom = partyIdFrom;
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
	public Party getPartyIdTo() {
		if (partyIdTo != null && ((EObject)partyIdTo).eIsProxy()) {
			InternalEObject oldPartyIdTo = (InternalEObject)partyIdTo;
			partyIdTo = (Party)eResolveProxy(oldPartyIdTo);
			if (partyIdTo != oldPartyIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
			}
		}
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		Party oldPartyIdTo = partyIdTo;
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
	public TerminationReason getTerminationReasonId() {
		if (terminationReasonId != null && ((EObject)terminationReasonId).eIsProxy()) {
			InternalEObject oldTerminationReasonId = (InternalEObject)terminationReasonId;
			terminationReasonId = (TerminationReason)eResolveProxy(oldTerminationReasonId);
			if (terminationReasonId != oldTerminationReasonId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID, oldTerminationReasonId, terminationReasonId));
			}
		}
		return terminationReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminationReason basicGetTerminationReasonId() {
		return terminationReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminationReasonId(TerminationReason newTerminationReasonId) {
		TerminationReason oldTerminationReasonId = terminationReasonId;
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
	public TerminationType getTerminationTypeId() {
		if (terminationTypeId != null && ((EObject)terminationTypeId).eIsProxy()) {
			InternalEObject oldTerminationTypeId = (InternalEObject)terminationTypeId;
			terminationTypeId = (TerminationType)eResolveProxy(oldTerminationTypeId);
			if (terminationTypeId != oldTerminationTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID, oldTerminationTypeId, terminationTypeId));
			}
		}
		return terminationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminationType basicGetTerminationTypeId() {
		return terminationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminationTypeId(TerminationType newTerminationTypeId) {
		TerminationType oldTerminationTypeId = terminationTypeId;
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
			case EmploymentPackage.EMPLOYMENT__FROM_DATE:
				return getFromDate();
			case EmploymentPackage.EMPLOYMENT__THRU_DATE:
				return getThruDate();
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_TO:
				if (resolve) return getPartyIdTo();
				return basicGetPartyIdTo();
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM:
				if (resolve) return getPartyIdFrom();
				return basicGetPartyIdFrom();
			case EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID:
				if (resolve) return getTerminationReasonId();
				return basicGetTerminationReasonId();
			case EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID:
				if (resolve) return getTerminationTypeId();
				return basicGetTerminationTypeId();
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
			case EmploymentPackage.EMPLOYMENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_TO:
				setPartyIdTo((Party)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID:
				setTerminationReasonId((TerminationReason)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID:
				setTerminationTypeId((TerminationType)newValue);
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
			case EmploymentPackage.EMPLOYMENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_TO:
				setPartyIdTo((Party)null);
				return;
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)null);
				return;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID:
				setTerminationReasonId((TerminationReason)null);
				return;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID:
				setTerminationTypeId((TerminationType)null);
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
			case EmploymentPackage.EMPLOYMENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case EmploymentPackage.EMPLOYMENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_TO:
				return partyIdTo != null;
			case EmploymentPackage.EMPLOYMENT__PARTY_ID_FROM:
				return partyIdFrom != null;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_REASON_ID:
				return terminationReasonId != null;
			case EmploymentPackage.EMPLOYMENT__TERMINATION_TYPE_ID:
				return terminationTypeId != null;
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
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //EmploymentImpl
