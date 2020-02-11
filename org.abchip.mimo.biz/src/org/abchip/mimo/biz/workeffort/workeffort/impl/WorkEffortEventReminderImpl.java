/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Event Reminder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getCurrentCount <em>Current Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getLocaleId <em>Locale Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getReminderDateTime <em>Reminder Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getReminderOffset <em>Reminder Offset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getRepeatInterval <em>Repeat Interval</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getTimeZoneId <em>Time Zone Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortEventReminderImpl extends BizEntityImpl implements WorkEffortEventReminder {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortEventReminderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		return (ContactMech)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID, newContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCurrentCount() {
		return (Long)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentCount(long newCurrentCount) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT, newCurrentCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocaleId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__LOCALE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocaleId(String newLocaleId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__LOCALE_ID, newLocaleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReminderDateTime() {
		return (Date)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReminderDateTime(Date newReminderDateTime) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME, newReminderDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getReminderOffset() {
		return (Long)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReminderOffset(long newReminderOffset) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET, newReminderOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRepeatCount() {
		return (Long)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatCount(long newRepeatCount) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT, newRepeatCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRepeatInterval() {
		return (Long)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatInterval(long newRepeatInterval) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL, newRepeatInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequenceId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceId(String newSequenceId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID, newSequenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeZoneId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeZoneId(String newTimeZoneId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID, newTimeZoneId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortId() {
		return (WorkEffort)eGet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID, newWorkEffortId);
	}

} //WorkEffortEventReminderImpl
