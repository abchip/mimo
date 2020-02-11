/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Item Type Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemMapKey <em>Invoice Item Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemTypeMap()
 * @model
 * @generated
 */
public interface InvoiceItemTypeMap extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Invoice Item Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Map Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Map Key</em>' attribute.
	 * @see #setInvoiceItemMapKey(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemTypeMap_InvoiceItemMapKey()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getInvoiceItemMapKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemMapKey <em>Invoice Item Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Map Key</em>' attribute.
	 * @see #getInvoiceItemMapKey()
	 * @generated
	 */
	void setInvoiceItemMapKey(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Type Id</em>' reference.
	 * @see #setInvoiceTypeId(InvoiceType)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemTypeMap_InvoiceTypeId()
	 * @model keys="invoiceTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	InvoiceType getInvoiceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceTypeId <em>Invoice Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type Id</em>' reference.
	 * @see #getInvoiceTypeId()
	 * @generated
	 */
	void setInvoiceTypeId(InvoiceType value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Type Id</em>' reference.
	 * @see #setInvoiceItemTypeId(InvoiceItemType)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemTypeMap_InvoiceItemTypeId()
	 * @model keys="invoiceItemTypeId"
	 * @generated
	 */
	InvoiceItemType getInvoiceItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Type Id</em>' reference.
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 */
	void setInvoiceItemTypeId(InvoiceItemType value);

} // InvoiceItemTypeMap
