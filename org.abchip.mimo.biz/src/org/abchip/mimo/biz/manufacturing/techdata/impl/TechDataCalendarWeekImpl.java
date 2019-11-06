/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek;
import org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Data Calendar Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getCalendarWeekId <em>Calendar Week Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getFridayCapacity <em>Friday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getFridayStartTime <em>Friday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getMondayCapacity <em>Monday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getMondayStartTime <em>Monday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getSaturdayCapacity <em>Saturday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getSaturdayStartTime <em>Saturday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getSundayCapacity <em>Sunday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getSundayStartTime <em>Sunday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getThursdayCapacity <em>Thursday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getThursdayStartTime <em>Thursday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getTuesdayCapacity <em>Tuesday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getTuesdayStartTime <em>Tuesday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getWednesdayCapacity <em>Wednesday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.impl.TechDataCalendarWeekImpl#getWednesdayStartTime <em>Wednesday Start Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechDataCalendarWeekImpl extends BizEntityImpl implements TechDataCalendarWeek {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getFridayCapacity() <em>Friday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFridayCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double FRIDAY_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFridayCapacity() <em>Friday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFridayCapacity()
	 * @generated
	 * @ordered
	 */
	protected double fridayCapacity = FRIDAY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFridayStartTime() <em>Friday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFridayStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date FRIDAY_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFridayStartTime() <em>Friday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFridayStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date fridayStartTime = FRIDAY_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMondayCapacity() <em>Monday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMondayCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double MONDAY_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMondayCapacity() <em>Monday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMondayCapacity()
	 * @generated
	 * @ordered
	 */
	protected double mondayCapacity = MONDAY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMondayStartTime() <em>Monday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMondayStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date MONDAY_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMondayStartTime() <em>Monday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMondayStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date mondayStartTime = MONDAY_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaturdayCapacity() <em>Saturday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturdayCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double SATURDAY_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSaturdayCapacity() <em>Saturday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturdayCapacity()
	 * @generated
	 * @ordered
	 */
	protected double saturdayCapacity = SATURDAY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaturdayStartTime() <em>Saturday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturdayStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date SATURDAY_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaturdayStartTime() <em>Saturday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturdayStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date saturdayStartTime = SATURDAY_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSundayCapacity() <em>Sunday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSundayCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double SUNDAY_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSundayCapacity() <em>Sunday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSundayCapacity()
	 * @generated
	 * @ordered
	 */
	protected double sundayCapacity = SUNDAY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSundayStartTime() <em>Sunday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSundayStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUNDAY_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSundayStartTime() <em>Sunday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSundayStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date sundayStartTime = SUNDAY_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getThursdayCapacity() <em>Thursday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThursdayCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double THURSDAY_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThursdayCapacity() <em>Thursday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThursdayCapacity()
	 * @generated
	 * @ordered
	 */
	protected double thursdayCapacity = THURSDAY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThursdayStartTime() <em>Thursday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThursdayStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date THURSDAY_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThursdayStartTime() <em>Thursday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThursdayStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date thursdayStartTime = THURSDAY_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTuesdayCapacity() <em>Tuesday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuesdayCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double TUESDAY_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTuesdayCapacity() <em>Tuesday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuesdayCapacity()
	 * @generated
	 * @ordered
	 */
	protected double tuesdayCapacity = TUESDAY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTuesdayStartTime() <em>Tuesday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuesdayStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TUESDAY_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTuesdayStartTime() <em>Tuesday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuesdayStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date tuesdayStartTime = TUESDAY_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWednesdayCapacity() <em>Wednesday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWednesdayCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double WEDNESDAY_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWednesdayCapacity() <em>Wednesday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWednesdayCapacity()
	 * @generated
	 * @ordered
	 */
	protected double wednesdayCapacity = WEDNESDAY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWednesdayStartTime() <em>Wednesday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWednesdayStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date WEDNESDAY_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWednesdayStartTime() <em>Wednesday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWednesdayStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date wednesdayStartTime = WEDNESDAY_START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechDataCalendarWeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK;
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
	public double getFridayCapacity() {
		return fridayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFridayCapacity(double newFridayCapacity) {
		fridayCapacity = newFridayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFridayStartTime() {
		return fridayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFridayStartTime(Date newFridayStartTime) {
		fridayStartTime = newFridayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMondayCapacity() {
		return mondayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMondayCapacity(double newMondayCapacity) {
		mondayCapacity = newMondayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getMondayStartTime() {
		return mondayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMondayStartTime(Date newMondayStartTime) {
		mondayStartTime = newMondayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSaturdayCapacity() {
		return saturdayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaturdayCapacity(double newSaturdayCapacity) {
		saturdayCapacity = newSaturdayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSaturdayStartTime() {
		return saturdayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaturdayStartTime(Date newSaturdayStartTime) {
		saturdayStartTime = newSaturdayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSundayCapacity() {
		return sundayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSundayCapacity(double newSundayCapacity) {
		sundayCapacity = newSundayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSundayStartTime() {
		return sundayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSundayStartTime(Date newSundayStartTime) {
		sundayStartTime = newSundayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getThursdayCapacity() {
		return thursdayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThursdayCapacity(double newThursdayCapacity) {
		thursdayCapacity = newThursdayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThursdayStartTime() {
		return thursdayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThursdayStartTime(Date newThursdayStartTime) {
		thursdayStartTime = newThursdayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTuesdayCapacity() {
		return tuesdayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTuesdayCapacity(double newTuesdayCapacity) {
		tuesdayCapacity = newTuesdayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTuesdayStartTime() {
		return tuesdayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTuesdayStartTime(Date newTuesdayStartTime) {
		tuesdayStartTime = newTuesdayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWednesdayCapacity() {
		return wednesdayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWednesdayCapacity(double newWednesdayCapacity) {
		wednesdayCapacity = newWednesdayCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getWednesdayStartTime() {
		return wednesdayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWednesdayStartTime(Date newWednesdayStartTime) {
		wednesdayStartTime = newWednesdayStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> techDataCalendarExcWeeks() {
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
	public List<String> techDataCalendars() {
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
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__CALENDAR_WEEK_ID:
				return getCalendarWeekId();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__DESCRIPTION:
				return getDescription();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__FRIDAY_CAPACITY:
				return getFridayCapacity();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__FRIDAY_START_TIME:
				return getFridayStartTime();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__MONDAY_CAPACITY:
				return getMondayCapacity();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__MONDAY_START_TIME:
				return getMondayStartTime();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SATURDAY_CAPACITY:
				return getSaturdayCapacity();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SATURDAY_START_TIME:
				return getSaturdayStartTime();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SUNDAY_CAPACITY:
				return getSundayCapacity();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SUNDAY_START_TIME:
				return getSundayStartTime();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__THURSDAY_CAPACITY:
				return getThursdayCapacity();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__THURSDAY_START_TIME:
				return getThursdayStartTime();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__TUESDAY_CAPACITY:
				return getTuesdayCapacity();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__TUESDAY_START_TIME:
				return getTuesdayStartTime();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_CAPACITY:
				return getWednesdayCapacity();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_START_TIME:
				return getWednesdayStartTime();
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
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__CALENDAR_WEEK_ID:
				setCalendarWeekId((String)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__FRIDAY_CAPACITY:
				setFridayCapacity((Double)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__FRIDAY_START_TIME:
				setFridayStartTime((Date)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__MONDAY_CAPACITY:
				setMondayCapacity((Double)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__MONDAY_START_TIME:
				setMondayStartTime((Date)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SATURDAY_CAPACITY:
				setSaturdayCapacity((Double)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SATURDAY_START_TIME:
				setSaturdayStartTime((Date)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SUNDAY_CAPACITY:
				setSundayCapacity((Double)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SUNDAY_START_TIME:
				setSundayStartTime((Date)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__THURSDAY_CAPACITY:
				setThursdayCapacity((Double)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__THURSDAY_START_TIME:
				setThursdayStartTime((Date)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__TUESDAY_CAPACITY:
				setTuesdayCapacity((Double)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__TUESDAY_START_TIME:
				setTuesdayStartTime((Date)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_CAPACITY:
				setWednesdayCapacity((Double)newValue);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_START_TIME:
				setWednesdayStartTime((Date)newValue);
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
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__CALENDAR_WEEK_ID:
				setCalendarWeekId(CALENDAR_WEEK_ID_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__FRIDAY_CAPACITY:
				setFridayCapacity(FRIDAY_CAPACITY_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__FRIDAY_START_TIME:
				setFridayStartTime(FRIDAY_START_TIME_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__MONDAY_CAPACITY:
				setMondayCapacity(MONDAY_CAPACITY_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__MONDAY_START_TIME:
				setMondayStartTime(MONDAY_START_TIME_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SATURDAY_CAPACITY:
				setSaturdayCapacity(SATURDAY_CAPACITY_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SATURDAY_START_TIME:
				setSaturdayStartTime(SATURDAY_START_TIME_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SUNDAY_CAPACITY:
				setSundayCapacity(SUNDAY_CAPACITY_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SUNDAY_START_TIME:
				setSundayStartTime(SUNDAY_START_TIME_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__THURSDAY_CAPACITY:
				setThursdayCapacity(THURSDAY_CAPACITY_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__THURSDAY_START_TIME:
				setThursdayStartTime(THURSDAY_START_TIME_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__TUESDAY_CAPACITY:
				setTuesdayCapacity(TUESDAY_CAPACITY_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__TUESDAY_START_TIME:
				setTuesdayStartTime(TUESDAY_START_TIME_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_CAPACITY:
				setWednesdayCapacity(WEDNESDAY_CAPACITY_EDEFAULT);
				return;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_START_TIME:
				setWednesdayStartTime(WEDNESDAY_START_TIME_EDEFAULT);
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
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__CALENDAR_WEEK_ID:
				return CALENDAR_WEEK_ID_EDEFAULT == null ? calendarWeekId != null : !CALENDAR_WEEK_ID_EDEFAULT.equals(calendarWeekId);
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__FRIDAY_CAPACITY:
				return fridayCapacity != FRIDAY_CAPACITY_EDEFAULT;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__FRIDAY_START_TIME:
				return FRIDAY_START_TIME_EDEFAULT == null ? fridayStartTime != null : !FRIDAY_START_TIME_EDEFAULT.equals(fridayStartTime);
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__MONDAY_CAPACITY:
				return mondayCapacity != MONDAY_CAPACITY_EDEFAULT;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__MONDAY_START_TIME:
				return MONDAY_START_TIME_EDEFAULT == null ? mondayStartTime != null : !MONDAY_START_TIME_EDEFAULT.equals(mondayStartTime);
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SATURDAY_CAPACITY:
				return saturdayCapacity != SATURDAY_CAPACITY_EDEFAULT;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SATURDAY_START_TIME:
				return SATURDAY_START_TIME_EDEFAULT == null ? saturdayStartTime != null : !SATURDAY_START_TIME_EDEFAULT.equals(saturdayStartTime);
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SUNDAY_CAPACITY:
				return sundayCapacity != SUNDAY_CAPACITY_EDEFAULT;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__SUNDAY_START_TIME:
				return SUNDAY_START_TIME_EDEFAULT == null ? sundayStartTime != null : !SUNDAY_START_TIME_EDEFAULT.equals(sundayStartTime);
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__THURSDAY_CAPACITY:
				return thursdayCapacity != THURSDAY_CAPACITY_EDEFAULT;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__THURSDAY_START_TIME:
				return THURSDAY_START_TIME_EDEFAULT == null ? thursdayStartTime != null : !THURSDAY_START_TIME_EDEFAULT.equals(thursdayStartTime);
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__TUESDAY_CAPACITY:
				return tuesdayCapacity != TUESDAY_CAPACITY_EDEFAULT;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__TUESDAY_START_TIME:
				return TUESDAY_START_TIME_EDEFAULT == null ? tuesdayStartTime != null : !TUESDAY_START_TIME_EDEFAULT.equals(tuesdayStartTime);
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_CAPACITY:
				return wednesdayCapacity != WEDNESDAY_CAPACITY_EDEFAULT;
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_START_TIME:
				return WEDNESDAY_START_TIME_EDEFAULT == null ? wednesdayStartTime != null : !WEDNESDAY_START_TIME_EDEFAULT.equals(wednesdayStartTime);
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
		result.append(" (calendarWeekId: ");
		result.append(calendarWeekId);
		result.append(", description: ");
		result.append(description);
		result.append(", fridayCapacity: ");
		result.append(fridayCapacity);
		result.append(", fridayStartTime: ");
		result.append(fridayStartTime);
		result.append(", mondayCapacity: ");
		result.append(mondayCapacity);
		result.append(", mondayStartTime: ");
		result.append(mondayStartTime);
		result.append(", saturdayCapacity: ");
		result.append(saturdayCapacity);
		result.append(", saturdayStartTime: ");
		result.append(saturdayStartTime);
		result.append(", sundayCapacity: ");
		result.append(sundayCapacity);
		result.append(", sundayStartTime: ");
		result.append(sundayStartTime);
		result.append(", thursdayCapacity: ");
		result.append(thursdayCapacity);
		result.append(", thursdayStartTime: ");
		result.append(thursdayStartTime);
		result.append(", tuesdayCapacity: ");
		result.append(tuesdayCapacity);
		result.append(", tuesdayStartTime: ");
		result.append(tuesdayStartTime);
		result.append(", wednesdayCapacity: ");
		result.append(wednesdayCapacity);
		result.append(", wednesdayStartTime: ");
		result.append(wednesdayStartTime);
		result.append(')');
		return result.toString();
	}

} //TechDataCalendarWeekImpl
