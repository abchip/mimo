/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Gateway Pay Pal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiEnvironment <em>Api Environment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiPassword <em>Api Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiSignature <em>Api Signature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiUserName <em>Api User Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getBusinessEmail <em>Business Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getCancelReturnUrl <em>Cancel Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getConfirmTemplate <em>Confirm Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getConfirmUrl <em>Confirm Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getNotifyUrl <em>Notify Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#isRequireConfirmedShipping <em>Require Confirmed Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getShippingCallbackUrl <em>Shipping Callback Url</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal()
 * @model annotation="mimo-ent-frame title='PayPal Payment Gateway Config'"
 * @generated
 */
public interface PaymentGatewayPayPal extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Api Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Environment</em>' attribute.
	 * @see #setApiEnvironment(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_ApiEnvironment()
	 * @model annotation="mimo-ent-slot help='PayPal API Environment (valid values are: live, sandbox or beta-sandbox)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getApiEnvironment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiEnvironment <em>Api Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Environment</em>' attribute.
	 * @see #getApiEnvironment()
	 * @generated
	 */
	void setApiEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Api Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Password</em>' attribute.
	 * @see #setApiPassword(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_ApiPassword()
	 * @model annotation="mimo-ent-slot help='PayPal API Password'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getApiPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiPassword <em>Api Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Password</em>' attribute.
	 * @see #getApiPassword()
	 * @generated
	 */
	void setApiPassword(String value);

	/**
	 * Returns the value of the '<em><b>Api Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Signature</em>' attribute.
	 * @see #setApiSignature(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_ApiSignature()
	 * @model annotation="mimo-ent-slot help='PayPal API Signature'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getApiSignature();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiSignature <em>Api Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Signature</em>' attribute.
	 * @see #getApiSignature()
	 * @generated
	 */
	void setApiSignature(String value);

	/**
	 * Returns the value of the '<em><b>Api User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api User Name</em>' attribute.
	 * @see #setApiUserName(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_ApiUserName()
	 * @model annotation="mimo-ent-slot help='PayPal API UserName'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getApiUserName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiUserName <em>Api User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api User Name</em>' attribute.
	 * @see #getApiUserName()
	 * @generated
	 */
	void setApiUserName(String value);

	/**
	 * Returns the value of the '<em><b>Business Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Email</em>' attribute.
	 * @see #setBusinessEmail(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_BusinessEmail()
	 * @model annotation="mimo-ent-slot help='Business e-mail'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getBusinessEmail();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getBusinessEmail <em>Business Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Email</em>' attribute.
	 * @see #getBusinessEmail()
	 * @generated
	 */
	void setBusinessEmail(String value);

	/**
	 * Returns the value of the '<em><b>Cancel Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Return Url</em>' attribute.
	 * @see #setCancelReturnUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_CancelReturnUrl()
	 * @model annotation="mimo-ent-slot help='Return On Cancel URL'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCancelReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getCancelReturnUrl <em>Cancel Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Return Url</em>' attribute.
	 * @see #getCancelReturnUrl()
	 * @generated
	 */
	void setCancelReturnUrl(String value);

	/**
	 * Returns the value of the '<em><b>Confirm Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Template</em>' attribute.
	 * @see #setConfirmTemplate(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_ConfirmTemplate()
	 * @model annotation="mimo-ent-slot help='Thank-You / Confirm Order Template (rendered via Freemarker)'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getConfirmTemplate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getConfirmTemplate <em>Confirm Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Template</em>' attribute.
	 * @see #getConfirmTemplate()
	 * @generated
	 */
	void setConfirmTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Confirm Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Url</em>' attribute.
	 * @see #setConfirmUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_ConfirmUrl()
	 * @model annotation="mimo-ent-slot help='PayPal Confirm URL Sandbox/Production (JSSE must be configured to use SSL)'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getConfirmUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getConfirmUrl <em>Confirm Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Url</em>' attribute.
	 * @see #getConfirmUrl()
	 * @generated
	 */
	void setConfirmUrl(String value);

	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_ImageUrl()
	 * @model annotation="mimo-ent-slot help='Image URL to use on PayPal'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Notify Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notify Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notify Url</em>' attribute.
	 * @see #setNotifyUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_NotifyUrl()
	 * @model annotation="mimo-ent-slot help='Notify URL'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getNotifyUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getNotifyUrl <em>Notify Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify Url</em>' attribute.
	 * @see #getNotifyUrl()
	 * @generated
	 */
	void setNotifyUrl(String value);

	/**
	 * Returns the value of the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Gateway Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #setPaymentGatewayConfigId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_PaymentGatewayConfigId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Redirect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redirect Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirect Url</em>' attribute.
	 * @see #setRedirectUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_RedirectUrl()
	 * @model annotation="mimo-ent-slot help='PayPal Redirect URL (Sandbox/Production)'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getRedirectUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getRedirectUrl <em>Redirect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirect Url</em>' attribute.
	 * @see #getRedirectUrl()
	 * @generated
	 */
	void setRedirectUrl(String value);

	/**
	 * Returns the value of the '<em><b>Require Confirmed Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Confirmed Shipping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Confirmed Shipping</em>' attribute.
	 * @see #setRequireConfirmedShipping(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_RequireConfirmedShipping()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Indicates that you require that the customer\u2019s shipping address on file with PayPal be a confirmed address.'"
	 * @generated
	 */
	boolean isRequireConfirmedShipping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#isRequireConfirmedShipping <em>Require Confirmed Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Confirmed Shipping</em>' attribute.
	 * @see #isRequireConfirmedShipping()
	 * @generated
	 */
	void setRequireConfirmedShipping(boolean value);

	/**
	 * Returns the value of the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Url</em>' attribute.
	 * @see #setReturnUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_ReturnUrl()
	 * @model annotation="mimo-ent-slot help='Return URL'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getReturnUrl <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Url</em>' attribute.
	 * @see #getReturnUrl()
	 * @generated
	 */
	void setReturnUrl(String value);

	/**
	 * Returns the value of the '<em><b>Shipping Callback Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Callback Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Callback Url</em>' attribute.
	 * @see #setShippingCallbackUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayPal_ShippingCallbackUrl()
	 * @model annotation="mimo-ent-slot help='Specific to Express Checkout which performs callbacks to our server to retrieve shipping estimates'"
	 *        annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getShippingCallbackUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getShippingCallbackUrl <em>Shipping Callback Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Callback Url</em>' attribute.
	 * @see #getShippingCallbackUrl()
	 * @generated
	 */
	void setShippingCallbackUrl(String value);

} // PaymentGatewayPayPal
