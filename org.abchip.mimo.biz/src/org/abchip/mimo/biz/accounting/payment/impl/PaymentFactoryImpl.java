/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentFactoryImpl extends EFactoryImpl implements PaymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaymentFactory init() {
		try {
			PaymentFactory thePaymentFactory = (PaymentFactory)EPackage.Registry.INSTANCE.getEFactory(PaymentPackage.eNS_URI);
			if (thePaymentFactory != null) {
				return thePaymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PaymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PaymentPackage.BILLING_ACCOUNT: return (EObject)createBillingAccount();
			case PaymentPackage.BILLING_ACCOUNT_ROLE: return (EObject)createBillingAccountRole();
			case PaymentPackage.BILLING_ACCOUNT_TERM: return (EObject)createBillingAccountTerm();
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR: return (EObject)createBillingAccountTermAttr();
			case PaymentPackage.CHECK_ACCOUNT: return (EObject)createCheckAccount();
			case PaymentPackage.CREDIT_CARD: return (EObject)createCreditCard();
			case PaymentPackage.CREDIT_CARD_TYPE_GL_ACCOUNT: return (EObject)createCreditCardTypeGlAccount();
			case PaymentPackage.DEDUCTION: return (EObject)createDeduction();
			case PaymentPackage.DEDUCTION_TYPE: return (EObject)createDeductionType();
			case PaymentPackage.EFT_ACCOUNT: return (EObject)createEftAccount();
			case PaymentPackage.GIFT_CARD: return (EObject)createGiftCard();
			case PaymentPackage.GIFT_CARD_FULFILLMENT: return (EObject)createGiftCardFulfillment();
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD: return (EObject)createPayPalPaymentMethod();
			case PaymentPackage.PAYMENT: return (EObject)createPayment();
			case PaymentPackage.PAYMENT_APPLICATION: return (EObject)createPaymentApplication();
			case PaymentPackage.PAYMENT_ATTRIBUTE: return (EObject)createPaymentAttribute();
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION: return (EObject)createPaymentBudgetAllocation();
			case PaymentPackage.PAYMENT_CONTENT: return (EObject)createPaymentContent();
			case PaymentPackage.PAYMENT_CONTENT_TYPE: return (EObject)createPaymentContentType();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET: return (EObject)createPaymentGatewayAuthorizeNet();
			case PaymentPackage.PAYMENT_GATEWAY_CLEAR_COMMERCE: return (EObject)createPaymentGatewayClearCommerce();
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG: return (EObject)createPaymentGatewayConfig();
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG_TYPE: return (EObject)createPaymentGatewayConfigType();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE: return (EObject)createPaymentGatewayCyberSource();
			case PaymentPackage.PAYMENT_GATEWAY_EWAY: return (EObject)createPaymentGatewayEway();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL: return (EObject)createPaymentGatewayOrbital();
			case PaymentPackage.PAYMENT_GATEWAY_PAY_PAL: return (EObject)createPaymentGatewayPayPal();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO: return (EObject)createPaymentGatewayPayflowPro();
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG: return (EObject)createPaymentGatewayRespMsg();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE: return (EObject)createPaymentGatewayResponse();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY: return (EObject)createPaymentGatewaySagePay();
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY: return (EObject)createPaymentGatewaySecurePay();
			case PaymentPackage.PAYMENT_GATEWAY_WORLD_PAY: return (EObject)createPaymentGatewayWorldPay();
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP: return (EObject)createPaymentGlAccountTypeMap();
			case PaymentPackage.PAYMENT_GROUP: return (EObject)createPaymentGroup();
			case PaymentPackage.PAYMENT_GROUP_MEMBER: return (EObject)createPaymentGroupMember();
			case PaymentPackage.PAYMENT_GROUP_TYPE: return (EObject)createPaymentGroupType();
			case PaymentPackage.PAYMENT_METHOD: return (EObject)createPaymentMethod();
			case PaymentPackage.PAYMENT_METHOD_TYPE: return (EObject)createPaymentMethodType();
			case PaymentPackage.PAYMENT_METHOD_TYPE_GL_ACCOUNT: return (EObject)createPaymentMethodTypeGlAccount();
			case PaymentPackage.PAYMENT_TYPE: return (EObject)createPaymentType();
			case PaymentPackage.PAYMENT_TYPE_ATTR: return (EObject)createPaymentTypeAttr();
			case PaymentPackage.VALUE_LINK_KEY: return (EObject)createValueLinkKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingAccount createBillingAccount() {
		BillingAccountImpl billingAccount = new BillingAccountImpl();
		return billingAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingAccountRole createBillingAccountRole() {
		BillingAccountRoleImpl billingAccountRole = new BillingAccountRoleImpl();
		return billingAccountRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingAccountTerm createBillingAccountTerm() {
		BillingAccountTermImpl billingAccountTerm = new BillingAccountTermImpl();
		return billingAccountTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingAccountTermAttr createBillingAccountTermAttr() {
		BillingAccountTermAttrImpl billingAccountTermAttr = new BillingAccountTermAttrImpl();
		return billingAccountTermAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckAccount createCheckAccount() {
		CheckAccountImpl checkAccount = new CheckAccountImpl();
		return checkAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreditCard createCreditCard() {
		CreditCardImpl creditCard = new CreditCardImpl();
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreditCardTypeGlAccount createCreditCardTypeGlAccount() {
		CreditCardTypeGlAccountImpl creditCardTypeGlAccount = new CreditCardTypeGlAccountImpl();
		return creditCardTypeGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deduction createDeduction() {
		DeductionImpl deduction = new DeductionImpl();
		return deduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeductionType createDeductionType() {
		DeductionTypeImpl deductionType = new DeductionTypeImpl();
		return deductionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EftAccount createEftAccount() {
		EftAccountImpl eftAccount = new EftAccountImpl();
		return eftAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GiftCard createGiftCard() {
		GiftCardImpl giftCard = new GiftCardImpl();
		return giftCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GiftCardFulfillment createGiftCardFulfillment() {
		GiftCardFulfillmentImpl giftCardFulfillment = new GiftCardFulfillmentImpl();
		return giftCardFulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayPalPaymentMethod createPayPalPaymentMethod() {
		PayPalPaymentMethodImpl payPalPaymentMethod = new PayPalPaymentMethodImpl();
		return payPalPaymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentApplication createPaymentApplication() {
		PaymentApplicationImpl paymentApplication = new PaymentApplicationImpl();
		return paymentApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentAttribute createPaymentAttribute() {
		PaymentAttributeImpl paymentAttribute = new PaymentAttributeImpl();
		return paymentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentBudgetAllocation createPaymentBudgetAllocation() {
		PaymentBudgetAllocationImpl paymentBudgetAllocation = new PaymentBudgetAllocationImpl();
		return paymentBudgetAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentContent createPaymentContent() {
		PaymentContentImpl paymentContent = new PaymentContentImpl();
		return paymentContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentContentType createPaymentContentType() {
		PaymentContentTypeImpl paymentContentType = new PaymentContentTypeImpl();
		return paymentContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayAuthorizeNet createPaymentGatewayAuthorizeNet() {
		PaymentGatewayAuthorizeNetImpl paymentGatewayAuthorizeNet = new PaymentGatewayAuthorizeNetImpl();
		return paymentGatewayAuthorizeNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayClearCommerce createPaymentGatewayClearCommerce() {
		PaymentGatewayClearCommerceImpl paymentGatewayClearCommerce = new PaymentGatewayClearCommerceImpl();
		return paymentGatewayClearCommerce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayConfig createPaymentGatewayConfig() {
		PaymentGatewayConfigImpl paymentGatewayConfig = new PaymentGatewayConfigImpl();
		return paymentGatewayConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayConfigType createPaymentGatewayConfigType() {
		PaymentGatewayConfigTypeImpl paymentGatewayConfigType = new PaymentGatewayConfigTypeImpl();
		return paymentGatewayConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayCyberSource createPaymentGatewayCyberSource() {
		PaymentGatewayCyberSourceImpl paymentGatewayCyberSource = new PaymentGatewayCyberSourceImpl();
		return paymentGatewayCyberSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayEway createPaymentGatewayEway() {
		PaymentGatewayEwayImpl paymentGatewayEway = new PaymentGatewayEwayImpl();
		return paymentGatewayEway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayOrbital createPaymentGatewayOrbital() {
		PaymentGatewayOrbitalImpl paymentGatewayOrbital = new PaymentGatewayOrbitalImpl();
		return paymentGatewayOrbital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayPayPal createPaymentGatewayPayPal() {
		PaymentGatewayPayPalImpl paymentGatewayPayPal = new PaymentGatewayPayPalImpl();
		return paymentGatewayPayPal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayPayflowPro createPaymentGatewayPayflowPro() {
		PaymentGatewayPayflowProImpl paymentGatewayPayflowPro = new PaymentGatewayPayflowProImpl();
		return paymentGatewayPayflowPro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayRespMsg createPaymentGatewayRespMsg() {
		PaymentGatewayRespMsgImpl paymentGatewayRespMsg = new PaymentGatewayRespMsgImpl();
		return paymentGatewayRespMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayResponse createPaymentGatewayResponse() {
		PaymentGatewayResponseImpl paymentGatewayResponse = new PaymentGatewayResponseImpl();
		return paymentGatewayResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewaySagePay createPaymentGatewaySagePay() {
		PaymentGatewaySagePayImpl paymentGatewaySagePay = new PaymentGatewaySagePayImpl();
		return paymentGatewaySagePay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewaySecurePay createPaymentGatewaySecurePay() {
		PaymentGatewaySecurePayImpl paymentGatewaySecurePay = new PaymentGatewaySecurePayImpl();
		return paymentGatewaySecurePay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayWorldPay createPaymentGatewayWorldPay() {
		PaymentGatewayWorldPayImpl paymentGatewayWorldPay = new PaymentGatewayWorldPayImpl();
		return paymentGatewayWorldPay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGlAccountTypeMap createPaymentGlAccountTypeMap() {
		PaymentGlAccountTypeMapImpl paymentGlAccountTypeMap = new PaymentGlAccountTypeMapImpl();
		return paymentGlAccountTypeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGroup createPaymentGroup() {
		PaymentGroupImpl paymentGroup = new PaymentGroupImpl();
		return paymentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGroupMember createPaymentGroupMember() {
		PaymentGroupMemberImpl paymentGroupMember = new PaymentGroupMemberImpl();
		return paymentGroupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGroupType createPaymentGroupType() {
		PaymentGroupTypeImpl paymentGroupType = new PaymentGroupTypeImpl();
		return paymentGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod createPaymentMethod() {
		PaymentMethodImpl paymentMethod = new PaymentMethodImpl();
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType createPaymentMethodType() {
		PaymentMethodTypeImpl paymentMethodType = new PaymentMethodTypeImpl();
		return paymentMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodTypeGlAccount createPaymentMethodTypeGlAccount() {
		PaymentMethodTypeGlAccountImpl paymentMethodTypeGlAccount = new PaymentMethodTypeGlAccountImpl();
		return paymentMethodTypeGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentType createPaymentType() {
		PaymentTypeImpl paymentType = new PaymentTypeImpl();
		return paymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentTypeAttr createPaymentTypeAttr() {
		PaymentTypeAttrImpl paymentTypeAttr = new PaymentTypeAttrImpl();
		return paymentTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueLinkKey createValueLinkKey() {
		ValueLinkKeyImpl valueLinkKey = new ValueLinkKeyImpl();
		return valueLinkKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentPackage getPaymentPackage() {
		return (PaymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PaymentPackage getPackage() {
		return PaymentPackage.eINSTANCE;
	}

} //PaymentFactoryImpl
