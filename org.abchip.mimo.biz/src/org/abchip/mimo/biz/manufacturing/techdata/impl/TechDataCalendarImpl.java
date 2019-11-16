/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek;
import org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Data Calendar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getCalendarWeekId <em>Calendar Week Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getTechDataCalendarExcDaies <em>Tech Data Calendar Exc Daies</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarImpl#getTechDataCalendarExcWeeks <em>Tech Data Calendar Exc Weeks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechDataCalendarImpl extends BizEntityImpl implements TechDataCalendar {
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
	 * The cached value of the '{@link #getCalendarWeekId() <em>Calendar Week Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarWeekId()
	 * @generated
	 * @ordered
	 */
	protected TechDataCalendarWeek calendarWeekId;

	/**
	 * The cached value of the '{@link #getTechDataCalendarExcDaies() <em>Tech Data Calendar Exc Daies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechDataCalendarExcDaies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> techDataCalendarExcDaies;

	/**
	 * The cached value of the '{@link #getTechDataCalendarExcWeeks() <em>Tech Data Calendar Exc Weeks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechDataCalendarExcWeeks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> techDataCalendarExcWeeks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechDataCalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechdataPackage.Literals.TECH_DATA_CALENDAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_ID, oldCalendarId, calendarId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_WEEK_ID, oldCalendarWeekId, calendarWeekId));
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
		TechDataCalendarWeek oldCalendarWeekId = calendarWeekId;
		calendarWeekId = newCalendarWeekId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_WEEK_ID, oldCalendarWeekId, calendarWeekId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechdataPackage.TECH_DATA_CALENDAR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getTechDataCalendarExcDaies() {
		if (techDataCalendarExcDaies == null) {
			techDataCalendarExcDaies = new EDataTypeUniqueEList<String>(String.class, this, TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_DAIES);
		}
		return techDataCalendarExcDaies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getTechDataCalendarExcWeeks() {
		if (techDataCalendarExcWeeks == null) {
			techDataCalendarExcWeeks = new EDataTypeUniqueEList<String>(String.class, this, TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_WEEKS);
		}
		return techDataCalendarExcWeeks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> fixedAssets() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_ID:
				return getCalendarId();
			case TechdataPackage.TECH_DATA_CALENDAR__DESCRIPTION:
				return getDescription();
			case TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_WEEK_ID:
				if (resolve) return getCalendarWeekId();
				return basicGetCalendarWeekId();
			case TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_DAIES:
				return getTechDataCalendarExcDaies();
			case TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_WEEKS:
				return getTechDataCalendarExcWeeks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_ID:
				setCalendarId((String)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_WEEK_ID:
				setCalendarWeekId((TechDataCalendarWeek)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_DAIES:
				getTechDataCalendarExcDaies().clear();
				getTechDataCalendarExcDaies().addAll((Collection<? extends String>)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_WEEKS:
				getTechDataCalendarExcWeeks().clear();
				getTechDataCalendarExcWeeks().addAll((Collection<? extends String>)newValue);
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
			case TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_ID:
				setCalendarId(CALENDAR_ID_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_WEEK_ID:
				setCalendarWeekId((TechDataCalendarWeek)null);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_DAIES:
				getTechDataCalendarExcDaies().clear();
				return;
			case TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_WEEKS:
				getTechDataCalendarExcWeeks().clear();
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
			case TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_ID:
				return CALENDAR_ID_EDEFAULT == null ? calendarId != null : !CALENDAR_ID_EDEFAULT.equals(calendarId);
			case TechdataPackage.TECH_DATA_CALENDAR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TechdataPackage.TECH_DATA_CALENDAR__CALENDAR_WEEK_ID:
				return calendarWeekId != null;
			case TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_DAIES:
				return techDataCalendarExcDaies != null && !techDataCalendarExcDaies.isEmpty();
			case TechdataPackage.TECH_DATA_CALENDAR__TECH_DATA_CALENDAR_EXC_WEEKS:
				return techDataCalendarExcWeeks != null && !techDataCalendarExcWeeks.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", techDataCalendarExcDaies: ");
		result.append(techDataCalendarExcDaies);
		result.append(", techDataCalendarExcWeeks: ");
		result.append(techDataCalendarExcWeeks);
		result.append(')');
		return result.toString();
	}

} //TechDataCalendarImpl
