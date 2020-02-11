/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import org.abchip.mimo.biz.party.agreement.*;
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
public class AgreementFactoryImpl extends EFactoryImpl implements AgreementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgreementFactory init() {
		try {
			AgreementFactory theAgreementFactory = (AgreementFactory)EPackage.Registry.INSTANCE.getEFactory(AgreementPackage.eNS_URI);
			if (theAgreementFactory != null) {
				return theAgreementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AgreementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementFactoryImpl() {
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
			case AgreementPackage.ADDENDUM: return (EObject)createAddendum();
			case AgreementPackage.AGREEMENT: return (EObject)createAgreement();
			case AgreementPackage.AGREEMENT_ATTRIBUTE: return (EObject)createAgreementAttribute();
			case AgreementPackage.AGREEMENT_CONTENT: return (EObject)createAgreementContent();
			case AgreementPackage.AGREEMENT_CONTENT_TYPE: return (EObject)createAgreementContentType();
			case AgreementPackage.AGREEMENT_EMPLOYMENT_APPL: return (EObject)createAgreementEmploymentAppl();
			case AgreementPackage.AGREEMENT_FACILITY_APPL: return (EObject)createAgreementFacilityAppl();
			case AgreementPackage.AGREEMENT_GEOGRAPHICAL_APPLIC: return (EObject)createAgreementGeographicalApplic();
			case AgreementPackage.AGREEMENT_ITEM: return (EObject)createAgreementItem();
			case AgreementPackage.AGREEMENT_ITEM_ATTRIBUTE: return (EObject)createAgreementItemAttribute();
			case AgreementPackage.AGREEMENT_ITEM_TYPE: return (EObject)createAgreementItemType();
			case AgreementPackage.AGREEMENT_ITEM_TYPE_ATTR: return (EObject)createAgreementItemTypeAttr();
			case AgreementPackage.AGREEMENT_PARTY_APPLIC: return (EObject)createAgreementPartyApplic();
			case AgreementPackage.AGREEMENT_PRODUCT_APPL: return (EObject)createAgreementProductAppl();
			case AgreementPackage.AGREEMENT_PROMO_APPL: return (EObject)createAgreementPromoAppl();
			case AgreementPackage.AGREEMENT_ROLE: return (EObject)createAgreementRole();
			case AgreementPackage.AGREEMENT_TERM: return (EObject)createAgreementTerm();
			case AgreementPackage.AGREEMENT_TERM_ATTRIBUTE: return (EObject)createAgreementTermAttribute();
			case AgreementPackage.AGREEMENT_TYPE: return (EObject)createAgreementType();
			case AgreementPackage.AGREEMENT_TYPE_ATTR: return (EObject)createAgreementTypeAttr();
			case AgreementPackage.AGREEMENT_WORK_EFFORT_APPLIC: return (EObject)createAgreementWorkEffortApplic();
			case AgreementPackage.TERM_TYPE: return (EObject)createTermType();
			case AgreementPackage.TERM_TYPE_ATTR: return (EObject)createTermTypeAttr();
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
	public Addendum createAddendum() {
		AddendumImpl addendum = new AddendumImpl();
		return addendum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agreement createAgreement() {
		AgreementImpl agreement = new AgreementImpl();
		return agreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementAttribute createAgreementAttribute() {
		AgreementAttributeImpl agreementAttribute = new AgreementAttributeImpl();
		return agreementAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementContent createAgreementContent() {
		AgreementContentImpl agreementContent = new AgreementContentImpl();
		return agreementContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementContentType createAgreementContentType() {
		AgreementContentTypeImpl agreementContentType = new AgreementContentTypeImpl();
		return agreementContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementEmploymentAppl createAgreementEmploymentAppl() {
		AgreementEmploymentApplImpl agreementEmploymentAppl = new AgreementEmploymentApplImpl();
		return agreementEmploymentAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementFacilityAppl createAgreementFacilityAppl() {
		AgreementFacilityApplImpl agreementFacilityAppl = new AgreementFacilityApplImpl();
		return agreementFacilityAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementGeographicalApplic createAgreementGeographicalApplic() {
		AgreementGeographicalApplicImpl agreementGeographicalApplic = new AgreementGeographicalApplicImpl();
		return agreementGeographicalApplic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementItem createAgreementItem() {
		AgreementItemImpl agreementItem = new AgreementItemImpl();
		return agreementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementItemAttribute createAgreementItemAttribute() {
		AgreementItemAttributeImpl agreementItemAttribute = new AgreementItemAttributeImpl();
		return agreementItemAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementItemType createAgreementItemType() {
		AgreementItemTypeImpl agreementItemType = new AgreementItemTypeImpl();
		return agreementItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementItemTypeAttr createAgreementItemTypeAttr() {
		AgreementItemTypeAttrImpl agreementItemTypeAttr = new AgreementItemTypeAttrImpl();
		return agreementItemTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementPartyApplic createAgreementPartyApplic() {
		AgreementPartyApplicImpl agreementPartyApplic = new AgreementPartyApplicImpl();
		return agreementPartyApplic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementProductAppl createAgreementProductAppl() {
		AgreementProductApplImpl agreementProductAppl = new AgreementProductApplImpl();
		return agreementProductAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementPromoAppl createAgreementPromoAppl() {
		AgreementPromoApplImpl agreementPromoAppl = new AgreementPromoApplImpl();
		return agreementPromoAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementRole createAgreementRole() {
		AgreementRoleImpl agreementRole = new AgreementRoleImpl();
		return agreementRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementTerm createAgreementTerm() {
		AgreementTermImpl agreementTerm = new AgreementTermImpl();
		return agreementTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementTermAttribute createAgreementTermAttribute() {
		AgreementTermAttributeImpl agreementTermAttribute = new AgreementTermAttributeImpl();
		return agreementTermAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementType createAgreementType() {
		AgreementTypeImpl agreementType = new AgreementTypeImpl();
		return agreementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementTypeAttr createAgreementTypeAttr() {
		AgreementTypeAttrImpl agreementTypeAttr = new AgreementTypeAttrImpl();
		return agreementTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementWorkEffortApplic createAgreementWorkEffortApplic() {
		AgreementWorkEffortApplicImpl agreementWorkEffortApplic = new AgreementWorkEffortApplicImpl();
		return agreementWorkEffortApplic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermType createTermType() {
		TermTypeImpl termType = new TermTypeImpl();
		return termType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermTypeAttr createTermTypeAttr() {
		TermTypeAttrImpl termTypeAttr = new TermTypeAttrImpl();
		return termTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementPackage getAgreementPackage() {
		return (AgreementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AgreementPackage getPackage() {
		return AgreementPackage.eINSTANCE;
	}

} //AgreementFactoryImpl
