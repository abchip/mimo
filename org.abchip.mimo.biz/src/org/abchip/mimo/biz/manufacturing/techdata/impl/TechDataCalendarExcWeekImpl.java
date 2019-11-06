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
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarExcWeek;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek;
import org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Data Calendar Exc Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getExceptionDateStart <em>Exception Date Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCalendarWeekId <em>Calendar Week Id</em>}</li>
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
	 * The cached value of the '{@link #getCalendarId() <em>Calendar Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarId()
	 * @generated
	 * @ordered
	 */
	protected TechDataCalendar calendarId;

	/**
	 * The cached value of the '{@link #getCalendarWeekId() <em>Calendar Week Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarWeekId()
	 * @generated
	 * @ordered
	 */
	protected TechDataCalendarWeek calendarWeekId;

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
	public TechDataCalendar getCalendarId() {
		if (calendarId != null && ((EObject)calendarId).eIsProxy()) {
			InternalEObject oldCalendarId = (InternalEObject)calendarId;
			calendarId = (TechDataCalendar)eResolveProxy(oldCalendarId);
			if (calendarId != oldCalendarId) {
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
		calendarId = newCalendarId;
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
		exceptionDateStart = newExceptionDateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendarWeek getCalendarWeekId() {
		if (calendarWeekId != null && ((EObject)calendarWeekId).eIsProxy()) {
			InternalEObject oldCalendarWeekId = (InternalEObject)calendarWeekId;
			calendarWeekId = (TechDataCalendarWeek)eResolveProxy(oldCalendarWeekId);
			if (calendarWeekId != oldCalendarWeekId) {
			}
		}
		return calendarWeekId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechDataCalendarWeek basicGetCalendarWeekId() {
		return calendarWeekId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarWeekId(TechDataCalendarWeek newCalendarWeekId) {
		calendarWeekId = newCalendarWeekId;
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
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START:
				return getExceptionDateStart();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION:
				return getDescription();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID:
				if (resolve) return getCalendarId();
				return basicGetCalendarId();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID:
				if (resolve) return getCalendarWeekId();
				return basicGetCalendarWeekId();
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
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START:
				setExceptionDateStart((Date)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID:
				setCalendarId((TechDataCalendar)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID:
				setCalendarWeekId((TechDataCalendarWeek)newValue);
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
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START:
				setExceptionDateStart(EXCEPTION_DATE_START_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID:
				setCalendarId((TechDataCalendar)null);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID:
				setCalendarWeekId((TechDataCalendarWeek)null);
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
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START:
				return EXCEPTION_DATE_START_EDEFAULT == null ? exceptionDateStart != null : !EXCEPTION_DATE_START_EDEFAULT.equals(exceptionDateStart);
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_ID:
				return calendarId != null;
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK_ID:
				return calendarWeekId != null;
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
		result.append(" (exceptionDateStart: ");
		result.append(exceptionDateStart);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TechDataCalendarExcWeekImpl
