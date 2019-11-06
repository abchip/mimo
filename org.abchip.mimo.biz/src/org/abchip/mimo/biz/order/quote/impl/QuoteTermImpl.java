/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.quote.Quote;
import org.abchip.mimo.biz.order.quote.QuotePackage;
import org.abchip.mimo.biz.order.quote.QuoteTerm;
import org.abchip.mimo.biz.party.agreement.TermType;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quote Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl#getTermDays <em>Term Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl#getTermValue <em>Term Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl#getTextValue <em>Text Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl#getTermTypeId <em>Term Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuoteTermImpl extends BizEntityImpl implements QuoteTerm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getQuoteItemSeqId() <em>Quote Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteItemSeqId() <em>Quote Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String quoteItemSeqId = QUOTE_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTermDays() <em>Term Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDays()
	 * @generated
	 * @ordered
	 */
	protected static final long TERM_DAYS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTermDays() <em>Term Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDays()
	 * @generated
	 * @ordered
	 */
	protected long termDays = TERM_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTermValue() <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermValue()
	 * @generated
	 * @ordered
	 */
	protected static final long TERM_VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTermValue() <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermValue()
	 * @generated
	 * @ordered
	 */
	protected long termValue = TERM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextValue() <em>Text Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextValue() <em>Text Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextValue()
	 * @generated
	 * @ordered
	 */
	protected String textValue = TEXT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected String uomId = UOM_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getTermTypeId() <em>Term Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermTypeId()
	 * @generated
	 * @ordered
	 */
	protected TermType termTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuoteTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuotePackage.Literals.QUOTE_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
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
	public String getQuoteItemSeqId() {
		return quoteItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteItemSeqId(String newQuoteItemSeqId) {
		quoteItemSeqId = newQuoteItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTermDays() {
		return termDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermDays(long newTermDays) {
		termDays = newTermDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermType getTermTypeId() {
		if (termTypeId != null && ((EObject)termTypeId).eIsProxy()) {
			InternalEObject oldTermTypeId = (InternalEObject)termTypeId;
			termTypeId = (TermType)eResolveProxy(oldTermTypeId);
			if (termTypeId != oldTermTypeId) {
			}
		}
		return termTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType basicGetTermTypeId() {
		return termTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermTypeId(TermType newTermTypeId) {
		termTypeId = newTermTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTermValue() {
		return termValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermValue(long newTermValue) {
		termValue = newTermValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextValue() {
		return textValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextValue(String newTextValue) {
		textValue = newTextValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(String newUomId) {
		uomId = newUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuotePackage.QUOTE_TERM__QUOTE_ITEM_SEQ_ID:
				return getQuoteItemSeqId();
			case QuotePackage.QUOTE_TERM__DESCRIPTION:
				return getDescription();
			case QuotePackage.QUOTE_TERM__TERM_DAYS:
				return getTermDays();
			case QuotePackage.QUOTE_TERM__TERM_VALUE:
				return getTermValue();
			case QuotePackage.QUOTE_TERM__TEXT_VALUE:
				return getTextValue();
			case QuotePackage.QUOTE_TERM__UOM_ID:
				return getUomId();
			case QuotePackage.QUOTE_TERM__QUOTE_ID:
				if (resolve) return getQuoteId();
				return basicGetQuoteId();
			case QuotePackage.QUOTE_TERM__TERM_TYPE_ID:
				if (resolve) return getTermTypeId();
				return basicGetTermTypeId();
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
			case QuotePackage.QUOTE_TERM__QUOTE_ITEM_SEQ_ID:
				setQuoteItemSeqId((String)newValue);
				return;
			case QuotePackage.QUOTE_TERM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QuotePackage.QUOTE_TERM__TERM_DAYS:
				setTermDays((Long)newValue);
				return;
			case QuotePackage.QUOTE_TERM__TERM_VALUE:
				setTermValue((Long)newValue);
				return;
			case QuotePackage.QUOTE_TERM__TEXT_VALUE:
				setTextValue((String)newValue);
				return;
			case QuotePackage.QUOTE_TERM__UOM_ID:
				setUomId((String)newValue);
				return;
			case QuotePackage.QUOTE_TERM__QUOTE_ID:
				setQuoteId((Quote)newValue);
				return;
			case QuotePackage.QUOTE_TERM__TERM_TYPE_ID:
				setTermTypeId((TermType)newValue);
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
			case QuotePackage.QUOTE_TERM__QUOTE_ITEM_SEQ_ID:
				setQuoteItemSeqId(QUOTE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TERM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TERM__TERM_DAYS:
				setTermDays(TERM_DAYS_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TERM__TERM_VALUE:
				setTermValue(TERM_VALUE_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TERM__TEXT_VALUE:
				setTextValue(TEXT_VALUE_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TERM__UOM_ID:
				setUomId(UOM_ID_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TERM__QUOTE_ID:
				setQuoteId((Quote)null);
				return;
			case QuotePackage.QUOTE_TERM__TERM_TYPE_ID:
				setTermTypeId((TermType)null);
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
			case QuotePackage.QUOTE_TERM__QUOTE_ITEM_SEQ_ID:
				return QUOTE_ITEM_SEQ_ID_EDEFAULT == null ? quoteItemSeqId != null : !QUOTE_ITEM_SEQ_ID_EDEFAULT.equals(quoteItemSeqId);
			case QuotePackage.QUOTE_TERM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QuotePackage.QUOTE_TERM__TERM_DAYS:
				return termDays != TERM_DAYS_EDEFAULT;
			case QuotePackage.QUOTE_TERM__TERM_VALUE:
				return termValue != TERM_VALUE_EDEFAULT;
			case QuotePackage.QUOTE_TERM__TEXT_VALUE:
				return TEXT_VALUE_EDEFAULT == null ? textValue != null : !TEXT_VALUE_EDEFAULT.equals(textValue);
			case QuotePackage.QUOTE_TERM__UOM_ID:
				return UOM_ID_EDEFAULT == null ? uomId != null : !UOM_ID_EDEFAULT.equals(uomId);
			case QuotePackage.QUOTE_TERM__QUOTE_ID:
				return quoteId != null;
			case QuotePackage.QUOTE_TERM__TERM_TYPE_ID:
				return termTypeId != null;
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
		result.append(" (quoteItemSeqId: ");
		result.append(quoteItemSeqId);
		result.append(", description: ");
		result.append(description);
		result.append(", termDays: ");
		result.append(termDays);
		result.append(", termValue: ");
		result.append(termValue);
		result.append(", textValue: ");
		result.append(textValue);
		result.append(", uomId: ");
		result.append(uomId);
		result.append(')');
		return result.toString();
	}

} //QuoteTermImpl
