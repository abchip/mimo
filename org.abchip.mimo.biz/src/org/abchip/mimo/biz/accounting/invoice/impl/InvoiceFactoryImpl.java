/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import org.abchip.mimo.biz.accounting.invoice.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InvoiceFactoryImpl extends EFactoryImpl implements InvoiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InvoiceFactory init() {
		try {
			InvoiceFactory theInvoiceFactory = (InvoiceFactory)EPackage.Registry.INSTANCE.getEFactory(InvoicePackage.eNS_URI);
			if (theInvoiceFactory != null) {
				return theInvoiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InvoiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InvoicePackage.INVOICE: return (EObject)createInvoice();
			case InvoicePackage.INVOICE_ATTRIBUTE: return (EObject)createInvoiceAttribute();
			case InvoicePackage.INVOICE_CONTACT_MECH: return (EObject)createInvoiceContactMech();
			case InvoicePackage.INVOICE_CONTENT: return (EObject)createInvoiceContent();
			case InvoicePackage.INVOICE_CONTENT_TYPE: return (EObject)createInvoiceContentType();
			case InvoicePackage.INVOICE_ITEM: return (EObject)createInvoiceItem();
			case InvoicePackage.INVOICE_ITEM_ASSOC: return (EObject)createInvoiceItemAssoc();
			case InvoicePackage.INVOICE_ITEM_ASSOC_TYPE: return (EObject)createInvoiceItemAssocType();
			case InvoicePackage.INVOICE_ITEM_ATTRIBUTE: return (EObject)createInvoiceItemAttribute();
			case InvoicePackage.INVOICE_ITEM_TYPE: return (EObject)createInvoiceItemType();
			case InvoicePackage.INVOICE_ITEM_TYPE_ATTR: return (EObject)createInvoiceItemTypeAttr();
			case InvoicePackage.INVOICE_ITEM_TYPE_GL_ACCOUNT: return (EObject)createInvoiceItemTypeGlAccount();
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP: return (EObject)createInvoiceItemTypeMap();
			case InvoicePackage.INVOICE_NOTE: return (EObject)createInvoiceNote();
			case InvoicePackage.INVOICE_ROLE: return (EObject)createInvoiceRole();
			case InvoicePackage.INVOICE_STATUS: return (EObject)createInvoiceStatus();
			case InvoicePackage.INVOICE_TERM: return (EObject)createInvoiceTerm();
			case InvoicePackage.INVOICE_TERM_ATTRIBUTE: return (EObject)createInvoiceTermAttribute();
			case InvoicePackage.INVOICE_TYPE: return (EObject)createInvoiceType();
			case InvoicePackage.INVOICE_TYPE_ATTR: return (EObject)createInvoiceTypeAttr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceAttribute createInvoiceAttribute() {
		InvoiceAttributeImpl invoiceAttribute = new InvoiceAttributeImpl();
		return invoiceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceContactMech createInvoiceContactMech() {
		InvoiceContactMechImpl invoiceContactMech = new InvoiceContactMechImpl();
		return invoiceContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceContent createInvoiceContent() {
		InvoiceContentImpl invoiceContent = new InvoiceContentImpl();
		return invoiceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceContentType createInvoiceContentType() {
		InvoiceContentTypeImpl invoiceContentType = new InvoiceContentTypeImpl();
		return invoiceContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItem createInvoiceItem() {
		InvoiceItemImpl invoiceItem = new InvoiceItemImpl();
		return invoiceItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemAssoc createInvoiceItemAssoc() {
		InvoiceItemAssocImpl invoiceItemAssoc = new InvoiceItemAssocImpl();
		return invoiceItemAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemAssocType createInvoiceItemAssocType() {
		InvoiceItemAssocTypeImpl invoiceItemAssocType = new InvoiceItemAssocTypeImpl();
		return invoiceItemAssocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemAttribute createInvoiceItemAttribute() {
		InvoiceItemAttributeImpl invoiceItemAttribute = new InvoiceItemAttributeImpl();
		return invoiceItemAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemType createInvoiceItemType() {
		InvoiceItemTypeImpl invoiceItemType = new InvoiceItemTypeImpl();
		return invoiceItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemTypeAttr createInvoiceItemTypeAttr() {
		InvoiceItemTypeAttrImpl invoiceItemTypeAttr = new InvoiceItemTypeAttrImpl();
		return invoiceItemTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemTypeGlAccount createInvoiceItemTypeGlAccount() {
		InvoiceItemTypeGlAccountImpl invoiceItemTypeGlAccount = new InvoiceItemTypeGlAccountImpl();
		return invoiceItemTypeGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemTypeMap createInvoiceItemTypeMap() {
		InvoiceItemTypeMapImpl invoiceItemTypeMap = new InvoiceItemTypeMapImpl();
		return invoiceItemTypeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceNote createInvoiceNote() {
		InvoiceNoteImpl invoiceNote = new InvoiceNoteImpl();
		return invoiceNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceRole createInvoiceRole() {
		InvoiceRoleImpl invoiceRole = new InvoiceRoleImpl();
		return invoiceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceStatus createInvoiceStatus() {
		InvoiceStatusImpl invoiceStatus = new InvoiceStatusImpl();
		return invoiceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceTerm createInvoiceTerm() {
		InvoiceTermImpl invoiceTerm = new InvoiceTermImpl();
		return invoiceTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceTermAttribute createInvoiceTermAttribute() {
		InvoiceTermAttributeImpl invoiceTermAttribute = new InvoiceTermAttributeImpl();
		return invoiceTermAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceType createInvoiceType() {
		InvoiceTypeImpl invoiceType = new InvoiceTypeImpl();
		return invoiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceTypeAttr createInvoiceTypeAttr() {
		InvoiceTypeAttrImpl invoiceTypeAttr = new InvoiceTypeAttrImpl();
		return invoiceTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoicePackage getInvoicePackage() {
		return (InvoicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InvoicePackage getPackage() {
		return InvoicePackage.eINSTANCE;
	}

} //InvoiceFactoryImpl
