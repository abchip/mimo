/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.abchip.mimo.biz.product.facility.ProductFacility;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Facility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getDaysToShip <em>Days To Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getLastInventoryCount <em>Last Inventory Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getMinimumStock <em>Minimum Stock</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getReorderQuantity <em>Reorder Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFacilityImpl extends BizEntityImpl implements ProductFacility {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getDaysToShip() <em>Days To Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysToShip()
	 * @generated
	 * @ordered
	 */
	protected static final long DAYS_TO_SHIP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDaysToShip() <em>Days To Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysToShip()
	 * @generated
	 * @ordered
	 */
	protected long daysToShip = DAYS_TO_SHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastInventoryCount() <em>Last Inventory Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInventoryCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LAST_INVENTORY_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastInventoryCount() <em>Last Inventory Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastInventoryCount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lastInventoryCount = LAST_INVENTORY_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumStock() <em>Minimum Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumStock()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MINIMUM_STOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumStock() <em>Minimum Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumStock()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minimumStock = MINIMUM_STOCK_EDEFAULT;

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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

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
	 * The cached value of the '{@link #getRequirementMethodEnumId() <em>Requirement Method Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementMethodEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration requirementMethodEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFacilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilityPackage.Literals.PRODUCT_FACILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDaysToShip() {
		return daysToShip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaysToShip(long newDaysToShip) {
		long oldDaysToShip = daysToShip;
		daysToShip = newDaysToShip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY__DAYS_TO_SHIP, oldDaysToShip, daysToShip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLastInventoryCount() {
		return lastInventoryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInventoryCount(BigDecimal newLastInventoryCount) {
		BigDecimal oldLastInventoryCount = lastInventoryCount;
		lastInventoryCount = newLastInventoryCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY__LAST_INVENTORY_COUNT, oldLastInventoryCount, lastInventoryCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinimumStock() {
		return minimumStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumStock(BigDecimal newMinimumStock) {
		BigDecimal oldMinimumStock = minimumStock;
		minimumStock = newMinimumStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY__MINIMUM_STOCK, oldMinimumStock, minimumStock));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.PRODUCT_FACILITY__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY__PRODUCT_ID, oldProductId, productId));
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
		BigDecimal oldReorderQuantity = reorderQuantity;
		reorderQuantity = newReorderQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY__REORDER_QUANTITY, oldReorderQuantity, reorderQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRequirementMethodEnumId() {
		if (requirementMethodEnumId != null && ((EObject)requirementMethodEnumId).eIsProxy()) {
			InternalEObject oldRequirementMethodEnumId = (InternalEObject)requirementMethodEnumId;
			requirementMethodEnumId = (Enumeration)eResolveProxy(oldRequirementMethodEnumId);
			if (requirementMethodEnumId != oldRequirementMethodEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID, oldRequirementMethodEnumId, requirementMethodEnumId));
			}
		}
		return requirementMethodEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetRequirementMethodEnumId() {
		return requirementMethodEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementMethodEnumId(Enumeration newRequirementMethodEnumId) {
		Enumeration oldRequirementMethodEnumId = requirementMethodEnumId;
		requirementMethodEnumId = newRequirementMethodEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID, oldRequirementMethodEnumId, requirementMethodEnumId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.PRODUCT_FACILITY__FACILITY_ID, oldFacilityId, facilityId));
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
		Facility oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilityPackage.PRODUCT_FACILITY__DAYS_TO_SHIP:
				return getDaysToShip();
			case FacilityPackage.PRODUCT_FACILITY__LAST_INVENTORY_COUNT:
				return getLastInventoryCount();
			case FacilityPackage.PRODUCT_FACILITY__MINIMUM_STOCK:
				return getMinimumStock();
			case FacilityPackage.PRODUCT_FACILITY__REORDER_QUANTITY:
				return getReorderQuantity();
			case FacilityPackage.PRODUCT_FACILITY__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case FacilityPackage.PRODUCT_FACILITY__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
			case FacilityPackage.PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID:
				if (resolve) return getRequirementMethodEnumId();
				return basicGetRequirementMethodEnumId();
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
			case FacilityPackage.PRODUCT_FACILITY__DAYS_TO_SHIP:
				setDaysToShip((Long)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY__LAST_INVENTORY_COUNT:
				setLastInventoryCount((BigDecimal)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY__MINIMUM_STOCK:
				setMinimumStock((BigDecimal)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY__REORDER_QUANTITY:
				setReorderQuantity((BigDecimal)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY__FACILITY_ID:
				setFacilityId((Facility)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID:
				setRequirementMethodEnumId((Enumeration)newValue);
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
			case FacilityPackage.PRODUCT_FACILITY__DAYS_TO_SHIP:
				setDaysToShip(DAYS_TO_SHIP_EDEFAULT);
				return;
			case FacilityPackage.PRODUCT_FACILITY__LAST_INVENTORY_COUNT:
				setLastInventoryCount(LAST_INVENTORY_COUNT_EDEFAULT);
				return;
			case FacilityPackage.PRODUCT_FACILITY__MINIMUM_STOCK:
				setMinimumStock(MINIMUM_STOCK_EDEFAULT);
				return;
			case FacilityPackage.PRODUCT_FACILITY__REORDER_QUANTITY:
				setReorderQuantity(REORDER_QUANTITY_EDEFAULT);
				return;
			case FacilityPackage.PRODUCT_FACILITY__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case FacilityPackage.PRODUCT_FACILITY__FACILITY_ID:
				setFacilityId((Facility)null);
				return;
			case FacilityPackage.PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID:
				setRequirementMethodEnumId((Enumeration)null);
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
			case FacilityPackage.PRODUCT_FACILITY__DAYS_TO_SHIP:
				return daysToShip != DAYS_TO_SHIP_EDEFAULT;
			case FacilityPackage.PRODUCT_FACILITY__LAST_INVENTORY_COUNT:
				return LAST_INVENTORY_COUNT_EDEFAULT == null ? lastInventoryCount != null : !LAST_INVENTORY_COUNT_EDEFAULT.equals(lastInventoryCount);
			case FacilityPackage.PRODUCT_FACILITY__MINIMUM_STOCK:
				return MINIMUM_STOCK_EDEFAULT == null ? minimumStock != null : !MINIMUM_STOCK_EDEFAULT.equals(minimumStock);
			case FacilityPackage.PRODUCT_FACILITY__REORDER_QUANTITY:
				return REORDER_QUANTITY_EDEFAULT == null ? reorderQuantity != null : !REORDER_QUANTITY_EDEFAULT.equals(reorderQuantity);
			case FacilityPackage.PRODUCT_FACILITY__PRODUCT_ID:
				return productId != null;
			case FacilityPackage.PRODUCT_FACILITY__FACILITY_ID:
				return facilityId != null;
			case FacilityPackage.PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID:
				return requirementMethodEnumId != null;
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
		result.append(" (daysToShip: ");
		result.append(daysToShip);
		result.append(", lastInventoryCount: ");
		result.append(lastInventoryCount);
		result.append(", minimumStock: ");
		result.append(minimumStock);
		result.append(", reorderQuantity: ");
		result.append(reorderQuantity);
		result.append(')');
		return result.toString();
	}

} //ProductFacilityImpl
