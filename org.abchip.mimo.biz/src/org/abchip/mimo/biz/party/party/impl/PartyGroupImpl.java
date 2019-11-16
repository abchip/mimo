/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl#getAnnualRevenue <em>Annual Revenue</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl#getGroupNameLocal <em>Group Name Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl#getLogoImageUrl <em>Logo Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl#getNumEmployees <em>Num Employees</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl#getOfficeSiteName <em>Office Site Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl#getTickerSymbol <em>Ticker Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyGroupImpl extends PartyImpl implements PartyGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getAnnualRevenue() <em>Annual Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnualRevenue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ANNUAL_REVENUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnualRevenue() <em>Annual Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnualRevenue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal annualRevenue = ANNUAL_REVENUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupNameLocal() <em>Group Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupNameLocal()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupNameLocal() <em>Group Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupNameLocal()
	 * @generated
	 * @ordered
	 */
	protected String groupNameLocal = GROUP_NAME_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogoImageUrl() <em>Logo Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogoImageUrl() <em>Logo Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String logoImageUrl = LOGO_IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumEmployees() <em>Num Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumEmployees()
	 * @generated
	 * @ordered
	 */
	protected static final long NUM_EMPLOYEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumEmployees() <em>Num Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumEmployees()
	 * @generated
	 * @ordered
	 */
	protected long numEmployees = NUM_EMPLOYEES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOfficeSiteName() <em>Office Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficeSiteName()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFICE_SITE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOfficeSiteName() <em>Office Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficeSiteName()
	 * @generated
	 * @ordered
	 */
	protected String officeSiteName = OFFICE_SITE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTickerSymbol() <em>Ticker Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickerSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String TICKER_SYMBOL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTickerSymbol() <em>Ticker Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickerSymbol()
	 * @generated
	 * @ordered
	 */
	protected String tickerSymbol = TICKER_SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAnnualRevenue() {
		return annualRevenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnualRevenue(BigDecimal newAnnualRevenue) {
		BigDecimal oldAnnualRevenue = annualRevenue;
		annualRevenue = newAnnualRevenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_GROUP__ANNUAL_REVENUE, oldAnnualRevenue, annualRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_GROUP__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_GROUP__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupNameLocal() {
		return groupNameLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupNameLocal(String newGroupNameLocal) {
		String oldGroupNameLocal = groupNameLocal;
		groupNameLocal = newGroupNameLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_GROUP__GROUP_NAME_LOCAL, oldGroupNameLocal, groupNameLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogoImageUrl() {
		return logoImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoImageUrl(String newLogoImageUrl) {
		String oldLogoImageUrl = logoImageUrl;
		logoImageUrl = newLogoImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_GROUP__LOGO_IMAGE_URL, oldLogoImageUrl, logoImageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumEmployees() {
		return numEmployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumEmployees(long newNumEmployees) {
		long oldNumEmployees = numEmployees;
		numEmployees = newNumEmployees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_GROUP__NUM_EMPLOYEES, oldNumEmployees, numEmployees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOfficeSiteName() {
		return officeSiteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOfficeSiteName(String newOfficeSiteName) {
		String oldOfficeSiteName = officeSiteName;
		officeSiteName = newOfficeSiteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_GROUP__OFFICE_SITE_NAME, oldOfficeSiteName, officeSiteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTickerSymbol() {
		return tickerSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTickerSymbol(String newTickerSymbol) {
		String oldTickerSymbol = tickerSymbol;
		tickerSymbol = newTickerSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_GROUP__TICKER_SYMBOL, oldTickerSymbol, tickerSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_GROUP__ANNUAL_REVENUE:
				return getAnnualRevenue();
			case PartyPackage.PARTY_GROUP__COMMENTS:
				return getComments();
			case PartyPackage.PARTY_GROUP__GROUP_NAME:
				return getGroupName();
			case PartyPackage.PARTY_GROUP__GROUP_NAME_LOCAL:
				return getGroupNameLocal();
			case PartyPackage.PARTY_GROUP__LOGO_IMAGE_URL:
				return getLogoImageUrl();
			case PartyPackage.PARTY_GROUP__NUM_EMPLOYEES:
				return getNumEmployees();
			case PartyPackage.PARTY_GROUP__OFFICE_SITE_NAME:
				return getOfficeSiteName();
			case PartyPackage.PARTY_GROUP__TICKER_SYMBOL:
				return getTickerSymbol();
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
			case PartyPackage.PARTY_GROUP__ANNUAL_REVENUE:
				setAnnualRevenue((BigDecimal)newValue);
				return;
			case PartyPackage.PARTY_GROUP__COMMENTS:
				setComments((String)newValue);
				return;
			case PartyPackage.PARTY_GROUP__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case PartyPackage.PARTY_GROUP__GROUP_NAME_LOCAL:
				setGroupNameLocal((String)newValue);
				return;
			case PartyPackage.PARTY_GROUP__LOGO_IMAGE_URL:
				setLogoImageUrl((String)newValue);
				return;
			case PartyPackage.PARTY_GROUP__NUM_EMPLOYEES:
				setNumEmployees((Long)newValue);
				return;
			case PartyPackage.PARTY_GROUP__OFFICE_SITE_NAME:
				setOfficeSiteName((String)newValue);
				return;
			case PartyPackage.PARTY_GROUP__TICKER_SYMBOL:
				setTickerSymbol((String)newValue);
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
			case PartyPackage.PARTY_GROUP__ANNUAL_REVENUE:
				setAnnualRevenue(ANNUAL_REVENUE_EDEFAULT);
				return;
			case PartyPackage.PARTY_GROUP__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PartyPackage.PARTY_GROUP__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_GROUP__GROUP_NAME_LOCAL:
				setGroupNameLocal(GROUP_NAME_LOCAL_EDEFAULT);
				return;
			case PartyPackage.PARTY_GROUP__LOGO_IMAGE_URL:
				setLogoImageUrl(LOGO_IMAGE_URL_EDEFAULT);
				return;
			case PartyPackage.PARTY_GROUP__NUM_EMPLOYEES:
				setNumEmployees(NUM_EMPLOYEES_EDEFAULT);
				return;
			case PartyPackage.PARTY_GROUP__OFFICE_SITE_NAME:
				setOfficeSiteName(OFFICE_SITE_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_GROUP__TICKER_SYMBOL:
				setTickerSymbol(TICKER_SYMBOL_EDEFAULT);
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
			case PartyPackage.PARTY_GROUP__ANNUAL_REVENUE:
				return ANNUAL_REVENUE_EDEFAULT == null ? annualRevenue != null : !ANNUAL_REVENUE_EDEFAULT.equals(annualRevenue);
			case PartyPackage.PARTY_GROUP__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PartyPackage.PARTY_GROUP__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case PartyPackage.PARTY_GROUP__GROUP_NAME_LOCAL:
				return GROUP_NAME_LOCAL_EDEFAULT == null ? groupNameLocal != null : !GROUP_NAME_LOCAL_EDEFAULT.equals(groupNameLocal);
			case PartyPackage.PARTY_GROUP__LOGO_IMAGE_URL:
				return LOGO_IMAGE_URL_EDEFAULT == null ? logoImageUrl != null : !LOGO_IMAGE_URL_EDEFAULT.equals(logoImageUrl);
			case PartyPackage.PARTY_GROUP__NUM_EMPLOYEES:
				return numEmployees != NUM_EMPLOYEES_EDEFAULT;
			case PartyPackage.PARTY_GROUP__OFFICE_SITE_NAME:
				return OFFICE_SITE_NAME_EDEFAULT == null ? officeSiteName != null : !OFFICE_SITE_NAME_EDEFAULT.equals(officeSiteName);
			case PartyPackage.PARTY_GROUP__TICKER_SYMBOL:
				return TICKER_SYMBOL_EDEFAULT == null ? tickerSymbol != null : !TICKER_SYMBOL_EDEFAULT.equals(tickerSymbol);
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
		result.append(" (annualRevenue: ");
		result.append(annualRevenue);
		result.append(", comments: ");
		result.append(comments);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(", groupNameLocal: ");
		result.append(groupNameLocal);
		result.append(", logoImageUrl: ");
		result.append(logoImageUrl);
		result.append(", numEmployees: ");
		result.append(numEmployees);
		result.append(", officeSiteName: ");
		result.append(officeSiteName);
		result.append(", tickerSymbol: ");
		result.append(tickerSymbol);
		result.append(')');
		return result.toString();
	}

} //PartyGroupImpl
