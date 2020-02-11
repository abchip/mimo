/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote.impl;

import org.abchip.mimo.biz.order.quote.*;
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
public class QuoteFactoryImpl extends EFactoryImpl implements QuoteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuoteFactory init() {
		try {
			QuoteFactory theQuoteFactory = (QuoteFactory)EPackage.Registry.INSTANCE.getEFactory(QuotePackage.eNS_URI);
			if (theQuoteFactory != null) {
				return theQuoteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuoteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuoteFactoryImpl() {
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
			case QuotePackage.QUOTE: return (EObject)createQuote();
			case QuotePackage.QUOTE_ADJUSTMENT: return (EObject)createQuoteAdjustment();
			case QuotePackage.QUOTE_ATTRIBUTE: return (EObject)createQuoteAttribute();
			case QuotePackage.QUOTE_COEFFICIENT: return (EObject)createQuoteCoefficient();
			case QuotePackage.QUOTE_ITEM: return (EObject)createQuoteItem();
			case QuotePackage.QUOTE_NOTE: return (EObject)createQuoteNote();
			case QuotePackage.QUOTE_ROLE: return (EObject)createQuoteRole();
			case QuotePackage.QUOTE_TERM: return (EObject)createQuoteTerm();
			case QuotePackage.QUOTE_TERM_ATTRIBUTE: return (EObject)createQuoteTermAttribute();
			case QuotePackage.QUOTE_TYPE: return (EObject)createQuoteType();
			case QuotePackage.QUOTE_TYPE_ATTR: return (EObject)createQuoteTypeAttr();
			case QuotePackage.QUOTE_WORK_EFFORT: return (EObject)createQuoteWorkEffort();
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
	public Quote createQuote() {
		QuoteImpl quote = new QuoteImpl();
		return quote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteAdjustment createQuoteAdjustment() {
		QuoteAdjustmentImpl quoteAdjustment = new QuoteAdjustmentImpl();
		return quoteAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteAttribute createQuoteAttribute() {
		QuoteAttributeImpl quoteAttribute = new QuoteAttributeImpl();
		return quoteAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteCoefficient createQuoteCoefficient() {
		QuoteCoefficientImpl quoteCoefficient = new QuoteCoefficientImpl();
		return quoteCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteItem createQuoteItem() {
		QuoteItemImpl quoteItem = new QuoteItemImpl();
		return quoteItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteNote createQuoteNote() {
		QuoteNoteImpl quoteNote = new QuoteNoteImpl();
		return quoteNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteRole createQuoteRole() {
		QuoteRoleImpl quoteRole = new QuoteRoleImpl();
		return quoteRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteTerm createQuoteTerm() {
		QuoteTermImpl quoteTerm = new QuoteTermImpl();
		return quoteTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteTermAttribute createQuoteTermAttribute() {
		QuoteTermAttributeImpl quoteTermAttribute = new QuoteTermAttributeImpl();
		return quoteTermAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteType createQuoteType() {
		QuoteTypeImpl quoteType = new QuoteTypeImpl();
		return quoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteTypeAttr createQuoteTypeAttr() {
		QuoteTypeAttrImpl quoteTypeAttr = new QuoteTypeAttrImpl();
		return quoteTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuoteWorkEffort createQuoteWorkEffort() {
		QuoteWorkEffortImpl quoteWorkEffort = new QuoteWorkEffortImpl();
		return quoteWorkEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuotePackage getQuotePackage() {
		return (QuotePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuotePackage getPackage() {
		return QuotePackage.eINSTANCE;
	}

} //QuoteFactoryImpl
