/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

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
 * @model
 * @generated
 */
public interface FinAccountStatus extends BizEntity {
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
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountStatus_ChangeByUserLoginId()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getChangeByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login Id</em>' attribute.
	 * @see #getChangeByUserLoginId()
	 * @generated
	 */
	void setChangeByUserLoginId(String value);

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
	 * @model annotation="mimo-ent-slot key='true'"
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
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountStatus_StatusId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Fin Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Id</em>' attribute.
	 * @see #setFinAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountStatus_FinAccountId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='FinAccount'"
	 * @generated
	 */
	String getFinAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getFinAccountId <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Id</em>' attribute.
	 * @see #getFinAccountId()
	 * @generated
	 */
	void setFinAccountId(String value);

} // FinAccountStatus
