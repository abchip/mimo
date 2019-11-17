/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getDefaultGlAccountId <em>Default Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeAttrs <em>Invoice Item Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeGlAccounts <em>Invoice Item Type Gl Accounts</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface InvoiceItemType extends BizEntityType<InvoiceItem> {
	/**
	 * Returns the value of the '<em><b>Default Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Gl Account Id</em>' reference.
	 * @see #setDefaultGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemType_DefaultGlAccountId()
	 * @model keys="glAccountId"
	 * @generated
	 */
	GlAccount getDefaultGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getDefaultGlAccountId <em>Default Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Gl Account Id</em>' reference.
	 * @see #getDefaultGlAccountId()
	 * @generated
	 */
	void setDefaultGlAccountId(GlAccount value);

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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemType_HasTable()
	 * @model annotation="mimo-ent-format type='indicator' length='1'"
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(InvoiceItemType)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemType_ParentTypeId()
	 * @model keys="invoiceItemTypeId"
	 * @generated
	 */
	InvoiceItemType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(InvoiceItemType value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemType_InvoiceItemTypeAttrs()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItemTypeAttr'"
	 * @generated
	 */
	List<String> getInvoiceItemTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Invoice Item Type Gl Accounts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Type Gl Accounts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Type Gl Accounts</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemType_InvoiceItemTypeGlAccounts()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItemTypeGlAccount'"
	 * @generated
	 */
	List<String> getInvoiceItemTypeGlAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AgreementTerm' route='invoiceItemTypeId'"
	 * @generated
	 */
	List<String> agreementTerms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItemType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childInvoiceItemTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItemTypeMap' route='invoiceItemTypeId'"
	 * @generated
	 */
	List<String> invoiceItemTypeMaps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItem' route='invoiceItemTypeId'"
	 * @generated
	 */
	List<String> invoiceItems();

	/**
	 * Returns the value of the '<em><b>Invoice Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Type Id</em>' attribute.
	 * @see #setInvoiceItemTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemType_InvoiceItemTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Type Id</em>' attribute.
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 */
	void setInvoiceItemTypeId(String value);

} // InvoiceItemType
