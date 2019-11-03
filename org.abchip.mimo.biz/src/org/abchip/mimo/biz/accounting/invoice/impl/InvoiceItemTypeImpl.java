/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getDefaultGlAccountId <em>Default Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
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
	 * The default value of the '{@link #getInvoiceItemTypeId() <em>Invoice Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceItemTypeId() <em>Invoice Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemTypeId = INVOICE_ITEM_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultGlAccountId() <em>Default Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefaultGlAccountId() <em>Default Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String defaultGlAccountId = DEFAULT_GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String parentTypeId = PARENT_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvoiceItemTypeAttrs() <em>Invoice Item Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> invoiceItemTypeAttrs;
	/**
	 * The cached value of the '{@link #getInvoiceItemTypeGlAccounts() <em>Invoice Item Type Gl Accounts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemTypeGlAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> invoiceItemTypeGlAccounts;

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
	public String getDefaultGlAccountId() {
		return defaultGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultGlAccountId(String newDefaultGlAccountId) {
		String oldDefaultGlAccountId = defaultGlAccountId;
		defaultGlAccountId = newDefaultGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT_ID, oldDefaultGlAccountId, defaultGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(String newParentTypeId) {
		String oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInvoiceItemTypeAttrs() {
		if (invoiceItemTypeAttrs == null) {
			invoiceItemTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS);
		}
		return invoiceItemTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInvoiceItemTypeGlAccounts() {
		if (invoiceItemTypeGlAccounts == null) {
			invoiceItemTypeGlAccounts = new EDataTypeUniqueEList<String>(String.class, this, InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS);
		}
		return invoiceItemTypeGlAccounts;
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
	public String getInvoiceItemTypeId() {
		return invoiceItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemTypeId(String newInvoiceItemTypeId) {
		String oldInvoiceItemTypeId = invoiceItemTypeId;
		invoiceItemTypeId = newInvoiceItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID, oldInvoiceItemTypeId, invoiceItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID:
				return getInvoiceItemTypeId();
			case InvoicePackage.INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT_ID:
				return getDefaultGlAccountId();
			case InvoicePackage.INVOICE_ITEM_TYPE__DESCRIPTION:
				return getDescription();
			case InvoicePackage.INVOICE_ITEM_TYPE__HAS_TABLE:
				return isHasTable();
			case InvoicePackage.INVOICE_ITEM_TYPE__PARENT_TYPE_ID:
				return getParentTypeId();
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS:
				return getInvoiceItemTypeAttrs();
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS:
				return getInvoiceItemTypeGlAccounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT_ID:
				setDefaultGlAccountId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS:
				getInvoiceItemTypeAttrs().clear();
				getInvoiceItemTypeAttrs().addAll((Collection<? extends String>)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS:
				getInvoiceItemTypeGlAccounts().clear();
				getInvoiceItemTypeGlAccounts().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId(INVOICE_ITEM_TYPE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT_ID:
				setDefaultGlAccountId(DEFAULT_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId(PARENT_TYPE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS:
				getInvoiceItemTypeAttrs().clear();
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS:
				getInvoiceItemTypeGlAccounts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID:
				return INVOICE_ITEM_TYPE_ID_EDEFAULT == null ? invoiceItemTypeId != null : !INVOICE_ITEM_TYPE_ID_EDEFAULT.equals(invoiceItemTypeId);
			case InvoicePackage.INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT_ID:
				return DEFAULT_GL_ACCOUNT_ID_EDEFAULT == null ? defaultGlAccountId != null : !DEFAULT_GL_ACCOUNT_ID_EDEFAULT.equals(defaultGlAccountId);
			case InvoicePackage.INVOICE_ITEM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InvoicePackage.INVOICE_ITEM_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case InvoicePackage.INVOICE_ITEM_TYPE__PARENT_TYPE_ID:
				return PARENT_TYPE_ID_EDEFAULT == null ? parentTypeId != null : !PARENT_TYPE_ID_EDEFAULT.equals(parentTypeId);
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS:
				return invoiceItemTypeAttrs != null && !invoiceItemTypeAttrs.isEmpty();
			case InvoicePackage.INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS:
				return invoiceItemTypeGlAccounts != null && !invoiceItemTypeGlAccounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (invoiceItemTypeId: ");
		result.append(invoiceItemTypeId);
		result.append(", defaultGlAccountId: ");
		result.append(defaultGlAccountId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", parentTypeId: ");
		result.append(parentTypeId);
		result.append(", invoiceItemTypeAttrs: ");
		result.append(invoiceItemTypeAttrs);
		result.append(", invoiceItemTypeGlAccounts: ");
		result.append(invoiceItemTypeGlAccounts);
		result.append(')');
		return result.toString();
	}

} //InvoiceItemTypeImpl
