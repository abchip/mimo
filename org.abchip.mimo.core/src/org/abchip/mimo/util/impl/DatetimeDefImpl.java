/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util.impl;

import java.util.Date;

import org.abchip.mimo.util.DateFormat;
import org.abchip.mimo.util.DatetimeDef;
import org.abchip.mimo.util.DatetimeType;
import org.abchip.mimo.util.UtilPackage;
import org.abchip.mimo.util.TimeFormat;
import org.eclipse.emf.ecore.EClass;

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
	@Override
	public DatetimeType getType() {
		return (DatetimeType)eGet(UtilPackage.Literals.DATETIME_DEF__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DatetimeType newType) {
		eSet(UtilPackage.Literals.DATETIME_DEF__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateFormat getDateFormat() {
		return (DateFormat)eGet(UtilPackage.Literals.DATETIME_DEF__DATE_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateFormat(DateFormat newDateFormat) {
		eSet(UtilPackage.Literals.DATETIME_DEF__DATE_FORMAT, newDateFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeFormat getTimeFormat() {
		return (TimeFormat)eGet(UtilPackage.Literals.DATETIME_DEF__TIME_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeFormat(TimeFormat newTimeFormat) {
		eSet(UtilPackage.Literals.DATETIME_DEF__TIME_FORMAT, newTimeFormat);
	}

} //DatetimeDefImpl
