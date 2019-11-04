/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.position.EmplPosition;
import org.abchip.mimo.biz.humanres.position.EmplPositionReportingStruct;
import org.abchip.mimo.biz.humanres.position.PositionPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Position Reporting Struct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl#getEmplPositionIdReportingTo <em>Empl Position Id Reporting To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl#isPrimaryFlag <em>Primary Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionReportingStructImpl#getEmplPositionIdManagedBy <em>Empl Position Id Managed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplPositionReportingStructImpl extends BizEntityImpl implements EmplPositionReportingStruct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEmplPositionIdReportingTo() <em>Empl Position Id Reporting To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionIdReportingTo()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPL_POSITION_ID_REPORTING_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplPositionIdReportingTo() <em>Empl Position Id Reporting To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionIdReportingTo()
	 * @generated
	 * @ordered
	 */
	protected String emplPositionIdReportingTo = EMPL_POSITION_ID_REPORTING_TO_EDEFAULT;

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
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimaryFlag() <em>Primary Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryFlag() <em>Primary Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryFlag = PRIMARY_FLAG_EDEFAULT;

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
	 * The cached value of the '{@link #getEmplPositionIdManagedBy() <em>Empl Position Id Managed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionIdManagedBy()
	 * @generated
	 * @ordered
	 */
	protected EmplPosition emplPositionIdManagedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmplPositionReportingStructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PositionPackage.Literals.EMPL_POSITION_REPORTING_STRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_REPORTING_STRUCT__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrimaryFlag() {
		return primaryFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryFlag(boolean newPrimaryFlag) {
		boolean oldPrimaryFlag = primaryFlag;
		primaryFlag = newPrimaryFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_REPORTING_STRUCT__PRIMARY_FLAG, oldPrimaryFlag, primaryFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPosition getEmplPositionIdManagedBy() {
		if (emplPositionIdManagedBy != null && ((EObject)emplPositionIdManagedBy).eIsProxy()) {
			InternalEObject oldEmplPositionIdManagedBy = (InternalEObject)emplPositionIdManagedBy;
			emplPositionIdManagedBy = (EmplPosition)eResolveProxy(oldEmplPositionIdManagedBy);
			if (emplPositionIdManagedBy != oldEmplPositionIdManagedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY, oldEmplPositionIdManagedBy, emplPositionIdManagedBy));
			}
		}
		return emplPositionIdManagedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplPosition basicGetEmplPositionIdManagedBy() {
		return emplPositionIdManagedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionIdManagedBy(EmplPosition newEmplPositionIdManagedBy) {
		EmplPosition oldEmplPositionIdManagedBy = emplPositionIdManagedBy;
		emplPositionIdManagedBy = newEmplPositionIdManagedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY, oldEmplPositionIdManagedBy, emplPositionIdManagedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmplPositionIdReportingTo() {
		return emplPositionIdReportingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionIdReportingTo(String newEmplPositionIdReportingTo) {
		String oldEmplPositionIdReportingTo = emplPositionIdReportingTo;
		emplPositionIdReportingTo = newEmplPositionIdReportingTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_REPORTING_TO, oldEmplPositionIdReportingTo, emplPositionIdReportingTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_REPORTING_STRUCT__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_REPORTING_STRUCT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_REPORTING_TO:
				return getEmplPositionIdReportingTo();
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__FROM_DATE:
				return getFromDate();
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__COMMENTS:
				return getComments();
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__PRIMARY_FLAG:
				return isPrimaryFlag();
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__THRU_DATE:
				return getThruDate();
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY:
				if (resolve) return getEmplPositionIdManagedBy();
				return basicGetEmplPositionIdManagedBy();
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
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_REPORTING_TO:
				setEmplPositionIdReportingTo((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__COMMENTS:
				setComments((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__PRIMARY_FLAG:
				setPrimaryFlag((Boolean)newValue);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY:
				setEmplPositionIdManagedBy((EmplPosition)newValue);
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
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_REPORTING_TO:
				setEmplPositionIdReportingTo(EMPL_POSITION_ID_REPORTING_TO_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__PRIMARY_FLAG:
				setPrimaryFlag(PRIMARY_FLAG_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY:
				setEmplPositionIdManagedBy((EmplPosition)null);
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
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_REPORTING_TO:
				return EMPL_POSITION_ID_REPORTING_TO_EDEFAULT == null ? emplPositionIdReportingTo != null : !EMPL_POSITION_ID_REPORTING_TO_EDEFAULT.equals(emplPositionIdReportingTo);
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__PRIMARY_FLAG:
				return primaryFlag != PRIMARY_FLAG_EDEFAULT;
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT__EMPL_POSITION_ID_MANAGED_BY:
				return emplPositionIdManagedBy != null;
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
		result.append(" (emplPositionIdReportingTo: ");
		result.append(emplPositionIdReportingTo);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", primaryFlag: ");
		result.append(primaryFlag);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //EmplPositionReportingStructImpl
