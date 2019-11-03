/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost;

import java.math.BigDecimal;
import java.util.List;

import org.abchip.mimo.biz.BizEntity;

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
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface CostComponentCalc extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cost Custom Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Custom Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Custom Method Id</em>' attribute.
	 * @see #setCostCustomMethodId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_CostCustomMethodId()
	 * @model annotation="mimo-ent-domain frame='CustomMethod'"
	 * @generated
	 */
	String getCostCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostCustomMethodId <em>Cost Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Custom Method Id</em>' attribute.
	 * @see #getCostCustomMethodId()
	 * @generated
	 */
	void setCostCustomMethodId(String value);

	/**
	 * Returns the value of the '<em><b>Cost Gl Account Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Gl Account Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Gl Account Type Id</em>' attribute.
	 * @see #setCostGlAccountTypeId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_CostGlAccountTypeId()
	 * @model annotation="mimo-ent-domain frame='GlAccountType'"
	 * @generated
	 */
	String getCostGlAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCostGlAccountTypeId <em>Cost Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Gl Account Type Id</em>' attribute.
	 * @see #getCostGlAccountTypeId()
	 * @generated
	 */
	void setCostGlAccountTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Offsetting Gl Account Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offsetting Gl Account Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offsetting Gl Account Type Id</em>' attribute.
	 * @see #setOffsettingGlAccountTypeId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentCalc_OffsettingGlAccountTypeId()
	 * @model annotation="mimo-ent-domain frame='GlAccountType'"
	 * @generated
	 */
	String getOffsettingGlAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentCalc#getOffsettingGlAccountTypeId <em>Offsetting Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offsetting Gl Account Type Id</em>' attribute.
	 * @see #getOffsettingGlAccountTypeId()
	 * @generated
	 */
	void setOffsettingGlAccountTypeId(String value);

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
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponent' route='costComponentCalcId'"
	 * @generated
	 */
	List<String> costComponents();

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
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
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
