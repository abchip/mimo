/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getAccountCode <em>Account Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getAccountName <em>Account Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountClassId <em>Gl Account Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountGroupMembers <em>Gl Account Group Members</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountOrganizations <em>Gl Account Organizations</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountTypeId <em>Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlResourceTypeId <em>Gl Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlXbrlClassId <em>Gl Xbrl Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getParentGlAccountId <em>Parent Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount()
 * @model annotation="mimo-ent-frame title='General Ledger Account' formula='description'"
 * @generated
 */
public interface GlAccount extends BizEntityTyped<GlAccountType> {
	/**
	 * Returns the value of the '<em><b>Account Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Code</em>' attribute.
	 * @see #setAccountCode(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_AccountCode()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getAccountCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getAccountCode <em>Account Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Code</em>' attribute.
	 * @see #getAccountCode()
	 * @generated
	 */
	void setAccountCode(String value);

	/**
	 * Returns the value of the '<em><b>Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Name</em>' attribute.
	 * @see #setAccountName(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_AccountName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getAccountName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getAccountName <em>Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Name</em>' attribute.
	 * @see #getAccountName()
	 * @generated
	 */
	void setAccountName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_ExternalId()
	 * @model annotation="mimo-ent-slot help='id of the account in an external system where the accounts are imported/exported'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_ProductId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Type Id</em>' reference.
	 * @see #setGlAccountTypeId(GlAccountType)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_GlAccountTypeId()
	 * @model keys="glAccountTypeId"
	 * @generated
	 */
	GlAccountType getGlAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountTypeId <em>Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Type Id</em>' reference.
	 * @see #getGlAccountTypeId()
	 * @generated
	 */
	void setGlAccountTypeId(GlAccountType value);

	/**
	 * Returns the value of the '<em><b>Gl Account Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Class Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Class Id</em>' reference.
	 * @see #setGlAccountClassId(GlAccountClass)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_GlAccountClassId()
	 * @model keys="glAccountClassId"
	 * @generated
	 */
	GlAccountClass getGlAccountClassId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountClassId <em>Gl Account Class Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Class Id</em>' reference.
	 * @see #getGlAccountClassId()
	 * @generated
	 */
	void setGlAccountClassId(GlAccountClass value);

	/**
	 * Returns the value of the '<em><b>Gl Account Group Members</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Group Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Group Members</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_GlAccountGroupMembers()
	 * @model derived="true"
	 * @generated
	 */
	List<GlAccountGroupMember> getGlAccountGroupMembers();

	/**
	 * Returns the value of the '<em><b>Gl Account Organizations</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Organizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Organizations</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_GlAccountOrganizations()
	 * @model derived="true"
	 * @generated
	 */
	List<GlAccountOrganization> getGlAccountOrganizations();

	/**
	 * Returns the value of the '<em><b>Gl Resource Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Resource Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Resource Type Id</em>' reference.
	 * @see #setGlResourceTypeId(GlResourceType)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_GlResourceTypeId()
	 * @model keys="glResourceTypeId"
	 * @generated
	 */
	GlResourceType getGlResourceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlResourceTypeId <em>Gl Resource Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Resource Type Id</em>' reference.
	 * @see #getGlResourceTypeId()
	 * @generated
	 */
	void setGlResourceTypeId(GlResourceType value);

	/**
	 * Returns the value of the '<em><b>Gl Xbrl Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Xbrl Class Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Xbrl Class Id</em>' reference.
	 * @see #setGlXbrlClassId(GlXbrlClass)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_GlXbrlClassId()
	 * @model keys="glXbrlClassId"
	 * @generated
	 */
	GlXbrlClass getGlXbrlClassId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlXbrlClassId <em>Gl Xbrl Class Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Xbrl Class Id</em>' reference.
	 * @see #getGlXbrlClassId()
	 * @generated
	 */
	void setGlXbrlClassId(GlXbrlClass value);

	/**
	 * Returns the value of the '<em><b>Parent Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Gl Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Gl Account Id</em>' reference.
	 * @see #setParentGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_ParentGlAccountId()
	 * @model keys="glAccountId"
	 * @generated
	 */
	GlAccount getParentGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getParentGlAccountId <em>Parent Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Gl Account Id</em>' reference.
	 * @see #getParentGlAccountId()
	 * @generated
	 */
	void setParentGlAccountId(GlAccount value);

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
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccount_GlAccountId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountId <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Id</em>' attribute.
	 * @see #getGlAccountId()
	 * @generated
	 */
	void setGlAccountId(String value);

} // GlAccount
