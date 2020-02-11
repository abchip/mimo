/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 * A representation of the model object '<em><b>Physical Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.PhysicalInventory#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.PhysicalInventory#getGeneralComments <em>General Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.PhysicalInventory#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.PhysicalInventory#getPhysicalInventoryDate <em>Physical Inventory Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getPhysicalInventory()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface PhysicalInventory extends BizEntity {
	/**
	 * Returns the value of the '<em><b>General Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Comments</em>' attribute.
	 * @see #setGeneralComments(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getPhysicalInventory_GeneralComments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getGeneralComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.PhysicalInventory#getGeneralComments <em>General Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Comments</em>' attribute.
	 * @see #getGeneralComments()
	 * @generated
	 */
	void setGeneralComments(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getPhysicalInventory_PartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.PhysicalInventory#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Physical Inventory Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Inventory Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Inventory Date</em>' attribute.
	 * @see #setPhysicalInventoryDate(Date)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getPhysicalInventory_PhysicalInventoryDate()
	 * @model
	 * @generated
	 */
	Date getPhysicalInventoryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.PhysicalInventory#getPhysicalInventoryDate <em>Physical Inventory Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Inventory Date</em>' attribute.
	 * @see #getPhysicalInventoryDate()
	 * @generated
	 */
	void setPhysicalInventoryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Physical Inventory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Inventory Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Inventory Id</em>' attribute.
	 * @see #setPhysicalInventoryId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getPhysicalInventory_PhysicalInventoryId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPhysicalInventoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.PhysicalInventory#getPhysicalInventoryId <em>Physical Inventory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Inventory Id</em>' attribute.
	 * @see #getPhysicalInventoryId()
	 * @generated
	 */
	void setPhysicalInventoryId(String value);

} // PhysicalInventory
