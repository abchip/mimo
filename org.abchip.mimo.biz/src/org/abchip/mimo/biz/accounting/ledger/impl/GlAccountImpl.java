/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.Collection;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
	 * The default value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountId = GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAccountCode() <em>Account Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAccountCode() <em>Account Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountCode()
	 * @generated
	 * @ordered
	 */
	protected String accountCode = ACCOUNT_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAccountName() <em>Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAccountName() <em>Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountName()
	 * @generated
	 * @ordered
	 */
	protected String accountName = ACCOUNT_NAME_EDEFAULT;
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
	 * The default value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected String externalId = EXTERNAL_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGlAccountTypeId() <em>Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountType glAccountTypeId;
	/**
	 * The cached value of the '{@link #getGlAccountClassId() <em>Gl Account Class Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountClassId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountClass glAccountClassId;
	/**
	 * The cached value of the '{@link #getGlResourceTypeId() <em>Gl Resource Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlResourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlResourceType glResourceTypeId;
	/**
	 * The cached value of the '{@link #getGlXbrlClassId() <em>Gl Xbrl Class Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlXbrlClassId()
	 * @generated
	 * @ordered
	 */
	protected GlXbrlClass glXbrlClassId;
	/**
	 * The cached value of the '{@link #getParentGlAccountId() <em>Parent Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount parentGlAccountId;

	/**
	 * The cached value of the '{@link #getGlAccountGroupMembers() <em>Gl Account Group Members</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountGroupMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> glAccountGroupMembers;
	/**
	 * The cached value of the '{@link #getGlAccountOrganizations() <em>Gl Account Organizations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> glAccountOrganizations;

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
		return accountCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountCode(String newAccountCode) {
		accountCode = newAccountCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountName() {
		return accountName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountName(String newAccountName) {
		accountName = newAccountName;
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
	public String getExternalId() {
		return externalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		externalId = newExternalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		productId = newProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getGlAccountGroupMembers() {
		if (glAccountGroupMembers == null) {
			glAccountGroupMembers = new BasicInternalEList<String>(String.class);
		}
		return glAccountGroupMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getGlAccountOrganizations() {
		if (glAccountOrganizations == null) {
			glAccountOrganizations = new BasicInternalEList<String>(String.class);
		}
		return glAccountOrganizations;
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
	public GlAccountType getGlAccountTypeId() {
		if (glAccountTypeId != null && ((EObject)glAccountTypeId).eIsProxy()) {
			InternalEObject oldGlAccountTypeId = (InternalEObject)glAccountTypeId;
			glAccountTypeId = (GlAccountType)eResolveProxy(oldGlAccountTypeId);
			if (glAccountTypeId != oldGlAccountTypeId) {
			}
		}
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountType basicGetGlAccountTypeId() {
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountTypeId(GlAccountType newGlAccountTypeId) {
		glAccountTypeId = newGlAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountClass getGlAccountClassId() {
		if (glAccountClassId != null && ((EObject)glAccountClassId).eIsProxy()) {
			InternalEObject oldGlAccountClassId = (InternalEObject)glAccountClassId;
			glAccountClassId = (GlAccountClass)eResolveProxy(oldGlAccountClassId);
			if (glAccountClassId != oldGlAccountClassId) {
			}
		}
		return glAccountClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountClass basicGetGlAccountClassId() {
		return glAccountClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountClassId(GlAccountClass newGlAccountClassId) {
		glAccountClassId = newGlAccountClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlResourceType getGlResourceTypeId() {
		if (glResourceTypeId != null && ((EObject)glResourceTypeId).eIsProxy()) {
			InternalEObject oldGlResourceTypeId = (InternalEObject)glResourceTypeId;
			glResourceTypeId = (GlResourceType)eResolveProxy(oldGlResourceTypeId);
			if (glResourceTypeId != oldGlResourceTypeId) {
			}
		}
		return glResourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlResourceType basicGetGlResourceTypeId() {
		return glResourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlResourceTypeId(GlResourceType newGlResourceTypeId) {
		glResourceTypeId = newGlResourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlXbrlClass getGlXbrlClassId() {
		if (glXbrlClassId != null && ((EObject)glXbrlClassId).eIsProxy()) {
			InternalEObject oldGlXbrlClassId = (InternalEObject)glXbrlClassId;
			glXbrlClassId = (GlXbrlClass)eResolveProxy(oldGlXbrlClassId);
			if (glXbrlClassId != oldGlXbrlClassId) {
			}
		}
		return glXbrlClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlXbrlClass basicGetGlXbrlClassId() {
		return glXbrlClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlXbrlClassId(GlXbrlClass newGlXbrlClassId) {
		glXbrlClassId = newGlXbrlClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getParentGlAccountId() {
		if (parentGlAccountId != null && ((EObject)parentGlAccountId).eIsProxy()) {
			InternalEObject oldParentGlAccountId = (InternalEObject)parentGlAccountId;
			parentGlAccountId = (GlAccount)eResolveProxy(oldParentGlAccountId);
			if (parentGlAccountId != oldParentGlAccountId) {
			}
		}
		return parentGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetParentGlAccountId() {
		return parentGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentGlAccountId(GlAccount newParentGlAccountId) {
		parentGlAccountId = newParentGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(String newGlAccountId) {
		glAccountId = newGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ID:
				return getGlAccountId();
			case LedgerPackage.GL_ACCOUNT__ACCOUNT_CODE:
				return getAccountCode();
			case LedgerPackage.GL_ACCOUNT__ACCOUNT_NAME:
				return getAccountName();
			case LedgerPackage.GL_ACCOUNT__DESCRIPTION:
				return getDescription();
			case LedgerPackage.GL_ACCOUNT__EXTERNAL_ID:
				return getExternalId();
			case LedgerPackage.GL_ACCOUNT__PRODUCT_ID:
				return getProductId();
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				if (resolve) return getGlAccountTypeId();
				return basicGetGlAccountTypeId();
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID:
				if (resolve) return getGlAccountClassId();
				return basicGetGlAccountClassId();
			case LedgerPackage.GL_ACCOUNT__GL_RESOURCE_TYPE_ID:
				if (resolve) return getGlResourceTypeId();
				return basicGetGlResourceTypeId();
			case LedgerPackage.GL_ACCOUNT__GL_XBRL_CLASS_ID:
				if (resolve) return getGlXbrlClassId();
				return basicGetGlXbrlClassId();
			case LedgerPackage.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID:
				if (resolve) return getParentGlAccountId();
				return basicGetParentGlAccountId();
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS:
				return getGlAccountGroupMembers();
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS:
				return getGlAccountOrganizations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ID:
				setGlAccountId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__ACCOUNT_CODE:
				setAccountCode((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__ACCOUNT_NAME:
				setAccountName((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__EXTERNAL_ID:
				setExternalId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((GlAccountType)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID:
				setGlAccountClassId((GlAccountClass)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_RESOURCE_TYPE_ID:
				setGlResourceTypeId((GlResourceType)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_XBRL_CLASS_ID:
				setGlXbrlClassId((GlXbrlClass)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID:
				setParentGlAccountId((GlAccount)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS:
				getGlAccountGroupMembers().clear();
				getGlAccountGroupMembers().addAll((Collection<? extends String>)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS:
				getGlAccountOrganizations().clear();
				getGlAccountOrganizations().addAll((Collection<? extends String>)newValue);
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
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ID:
				setGlAccountId(GL_ACCOUNT_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__ACCOUNT_CODE:
				setAccountCode(ACCOUNT_CODE_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__ACCOUNT_NAME:
				setAccountName(ACCOUNT_NAME_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__EXTERNAL_ID:
				setExternalId(EXTERNAL_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((GlAccountType)null);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID:
				setGlAccountClassId((GlAccountClass)null);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_RESOURCE_TYPE_ID:
				setGlResourceTypeId((GlResourceType)null);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_XBRL_CLASS_ID:
				setGlXbrlClassId((GlXbrlClass)null);
				return;
			case LedgerPackage.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID:
				setParentGlAccountId((GlAccount)null);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS:
				getGlAccountGroupMembers().clear();
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS:
				getGlAccountOrganizations().clear();
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
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ID:
				return GL_ACCOUNT_ID_EDEFAULT == null ? glAccountId != null : !GL_ACCOUNT_ID_EDEFAULT.equals(glAccountId);
			case LedgerPackage.GL_ACCOUNT__ACCOUNT_CODE:
				return ACCOUNT_CODE_EDEFAULT == null ? accountCode != null : !ACCOUNT_CODE_EDEFAULT.equals(accountCode);
			case LedgerPackage.GL_ACCOUNT__ACCOUNT_NAME:
				return ACCOUNT_NAME_EDEFAULT == null ? accountName != null : !ACCOUNT_NAME_EDEFAULT.equals(accountName);
			case LedgerPackage.GL_ACCOUNT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LedgerPackage.GL_ACCOUNT__EXTERNAL_ID:
				return EXTERNAL_ID_EDEFAULT == null ? externalId != null : !EXTERNAL_ID_EDEFAULT.equals(externalId);
			case LedgerPackage.GL_ACCOUNT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				return glAccountTypeId != null;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID:
				return glAccountClassId != null;
			case LedgerPackage.GL_ACCOUNT__GL_RESOURCE_TYPE_ID:
				return glResourceTypeId != null;
			case LedgerPackage.GL_ACCOUNT__GL_XBRL_CLASS_ID:
				return glXbrlClassId != null;
			case LedgerPackage.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID:
				return parentGlAccountId != null;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS:
				return glAccountGroupMembers != null && !glAccountGroupMembers.isEmpty();
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS:
				return glAccountOrganizations != null && !glAccountOrganizations.isEmpty();
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
		result.append(" (glAccountId: ");
		result.append(glAccountId);
		result.append(", accountCode: ");
		result.append(accountCode);
		result.append(", accountName: ");
		result.append(accountName);
		result.append(", description: ");
		result.append(description);
		result.append(", externalId: ");
		result.append(externalId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", glAccountGroupMembers: ");
		result.append(glAccountGroupMembers);
		result.append(", glAccountOrganizations: ");
		result.append(glAccountOrganizations);
		result.append(')');
		return result.toString();
	}

} //GlAccountImpl
