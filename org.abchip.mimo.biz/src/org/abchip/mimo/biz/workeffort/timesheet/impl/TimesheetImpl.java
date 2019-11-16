/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.timesheet.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.workeffort.timesheet.Timesheet;
import org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getTimesheetId <em>Timesheet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getClientPartyId <em>Client Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getApprovedByUserLoginId <em>Approved By User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimesheetImpl extends BizEntityImpl implements Timesheet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimesheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimesheetPackage.Literals.TIMESHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getApprovedByUserLoginId() {
		return (UserLogin)eGet(TimesheetPackage.Literals.TIMESHEET__APPROVED_BY_USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovedByUserLoginId(UserLogin newApprovedByUserLoginId) {
		eSet(TimesheetPackage.Literals.TIMESHEET__APPROVED_BY_USER_LOGIN_ID, newApprovedByUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getClientPartyId() {
		return (Party)eGet(TimesheetPackage.Literals.TIMESHEET__CLIENT_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientPartyId(Party newClientPartyId) {
		eSet(TimesheetPackage.Literals.TIMESHEET__CLIENT_PARTY_ID, newClientPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(TimesheetPackage.Literals.TIMESHEET__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(TimesheetPackage.Literals.TIMESHEET__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(TimesheetPackage.Literals.TIMESHEET__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(TimesheetPackage.Literals.TIMESHEET__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(TimesheetPackage.Literals.TIMESHEET__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(TimesheetPackage.Literals.TIMESHEET__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(TimesheetPackage.Literals.TIMESHEET__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(TimesheetPackage.Literals.TIMESHEET__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(TimesheetPackage.Literals.TIMESHEET__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(TimesheetPackage.Literals.TIMESHEET__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> timeEntries() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TimesheetPackage.TIMESHEET___TIME_ENTRIES:
				return timeEntries();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimesheetId() {
		return (String)eGet(TimesheetPackage.Literals.TIMESHEET__TIMESHEET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimesheetId(String newTimesheetId) {
		eSet(TimesheetPackage.Literals.TIMESHEET__TIMESHEET_ID, newTimesheetId);
	}

} //TimesheetImpl
