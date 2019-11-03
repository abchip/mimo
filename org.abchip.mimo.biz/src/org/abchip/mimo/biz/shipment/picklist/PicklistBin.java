/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picklist Bin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPicklistBinId <em>Picklist Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getBinLocationNumber <em>Bin Location Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPicklistId <em>Picklist Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPrimaryOrderId <em>Primary Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistBin()
 * @model
 * @generated
 */
public interface PicklistBin extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Bin Location Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Location Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Location Number</em>' attribute.
	 * @see #setBinLocationNumber(long)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistBin_BinLocationNumber()
	 * @model
	 * @generated
	 */
	long getBinLocationNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getBinLocationNumber <em>Bin Location Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin Location Number</em>' attribute.
	 * @see #getBinLocationNumber()
	 * @generated
	 */
	void setBinLocationNumber(long value);

	/**
	 * Returns the value of the '<em><b>Picklist Bin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Bin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Bin Id</em>' attribute.
	 * @see #setPicklistBinId(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistBin_PicklistBinId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPicklistBinId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPicklistBinId <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Bin Id</em>' attribute.
	 * @see #getPicklistBinId()
	 * @generated
	 */
	void setPicklistBinId(String value);

	/**
	 * Returns the value of the '<em><b>Picklist Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Id</em>' attribute.
	 * @see #setPicklistId(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistBin_PicklistId()
	 * @model annotation="mimo-ent-domain frame='Picklist'"
	 * @generated
	 */
	String getPicklistId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPicklistId <em>Picklist Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Id</em>' attribute.
	 * @see #getPicklistId()
	 * @generated
	 */
	void setPicklistId(String value);

	/**
	 * Returns the value of the '<em><b>Primary Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Order Id</em>' attribute.
	 * @see #setPrimaryOrderId(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistBin_PrimaryOrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getPrimaryOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPrimaryOrderId <em>Primary Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Order Id</em>' attribute.
	 * @see #getPrimaryOrderId()
	 * @generated
	 */
	void setPrimaryOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Primary Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Ship Group Seq Id</em>' attribute.
	 * @see #setPrimaryShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistBin_PrimaryShipGroupSeqId()
	 * @model
	 * @generated
	 */
	String getPrimaryShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Ship Group Seq Id</em>' attribute.
	 * @see #getPrimaryShipGroupSeqId()
	 * @generated
	 */
	void setPrimaryShipGroupSeqId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Shipment' route='picklistBinId'"
	 * @generated
	 */
	List<String> shipments();

} // PicklistBin
