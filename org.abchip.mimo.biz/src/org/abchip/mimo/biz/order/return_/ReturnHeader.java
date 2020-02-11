/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCommunicationEventReturns <em>Communication Event Returns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getDestinationFacilityId <em>Destination Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getFromPartyId <em>From Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#isNeedsInventoryReceive <em>Needs Inventory Receive</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getOriginContactMechId <em>Origin Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnHeaderTypeId <em>Return Header Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnItems <em>Return Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getSupplierRmaId <em>Supplier Rma Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getToPartyId <em>To Party Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader()
 * @model annotation="mimo-ent-frame title='Return'"
 * @generated
 */
public interface ReturnHeader extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' reference.
	 * @see #setBillingAccountId(BillingAccount)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_BillingAccountId()
	 * @model keys="billingAccountId"
	 * @generated
	 */
	BillingAccount getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getBillingAccountId <em>Billing Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' reference.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Communication Event Returns</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.order.return_.CommunicationEventReturn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Returns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Returns</em>' reference list.
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_CommunicationEventReturns()
	 * @model derived="true"
	 * @generated
	 */
	List<CommunicationEventReturn> getCommunicationEventReturns();

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(UserLogin)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_CreatedBy()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedBy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' reference.
	 * @see #setCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_CurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Destination Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Facility Id</em>' reference.
	 * @see #setDestinationFacilityId(Facility)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_DestinationFacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getDestinationFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getDestinationFacilityId <em>Destination Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Facility Id</em>' reference.
	 * @see #getDestinationFacilityId()
	 * @generated
	 */
	void setDestinationFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Date</em>' attribute.
	 * @see #setEntryDate(Date)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_EntryDate()
	 * @model
	 * @generated
	 */
	Date getEntryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getEntryDate <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Date</em>' attribute.
	 * @see #getEntryDate()
	 * @generated
	 */
	void setEntryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Needs Inventory Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Inventory Receive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Inventory Receive</em>' attribute.
	 * @see #setNeedsInventoryReceive(boolean)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_NeedsInventoryReceive()
	 * @model
	 * @generated
	 */
	boolean isNeedsInventoryReceive();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#isNeedsInventoryReceive <em>Needs Inventory Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Inventory Receive</em>' attribute.
	 * @see #isNeedsInventoryReceive()
	 * @generated
	 */
	void setNeedsInventoryReceive(boolean value);

	/**
	 * Returns the value of the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Id</em>' reference.
	 * @see #setFinAccountId(FinAccount)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_FinAccountId()
	 * @model keys="finAccountId"
	 * @generated
	 */
	FinAccount getFinAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getFinAccountId <em>Fin Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Id</em>' reference.
	 * @see #getFinAccountId()
	 * @generated
	 */
	void setFinAccountId(FinAccount value);

	/**
	 * Returns the value of the '<em><b>From Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Party Id</em>' reference.
	 * @see #setFromPartyId(Party)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_FromPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getFromPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getFromPartyId <em>From Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Party Id</em>' reference.
	 * @see #getFromPartyId()
	 * @generated
	 */
	void setFromPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Origin Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Contact Mech Id</em>' reference.
	 * @see #setOriginContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_OriginContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getOriginContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getOriginContactMechId <em>Origin Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Contact Mech Id</em>' reference.
	 * @see #getOriginContactMechId()
	 * @generated
	 */
	void setOriginContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Payment Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Id</em>' reference.
	 * @see #setPaymentMethodId(PaymentMethod)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_PaymentMethodId()
	 * @model keys="paymentMethodId"
	 * @generated
	 */
	PaymentMethod getPaymentMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getPaymentMethodId <em>Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Id</em>' reference.
	 * @see #getPaymentMethodId()
	 * @generated
	 */
	void setPaymentMethodId(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Return Header Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Header Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Header Type Id</em>' reference.
	 * @see #setReturnHeaderTypeId(ReturnHeaderType)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_ReturnHeaderTypeId()
	 * @model keys="returnHeaderTypeId"
	 * @generated
	 */
	ReturnHeaderType getReturnHeaderTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnHeaderTypeId <em>Return Header Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Header Type Id</em>' reference.
	 * @see #getReturnHeaderTypeId()
	 * @generated
	 */
	void setReturnHeaderTypeId(ReturnHeaderType value);

	/**
	 * Returns the value of the '<em><b>Return Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.order.return_.ReturnItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Items</em>' reference list.
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_ReturnItems()
	 * @model derived="true"
	 * @generated
	 */
	List<ReturnItem> getReturnItems();

	/**
	 * Returns the value of the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Id</em>' attribute.
	 * @see #setReturnId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_ReturnId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnId <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Id</em>' attribute.
	 * @see #getReturnId()
	 * @generated
	 */
	void setReturnId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Supplier Rma Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Rma Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Rma Id</em>' attribute.
	 * @see #setSupplierRmaId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_SupplierRmaId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSupplierRmaId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getSupplierRmaId <em>Supplier Rma Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Rma Id</em>' attribute.
	 * @see #getSupplierRmaId()
	 * @generated
	 */
	void setSupplierRmaId(String value);

	/**
	 * Returns the value of the '<em><b>To Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Party Id</em>' reference.
	 * @see #setToPartyId(Party)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_ToPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getToPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getToPartyId <em>To Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Party Id</em>' reference.
	 * @see #getToPartyId()
	 * @generated
	 */
	void setToPartyId(Party value);

} // ReturnHeader
