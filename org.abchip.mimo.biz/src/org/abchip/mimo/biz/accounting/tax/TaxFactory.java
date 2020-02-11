/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage
 * @generated
 */
public interface TaxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaxFactory eINSTANCE = org.abchip.mimo.biz.accounting.tax.impl.TaxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Party Tax Auth Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Tax Auth Info</em>'.
	 * @generated
	 */
	PartyTaxAuthInfo createPartyTaxAuthInfo();

	/**
	 * Returns a new object of class '<em>Authority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authority</em>'.
	 * @generated
	 */
	TaxAuthority createTaxAuthority();

	/**
	 * Returns a new object of class '<em>Authority Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authority Assoc</em>'.
	 * @generated
	 */
	TaxAuthorityAssoc createTaxAuthorityAssoc();

	/**
	 * Returns a new object of class '<em>Authority Assoc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authority Assoc Type</em>'.
	 * @generated
	 */
	TaxAuthorityAssocType createTaxAuthorityAssocType();

	/**
	 * Returns a new object of class '<em>Authority Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authority Category</em>'.
	 * @generated
	 */
	TaxAuthorityCategory createTaxAuthorityCategory();

	/**
	 * Returns a new object of class '<em>Authority Gl Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authority Gl Account</em>'.
	 * @generated
	 */
	TaxAuthorityGlAccount createTaxAuthorityGlAccount();

	/**
	 * Returns a new object of class '<em>Authority Rate Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authority Rate Product</em>'.
	 * @generated
	 */
	TaxAuthorityRateProduct createTaxAuthorityRateProduct();

	/**
	 * Returns a new object of class '<em>Authority Rate Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authority Rate Type</em>'.
	 * @generated
	 */
	TaxAuthorityRateType createTaxAuthorityRateType();

	/**
	 * Returns a new object of class '<em>Zip Sales Rule Lookup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zip Sales Rule Lookup</em>'.
	 * @generated
	 */
	ZipSalesRuleLookup createZipSalesRuleLookup();

	/**
	 * Returns a new object of class '<em>Zip Sales Tax Lookup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zip Sales Tax Lookup</em>'.
	 * @generated
	 */
	ZipSalesTaxLookup createZipSalesTaxLookup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaxPackage getTaxPackage();

} //TaxFactory
