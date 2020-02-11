/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata.impl;

import java.util.Date;
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
		return (String)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__CALENDAR_WEEK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarWeekId(String newCalendarWeekId) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__CALENDAR_WEEK_ID, newCalendarWeekId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFridayCapacity() {
		return (Double)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__FRIDAY_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFridayCapacity(double newFridayCapacity) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__FRIDAY_CAPACITY, newFridayCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFridayStartTime() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__FRIDAY_START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFridayStartTime(Date newFridayStartTime) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__FRIDAY_START_TIME, newFridayStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMondayCapacity() {
		return (Double)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__MONDAY_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMondayCapacity(double newMondayCapacity) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__MONDAY_CAPACITY, newMondayCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getMondayStartTime() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__MONDAY_START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMondayStartTime(Date newMondayStartTime) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__MONDAY_START_TIME, newMondayStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSaturdayCapacity() {
		return (Double)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__SATURDAY_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaturdayCapacity(double newSaturdayCapacity) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__SATURDAY_CAPACITY, newSaturdayCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSaturdayStartTime() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__SATURDAY_START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaturdayStartTime(Date newSaturdayStartTime) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__SATURDAY_START_TIME, newSaturdayStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSundayCapacity() {
		return (Double)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__SUNDAY_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSundayCapacity(double newSundayCapacity) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__SUNDAY_CAPACITY, newSundayCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSundayStartTime() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__SUNDAY_START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSundayStartTime(Date newSundayStartTime) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__SUNDAY_START_TIME, newSundayStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getThursdayCapacity() {
		return (Double)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__THURSDAY_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThursdayCapacity(double newThursdayCapacity) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__THURSDAY_CAPACITY, newThursdayCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThursdayStartTime() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__THURSDAY_START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThursdayStartTime(Date newThursdayStartTime) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__THURSDAY_START_TIME, newThursdayStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTuesdayCapacity() {
		return (Double)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__TUESDAY_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTuesdayCapacity(double newTuesdayCapacity) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__TUESDAY_CAPACITY, newTuesdayCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTuesdayStartTime() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__TUESDAY_START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTuesdayStartTime(Date newTuesdayStartTime) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__TUESDAY_START_TIME, newTuesdayStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWednesdayCapacity() {
		return (Double)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWednesdayCapacity(double newWednesdayCapacity) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_CAPACITY, newWednesdayCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getWednesdayStartTime() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWednesdayStartTime(Date newWednesdayStartTime) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_WEEK__WEDNESDAY_START_TIME, newWednesdayStartTime);
	}

} //TechDataCalendarWeekImpl
