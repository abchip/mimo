/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactMechPurposeType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContactMechImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContactMechImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContactMechImpl#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceContactMechImpl extends BizEntityImpl implements InvoiceContactMech {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoiceId;
	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;
	/**
	 * The cached value of the '{@link #getContactMechPurposeTypeId() <em>Contact Mech Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContactMechPurposeType contactMechPurposeTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceContactMechImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE_CONTACT_MECH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_ID, oldContactMechId, contactMechId));
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		ContactMech oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechPurposeType getContactMechPurposeTypeId() {
		if (contactMechPurposeTypeId != null && ((EObject)contactMechPurposeTypeId).eIsProxy()) {
			InternalEObject oldContactMechPurposeTypeId = (InternalEObject)contactMechPurposeTypeId;
			contactMechPurposeTypeId = (ContactMechPurposeType)eResolveProxy(oldContactMechPurposeTypeId);
			if (contactMechPurposeTypeId != oldContactMechPurposeTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID, oldContactMechPurposeTypeId, contactMechPurposeTypeId));
			}
		}
		return contactMechPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMechPurposeType basicGetContactMechPurposeTypeId() {
		return contactMechPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechPurposeTypeId(ContactMechPurposeType newContactMechPurposeTypeId) {
		ContactMechPurposeType oldContactMechPurposeTypeId = contactMechPurposeTypeId;
		contactMechPurposeTypeId = newContactMechPurposeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID, oldContactMechPurposeTypeId, contactMechPurposeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice getInvoiceId() {
		if (invoiceId != null && ((EObject)invoiceId).eIsProxy()) {
			InternalEObject oldInvoiceId = (InternalEObject)invoiceId;
			invoiceId = (Invoice)eResolveProxy(oldInvoiceId);
			if (invoiceId != oldInvoiceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_CONTACT_MECH__INVOICE_ID, oldInvoiceId, invoiceId));
			}
		}
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice basicGetInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(Invoice newInvoiceId) {
		Invoice oldInvoiceId = invoiceId;
		invoiceId = newInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_CONTACT_MECH__INVOICE_ID, oldInvoiceId, invoiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InvoicePackage.INVOICE_CONTACT_MECH__INVOICE_ID:
				if (resolve) return getInvoiceId();
				return basicGetInvoiceId();
			case InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
			case InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID:
				if (resolve) return getContactMechPurposeTypeId();
				return basicGetContactMechPurposeTypeId();
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
			case InvoicePackage.INVOICE_CONTACT_MECH__INVOICE_ID:
				setInvoiceId((Invoice)newValue);
				return;
			case InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
				return;
			case InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID:
				setContactMechPurposeTypeId((ContactMechPurposeType)newValue);
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
			case InvoicePackage.INVOICE_CONTACT_MECH__INVOICE_ID:
				setInvoiceId((Invoice)null);
				return;
			case InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
				return;
			case InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID:
				setContactMechPurposeTypeId((ContactMechPurposeType)null);
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
			case InvoicePackage.INVOICE_CONTACT_MECH__INVOICE_ID:
				return invoiceId != null;
			case InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_ID:
				return contactMechId != null;
			case InvoicePackage.INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID:
				return contactMechPurposeTypeId != null;
		}
		return super.eIsSet(featureID);
	}

} //InvoiceContactMechImpl
