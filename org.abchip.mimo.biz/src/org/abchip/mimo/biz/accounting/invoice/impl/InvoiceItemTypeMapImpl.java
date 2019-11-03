/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Item Type Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeMapImpl#getInvoiceItemMapKey <em>Invoice Item Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeMapImpl#getInvoiceTypeId <em>Invoice Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeMapImpl#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceItemTypeMapImpl extends BizEntityImpl implements InvoiceItemTypeMap {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getInvoiceItemMapKey() <em>Invoice Item Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemMapKey()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_MAP_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceItemMapKey() <em>Invoice Item Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemMapKey()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemMapKey = INVOICE_ITEM_MAP_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceTypeId() <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceTypeId() <em>Invoice Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceTypeId = INVOICE_TYPE_ID_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceItemTypeMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE_ITEM_TYPE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemMapKey() {
		return invoiceItemMapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemMapKey(String newInvoiceItemMapKey) {
		String oldInvoiceItemMapKey = invoiceItemMapKey;
		invoiceItemMapKey = newInvoiceItemMapKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_MAP_KEY, oldInvoiceItemMapKey, invoiceItemMapKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceTypeId() {
		return invoiceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceTypeId(String newInvoiceTypeId) {
		String oldInvoiceTypeId = invoiceTypeId;
		invoiceTypeId = newInvoiceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_TYPE_ID, oldInvoiceTypeId, invoiceTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_TYPE_ID, oldInvoiceItemTypeId, invoiceItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_MAP_KEY:
				return getInvoiceItemMapKey();
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_TYPE_ID:
				return getInvoiceTypeId();
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_TYPE_ID:
				return getInvoiceItemTypeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_MAP_KEY:
				setInvoiceItemMapKey((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_TYPE_ID:
				setInvoiceTypeId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId((String)newValue);
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
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_MAP_KEY:
				setInvoiceItemMapKey(INVOICE_ITEM_MAP_KEY_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_TYPE_ID:
				setInvoiceTypeId(INVOICE_TYPE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId(INVOICE_ITEM_TYPE_ID_EDEFAULT);
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
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_MAP_KEY:
				return INVOICE_ITEM_MAP_KEY_EDEFAULT == null ? invoiceItemMapKey != null : !INVOICE_ITEM_MAP_KEY_EDEFAULT.equals(invoiceItemMapKey);
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_TYPE_ID:
				return INVOICE_TYPE_ID_EDEFAULT == null ? invoiceTypeId != null : !INVOICE_TYPE_ID_EDEFAULT.equals(invoiceTypeId);
			case InvoicePackage.INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_TYPE_ID:
				return INVOICE_ITEM_TYPE_ID_EDEFAULT == null ? invoiceItemTypeId != null : !INVOICE_ITEM_TYPE_ID_EDEFAULT.equals(invoiceItemTypeId);
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
		result.append(" (invoiceItemMapKey: ");
		result.append(invoiceItemMapKey);
		result.append(", invoiceTypeId: ");
		result.append(invoiceTypeId);
		result.append(", invoiceItemTypeId: ");
		result.append(invoiceItemTypeId);
		result.append(')');
		return result.toString();
	}

} //InvoiceItemTypeMapImpl
