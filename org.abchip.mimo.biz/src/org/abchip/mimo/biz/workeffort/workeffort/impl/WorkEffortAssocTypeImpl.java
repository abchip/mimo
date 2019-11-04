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
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType;
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
 * An implementation of the model object '<em><b>Work Effort Assoc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeImpl#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortAssocTypeImpl#getWorkEffortAssocTypeAttrs <em>Work Effort Assoc Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortAssocTypeImpl extends BizEntityTypeImpl<WorkEffortAssoc> implements WorkEffortAssocType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	protected WorkEffortAssocType parentTypeId;

	/**
	 * The cached value of the '{@link #getWorkEffortAssocTypeAttrs() <em>Work Effort Assoc Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortAssocTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortAssocTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortAssocTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_ASSOC_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortAssocType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (WorkEffortAssocType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffortAssocType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(WorkEffortAssocType newParentTypeId) {
		WorkEffortAssocType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ID, oldWorkEffortAssocTypeId, workEffortAssocTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortAssocTypeAttrs() {
		if (workEffortAssocTypeAttrs == null) {
			workEffortAssocTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ATTRS);
		}
		return workEffortAssocTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childWorkEffortAssocTypes() {
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ID:
				return getWorkEffortAssocTypeId();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__DESCRIPTION:
				return getDescription();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__HAS_TABLE:
				return isHasTable();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ATTRS:
				return getWorkEffortAssocTypeAttrs();
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ID:
				setWorkEffortAssocTypeId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID:
				setParentTypeId((WorkEffortAssocType)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ATTRS:
				getWorkEffortAssocTypeAttrs().clear();
				getWorkEffortAssocTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ID:
				setWorkEffortAssocTypeId(WORK_EFFORT_ASSOC_TYPE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID:
				setParentTypeId((WorkEffortAssocType)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ATTRS:
				getWorkEffortAssocTypeAttrs().clear();
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
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ID:
				return WORK_EFFORT_ASSOC_TYPE_ID_EDEFAULT == null ? workEffortAssocTypeId != null : !WORK_EFFORT_ASSOC_TYPE_ID_EDEFAULT.equals(workEffortAssocTypeId);
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case WorkeffortPackage.WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ATTRS:
				return workEffortAssocTypeAttrs != null && !workEffortAssocTypeAttrs.isEmpty();
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
		result.append(" (workEffortAssocTypeId: ");
		result.append(workEffortAssocTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", workEffortAssocTypeAttrs: ");
		result.append(workEffortAssocTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //WorkEffortAssocTypeImpl
