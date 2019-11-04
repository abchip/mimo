/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.ability.ResponsibilityType;
import org.abchip.mimo.biz.humanres.position.EmplPositionResponsibility;
import org.abchip.mimo.biz.humanres.position.PositionPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Position Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionResponsibilityImpl#getEmplPositionId <em>Empl Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionResponsibilityImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionResponsibilityImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionResponsibilityImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.EmplPositionResponsibilityImpl#getResponsibilityTypeId <em>Responsibility Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplPositionResponsibilityImpl extends BizEntityImpl implements EmplPositionResponsibility {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEmplPositionId() <em>Empl Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPL_POSITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplPositionId() <em>Empl Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionId()
	 * @generated
	 * @ordered
	 */
	protected String emplPositionId = EMPL_POSITION_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getResponsibilityTypeId() <em>Responsibility Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibilityTypeId()
	 * @generated
	 * @ordered
	 */
	protected ResponsibilityType responsibilityTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmplPositionResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PositionPackage.Literals.EMPL_POSITION_RESPONSIBILITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_RESPONSIBILITY__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmplPositionId() {
		return emplPositionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionId(String newEmplPositionId) {
		String oldEmplPositionId = emplPositionId;
		emplPositionId = newEmplPositionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_RESPONSIBILITY__EMPL_POSITION_ID, oldEmplPositionId, emplPositionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_RESPONSIBILITY__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsibilityType getResponsibilityTypeId() {
		if (responsibilityTypeId != null && ((EObject)responsibilityTypeId).eIsProxy()) {
			InternalEObject oldResponsibilityTypeId = (InternalEObject)responsibilityTypeId;
			responsibilityTypeId = (ResponsibilityType)eResolveProxy(oldResponsibilityTypeId);
			if (responsibilityTypeId != oldResponsibilityTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PositionPackage.EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID, oldResponsibilityTypeId, responsibilityTypeId));
			}
		}
		return responsibilityTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibilityType basicGetResponsibilityTypeId() {
		return responsibilityTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsibilityTypeId(ResponsibilityType newResponsibilityTypeId) {
		ResponsibilityType oldResponsibilityTypeId = responsibilityTypeId;
		responsibilityTypeId = newResponsibilityTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID, oldResponsibilityTypeId, responsibilityTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PositionPackage.EMPL_POSITION_RESPONSIBILITY__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__EMPL_POSITION_ID:
				return getEmplPositionId();
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__FROM_DATE:
				return getFromDate();
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__COMMENTS:
				return getComments();
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__THRU_DATE:
				return getThruDate();
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID:
				if (resolve) return getResponsibilityTypeId();
				return basicGetResponsibilityTypeId();
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
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__EMPL_POSITION_ID:
				setEmplPositionId((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__COMMENTS:
				setComments((String)newValue);
				return;
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID:
				setResponsibilityTypeId((ResponsibilityType)newValue);
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
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__EMPL_POSITION_ID:
				setEmplPositionId(EMPL_POSITION_ID_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID:
				setResponsibilityTypeId((ResponsibilityType)null);
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
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__EMPL_POSITION_ID:
				return EMPL_POSITION_ID_EDEFAULT == null ? emplPositionId != null : !EMPL_POSITION_ID_EDEFAULT.equals(emplPositionId);
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID:
				return responsibilityTypeId != null;
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
		result.append(" (emplPositionId: ");
		result.append(emplPositionId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //EmplPositionResponsibilityImpl
