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
 * A representation of the model object '<em><b>Payment Gateway Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getPaymentGatewayConfigTypeId <em>Payment Gateway Config Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayConfigType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PaymentGatewayConfigType extends BizEntityType<PaymentGatewayConfig> {
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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayConfigType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayConfigType_HasTable()
	 * @model annotation="mimo-ent-format type='indicator' length='1'"
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(PaymentGatewayConfigType)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayConfigType_ParentTypeId()
	 * @model keys="paymentGatewayConfigTypeId"
	 * @generated
	 */
	PaymentGatewayConfigType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(PaymentGatewayConfigType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentGatewayConfigType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childPaymentGatewayConfigTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentGatewayConfig' route='paymentGatewayConfigTypeId'"
	 * @generated
	 */
	List<String> paymentGatewayConfigs();

	/**
	 * Returns the value of the '<em><b>Payment Gateway Config Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Gateway Config Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Config Type Id</em>' attribute.
	 * @see #setPaymentGatewayConfigTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayConfigType_PaymentGatewayConfigTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPaymentGatewayConfigTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getPaymentGatewayConfigTypeId <em>Payment Gateway Config Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Type Id</em>' attribute.
	 * @see #getPaymentGatewayConfigTypeId()
	 * @generated
	 */
	void setPaymentGatewayConfigTypeId(String value);

} // PaymentGatewayConfigType
