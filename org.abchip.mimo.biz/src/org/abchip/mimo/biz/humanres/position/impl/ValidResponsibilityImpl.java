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
import org.abchip.mimo.biz.humanres.position.EmplPositionType;
import org.abchip.mimo.biz.humanres.position.PositionPackage;
import org.abchip.mimo.biz.humanres.position.ValidResponsibility;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valid Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.ValidResponsibilityImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.ValidResponsibilityImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.ValidResponsibilityImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.ValidResponsibilityImpl#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.impl.ValidResponsibilityImpl#getResponsibilityTypeId <em>Responsibility Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidResponsibilityImpl extends BizEntityImpl implements ValidResponsibility {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The cached value of the '{@link #getEmplPositionTypeId() <em>Empl Position Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionTypeId()
	 * @generated
	 * @ordered
	 */
	protected EmplPositionType emplPositionTypeId;

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
	protected ValidResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PositionPackage.Literals.VALID_RESPONSIBILITY;
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
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionType getEmplPositionTypeId() {
		if (emplPositionTypeId != null && ((EObject)emplPositionTypeId).eIsProxy()) {
			InternalEObject oldEmplPositionTypeId = (InternalEObject)emplPositionTypeId;
			emplPositionTypeId = (EmplPositionType)eResolveProxy(oldEmplPositionTypeId);
			if (emplPositionTypeId != oldEmplPositionTypeId) {
			}
		}
		return emplPositionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplPositionType basicGetEmplPositionTypeId() {
		return emplPositionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionTypeId(EmplPositionType newEmplPositionTypeId) {
		emplPositionTypeId = newEmplPositionTypeId;
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
		fromDate = newFromDate;
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
		responsibilityTypeId = newResponsibilityTypeId;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PositionPackage.VALID_RESPONSIBILITY__FROM_DATE:
				return getFromDate();
			case PositionPackage.VALID_RESPONSIBILITY__COMMENTS:
				return getComments();
			case PositionPackage.VALID_RESPONSIBILITY__THRU_DATE:
				return getThruDate();
			case PositionPackage.VALID_RESPONSIBILITY__EMPL_POSITION_TYPE_ID:
				if (resolve) return getEmplPositionTypeId();
				return basicGetEmplPositionTypeId();
			case PositionPackage.VALID_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID:
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
			case PositionPackage.VALID_RESPONSIBILITY__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PositionPackage.VALID_RESPONSIBILITY__COMMENTS:
				setComments((String)newValue);
				return;
			case PositionPackage.VALID_RESPONSIBILITY__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PositionPackage.VALID_RESPONSIBILITY__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId((EmplPositionType)newValue);
				return;
			case PositionPackage.VALID_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID:
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
			case PositionPackage.VALID_RESPONSIBILITY__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PositionPackage.VALID_RESPONSIBILITY__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PositionPackage.VALID_RESPONSIBILITY__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PositionPackage.VALID_RESPONSIBILITY__EMPL_POSITION_TYPE_ID:
				setEmplPositionTypeId((EmplPositionType)null);
				return;
			case PositionPackage.VALID_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID:
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
			case PositionPackage.VALID_RESPONSIBILITY__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PositionPackage.VALID_RESPONSIBILITY__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PositionPackage.VALID_RESPONSIBILITY__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PositionPackage.VALID_RESPONSIBILITY__EMPL_POSITION_TYPE_ID:
				return emplPositionTypeId != null;
			case PositionPackage.VALID_RESPONSIBILITY__RESPONSIBILITY_TYPE_ID:
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ValidResponsibilityImpl
