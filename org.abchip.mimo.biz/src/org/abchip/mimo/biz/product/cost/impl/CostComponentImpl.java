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

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.cost.CostComponent;
import org.abchip.mimo.biz.product.cost.CostComponentCalc;
import org.abchip.mimo.biz.product.cost.CostComponentType;
import org.abchip.mimo.biz.product.cost.CostPackage;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getCostComponentTypeId <em>Cost Component Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.impl.CostComponentImpl#getCostUomId <em>Cost Uom Id</em>}</li>
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
	 * The cached value of the '{@link #getCostComponentTypeId() <em>Cost Component Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentTypeId()
	 * @generated
	 * @ordered
	 */
	protected CostComponentType costComponentTypeId;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature productFeatureId;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getGeoId() <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo geoId;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;

	/**
	 * The cached value of the '{@link #getCostComponentCalcId() <em>Cost Component Calc Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostComponentCalcId()
	 * @generated
	 * @ordered
	 */
	protected CostComponentCalc costComponentCalcId;

	/**
	 * The cached value of the '{@link #getCostUomId() <em>Cost Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom costUomId;

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
	public Uom getCostUomId() {
		if (costUomId != null && ((EObject)costUomId).eIsProxy()) {
			InternalEObject oldCostUomId = (InternalEObject)costUomId;
			costUomId = (Uom)eResolveProxy(oldCostUomId);
			if (costUomId != oldCostUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT__COST_UOM_ID, oldCostUomId, costUomId));
			}
		}
		return costUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCostUomId() {
		return costUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostUomId(Uom newCostUomId) {
		Uom oldCostUomId = costUomId;
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
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		FixedAsset oldFixedAssetId = fixedAssetId;
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
	public Geo getGeoId() {
		if (geoId != null && ((EObject)geoId).eIsProxy()) {
			InternalEObject oldGeoId = (InternalEObject)geoId;
			geoId = (Geo)eResolveProxy(oldGeoId);
			if (geoId != oldGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT__GEO_ID, oldGeoId, geoId));
			}
		}
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoId() {
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(Geo newGeoId) {
		Geo oldGeoId = geoId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
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
	public ProductFeature getProductFeatureId() {
		if (productFeatureId != null && ((EObject)productFeatureId).eIsProxy()) {
			InternalEObject oldProductFeatureId = (InternalEObject)productFeatureId;
			productFeatureId = (ProductFeature)eResolveProxy(oldProductFeatureId);
			if (productFeatureId != oldProductFeatureId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
			}
		}
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature basicGetProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(ProductFeature newProductFeatureId) {
		ProductFeature oldProductFeatureId = productFeatureId;
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
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
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
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		WorkEffort oldWorkEffortId = workEffortId;
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
	public CostComponentType getCostComponentTypeId() {
		if (costComponentTypeId != null && ((EObject)costComponentTypeId).eIsProxy()) {
			InternalEObject oldCostComponentTypeId = (InternalEObject)costComponentTypeId;
			costComponentTypeId = (CostComponentType)eResolveProxy(oldCostComponentTypeId);
			if (costComponentTypeId != oldCostComponentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID, oldCostComponentTypeId, costComponentTypeId));
			}
		}
		return costComponentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostComponentType basicGetCostComponentTypeId() {
		return costComponentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentTypeId(CostComponentType newCostComponentTypeId) {
		CostComponentType oldCostComponentTypeId = costComponentTypeId;
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
	public CostComponentCalc getCostComponentCalcId() {
		if (costComponentCalcId != null && ((EObject)costComponentCalcId).eIsProxy()) {
			InternalEObject oldCostComponentCalcId = (InternalEObject)costComponentCalcId;
			costComponentCalcId = (CostComponentCalc)eResolveProxy(oldCostComponentCalcId);
			if (costComponentCalcId != oldCostComponentCalcId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID, oldCostComponentCalcId, costComponentCalcId));
			}
		}
		return costComponentCalcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostComponentCalc basicGetCostComponentCalcId() {
		return costComponentCalcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentCalcId(CostComponentCalc newCostComponentCalcId) {
		CostComponentCalc oldCostComponentCalcId = costComponentCalcId;
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
			case CostPackage.COST_COMPONENT__FROM_DATE:
				return getFromDate();
			case CostPackage.COST_COMPONENT__THRU_DATE:
				return getThruDate();
			case CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID:
				if (resolve) return getCostComponentTypeId();
				return basicGetCostComponentTypeId();
			case CostPackage.COST_COMPONENT__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID:
				if (resolve) return getProductFeatureId();
				return basicGetProductFeatureId();
			case CostPackage.COST_COMPONENT__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case CostPackage.COST_COMPONENT__GEO_ID:
				if (resolve) return getGeoId();
				return basicGetGeoId();
			case CostPackage.COST_COMPONENT__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case CostPackage.COST_COMPONENT__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID:
				if (resolve) return getCostComponentCalcId();
				return basicGetCostComponentCalcId();
			case CostPackage.COST_COMPONENT__COST_UOM_ID:
				if (resolve) return getCostUomId();
				return basicGetCostUomId();
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
			case CostPackage.COST_COMPONENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CostPackage.COST_COMPONENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId((CostComponentType)newValue);
				return;
			case CostPackage.COST_COMPONENT__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)newValue);
				return;
			case CostPackage.COST_COMPONENT__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case CostPackage.COST_COMPONENT__GEO_ID:
				setGeoId((Geo)newValue);
				return;
			case CostPackage.COST_COMPONENT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case CostPackage.COST_COMPONENT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId((CostComponentCalc)newValue);
				return;
			case CostPackage.COST_COMPONENT__COST_UOM_ID:
				setCostUomId((Uom)newValue);
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
			case CostPackage.COST_COMPONENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID:
				setCostComponentTypeId((CostComponentType)null);
				return;
			case CostPackage.COST_COMPONENT__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)null);
				return;
			case CostPackage.COST_COMPONENT__PARTY_ID:
				setPartyId((Party)null);
				return;
			case CostPackage.COST_COMPONENT__GEO_ID:
				setGeoId((Geo)null);
				return;
			case CostPackage.COST_COMPONENT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case CostPackage.COST_COMPONENT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID:
				setCostComponentCalcId((CostComponentCalc)null);
				return;
			case CostPackage.COST_COMPONENT__COST_UOM_ID:
				setCostUomId((Uom)null);
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
			case CostPackage.COST_COMPONENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CostPackage.COST_COMPONENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CostPackage.COST_COMPONENT__COST_COMPONENT_TYPE_ID:
				return costComponentTypeId != null;
			case CostPackage.COST_COMPONENT__PRODUCT_ID:
				return productId != null;
			case CostPackage.COST_COMPONENT__PRODUCT_FEATURE_ID:
				return productFeatureId != null;
			case CostPackage.COST_COMPONENT__PARTY_ID:
				return partyId != null;
			case CostPackage.COST_COMPONENT__GEO_ID:
				return geoId != null;
			case CostPackage.COST_COMPONENT__WORK_EFFORT_ID:
				return workEffortId != null;
			case CostPackage.COST_COMPONENT__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case CostPackage.COST_COMPONENT__COST_COMPONENT_CALC_ID:
				return costComponentCalcId != null;
			case CostPackage.COST_COMPONENT__COST_UOM_ID:
				return costUomId != null;
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
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", costComponentAttributes: ");
		result.append(costComponentAttributes);
		result.append(')');
		return result.toString();
	}

} //CostComponentImpl
