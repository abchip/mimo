/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.ProductAverageCost;
import org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Average Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl#getProductAverageCostTypeId <em>Product Average Cost Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl#getAverageCost <em>Average Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductAverageCostImpl extends BizEntityTypedImpl<ProductAverageCostType> implements ProductAverageCost {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getProductAverageCostTypeId() <em>Product Average Cost Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductAverageCostTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_AVERAGE_COST_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductAverageCostTypeId() <em>Product Average Cost Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductAverageCostTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productAverageCostTypeId = PRODUCT_AVERAGE_COST_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected String organizationPartyId = ORGANIZATION_PARTY_ID_EDEFAULT;
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
	 * The default value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String facilityId = FACILITY_ID_EDEFAULT;
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
	 * The default value of the '{@link #getAverageCost() <em>Average Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AVERAGE_COST_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAverageCost() <em>Average Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal averageCost = AVERAGE_COST_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductAverageCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.PRODUCT_AVERAGE_COST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAverageCost() {
		return averageCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageCost(BigDecimal newAverageCost) {
		BigDecimal oldAverageCost = averageCost;
		averageCost = newAverageCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PRODUCT_AVERAGE_COST__AVERAGE_COST, oldAverageCost, averageCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		String oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PRODUCT_AVERAGE_COST__FACILITY_ID, oldFacilityId, facilityId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PRODUCT_AVERAGE_COST__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(String newOrganizationPartyId) {
		String oldOrganizationPartyId = organizationPartyId;
		organizationPartyId = newOrganizationPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PRODUCT_AVERAGE_COST__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PRODUCT_AVERAGE_COST__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductAverageCostTypeId() {
		return productAverageCostTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductAverageCostTypeId(String newProductAverageCostTypeId) {
		String oldProductAverageCostTypeId = productAverageCostTypeId;
		productAverageCostTypeId = newProductAverageCostTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_AVERAGE_COST_TYPE_ID, oldProductAverageCostTypeId, productAverageCostTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_AVERAGE_COST_TYPE_ID:
				return getProductAverageCostTypeId();
			case LedgerPackage.PRODUCT_AVERAGE_COST__ORGANIZATION_PARTY_ID:
				return getOrganizationPartyId();
			case LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_ID:
				return getProductId();
			case LedgerPackage.PRODUCT_AVERAGE_COST__FACILITY_ID:
				return getFacilityId();
			case LedgerPackage.PRODUCT_AVERAGE_COST__FROM_DATE:
				return getFromDate();
			case LedgerPackage.PRODUCT_AVERAGE_COST__AVERAGE_COST:
				return getAverageCost();
			case LedgerPackage.PRODUCT_AVERAGE_COST__THRU_DATE:
				return getThruDate();
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
			case LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_AVERAGE_COST_TYPE_ID:
				setProductAverageCostTypeId((String)newValue);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((String)newValue);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__AVERAGE_COST:
				setAverageCost((BigDecimal)newValue);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__THRU_DATE:
				setThruDate((Date)newValue);
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
			case LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_AVERAGE_COST_TYPE_ID:
				setProductAverageCostTypeId(PRODUCT_AVERAGE_COST_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId(ORGANIZATION_PARTY_ID_EDEFAULT);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__AVERAGE_COST:
				setAverageCost(AVERAGE_COST_EDEFAULT);
				return;
			case LedgerPackage.PRODUCT_AVERAGE_COST__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_AVERAGE_COST_TYPE_ID:
				return PRODUCT_AVERAGE_COST_TYPE_ID_EDEFAULT == null ? productAverageCostTypeId != null : !PRODUCT_AVERAGE_COST_TYPE_ID_EDEFAULT.equals(productAverageCostTypeId);
			case LedgerPackage.PRODUCT_AVERAGE_COST__ORGANIZATION_PARTY_ID:
				return ORGANIZATION_PARTY_ID_EDEFAULT == null ? organizationPartyId != null : !ORGANIZATION_PARTY_ID_EDEFAULT.equals(organizationPartyId);
			case LedgerPackage.PRODUCT_AVERAGE_COST__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case LedgerPackage.PRODUCT_AVERAGE_COST__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case LedgerPackage.PRODUCT_AVERAGE_COST__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case LedgerPackage.PRODUCT_AVERAGE_COST__AVERAGE_COST:
				return AVERAGE_COST_EDEFAULT == null ? averageCost != null : !AVERAGE_COST_EDEFAULT.equals(averageCost);
			case LedgerPackage.PRODUCT_AVERAGE_COST__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (productAverageCostTypeId: ");
		result.append(productAverageCostTypeId);
		result.append(", organizationPartyId: ");
		result.append(organizationPartyId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", facilityId: ");
		result.append(facilityId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", averageCost: ");
		result.append(averageCost);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductAverageCostImpl
