/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getDefaultGlAccountId <em>Default Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getInvoiceItemTypeAttrs <em>Invoice Item Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getInvoiceItemTypeGlAccounts <em>Invoice Item Type Gl Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceItemTypeImpl extends BizEntityTypeImpl<InvoiceItem> implements InvoiceItemType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getDefaultGlAccountId() {
		return (GlAccount)eGet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultGlAccountId(GlAccount newDefaultGlAccountId) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT_ID, newDefaultGlAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemType getParentTypeId() {
		return (InvoiceItemType)eGet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(InvoiceItemType newParentTypeId) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getInvoiceItemTypeAttrs() {
		return (List<String>)eGet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getInvoiceItemTypeGlAccounts() {
		return (List<String>)eGet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> agreementTerms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childInvoiceItemTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoiceItemTypeMaps() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoiceItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InvoicePackage.INVOICE_ITEM_TYPE___AGREEMENT_TERMS:
				return agreementTerms();
			case InvoicePackage.INVOICE_ITEM_TYPE___CHILD_INVOICE_ITEM_TYPES:
				return childInvoiceItemTypes();
			case InvoicePackage.INVOICE_ITEM_TYPE___INVOICE_ITEM_TYPE_MAPS:
				return invoiceItemTypeMaps();
			case InvoicePackage.INVOICE_ITEM_TYPE___INVOICE_ITEMS:
				return invoiceItems();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemTypeId() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemTypeId(String newInvoiceItemTypeId) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID, newInvoiceItemTypeId);
	}

} //InvoiceItemTypeImpl
