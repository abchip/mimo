/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variance Reason Gl Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getVarianceReasonId <em>Variance Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getGlAccountId <em>Gl Account Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getVarianceReasonGlAccount()
 * @model
 * @generated
 */
public interface VarianceReasonGlAccount extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Organization Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party Id</em>' attribute.
	 * @see #setOrganizationPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getVarianceReasonGlAccount_OrganizationPartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getOrganizationPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party Id</em>' attribute.
	 * @see #getOrganizationPartyId()
	 * @generated
	 */
	void setOrganizationPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Variance Reason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variance Reason Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variance Reason Id</em>' attribute.
	 * @see #setVarianceReasonId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getVarianceReasonGlAccount_VarianceReasonId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='VarianceReason'"
	 * @generated
	 */
	String getVarianceReasonId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getVarianceReasonId <em>Variance Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variance Reason Id</em>' attribute.
	 * @see #getVarianceReasonId()
	 * @generated
	 */
	void setVarianceReasonId(String value);

	/**
	 * Returns the value of the '<em><b>Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Id</em>' attribute.
	 * @see #setGlAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getVarianceReasonGlAccount_GlAccountId()
	 * @model annotation="mimo-ent-domain frame='GlAccount'"
	 * @generated
	 */
	String getGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getGlAccountId <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Id</em>' attribute.
	 * @see #getGlAccountId()
	 * @generated
	 */
	void setGlAccountId(String value);

} // VarianceReasonGlAccount
