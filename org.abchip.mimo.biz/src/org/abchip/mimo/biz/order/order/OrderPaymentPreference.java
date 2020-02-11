/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.product.price.ProductPricePurpose;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Payment Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getBillingPostalCode <em>Billing Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getManualAuthCode <em>Manual Auth Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getManualRefNum <em>Manual Ref Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getMaxAmount <em>Max Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#isNeedsNsfRetry <em>Needs Nsf Retry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#isOverflowFlag <em>Overflow Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#isPresentFlag <em>Present Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getProcessAttempt <em>Process Attempt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getSecurityCode <em>Security Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#isSwipedFlag <em>Swiped Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getTrack2 <em>Track2</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference()
 * @model annotation="mimo-ent-frame title='The Order Payment Preference'"
 * @generated
 */
public interface OrderPaymentPreference extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Billing Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Postal Code</em>' attribute.
	 * @see #setBillingPostalCode(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_BillingPostalCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getBillingPostalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getBillingPostalCode <em>Billing Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Postal Code</em>' attribute.
	 * @see #getBillingPostalCode()
	 * @generated
	 */
	void setBillingPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_FinAccountId()
	 * @model keys="finAccountId"
	 *        annotation="mimo-ent-slot help='For paying with a fin account instead of payment method on file'"
	 * @generated
	 */
	FinAccount getFinAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getFinAccountId <em>Fin Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Id</em>' reference.
	 * @see #getFinAccountId()
	 * @generated
	 */
	void setFinAccountId(FinAccount value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Manual Auth Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Auth Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Auth Code</em>' attribute.
	 * @see #setManualAuthCode(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_ManualAuthCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getManualAuthCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getManualAuthCode <em>Manual Auth Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Auth Code</em>' attribute.
	 * @see #getManualAuthCode()
	 * @generated
	 */
	void setManualAuthCode(String value);

	/**
	 * Returns the value of the '<em><b>Manual Ref Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Ref Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Ref Num</em>' attribute.
	 * @see #setManualRefNum(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_ManualRefNum()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getManualRefNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getManualRefNum <em>Manual Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Ref Num</em>' attribute.
	 * @see #getManualRefNum()
	 * @generated
	 */
	void setManualRefNum(String value);

	/**
	 * Returns the value of the '<em><b>Max Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Amount</em>' attribute.
	 * @see #setMaxAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_MaxAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getMaxAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getMaxAmount <em>Max Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Amount</em>' attribute.
	 * @see #getMaxAmount()
	 * @generated
	 */
	void setMaxAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Needs Nsf Retry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Nsf Retry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Nsf Retry</em>' attribute.
	 * @see #setNeedsNsfRetry(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_NeedsNsfRetry()
	 * @model
	 * @generated
	 */
	boolean isNeedsNsfRetry();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#isNeedsNsfRetry <em>Needs Nsf Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Nsf Retry</em>' attribute.
	 * @see #isNeedsNsfRetry()
	 * @generated
	 */
	void setNeedsNsfRetry(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' reference.
	 * @see #setOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_OrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getOrderId <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' reference.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Overflow Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overflow Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overflow Flag</em>' attribute.
	 * @see #setOverflowFlag(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_OverflowFlag()
	 * @model
	 * @generated
	 */
	boolean isOverflowFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#isOverflowFlag <em>Overflow Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overflow Flag</em>' attribute.
	 * @see #isOverflowFlag()
	 * @generated
	 */
	void setOverflowFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Payment Preference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Payment Preference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Payment Preference Id</em>' attribute.
	 * @see #setOrderPaymentPreferenceId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_OrderPaymentPreferenceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderPaymentPreferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Payment Preference Id</em>' attribute.
	 * @see #getOrderPaymentPreferenceId()
	 * @generated
	 */
	void setOrderPaymentPreferenceId(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_PaymentMethodId()
	 * @model keys="paymentMethodId"
	 * @generated
	 */
	PaymentMethod getPaymentMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getPaymentMethodId <em>Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Id</em>' reference.
	 * @see #getPaymentMethodId()
	 * @generated
	 */
	void setPaymentMethodId(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type Id</em>' reference.
	 * @see #setPaymentMethodTypeId(PaymentMethodType)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_PaymentMethodTypeId()
	 * @model keys="paymentMethodTypeId"
	 * @generated
	 */
	PaymentMethodType getPaymentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getPaymentMethodTypeId <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type Id</em>' reference.
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 */
	void setPaymentMethodTypeId(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Present Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Present Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Present Flag</em>' attribute.
	 * @see #setPresentFlag(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_PresentFlag()
	 * @model
	 * @generated
	 */
	boolean isPresentFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#isPresentFlag <em>Present Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Present Flag</em>' attribute.
	 * @see #isPresentFlag()
	 * @generated
	 */
	void setPresentFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Process Attempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Attempt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Attempt</em>' attribute.
	 * @see #setProcessAttempt(long)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_ProcessAttempt()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getProcessAttempt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getProcessAttempt <em>Process Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Attempt</em>' attribute.
	 * @see #getProcessAttempt()
	 * @generated
	 */
	void setProcessAttempt(long value);

	/**
	 * Returns the value of the '<em><b>Product Price Purpose Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Purpose Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Purpose Id</em>' reference.
	 * @see #setProductPricePurposeId(ProductPricePurpose)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_ProductPricePurposeId()
	 * @model keys="productPricePurposeId"
	 * @generated
	 */
	ProductPricePurpose getProductPricePurposeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getProductPricePurposeId <em>Product Price Purpose Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Purpose Id</em>' reference.
	 * @see #getProductPricePurposeId()
	 * @generated
	 */
	void setProductPricePurposeId(ProductPricePurpose value);

	/**
	 * Returns the value of the '<em><b>Security Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Code</em>' attribute.
	 * @see #setSecurityCode(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_SecurityCode()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='NOTE: THIS SHOULD NEVER BE PERSISTED OUTSIDE THE SCOPE OF A SINGLE TRANSACTION,\n              TYPICALLY ONLY FOR AUTHORIZATION PURPOSES, SHOULD BE REMOVED IMMEDIATELY FOLLOWING USE;\n              this is the 3 digit on back (for Visa, MC, etc) or 4 digit on front (Amex, etc) card\n              verification code; also note that this field is longer than needed to accommodate encryption.'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSecurityCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getSecurityCode <em>Security Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Code</em>' attribute.
	 * @see #getSecurityCode()
	 * @generated
	 */
	void setSecurityCode(String value);

	/**
	 * Returns the value of the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #setShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_ShipGroupSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Swiped Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swiped Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swiped Flag</em>' attribute.
	 * @see #setSwipedFlag(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_SwipedFlag()
	 * @model
	 * @generated
	 */
	boolean isSwipedFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#isSwipedFlag <em>Swiped Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swiped Flag</em>' attribute.
	 * @see #isSwipedFlag()
	 * @generated
	 */
	void setSwipedFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Track2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track2</em>' attribute.
	 * @see #setTrack2(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderPaymentPreference_Track2()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='NOTE: THIS SHOULD NEVER BE PERSISTED OUTSIDE THE SCOPE OF A SINGLE TRANSACTION,\n              TYPICALLY ONLY FOR AUTHORIZATION PURPOSES, SHOULD BE REMOVED IMMEDIATELY FOLLOWING USE;\n              this is raw track2 data, exactly as read by the magnetic swipe reader;\n              also note that this field is longer than needed to accommodate encryption.'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTrack2();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderPaymentPreference#getTrack2 <em>Track2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track2</em>' attribute.
	 * @see #getTrack2()
	 * @generated
	 */
	void setTrack2(String value);

} // OrderPaymentPreference
