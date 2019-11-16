/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccountClass;
import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.accounting.ledger.GlResourceType;
import org.abchip.mimo.biz.accounting.ledger.GlXbrlClass;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getAccountCode <em>Account Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getAccountName <em>Account Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountTypeId <em>Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountClassId <em>Gl Account Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlResourceTypeId <em>Gl Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlXbrlClassId <em>Gl Xbrl Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getParentGlAccountId <em>Parent Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountGroupMembers <em>Gl Account Group Members</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountOrganizations <em>Gl Account Organizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlAccountImpl extends BizEntityTypedImpl<GlAccountType> implements GlAccount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountCode() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountCode(String newAccountCode) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_CODE, newAccountCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountName() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountName(String newAccountName) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_NAME, newAccountName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__EXTERNAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__EXTERNAL_ID, newExternalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getGlAccountGroupMembers() {
		return (List<String>)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getGlAccountOrganizations() {
		return (List<String>)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTransEntries() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childGlAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> defaultInvoiceItemTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> defaultPaymentMethodTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> finAccountTypeGlAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> glAccountTypeDefaults() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> glReconciliations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoiceItemTypeGlAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> overrideInvoiceItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> overrideOrderAdjustments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> overrideOrderItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> overrideQuoteAdjustments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> overrideReturnAdjustments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> paymentApplications() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> paymentMethodTypeGlAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> paymentMethods() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> payments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> postToFinAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> varianceReasonGlAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LedgerPackage.GL_ACCOUNT___ACCTG_TRANS_ENTRIES:
				return acctgTransEntries();
			case LedgerPackage.GL_ACCOUNT___CHILD_GL_ACCOUNTS:
				return childGlAccounts();
			case LedgerPackage.GL_ACCOUNT___DEFAULT_INVOICE_ITEM_TYPES:
				return defaultInvoiceItemTypes();
			case LedgerPackage.GL_ACCOUNT___DEFAULT_PAYMENT_METHOD_TYPES:
				return defaultPaymentMethodTypes();
			case LedgerPackage.GL_ACCOUNT___FIN_ACCOUNT_TYPE_GL_ACCOUNTS:
				return finAccountTypeGlAccounts();
			case LedgerPackage.GL_ACCOUNT___GL_ACCOUNT_TYPE_DEFAULTS:
				return glAccountTypeDefaults();
			case LedgerPackage.GL_ACCOUNT___GL_RECONCILIATIONS:
				return glReconciliations();
			case LedgerPackage.GL_ACCOUNT___INVOICE_ITEM_TYPE_GL_ACCOUNTS:
				return invoiceItemTypeGlAccounts();
			case LedgerPackage.GL_ACCOUNT___OVERRIDE_INVOICE_ITEMS:
				return overrideInvoiceItems();
			case LedgerPackage.GL_ACCOUNT___OVERRIDE_ORDER_ADJUSTMENTS:
				return overrideOrderAdjustments();
			case LedgerPackage.GL_ACCOUNT___OVERRIDE_ORDER_ITEMS:
				return overrideOrderItems();
			case LedgerPackage.GL_ACCOUNT___OVERRIDE_QUOTE_ADJUSTMENTS:
				return overrideQuoteAdjustments();
			case LedgerPackage.GL_ACCOUNT___OVERRIDE_RETURN_ADJUSTMENTS:
				return overrideReturnAdjustments();
			case LedgerPackage.GL_ACCOUNT___PAYMENT_APPLICATIONS:
				return paymentApplications();
			case LedgerPackage.GL_ACCOUNT___PAYMENT_METHOD_TYPE_GL_ACCOUNTS:
				return paymentMethodTypeGlAccounts();
			case LedgerPackage.GL_ACCOUNT___PAYMENT_METHODS:
				return paymentMethods();
			case LedgerPackage.GL_ACCOUNT___PAYMENTS:
				return payments();
			case LedgerPackage.GL_ACCOUNT___POST_TO_FIN_ACCOUNTS:
				return postToFinAccounts();
			case LedgerPackage.GL_ACCOUNT___VARIANCE_REASON_GL_ACCOUNTS:
				return varianceReasonGlAccounts();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getGlAccountTypeId() {
		return (GlAccountType)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountTypeId(GlAccountType newGlAccountTypeId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID, newGlAccountTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountClass getGlAccountClassId() {
		return (GlAccountClass)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountClassId(GlAccountClass newGlAccountClassId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID, newGlAccountClassId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlResourceType getGlResourceTypeId() {
		return (GlResourceType)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_RESOURCE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlResourceTypeId(GlResourceType newGlResourceTypeId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_RESOURCE_TYPE_ID, newGlResourceTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlXbrlClass getGlXbrlClassId() {
		return (GlXbrlClass)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_XBRL_CLASS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlXbrlClassId(GlXbrlClass newGlXbrlClassId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_XBRL_CLASS_ID, newGlXbrlClassId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getParentGlAccountId() {
		return (GlAccount)eGet(LedgerPackage.Literals.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentGlAccountId(GlAccount newParentGlAccountId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID, newParentGlAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(String newGlAccountId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_ID, newGlAccountId);
	}

} //GlAccountImpl
