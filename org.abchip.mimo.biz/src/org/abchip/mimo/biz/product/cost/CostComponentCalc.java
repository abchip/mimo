/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost;

import java.math.BigDecimal;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.uom.Uom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Component Calc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostCustomMethodId <em>Cost Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostGlAccountTypeId <em>Cost Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getFixedCost <em>Fixed Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getOffsettingGlAccountTypeId <em>Offsetting Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getPerMilliSecond <em>Per Milli Second</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getVariableCost <em>Variable Cost</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc()
 * @model annotation="mimo-ent-frame title='Cost Component Calculation' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface CostComponentCalc extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cost Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Custom Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Custom Method Id</em>' reference.
	 * @see #setCostCustomMethodId(CustomMethod)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_CostCustomMethodId()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getCostCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostCustomMethodId <em>Cost Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Custom Method Id</em>' reference.
	 * @see #getCostCustomMethodId()
	 * @generated
	 */
	void setCostCustomMethodId(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Cost Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Gl Account Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Gl Account Type Id</em>' reference.
	 * @see #setCostGlAccountTypeId(GlAccountType)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_CostGlAccountTypeId()
	 * @model keys="glAccountTypeId"
	 * @generated
	 */
	GlAccountType getCostGlAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostGlAccountTypeId <em>Cost Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Gl Account Type Id</em>' reference.
	 * @see #getCostGlAccountTypeId()
	 * @generated
	 */
	void setCostGlAccountTypeId(GlAccountType value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' reference.
	 * @see #setCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_CurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Cost</em>' attribute.
	 * @see #setFixedCost(BigDecimal)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_FixedCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getFixedCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getFixedCost <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Cost</em>' attribute.
	 * @see #getFixedCost()
	 * @generated
	 */
	void setFixedCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Offsetting Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offsetting Gl Account Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offsetting Gl Account Type Id</em>' reference.
	 * @see #setOffsettingGlAccountTypeId(GlAccountType)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_OffsettingGlAccountTypeId()
	 * @model keys="glAccountTypeId"
	 * @generated
	 */
	GlAccountType getOffsettingGlAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getOffsettingGlAccountTypeId <em>Offsetting Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offsetting Gl Account Type Id</em>' reference.
	 * @see #getOffsettingGlAccountTypeId()
	 * @generated
	 */
	void setOffsettingGlAccountTypeId(GlAccountType value);

	/**
	 * Returns the value of the '<em><b>Per Milli Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Per Milli Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Milli Second</em>' attribute.
	 * @see #setPerMilliSecond(long)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_PerMilliSecond()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPerMilliSecond();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getPerMilliSecond <em>Per Milli Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Milli Second</em>' attribute.
	 * @see #getPerMilliSecond()
	 * @generated
	 */
	void setPerMilliSecond(long value);

	/**
	 * Returns the value of the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Cost</em>' attribute.
	 * @see #setVariableCost(BigDecimal)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_VariableCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getVariableCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getVariableCost <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Cost</em>' attribute.
	 * @see #getVariableCost()
	 * @generated
	 */
	void setVariableCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Cost Component Calc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Calc Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Calc Id</em>' attribute.
	 * @see #setCostComponentCalcId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_CostComponentCalcId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCostComponentCalcId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostComponentCalcId <em>Cost Component Calc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Calc Id</em>' attribute.
	 * @see #getCostComponentCalcId()
	 * @generated
	 */
	void setCostComponentCalcId(String value);

} // CostComponentCalc
