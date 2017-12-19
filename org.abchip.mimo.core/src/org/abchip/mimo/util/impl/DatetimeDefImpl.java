/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.util.impl;

import java.util.Date;

import org.abchip.mimo.util.DateFormat;
import org.abchip.mimo.util.DatetimeDef;
import org.abchip.mimo.util.DatetimeType;
import org.abchip.mimo.util.UtilPackage;
import org.abchip.mimo.util.TimeFormat;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datetime Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.impl.DatetimeDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.DatetimeDefImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.abchip.mimo.util.impl.DatetimeDefImpl#getTimeFormat <em>Time Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatetimeDefImpl extends DataDefImpl<Date> implements DatetimeDef {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DatetimeType TYPE_EDEFAULT = DatetimeType.DATE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DatetimeType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final DateFormat DATE_FORMAT_EDEFAULT = DateFormat.ISO;

	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected DateFormat dateFormat = DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final TimeFormat TIME_FORMAT_EDEFAULT = TimeFormat.ISO;

	/**
	 * The cached value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected TimeFormat timeFormat = TIME_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatetimeDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilPackage.Literals.DATETIME_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatetimeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DatetimeType newType) {
		DatetimeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.DATETIME_DEF__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateFormat getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormat(DateFormat newDateFormat) {
		DateFormat oldDateFormat = dateFormat;
		dateFormat = newDateFormat == null ? DATE_FORMAT_EDEFAULT : newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.DATETIME_DEF__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFormat getTimeFormat() {
		return timeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFormat(TimeFormat newTimeFormat) {
		TimeFormat oldTimeFormat = timeFormat;
		timeFormat = newTimeFormat == null ? TIME_FORMAT_EDEFAULT : newTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.DATETIME_DEF__TIME_FORMAT, oldTimeFormat, timeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilPackage.DATETIME_DEF__TYPE:
				return getType();
			case UtilPackage.DATETIME_DEF__DATE_FORMAT:
				return getDateFormat();
			case UtilPackage.DATETIME_DEF__TIME_FORMAT:
				return getTimeFormat();
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
			case UtilPackage.DATETIME_DEF__TYPE:
				setType((DatetimeType)newValue);
				return;
			case UtilPackage.DATETIME_DEF__DATE_FORMAT:
				setDateFormat((DateFormat)newValue);
				return;
			case UtilPackage.DATETIME_DEF__TIME_FORMAT:
				setTimeFormat((TimeFormat)newValue);
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
			case UtilPackage.DATETIME_DEF__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UtilPackage.DATETIME_DEF__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case UtilPackage.DATETIME_DEF__TIME_FORMAT:
				setTimeFormat(TIME_FORMAT_EDEFAULT);
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
			case UtilPackage.DATETIME_DEF__TYPE:
				return type != TYPE_EDEFAULT;
			case UtilPackage.DATETIME_DEF__DATE_FORMAT:
				return dateFormat != DATE_FORMAT_EDEFAULT;
			case UtilPackage.DATETIME_DEF__TIME_FORMAT:
				return timeFormat != TIME_FORMAT_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(", timeFormat: ");
		result.append(timeFormat);
		result.append(')');
		return result.toString();
	}

} //DatetimeDefImpl
