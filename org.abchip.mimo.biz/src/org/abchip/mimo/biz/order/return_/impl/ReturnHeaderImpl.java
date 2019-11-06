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

import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.order.return_.ReturnHeaderType;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#isNeedsInventoryReceive <em>Needs Inventory Receive</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getSupplierRmaId <em>Supplier Rma Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getReturnHeaderTypeId <em>Return Header Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getFromPartyId <em>From Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getToPartyId <em>To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getDestinationFacilityId <em>Destination Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getOriginContactMechId <em>Origin Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl#getCreatedBy <em>Created By</em>}</li>
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
	 * The cached value of the '{@link #getReturnHeaderTypeId() <em>Return Header Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnHeaderTypeId()
	 * @generated
	 * @ordered
	 */
	protected ReturnHeaderType returnHeaderTypeId;

	/**
	 * The cached value of the '{@link #getFromPartyId() <em>From Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party fromPartyId;

	/**
	 * The cached value of the '{@link #getToPartyId() <em>To Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party toPartyId;

	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected BillingAccount billingAccountId;

	/**
	 * The cached value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected FinAccount finAccountId;

	/**
	 * The cached value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethodId;

	/**
	 * The cached value of the '{@link #getDestinationFacilityId() <em>Destination Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility destinationFacilityId;

	/**
	 * The cached value of the '{@link #getOriginContactMechId() <em>Origin Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech originContactMechId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdBy;

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
	public BillingAccount getBillingAccountId() {
		if (billingAccountId != null && ((EObject)billingAccountId).eIsProxy()) {
			InternalEObject oldBillingAccountId = (InternalEObject)billingAccountId;
			billingAccountId = (BillingAccount)eResolveProxy(oldBillingAccountId);
			if (billingAccountId != oldBillingAccountId) {
			}
		}
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingAccount basicGetBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(BillingAccount newBillingAccountId) {
		billingAccountId = newBillingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedBy() {
		if (createdBy != null && ((EObject)createdBy).eIsProxy()) {
			InternalEObject oldCreatedBy = (InternalEObject)createdBy;
			createdBy = (UserLogin)eResolveProxy(oldCreatedBy);
			if (createdBy != oldCreatedBy) {
			}
		}
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedBy(UserLogin newCreatedBy) {
		createdBy = newCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		currencyUomId = newCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getDestinationFacilityId() {
		if (destinationFacilityId != null && ((EObject)destinationFacilityId).eIsProxy()) {
			InternalEObject oldDestinationFacilityId = (InternalEObject)destinationFacilityId;
			destinationFacilityId = (Facility)eResolveProxy(oldDestinationFacilityId);
			if (destinationFacilityId != oldDestinationFacilityId) {
			}
		}
		return destinationFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetDestinationFacilityId() {
		return destinationFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationFacilityId(Facility newDestinationFacilityId) {
		destinationFacilityId = newDestinationFacilityId;
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
		entryDate = newEntryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccountId() {
		if (finAccountId != null && ((EObject)finAccountId).eIsProxy()) {
			InternalEObject oldFinAccountId = (InternalEObject)finAccountId;
			finAccountId = (FinAccount)eResolveProxy(oldFinAccountId);
			if (finAccountId != oldFinAccountId) {
			}
		}
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccount basicGetFinAccountId() {
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(FinAccount newFinAccountId) {
		finAccountId = newFinAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getFromPartyId() {
		if (fromPartyId != null && ((EObject)fromPartyId).eIsProxy()) {
			InternalEObject oldFromPartyId = (InternalEObject)fromPartyId;
			fromPartyId = (Party)eResolveProxy(oldFromPartyId);
			if (fromPartyId != oldFromPartyId) {
			}
		}
		return fromPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetFromPartyId() {
		return fromPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromPartyId(Party newFromPartyId) {
		fromPartyId = newFromPartyId;
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
		needsInventoryReceive = newNeedsInventoryReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getOriginContactMechId() {
		if (originContactMechId != null && ((EObject)originContactMechId).eIsProxy()) {
			InternalEObject oldOriginContactMechId = (InternalEObject)originContactMechId;
			originContactMechId = (ContactMech)eResolveProxy(oldOriginContactMechId);
			if (originContactMechId != oldOriginContactMechId) {
			}
		}
		return originContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetOriginContactMechId() {
		return originContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMechId(ContactMech newOriginContactMechId) {
		originContactMechId = newOriginContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethodId() {
		if (paymentMethodId != null && ((EObject)paymentMethodId).eIsProxy()) {
			InternalEObject oldPaymentMethodId = (InternalEObject)paymentMethodId;
			paymentMethodId = (PaymentMethod)eResolveProxy(oldPaymentMethodId);
			if (paymentMethodId != oldPaymentMethodId) {
			}
		}
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod basicGetPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(PaymentMethod newPaymentMethodId) {
		paymentMethodId = newPaymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeaderType getReturnHeaderTypeId() {
		if (returnHeaderTypeId != null && ((EObject)returnHeaderTypeId).eIsProxy()) {
			InternalEObject oldReturnHeaderTypeId = (InternalEObject)returnHeaderTypeId;
			returnHeaderTypeId = (ReturnHeaderType)eResolveProxy(oldReturnHeaderTypeId);
			if (returnHeaderTypeId != oldReturnHeaderTypeId) {
			}
		}
		return returnHeaderTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnHeaderType basicGetReturnHeaderTypeId() {
		return returnHeaderTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnHeaderTypeId(ReturnHeaderType newReturnHeaderTypeId) {
		returnHeaderTypeId = newReturnHeaderTypeId;
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
		returnId = newReturnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		statusId = newStatusId;
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
		supplierRmaId = newSupplierRmaId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getToPartyId() {
		if (toPartyId != null && ((EObject)toPartyId).eIsProxy()) {
			InternalEObject oldToPartyId = (InternalEObject)toPartyId;
			toPartyId = (Party)eResolveProxy(oldToPartyId);
			if (toPartyId != oldToPartyId) {
			}
		}
		return toPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetToPartyId() {
		return toPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToPartyId(Party newToPartyId) {
		toPartyId = newToPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCommunicationEventReturns() {
		if (communicationEventReturns == null) {
			communicationEventReturns = new BasicInternalEList<String>(String.class);
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
			returnItems = new BasicInternalEList<String>(String.class);
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
			case ReturnPackage.RETURN_HEADER__ENTRY_DATE:
				return getEntryDate();
			case ReturnPackage.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE:
				return isNeedsInventoryReceive();
			case ReturnPackage.RETURN_HEADER__SUPPLIER_RMA_ID:
				return getSupplierRmaId();
			case ReturnPackage.RETURN_HEADER__RETURN_HEADER_TYPE_ID:
				if (resolve) return getReturnHeaderTypeId();
				return basicGetReturnHeaderTypeId();
			case ReturnPackage.RETURN_HEADER__FROM_PARTY_ID:
				if (resolve) return getFromPartyId();
				return basicGetFromPartyId();
			case ReturnPackage.RETURN_HEADER__TO_PARTY_ID:
				if (resolve) return getToPartyId();
				return basicGetToPartyId();
			case ReturnPackage.RETURN_HEADER__BILLING_ACCOUNT_ID:
				if (resolve) return getBillingAccountId();
				return basicGetBillingAccountId();
			case ReturnPackage.RETURN_HEADER__FIN_ACCOUNT_ID:
				if (resolve) return getFinAccountId();
				return basicGetFinAccountId();
			case ReturnPackage.RETURN_HEADER__PAYMENT_METHOD_ID:
				if (resolve) return getPaymentMethodId();
				return basicGetPaymentMethodId();
			case ReturnPackage.RETURN_HEADER__DESTINATION_FACILITY_ID:
				if (resolve) return getDestinationFacilityId();
				return basicGetDestinationFacilityId();
			case ReturnPackage.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID:
				if (resolve) return getOriginContactMechId();
				return basicGetOriginContactMechId();
			case ReturnPackage.RETURN_HEADER__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case ReturnPackage.RETURN_HEADER__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case ReturnPackage.RETURN_HEADER__CREATED_BY:
				if (resolve) return getCreatedBy();
				return basicGetCreatedBy();
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
			case ReturnPackage.RETURN_HEADER__ENTRY_DATE:
				setEntryDate((Date)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE:
				setNeedsInventoryReceive((Boolean)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__SUPPLIER_RMA_ID:
				setSupplierRmaId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__RETURN_HEADER_TYPE_ID:
				setReturnHeaderTypeId((ReturnHeaderType)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__FROM_PARTY_ID:
				setFromPartyId((Party)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__TO_PARTY_ID:
				setToPartyId((Party)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__BILLING_ACCOUNT_ID:
				setBillingAccountId((BillingAccount)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__DESTINATION_FACILITY_ID:
				setDestinationFacilityId((Facility)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId((ContactMech)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case ReturnPackage.RETURN_HEADER__CREATED_BY:
				setCreatedBy((UserLogin)newValue);
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
			case ReturnPackage.RETURN_HEADER__ENTRY_DATE:
				setEntryDate(ENTRY_DATE_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE:
				setNeedsInventoryReceive(NEEDS_INVENTORY_RECEIVE_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__SUPPLIER_RMA_ID:
				setSupplierRmaId(SUPPLIER_RMA_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER__RETURN_HEADER_TYPE_ID:
				setReturnHeaderTypeId((ReturnHeaderType)null);
				return;
			case ReturnPackage.RETURN_HEADER__FROM_PARTY_ID:
				setFromPartyId((Party)null);
				return;
			case ReturnPackage.RETURN_HEADER__TO_PARTY_ID:
				setToPartyId((Party)null);
				return;
			case ReturnPackage.RETURN_HEADER__BILLING_ACCOUNT_ID:
				setBillingAccountId((BillingAccount)null);
				return;
			case ReturnPackage.RETURN_HEADER__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)null);
				return;
			case ReturnPackage.RETURN_HEADER__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)null);
				return;
			case ReturnPackage.RETURN_HEADER__DESTINATION_FACILITY_ID:
				setDestinationFacilityId((Facility)null);
				return;
			case ReturnPackage.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID:
				setOriginContactMechId((ContactMech)null);
				return;
			case ReturnPackage.RETURN_HEADER__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case ReturnPackage.RETURN_HEADER__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case ReturnPackage.RETURN_HEADER__CREATED_BY:
				setCreatedBy((UserLogin)null);
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
			case ReturnPackage.RETURN_HEADER__ENTRY_DATE:
				return ENTRY_DATE_EDEFAULT == null ? entryDate != null : !ENTRY_DATE_EDEFAULT.equals(entryDate);
			case ReturnPackage.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE:
				return needsInventoryReceive != NEEDS_INVENTORY_RECEIVE_EDEFAULT;
			case ReturnPackage.RETURN_HEADER__SUPPLIER_RMA_ID:
				return SUPPLIER_RMA_ID_EDEFAULT == null ? supplierRmaId != null : !SUPPLIER_RMA_ID_EDEFAULT.equals(supplierRmaId);
			case ReturnPackage.RETURN_HEADER__RETURN_HEADER_TYPE_ID:
				return returnHeaderTypeId != null;
			case ReturnPackage.RETURN_HEADER__FROM_PARTY_ID:
				return fromPartyId != null;
			case ReturnPackage.RETURN_HEADER__TO_PARTY_ID:
				return toPartyId != null;
			case ReturnPackage.RETURN_HEADER__BILLING_ACCOUNT_ID:
				return billingAccountId != null;
			case ReturnPackage.RETURN_HEADER__FIN_ACCOUNT_ID:
				return finAccountId != null;
			case ReturnPackage.RETURN_HEADER__PAYMENT_METHOD_ID:
				return paymentMethodId != null;
			case ReturnPackage.RETURN_HEADER__DESTINATION_FACILITY_ID:
				return destinationFacilityId != null;
			case ReturnPackage.RETURN_HEADER__ORIGIN_CONTACT_MECH_ID:
				return originContactMechId != null;
			case ReturnPackage.RETURN_HEADER__STATUS_ID:
				return statusId != null;
			case ReturnPackage.RETURN_HEADER__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case ReturnPackage.RETURN_HEADER__CREATED_BY:
				return createdBy != null;
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
		result.append(", entryDate: ");
		result.append(entryDate);
		result.append(", needsInventoryReceive: ");
		result.append(needsInventoryReceive);
		result.append(", supplierRmaId: ");
		result.append(supplierRmaId);
		result.append(", communicationEventReturns: ");
		result.append(communicationEventReturns);
		result.append(", returnItems: ");
		result.append(returnItems);
		result.append(')');
		return result.toString();
	}

} //ReturnHeaderImpl
