/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

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
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentAttributes <em>Cost Component Attributes</em>}</li>
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
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
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
	 * @model annotation="mimo-ent-slot help='Higher precision in case it is a calculated number'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
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
	 * Returns the value of the '<em><b>Cost Component Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.cost.CostComponentAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_CostComponentAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<CostComponentAttribute> getCostComponentAttributes();

	/**
	 * Returns the value of the '<em><b>Cost Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Uom Id</em>' reference.
	 * @see #setCostUomId(Uom)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_CostUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCostUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostUomId <em>Cost Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Uom Id</em>' reference.
	 * @see #getCostUomId()
	 * @generated
	 */
	void setCostUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #setFixedAssetId(FixedAsset)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_FixedAssetId()
	 * @model keys="fixedAssetId"
	 * @generated
	 */
	FixedAsset getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getFixedAssetId <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(FixedAsset value);

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
	 * Returns the value of the '<em><b>Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id</em>' reference.
	 * @see #setGeoId(Geo)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_GeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getGeoId <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id</em>' reference.
	 * @see #getGeoId()
	 * @generated
	 */
	void setGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' reference.
	 * @see #setProductFeatureId(ProductFeature)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_ProductFeatureId()
	 * @model keys="productFeatureId"
	 * @generated
	 */
	ProductFeature getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getProductFeatureId <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' reference.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(ProductFeature value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_ProductId()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

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
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' reference.
	 * @see #setWorkEffortId(WorkEffort)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_WorkEffortId()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getWorkEffortId <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' reference.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Cost Component Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Type Id</em>' reference.
	 * @see #setCostComponentTypeId(CostComponentType)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_CostComponentTypeId()
	 * @model keys="costComponentTypeId"
	 * @generated
	 */
	CostComponentType getCostComponentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentTypeId <em>Cost Component Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Type Id</em>' reference.
	 * @see #getCostComponentTypeId()
	 * @generated
	 */
	void setCostComponentTypeId(CostComponentType value);

	/**
	 * Returns the value of the '<em><b>Cost Component Calc Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Calc Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Calc Id</em>' reference.
	 * @see #setCostComponentCalcId(CostComponentCalc)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponent_CostComponentCalcId()
	 * @model keys="costComponentCalcId"
	 * @generated
	 */
	CostComponentCalc getCostComponentCalcId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponent#getCostComponentCalcId <em>Cost Component Calc Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Calc Id</em>' reference.
	 * @see #getCostComponentCalcId()
	 * @generated
	 */
	void setCostComponentCalcId(CostComponentCalc value);

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
