/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Account Group Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountGroupId <em>Gl Account Group Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountGroupMember()
 * @model annotation="mimo-ent-frame title='General Ledger Account Group Member'"
 * @generated
 */
public interface GlAccountGroupMember extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Id</em>' reference.
	 * @see #setGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountGroupMember_GlAccountId()
	 * @model keys="glAccountId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	GlAccount getGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountId <em>Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Id</em>' reference.
	 * @see #getGlAccountId()
	 * @generated
	 */
	void setGlAccountId(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Gl Account Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Group Id</em>' reference.
	 * @see #setGlAccountGroupId(GlAccountGroup)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountGroupMember_GlAccountGroupId()
	 * @model keys="glAccountGroupId"
	 * @generated
	 */
	GlAccountGroup getGlAccountGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountGroupId <em>Gl Account Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Group Id</em>' reference.
	 * @see #getGlAccountGroupId()
	 * @generated
	 */
	void setGlAccountGroupId(GlAccountGroup value);

	/**
	 * Returns the value of the '<em><b>Gl Account Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Group Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Group Type Id</em>' reference.
	 * @see #setGlAccountGroupTypeId(GlAccountGroupType)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountGroupMember_GlAccountGroupTypeId()
	 * @model keys="glAccountGroupTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	GlAccountGroupType getGlAccountGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Group Type Id</em>' reference.
	 * @see #getGlAccountGroupTypeId()
	 * @generated
	 */
	void setGlAccountGroupTypeId(GlAccountGroupType value);

} // GlAccountGroupMember
