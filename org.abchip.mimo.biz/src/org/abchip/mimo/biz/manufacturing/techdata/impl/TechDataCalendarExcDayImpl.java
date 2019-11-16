/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcDay;
import org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Data Calendar Exc Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getExceptionDateStartTime <em>Exception Date Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getExceptionCapacity <em>Exception Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getUsedCapacity <em>Used Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcDayImpl#getCalendarId <em>Calendar Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechDataCalendarExcDayImpl extends BizEntityImpl implements TechDataCalendarExcDay {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getExceptionDateStartTime() <em>Exception Date Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionDateStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXCEPTION_DATE_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionDateStartTime() <em>Exception Date Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionDateStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date exceptionDateStartTime = EXCEPTION_DATE_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionCapacity() <em>Exception Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal EXCEPTION_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionCapacity() <em>Exception Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionCapacity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal exceptionCapacity = EXCEPTION_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedCapacity() <em>Used Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal USED_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedCapacity() <em>Used Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedCapacity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal usedCapacity = USED_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCalendarId() <em>Calendar Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarId()
	 * @generated
	 * @ordered
	 */
	protected TechDataCalendar calendarId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechDataCalendarExcDayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_DAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendar getCalendarId() {
		if (calendarId != null && ((EObject)calendarId).eIsProxy()) {
			InternalEObject oldCalendarId = (InternalEObject)calendarId;
			calendarId = (TechDataCalendar)eResolveProxy(oldCalendarId);
			if (calendarId != oldCalendarId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID, oldCalendarId, calendarId));
			}
		}
		return calendarId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechDataCalendar basicGetCalendarId() {
		return calendarId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarId(TechDataCalendar newCalendarId) {
		TechDataCalendar oldCalendarId = calendarId;
		calendarId = newCalendarId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID, oldCalendarId, calendarId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExceptionDateStartTime() {
		return exceptionDateStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionDateStartTime(Date newExceptionDateStartTime) {
		Date oldExceptionDateStartTime = exceptionDateStartTime;
		exceptionDateStartTime = newExceptionDateStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_DATE_START_TIME, oldExceptionDateStartTime, exceptionDateStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getExceptionCapacity() {
		return exceptionCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionCapacity(BigDecimal newExceptionCapacity) {
		BigDecimal oldExceptionCapacity = exceptionCapacity;
		exceptionCapacity = newExceptionCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_CAPACITY, oldExceptionCapacity, exceptionCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUsedCapacity() {
		return usedCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedCapacity(BigDecimal newUsedCapacity) {
		BigDecimal oldUsedCapacity = usedCapacity;
		usedCapacity = newUsedCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__USED_CAPACITY, oldUsedCapacity, usedCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_DATE_START_TIME:
				return getExceptionDateStartTime();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__DESCRIPTION:
				return getDescription();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_CAPACITY:
				return getExceptionCapacity();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__USED_CAPACITY:
				return getUsedCapacity();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID:
				if (resolve) return getCalendarId();
				return basicGetCalendarId();
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
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_DATE_START_TIME:
				setExceptionDateStartTime((Date)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_CAPACITY:
				setExceptionCapacity((BigDecimal)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__USED_CAPACITY:
				setUsedCapacity((BigDecimal)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID:
				setCalendarId((TechDataCalendar)newValue);
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
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_DATE_START_TIME:
				setExceptionDateStartTime(EXCEPTION_DATE_START_TIME_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_CAPACITY:
				setExceptionCapacity(EXCEPTION_CAPACITY_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__USED_CAPACITY:
				setUsedCapacity(USED_CAPACITY_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID:
				setCalendarId((TechDataCalendar)null);
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
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_DATE_START_TIME:
				return EXCEPTION_DATE_START_TIME_EDEFAULT == null ? exceptionDateStartTime != null : !EXCEPTION_DATE_START_TIME_EDEFAULT.equals(exceptionDateStartTime);
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__EXCEPTION_CAPACITY:
				return EXCEPTION_CAPACITY_EDEFAULT == null ? exceptionCapacity != null : !EXCEPTION_CAPACITY_EDEFAULT.equals(exceptionCapacity);
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__USED_CAPACITY:
				return USED_CAPACITY_EDEFAULT == null ? usedCapacity != null : !USED_CAPACITY_EDEFAULT.equals(usedCapacity);
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY__CALENDAR_ID:
				return calendarId != null;
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
		result.append(" (exceptionDateStartTime: ");
		result.append(exceptionDateStartTime);
		result.append(", description: ");
		result.append(description);
		result.append(", exceptionCapacity: ");
		result.append(exceptionCapacity);
		result.append(", usedCapacity: ");
		result.append(usedCapacity);
		result.append(')');
		return result.toString();
	}

} //TechDataCalendarExcDayImpl
