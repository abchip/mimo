/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnStatusId <em>Return Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getStatusDatetime <em>Status Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnStatus()
 * @model
 * @generated
 */
public interface ReturnStatus extends BizEntity {
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnStatus_ChangeByUserLoginId()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getChangeByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login Id</em>' attribute.
	 * @see #getChangeByUserLoginId()
	 * @generated
	 */
	void setChangeByUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Id</em>' attribute.
	 * @see #setReturnId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnStatus_ReturnId()
	 * @model annotation="mimo-ent-domain frame='ReturnHeader'"
	 * @generated
	 */
	String getReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnId <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Id</em>' attribute.
	 * @see #getReturnId()
	 * @generated
	 */
	void setReturnId(String value);

	/**
	 * Returns the value of the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #setReturnItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnStatus_ReturnItemSeqId()
	 * @model
	 * @generated
	 */
	String getReturnItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnItemSeqId <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #getReturnItemSeqId()
	 * @generated
	 */
	void setReturnItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Return Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Status Id</em>' attribute.
	 * @see #setReturnStatusId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnStatus_ReturnStatusId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getReturnStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnStatusId <em>Return Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Status Id</em>' attribute.
	 * @see #getReturnStatusId()
	 * @generated
	 */
	void setReturnStatusId(String value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnStatus_StatusDatetime()
	 * @model
	 * @generated
	 */
	Date getStatusDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getStatusDatetime <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Datetime</em>' attribute.
	 * @see #getStatusDatetime()
	 * @generated
	 */
	void setStatusDatetime(Date value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnStatus_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

} // ReturnStatus
