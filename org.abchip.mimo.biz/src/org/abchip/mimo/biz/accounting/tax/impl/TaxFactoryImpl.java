/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax.impl;

import org.abchip.mimo.biz.accounting.tax.*;
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
public class TaxFactoryImpl extends EFactoryImpl implements TaxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaxFactory init() {
		try {
			TaxFactory theTaxFactory = (TaxFactory)EPackage.Registry.INSTANCE.getEFactory(TaxPackage.eNS_URI);
			if (theTaxFactory != null) {
				return theTaxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxFactoryImpl() {
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
			case TaxPackage.PARTY_TAX_AUTH_INFO: return (EObject)createPartyTaxAuthInfo();
			case TaxPackage.TAX_AUTHORITY: return (EObject)createTaxAuthority();
			case TaxPackage.TAX_AUTHORITY_ASSOC: return (EObject)createTaxAuthorityAssoc();
			case TaxPackage.TAX_AUTHORITY_ASSOC_TYPE: return (EObject)createTaxAuthorityAssocType();
			case TaxPackage.TAX_AUTHORITY_CATEGORY: return (EObject)createTaxAuthorityCategory();
			case TaxPackage.TAX_AUTHORITY_GL_ACCOUNT: return (EObject)createTaxAuthorityGlAccount();
			case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT: return (EObject)createTaxAuthorityRateProduct();
			case TaxPackage.TAX_AUTHORITY_RATE_TYPE: return (EObject)createTaxAuthorityRateType();
			case TaxPackage.ZIP_SALES_RULE_LOOKUP: return (EObject)createZipSalesRuleLookup();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP: return (EObject)createZipSalesTaxLookup();
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
	public PartyTaxAuthInfo createPartyTaxAuthInfo() {
		PartyTaxAuthInfoImpl partyTaxAuthInfo = new PartyTaxAuthInfoImpl();
		return partyTaxAuthInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthority createTaxAuthority() {
		TaxAuthorityImpl taxAuthority = new TaxAuthorityImpl();
		return taxAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthorityAssoc createTaxAuthorityAssoc() {
		TaxAuthorityAssocImpl taxAuthorityAssoc = new TaxAuthorityAssocImpl();
		return taxAuthorityAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthorityAssocType createTaxAuthorityAssocType() {
		TaxAuthorityAssocTypeImpl taxAuthorityAssocType = new TaxAuthorityAssocTypeImpl();
		return taxAuthorityAssocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthorityCategory createTaxAuthorityCategory() {
		TaxAuthorityCategoryImpl taxAuthorityCategory = new TaxAuthorityCategoryImpl();
		return taxAuthorityCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthorityGlAccount createTaxAuthorityGlAccount() {
		TaxAuthorityGlAccountImpl taxAuthorityGlAccount = new TaxAuthorityGlAccountImpl();
		return taxAuthorityGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthorityRateProduct createTaxAuthorityRateProduct() {
		TaxAuthorityRateProductImpl taxAuthorityRateProduct = new TaxAuthorityRateProductImpl();
		return taxAuthorityRateProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthorityRateType createTaxAuthorityRateType() {
		TaxAuthorityRateTypeImpl taxAuthorityRateType = new TaxAuthorityRateTypeImpl();
		return taxAuthorityRateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipSalesRuleLookup createZipSalesRuleLookup() {
		ZipSalesRuleLookupImpl zipSalesRuleLookup = new ZipSalesRuleLookupImpl();
		return zipSalesRuleLookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZipSalesTaxLookup createZipSalesTaxLookup() {
		ZipSalesTaxLookupImpl zipSalesTaxLookup = new ZipSalesTaxLookupImpl();
		return zipSalesTaxLookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxPackage getTaxPackage() {
		return (TaxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaxPackage getPackage() {
		return TaxPackage.eINSTANCE;
	}

} //TaxFactoryImpl
