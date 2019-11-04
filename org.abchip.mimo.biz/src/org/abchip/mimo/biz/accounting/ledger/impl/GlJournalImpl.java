/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.GlJournal;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Journal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlJournalImpl#getGlJournalId <em>Gl Journal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlJournalImpl#getGlJournalName <em>Gl Journal Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlJournalImpl#isIsPosted <em>Is Posted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlJournalImpl#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlJournalImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlJournalImpl extends BizEntityImpl implements GlJournal {
	/**
	 * The default value of the '{@link #getGlJournalId() <em>Gl Journal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlJournalId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_JOURNAL_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getGlJournalId() <em>Gl Journal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlJournalId()
	 * @generated
	 * @ordered
	 */
	protected String glJournalId = GL_JOURNAL_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGlJournalName() <em>Gl Journal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlJournalName()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_JOURNAL_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlJournalName() <em>Gl Journal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlJournalName()
	 * @generated
	 * @ordered
	 */
	protected String glJournalName = GL_JOURNAL_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsPosted() <em>Is Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPosted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_POSTED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsPosted() <em>Is Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPosted()
	 * @generated
	 * @ordered
	 */
	protected boolean isPosted = IS_POSTED_EDEFAULT;
	/**
	 * The default value of the '{@link #getPostedDate() <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPostedDate() <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDate()
	 * @generated
	 * @ordered
	 */
	protected Date postedDate = POSTED_DATE_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlJournalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_JOURNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlJournalName() {
		return glJournalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlJournalName(String newGlJournalName) {
		String oldGlJournalName = glJournalName;
		glJournalName = newGlJournalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_JOURNAL__GL_JOURNAL_NAME, oldGlJournalName, glJournalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPosted() {
		return isPosted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPosted(boolean newIsPosted) {
		boolean oldIsPosted = isPosted;
		isPosted = newIsPosted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_JOURNAL__IS_POSTED, oldIsPosted, isPosted));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_JOURNAL__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_JOURNAL__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPostedDate() {
		return postedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedDate(Date newPostedDate) {
		Date oldPostedDate = postedDate;
		postedDate = newPostedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_JOURNAL__POSTED_DATE, oldPostedDate, postedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTranss() {
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
	public List<String> partyAcctgPreferences() {
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
	public String getGlJournalId() {
		return glJournalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlJournalId(String newGlJournalId) {
		String oldGlJournalId = glJournalId;
		glJournalId = newGlJournalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_JOURNAL__GL_JOURNAL_ID, oldGlJournalId, glJournalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_JOURNAL__GL_JOURNAL_ID:
				return getGlJournalId();
			case LedgerPackage.GL_JOURNAL__GL_JOURNAL_NAME:
				return getGlJournalName();
			case LedgerPackage.GL_JOURNAL__IS_POSTED:
				return isIsPosted();
			case LedgerPackage.GL_JOURNAL__POSTED_DATE:
				return getPostedDate();
			case LedgerPackage.GL_JOURNAL__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
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
			case LedgerPackage.GL_JOURNAL__GL_JOURNAL_ID:
				setGlJournalId((String)newValue);
				return;
			case LedgerPackage.GL_JOURNAL__GL_JOURNAL_NAME:
				setGlJournalName((String)newValue);
				return;
			case LedgerPackage.GL_JOURNAL__IS_POSTED:
				setIsPosted((Boolean)newValue);
				return;
			case LedgerPackage.GL_JOURNAL__POSTED_DATE:
				setPostedDate((Date)newValue);
				return;
			case LedgerPackage.GL_JOURNAL__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
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
			case LedgerPackage.GL_JOURNAL__GL_JOURNAL_ID:
				setGlJournalId(GL_JOURNAL_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_JOURNAL__GL_JOURNAL_NAME:
				setGlJournalName(GL_JOURNAL_NAME_EDEFAULT);
				return;
			case LedgerPackage.GL_JOURNAL__IS_POSTED:
				setIsPosted(IS_POSTED_EDEFAULT);
				return;
			case LedgerPackage.GL_JOURNAL__POSTED_DATE:
				setPostedDate(POSTED_DATE_EDEFAULT);
				return;
			case LedgerPackage.GL_JOURNAL__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
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
			case LedgerPackage.GL_JOURNAL__GL_JOURNAL_ID:
				return GL_JOURNAL_ID_EDEFAULT == null ? glJournalId != null : !GL_JOURNAL_ID_EDEFAULT.equals(glJournalId);
			case LedgerPackage.GL_JOURNAL__GL_JOURNAL_NAME:
				return GL_JOURNAL_NAME_EDEFAULT == null ? glJournalName != null : !GL_JOURNAL_NAME_EDEFAULT.equals(glJournalName);
			case LedgerPackage.GL_JOURNAL__IS_POSTED:
				return isPosted != IS_POSTED_EDEFAULT;
			case LedgerPackage.GL_JOURNAL__POSTED_DATE:
				return POSTED_DATE_EDEFAULT == null ? postedDate != null : !POSTED_DATE_EDEFAULT.equals(postedDate);
			case LedgerPackage.GL_JOURNAL__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
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
		result.append(" (glJournalId: ");
		result.append(glJournalId);
		result.append(", glJournalName: ");
		result.append(glJournalName);
		result.append(", isPosted: ");
		result.append(isPosted);
		result.append(", postedDate: ");
		result.append(postedDate);
		result.append(')');
		return result.toString();
	}

} //GlJournalImpl
