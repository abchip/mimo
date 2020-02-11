/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage
 * @generated
 */
public interface PaymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaymentFactory eINSTANCE = org.abchip.mimo.biz.accounting.payment.impl.PaymentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Billing Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billing Account</em>'.
	 * @generated
	 */
	BillingAccount createBillingAccount();

	/**
	 * Returns a new object of class '<em>Billing Account Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billing Account Role</em>'.
	 * @generated
	 */
	BillingAccountRole createBillingAccountRole();

	/**
	 * Returns a new object of class '<em>Billing Account Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billing Account Term</em>'.
	 * @generated
	 */
	BillingAccountTerm createBillingAccountTerm();

	/**
	 * Returns a new object of class '<em>Billing Account Term Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billing Account Term Attr</em>'.
	 * @generated
	 */
	BillingAccountTermAttr createBillingAccountTermAttr();

	/**
	 * Returns a new object of class '<em>Check Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Account</em>'.
	 * @generated
	 */
	CheckAccount createCheckAccount();

	/**
	 * Returns a new object of class '<em>Credit Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit Card</em>'.
	 * @generated
	 */
	CreditCard createCreditCard();

	/**
	 * Returns a new object of class '<em>Credit Card Type Gl Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit Card Type Gl Account</em>'.
	 * @generated
	 */
	CreditCardTypeGlAccount createCreditCardTypeGlAccount();

	/**
	 * Returns a new object of class '<em>Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deduction</em>'.
	 * @generated
	 */
	Deduction createDeduction();

	/**
	 * Returns a new object of class '<em>Deduction Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deduction Type</em>'.
	 * @generated
	 */
	DeductionType createDeductionType();

	/**
	 * Returns a new object of class '<em>Eft Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eft Account</em>'.
	 * @generated
	 */
	EftAccount createEftAccount();

	/**
	 * Returns a new object of class '<em>Gift Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gift Card</em>'.
	 * @generated
	 */
	GiftCard createGiftCard();

	/**
	 * Returns a new object of class '<em>Gift Card Fulfillment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gift Card Fulfillment</em>'.
	 * @generated
	 */
	GiftCardFulfillment createGiftCardFulfillment();

	/**
	 * Returns a new object of class '<em>Pay Pal Payment Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pay Pal Payment Method</em>'.
	 * @generated
	 */
	PayPalPaymentMethod createPayPalPaymentMethod();

	/**
	 * Returns a new object of class '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment</em>'.
	 * @generated
	 */
	Payment createPayment();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	PaymentApplication createPaymentApplication();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	PaymentAttribute createPaymentAttribute();

	/**
	 * Returns a new object of class '<em>Budget Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Budget Allocation</em>'.
	 * @generated
	 */
	PaymentBudgetAllocation createPaymentBudgetAllocation();

	/**
	 * Returns a new object of class '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content</em>'.
	 * @generated
	 */
	PaymentContent createPaymentContent();

	/**
	 * Returns a new object of class '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Type</em>'.
	 * @generated
	 */
	PaymentContentType createPaymentContentType();

	/**
	 * Returns a new object of class '<em>Gateway Authorize Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Authorize Net</em>'.
	 * @generated
	 */
	PaymentGatewayAuthorizeNet createPaymentGatewayAuthorizeNet();

	/**
	 * Returns a new object of class '<em>Gateway Clear Commerce</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Clear Commerce</em>'.
	 * @generated
	 */
	PaymentGatewayClearCommerce createPaymentGatewayClearCommerce();

	/**
	 * Returns a new object of class '<em>Gateway Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Config</em>'.
	 * @generated
	 */
	PaymentGatewayConfig createPaymentGatewayConfig();

	/**
	 * Returns a new object of class '<em>Gateway Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Config Type</em>'.
	 * @generated
	 */
	PaymentGatewayConfigType createPaymentGatewayConfigType();

	/**
	 * Returns a new object of class '<em>Gateway Cyber Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Cyber Source</em>'.
	 * @generated
	 */
	PaymentGatewayCyberSource createPaymentGatewayCyberSource();

	/**
	 * Returns a new object of class '<em>Gateway Eway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Eway</em>'.
	 * @generated
	 */
	PaymentGatewayEway createPaymentGatewayEway();

	/**
	 * Returns a new object of class '<em>Gateway Orbital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Orbital</em>'.
	 * @generated
	 */
	PaymentGatewayOrbital createPaymentGatewayOrbital();

	/**
	 * Returns a new object of class '<em>Gateway Pay Pal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Pay Pal</em>'.
	 * @generated
	 */
	PaymentGatewayPayPal createPaymentGatewayPayPal();

	/**
	 * Returns a new object of class '<em>Gateway Payflow Pro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Payflow Pro</em>'.
	 * @generated
	 */
	PaymentGatewayPayflowPro createPaymentGatewayPayflowPro();

	/**
	 * Returns a new object of class '<em>Gateway Resp Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Resp Msg</em>'.
	 * @generated
	 */
	PaymentGatewayRespMsg createPaymentGatewayRespMsg();

	/**
	 * Returns a new object of class '<em>Gateway Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Response</em>'.
	 * @generated
	 */
	PaymentGatewayResponse createPaymentGatewayResponse();

	/**
	 * Returns a new object of class '<em>Gateway Sage Pay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Sage Pay</em>'.
	 * @generated
	 */
	PaymentGatewaySagePay createPaymentGatewaySagePay();

	/**
	 * Returns a new object of class '<em>Gateway Secure Pay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway Secure Pay</em>'.
	 * @generated
	 */
	PaymentGatewaySecurePay createPaymentGatewaySecurePay();

	/**
	 * Returns a new object of class '<em>Gateway World Pay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway World Pay</em>'.
	 * @generated
	 */
	PaymentGatewayWorldPay createPaymentGatewayWorldPay();

	/**
	 * Returns a new object of class '<em>Gl Account Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Type Map</em>'.
	 * @generated
	 */
	PaymentGlAccountTypeMap createPaymentGlAccountTypeMap();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	PaymentGroup createPaymentGroup();

	/**
	 * Returns a new object of class '<em>Group Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Member</em>'.
	 * @generated
	 */
	PaymentGroupMember createPaymentGroupMember();

	/**
	 * Returns a new object of class '<em>Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Type</em>'.
	 * @generated
	 */
	PaymentGroupType createPaymentGroupType();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	PaymentMethod createPaymentMethod();

	/**
	 * Returns a new object of class '<em>Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Type</em>'.
	 * @generated
	 */
	PaymentMethodType createPaymentMethodType();

	/**
	 * Returns a new object of class '<em>Method Type Gl Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Type Gl Account</em>'.
	 * @generated
	 */
	PaymentMethodTypeGlAccount createPaymentMethodTypeGlAccount();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	PaymentType createPaymentType();

	/**
	 * Returns a new object of class '<em>Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Attr</em>'.
	 * @generated
	 */
	PaymentTypeAttr createPaymentTypeAttr();

	/**
	 * Returns a new object of class '<em>Value Link Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Link Key</em>'.
	 * @generated
	 */
	ValueLinkKey createValueLinkKey();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PaymentPackage getPaymentPackage();

} //PaymentFactory
