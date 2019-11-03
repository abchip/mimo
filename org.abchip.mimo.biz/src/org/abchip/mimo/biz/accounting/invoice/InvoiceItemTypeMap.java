/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemMapKey <em>Invoice Item Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
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
	 * @model annotation="mimo-ent-slot key='true'"
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
	 * Returns the value of the '<em><b>Invoice Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Type Id</em>' attribute.
	 * @see #setInvoiceTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemTypeMap_InvoiceTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceType'"
	 * @generated
	 */
	String getInvoiceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceTypeId <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type Id</em>' attribute.
	 * @see #getInvoiceTypeId()
	 * @generated
	 */
	void setInvoiceTypeId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItemTypeMap_InvoiceItemTypeId()
	 * @model annotation="mimo-ent-domain frame='InvoiceItemType'"
	 * @generated
	 */
	String getInvoiceItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Type Id</em>' attribute.
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 */
	void setInvoiceItemTypeId(String value);

} // InvoiceItemTypeMap
