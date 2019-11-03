/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.abchip.mimo.biz.product.facility.ProductFacilityLocation;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Facility Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityLocationImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityLocationImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityLocationImpl#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityLocationImpl#getMinimumStock <em>Minimum Stock</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityLocationImpl#getMoveQuantity <em>Move Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFacilityLocationImpl extends BizEntityImpl implements ProductFacilityLocation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * The default value of the '{@link #getLocationSeqId() <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationSeqId() <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSeqId()
	 * @generated
	 * @ordered
	 */
	protected String locationSeqId = LOCATION_SEQ_ID_EDEFAULT;

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
	 * The default value of the '{@link #getMoveQuantity() <em>Move Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MOVE_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoveQuantity() <em>Move Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal moveQuantity = MOVE_QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFacilityLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilityPackage.Literals.PRODUCT_FACILITY_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqId() {
		return locationSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqId(String newLocationSeqId) {
		String oldLocationSeqId = locationSeqId;
		locationSeqId = newLocationSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY_LOCATION__LOCATION_SEQ_ID, oldLocationSeqId, locationSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY_LOCATION__MINIMUM_STOCK, oldMinimumStock, minimumStock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMoveQuantity() {
		return moveQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoveQuantity(BigDecimal newMoveQuantity) {
		BigDecimal oldMoveQuantity = moveQuantity;
		moveQuantity = newMoveQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY_LOCATION__MOVE_QUANTITY, oldMoveQuantity, moveQuantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY_LOCATION__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.PRODUCT_FACILITY_LOCATION__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__PRODUCT_ID:
				return getProductId();
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__FACILITY_ID:
				return getFacilityId();
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__LOCATION_SEQ_ID:
				return getLocationSeqId();
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__MINIMUM_STOCK:
				return getMinimumStock();
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__MOVE_QUANTITY:
				return getMoveQuantity();
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
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__LOCATION_SEQ_ID:
				setLocationSeqId((String)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__MINIMUM_STOCK:
				setMinimumStock((BigDecimal)newValue);
				return;
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__MOVE_QUANTITY:
				setMoveQuantity((BigDecimal)newValue);
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
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__LOCATION_SEQ_ID:
				setLocationSeqId(LOCATION_SEQ_ID_EDEFAULT);
				return;
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__MINIMUM_STOCK:
				setMinimumStock(MINIMUM_STOCK_EDEFAULT);
				return;
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__MOVE_QUANTITY:
				setMoveQuantity(MOVE_QUANTITY_EDEFAULT);
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
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__LOCATION_SEQ_ID:
				return LOCATION_SEQ_ID_EDEFAULT == null ? locationSeqId != null : !LOCATION_SEQ_ID_EDEFAULT.equals(locationSeqId);
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__MINIMUM_STOCK:
				return MINIMUM_STOCK_EDEFAULT == null ? minimumStock != null : !MINIMUM_STOCK_EDEFAULT.equals(minimumStock);
			case FacilityPackage.PRODUCT_FACILITY_LOCATION__MOVE_QUANTITY:
				return MOVE_QUANTITY_EDEFAULT == null ? moveQuantity != null : !MOVE_QUANTITY_EDEFAULT.equals(moveQuantity);
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", facilityId: ");
		result.append(facilityId);
		result.append(", locationSeqId: ");
		result.append(locationSeqId);
		result.append(", minimumStock: ");
		result.append(minimumStock);
		result.append(", moveQuantity: ");
		result.append(moveQuantity);
		result.append(')');
		return result.toString();
	}

} //ProductFacilityLocationImpl
