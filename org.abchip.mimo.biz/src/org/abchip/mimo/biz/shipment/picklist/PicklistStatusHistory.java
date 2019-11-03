/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picklist Status History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getPicklistId <em>Picklist Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getChangeUserLoginId <em>Change User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusIdTo <em>Status Id To</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory()
 * @model
 * @generated
 */
public interface PicklistStatusHistory extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Date</em>' attribute.
	 * @see #setChangeDate(Date)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory_ChangeDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getChangeDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getChangeDate <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Date</em>' attribute.
	 * @see #getChangeDate()
	 * @generated
	 */
	void setChangeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Change User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change User Login Id</em>' attribute.
	 * @see #setChangeUserLoginId(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory_ChangeUserLoginId()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getChangeUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getChangeUserLoginId <em>Change User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change User Login Id</em>' attribute.
	 * @see #getChangeUserLoginId()
	 * @generated
	 */
	void setChangeUserLoginId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory_PicklistId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Picklist'"
	 * @generated
	 */
	String getPicklistId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getPicklistId <em>Picklist Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Id</em>' attribute.
	 * @see #getPicklistId()
	 * @generated
	 */
	void setPicklistId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id To</em>' attribute.
	 * @see #setStatusIdTo(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory_StatusIdTo()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusIdTo <em>Status Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id To</em>' attribute.
	 * @see #getStatusIdTo()
	 * @generated
	 */
	void setStatusIdTo(String value);

} // PicklistStatusHistory
