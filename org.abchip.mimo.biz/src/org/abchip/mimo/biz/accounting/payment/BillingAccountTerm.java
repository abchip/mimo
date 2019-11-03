/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.math.BigDecimal;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billing Account Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountTermId <em>Billing Account Term Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermDays <em>Term Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermTypeId <em>Term Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermValue <em>Term Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountTermAttrs <em>Billing Account Term Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getBillingAccountTerm()
 * @model
 * @generated
 */
public interface BillingAccountTerm extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Days</em>' attribute.
	 * @see #setTermDays(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getBillingAccountTerm_TermDays()
	 * @model
	 * @generated
	 */
	long getTermDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermDays <em>Term Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Days</em>' attribute.
	 * @see #getTermDays()
	 * @generated
	 */
	void setTermDays(long value);

	/**
	 * Returns the value of the '<em><b>Term Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Type Id</em>' attribute.
	 * @see #setTermTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getBillingAccountTerm_TermTypeId()
	 * @model annotation="mimo-ent-domain frame='TermType'"
	 * @generated
	 */
	String getTermTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermTypeId <em>Term Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Type Id</em>' attribute.
	 * @see #getTermTypeId()
	 * @generated
	 */
	void setTermTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Value</em>' attribute.
	 * @see #setTermValue(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getBillingAccountTerm_TermValue()
	 * @model
	 * @generated
	 */
	BigDecimal getTermValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermValue <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Value</em>' attribute.
	 * @see #getTermValue()
	 * @generated
	 */
	void setTermValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' attribute.
	 * @see #setUomId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getBillingAccountTerm_UomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

	/**
	 * Returns the value of the '<em><b>Billing Account Term Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Term Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Term Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getBillingAccountTerm_BillingAccountTermAttrs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BillingAccountTermAttr'"
	 * @generated
	 */
	List<String> getBillingAccountTermAttrs();

	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' attribute.
	 * @see #setBillingAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getBillingAccountTerm_BillingAccountId()
	 * @model annotation="mimo-ent-domain frame='BillingAccount'"
	 * @generated
	 */
	String getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountId <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' attribute.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Billing Account Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Term Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Term Id</em>' attribute.
	 * @see #setBillingAccountTermId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getBillingAccountTerm_BillingAccountTermId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getBillingAccountTermId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountTermId <em>Billing Account Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Term Id</em>' attribute.
	 * @see #getBillingAccountTermId()
	 * @generated
	 */
	void setBillingAccountTermId(String value);

} // BillingAccountTerm
