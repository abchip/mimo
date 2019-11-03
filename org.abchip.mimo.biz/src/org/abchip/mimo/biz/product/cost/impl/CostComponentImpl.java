/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.cost.CostComponent;
import org.abchip.mimo.biz.product.cost.CostComponentType;
import org.abchip.mimo.biz.product.cost.CostPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getCostComponentId <em>Cost Component Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getCostComponentTypeId <em>Cost Component Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getCostUomId <em>Cost Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getCostComponentAttributes <em>Cost Component Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostComponentImpl extends BizEntityTypedImpl<CostComponentType> implements CostComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getCostComponentId() <em>Cost Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentId()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostComponentId() <em>Cost Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentId()
	 * @generated
	 * @ordered
	 */
	protected String costComponentId = COST_COMPONENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cost = COST_EDEFAULT;

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
	 * The default value of the '{@link #getCostComponentTypeId() <em>Cost Component Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_COMPONENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostComponentTypeId() <em>Cost Component Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String costComponentTypeId = COST_COMPONENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostUomId() <em>Cost Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostUomId() <em>Cost Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostUomId()
	 * @generated
	 * @ordered
	 */
	protected String costUomId = COST_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetId = FIXED_ASSET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeoId() <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeoId() <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected String geoId = GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureId = PRODUCT_FEATURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCostComponentAttributes() <em>Cost Component Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> costComponentAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CostPackage.Literals.COST_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(BigDecimal newCost) {
		BigDecimal oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCostUomId() {
		return costUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostUomId(String newCostUomId) {
		String oldCostUomId = costUomId;
		costUomId = newCostUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__COST_UOM_ID, oldCostUomId, costUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		String oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoId() {
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(String newGeoId) {
		String oldGeoId = geoId;
		geoId = newGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__GEO_ID, oldGeoId, geoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		String oldProductFeatureId = productFeatureId;
		productFeatureId = newProductFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		String oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCostComponentAttributes() {
		if (costComponentAttributes == null) {
			costComponentAttributes = new EDataTypeUniqueEList<String>(String.class, this, CostPackage.COST_COMPONENT__COST_COMPONENT_ATTRIBUTES);
		}
		return costComponentAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCostComponentTypeId() {
		return costComponentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentTypeId(String newCostComponentTypeId) {
		String oldCostComponentTypeId = costComponentTypeId;
		costComponentTypeId = newCostComponentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID, oldCostComponentTypeId, costComponentTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID, oldCostComponentCalcId, costComponentCalcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCostComponentId() {
		return costComponentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentId(String newCostComponentId) {
		String oldCostComponentId = costComponentId;
		costComponentId = newCostComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CostPackage.COST_COMPONENT__COST_COMPONENT_ID, oldCostComponentId, costComponentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CostPackage.COST_COMPONENT__COST_COMPONENT_ID:
				return getCostComponentId();
			case CostPackage.COST_COMPONENT__COST:
				return getCost();
			case CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID:
				return getCostComponentCalcId();
			case CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID:
				return getCostComponentTypeId();
			case CostPackage.COST_COMPONENT__COST_UOM_ID:
				return getCostUomId();
			case CostPackage.COST_COMPONENT__FIXED_ASSET_ID:
				return getFixedAssetId();
			case CostPackage.COST_COMPONENT__FROM_DATE:
				return getFromDate();
			case CostPackage.COST_COMPONENT__GEO_ID:
				return getGeoId();
			case CostPackage.COST_COMPONENT__PARTY_ID:
				return getPartyId();
			case CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
			case CostPackage.COST_COMPONENT__PRODUCT_ID:
				return getProductId();
			case CostPackage.COST_COMPONENT__THRU_DATE:
				return getThruDate();
			case CostPackage.COST_COMPONENT__WORK_EFFORT_ID:
				return getWorkEffortId();
			case CostPackage.COST_COMPONENT__COST_COMPONENT_ATTRIBUTES:
				return getCostComponentAttributes();
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
			case CostPackage.COST_COMPONENT__COST_COMPONENT_ID:
				setCostComponentId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__COST:
				setCost((BigDecimal)newValue);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__COST_UOM_ID:
				setCostUomId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CostPackage.COST_COMPONENT__GEO_ID:
				setGeoId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CostPackage.COST_COMPONENT__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_ATTRIBUTES:
				getCostComponentAttributes().clear();
				getCostComponentAttributes().addAll((Collection<? extends String>)newValue);
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
			case CostPackage.COST_COMPONENT__COST_COMPONENT_ID:
				setCostComponentId(COST_COMPONENT_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__COST:
				setCost(COST_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId(COST_COMPONENT_CALC_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId(COST_COMPONENT_TYPE_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__COST_UOM_ID:
				setCostUomId(COST_UOM_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__GEO_ID:
				setGeoId(GEO_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_ATTRIBUTES:
				getCostComponentAttributes().clear();
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
			case CostPackage.COST_COMPONENT__COST_COMPONENT_ID:
				return COST_COMPONENT_ID_EDEFAULT == null ? costComponentId != null : !COST_COMPONENT_ID_EDEFAULT.equals(costComponentId);
			case CostPackage.COST_COMPONENT__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID:
				return COST_COMPONENT_CALC_ID_EDEFAULT == null ? costComponentCalcId != null : !COST_COMPONENT_CALC_ID_EDEFAULT.equals(costComponentCalcId);
			case CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID:
				return COST_COMPONENT_TYPE_ID_EDEFAULT == null ? costComponentTypeId != null : !COST_COMPONENT_TYPE_ID_EDEFAULT.equals(costComponentTypeId);
			case CostPackage.COST_COMPONENT__COST_UOM_ID:
				return COST_UOM_ID_EDEFAULT == null ? costUomId != null : !COST_UOM_ID_EDEFAULT.equals(costUomId);
			case CostPackage.COST_COMPONENT__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case CostPackage.COST_COMPONENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CostPackage.COST_COMPONENT__GEO_ID:
				return GEO_ID_EDEFAULT == null ? geoId != null : !GEO_ID_EDEFAULT.equals(geoId);
			case CostPackage.COST_COMPONENT__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
			case CostPackage.COST_COMPONENT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case CostPackage.COST_COMPONENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CostPackage.COST_COMPONENT__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case CostPackage.COST_COMPONENT__COST_COMPONENT_ATTRIBUTES:
				return costComponentAttributes != null && !costComponentAttributes.isEmpty();
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
		result.append(" (costComponentId: ");
		result.append(costComponentId);
		result.append(", cost: ");
		result.append(cost);
		result.append(", costComponentCalcId: ");
		result.append(costComponentCalcId);
		result.append(", costComponentTypeId: ");
		result.append(costComponentTypeId);
		result.append(", costUomId: ");
		result.append(costUomId);
		result.append(", fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", geoId: ");
		result.append(geoId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", productFeatureId: ");
		result.append(productFeatureId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", workEffortId: ");
		result.append(workEffortId);
		result.append(", costComponentAttributes: ");
		result.append(costComponentAttributes);
		result.append(')');
		return result.toString();
	}

} //CostComponentImpl
