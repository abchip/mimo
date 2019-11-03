/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.order.return_.ReturnHeaderType;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getDestinationFacilityId <em>Destination Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getFromPartyId <em>From Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#isNeedsInventoryReceive <em>Needs Inventory Receive</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getOriginContactMechId <em>Origin Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getReturnHeaderTypeId <em>Return Header Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getSupplierRmaId <em>Supplier Rma Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getToPartyId <em>To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getCommunicationEventReturns <em>Communication Event Returns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getReturnItems <em>Return Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnHeaderImpl extends BizEntityTypedImpl<ReturnHeaderType> implements ReturnHeader {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected String returnId = RETURN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected String billingAccountId = BILLING_ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected String createdBy = CREATED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String currencyUomId = CURRENCY_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationFacilityId() <em>Destination Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationFacilityId() <em>Destination Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String destinationFacilityId = DESTINATION_FACILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryDate() <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENTRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryDate() <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected Date entryDate = ENTRY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountId = FIN_ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromPartyId() <em>From Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromPartyId() <em>From Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPartyId()
	 * @generated
	 * @ordered
	 */
	protected String fromPartyId = FROM_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsInventoryReceive() <em>Needs Inventory Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsInventoryReceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_INVENTORY_RECEIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsInventoryReceive() <em>Needs Inventory Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsInventoryReceive()
	 * @generated
	 * @ordered
	 */
	protected boolean needsInventoryReceive = NEEDS_INVENTORY_RECEIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginContactMechId() <em>Origin Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginContactMechId() <em>Origin Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String originContactMechId = ORIGIN_CONTACT_MECH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethodId = PAYMENT_METHOD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnHeaderTypeId() <em>Return Header Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnHeaderTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_HEADER_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnHeaderTypeId() <em>Return Header Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnHeaderTypeId()
	 * @generated
	 * @ordered
	 */
	protected String returnHeaderTypeId = RETURN_HEADER_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierRmaId() <em>Supplier Rma Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierRmaId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_RMA_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierRmaId() <em>Supplier Rma Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierRmaId()
	 * @generated
	 * @ordered
	 */
	protected String supplierRmaId = SUPPLIER_RMA_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getToPartyId() <em>To Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToPartyId() <em>To Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPartyId()
	 * @generated
	 * @ordered
	 */
	protected String toPartyId = TO_PARTY_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunicationEventReturns() <em>Communication Event Returns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventReturns()
	 * @generated
	 * @ordered
	 */
	protected EList<String> communicationEventReturns;

	/**
	 * The cached value of the '{@link #getReturnItems() <em>Return Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> returnItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(String newBillingAccountId) {
		String oldBillingAccountId = billingAccountId;
		billingAccountId = newBillingAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__BILLING_ACCOUNT_ID, oldBillingAccountId, billingAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedBy(String newCreatedBy) {
		String oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__CREATED_BY, oldCreatedBy, createdBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		String oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinationFacilityId() {
		return destinationFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationFacilityId(String newDestinationFacilityId) {
		String oldDestinationFacilityId = destinationFacilityId;
		destinationFacilityId = newDestinationFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__DESTINATION_FACILITY_ID, oldDestinationFacilityId, destinationFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return entryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		Date oldEntryDate = entryDate;
		entryDate = newEntryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__ENTRY_DATE, oldEntryDate, entryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountId() {
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(String newFinAccountId) {
		String oldFinAccountId = finAccountId;
		finAccountId = newFinAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__FIN_ACCOUNT_ID, oldFinAccountId, finAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromPartyId() {
		return fromPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromPartyId(String newFromPartyId) {
		String oldFromPartyId = fromPartyId;
		fromPartyId = newFromPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__FROM_PARTY_ID, oldFromPartyId, fromPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNeedsInventoryReceive() {
		return needsInventoryReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsInventoryReceive(boolean newNeedsInventoryReceive) {
		boolean oldNeedsInventoryReceive = needsInventoryReceive;
		needsInventoryReceive = newNeedsInventoryReceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE, oldNeedsInventoryReceive, needsInventoryReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginContactMechId() {
		return originContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMechId(String newOriginContactMechId) {
		String oldOriginContactMechId = originContactMechId;
		originContactMechId = newOriginContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID, oldOriginContactMechId, originContactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(String newPaymentMethodId) {
		String oldPaymentMethodId = paymentMethodId;
		paymentMethodId = newPaymentMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__PAYMENT_METHOD_ID, oldPaymentMethodId, paymentMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnHeaderTypeId() {
		return returnHeaderTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnHeaderTypeId(String newReturnHeaderTypeId) {
		String oldReturnHeaderTypeId = returnHeaderTypeId;
		returnHeaderTypeId = newReturnHeaderTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__RETURN_HEADER_TYPE_ID, oldReturnHeaderTypeId, returnHeaderTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnId() {
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(String newReturnId) {
		String oldReturnId = returnId;
		returnId = newReturnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__RETURN_ID, oldReturnId, returnId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierRmaId() {
		return supplierRmaId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierRmaId(String newSupplierRmaId) {
		String oldSupplierRmaId = supplierRmaId;
		supplierRmaId = newSupplierRmaId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__SUPPLIER_RMA_ID, oldSupplierRmaId, supplierRmaId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToPartyId() {
		return toPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToPartyId(String newToPartyId) {
		String oldToPartyId = toPartyId;
		toPartyId = newToPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER__TO_PARTY_ID, oldToPartyId, toPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCommunicationEventReturns() {
		if (communicationEventReturns == null) {
			communicationEventReturns = new EDataTypeUniqueEList<String>(String.class, this, ReturnPackage.RETURN_HEADER__COMMUNICATION_EVENT_RETURNS);
		}
		return communicationEventReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getReturnItems() {
		if (returnItems == null) {
			returnItems = new EDataTypeUniqueEList<String>(String.class, this, ReturnPackage.RETURN_HEADER__RETURN_ITEMS);
		}
		return returnItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> primaryShipments() {
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
	public List<String> returnAdjustments() {
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
	public List<String> returnStatuss() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_HEADER__RETURN_ID:
				return getReturnId();
			case ReturnPackage.RETURN_HEADER__BILLING_ACCOUNT_ID:
				return getBillingAccountId();
			case ReturnPackage.RETURN_HEADER__CREATED_BY:
				return getCreatedBy();
			case ReturnPackage.RETURN_HEADER__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case ReturnPackage.RETURN_HEADER__DESTINATION_FACILITY_ID:
				return getDestinationFacilityId();
			case ReturnPackage.RETURN_HEADER__ENTRY_DATE:
				return getEntryDate();
			case ReturnPackage.RETURN_HEADER__FIN_ACCOUNT_ID:
				return getFinAccountId();
			case ReturnPackage.RETURN_HEADER__FROM_PARTY_ID:
				return getFromPartyId();
			case ReturnPackage.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE:
				return isNeedsInventoryReceive();
			case ReturnPackage.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID:
				return getOriginContactMechId();
			case ReturnPackage.RETURN_HEADER__PAYMENT_METHOD_ID:
				return getPaymentMethodId();
			case ReturnPackage.RETURN_HEADER__RETURN_HEADER_TYPE_ID:
				return getReturnHeaderTypeId();
			case ReturnPackage.RETURN_HEADER__STATUS_ID:
				return getStatusId();
			case ReturnPackage.RETURN_HEADER__SUPPLIER_RMA_ID:
				return getSupplierRmaId();
			case ReturnPackage.RETURN_HEADER__TO_PARTY_ID:
				return getToPartyId();
			case ReturnPackage.RETURN_HEADER__COMMUNICATION_EVENT_RETURNS:
				return getCommunicationEventReturns();
			case ReturnPackage.RETURN_HEADER__RETURN_ITEMS:
				return getReturnItems();
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
			case ReturnPackage.RETURN_HEADER__RETURN_ID:
				setReturnId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__BILLING_ACCOUNT_ID:
				setBillingAccountId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__CREATED_BY:
				setCreatedBy((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__DESTINATION_FACILITY_ID:
				setDestinationFacilityId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__ENTRY_DATE:
				setEntryDate((Date)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__FIN_ACCOUNT_ID:
				setFinAccountId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__FROM_PARTY_ID:
				setFromPartyId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE:
				setNeedsInventoryReceive((Boolean)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__PAYMENT_METHOD_ID:
				setPaymentMethodId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__RETURN_HEADER_TYPE_ID:
				setReturnHeaderTypeId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__SUPPLIER_RMA_ID:
				setSupplierRmaId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__TO_PARTY_ID:
				setToPartyId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__COMMUNICATION_EVENT_RETURNS:
				getCommunicationEventReturns().clear();
				getCommunicationEventReturns().addAll((Collection<? extends String>)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__RETURN_ITEMS:
				getReturnItems().clear();
				getReturnItems().addAll((Collection<? extends String>)newValue);
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
			case ReturnPackage.RETURN_HEADER__RETURN_ID:
				setReturnId(RETURN_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__BILLING_ACCOUNT_ID:
				setBillingAccountId(BILLING_ACCOUNT_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__CREATED_BY:
				setCreatedBy(CREATED_BY_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__DESTINATION_FACILITY_ID:
				setDestinationFacilityId(DESTINATION_FACILITY_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__ENTRY_DATE:
				setEntryDate(ENTRY_DATE_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__FIN_ACCOUNT_ID:
				setFinAccountId(FIN_ACCOUNT_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__FROM_PARTY_ID:
				setFromPartyId(FROM_PARTY_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE:
				setNeedsInventoryReceive(NEEDS_INVENTORY_RECEIVE_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId(ORIGIN_CONTACT_MECH_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__PAYMENT_METHOD_ID:
				setPaymentMethodId(PAYMENT_METHOD_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__RETURN_HEADER_TYPE_ID:
				setReturnHeaderTypeId(RETURN_HEADER_TYPE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__SUPPLIER_RMA_ID:
				setSupplierRmaId(SUPPLIER_RMA_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__TO_PARTY_ID:
				setToPartyId(TO_PARTY_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__COMMUNICATION_EVENT_RETURNS:
				getCommunicationEventReturns().clear();
				return;
			case ReturnPackage.RETURN_HEADER__RETURN_ITEMS:
				getReturnItems().clear();
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
			case ReturnPackage.RETURN_HEADER__RETURN_ID:
				return RETURN_ID_EDEFAULT == null ? returnId != null : !RETURN_ID_EDEFAULT.equals(returnId);
			case ReturnPackage.RETURN_HEADER__BILLING_ACCOUNT_ID:
				return BILLING_ACCOUNT_ID_EDEFAULT == null ? billingAccountId != null : !BILLING_ACCOUNT_ID_EDEFAULT.equals(billingAccountId);
			case ReturnPackage.RETURN_HEADER__CREATED_BY:
				return CREATED_BY_EDEFAULT == null ? createdBy != null : !CREATED_BY_EDEFAULT.equals(createdBy);
			case ReturnPackage.RETURN_HEADER__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case ReturnPackage.RETURN_HEADER__DESTINATION_FACILITY_ID:
				return DESTINATION_FACILITY_ID_EDEFAULT == null ? destinationFacilityId != null : !DESTINATION_FACILITY_ID_EDEFAULT.equals(destinationFacilityId);
			case ReturnPackage.RETURN_HEADER__ENTRY_DATE:
				return ENTRY_DATE_EDEFAULT == null ? entryDate != null : !ENTRY_DATE_EDEFAULT.equals(entryDate);
			case ReturnPackage.RETURN_HEADER__FIN_ACCOUNT_ID:
				return FIN_ACCOUNT_ID_EDEFAULT == null ? finAccountId != null : !FIN_ACCOUNT_ID_EDEFAULT.equals(finAccountId);
			case ReturnPackage.RETURN_HEADER__FROM_PARTY_ID:
				return FROM_PARTY_ID_EDEFAULT == null ? fromPartyId != null : !FROM_PARTY_ID_EDEFAULT.equals(fromPartyId);
			case ReturnPackage.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE:
				return needsInventoryReceive != NEEDS_INVENTORY_RECEIVE_EDEFAULT;
			case ReturnPackage.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID:
				return ORIGIN_CONTACT_MECH_ID_EDEFAULT == null ? originContactMechId != null : !ORIGIN_CONTACT_MECH_ID_EDEFAULT.equals(originContactMechId);
			case ReturnPackage.RETURN_HEADER__PAYMENT_METHOD_ID:
				return PAYMENT_METHOD_ID_EDEFAULT == null ? paymentMethodId != null : !PAYMENT_METHOD_ID_EDEFAULT.equals(paymentMethodId);
			case ReturnPackage.RETURN_HEADER__RETURN_HEADER_TYPE_ID:
				return RETURN_HEADER_TYPE_ID_EDEFAULT == null ? returnHeaderTypeId != null : !RETURN_HEADER_TYPE_ID_EDEFAULT.equals(returnHeaderTypeId);
			case ReturnPackage.RETURN_HEADER__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case ReturnPackage.RETURN_HEADER__SUPPLIER_RMA_ID:
				return SUPPLIER_RMA_ID_EDEFAULT == null ? supplierRmaId != null : !SUPPLIER_RMA_ID_EDEFAULT.equals(supplierRmaId);
			case ReturnPackage.RETURN_HEADER__TO_PARTY_ID:
				return TO_PARTY_ID_EDEFAULT == null ? toPartyId != null : !TO_PARTY_ID_EDEFAULT.equals(toPartyId);
			case ReturnPackage.RETURN_HEADER__COMMUNICATION_EVENT_RETURNS:
				return communicationEventReturns != null && !communicationEventReturns.isEmpty();
			case ReturnPackage.RETURN_HEADER__RETURN_ITEMS:
				return returnItems != null && !returnItems.isEmpty();
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
		result.append(" (returnId: ");
		result.append(returnId);
		result.append(", billingAccountId: ");
		result.append(billingAccountId);
		result.append(", createdBy: ");
		result.append(createdBy);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", destinationFacilityId: ");
		result.append(destinationFacilityId);
		result.append(", entryDate: ");
		result.append(entryDate);
		result.append(", finAccountId: ");
		result.append(finAccountId);
		result.append(", fromPartyId: ");
		result.append(fromPartyId);
		result.append(", needsInventoryReceive: ");
		result.append(needsInventoryReceive);
		result.append(", originContactMechId: ");
		result.append(originContactMechId);
		result.append(", paymentMethodId: ");
		result.append(paymentMethodId);
		result.append(", returnHeaderTypeId: ");
		result.append(returnHeaderTypeId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", supplierRmaId: ");
		result.append(supplierRmaId);
		result.append(", toPartyId: ");
		result.append(toPartyId);
		result.append(", communicationEventReturns: ");
		result.append(communicationEventReturns);
		result.append(", returnItems: ");
		result.append(returnItems);
		result.append(')');
		return result.toString();
	}

} //ReturnHeaderImpl
