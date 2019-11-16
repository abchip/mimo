/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlReconciliation;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Reconciliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getGlReconciliationId <em>Gl Reconciliation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getGlReconciliationName <em>Gl Reconciliation Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getOpeningBalance <em>Opening Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getReconciledBalance <em>Reconciled Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getReconciledDate <em>Reconciled Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlReconciliationImpl extends BizEntityImpl implements GlReconciliation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getGlReconciliationId() <em>Gl Reconciliation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlReconciliationId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_RECONCILIATION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlReconciliationId() <em>Gl Reconciliation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlReconciliationId()
	 * @generated
	 * @ordered
	 */
	protected String glReconciliationId = GL_RECONCILIATION_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;
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
	 * The default value of the '{@link #getGlReconciliationName() <em>Gl Reconciliation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlReconciliationName()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_RECONCILIATION_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlReconciliationName() <em>Gl Reconciliation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlReconciliationName()
	 * @generated
	 * @ordered
	 */
	protected String glReconciliationName = GL_RECONCILIATION_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOpeningBalance() <em>Opening Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OPENING_BALANCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOpeningBalance() <em>Opening Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal openingBalance = OPENING_BALANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getReconciledBalance() <em>Reconciled Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconciledBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RECONCILED_BALANCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReconciledBalance() <em>Reconciled Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconciledBalance()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reconciledBalance = RECONCILED_BALANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getReconciledDate() <em>Reconciled Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconciledDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECONCILED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReconciledDate() <em>Reconciled Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconciledDate()
	 * @generated
	 * @ordered
	 */
	protected Date reconciledDate = RECONCILED_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount glAccountId;
	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party organizationPartyId;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlReconciliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_RECONCILIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__CREATED_DATE, oldCreatedDate, createdDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlReconciliationName() {
		return glReconciliationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlReconciliationName(String newGlReconciliationName) {
		String oldGlReconciliationName = glReconciliationName;
		glReconciliationName = newGlReconciliationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_NAME, oldGlReconciliationName, glReconciliationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOpeningBalance() {
		return openingBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningBalance(BigDecimal newOpeningBalance) {
		BigDecimal oldOpeningBalance = openingBalance;
		openingBalance = newOpeningBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__OPENING_BALANCE, oldOpeningBalance, openingBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOrganizationPartyId() {
		if (organizationPartyId != null && ((EObject)organizationPartyId).eIsProxy()) {
			InternalEObject oldOrganizationPartyId = (InternalEObject)organizationPartyId;
			organizationPartyId = (Party)eResolveProxy(oldOrganizationPartyId);
			if (organizationPartyId != oldOrganizationPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_RECONCILIATION__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
			}
		}
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(Party newOrganizationPartyId) {
		Party oldOrganizationPartyId = organizationPartyId;
		organizationPartyId = newOrganizationPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReconciledBalance() {
		return reconciledBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconciledBalance(BigDecimal newReconciledBalance) {
		BigDecimal oldReconciledBalance = reconciledBalance;
		reconciledBalance = newReconciledBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__RECONCILED_BALANCE, oldReconciledBalance, reconciledBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReconciledDate() {
		return reconciledDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconciledDate(Date newReconciledDate) {
		Date oldReconciledDate = reconciledDate;
		reconciledDate = newReconciledDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__RECONCILED_DATE, oldReconciledDate, reconciledDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_RECONCILIATION__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> finAccountTranss() {
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
	public GlAccount getGlAccountId() {
		if (glAccountId != null && ((EObject)glAccountId).eIsProxy()) {
			InternalEObject oldGlAccountId = (InternalEObject)glAccountId;
			glAccountId = (GlAccount)eResolveProxy(oldGlAccountId);
			if (glAccountId != oldGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_RECONCILIATION__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
			}
		}
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(GlAccount newGlAccountId) {
		GlAccount oldGlAccountId = glAccountId;
		glAccountId = newGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlReconciliationId() {
		return glReconciliationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlReconciliationId(String newGlReconciliationId) {
		String oldGlReconciliationId = glReconciliationId;
		glReconciliationId = newGlReconciliationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_ID, oldGlReconciliationId, glReconciliationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_ID:
				return getGlReconciliationId();
			case LedgerPackage.GL_RECONCILIATION__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case LedgerPackage.GL_RECONCILIATION__CREATED_DATE:
				return getCreatedDate();
			case LedgerPackage.GL_RECONCILIATION__DESCRIPTION:
				return getDescription();
			case LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_NAME:
				return getGlReconciliationName();
			case LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case LedgerPackage.GL_RECONCILIATION__OPENING_BALANCE:
				return getOpeningBalance();
			case LedgerPackage.GL_RECONCILIATION__RECONCILED_BALANCE:
				return getReconciledBalance();
			case LedgerPackage.GL_RECONCILIATION__RECONCILED_DATE:
				return getReconciledDate();
			case LedgerPackage.GL_RECONCILIATION__GL_ACCOUNT_ID:
				if (resolve) return getGlAccountId();
				return basicGetGlAccountId();
			case LedgerPackage.GL_RECONCILIATION__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case LedgerPackage.GL_RECONCILIATION__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
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
			case LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_ID:
				setGlReconciliationId((String)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_NAME:
				setGlReconciliationName((String)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__OPENING_BALANCE:
				setOpeningBalance((BigDecimal)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__RECONCILED_BALANCE:
				setReconciledBalance((BigDecimal)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__RECONCILED_DATE:
				setReconciledDate((Date)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION__STATUS_ID:
				setStatusId((StatusItem)newValue);
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
			case LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_ID:
				setGlReconciliationId(GL_RECONCILIATION_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_NAME:
				setGlReconciliationName(GL_RECONCILIATION_NAME_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__OPENING_BALANCE:
				setOpeningBalance(OPENING_BALANCE_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__RECONCILED_BALANCE:
				setReconciledBalance(RECONCILED_BALANCE_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__RECONCILED_DATE:
				setReconciledDate(RECONCILED_DATE_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)null);
				return;
			case LedgerPackage.GL_RECONCILIATION__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case LedgerPackage.GL_RECONCILIATION__STATUS_ID:
				setStatusId((StatusItem)null);
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
			case LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_ID:
				return GL_RECONCILIATION_ID_EDEFAULT == null ? glReconciliationId != null : !GL_RECONCILIATION_ID_EDEFAULT.equals(glReconciliationId);
			case LedgerPackage.GL_RECONCILIATION__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case LedgerPackage.GL_RECONCILIATION__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case LedgerPackage.GL_RECONCILIATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LedgerPackage.GL_RECONCILIATION__GL_RECONCILIATION_NAME:
				return GL_RECONCILIATION_NAME_EDEFAULT == null ? glReconciliationName != null : !GL_RECONCILIATION_NAME_EDEFAULT.equals(glReconciliationName);
			case LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case LedgerPackage.GL_RECONCILIATION__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case LedgerPackage.GL_RECONCILIATION__OPENING_BALANCE:
				return OPENING_BALANCE_EDEFAULT == null ? openingBalance != null : !OPENING_BALANCE_EDEFAULT.equals(openingBalance);
			case LedgerPackage.GL_RECONCILIATION__RECONCILED_BALANCE:
				return RECONCILED_BALANCE_EDEFAULT == null ? reconciledBalance != null : !RECONCILED_BALANCE_EDEFAULT.equals(reconciledBalance);
			case LedgerPackage.GL_RECONCILIATION__RECONCILED_DATE:
				return RECONCILED_DATE_EDEFAULT == null ? reconciledDate != null : !RECONCILED_DATE_EDEFAULT.equals(reconciledDate);
			case LedgerPackage.GL_RECONCILIATION__GL_ACCOUNT_ID:
				return glAccountId != null;
			case LedgerPackage.GL_RECONCILIATION__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case LedgerPackage.GL_RECONCILIATION__STATUS_ID:
				return statusId != null;
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
		result.append(" (glReconciliationId: ");
		result.append(glReconciliationId);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", description: ");
		result.append(description);
		result.append(", glReconciliationName: ");
		result.append(glReconciliationName);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", openingBalance: ");
		result.append(openingBalance);
		result.append(", reconciledBalance: ");
		result.append(reconciledBalance);
		result.append(", reconciledDate: ");
		result.append(reconciledDate);
		result.append(')');
		return result.toString();
	}

} //GlReconciliationImpl
