/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.position.EmplPositionClassType;
import org.abchip.mimo.biz.humanres.position.EmplPositionTypeClass;
import org.abchip.mimo.biz.humanres.position.PositionPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Position Type Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeClassImpl#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeClassImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeClassImpl#getStandardHoursPerWeek <em>Standard Hours Per Week</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeClassImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionTypeClassImpl#getEmplPositionClassTypeId <em>Empl Position Class Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplPositionTypeClassImpl extends BizEntityImpl implements EmplPositionTypeClass {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEmplPositionTypeId() <em>Empl Position Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPL_POSITION_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplPositionTypeId() <em>Empl Position Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionTypeId()
	 * @generated
	 * @ordered
	 */
	protected String emplPositionTypeId = EMPL_POSITION_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardHoursPerWeek() <em>Standard Hours Per Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardHoursPerWeek()
	 * @generated
	 * @ordered
	 */
	protected static final double STANDARD_HOURS_PER_WEEK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStandardHoursPerWeek() <em>Standard Hours Per Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardHoursPerWeek()
	 * @generated
	 * @ordered
	 */
	protected double standardHoursPerWeek = STANDARD_HOURS_PER_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmplPositionClassTypeId() <em>Empl Position Class Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionClassTypeId()
	 * @generated
	 * @ordered
	 */
	protected EmplPositionClassType emplPositionClassTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmplPositionTypeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PositionPackage.Literals.EMPL_POSITION_TYPE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionClassType getEmplPositionClassTypeId() {
		if (emplPositionClassTypeId != null && ((EObject)emplPositionClassTypeId).eIsProxy()) {
			InternalEObject oldEmplPositionClassTypeId = (InternalEObject)emplPositionClassTypeId;
			emplPositionClassTypeId = (EmplPositionClassType)eResolveProxy(oldEmplPositionClassTypeId);
			if (emplPositionClassTypeId != oldEmplPositionClassTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE_ID, oldEmplPositionClassTypeId, emplPositionClassTypeId));
			}
		}
		return emplPositionClassTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplPositionClassType basicGetEmplPositionClassTypeId() {
		return emplPositionClassTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionClassTypeId(EmplPositionClassType newEmplPositionClassTypeId) {
		EmplPositionClassType oldEmplPositionClassTypeId = emplPositionClassTypeId;
		emplPositionClassTypeId = newEmplPositionClassTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE_ID, oldEmplPositionClassTypeId, emplPositionClassTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmplPositionTypeId() {
		return emplPositionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionTypeId(String newEmplPositionTypeId) {
		String oldEmplPositionTypeId = emplPositionTypeId;
		emplPositionTypeId = newEmplPositionTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_TYPE_ID, oldEmplPositionTypeId, emplPositionTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_CLASS__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStandardHoursPerWeek() {
		return standardHoursPerWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardHoursPerWeek(double newStandardHoursPerWeek) {
		double oldStandardHoursPerWeek = standardHoursPerWeek;
		standardHoursPerWeek = newStandardHoursPerWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_CLASS__STANDARD_HOURS_PER_WEEK, oldStandardHoursPerWeek, standardHoursPerWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_TYPE_CLASS__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_TYPE_ID:
				return getEmplPositionTypeId();
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__FROM_DATE:
				return getFromDate();
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__STANDARD_HOURS_PER_WEEK:
				return getStandardHoursPerWeek();
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__THRU_DATE:
				return getThruDate();
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE_ID:
				if (resolve) return getEmplPositionClassTypeId();
				return basicGetEmplPositionClassTypeId();
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
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__STANDARD_HOURS_PER_WEEK:
				setStandardHoursPerWeek((Double)newValue);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE_ID:
				setEmplPositionClassTypeId((EmplPositionClassType)newValue);
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
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId(EMPL_POSITION_TYPE_ID_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__STANDARD_HOURS_PER_WEEK:
				setStandardHoursPerWeek(STANDARD_HOURS_PER_WEEK_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE_ID:
				setEmplPositionClassTypeId((EmplPositionClassType)null);
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
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_TYPE_ID:
				return EMPL_POSITION_TYPE_ID_EDEFAULT == null ? emplPositionTypeId != null : !EMPL_POSITION_TYPE_ID_EDEFAULT.equals(emplPositionTypeId);
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__STANDARD_HOURS_PER_WEEK:
				return standardHoursPerWeek != STANDARD_HOURS_PER_WEEK_EDEFAULT;
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PositionPackage.EMPL_POSITION_TYPE_CLASS__EMPL_POSITION_CLASS_TYPE_ID:
				return emplPositionClassTypeId != null;
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
		result.append(" (emplPositionTypeId: ");
		result.append(emplPositionTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", standardHoursPerWeek: ");
		result.append(standardHoursPerWeek);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //EmplPositionTypeClassImpl
