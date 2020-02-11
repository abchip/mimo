/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.return_.CommunicationEventReturn;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.order.return_.ReturnHeaderType;
import org.abchip.mimo.biz.order.return_.ReturnItem;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getCommunicationEventReturns <em>Communication Event Returns</em>}</li>
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
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getReturnItems <em>Return Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getSupplierRmaId <em>Supplier Rma Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getToPartyId <em>To Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnHeaderImpl extends BizEntityImpl implements ReturnHeader {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	public BillingAccount getBillingAccountId() {
		return (BillingAccount)eGet(ReturnPackage.Literals.RETURN_HEADER__BILLING_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(BillingAccount newBillingAccountId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__BILLING_ACCOUNT_ID, newBillingAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CommunicationEventReturn> getCommunicationEventReturns() {
		return (List<CommunicationEventReturn>)eGet(ReturnPackage.Literals.RETURN_HEADER__COMMUNICATION_EVENT_RETURNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedBy() {
		return (UserLogin)eGet(ReturnPackage.Literals.RETURN_HEADER__CREATED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedBy(UserLogin newCreatedBy) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__CREATED_BY, newCreatedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(ReturnPackage.Literals.RETURN_HEADER__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getDestinationFacilityId() {
		return (Facility)eGet(ReturnPackage.Literals.RETURN_HEADER__DESTINATION_FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationFacilityId(Facility newDestinationFacilityId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__DESTINATION_FACILITY_ID, newDestinationFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return (Date)eGet(ReturnPackage.Literals.RETURN_HEADER__ENTRY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__ENTRY_DATE, newEntryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNeedsInventoryReceive() {
		return (Boolean)eGet(ReturnPackage.Literals.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsInventoryReceive(boolean newNeedsInventoryReceive) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE, newNeedsInventoryReceive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccountId() {
		return (FinAccount)eGet(ReturnPackage.Literals.RETURN_HEADER__FIN_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(FinAccount newFinAccountId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__FIN_ACCOUNT_ID, newFinAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getFromPartyId() {
		return (Party)eGet(ReturnPackage.Literals.RETURN_HEADER__FROM_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromPartyId(Party newFromPartyId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__FROM_PARTY_ID, newFromPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getOriginContactMechId() {
		return (ContactMech)eGet(ReturnPackage.Literals.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMechId(ContactMech newOriginContactMechId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID, newOriginContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethodId() {
		return (PaymentMethod)eGet(ReturnPackage.Literals.RETURN_HEADER__PAYMENT_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(PaymentMethod newPaymentMethodId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__PAYMENT_METHOD_ID, newPaymentMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeaderType getReturnHeaderTypeId() {
		return (ReturnHeaderType)eGet(ReturnPackage.Literals.RETURN_HEADER__RETURN_HEADER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnHeaderTypeId(ReturnHeaderType newReturnHeaderTypeId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__RETURN_HEADER_TYPE_ID, newReturnHeaderTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ReturnItem> getReturnItems() {
		return (List<ReturnItem>)eGet(ReturnPackage.Literals.RETURN_HEADER__RETURN_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_HEADER__RETURN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(String newReturnId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__RETURN_ID, newReturnId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(ReturnPackage.Literals.RETURN_HEADER__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierRmaId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_HEADER__SUPPLIER_RMA_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierRmaId(String newSupplierRmaId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__SUPPLIER_RMA_ID, newSupplierRmaId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getToPartyId() {
		return (Party)eGet(ReturnPackage.Literals.RETURN_HEADER__TO_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToPartyId(Party newToPartyId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__TO_PARTY_ID, newToPartyId);
	}

} //ReturnHeaderImpl
