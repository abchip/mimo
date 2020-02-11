/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.ecore.EClass;

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
		return (BigDecimal)eGet(PartyPackage.Literals.PARTY_GROUP__ANNUAL_REVENUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnualRevenue(BigDecimal newAnnualRevenue) {
		eSet(PartyPackage.Literals.PARTY_GROUP__ANNUAL_REVENUE, newAnnualRevenue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(PartyPackage.Literals.PARTY_GROUP__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(PartyPackage.Literals.PARTY_GROUP__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupName() {
		return (String)eGet(PartyPackage.Literals.PARTY_GROUP__GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupName(String newGroupName) {
		eSet(PartyPackage.Literals.PARTY_GROUP__GROUP_NAME, newGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupNameLocal() {
		return (String)eGet(PartyPackage.Literals.PARTY_GROUP__GROUP_NAME_LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupNameLocal(String newGroupNameLocal) {
		eSet(PartyPackage.Literals.PARTY_GROUP__GROUP_NAME_LOCAL, newGroupNameLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogoImageUrl() {
		return (String)eGet(PartyPackage.Literals.PARTY_GROUP__LOGO_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoImageUrl(String newLogoImageUrl) {
		eSet(PartyPackage.Literals.PARTY_GROUP__LOGO_IMAGE_URL, newLogoImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumEmployees() {
		return (Long)eGet(PartyPackage.Literals.PARTY_GROUP__NUM_EMPLOYEES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumEmployees(long newNumEmployees) {
		eSet(PartyPackage.Literals.PARTY_GROUP__NUM_EMPLOYEES, newNumEmployees);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOfficeSiteName() {
		return (String)eGet(PartyPackage.Literals.PARTY_GROUP__OFFICE_SITE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOfficeSiteName(String newOfficeSiteName) {
		eSet(PartyPackage.Literals.PARTY_GROUP__OFFICE_SITE_NAME, newOfficeSiteName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTickerSymbol() {
		return (String)eGet(PartyPackage.Literals.PARTY_GROUP__TICKER_SYMBOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTickerSymbol(String newTickerSymbol) {
		eSet(PartyPackage.Literals.PARTY_GROUP__TICKER_SYMBOL, newTickerSymbol);
	}

} //PartyGroupImpl
