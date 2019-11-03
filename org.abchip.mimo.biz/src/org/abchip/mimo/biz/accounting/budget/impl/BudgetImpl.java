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
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetTypeId <em>Budget Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetAttributes <em>Budget Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetItems <em>Budget Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetRevisions <em>Budget Revisions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetStatuss <em>Budget Statuss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetImpl extends BizEntityTypedImpl<BudgetType> implements Budget {
	/**
	 * The default value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected String budgetId = BUDGET_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getBudgetTypeId() <em>Budget Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetTypeId()
	 * @generated
	 * @ordered
	 */
	protected String budgetTypeId = BUDGET_TYPE_ID_EDEFAULT;
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
	 * The default value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TIME_PERIOD_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected String customTimePeriodId = CUSTOM_TIME_PERIOD_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBudgetAttributes() <em>Budget Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> budgetAttributes;
	/**
	 * The cached value of the '{@link #getBudgetItems() <em>Budget Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> budgetItems;
	/**
	 * The cached value of the '{@link #getBudgetRevisions() <em>Budget Revisions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> budgetRevisions;
	/**
	 * The cached value of the '{@link #getBudgetStatuss() <em>Budget Statuss</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetStatuss()
	 * @generated
	 * @ordered
	 */
	protected EList<String> budgetStatuss;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomTimePeriodId() {
		return customTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTimePeriodId(String newCustomTimePeriodId) {
		String oldCustomTimePeriodId = customTimePeriodId;
		customTimePeriodId = newCustomTimePeriodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET__CUSTOM_TIME_PERIOD_ID, oldCustomTimePeriodId, customTimePeriodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getBudgetAttributes() {
		if (budgetAttributes == null) {
			budgetAttributes = new EDataTypeUniqueEList<String>(String.class, this, BudgetPackage.BUDGET__BUDGET_ATTRIBUTES);
		}
		return budgetAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getBudgetItems() {
		if (budgetItems == null) {
			budgetItems = new EDataTypeUniqueEList<String>(String.class, this, BudgetPackage.BUDGET__BUDGET_ITEMS);
		}
		return budgetItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getBudgetRevisions() {
		if (budgetRevisions == null) {
			budgetRevisions = new EDataTypeUniqueEList<String>(String.class, this, BudgetPackage.BUDGET__BUDGET_REVISIONS);
		}
		return budgetRevisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getBudgetStatuss() {
		if (budgetStatuss == null) {
			budgetStatuss = new EDataTypeUniqueEList<String>(String.class, this, BudgetPackage.BUDGET__BUDGET_STATUSS);
		}
		return budgetStatuss;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET__BUDGET_TYPE_ID, oldBudgetTypeId, budgetTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetId() {
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(String newBudgetId) {
		String oldBudgetId = budgetId;
		budgetId = newBudgetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET__BUDGET_ID, oldBudgetId, budgetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET__BUDGET_ID:
				return getBudgetId();
			case BudgetPackage.BUDGET__BUDGET_TYPE_ID:
				return getBudgetTypeId();
			case BudgetPackage.BUDGET__COMMENTS:
				return getComments();
			case BudgetPackage.BUDGET__CUSTOM_TIME_PERIOD_ID:
				return getCustomTimePeriodId();
			case BudgetPackage.BUDGET__BUDGET_ATTRIBUTES:
				return getBudgetAttributes();
			case BudgetPackage.BUDGET__BUDGET_ITEMS:
				return getBudgetItems();
			case BudgetPackage.BUDGET__BUDGET_REVISIONS:
				return getBudgetRevisions();
			case BudgetPackage.BUDGET__BUDGET_STATUSS:
				return getBudgetStatuss();
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
			case BudgetPackage.BUDGET__BUDGET_ID:
				setBudgetId((String)newValue);
				return;
			case BudgetPackage.BUDGET__BUDGET_TYPE_ID:
				setBudgetTypeId((String)newValue);
				return;
			case BudgetPackage.BUDGET__COMMENTS:
				setComments((String)newValue);
				return;
			case BudgetPackage.BUDGET__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((String)newValue);
				return;
			case BudgetPackage.BUDGET__BUDGET_ATTRIBUTES:
				getBudgetAttributes().clear();
				getBudgetAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case BudgetPackage.BUDGET__BUDGET_ITEMS:
				getBudgetItems().clear();
				getBudgetItems().addAll((Collection<? extends String>)newValue);
				return;
			case BudgetPackage.BUDGET__BUDGET_REVISIONS:
				getBudgetRevisions().clear();
				getBudgetRevisions().addAll((Collection<? extends String>)newValue);
				return;
			case BudgetPackage.BUDGET__BUDGET_STATUSS:
				getBudgetStatuss().clear();
				getBudgetStatuss().addAll((Collection<? extends String>)newValue);
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
			case BudgetPackage.BUDGET__BUDGET_ID:
				setBudgetId(BUDGET_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET__BUDGET_TYPE_ID:
				setBudgetTypeId(BUDGET_TYPE_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case BudgetPackage.BUDGET__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId(CUSTOM_TIME_PERIOD_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET__BUDGET_ATTRIBUTES:
				getBudgetAttributes().clear();
				return;
			case BudgetPackage.BUDGET__BUDGET_ITEMS:
				getBudgetItems().clear();
				return;
			case BudgetPackage.BUDGET__BUDGET_REVISIONS:
				getBudgetRevisions().clear();
				return;
			case BudgetPackage.BUDGET__BUDGET_STATUSS:
				getBudgetStatuss().clear();
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
			case BudgetPackage.BUDGET__BUDGET_ID:
				return BUDGET_ID_EDEFAULT == null ? budgetId != null : !BUDGET_ID_EDEFAULT.equals(budgetId);
			case BudgetPackage.BUDGET__BUDGET_TYPE_ID:
				return BUDGET_TYPE_ID_EDEFAULT == null ? budgetTypeId != null : !BUDGET_TYPE_ID_EDEFAULT.equals(budgetTypeId);
			case BudgetPackage.BUDGET__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case BudgetPackage.BUDGET__CUSTOM_TIME_PERIOD_ID:
				return CUSTOM_TIME_PERIOD_ID_EDEFAULT == null ? customTimePeriodId != null : !CUSTOM_TIME_PERIOD_ID_EDEFAULT.equals(customTimePeriodId);
			case BudgetPackage.BUDGET__BUDGET_ATTRIBUTES:
				return budgetAttributes != null && !budgetAttributes.isEmpty();
			case BudgetPackage.BUDGET__BUDGET_ITEMS:
				return budgetItems != null && !budgetItems.isEmpty();
			case BudgetPackage.BUDGET__BUDGET_REVISIONS:
				return budgetRevisions != null && !budgetRevisions.isEmpty();
			case BudgetPackage.BUDGET__BUDGET_STATUSS:
				return budgetStatuss != null && !budgetStatuss.isEmpty();
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
		result.append(" (budgetId: ");
		result.append(budgetId);
		result.append(", budgetTypeId: ");
		result.append(budgetTypeId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", customTimePeriodId: ");
		result.append(customTimePeriodId);
		result.append(", budgetAttributes: ");
		result.append(budgetAttributes);
		result.append(", budgetItems: ");
		result.append(budgetItems);
		result.append(", budgetRevisions: ");
		result.append(budgetRevisions);
		result.append(", budgetStatuss: ");
		result.append(budgetStatuss);
		result.append(')');
		return result.toString();
	}

} //BudgetImpl
