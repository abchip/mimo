/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.product.product.Product;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Facility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ProductFacility#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ProductFacility#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ProductFacility#getDaysToShip <em>Days To Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ProductFacility#getLastInventoryCount <em>Last Inventory Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ProductFacility#getMinimumStock <em>Minimum Stock</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ProductFacility#getReorderQuantity <em>Reorder Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.ProductFacility#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getProductFacility()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductFacility extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Days To Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days To Ship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days To Ship</em>' attribute.
	 * @see #setDaysToShip(long)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getProductFacility_DaysToShip()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getDaysToShip();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getDaysToShip <em>Days To Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days To Ship</em>' attribute.
	 * @see #getDaysToShip()
	 * @generated
	 */
	void setDaysToShip(long value);

	/**
	 * Returns the value of the '<em><b>Last Inventory Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Inventory Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Inventory Count</em>' attribute.
	 * @see #setLastInventoryCount(BigDecimal)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getProductFacility_LastInventoryCount()
	 * @model annotation="mimo-ent-slot help='This field represents availableToPromiseTotal of a product at a certain point of time and is being updated regularly by a schedule service every hour'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getLastInventoryCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getLastInventoryCount <em>Last Inventory Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Inventory Count</em>' attribute.
	 * @see #getLastInventoryCount()
	 * @generated
	 */
	void setLastInventoryCount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Minimum Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Stock</em>' attribute.
	 * @see #setMinimumStock(BigDecimal)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getProductFacility_MinimumStock()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getMinimumStock();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getMinimumStock <em>Minimum Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Stock</em>' attribute.
	 * @see #getMinimumStock()
	 * @generated
	 */
	void setMinimumStock(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getProductFacility_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Reorder Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reorder Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reorder Quantity</em>' attribute.
	 * @see #setReorderQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getProductFacility_ReorderQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReorderQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getReorderQuantity <em>Reorder Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reorder Quantity</em>' attribute.
	 * @see #getReorderQuantity()
	 * @generated
	 */
	void setReorderQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Requirement Method Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Method Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Method Enum Id</em>' reference.
	 * @see #setRequirementMethodEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getProductFacility_RequirementMethodEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getRequirementMethodEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Method Enum Id</em>' reference.
	 * @see #getRequirementMethodEnumId()
	 * @generated
	 */
	void setRequirementMethodEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' reference.
	 * @see #setFacilityId(Facility)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getProductFacility_FacilityId()
	 * @model keys="facilityId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Facility getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getFacilityId <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' reference.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(Facility value);

} // ProductFacility
