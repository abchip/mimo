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

import org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Item Assoc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocTypeImpl#getInvoiceItemAssocTypeId <em>Invoice Item Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceItemAssocTypeImpl extends BizEntityTypeImpl<InvoiceItemAssoc> implements InvoiceItemAssocType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceItemAssocTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE_ITEM_ASSOC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ITEM_ASSOC_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM_ASSOC_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(InvoicePackage.Literals.INVOICE_ITEM_ASSOC_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM_ASSOC_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvoiceItemAssocType getParentTypeId() {
		return (InvoiceItemAssocType)eGet(InvoicePackage.Literals.INVOICE_ITEM_ASSOC_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(InvoiceItemAssocType newParentTypeId) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM_ASSOC_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childInvoiceItemAssocTypes() {
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
			case InvoicePackage.INVOICE_ITEM_ASSOC_TYPE___CHILD_INVOICE_ITEM_ASSOC_TYPES:
				return childInvoiceItemAssocTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemAssocTypeId() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ITEM_ASSOC_TYPE__INVOICE_ITEM_ASSOC_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemAssocTypeId(String newInvoiceItemAssocTypeId) {
		eSet(InvoicePackage.Literals.INVOICE_ITEM_ASSOC_TYPE__INVOICE_ITEM_ASSOC_TYPE_ID, newInvoiceItemAssocTypeId);
	}

} //InvoiceItemAssocTypeImpl
