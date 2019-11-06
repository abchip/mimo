/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget.impl;

import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetType;
import org.abchip.mimo.biz.accounting.budget.BudgetTypeAttr;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Type Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeAttrImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeAttrImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetTypeAttrImpl#getBudgetTypeId <em>Budget Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetTypeAttrImpl extends BizEntityImpl implements BudgetTypeAttr {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The cached value of the '{@link #getBudgetTypeId() <em>Budget Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetTypeId()
	 * @generated
	 * @ordered
	 */
	protected BudgetType budgetTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetTypeAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_TYPE_ATTR;
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
		attrName = newAttrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetType getBudgetTypeId() {
		if (budgetTypeId != null && ((EObject)budgetTypeId).eIsProxy()) {
			InternalEObject oldBudgetTypeId = (InternalEObject)budgetTypeId;
			budgetTypeId = (BudgetType)eResolveProxy(oldBudgetTypeId);
			if (budgetTypeId != oldBudgetTypeId) {
			}
		}
		return budgetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetType basicGetBudgetTypeId() {
		return budgetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetTypeId(BudgetType newBudgetTypeId) {
		budgetTypeId = newBudgetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_TYPE_ATTR__ATTR_NAME:
				return getAttrName();
			case BudgetPackage.BUDGET_TYPE_ATTR__DESCRIPTION:
				return getDescription();
			case BudgetPackage.BUDGET_TYPE_ATTR__BUDGET_TYPE_ID:
				if (resolve) return getBudgetTypeId();
				return basicGetBudgetTypeId();
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
			case BudgetPackage.BUDGET_TYPE_ATTR__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case BudgetPackage.BUDGET_TYPE_ATTR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BudgetPackage.BUDGET_TYPE_ATTR__BUDGET_TYPE_ID:
				setBudgetTypeId((BudgetType)newValue);
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
			case BudgetPackage.BUDGET_TYPE_ATTR__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_TYPE_ATTR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_TYPE_ATTR__BUDGET_TYPE_ID:
				setBudgetTypeId((BudgetType)null);
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
			case BudgetPackage.BUDGET_TYPE_ATTR__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case BudgetPackage.BUDGET_TYPE_ATTR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BudgetPackage.BUDGET_TYPE_ATTR__BUDGET_TYPE_ID:
				return budgetTypeId != null;
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
		result.append(" (attrName: ");
		result.append(attrName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //BudgetTypeAttrImpl
