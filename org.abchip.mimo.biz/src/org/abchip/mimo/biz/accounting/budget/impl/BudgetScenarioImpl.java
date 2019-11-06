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

import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetScenario;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioImpl#getBudgetScenarioId <em>Budget Scenario Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioImpl#getBudgetScenarioRules <em>Budget Scenario Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetScenarioImpl extends BizEntityImpl implements BudgetScenario {
	/**
	 * The default value of the '{@link #getBudgetScenarioId() <em>Budget Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetScenarioId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_SCENARIO_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getBudgetScenarioId() <em>Budget Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetScenarioId()
	 * @generated
	 * @ordered
	 */
	protected String budgetScenarioId = BUDGET_SCENARIO_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getBudgetScenarioRules() <em>Budget Scenario Rules</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetScenarioRules()
	 * @generated
	 * @ordered
	 */
	protected EList<String> budgetScenarioRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_SCENARIO;
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
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getBudgetScenarioRules() {
		if (budgetScenarioRules == null) {
			budgetScenarioRules = new BasicInternalEList<String>(String.class);
		}
		return budgetScenarioRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> budgetScenarioApplications() {
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
	public String getBudgetScenarioId() {
		return budgetScenarioId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetScenarioId(String newBudgetScenarioId) {
		budgetScenarioId = newBudgetScenarioId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_SCENARIO__BUDGET_SCENARIO_ID:
				return getBudgetScenarioId();
			case BudgetPackage.BUDGET_SCENARIO__DESCRIPTION:
				return getDescription();
			case BudgetPackage.BUDGET_SCENARIO__BUDGET_SCENARIO_RULES:
				return getBudgetScenarioRules();
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
			case BudgetPackage.BUDGET_SCENARIO__BUDGET_SCENARIO_ID:
				setBudgetScenarioId((String)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO__BUDGET_SCENARIO_RULES:
				getBudgetScenarioRules().clear();
				getBudgetScenarioRules().addAll((Collection<? extends String>)newValue);
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
			case BudgetPackage.BUDGET_SCENARIO__BUDGET_SCENARIO_ID:
				setBudgetScenarioId(BUDGET_SCENARIO_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_SCENARIO__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_SCENARIO__BUDGET_SCENARIO_RULES:
				getBudgetScenarioRules().clear();
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
			case BudgetPackage.BUDGET_SCENARIO__BUDGET_SCENARIO_ID:
				return BUDGET_SCENARIO_ID_EDEFAULT == null ? budgetScenarioId != null : !BUDGET_SCENARIO_ID_EDEFAULT.equals(budgetScenarioId);
			case BudgetPackage.BUDGET_SCENARIO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BudgetPackage.BUDGET_SCENARIO__BUDGET_SCENARIO_RULES:
				return budgetScenarioRules != null && !budgetScenarioRules.isEmpty();
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
		result.append(" (budgetScenarioId: ");
		result.append(budgetScenarioId);
		result.append(", description: ");
		result.append(description);
		result.append(", budgetScenarioRules: ");
		result.append(budgetScenarioRules);
		result.append(')');
		return result.toString();
	}

} //BudgetScenarioImpl
