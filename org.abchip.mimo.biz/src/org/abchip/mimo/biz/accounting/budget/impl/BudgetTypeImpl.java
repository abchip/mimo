/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.accounting.budget.Budget;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetType;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeImpl#getBudgetTypeId <em>Budget Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeImpl#getBudgetTypeAttrs <em>Budget Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetTypeImpl extends BizEntityTypeImpl<Budget> implements BudgetType {
	/**
	 * The default value of the '{@link #getBudgetTypeId() <em>Budget Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_TYPE_ID_EDEFAULT = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getBudgetTypeId() <em>Budget Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetTypeId()
	 * @generated
	 * @ordered
	 */
	protected String budgetTypeId = BUDGET_TYPE_ID_EDEFAULT;

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
	protected BudgetType parentTypeId;

	/**
	 * The cached value of the '{@link #getBudgetTypeAttrs() <em>Budget Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> budgetTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (BudgetType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BudgetPackage.BUDGET_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(BudgetType newParentTypeId) {
		BudgetType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getBudgetTypeAttrs() {
		if (budgetTypeAttrs == null) {
			budgetTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ATTRS);
		}
		return budgetTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> budgets() {
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
	public List<String> childBudgetTypes() {
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
	public String getBudgetTypeId() {
		return budgetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetTypeId(String newBudgetTypeId) {
		String oldBudgetTypeId = budgetTypeId;
		budgetTypeId = newBudgetTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ID, oldBudgetTypeId, budgetTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ID:
				return getBudgetTypeId();
			case BudgetPackage.BUDGET_TYPE__DESCRIPTION:
				return getDescription();
			case BudgetPackage.BUDGET_TYPE__HAS_TABLE:
				return isHasTable();
			case BudgetPackage.BUDGET_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ATTRS:
				return getBudgetTypeAttrs();
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
			case BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ID:
				setBudgetTypeId((String)newValue);
				return;
			case BudgetPackage.BUDGET_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BudgetPackage.BUDGET_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case BudgetPackage.BUDGET_TYPE__PARENT_TYPE_ID:
				setParentTypeId((BudgetType)newValue);
				return;
			case BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ATTRS:
				getBudgetTypeAttrs().clear();
				getBudgetTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ID:
				setBudgetTypeId(BUDGET_TYPE_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_TYPE__PARENT_TYPE_ID:
				setParentTypeId((BudgetType)null);
				return;
			case BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ATTRS:
				getBudgetTypeAttrs().clear();
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
			case BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ID:
				return BUDGET_TYPE_ID_EDEFAULT == null ? budgetTypeId != null : !BUDGET_TYPE_ID_EDEFAULT.equals(budgetTypeId);
			case BudgetPackage.BUDGET_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BudgetPackage.BUDGET_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case BudgetPackage.BUDGET_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case BudgetPackage.BUDGET_TYPE__BUDGET_TYPE_ATTRS:
				return budgetTypeAttrs != null && !budgetTypeAttrs.isEmpty();
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
		result.append(" (budgetTypeId: ");
		result.append(budgetTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", budgetTypeAttrs: ");
		result.append(budgetTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //BudgetTypeImpl
