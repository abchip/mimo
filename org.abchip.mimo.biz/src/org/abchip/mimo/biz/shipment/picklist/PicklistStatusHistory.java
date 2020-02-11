/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.security.login.UserLogin;

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
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
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
	 * Returns the value of the '<em><b>Change User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change User Login Id</em>' reference.
	 * @see #setChangeUserLoginId(UserLogin)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory_ChangeUserLoginId()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getChangeUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getChangeUserLoginId <em>Change User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change User Login Id</em>' reference.
	 * @see #getChangeUserLoginId()
	 * @generated
	 */
	void setChangeUserLoginId(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Picklist Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Id</em>' reference.
	 * @see #setPicklistId(Picklist)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory_PicklistId()
	 * @model keys="picklistId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Picklist getPicklistId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getPicklistId <em>Picklist Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Id</em>' reference.
	 * @see #getPicklistId()
	 * @generated
	 */
	void setPicklistId(Picklist value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Status Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id To</em>' reference.
	 * @see #setStatusIdTo(StatusItem)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistStatusHistory_StatusIdTo()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusIdTo <em>Status Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id To</em>' reference.
	 * @see #getStatusIdTo()
	 * @generated
	 */
	void setStatusIdTo(StatusItem value);

} // PicklistStatusHistory
