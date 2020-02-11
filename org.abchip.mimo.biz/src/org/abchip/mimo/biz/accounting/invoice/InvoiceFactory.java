/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage
 * @generated
 */
public interface InvoiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InvoiceFactory eINSTANCE = org.abchip.mimo.biz.accounting.invoice.impl.InvoiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice</em>'.
	 * @generated
	 */
	Invoice createInvoice();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	InvoiceAttribute createInvoiceAttribute();

	/**
	 * Returns a new object of class '<em>Contact Mech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Mech</em>'.
	 * @generated
	 */
	InvoiceContactMech createInvoiceContactMech();

	/**
	 * Returns a new object of class '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content</em>'.
	 * @generated
	 */
	InvoiceContent createInvoiceContent();

	/**
	 * Returns a new object of class '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Type</em>'.
	 * @generated
	 */
	InvoiceContentType createInvoiceContentType();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	InvoiceItem createInvoiceItem();

	/**
	 * Returns a new object of class '<em>Item Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Assoc</em>'.
	 * @generated
	 */
	InvoiceItemAssoc createInvoiceItemAssoc();

	/**
	 * Returns a new object of class '<em>Item Assoc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Assoc Type</em>'.
	 * @generated
	 */
	InvoiceItemAssocType createInvoiceItemAssocType();

	/**
	 * Returns a new object of class '<em>Item Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Attribute</em>'.
	 * @generated
	 */
	InvoiceItemAttribute createInvoiceItemAttribute();

	/**
	 * Returns a new object of class '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type</em>'.
	 * @generated
	 */
	InvoiceItemType createInvoiceItemType();

	/**
	 * Returns a new object of class '<em>Item Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type Attr</em>'.
	 * @generated
	 */
	InvoiceItemTypeAttr createInvoiceItemTypeAttr();

	/**
	 * Returns a new object of class '<em>Item Type Gl Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type Gl Account</em>'.
	 * @generated
	 */
	InvoiceItemTypeGlAccount createInvoiceItemTypeGlAccount();

	/**
	 * Returns a new object of class '<em>Item Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type Map</em>'.
	 * @generated
	 */
	InvoiceItemTypeMap createInvoiceItemTypeMap();

	/**
	 * Returns a new object of class '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	InvoiceNote createInvoiceNote();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	InvoiceRole createInvoiceRole();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	InvoiceStatus createInvoiceStatus();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	InvoiceTerm createInvoiceTerm();

	/**
	 * Returns a new object of class '<em>Term Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Attribute</em>'.
	 * @generated
	 */
	InvoiceTermAttribute createInvoiceTermAttribute();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	InvoiceType createInvoiceType();

	/**
	 * Returns a new object of class '<em>Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Attr</em>'.
	 * @generated
	 */
	InvoiceTypeAttr createInvoiceTypeAttr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InvoicePackage getInvoicePackage();

} //InvoiceFactory
