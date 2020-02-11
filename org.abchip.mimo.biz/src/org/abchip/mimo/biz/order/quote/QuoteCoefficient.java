/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote Coefficient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient#getCoeffName <em>Coeff Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient#getCoeffValue <em>Coeff Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteCoefficient()
 * @model
 * @generated
 */
public interface QuoteCoefficient extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Coeff Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coeff Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coeff Name</em>' attribute.
	 * @see #setCoeffName(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteCoefficient_CoeffName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCoeffName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient#getCoeffName <em>Coeff Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coeff Name</em>' attribute.
	 * @see #getCoeffName()
	 * @generated
	 */
	void setCoeffName(String value);

	/**
	 * Returns the value of the '<em><b>Coeff Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coeff Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coeff Value</em>' attribute.
	 * @see #setCoeffValue(BigDecimal)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteCoefficient_CoeffValue()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getCoeffValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient#getCoeffValue <em>Coeff Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coeff Value</em>' attribute.
	 * @see #getCoeffValue()
	 * @generated
	 */
	void setCoeffValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Id</em>' reference.
	 * @see #setQuoteId(Quote)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteCoefficient_QuoteId()
	 * @model keys="quoteId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Quote getQuoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient#getQuoteId <em>Quote Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id</em>' reference.
	 * @see #getQuoteId()
	 * @generated
	 */
	void setQuoteId(Quote value);

} // QuoteCoefficient
