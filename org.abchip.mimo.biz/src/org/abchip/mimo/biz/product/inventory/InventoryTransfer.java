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
 * A representation of the model object '<em><b>Inventory Transfer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getInventoryTransferId <em>Inventory Transfer Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getContainerIdTo <em>Container Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getFacilityIdTo <em>Facility Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getItemIssuanceId <em>Item Issuance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getLocationSeqIdTo <em>Location Seq Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getReceiveDate <em>Receive Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getSendDate <em>Send Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer()
 * @model
 * @generated
 */
public interface InventoryTransfer extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Transfer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Transfer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Transfer Id</em>' attribute.
	 * @see #setInventoryTransferId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_InventoryTransferId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInventoryTransferId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getInventoryTransferId <em>Inventory Transfer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Transfer Id</em>' attribute.
	 * @see #getInventoryTransferId()
	 * @generated
	 */
	void setInventoryTransferId(String value);

	/**
	 * Returns the value of the '<em><b>Item Issuance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Issuance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Issuance Id</em>' attribute.
	 * @see #setItemIssuanceId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_ItemIssuanceId()
	 * @model annotation="mimo-ent-domain frame='ItemIssuance'"
	 * @generated
	 */
	String getItemIssuanceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getItemIssuanceId <em>Item Issuance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Issuance Id</em>' attribute.
	 * @see #getItemIssuanceId()
	 * @generated
	 */
	void setItemIssuanceId(String value);

	/**
	 * Returns the value of the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Seq Id</em>' attribute.
	 * @see #setLocationSeqId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_LocationSeqId()
	 * @model
	 * @generated
	 */
	String getLocationSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getLocationSeqId <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Seq Id</em>' attribute.
	 * @see #getLocationSeqId()
	 * @generated
	 */
	void setLocationSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Location Seq Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Seq Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Seq Id To</em>' attribute.
	 * @see #setLocationSeqIdTo(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_LocationSeqIdTo()
	 * @model
	 * @generated
	 */
	String getLocationSeqIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getLocationSeqIdTo <em>Location Seq Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Seq Id To</em>' attribute.
	 * @see #getLocationSeqIdTo()
	 * @generated
	 */
	void setLocationSeqIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Receive Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Date</em>' attribute.
	 * @see #setReceiveDate(Date)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_ReceiveDate()
	 * @model
	 * @generated
	 */
	Date getReceiveDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getReceiveDate <em>Receive Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Date</em>' attribute.
	 * @see #getReceiveDate()
	 * @generated
	 */
	void setReceiveDate(Date value);

	/**
	 * Returns the value of the '<em><b>Send Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Date</em>' attribute.
	 * @see #setSendDate(Date)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_SendDate()
	 * @model
	 * @generated
	 */
	Date getSendDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getSendDate <em>Send Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Date</em>' attribute.
	 * @see #getSendDate()
	 * @generated
	 */
	void setSendDate(Date value);

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
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getStatusId <em>Status Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_InventoryItemId()
	 * @model annotation="mimo-ent-domain frame='InventoryItem'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' attribute.
	 * @see #setFacilityId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_FacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getFacilityId <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' attribute.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>Container Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Id</em>' attribute.
	 * @see #setContainerId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_ContainerId()
	 * @model annotation="mimo-ent-domain frame='Container'"
	 * @generated
	 */
	String getContainerId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getContainerId <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Id</em>' attribute.
	 * @see #getContainerId()
	 * @generated
	 */
	void setContainerId(String value);

	/**
	 * Returns the value of the '<em><b>Facility Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id To</em>' attribute.
	 * @see #setFacilityIdTo(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_FacilityIdTo()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getFacilityIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getFacilityIdTo <em>Facility Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id To</em>' attribute.
	 * @see #getFacilityIdTo()
	 * @generated
	 */
	void setFacilityIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Container Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Id To</em>' attribute.
	 * @see #setContainerIdTo(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryTransfer_ContainerIdTo()
	 * @model annotation="mimo-ent-domain frame='Container'"
	 * @generated
	 */
	String getContainerIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryTransfer#getContainerIdTo <em>Container Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Id To</em>' attribute.
	 * @see #getContainerIdTo()
	 * @generated
	 */
	void setContainerIdTo(String value);

} // InventoryTransfer
