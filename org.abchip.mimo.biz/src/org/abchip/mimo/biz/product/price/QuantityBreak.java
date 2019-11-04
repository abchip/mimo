/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

import java.math.BigDecimal;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Break</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.QuantityBreak#getQuantityBreakId <em>Quantity Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.QuantityBreak#getFromQuantity <em>From Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.QuantityBreak#getThruQuantity <em>Thru Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.QuantityBreak#getQuantityBreakTypeId <em>Quantity Break Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.price.PricePackage#getQuantityBreak()
 * @model
 * @generated
 */
public interface QuantityBreak extends BizEntityTyped<QuantityBreakType> {
	/**
	 * Returns the value of the '<em><b>From Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Quantity</em>' attribute.
	 * @see #setFromQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getQuantityBreak_FromQuantity()
	 * @model
	 * @generated
	 */
	BigDecimal getFromQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.QuantityBreak#getFromQuantity <em>From Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Quantity</em>' attribute.
	 * @see #getFromQuantity()
	 * @generated
	 */
	void setFromQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Break Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Break Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Break Id</em>' attribute.
	 * @see #setQuantityBreakId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getQuantityBreak_QuantityBreakId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getQuantityBreakId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.QuantityBreak#getQuantityBreakId <em>Quantity Break Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Break Id</em>' attribute.
	 * @see #getQuantityBreakId()
	 * @generated
	 */
	void setQuantityBreakId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Quantity</em>' attribute.
	 * @see #setThruQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getQuantityBreak_ThruQuantity()
	 * @model
	 * @generated
	 */
	BigDecimal getThruQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.QuantityBreak#getThruQuantity <em>Thru Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Quantity</em>' attribute.
	 * @see #getThruQuantity()
	 * @generated
	 */
	void setThruQuantity(BigDecimal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentCostEstimate' route='priceBreakId'"
	 * @generated
	 */
	List<String> priceShipmentCostEstimates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentCostEstimate' route='quantityBreakId'"
	 * @generated
	 */
	List<String> quantityShipmentCostEstimates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentCostEstimate' route='weightBreakId'"
	 * @generated
	 */
	List<String> weightShipmentCostEstimates();

	/**
	 * Returns the value of the '<em><b>Quantity Break Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Break Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Break Type Id</em>' reference.
	 * @see #setQuantityBreakTypeId(QuantityBreakType)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getQuantityBreak_QuantityBreakTypeId()
	 * @model keys="quantityBreakTypeId"
	 * @generated
	 */
	QuantityBreakType getQuantityBreakTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.QuantityBreak#getQuantityBreakTypeId <em>Quantity Break Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Break Type Id</em>' reference.
	 * @see #getQuantityBreakTypeId()
	 * @generated
	 */
	void setQuantityBreakTypeId(QuantityBreakType value);

} // QuantityBreak