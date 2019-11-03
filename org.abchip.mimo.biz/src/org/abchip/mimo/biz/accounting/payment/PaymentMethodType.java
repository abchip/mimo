/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getDefaultGlAccountId <em>Default Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getPaymentMethodTypeGlAccounts <em>Payment Method Type Gl Accounts</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentMethodType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PaymentMethodType extends BizEntityType<PaymentMethod> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentMethodType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Default Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Gl Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Gl Account Id</em>' attribute.
	 * @see #setDefaultGlAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentMethodType_DefaultGlAccountId()
	 * @model annotation="mimo-ent-domain frame='GlAccount'"
	 * @generated
	 */
	String getDefaultGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getDefaultGlAccountId <em>Default Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Gl Account Id</em>' attribute.
	 * @see #getDefaultGlAccountId()
	 * @generated
	 */
	void setDefaultGlAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type Id</em>' attribute.
	 * @see #setPaymentMethodTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentMethodType_PaymentMethodTypeId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPaymentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getPaymentMethodTypeId <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type Id</em>' attribute.
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 */
	void setPaymentMethodTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type Gl Accounts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Type Gl Accounts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type Gl Accounts</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentMethodType_PaymentMethodTypeGlAccounts()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentMethodTypeGlAccount'"
	 * @generated
	 */
	List<String> getPaymentMethodTypeGlAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderPaymentPreference' route='paymentMethodTypeId'"
	 * @generated
	 */
	List<String> orderPaymentPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentGatewayResponse' route='paymentMethodTypeId'"
	 * @generated
	 */
	List<String> paymentGatewayResponses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentMethod' route='paymentMethodTypeId'"
	 * @generated
	 */
	List<String> paymentMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Payment' route='paymentMethodTypeId'"
	 * @generated
	 */
	List<String> payments();

} // PaymentMethodType
