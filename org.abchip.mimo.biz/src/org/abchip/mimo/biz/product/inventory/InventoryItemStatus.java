/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getStatusDatetime <em>Status Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getStatusEndDatetime <em>Status End Datetime</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemStatus()
 * @model
 * @generated
 */
public interface InventoryItemStatus extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Change By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change By User Login Id</em>' attribute.
	 * @see #setChangeByUserLoginId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemStatus_ChangeByUserLoginId()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getChangeByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login Id</em>' attribute.
	 * @see #getChangeByUserLoginId()
	 * @generated
	 */
	void setChangeByUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Owner Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Party Id</em>' attribute.
	 * @see #setOwnerPartyId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemStatus_OwnerPartyId()
	 * @model
	 * @generated
	 */
	String getOwnerPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getOwnerPartyId <em>Owner Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party Id</em>' attribute.
	 * @see #getOwnerPartyId()
	 * @generated
	 */
	void setOwnerPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemStatus_ProductId()
	 * @model
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Status Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Datetime</em>' attribute.
	 * @see #setStatusDatetime(Date)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemStatus_StatusDatetime()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getStatusDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getStatusDatetime <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Datetime</em>' attribute.
	 * @see #getStatusDatetime()
	 * @generated
	 */
	void setStatusDatetime(Date value);

	/**
	 * Returns the value of the '<em><b>Status End Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status End Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status End Datetime</em>' attribute.
	 * @see #setStatusEndDatetime(Date)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemStatus_StatusEndDatetime()
	 * @model
	 * @generated
	 */
	Date getStatusEndDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getStatusEndDatetime <em>Status End Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status End Datetime</em>' attribute.
	 * @see #getStatusEndDatetime()
	 * @generated
	 */
	void setStatusEndDatetime(Date value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemStatus_StatusId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #setInventoryItemId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemStatus_InventoryItemId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItem'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemStatus#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

} // InventoryItemStatus
