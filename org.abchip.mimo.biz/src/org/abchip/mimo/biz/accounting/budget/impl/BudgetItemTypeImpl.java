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

import org.abchip.mimo.biz.accounting.budget.BudgetItem;
import org.abchip.mimo.biz.accounting.budget.BudgetItemType;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeImpl#getBudgetItemTypeId <em>Budget Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemTypeImpl#getBudgetItemTypeAttrs <em>Budget Item Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetItemTypeImpl extends BizEntityTypeImpl<BudgetItem> implements BudgetItemType {
	/**
	 * The default value of the '{@link #getBudgetItemTypeId() <em>Budget Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ITEM_TYPE_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getBudgetItemTypeId() <em>Budget Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String budgetItemTypeId = BUDGET_ITEM_TYPE_ID_EDEFAULT;
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
	 * The default value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String parentTypeId = PARENT_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBudgetItemTypeAttrs() <em>Budget Item Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> budgetItemTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_ITEM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_ITEM_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_ITEM_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(String newParentTypeId) {
		String oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_ITEM_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getBudgetItemTypeAttrs() {
		if (budgetItemTypeAttrs == null) {
			budgetItemTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ATTRS);
		}
		return budgetItemTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> budgetItems() {
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
	public List<String> budgetScenarioRules() {
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
	public List<String> childBudgetItemTypes() {
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
	public String getBudgetItemTypeId() {
		return budgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemTypeId(String newBudgetItemTypeId) {
		String oldBudgetItemTypeId = budgetItemTypeId;
		budgetItemTypeId = newBudgetItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ID, oldBudgetItemTypeId, budgetItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ID:
				return getBudgetItemTypeId();
			case BudgetPackage.BUDGET_ITEM_TYPE__DESCRIPTION:
				return getDescription();
			case BudgetPackage.BUDGET_ITEM_TYPE__HAS_TABLE:
				return isHasTable();
			case BudgetPackage.BUDGET_ITEM_TYPE__PARENT_TYPE_ID:
				return getParentTypeId();
			case BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ATTRS:
				return getBudgetItemTypeAttrs();
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
			case BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId((String)newValue);
				return;
			case BudgetPackage.BUDGET_ITEM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BudgetPackage.BUDGET_ITEM_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case BudgetPackage.BUDGET_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((String)newValue);
				return;
			case BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ATTRS:
				getBudgetItemTypeAttrs().clear();
				getBudgetItemTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId(BUDGET_ITEM_TYPE_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_ITEM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_ITEM_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId(PARENT_TYPE_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ATTRS:
				getBudgetItemTypeAttrs().clear();
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
			case BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ID:
				return BUDGET_ITEM_TYPE_ID_EDEFAULT == null ? budgetItemTypeId != null : !BUDGET_ITEM_TYPE_ID_EDEFAULT.equals(budgetItemTypeId);
			case BudgetPackage.BUDGET_ITEM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BudgetPackage.BUDGET_ITEM_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case BudgetPackage.BUDGET_ITEM_TYPE__PARENT_TYPE_ID:
				return PARENT_TYPE_ID_EDEFAULT == null ? parentTypeId != null : !PARENT_TYPE_ID_EDEFAULT.equals(parentTypeId);
			case BudgetPackage.BUDGET_ITEM_TYPE__BUDGET_ITEM_TYPE_ATTRS:
				return budgetItemTypeAttrs != null && !budgetItemTypeAttrs.isEmpty();
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
		result.append(" (budgetItemTypeId: ");
		result.append(budgetItemTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", parentTypeId: ");
		result.append(parentTypeId);
		result.append(", budgetItemTypeAttrs: ");
		result.append(budgetItemTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //BudgetItemTypeImpl
