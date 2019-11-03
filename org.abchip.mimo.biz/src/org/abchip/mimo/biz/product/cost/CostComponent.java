/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentId <em>Cost Component Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getCost <em>Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentTypeId <em>Cost Component Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostUomId <em>Cost Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentAttributes <em>Cost Component Attributes</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent()
 * @model
 * @generated
 */
public interface CostComponent extends BizEntityTyped<CostComponentType> {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(BigDecimal)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_Cost()
	 * @model
	 * @generated
	 */
	BigDecimal getCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Cost Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Uom Id</em>' attribute.
	 * @see #setCostUomId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_CostUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCostUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostUomId <em>Cost Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Uom Id</em>' attribute.
	 * @see #getCostUomId()
	 * @generated
	 */
	void setCostUomId(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_FixedAssetId()
	 * @model annotation="mimo-ent-domain frame='FixedAsset'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id</em>' attribute.
	 * @see #setGeoId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_GeoId()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getGeoId <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id</em>' attribute.
	 * @see #getGeoId()
	 * @generated
	 */
	void setGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' attribute.
	 * @see #setProductFeatureId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_ProductFeatureId()
	 * @model annotation="mimo-ent-domain frame='ProductFeature'"
	 * @generated
	 */
	String getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getProductFeatureId <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' attribute.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_WorkEffortId()
	 * @model annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

	/**
	 * Returns the value of the '<em><b>Cost Component Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_CostComponentAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponentAttribute'"
	 * @generated
	 */
	List<String> getCostComponentAttributes();

	/**
	 * Returns the value of the '<em><b>Cost Component Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Type Id</em>' attribute.
	 * @see #setCostComponentTypeId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_CostComponentTypeId()
	 * @model annotation="mimo-ent-domain frame='CostComponentType'"
	 * @generated
	 */
	String getCostComponentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentTypeId <em>Cost Component Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Type Id</em>' attribute.
	 * @see #getCostComponentTypeId()
	 * @generated
	 */
	void setCostComponentTypeId(String value);

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
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_CostComponentCalcId()
	 * @model annotation="mimo-ent-domain frame='CostComponentCalc'"
	 * @generated
	 */
	String getCostComponentCalcId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentCalcId <em>Cost Component Calc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Calc Id</em>' attribute.
	 * @see #getCostComponentCalcId()
	 * @generated
	 */
	void setCostComponentCalcId(String value);

	/**
	 * Returns the value of the '<em><b>Cost Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Id</em>' attribute.
	 * @see #setCostComponentId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_CostComponentId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCostComponentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentId <em>Cost Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Id</em>' attribute.
	 * @see #getCostComponentId()
	 * @generated
	 */
	void setCostComponentId(String value);

} // CostComponent
