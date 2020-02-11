/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata;

import java.util.Date;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tech Data Calendar Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getCalendarWeekId <em>Calendar Week Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getFridayCapacity <em>Friday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getFridayStartTime <em>Friday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getMondayCapacity <em>Monday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getMondayStartTime <em>Monday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSaturdayCapacity <em>Saturday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSaturdayStartTime <em>Saturday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSundayCapacity <em>Sunday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSundayStartTime <em>Sunday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getThursdayCapacity <em>Thursday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getThursdayStartTime <em>Thursday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getTuesdayCapacity <em>Tuesday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getTuesdayStartTime <em>Tuesday Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getWednesdayCapacity <em>Wednesday Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getWednesdayStartTime <em>Wednesday Start Time</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek()
 * @model annotation="mimo-ent-frame help='Used to defined the week definition disponibility for machine' title='Week definition' dictionary='ManufacturingEntityLabels' formula='description'"
 * @generated
 */
public interface TechDataCalendarWeek extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Calendar Week Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar Week Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Week Id</em>' attribute.
	 * @see #setCalendarWeekId(String)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_CalendarWeekId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCalendarWeekId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getCalendarWeekId <em>Calendar Week Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Week Id</em>' attribute.
	 * @see #getCalendarWeekId()
	 * @generated
	 */
	void setCalendarWeekId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Friday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friday Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friday Capacity</em>' attribute.
	 * @see #setFridayCapacity(double)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_FridayCapacity()
	 * @model
	 * @generated
	 */
	double getFridayCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getFridayCapacity <em>Friday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friday Capacity</em>' attribute.
	 * @see #getFridayCapacity()
	 * @generated
	 */
	void setFridayCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Friday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friday Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friday Start Time</em>' attribute.
	 * @see #setFridayStartTime(Date)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_FridayStartTime()
	 * @model
	 * @generated
	 */
	Date getFridayStartTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getFridayStartTime <em>Friday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friday Start Time</em>' attribute.
	 * @see #getFridayStartTime()
	 * @generated
	 */
	void setFridayStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Monday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monday Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monday Capacity</em>' attribute.
	 * @see #setMondayCapacity(double)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_MondayCapacity()
	 * @model
	 * @generated
	 */
	double getMondayCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getMondayCapacity <em>Monday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monday Capacity</em>' attribute.
	 * @see #getMondayCapacity()
	 * @generated
	 */
	void setMondayCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Monday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monday Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monday Start Time</em>' attribute.
	 * @see #setMondayStartTime(Date)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_MondayStartTime()
	 * @model
	 * @generated
	 */
	Date getMondayStartTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getMondayStartTime <em>Monday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monday Start Time</em>' attribute.
	 * @see #getMondayStartTime()
	 * @generated
	 */
	void setMondayStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Saturday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saturday Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saturday Capacity</em>' attribute.
	 * @see #setSaturdayCapacity(double)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_SaturdayCapacity()
	 * @model
	 * @generated
	 */
	double getSaturdayCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSaturdayCapacity <em>Saturday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saturday Capacity</em>' attribute.
	 * @see #getSaturdayCapacity()
	 * @generated
	 */
	void setSaturdayCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Saturday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saturday Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saturday Start Time</em>' attribute.
	 * @see #setSaturdayStartTime(Date)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_SaturdayStartTime()
	 * @model
	 * @generated
	 */
	Date getSaturdayStartTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSaturdayStartTime <em>Saturday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saturday Start Time</em>' attribute.
	 * @see #getSaturdayStartTime()
	 * @generated
	 */
	void setSaturdayStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Sunday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sunday Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sunday Capacity</em>' attribute.
	 * @see #setSundayCapacity(double)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_SundayCapacity()
	 * @model
	 * @generated
	 */
	double getSundayCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSundayCapacity <em>Sunday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sunday Capacity</em>' attribute.
	 * @see #getSundayCapacity()
	 * @generated
	 */
	void setSundayCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Sunday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sunday Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sunday Start Time</em>' attribute.
	 * @see #setSundayStartTime(Date)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_SundayStartTime()
	 * @model
	 * @generated
	 */
	Date getSundayStartTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getSundayStartTime <em>Sunday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sunday Start Time</em>' attribute.
	 * @see #getSundayStartTime()
	 * @generated
	 */
	void setSundayStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Thursday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thursday Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thursday Capacity</em>' attribute.
	 * @see #setThursdayCapacity(double)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_ThursdayCapacity()
	 * @model
	 * @generated
	 */
	double getThursdayCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getThursdayCapacity <em>Thursday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thursday Capacity</em>' attribute.
	 * @see #getThursdayCapacity()
	 * @generated
	 */
	void setThursdayCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Thursday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thursday Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thursday Start Time</em>' attribute.
	 * @see #setThursdayStartTime(Date)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_ThursdayStartTime()
	 * @model
	 * @generated
	 */
	Date getThursdayStartTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getThursdayStartTime <em>Thursday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thursday Start Time</em>' attribute.
	 * @see #getThursdayStartTime()
	 * @generated
	 */
	void setThursdayStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Tuesday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuesday Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuesday Capacity</em>' attribute.
	 * @see #setTuesdayCapacity(double)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_TuesdayCapacity()
	 * @model
	 * @generated
	 */
	double getTuesdayCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getTuesdayCapacity <em>Tuesday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuesday Capacity</em>' attribute.
	 * @see #getTuesdayCapacity()
	 * @generated
	 */
	void setTuesdayCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Tuesday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuesday Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuesday Start Time</em>' attribute.
	 * @see #setTuesdayStartTime(Date)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_TuesdayStartTime()
	 * @model
	 * @generated
	 */
	Date getTuesdayStartTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getTuesdayStartTime <em>Tuesday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuesday Start Time</em>' attribute.
	 * @see #getTuesdayStartTime()
	 * @generated
	 */
	void setTuesdayStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Wednesday Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wednesday Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wednesday Capacity</em>' attribute.
	 * @see #setWednesdayCapacity(double)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_WednesdayCapacity()
	 * @model
	 * @generated
	 */
	double getWednesdayCapacity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getWednesdayCapacity <em>Wednesday Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wednesday Capacity</em>' attribute.
	 * @see #getWednesdayCapacity()
	 * @generated
	 */
	void setWednesdayCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Wednesday Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wednesday Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wednesday Start Time</em>' attribute.
	 * @see #setWednesdayStartTime(Date)
	 * @see org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage#getTechDataCalendarWeek_WednesdayStartTime()
	 * @model
	 * @generated
	 */
	Date getWednesdayStartTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendarWeek#getWednesdayStartTime <em>Wednesday Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wednesday Start Time</em>' attribute.
	 * @see #getWednesdayStartTime()
	 * @generated
	 */
	void setWednesdayStartTime(Date value);

} // TechDataCalendarWeek
