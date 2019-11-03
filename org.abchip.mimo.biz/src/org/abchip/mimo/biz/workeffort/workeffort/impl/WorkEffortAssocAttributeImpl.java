/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Assoc Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl#getWorkEffortIdFrom <em>Work Effort Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl#getWorkEffortIdTo <em>Work Effort Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl#getAttrValue <em>Attr Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocAttributeImpl#getFromDate <em>From Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortAssocAttributeImpl extends BizEntityImpl implements WorkEffortAssocAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getWorkEffortIdFrom() <em>Work Effort Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortIdFrom() <em>Work Effort Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String workEffortIdFrom = WORK_EFFORT_ID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkEffortIdTo() <em>Work Effort Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortIdTo() <em>Work Effort Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortIdTo()
	 * @generated
	 * @ordered
	 */
	protected String workEffortIdTo = WORK_EFFORT_ID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkEffortAssocTypeId() <em>Work Effort Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ASSOC_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortAssocTypeId() <em>Work Effort Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortAssocTypeId = WORK_EFFORT_ASSOC_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected String attrName = ATTR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrDescription() <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrDescription() <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrDescription()
	 * @generated
	 * @ordered
	 */
	protected String attrDescription = ATTR_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected String attrValue = ATTR_VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortAssocAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_ASSOC_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrDescription() {
		return attrDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrDescription(String newAttrDescription) {
		String oldAttrDescription = attrDescription;
		attrDescription = newAttrDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_DESCRIPTION, oldAttrDescription, attrDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrName() {
		return attrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		String oldAttrName = attrName;
		attrName = newAttrName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_NAME, oldAttrName, attrName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrValue() {
		return attrValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrValue(String newAttrValue) {
		String oldAttrValue = attrValue;
		attrValue = newAttrValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_VALUE, oldAttrValue, attrValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortAssocTypeId() {
		return workEffortAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortAssocTypeId(String newWorkEffortAssocTypeId) {
		String oldWorkEffortAssocTypeId = workEffortAssocTypeId;
		workEffortAssocTypeId = newWorkEffortAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ASSOC_TYPE_ID, oldWorkEffortAssocTypeId, workEffortAssocTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortIdFrom() {
		return workEffortIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortIdFrom(String newWorkEffortIdFrom) {
		String oldWorkEffortIdFrom = workEffortIdFrom;
		workEffortIdFrom = newWorkEffortIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_FROM, oldWorkEffortIdFrom, workEffortIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortIdTo() {
		return workEffortIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortIdTo(String newWorkEffortIdTo) {
		String oldWorkEffortIdTo = workEffortIdTo;
		workEffortIdTo = newWorkEffortIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_TO, oldWorkEffortIdTo, workEffortIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_FROM:
				return getWorkEffortIdFrom();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_TO:
				return getWorkEffortIdTo();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ASSOC_TYPE_ID:
				return getWorkEffortAssocTypeId();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_NAME:
				return getAttrName();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_DESCRIPTION:
				return getAttrDescription();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_VALUE:
				return getAttrValue();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__FROM_DATE:
				return getFromDate();
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_FROM:
				setWorkEffortIdFrom((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_TO:
				setWorkEffortIdTo((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ASSOC_TYPE_ID:
				setWorkEffortAssocTypeId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_VALUE:
				setAttrValue((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__FROM_DATE:
				setFromDate((Date)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_FROM:
				setWorkEffortIdFrom(WORK_EFFORT_ID_FROM_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_TO:
				setWorkEffortIdTo(WORK_EFFORT_ID_TO_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ASSOC_TYPE_ID:
				setWorkEffortAssocTypeId(WORK_EFFORT_ASSOC_TYPE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription(ATTR_DESCRIPTION_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_VALUE:
				setAttrValue(ATTR_VALUE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_FROM:
				return WORK_EFFORT_ID_FROM_EDEFAULT == null ? workEffortIdFrom != null : !WORK_EFFORT_ID_FROM_EDEFAULT.equals(workEffortIdFrom);
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_TO:
				return WORK_EFFORT_ID_TO_EDEFAULT == null ? workEffortIdTo != null : !WORK_EFFORT_ID_TO_EDEFAULT.equals(workEffortIdTo);
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ASSOC_TYPE_ID:
				return WORK_EFFORT_ASSOC_TYPE_ID_EDEFAULT == null ? workEffortAssocTypeId != null : !WORK_EFFORT_ASSOC_TYPE_ID_EDEFAULT.equals(workEffortAssocTypeId);
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_DESCRIPTION:
				return ATTR_DESCRIPTION_EDEFAULT == null ? attrDescription != null : !ATTR_DESCRIPTION_EDEFAULT.equals(attrDescription);
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_VALUE:
				return ATTR_VALUE_EDEFAULT == null ? attrValue != null : !ATTR_VALUE_EDEFAULT.equals(attrValue);
			case WorkeffortPackage.WORK_EFFORT_ASSOC_ATTRIBUTE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
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
		result.append(" (workEffortIdFrom: ");
		result.append(workEffortIdFrom);
		result.append(", workEffortIdTo: ");
		result.append(workEffortIdTo);
		result.append(", workEffortAssocTypeId: ");
		result.append(workEffortAssocTypeId);
		result.append(", attrName: ");
		result.append(attrName);
		result.append(", attrDescription: ");
		result.append(attrDescription);
		result.append(", attrValue: ");
		result.append(attrValue);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(')');
		return result.toString();
	}

} //WorkEffortAssocAttributeImpl
