/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage
 * @generated
 */
public interface LedgerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LedgerFactory eINSTANCE = org.abchip.mimo.biz.accounting.ledger.impl.LedgerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Acctg Trans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acctg Trans</em>'.
	 * @generated
	 */
	AcctgTrans createAcctgTrans();

	/**
	 * Returns a new object of class '<em>Acctg Trans Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acctg Trans Attribute</em>'.
	 * @generated
	 */
	AcctgTransAttribute createAcctgTransAttribute();

	/**
	 * Returns a new object of class '<em>Acctg Trans Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acctg Trans Entry</em>'.
	 * @generated
	 */
	AcctgTransEntry createAcctgTransEntry();

	/**
	 * Returns a new object of class '<em>Acctg Trans Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acctg Trans Entry Type</em>'.
	 * @generated
	 */
	AcctgTransEntryType createAcctgTransEntryType();

	/**
	 * Returns a new object of class '<em>Acctg Trans Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acctg Trans Type</em>'.
	 * @generated
	 */
	AcctgTransType createAcctgTransType();

	/**
	 * Returns a new object of class '<em>Acctg Trans Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acctg Trans Type Attr</em>'.
	 * @generated
	 */
	AcctgTransTypeAttr createAcctgTransTypeAttr();

	/**
	 * Returns a new object of class '<em>Gl Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account</em>'.
	 * @generated
	 */
	GlAccount createGlAccount();

	/**
	 * Returns a new object of class '<em>Gl Account Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Category</em>'.
	 * @generated
	 */
	GlAccountCategory createGlAccountCategory();

	/**
	 * Returns a new object of class '<em>Gl Account Category Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Category Member</em>'.
	 * @generated
	 */
	GlAccountCategoryMember createGlAccountCategoryMember();

	/**
	 * Returns a new object of class '<em>Gl Account Category Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Category Type</em>'.
	 * @generated
	 */
	GlAccountCategoryType createGlAccountCategoryType();

	/**
	 * Returns a new object of class '<em>Gl Account Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Class</em>'.
	 * @generated
	 */
	GlAccountClass createGlAccountClass();

	/**
	 * Returns a new object of class '<em>Gl Account Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Group</em>'.
	 * @generated
	 */
	GlAccountGroup createGlAccountGroup();

	/**
	 * Returns a new object of class '<em>Gl Account Group Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Group Member</em>'.
	 * @generated
	 */
	GlAccountGroupMember createGlAccountGroupMember();

	/**
	 * Returns a new object of class '<em>Gl Account Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Group Type</em>'.
	 * @generated
	 */
	GlAccountGroupType createGlAccountGroupType();

	/**
	 * Returns a new object of class '<em>Gl Account History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account History</em>'.
	 * @generated
	 */
	GlAccountHistory createGlAccountHistory();

	/**
	 * Returns a new object of class '<em>Gl Account Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Organization</em>'.
	 * @generated
	 */
	GlAccountOrganization createGlAccountOrganization();

	/**
	 * Returns a new object of class '<em>Gl Account Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Role</em>'.
	 * @generated
	 */
	GlAccountRole createGlAccountRole();

	/**
	 * Returns a new object of class '<em>Gl Account Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Type</em>'.
	 * @generated
	 */
	GlAccountType createGlAccountType();

	/**
	 * Returns a new object of class '<em>Gl Account Type Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Account Type Default</em>'.
	 * @generated
	 */
	GlAccountTypeDefault createGlAccountTypeDefault();

	/**
	 * Returns a new object of class '<em>Gl Budget Xref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Budget Xref</em>'.
	 * @generated
	 */
	GlBudgetXref createGlBudgetXref();

	/**
	 * Returns a new object of class '<em>Gl Fiscal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Fiscal Type</em>'.
	 * @generated
	 */
	GlFiscalType createGlFiscalType();

	/**
	 * Returns a new object of class '<em>Gl Journal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Journal</em>'.
	 * @generated
	 */
	GlJournal createGlJournal();

	/**
	 * Returns a new object of class '<em>Gl Reconciliation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Reconciliation</em>'.
	 * @generated
	 */
	GlReconciliation createGlReconciliation();

	/**
	 * Returns a new object of class '<em>Gl Reconciliation Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Reconciliation Entry</em>'.
	 * @generated
	 */
	GlReconciliationEntry createGlReconciliationEntry();

	/**
	 * Returns a new object of class '<em>Gl Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Resource Type</em>'.
	 * @generated
	 */
	GlResourceType createGlResourceType();

	/**
	 * Returns a new object of class '<em>Gl Xbrl Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gl Xbrl Class</em>'.
	 * @generated
	 */
	GlXbrlClass createGlXbrlClass();

	/**
	 * Returns a new object of class '<em>Party Acctg Preference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Acctg Preference</em>'.
	 * @generated
	 */
	PartyAcctgPreference createPartyAcctgPreference();

	/**
	 * Returns a new object of class '<em>Party Gl Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Gl Account</em>'.
	 * @generated
	 */
	PartyGlAccount createPartyGlAccount();

	/**
	 * Returns a new object of class '<em>Party Pref Doc Type Tpl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Pref Doc Type Tpl</em>'.
	 * @generated
	 */
	PartyPrefDocTypeTpl createPartyPrefDocTypeTpl();

	/**
	 * Returns a new object of class '<em>Product Average Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Average Cost</em>'.
	 * @generated
	 */
	ProductAverageCost createProductAverageCost();

	/**
	 * Returns a new object of class '<em>Product Average Cost Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Average Cost Type</em>'.
	 * @generated
	 */
	ProductAverageCostType createProductAverageCostType();

	/**
	 * Returns a new object of class '<em>Settlement Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settlement Term</em>'.
	 * @generated
	 */
	SettlementTerm createSettlementTerm();

	/**
	 * Returns a new object of class '<em>Variance Reason Gl Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variance Reason Gl Account</em>'.
	 * @generated
	 */
	VarianceReasonGlAccount createVarianceReasonGlAccount();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LedgerPackage getLedgerPackage();

} //LedgerFactory
