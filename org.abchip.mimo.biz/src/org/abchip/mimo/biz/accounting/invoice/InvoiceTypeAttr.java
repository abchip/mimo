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
 * A representation of the model object '<em><b>Invoice Type Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceTypeAttr()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface InvoiceTypeAttr extends BizEntity {
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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceTypeAttr_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceTypeAttr_AttrName()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id-long' length='60'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceTypeAttr_InvoiceTypeId()
	 * @model keys="invoiceTypeId"
	 * @generated
	 */
	InvoiceType getInvoiceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getInvoiceTypeId <em>Invoice Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type Id</em>' reference.
	 * @see #getInvoiceTypeId()
	 * @generated
	 */
	void setInvoiceTypeId(InvoiceType value);

} // InvoiceTypeAttr
