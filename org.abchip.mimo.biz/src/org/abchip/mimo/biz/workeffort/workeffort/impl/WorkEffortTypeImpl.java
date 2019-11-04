/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeImpl#getWorkEffortTypeId <em>Work Effort Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTypeImpl#getWorkEffortTypeAttrs <em>Work Effort Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortTypeImpl extends BizEntityTypeImpl<WorkEffort> implements WorkEffortType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getWorkEffortTypeId() <em>Work Effort Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortTypeId() <em>Work Effort Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortTypeId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortTypeId = WORK_EFFORT_TYPE_ID_EDEFAULT;

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
	protected WorkEffortType parentTypeId;

	/**
	 * The cached value of the '{@link #getWorkEffortTypeAttrs() <em>Work Effort Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (WorkEffortType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffortType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(WorkEffortType newParentTypeId) {
		WorkEffortType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortTypeId() {
		return workEffortTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortTypeId(String newWorkEffortTypeId) {
		String oldWorkEffortTypeId = workEffortTypeId;
		workEffortTypeId = newWorkEffortTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ID, oldWorkEffortTypeId, workEffortTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortTypeAttrs() {
		if (workEffortTypeAttrs == null) {
			workEffortTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ATTRS);
		}
		return workEffortTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childWorkEffortTypes() {
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
	public List<String> workEfforts() {
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
			case WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ID:
				return getWorkEffortTypeId();
			case WorkeffortPackage.WORK_EFFORT_TYPE__DESCRIPTION:
				return getDescription();
			case WorkeffortPackage.WORK_EFFORT_TYPE__HAS_TABLE:
				return isHasTable();
			case WorkeffortPackage.WORK_EFFORT_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ATTRS:
				return getWorkEffortTypeAttrs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ID:
				setWorkEffortTypeId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((WorkEffortType)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ATTRS:
				getWorkEffortTypeAttrs().clear();
				getWorkEffortTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ID:
				setWorkEffortTypeId(WORK_EFFORT_TYPE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((WorkEffortType)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ATTRS:
				getWorkEffortTypeAttrs().clear();
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
			case WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ID:
				return WORK_EFFORT_TYPE_ID_EDEFAULT == null ? workEffortTypeId != null : !WORK_EFFORT_TYPE_ID_EDEFAULT.equals(workEffortTypeId);
			case WorkeffortPackage.WORK_EFFORT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkeffortPackage.WORK_EFFORT_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case WorkeffortPackage.WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ATTRS:
				return workEffortTypeAttrs != null && !workEffortTypeAttrs.isEmpty();
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
		result.append(" (workEffortTypeId: ");
		result.append(workEffortTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", workEffortTypeAttrs: ");
		result.append(workEffortTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //WorkEffortTypeImpl
