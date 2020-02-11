/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Facility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getDaysToShip <em>Days To Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getLastInventoryCount <em>Last Inventory Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getMinimumStock <em>Minimum Stock</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl#getReorderQuantity <em>Reorder Quantity</em>}</li>
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
		return (Long)eGet(FacilityPackage.Literals.PRODUCT_FACILITY__DAYS_TO_SHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaysToShip(long newDaysToShip) {
		eSet(FacilityPackage.Literals.PRODUCT_FACILITY__DAYS_TO_SHIP, newDaysToShip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLastInventoryCount() {
		return (BigDecimal)eGet(FacilityPackage.Literals.PRODUCT_FACILITY__LAST_INVENTORY_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastInventoryCount(BigDecimal newLastInventoryCount) {
		eSet(FacilityPackage.Literals.PRODUCT_FACILITY__LAST_INVENTORY_COUNT, newLastInventoryCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinimumStock() {
		return (BigDecimal)eGet(FacilityPackage.Literals.PRODUCT_FACILITY__MINIMUM_STOCK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumStock(BigDecimal newMinimumStock) {
		eSet(FacilityPackage.Literals.PRODUCT_FACILITY__MINIMUM_STOCK, newMinimumStock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(FacilityPackage.Literals.PRODUCT_FACILITY__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(FacilityPackage.Literals.PRODUCT_FACILITY__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReorderQuantity() {
		return (BigDecimal)eGet(FacilityPackage.Literals.PRODUCT_FACILITY__REORDER_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReorderQuantity(BigDecimal newReorderQuantity) {
		eSet(FacilityPackage.Literals.PRODUCT_FACILITY__REORDER_QUANTITY, newReorderQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRequirementMethodEnumId() {
		return (Enumeration)eGet(FacilityPackage.Literals.PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementMethodEnumId(Enumeration newRequirementMethodEnumId) {
		eSet(FacilityPackage.Literals.PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID, newRequirementMethodEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		return (Facility)eGet(FacilityPackage.Literals.PRODUCT_FACILITY__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		eSet(FacilityPackage.Literals.PRODUCT_FACILITY__FACILITY_ID, newFacilityId);
	}

} //ProductFacilityImpl
