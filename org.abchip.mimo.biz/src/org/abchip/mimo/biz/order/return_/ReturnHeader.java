/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

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
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getSupplierRmaId <em>Supplier Rma Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getToPartyId <em>To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCommunicationEventReturns <em>Communication Event Returns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnItems <em>Return Items</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader()
 * @model
 * @generated
 */
public interface ReturnHeader extends BizEntityTyped<ReturnHeaderType> {
	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' attribute.
	 * @see #setBillingAccountId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_BillingAccountId()
	 * @model annotation="mimo-ent-domain frame='BillingAccount'"
	 * @generated
	 */
	String getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getBillingAccountId <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' attribute.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' attribute.
	 * @see #setCreatedBy(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_CreatedBy()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' attribute.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Destination Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Facility Id</em>' attribute.
	 * @see #setDestinationFacilityId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_DestinationFacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getDestinationFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getDestinationFacilityId <em>Destination Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Facility Id</em>' attribute.
	 * @see #getDestinationFacilityId()
	 * @generated
	 */
	void setDestinationFacilityId(String value);

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
	 * Returns the value of the '<em><b>Fin Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Id</em>' attribute.
	 * @see #setFinAccountId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_FinAccountId()
	 * @model annotation="mimo-ent-domain frame='FinAccount'"
	 * @generated
	 */
	String getFinAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getFinAccountId <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Id</em>' attribute.
	 * @see #getFinAccountId()
	 * @generated
	 */
	void setFinAccountId(String value);

	/**
	 * Returns the value of the '<em><b>From Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Party Id</em>' attribute.
	 * @see #setFromPartyId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_FromPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getFromPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getFromPartyId <em>From Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Party Id</em>' attribute.
	 * @see #getFromPartyId()
	 * @generated
	 */
	void setFromPartyId(String value);

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
	 * Returns the value of the '<em><b>Origin Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Contact Mech Id</em>' attribute.
	 * @see #setOriginContactMechId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_OriginContactMechId()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getOriginContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getOriginContactMechId <em>Origin Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Contact Mech Id</em>' attribute.
	 * @see #getOriginContactMechId()
	 * @generated
	 */
	void setOriginContactMechId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Id</em>' attribute.
	 * @see #setPaymentMethodId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_PaymentMethodId()
	 * @model annotation="mimo-ent-domain frame='PaymentMethod'"
	 * @generated
	 */
	String getPaymentMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getPaymentMethodId <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Id</em>' attribute.
	 * @see #getPaymentMethodId()
	 * @generated
	 */
	void setPaymentMethodId(String value);

	/**
	 * Returns the value of the '<em><b>Return Header Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Header Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Header Type Id</em>' attribute.
	 * @see #setReturnHeaderTypeId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_ReturnHeaderTypeId()
	 * @model annotation="mimo-ent-domain frame='ReturnHeaderType'"
	 * @generated
	 */
	String getReturnHeaderTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnHeaderTypeId <em>Return Header Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Header Type Id</em>' attribute.
	 * @see #getReturnHeaderTypeId()
	 * @generated
	 */
	void setReturnHeaderTypeId(String value);

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
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
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
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>To Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Party Id</em>' attribute.
	 * @see #setToPartyId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_ToPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getToPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getToPartyId <em>To Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Party Id</em>' attribute.
	 * @see #getToPartyId()
	 * @generated
	 */
	void setToPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Returns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Returns</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Returns</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_CommunicationEventReturns()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventReturn'"
	 * @generated
	 */
	List<String> getCommunicationEventReturns();

	/**
	 * Returns the value of the '<em><b>Return Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Items</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeader_ReturnItems()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnItem'"
	 * @generated
	 */
	List<String> getReturnItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Shipment' route='primaryReturnId'"
	 * @generated
	 */
	List<String> primaryShipments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnAdjustment' route='returnId'"
	 * @generated
	 */
	List<String> returnAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnStatus' route='returnId'"
	 * @generated
	 */
	List<String> returnStatuss();

} // ReturnHeader
