/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Label Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelType#getInventoryItemLabelTypeId <em>Inventory Item Label Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelType()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface InventoryItemLabelType extends BizEntityType<InventoryItemLabel> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelType_HasTable()
	 * @model annotation="mimo-ent-format type='indicator' length='1'"
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(InventoryItemLabelType)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelType_ParentTypeId()
	 * @model keys="inventoryItemLabelTypeId"
	 * @generated
	 */
	InventoryItemLabelType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(InventoryItemLabelType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemLabelType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childInventoryItemLabelTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemLabelAppl' route='inventoryItemLabelTypeId'"
	 * @generated
	 */
	List<String> inventoryItemLabelAppls();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemLabel' route='inventoryItemLabelTypeId'"
	 * @generated
	 */
	List<String> inventoryItemLabels();

	/**
	 * Returns the value of the '<em><b>Inventory Item Label Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Label Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Label Type Id</em>' attribute.
	 * @see #setInventoryItemLabelTypeId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelType_InventoryItemLabelTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getInventoryItemLabelTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelType#getInventoryItemLabelTypeId <em>Inventory Item Label Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Label Type Id</em>' attribute.
	 * @see #getInventoryItemLabelTypeId()
	 * @generated
	 */
	void setInventoryItemLabelTypeId(String value);

} // InventoryItemLabelType
