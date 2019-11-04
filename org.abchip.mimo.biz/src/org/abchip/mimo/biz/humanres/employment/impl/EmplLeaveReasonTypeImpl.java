/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import java.util.List;

import org.abchip.mimo.biz.humanres.employment.EmplLeaveReasonType;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Leave Reason Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveReasonTypeImpl#getEmplLeaveReasonTypeId <em>Empl Leave Reason Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveReasonTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveReasonTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveReasonTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplLeaveReasonTypeImpl extends BizEntityImpl implements EmplLeaveReasonType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEmplLeaveReasonTypeId() <em>Empl Leave Reason Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplLeaveReasonTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPL_LEAVE_REASON_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplLeaveReasonTypeId() <em>Empl Leave Reason Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplLeaveReasonTypeId()
	 * @generated
	 * @ordered
	 */
	protected String emplLeaveReasonTypeId = EMPL_LEAVE_REASON_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected EmplLeaveReasonType parentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmplLeaveReasonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.EMPL_LEAVE_REASON_TYPE;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPL_LEAVE_REASON_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPL_LEAVE_REASON_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmplLeaveReasonTypeId() {
		return emplLeaveReasonTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplLeaveReasonTypeId(String newEmplLeaveReasonTypeId) {
		String oldEmplLeaveReasonTypeId = emplLeaveReasonTypeId;
		emplLeaveReasonTypeId = newEmplLeaveReasonTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPL_LEAVE_REASON_TYPE__EMPL_LEAVE_REASON_TYPE_ID, oldEmplLeaveReasonTypeId, emplLeaveReasonTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplLeaveReasonType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (EmplLeaveReasonType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPL_LEAVE_REASON_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplLeaveReasonType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(EmplLeaveReasonType newParentTypeId) {
		EmplLeaveReasonType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPL_LEAVE_REASON_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childEmplLeaveReasonTypes() {
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
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__EMPL_LEAVE_REASON_TYPE_ID:
				return getEmplLeaveReasonTypeId();
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__DESCRIPTION:
				return getDescription();
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__HAS_TABLE:
				return isHasTable();
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
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
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__EMPL_LEAVE_REASON_TYPE_ID:
				setEmplLeaveReasonTypeId((String)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__PARENT_TYPE_ID:
				setParentTypeId((EmplLeaveReasonType)newValue);
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
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__EMPL_LEAVE_REASON_TYPE_ID:
				setEmplLeaveReasonTypeId(EMPL_LEAVE_REASON_TYPE_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__PARENT_TYPE_ID:
				setParentTypeId((EmplLeaveReasonType)null);
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
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__EMPL_LEAVE_REASON_TYPE_ID:
				return EMPL_LEAVE_REASON_TYPE_ID_EDEFAULT == null ? emplLeaveReasonTypeId != null : !EMPL_LEAVE_REASON_TYPE_ID_EDEFAULT.equals(emplLeaveReasonTypeId);
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
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
		result.append(" (emplLeaveReasonTypeId: ");
		result.append(emplLeaveReasonTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(')');
		return result.toString();
	}

} //EmplLeaveReasonTypeImpl
