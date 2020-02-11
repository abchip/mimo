/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fin Account Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusEndDate <em>Status End Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountStatus()
 * @model annotation="mimo-ent-frame title='Financial Account Status'"
 * @generated
 */
public interface FinAccountStatus extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change By User Login Id</em>' reference.
	 * @see #setChangeByUserLoginId(UserLogin)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountStatus_ChangeByUserLoginId()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getChangeByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login Id</em>' reference.
	 * @see #getChangeByUserLoginId()
	 * @generated
	 */
	void setChangeByUserLoginId(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(Date)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountStatus_StatusDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status End Date</em>' attribute.
	 * @see #setStatusEndDate(Date)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountStatus_StatusEndDate()
	 * @model
	 * @generated
	 */
	Date getStatusEndDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusEndDate <em>Status End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status End Date</em>' attribute.
	 * @see #getStatusEndDate()
	 * @generated
	 */
	void setStatusEndDate(Date value);

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
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountStatus_StatusId()
	 * @model keys="statusId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Id</em>' reference.
	 * @see #setFinAccountId(FinAccount)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountStatus_FinAccountId()
	 * @model keys="finAccountId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FinAccount getFinAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getFinAccountId <em>Fin Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Id</em>' reference.
	 * @see #getFinAccountId()
	 * @generated
	 */
	void setFinAccountId(FinAccount value);

} // FinAccountStatus
