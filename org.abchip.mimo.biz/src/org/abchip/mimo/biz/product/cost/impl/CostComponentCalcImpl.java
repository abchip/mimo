/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost.impl;

import java.math.BigDecimal;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.cost.CostComponentCalc;
import org.abchip.mimo.biz.product.cost.CostPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Component Calc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getCostCustomMethodId <em>Cost Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getCostGlAccountTypeId <em>Cost Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getFixedCost <em>Fixed Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getOffsettingGlAccountTypeId <em>Offsetting Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getPerMilliSecond <em>Per Milli Second</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getVariableCost <em>Variable Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostComponentCalcImpl extends BizEntityImpl implements CostComponentCalc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getCostComponentCalcId() <em>Cost Component Calc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentCalcId()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_COMPONENT_CALC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostComponentCalcId() <em>Cost Component Calc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentCalcId()
	 * @generated
	 * @ordered
	 */
	protected String costComponentCalcId = COST_COMPONENT_CALC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostCustomMethodId() <em>Cost Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_CUSTOM_METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostCustomMethodId() <em>Cost Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected String costCustomMethodId = COST_CUSTOM_METHOD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostGlAccountTypeId() <em>Cost Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_GL_ACCOUNT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostGlAccountTypeId() <em>Cost Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected String costGlAccountTypeId = COST_GL_ACCOUNT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String currencyUomId = CURRENCY_UOM_ID_EDEFAULT;

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
	 * The default value of the '{@link #getFixedCost() <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FIXED_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedCost() <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fixedCost = FIXED_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsettingGlAccountTypeId() <em>Offsetting Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsettingGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSETTING_GL_ACCOUNT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffsettingGlAccountTypeId() <em>Offsetting Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsettingGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected String offsettingGlAccountTypeId = OFFSETTING_GL_ACCOUNT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerMilliSecond() <em>Per Milli Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerMilliSecond()
	 * @generated
	 * @ordered
	 */
	protected static final long PER_MILLI_SECOND_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPerMilliSecond() <em>Per Milli Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerMilliSecond()
	 * @generated
	 * @ordered
	 */
	protected long perMilliSecond = PER_MILLI_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VARIABLE_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal variableCost = VARIABLE_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostComponentCalcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CostPackage.Literals.COST_COMPONENT_CALC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCostCustomMethodId() {
		return costCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostCustomMethodId(String newCostCustomMethodId) {
		String oldCostCustomMethodId = costCustomMethodId;
		costCustomMethodId = newCostCustomMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID, oldCostCustomMethodId, costCustomMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCostGlAccountTypeId() {
		return costGlAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostGlAccountTypeId(String newCostGlAccountTypeId) {
		String oldCostGlAccountTypeId = costGlAccountTypeId;
		costGlAccountTypeId = newCostGlAccountTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID, oldCostGlAccountTypeId, costGlAccountTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		String oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT_CALC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFixedCost() {
		return fixedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedCost(BigDecimal newFixedCost) {
		BigDecimal oldFixedCost = fixedCost;
		fixedCost = newFixedCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT_CALC__FIXED_COST, oldFixedCost, fixedCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOffsettingGlAccountTypeId() {
		return offsettingGlAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffsettingGlAccountTypeId(String newOffsettingGlAccountTypeId) {
		String oldOffsettingGlAccountTypeId = offsettingGlAccountTypeId;
		offsettingGlAccountTypeId = newOffsettingGlAccountTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID, oldOffsettingGlAccountTypeId, offsettingGlAccountTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerMilliSecond() {
		return perMilliSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerMilliSecond(long newPerMilliSecond) {
		long oldPerMilliSecond = perMilliSecond;
		perMilliSecond = newPerMilliSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT_CALC__PER_MILLI_SECOND, oldPerMilliSecond, perMilliSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVariableCost() {
		return variableCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableCost(BigDecimal newVariableCost) {
		BigDecimal oldVariableCost = variableCost;
		variableCost = newVariableCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT_CALC__VARIABLE_COST, oldVariableCost, variableCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> costComponents() {
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
	public String getCostComponentCalcId() {
		return costComponentCalcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentCalcId(String newCostComponentCalcId) {
		String oldCostComponentCalcId = costComponentCalcId;
		costComponentCalcId = newCostComponentCalcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID, oldCostComponentCalcId, costComponentCalcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CostPackage.COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				return getCostComponentCalcId();
			case CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID:
				return getCostCustomMethodId();
			case CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID:
				return getCostGlAccountTypeId();
			case CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case CostPackage.COST_COMPONENT_CALC__DESCRIPTION:
				return getDescription();
			case CostPackage.COST_COMPONENT_CALC__FIXED_COST:
				return getFixedCost();
			case CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID:
				return getOffsettingGlAccountTypeId();
			case CostPackage.COST_COMPONENT_CALC__PER_MILLI_SECOND:
				return getPerMilliSecond();
			case CostPackage.COST_COMPONENT_CALC__VARIABLE_COST:
				return getVariableCost();
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
			case CostPackage.COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID:
				setCostCustomMethodId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID:
				setCostGlAccountTypeId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__FIXED_COST:
				setFixedCost((BigDecimal)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID:
				setOffsettingGlAccountTypeId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__PER_MILLI_SECOND:
				setPerMilliSecond((Long)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__VARIABLE_COST:
				setVariableCost((BigDecimal)newValue);
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
			case CostPackage.COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId(COST_COMPONENT_CALC_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID:
				setCostCustomMethodId(COST_CUSTOM_METHOD_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID:
				setCostGlAccountTypeId(COST_GL_ACCOUNT_TYPE_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__FIXED_COST:
				setFixedCost(FIXED_COST_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID:
				setOffsettingGlAccountTypeId(OFFSETTING_GL_ACCOUNT_TYPE_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__PER_MILLI_SECOND:
				setPerMilliSecond(PER_MILLI_SECOND_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__VARIABLE_COST:
				setVariableCost(VARIABLE_COST_EDEFAULT);
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
			case CostPackage.COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID:
				return COST_COMPONENT_CALC_ID_EDEFAULT == null ? costComponentCalcId != null : !COST_COMPONENT_CALC_ID_EDEFAULT.equals(costComponentCalcId);
			case CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID:
				return COST_CUSTOM_METHOD_ID_EDEFAULT == null ? costCustomMethodId != null : !COST_CUSTOM_METHOD_ID_EDEFAULT.equals(costCustomMethodId);
			case CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID:
				return COST_GL_ACCOUNT_TYPE_ID_EDEFAULT == null ? costGlAccountTypeId != null : !COST_GL_ACCOUNT_TYPE_ID_EDEFAULT.equals(costGlAccountTypeId);
			case CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case CostPackage.COST_COMPONENT_CALC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CostPackage.COST_COMPONENT_CALC__FIXED_COST:
				return FIXED_COST_EDEFAULT == null ? fixedCost != null : !FIXED_COST_EDEFAULT.equals(fixedCost);
			case CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID:
				return OFFSETTING_GL_ACCOUNT_TYPE_ID_EDEFAULT == null ? offsettingGlAccountTypeId != null : !OFFSETTING_GL_ACCOUNT_TYPE_ID_EDEFAULT.equals(offsettingGlAccountTypeId);
			case CostPackage.COST_COMPONENT_CALC__PER_MILLI_SECOND:
				return perMilliSecond != PER_MILLI_SECOND_EDEFAULT;
			case CostPackage.COST_COMPONENT_CALC__VARIABLE_COST:
				return VARIABLE_COST_EDEFAULT == null ? variableCost != null : !VARIABLE_COST_EDEFAULT.equals(variableCost);
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
		result.append(" (costComponentCalcId: ");
		result.append(costComponentCalcId);
		result.append(", costCustomMethodId: ");
		result.append(costCustomMethodId);
		result.append(", costGlAccountTypeId: ");
		result.append(costGlAccountTypeId);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", description: ");
		result.append(description);
		result.append(", fixedCost: ");
		result.append(fixedCost);
		result.append(", offsettingGlAccountTypeId: ");
		result.append(offsettingGlAccountTypeId);
		result.append(", perMilliSecond: ");
		result.append(perMilliSecond);
		result.append(", variableCost: ");
		result.append(variableCost);
		result.append(')');
		return result.toString();
	}

} //CostComponentCalcImpl
