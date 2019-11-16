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

import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.cost.CostComponentCalc;
import org.abchip.mimo.biz.product.cost.CostPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getFixedCost <em>Fixed Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getPerMilliSecond <em>Per Milli Second</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getVariableCost <em>Variable Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getCostGlAccountTypeId <em>Cost Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getOffsettingGlAccountTypeId <em>Offsetting Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentCalcImpl#getCostCustomMethodId <em>Cost Custom Method Id</em>}</li>
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
	 * The cached value of the '{@link #getCostGlAccountTypeId() <em>Cost Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountType costGlAccountTypeId;

	/**
	 * The cached value of the '{@link #getOffsettingGlAccountTypeId() <em>Offsetting Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsettingGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountType offsettingGlAccountTypeId;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

	/**
	 * The cached value of the '{@link #getCostCustomMethodId() <em>Cost Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod costCustomMethodId;

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
	public CustomMethod getCostCustomMethodId() {
		if (costCustomMethodId != null && ((EObject)costCustomMethodId).eIsProxy()) {
			InternalEObject oldCostCustomMethodId = (InternalEObject)costCustomMethodId;
			costCustomMethodId = (CustomMethod)eResolveProxy(oldCostCustomMethodId);
			if (costCustomMethodId != oldCostCustomMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID, oldCostCustomMethodId, costCustomMethodId));
			}
		}
		return costCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetCostCustomMethodId() {
		return costCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostCustomMethodId(CustomMethod newCostCustomMethodId) {
		CustomMethod oldCostCustomMethodId = costCustomMethodId;
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
	public GlAccountType getCostGlAccountTypeId() {
		if (costGlAccountTypeId != null && ((EObject)costGlAccountTypeId).eIsProxy()) {
			InternalEObject oldCostGlAccountTypeId = (InternalEObject)costGlAccountTypeId;
			costGlAccountTypeId = (GlAccountType)eResolveProxy(oldCostGlAccountTypeId);
			if (costGlAccountTypeId != oldCostGlAccountTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID, oldCostGlAccountTypeId, costGlAccountTypeId));
			}
		}
		return costGlAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountType basicGetCostGlAccountTypeId() {
		return costGlAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostGlAccountTypeId(GlAccountType newCostGlAccountTypeId) {
		GlAccountType oldCostGlAccountTypeId = costGlAccountTypeId;
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
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		Uom oldCurrencyUomId = currencyUomId;
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
	public GlAccountType getOffsettingGlAccountTypeId() {
		if (offsettingGlAccountTypeId != null && ((EObject)offsettingGlAccountTypeId).eIsProxy()) {
			InternalEObject oldOffsettingGlAccountTypeId = (InternalEObject)offsettingGlAccountTypeId;
			offsettingGlAccountTypeId = (GlAccountType)eResolveProxy(oldOffsettingGlAccountTypeId);
			if (offsettingGlAccountTypeId != oldOffsettingGlAccountTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID, oldOffsettingGlAccountTypeId, offsettingGlAccountTypeId));
			}
		}
		return offsettingGlAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountType basicGetOffsettingGlAccountTypeId() {
		return offsettingGlAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffsettingGlAccountTypeId(GlAccountType newOffsettingGlAccountTypeId) {
		GlAccountType oldOffsettingGlAccountTypeId = offsettingGlAccountTypeId;
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
			case CostPackage.COST_COMPONENT_CALC__DESCRIPTION:
				return getDescription();
			case CostPackage.COST_COMPONENT_CALC__FIXED_COST:
				return getFixedCost();
			case CostPackage.COST_COMPONENT_CALC__PER_MILLI_SECOND:
				return getPerMilliSecond();
			case CostPackage.COST_COMPONENT_CALC__VARIABLE_COST:
				return getVariableCost();
			case CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID:
				if (resolve) return getCostGlAccountTypeId();
				return basicGetCostGlAccountTypeId();
			case CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID:
				if (resolve) return getOffsettingGlAccountTypeId();
				return basicGetOffsettingGlAccountTypeId();
			case CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID:
				if (resolve) return getCostCustomMethodId();
				return basicGetCostCustomMethodId();
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
			case CostPackage.COST_COMPONENT_CALC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__FIXED_COST:
				setFixedCost((BigDecimal)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__PER_MILLI_SECOND:
				setPerMilliSecond((Long)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__VARIABLE_COST:
				setVariableCost((BigDecimal)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID:
				setCostGlAccountTypeId((GlAccountType)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID:
				setOffsettingGlAccountTypeId((GlAccountType)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID:
				setCostCustomMethodId((CustomMethod)newValue);
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
			case CostPackage.COST_COMPONENT_CALC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__FIXED_COST:
				setFixedCost(FIXED_COST_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__PER_MILLI_SECOND:
				setPerMilliSecond(PER_MILLI_SECOND_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__VARIABLE_COST:
				setVariableCost(VARIABLE_COST_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID:
				setCostGlAccountTypeId((GlAccountType)null);
				return;
			case CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID:
				setOffsettingGlAccountTypeId((GlAccountType)null);
				return;
			case CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID:
				setCostCustomMethodId((CustomMethod)null);
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
			case CostPackage.COST_COMPONENT_CALC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CostPackage.COST_COMPONENT_CALC__FIXED_COST:
				return FIXED_COST_EDEFAULT == null ? fixedCost != null : !FIXED_COST_EDEFAULT.equals(fixedCost);
			case CostPackage.COST_COMPONENT_CALC__PER_MILLI_SECOND:
				return perMilliSecond != PER_MILLI_SECOND_EDEFAULT;
			case CostPackage.COST_COMPONENT_CALC__VARIABLE_COST:
				return VARIABLE_COST_EDEFAULT == null ? variableCost != null : !VARIABLE_COST_EDEFAULT.equals(variableCost);
			case CostPackage.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID:
				return costGlAccountTypeId != null;
			case CostPackage.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID:
				return offsettingGlAccountTypeId != null;
			case CostPackage.COST_COMPONENT_CALC__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case CostPackage.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID:
				return costCustomMethodId != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(", fixedCost: ");
		result.append(fixedCost);
		result.append(", perMilliSecond: ");
		result.append(perMilliSecond);
		result.append(", variableCost: ");
		result.append(variableCost);
		result.append(')');
		return result.toString();
	}

} //CostComponentCalcImpl
