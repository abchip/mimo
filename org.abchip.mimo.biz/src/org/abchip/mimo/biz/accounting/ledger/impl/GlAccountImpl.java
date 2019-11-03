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
import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountClassId <em>Gl Account Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountTypeId <em>Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlResourceTypeId <em>Gl Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlXbrlClassId <em>Gl Xbrl Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getParentGlAccountId <em>Parent Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getProductId <em>Product Id</em>}</li>
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
	 * The default value of the '{@link #getGlAccountClassId() <em>Gl Account Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountClassId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_CLASS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlAccountClassId() <em>Gl Account Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountClassId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountClassId = GL_ACCOUNT_CLASS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlAccountTypeId() <em>Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlAccountTypeId() <em>Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountTypeId = GL_ACCOUNT_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGlResourceTypeId() <em>Gl Resource Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlResourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_RESOURCE_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlResourceTypeId() <em>Gl Resource Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlResourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String glResourceTypeId = GL_RESOURCE_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGlXbrlClassId() <em>Gl Xbrl Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlXbrlClassId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_XBRL_CLASS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlXbrlClassId() <em>Gl Xbrl Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlXbrlClassId()
	 * @generated
	 * @ordered
	 */
	protected String glXbrlClassId = GL_XBRL_CLASS_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getParentGlAccountId() <em>Parent Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentGlAccountId() <em>Parent Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String parentGlAccountId = PARENT_GL_ACCOUNT_ID_EDEFAULT;
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
		String oldAccountCode = accountCode;
		accountCode = newAccountCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__ACCOUNT_CODE, oldAccountCode, accountCode));
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
		String oldAccountName = accountName;
		accountName = newAccountName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__ACCOUNT_NAME, oldAccountName, accountName));
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__DESCRIPTION, oldDescription, description));
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
		String oldExternalId = externalId;
		externalId = newExternalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__EXTERNAL_ID, oldExternalId, externalId));
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
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getGlAccountGroupMembers() {
		if (glAccountGroupMembers == null) {
			glAccountGroupMembers = new EDataTypeUniqueEList<String>(String.class, this, LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS);
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
			glAccountOrganizations = new EDataTypeUniqueEList<String>(String.class, this, LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS);
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
	public String getGlAccountTypeId() {
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountTypeId(String newGlAccountTypeId) {
		String oldGlAccountTypeId = glAccountTypeId;
		glAccountTypeId = newGlAccountTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID, oldGlAccountTypeId, glAccountTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountClassId() {
		return glAccountClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountClassId(String newGlAccountClassId) {
		String oldGlAccountClassId = glAccountClassId;
		glAccountClassId = newGlAccountClassId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID, oldGlAccountClassId, glAccountClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlResourceTypeId() {
		return glResourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlResourceTypeId(String newGlResourceTypeId) {
		String oldGlResourceTypeId = glResourceTypeId;
		glResourceTypeId = newGlResourceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__GL_RESOURCE_TYPE_ID, oldGlResourceTypeId, glResourceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlXbrlClassId() {
		return glXbrlClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlXbrlClassId(String newGlXbrlClassId) {
		String oldGlXbrlClassId = glXbrlClassId;
		glXbrlClassId = newGlXbrlClassId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__GL_XBRL_CLASS_ID, oldGlXbrlClassId, glXbrlClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentGlAccountId() {
		return parentGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentGlAccountId(String newParentGlAccountId) {
		String oldParentGlAccountId = parentGlAccountId;
		parentGlAccountId = newParentGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID, oldParentGlAccountId, parentGlAccountId));
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
		String oldGlAccountId = glAccountId;
		glAccountId = newGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
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
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID:
				return getGlAccountClassId();
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				return getGlAccountTypeId();
			case LedgerPackage.GL_ACCOUNT__GL_RESOURCE_TYPE_ID:
				return getGlResourceTypeId();
			case LedgerPackage.GL_ACCOUNT__GL_XBRL_CLASS_ID:
				return getGlXbrlClassId();
			case LedgerPackage.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID:
				return getParentGlAccountId();
			case LedgerPackage.GL_ACCOUNT__PRODUCT_ID:
				return getProductId();
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
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID:
				setGlAccountClassId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_RESOURCE_TYPE_ID:
				setGlResourceTypeId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_XBRL_CLASS_ID:
				setGlXbrlClassId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID:
				setParentGlAccountId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT__PRODUCT_ID:
				setProductId((String)newValue);
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
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID:
				setGlAccountClassId(GL_ACCOUNT_CLASS_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId(GL_ACCOUNT_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_RESOURCE_TYPE_ID:
				setGlResourceTypeId(GL_RESOURCE_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__GL_XBRL_CLASS_ID:
				setGlXbrlClassId(GL_XBRL_CLASS_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID:
				setParentGlAccountId(PARENT_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
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
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID:
				return GL_ACCOUNT_CLASS_ID_EDEFAULT == null ? glAccountClassId != null : !GL_ACCOUNT_CLASS_ID_EDEFAULT.equals(glAccountClassId);
			case LedgerPackage.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				return GL_ACCOUNT_TYPE_ID_EDEFAULT == null ? glAccountTypeId != null : !GL_ACCOUNT_TYPE_ID_EDEFAULT.equals(glAccountTypeId);
			case LedgerPackage.GL_ACCOUNT__GL_RESOURCE_TYPE_ID:
				return GL_RESOURCE_TYPE_ID_EDEFAULT == null ? glResourceTypeId != null : !GL_RESOURCE_TYPE_ID_EDEFAULT.equals(glResourceTypeId);
			case LedgerPackage.GL_ACCOUNT__GL_XBRL_CLASS_ID:
				return GL_XBRL_CLASS_ID_EDEFAULT == null ? glXbrlClassId != null : !GL_XBRL_CLASS_ID_EDEFAULT.equals(glXbrlClassId);
			case LedgerPackage.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID:
				return PARENT_GL_ACCOUNT_ID_EDEFAULT == null ? parentGlAccountId != null : !PARENT_GL_ACCOUNT_ID_EDEFAULT.equals(parentGlAccountId);
			case LedgerPackage.GL_ACCOUNT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
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
		result.append(", glAccountClassId: ");
		result.append(glAccountClassId);
		result.append(", glAccountTypeId: ");
		result.append(glAccountTypeId);
		result.append(", glResourceTypeId: ");
		result.append(glResourceTypeId);
		result.append(", glXbrlClassId: ");
		result.append(glXbrlClassId);
		result.append(", parentGlAccountId: ");
		result.append(parentGlAccountId);
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
