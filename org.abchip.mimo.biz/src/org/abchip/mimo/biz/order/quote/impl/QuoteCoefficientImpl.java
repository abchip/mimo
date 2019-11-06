/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.quote.Quote;
import org.abchip.mimo.biz.order.quote.QuoteCoefficient;
import org.abchip.mimo.biz.order.quote.QuotePackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quote Coefficient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteCoefficientImpl#getCoeffName <em>Coeff Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteCoefficientImpl#getCoeffValue <em>Coeff Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteCoefficientImpl#getQuoteId <em>Quote Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuoteCoefficientImpl extends BizEntityImpl implements QuoteCoefficient {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCoeffName() <em>Coeff Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeffName()
	 * @generated
	 * @ordered
	 */
	protected static final String COEFF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoeffName() <em>Coeff Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeffName()
	 * @generated
	 * @ordered
	 */
	protected String coeffName = COEFF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoeffValue() <em>Coeff Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeffValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COEFF_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoeffValue() <em>Coeff Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoeffValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal coeffValue = COEFF_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuoteId() <em>Quote Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteId()
	 * @generated
	 * @ordered
	 */
	protected Quote quoteId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuoteCoefficientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuotePackage.Literals.QUOTE_COEFFICIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCoeffName() {
		return coeffName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoeffName(String newCoeffName) {
		coeffName = newCoeffName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCoeffValue() {
		return coeffValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoeffValue(BigDecimal newCoeffValue) {
		coeffValue = newCoeffValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quote getQuoteId() {
		if (quoteId != null && ((EObject)quoteId).eIsProxy()) {
			InternalEObject oldQuoteId = (InternalEObject)quoteId;
			quoteId = (Quote)eResolveProxy(oldQuoteId);
			if (quoteId != oldQuoteId) {
			}
		}
		return quoteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quote basicGetQuoteId() {
		return quoteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteId(Quote newQuoteId) {
		quoteId = newQuoteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuotePackage.QUOTE_COEFFICIENT__COEFF_NAME:
				return getCoeffName();
			case QuotePackage.QUOTE_COEFFICIENT__COEFF_VALUE:
				return getCoeffValue();
			case QuotePackage.QUOTE_COEFFICIENT__QUOTE_ID:
				if (resolve) return getQuoteId();
				return basicGetQuoteId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuotePackage.QUOTE_COEFFICIENT__COEFF_NAME:
				setCoeffName((String)newValue);
				return;
			case QuotePackage.QUOTE_COEFFICIENT__COEFF_VALUE:
				setCoeffValue((BigDecimal)newValue);
				return;
			case QuotePackage.QUOTE_COEFFICIENT__QUOTE_ID:
				setQuoteId((Quote)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QuotePackage.QUOTE_COEFFICIENT__COEFF_NAME:
				setCoeffName(COEFF_NAME_EDEFAULT);
				return;
			case QuotePackage.QUOTE_COEFFICIENT__COEFF_VALUE:
				setCoeffValue(COEFF_VALUE_EDEFAULT);
				return;
			case QuotePackage.QUOTE_COEFFICIENT__QUOTE_ID:
				setQuoteId((Quote)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QuotePackage.QUOTE_COEFFICIENT__COEFF_NAME:
				return COEFF_NAME_EDEFAULT == null ? coeffName != null : !COEFF_NAME_EDEFAULT.equals(coeffName);
			case QuotePackage.QUOTE_COEFFICIENT__COEFF_VALUE:
				return COEFF_VALUE_EDEFAULT == null ? coeffValue != null : !COEFF_VALUE_EDEFAULT.equals(coeffValue);
			case QuotePackage.QUOTE_COEFFICIENT__QUOTE_ID:
				return quoteId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (coeffName: ");
		result.append(coeffName);
		result.append(", coeffValue: ");
		result.append(coeffValue);
		result.append(')');
		return result.toString();
	}

} //QuoteCoefficientImpl
