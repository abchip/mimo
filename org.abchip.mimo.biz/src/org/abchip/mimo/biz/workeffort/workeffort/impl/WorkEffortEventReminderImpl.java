/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getCurrentCount <em>Current Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getLocaleId <em>Locale Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getReminderDateTime <em>Reminder Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getReminderOffset <em>Reminder Offset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getRepeatInterval <em>Repeat Interval</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getTimeZoneId <em>Time Zone Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortEventReminderImpl#getPartyId <em>Party Id</em>}</li>
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
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceId() <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceId() <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceId()
	 * @generated
	 * @ordered
	 */
	protected String sequenceId = SEQUENCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentCount() <em>Current Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CURRENT_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCurrentCount() <em>Current Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCount()
	 * @generated
	 * @ordered
	 */
	protected long currentCount = CURRENT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocaleId() <em>Locale Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocaleId() <em>Locale Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleId()
	 * @generated
	 * @ordered
	 */
	protected String localeId = LOCALE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReminderDateTime() <em>Reminder Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReminderDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date REMINDER_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReminderDateTime() <em>Reminder Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReminderDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date reminderDateTime = REMINDER_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReminderOffset() <em>Reminder Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReminderOffset()
	 * @generated
	 * @ordered
	 */
	protected static final long REMINDER_OFFSET_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getReminderOffset() <em>Reminder Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReminderOffset()
	 * @generated
	 * @ordered
	 */
	protected long reminderOffset = REMINDER_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REPEAT_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected long repeatCount = REPEAT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatInterval() <em>Repeat Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatInterval()
	 * @generated
	 * @ordered
	 */
	protected static final long REPEAT_INTERVAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRepeatInterval() <em>Repeat Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatInterval()
	 * @generated
	 * @ordered
	 */
	protected long repeatInterval = REPEAT_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeZoneId() <em>Time Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneId()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ZONE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeZoneId() <em>Time Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeZoneId()
	 * @generated
	 * @ordered
	 */
	protected String timeZoneId = TIME_ZONE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;

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
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID, oldContactMechId, contactMechId));
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		ContactMech oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCurrentCount() {
		return currentCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentCount(long newCurrentCount) {
		long oldCurrentCount = currentCount;
		currentCount = newCurrentCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT, oldCurrentCount, currentCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocaleId() {
		return localeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocaleId(String newLocaleId) {
		String oldLocaleId = localeId;
		localeId = newLocaleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__LOCALE_ID, oldLocaleId, localeId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReminderDateTime() {
		return reminderDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReminderDateTime(Date newReminderDateTime) {
		Date oldReminderDateTime = reminderDateTime;
		reminderDateTime = newReminderDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME, oldReminderDateTime, reminderDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getReminderOffset() {
		return reminderOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReminderOffset(long newReminderOffset) {
		long oldReminderOffset = reminderOffset;
		reminderOffset = newReminderOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET, oldReminderOffset, reminderOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRepeatCount() {
		return repeatCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatCount(long newRepeatCount) {
		long oldRepeatCount = repeatCount;
		repeatCount = newRepeatCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT, oldRepeatCount, repeatCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRepeatInterval() {
		return repeatInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatInterval(long newRepeatInterval) {
		long oldRepeatInterval = repeatInterval;
		repeatInterval = newRepeatInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL, oldRepeatInterval, repeatInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequenceId() {
		return sequenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceId(String newSequenceId) {
		String oldSequenceId = sequenceId;
		sequenceId = newSequenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID, oldSequenceId, sequenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeZoneId() {
		return timeZoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeZoneId(String newTimeZoneId) {
		String oldTimeZoneId = timeZoneId;
		timeZoneId = newTimeZoneId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID, oldTimeZoneId, timeZoneId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		String oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID:
				return getWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID:
				return getSequenceId();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT:
				return getCurrentCount();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__LOCALE_ID:
				return getLocaleId();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME:
				return getReminderDateTime();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET:
				return getReminderOffset();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT:
				return getRepeatCount();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL:
				return getRepeatInterval();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID:
				return getTimeZoneId();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
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
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID:
				setSequenceId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT:
				setCurrentCount((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__LOCALE_ID:
				setLocaleId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME:
				setReminderDateTime((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET:
				setReminderOffset((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT:
				setRepeatCount((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL:
				setRepeatInterval((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID:
				setTimeZoneId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__PARTY_ID:
				setPartyId((Party)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID:
				setSequenceId(SEQUENCE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT:
				setCurrentCount(CURRENT_COUNT_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__LOCALE_ID:
				setLocaleId(LOCALE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME:
				setReminderDateTime(REMINDER_DATE_TIME_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET:
				setReminderOffset(REMINDER_OFFSET_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT:
				setRepeatCount(REPEAT_COUNT_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL:
				setRepeatInterval(REPEAT_INTERVAL_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID:
				setTimeZoneId(TIME_ZONE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__PARTY_ID:
				setPartyId((Party)null);
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
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID:
				return SEQUENCE_ID_EDEFAULT == null ? sequenceId != null : !SEQUENCE_ID_EDEFAULT.equals(sequenceId);
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT:
				return currentCount != CURRENT_COUNT_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__LOCALE_ID:
				return LOCALE_ID_EDEFAULT == null ? localeId != null : !LOCALE_ID_EDEFAULT.equals(localeId);
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME:
				return REMINDER_DATE_TIME_EDEFAULT == null ? reminderDateTime != null : !REMINDER_DATE_TIME_EDEFAULT.equals(reminderDateTime);
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET:
				return reminderOffset != REMINDER_OFFSET_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT:
				return repeatCount != REPEAT_COUNT_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL:
				return repeatInterval != REPEAT_INTERVAL_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID:
				return TIME_ZONE_ID_EDEFAULT == null ? timeZoneId != null : !TIME_ZONE_ID_EDEFAULT.equals(timeZoneId);
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID:
				return contactMechId != null;
			case WorkeffortPackage.WORK_EFFORT_EVENT_REMINDER__PARTY_ID:
				return partyId != null;
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
		result.append(" (workEffortId: ");
		result.append(workEffortId);
		result.append(", sequenceId: ");
		result.append(sequenceId);
		result.append(", currentCount: ");
		result.append(currentCount);
		result.append(", localeId: ");
		result.append(localeId);
		result.append(", reminderDateTime: ");
		result.append(reminderDateTime);
		result.append(", reminderOffset: ");
		result.append(reminderOffset);
		result.append(", repeatCount: ");
		result.append(repeatCount);
		result.append(", repeatInterval: ");
		result.append(repeatInterval);
		result.append(", timeZoneId: ");
		result.append(timeZoneId);
		result.append(')');
		return result.toString();
	}

} //WorkEffortEventReminderImpl
