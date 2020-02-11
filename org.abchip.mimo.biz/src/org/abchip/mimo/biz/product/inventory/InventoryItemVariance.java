/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Variance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getAvailableToPromiseVar <em>Available To Promise Var</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getQuantityOnHandVar <em>Quantity On Hand Var</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getVarianceReasonId <em>Variance Reason Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemVariance()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface InventoryItemVariance extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Available To Promise Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available To Promise Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available To Promise Var</em>' attribute.
	 * @see #setAvailableToPromiseVar(BigDecimal)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemVariance_AvailableToPromiseVar()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getAvailableToPromiseVar();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getAvailableToPromiseVar <em>Available To Promise Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available To Promise Var</em>' attribute.
	 * @see #getAvailableToPromiseVar()
	 * @generated
	 */
	void setAvailableToPromiseVar(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemVariance_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Quantity On Hand Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity On Hand Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity On Hand Var</em>' attribute.
	 * @see #setQuantityOnHandVar(BigDecimal)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemVariance_QuantityOnHandVar()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityOnHandVar();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getQuantityOnHandVar <em>Quantity On Hand Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity On Hand Var</em>' attribute.
	 * @see #getQuantityOnHandVar()
	 * @generated
	 */
	void setQuantityOnHandVar(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Physical Inventory Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Inventory Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Inventory Id</em>' reference.
	 * @see #setPhysicalInventoryId(PhysicalInventory)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemVariance_PhysicalInventoryId()
	 * @model keys="physicalInventoryId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PhysicalInventory getPhysicalInventoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getPhysicalInventoryId <em>Physical Inventory Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Inventory Id</em>' reference.
	 * @see #getPhysicalInventoryId()
	 * @generated
	 */
	void setPhysicalInventoryId(PhysicalInventory value);

	/**
	 * Returns the value of the '<em><b>Variance Reason Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variance Reason Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variance Reason Id</em>' reference.
	 * @see #setVarianceReasonId(VarianceReason)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemVariance_VarianceReasonId()
	 * @model keys="varianceReasonId"
	 * @generated
	 */
	VarianceReason getVarianceReasonId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getVarianceReasonId <em>Variance Reason Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variance Reason Id</em>' reference.
	 * @see #getVarianceReasonId()
	 * @generated
	 */
	void setVarianceReasonId(VarianceReason value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' reference.
	 * @see #setInventoryItemId(InventoryItem)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemVariance_InventoryItemId()
	 * @model keys="inventoryItemId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	InventoryItem getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemVariance#getInventoryItemId <em>Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' reference.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(InventoryItem value);

} // InventoryItemVariance
