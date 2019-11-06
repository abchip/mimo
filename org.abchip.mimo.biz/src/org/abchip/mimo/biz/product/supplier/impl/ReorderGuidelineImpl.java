/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.supplier.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.supplier.ReorderGuideline;
import org.abchip.mimo.biz.product.supplier.SupplierPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reorder Guideline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getReorderGuidelineId <em>Reorder Guideline Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getReorderLevel <em>Reorder Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getReorderQuantity <em>Reorder Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl#getGeoId <em>Geo Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReorderGuidelineImpl extends BizEntityImpl implements ReorderGuideline {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReorderGuidelineId() <em>Reorder Guideline Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReorderGuidelineId()
	 * @generated
	 * @ordered
	 */
	protected static final String REORDER_GUIDELINE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReorderGuidelineId() <em>Reorder Guideline Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReorderGuidelineId()
	 * @generated
	 * @ordered
	 */
	protected String reorderGuidelineId = REORDER_GUIDELINE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getReorderLevel() <em>Reorder Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReorderLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REORDER_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReorderLevel() <em>Reorder Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReorderLevel()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reorderLevel = REORDER_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReorderQuantity() <em>Reorder Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReorderQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REORDER_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReorderQuantity() <em>Reorder Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReorderQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reorderQuantity = REORDER_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

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
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility facilityId;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReorderGuidelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplierPackage.Literals.REORDER_GUIDELINE;
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
		fromDate = newFromDate;
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
		geoId = newGeoId;
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
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReorderGuidelineId() {
		return reorderGuidelineId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReorderGuidelineId(String newReorderGuidelineId) {
		reorderGuidelineId = newReorderGuidelineId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReorderLevel() {
		return reorderLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReorderLevel(BigDecimal newReorderLevel) {
		reorderLevel = newReorderLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReorderQuantity() {
		return reorderQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReorderQuantity(BigDecimal newReorderQuantity) {
		reorderQuantity = newReorderQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		roleTypeId = newRoleTypeId;
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
		thruDate = newThruDate;
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
		productId = newProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		if (facilityId != null && ((EObject)facilityId).eIsProxy()) {
			InternalEObject oldFacilityId = (InternalEObject)facilityId;
			facilityId = (Facility)eResolveProxy(oldFacilityId);
			if (facilityId != oldFacilityId) {
			}
		}
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		facilityId = newFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplierPackage.REORDER_GUIDELINE__REORDER_GUIDELINE_ID:
				return getReorderGuidelineId();
			case SupplierPackage.REORDER_GUIDELINE__FROM_DATE:
				return getFromDate();
			case SupplierPackage.REORDER_GUIDELINE__REORDER_LEVEL:
				return getReorderLevel();
			case SupplierPackage.REORDER_GUIDELINE__REORDER_QUANTITY:
				return getReorderQuantity();
			case SupplierPackage.REORDER_GUIDELINE__ROLE_TYPE_ID:
				return getRoleTypeId();
			case SupplierPackage.REORDER_GUIDELINE__THRU_DATE:
				return getThruDate();
			case SupplierPackage.REORDER_GUIDELINE__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case SupplierPackage.REORDER_GUIDELINE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case SupplierPackage.REORDER_GUIDELINE__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
			case SupplierPackage.REORDER_GUIDELINE__GEO_ID:
				if (resolve) return getGeoId();
				return basicGetGeoId();
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
			case SupplierPackage.REORDER_GUIDELINE__REORDER_GUIDELINE_ID:
				setReorderGuidelineId((String)newValue);
				return;
			case SupplierPackage.REORDER_GUIDELINE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case SupplierPackage.REORDER_GUIDELINE__REORDER_LEVEL:
				setReorderLevel((BigDecimal)newValue);
				return;
			case SupplierPackage.REORDER_GUIDELINE__REORDER_QUANTITY:
				setReorderQuantity((BigDecimal)newValue);
				return;
			case SupplierPackage.REORDER_GUIDELINE__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case SupplierPackage.REORDER_GUIDELINE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case SupplierPackage.REORDER_GUIDELINE__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case SupplierPackage.REORDER_GUIDELINE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case SupplierPackage.REORDER_GUIDELINE__FACILITY_ID:
				setFacilityId((Facility)newValue);
				return;
			case SupplierPackage.REORDER_GUIDELINE__GEO_ID:
				setGeoId((Geo)newValue);
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
			case SupplierPackage.REORDER_GUIDELINE__REORDER_GUIDELINE_ID:
				setReorderGuidelineId(REORDER_GUIDELINE_ID_EDEFAULT);
				return;
			case SupplierPackage.REORDER_GUIDELINE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case SupplierPackage.REORDER_GUIDELINE__REORDER_LEVEL:
				setReorderLevel(REORDER_LEVEL_EDEFAULT);
				return;
			case SupplierPackage.REORDER_GUIDELINE__REORDER_QUANTITY:
				setReorderQuantity(REORDER_QUANTITY_EDEFAULT);
				return;
			case SupplierPackage.REORDER_GUIDELINE__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case SupplierPackage.REORDER_GUIDELINE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case SupplierPackage.REORDER_GUIDELINE__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case SupplierPackage.REORDER_GUIDELINE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case SupplierPackage.REORDER_GUIDELINE__FACILITY_ID:
				setFacilityId((Facility)null);
				return;
			case SupplierPackage.REORDER_GUIDELINE__GEO_ID:
				setGeoId((Geo)null);
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
			case SupplierPackage.REORDER_GUIDELINE__REORDER_GUIDELINE_ID:
				return REORDER_GUIDELINE_ID_EDEFAULT == null ? reorderGuidelineId != null : !REORDER_GUIDELINE_ID_EDEFAULT.equals(reorderGuidelineId);
			case SupplierPackage.REORDER_GUIDELINE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case SupplierPackage.REORDER_GUIDELINE__REORDER_LEVEL:
				return REORDER_LEVEL_EDEFAULT == null ? reorderLevel != null : !REORDER_LEVEL_EDEFAULT.equals(reorderLevel);
			case SupplierPackage.REORDER_GUIDELINE__REORDER_QUANTITY:
				return REORDER_QUANTITY_EDEFAULT == null ? reorderQuantity != null : !REORDER_QUANTITY_EDEFAULT.equals(reorderQuantity);
			case SupplierPackage.REORDER_GUIDELINE__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case SupplierPackage.REORDER_GUIDELINE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case SupplierPackage.REORDER_GUIDELINE__PRODUCT_ID:
				return productId != null;
			case SupplierPackage.REORDER_GUIDELINE__PARTY_ID:
				return partyId != null;
			case SupplierPackage.REORDER_GUIDELINE__FACILITY_ID:
				return facilityId != null;
			case SupplierPackage.REORDER_GUIDELINE__GEO_ID:
				return geoId != null;
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
		result.append(" (reorderGuidelineId: ");
		result.append(reorderGuidelineId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", reorderLevel: ");
		result.append(reorderLevel);
		result.append(", reorderQuantity: ");
		result.append(reorderQuantity);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ReorderGuidelineImpl
