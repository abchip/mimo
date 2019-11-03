/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.invoice.InvoiceContent;
import org.abchip.mimo.biz.accounting.invoice.InvoiceContentType;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentImpl#getInvoiceContentTypeId <em>Invoice Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceContentImpl extends BizEntityTypedImpl<InvoiceContentType> implements InvoiceContent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceId = INVOICE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceContentTypeId() <em>Invoice Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_CONTENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceContentTypeId() <em>Invoice Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceContentTypeId = INVOICE_CONTENT_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_CONTENT__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_CONTENT__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_CONTENT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		String oldInvoiceId = invoiceId;
		invoiceId = newInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_CONTENT__INVOICE_ID, oldInvoiceId, invoiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceContentTypeId() {
		return invoiceContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceContentTypeId(String newInvoiceContentTypeId) {
		String oldInvoiceContentTypeId = invoiceContentTypeId;
		invoiceContentTypeId = newInvoiceContentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_CONTENT__INVOICE_CONTENT_TYPE_ID, oldInvoiceContentTypeId, invoiceContentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InvoicePackage.INVOICE_CONTENT__CONTENT_ID:
				return getContentId();
			case InvoicePackage.INVOICE_CONTENT__INVOICE_ID:
				return getInvoiceId();
			case InvoicePackage.INVOICE_CONTENT__INVOICE_CONTENT_TYPE_ID:
				return getInvoiceContentTypeId();
			case InvoicePackage.INVOICE_CONTENT__FROM_DATE:
				return getFromDate();
			case InvoicePackage.INVOICE_CONTENT__THRU_DATE:
				return getThruDate();
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
			case InvoicePackage.INVOICE_CONTENT__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case InvoicePackage.INVOICE_CONTENT__INVOICE_ID:
				setInvoiceId((String)newValue);
				return;
			case InvoicePackage.INVOICE_CONTENT__INVOICE_CONTENT_TYPE_ID:
				setInvoiceContentTypeId((String)newValue);
				return;
			case InvoicePackage.INVOICE_CONTENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case InvoicePackage.INVOICE_CONTENT__THRU_DATE:
				setThruDate((Date)newValue);
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
			case InvoicePackage.INVOICE_CONTENT__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_CONTENT__INVOICE_ID:
				setInvoiceId(INVOICE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_CONTENT__INVOICE_CONTENT_TYPE_ID:
				setInvoiceContentTypeId(INVOICE_CONTENT_TYPE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_CONTENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_CONTENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case InvoicePackage.INVOICE_CONTENT__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case InvoicePackage.INVOICE_CONTENT__INVOICE_ID:
				return INVOICE_ID_EDEFAULT == null ? invoiceId != null : !INVOICE_ID_EDEFAULT.equals(invoiceId);
			case InvoicePackage.INVOICE_CONTENT__INVOICE_CONTENT_TYPE_ID:
				return INVOICE_CONTENT_TYPE_ID_EDEFAULT == null ? invoiceContentTypeId != null : !INVOICE_CONTENT_TYPE_ID_EDEFAULT.equals(invoiceContentTypeId);
			case InvoicePackage.INVOICE_CONTENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case InvoicePackage.INVOICE_CONTENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (contentId: ");
		result.append(contentId);
		result.append(", invoiceId: ");
		result.append(invoiceId);
		result.append(", invoiceContentTypeId: ");
		result.append(invoiceContentTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //InvoiceContentImpl
