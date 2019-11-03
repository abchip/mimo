/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek;
import org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Data Calendar Exc Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getExceptionDateStart <em>Exception Date Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCalendarWeekId <em>Calendar Week Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechDataCalendarExcWeekImpl extends BizEntityImpl implements TechDataCalendarExcWeek {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCalendarId() <em>Calendar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarId()
	 * @generated
	 * @ordered
	 */
	protected static final String CALENDAR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalendarId() <em>Calendar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarId()
	 * @generated
	 * @ordered
	 */
	protected String calendarId = CALENDAR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptionDateStart() <em>Exception Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionDateStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXCEPTION_DATE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionDateStart() <em>Exception Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionDateStart()
	 * @generated
	 * @ordered
	 */
	protected Date exceptionDateStart = EXCEPTION_DATE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalendarWeekId() <em>Calendar Week Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarWeekId()
	 * @generated
	 * @ordered
	 */
	protected static final String CALENDAR_WEEK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalendarWeekId() <em>Calendar Week Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarWeekId()
	 * @generated
	 * @ordered
	 */
	protected String calendarWeekId = CALENDAR_WEEK_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechDataCalendarExcWeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCalendarId() {
		return calendarId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarId(String newCalendarId) {
		String oldCalendarId = calendarId;
		calendarId = newCalendarId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID, oldCalendarId, calendarId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExceptionDateStart() {
		return exceptionDateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionDateStart(Date newExceptionDateStart) {
		Date oldExceptionDateStart = exceptionDateStart;
		exceptionDateStart = newExceptionDateStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START, oldExceptionDateStart, exceptionDateStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCalendarWeekId() {
		return calendarWeekId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarWeekId(String newCalendarWeekId) {
		String oldCalendarWeekId = calendarWeekId;
		calendarWeekId = newCalendarWeekId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID, oldCalendarWeekId, calendarWeekId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID:
				return getCalendarId();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START:
				return getExceptionDateStart();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID:
				return getCalendarWeekId();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION:
				return getDescription();
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
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID:
				setCalendarId((String)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START:
				setExceptionDateStart((Date)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID:
				setCalendarWeekId((String)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION:
				setDescription((String)newValue);
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
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID:
				setCalendarId(CALENDAR_ID_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START:
				setExceptionDateStart(EXCEPTION_DATE_START_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID:
				setCalendarWeekId(CALENDAR_WEEK_ID_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID:
				return CALENDAR_ID_EDEFAULT == null ? calendarId != null : !CALENDAR_ID_EDEFAULT.equals(calendarId);
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START:
				return EXCEPTION_DATE_START_EDEFAULT == null ? exceptionDateStart != null : !EXCEPTION_DATE_START_EDEFAULT.equals(exceptionDateStart);
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID:
				return CALENDAR_WEEK_ID_EDEFAULT == null ? calendarWeekId != null : !CALENDAR_WEEK_ID_EDEFAULT.equals(calendarWeekId);
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (calendarId: ");
		result.append(calendarId);
		result.append(", exceptionDateStart: ");
		result.append(exceptionDateStart);
		result.append(", calendarWeekId: ");
		result.append(calendarWeekId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TechDataCalendarExcWeekImpl
