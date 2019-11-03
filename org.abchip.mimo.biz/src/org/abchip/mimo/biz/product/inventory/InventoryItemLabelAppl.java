/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item Label Appl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl#getInventoryItemLabelTypeId <em>Inventory Item Label Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl#getInventoryItemLabelId <em>Inventory Item Label Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelAppl()
 * @model
 * @generated
 */
public interface InventoryItemLabelAppl extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelAppl_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

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
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelAppl_InventoryItemId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItem'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

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
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelAppl_InventoryItemLabelTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemLabelType'"
	 * @generated
	 */
	String getInventoryItemLabelTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl#getInventoryItemLabelTypeId <em>Inventory Item Label Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Label Type Id</em>' attribute.
	 * @see #getInventoryItemLabelTypeId()
	 * @generated
	 */
	void setInventoryItemLabelTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Label Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Label Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Label Id</em>' attribute.
	 * @see #setInventoryItemLabelId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItemLabelAppl_InventoryItemLabelId()
	 * @model annotation="mimo-ent-domain frame='InventoryItemLabel'"
	 * @generated
	 */
	String getInventoryItemLabelId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl#getInventoryItemLabelId <em>Inventory Item Label Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Label Id</em>' attribute.
	 * @see #getInventoryItemLabelId()
	 * @generated
	 */
	void setInventoryItemLabelId(String value);

} // InventoryItemLabelAppl
