/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.cost.CostComponentCalc;
import org.abchip.mimo.biz.product.cost.CostPackage;
import org.eclipse.emf.ecore.EClass;

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
		return (CustomMethod)eGet(CostPackage.Literals.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostCustomMethodId(CustomMethod newCostCustomMethodId) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__COST_CUSTOM_METHOD_ID, newCostCustomMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getCostGlAccountTypeId() {
		return (GlAccountType)eGet(CostPackage.Literals.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostGlAccountTypeId(GlAccountType newCostGlAccountTypeId) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE_ID, newCostGlAccountTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(CostPackage.Literals.COST_COMPONENT_CALC__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(CostPackage.Literals.COST_COMPONENT_CALC__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFixedCost() {
		return (BigDecimal)eGet(CostPackage.Literals.COST_COMPONENT_CALC__FIXED_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedCost(BigDecimal newFixedCost) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__FIXED_COST, newFixedCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getOffsettingGlAccountTypeId() {
		return (GlAccountType)eGet(CostPackage.Literals.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffsettingGlAccountTypeId(GlAccountType newOffsettingGlAccountTypeId) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE_ID, newOffsettingGlAccountTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerMilliSecond() {
		return (Long)eGet(CostPackage.Literals.COST_COMPONENT_CALC__PER_MILLI_SECOND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerMilliSecond(long newPerMilliSecond) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__PER_MILLI_SECOND, newPerMilliSecond);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVariableCost() {
		return (BigDecimal)eGet(CostPackage.Literals.COST_COMPONENT_CALC__VARIABLE_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableCost(BigDecimal newVariableCost) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__VARIABLE_COST, newVariableCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCostComponentCalcId() {
		return (String)eGet(CostPackage.Literals.COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentCalcId(String newCostComponentCalcId) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID, newCostComponentCalcId);
	}

} //CostComponentCalcImpl
