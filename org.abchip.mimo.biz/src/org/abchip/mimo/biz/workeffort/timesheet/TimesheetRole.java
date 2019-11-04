/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.timesheet;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timesheet Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimesheetRole#getTimesheetId <em>Timesheet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimesheetRole#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimesheetRole#getRoleTypeId <em>Role Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimesheetRole()
 * @model
 * @generated
 */
public interface TimesheetRole extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimesheetRole_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimesheetRole#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' reference.
	 * @see #setRoleTypeId(RoleType)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimesheetRole_RoleTypeId()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimesheetRole#getRoleTypeId <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' reference.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(RoleType value);

	/**
	 * Returns the value of the '<em><b>Timesheet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timesheet Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timesheet Id</em>' attribute.
	 * @see #setTimesheetId(String)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimesheetRole_TimesheetId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getTimesheetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimesheetRole#getTimesheetId <em>Timesheet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timesheet Id</em>' attribute.
	 * @see #getTimesheetId()
	 * @generated
	 */
	void setTimesheetId(String value);

} // TimesheetRole
