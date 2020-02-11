/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import org.abchip.mimo.biz.accounting.ledger.*;
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
public class LedgerFactoryImpl extends EFactoryImpl implements LedgerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LedgerFactory init() {
		try {
			LedgerFactory theLedgerFactory = (LedgerFactory)EPackage.Registry.INSTANCE.getEFactory(LedgerPackage.eNS_URI);
			if (theLedgerFactory != null) {
				return theLedgerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LedgerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LedgerFactoryImpl() {
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
			case LedgerPackage.ACCTG_TRANS: return (EObject)createAcctgTrans();
			case LedgerPackage.ACCTG_TRANS_ATTRIBUTE: return (EObject)createAcctgTransAttribute();
			case LedgerPackage.ACCTG_TRANS_ENTRY: return (EObject)createAcctgTransEntry();
			case LedgerPackage.ACCTG_TRANS_ENTRY_TYPE: return (EObject)createAcctgTransEntryType();
			case LedgerPackage.ACCTG_TRANS_TYPE: return (EObject)createAcctgTransType();
			case LedgerPackage.ACCTG_TRANS_TYPE_ATTR: return (EObject)createAcctgTransTypeAttr();
			case LedgerPackage.GL_ACCOUNT: return (EObject)createGlAccount();
			case LedgerPackage.GL_ACCOUNT_CATEGORY: return (EObject)createGlAccountCategory();
			case LedgerPackage.GL_ACCOUNT_CATEGORY_MEMBER: return (EObject)createGlAccountCategoryMember();
			case LedgerPackage.GL_ACCOUNT_CATEGORY_TYPE: return (EObject)createGlAccountCategoryType();
			case LedgerPackage.GL_ACCOUNT_CLASS: return (EObject)createGlAccountClass();
			case LedgerPackage.GL_ACCOUNT_GROUP: return (EObject)createGlAccountGroup();
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER: return (EObject)createGlAccountGroupMember();
			case LedgerPackage.GL_ACCOUNT_GROUP_TYPE: return (EObject)createGlAccountGroupType();
			case LedgerPackage.GL_ACCOUNT_HISTORY: return (EObject)createGlAccountHistory();
			case LedgerPackage.GL_ACCOUNT_ORGANIZATION: return (EObject)createGlAccountOrganization();
			case LedgerPackage.GL_ACCOUNT_ROLE: return (EObject)createGlAccountRole();
			case LedgerPackage.GL_ACCOUNT_TYPE: return (EObject)createGlAccountType();
			case LedgerPackage.GL_ACCOUNT_TYPE_DEFAULT: return (EObject)createGlAccountTypeDefault();
			case LedgerPackage.GL_BUDGET_XREF: return (EObject)createGlBudgetXref();
			case LedgerPackage.GL_FISCAL_TYPE: return (EObject)createGlFiscalType();
			case LedgerPackage.GL_JOURNAL: return (EObject)createGlJournal();
			case LedgerPackage.GL_RECONCILIATION: return (EObject)createGlReconciliation();
			case LedgerPackage.GL_RECONCILIATION_ENTRY: return (EObject)createGlReconciliationEntry();
			case LedgerPackage.GL_RESOURCE_TYPE: return (EObject)createGlResourceType();
			case LedgerPackage.GL_XBRL_CLASS: return (EObject)createGlXbrlClass();
			case LedgerPackage.PARTY_ACCTG_PREFERENCE: return (EObject)createPartyAcctgPreference();
			case LedgerPackage.PARTY_GL_ACCOUNT: return (EObject)createPartyGlAccount();
			case LedgerPackage.PARTY_PREF_DOC_TYPE_TPL: return (EObject)createPartyPrefDocTypeTpl();
			case LedgerPackage.PRODUCT_AVERAGE_COST: return (EObject)createProductAverageCost();
			case LedgerPackage.PRODUCT_AVERAGE_COST_TYPE: return (EObject)createProductAverageCostType();
			case LedgerPackage.SETTLEMENT_TERM: return (EObject)createSettlementTerm();
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT: return (EObject)createVarianceReasonGlAccount();
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
	public AcctgTrans createAcctgTrans() {
		AcctgTransImpl acctgTrans = new AcctgTransImpl();
		return acctgTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTransAttribute createAcctgTransAttribute() {
		AcctgTransAttributeImpl acctgTransAttribute = new AcctgTransAttributeImpl();
		return acctgTransAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTransEntry createAcctgTransEntry() {
		AcctgTransEntryImpl acctgTransEntry = new AcctgTransEntryImpl();
		return acctgTransEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTransEntryType createAcctgTransEntryType() {
		AcctgTransEntryTypeImpl acctgTransEntryType = new AcctgTransEntryTypeImpl();
		return acctgTransEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTransType createAcctgTransType() {
		AcctgTransTypeImpl acctgTransType = new AcctgTransTypeImpl();
		return acctgTransType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTransTypeAttr createAcctgTransTypeAttr() {
		AcctgTransTypeAttrImpl acctgTransTypeAttr = new AcctgTransTypeAttrImpl();
		return acctgTransTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount createGlAccount() {
		GlAccountImpl glAccount = new GlAccountImpl();
		return glAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountCategory createGlAccountCategory() {
		GlAccountCategoryImpl glAccountCategory = new GlAccountCategoryImpl();
		return glAccountCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountCategoryMember createGlAccountCategoryMember() {
		GlAccountCategoryMemberImpl glAccountCategoryMember = new GlAccountCategoryMemberImpl();
		return glAccountCategoryMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountCategoryType createGlAccountCategoryType() {
		GlAccountCategoryTypeImpl glAccountCategoryType = new GlAccountCategoryTypeImpl();
		return glAccountCategoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountClass createGlAccountClass() {
		GlAccountClassImpl glAccountClass = new GlAccountClassImpl();
		return glAccountClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountGroup createGlAccountGroup() {
		GlAccountGroupImpl glAccountGroup = new GlAccountGroupImpl();
		return glAccountGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountGroupMember createGlAccountGroupMember() {
		GlAccountGroupMemberImpl glAccountGroupMember = new GlAccountGroupMemberImpl();
		return glAccountGroupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountGroupType createGlAccountGroupType() {
		GlAccountGroupTypeImpl glAccountGroupType = new GlAccountGroupTypeImpl();
		return glAccountGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountHistory createGlAccountHistory() {
		GlAccountHistoryImpl glAccountHistory = new GlAccountHistoryImpl();
		return glAccountHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountOrganization createGlAccountOrganization() {
		GlAccountOrganizationImpl glAccountOrganization = new GlAccountOrganizationImpl();
		return glAccountOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountRole createGlAccountRole() {
		GlAccountRoleImpl glAccountRole = new GlAccountRoleImpl();
		return glAccountRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType createGlAccountType() {
		GlAccountTypeImpl glAccountType = new GlAccountTypeImpl();
		return glAccountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountTypeDefault createGlAccountTypeDefault() {
		GlAccountTypeDefaultImpl glAccountTypeDefault = new GlAccountTypeDefaultImpl();
		return glAccountTypeDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlBudgetXref createGlBudgetXref() {
		GlBudgetXrefImpl glBudgetXref = new GlBudgetXrefImpl();
		return glBudgetXref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlFiscalType createGlFiscalType() {
		GlFiscalTypeImpl glFiscalType = new GlFiscalTypeImpl();
		return glFiscalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlJournal createGlJournal() {
		GlJournalImpl glJournal = new GlJournalImpl();
		return glJournal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlReconciliation createGlReconciliation() {
		GlReconciliationImpl glReconciliation = new GlReconciliationImpl();
		return glReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlReconciliationEntry createGlReconciliationEntry() {
		GlReconciliationEntryImpl glReconciliationEntry = new GlReconciliationEntryImpl();
		return glReconciliationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlResourceType createGlResourceType() {
		GlResourceTypeImpl glResourceType = new GlResourceTypeImpl();
		return glResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlXbrlClass createGlXbrlClass() {
		GlXbrlClassImpl glXbrlClass = new GlXbrlClassImpl();
		return glXbrlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyAcctgPreference createPartyAcctgPreference() {
		PartyAcctgPreferenceImpl partyAcctgPreference = new PartyAcctgPreferenceImpl();
		return partyAcctgPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyGlAccount createPartyGlAccount() {
		PartyGlAccountImpl partyGlAccount = new PartyGlAccountImpl();
		return partyGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyPrefDocTypeTpl createPartyPrefDocTypeTpl() {
		PartyPrefDocTypeTplImpl partyPrefDocTypeTpl = new PartyPrefDocTypeTplImpl();
		return partyPrefDocTypeTpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductAverageCost createProductAverageCost() {
		ProductAverageCostImpl productAverageCost = new ProductAverageCostImpl();
		return productAverageCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductAverageCostType createProductAverageCostType() {
		ProductAverageCostTypeImpl productAverageCostType = new ProductAverageCostTypeImpl();
		return productAverageCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SettlementTerm createSettlementTerm() {
		SettlementTermImpl settlementTerm = new SettlementTermImpl();
		return settlementTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarianceReasonGlAccount createVarianceReasonGlAccount() {
		VarianceReasonGlAccountImpl varianceReasonGlAccount = new VarianceReasonGlAccountImpl();
		return varianceReasonGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LedgerPackage getLedgerPackage() {
		return (LedgerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LedgerPackage getPackage() {
		return LedgerPackage.eINSTANCE;
	}

} //LedgerFactoryImpl
