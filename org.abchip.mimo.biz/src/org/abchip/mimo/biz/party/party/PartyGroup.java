/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyGroup#getAnnualRevenue <em>Annual Revenue</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyGroup#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyGroup#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyGroup#getGroupNameLocal <em>Group Name Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyGroup#getLogoImageUrl <em>Logo Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyGroup#getNumEmployees <em>Num Employees</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyGroup#getOfficeSiteName <em>Office Site Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyGroup#getTickerSymbol <em>Ticker Symbol</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyGroup()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PartyGroup extends Party {
	/**
	 * Returns the value of the '<em><b>Annual Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annual Revenue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annual Revenue</em>' attribute.
	 * @see #setAnnualRevenue(BigDecimal)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyGroup_AnnualRevenue()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAnnualRevenue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyGroup#getAnnualRevenue <em>Annual Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annual Revenue</em>' attribute.
	 * @see #getAnnualRevenue()
	 * @generated
	 */
	void setAnnualRevenue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyGroup_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyGroup#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyGroup_GroupName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyGroup#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Group Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name Local</em>' attribute.
	 * @see #setGroupNameLocal(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyGroup_GroupNameLocal()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getGroupNameLocal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyGroup#getGroupNameLocal <em>Group Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name Local</em>' attribute.
	 * @see #getGroupNameLocal()
	 * @generated
	 */
	void setGroupNameLocal(String value);

	/**
	 * Returns the value of the '<em><b>Logo Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logo Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo Image Url</em>' attribute.
	 * @see #setLogoImageUrl(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyGroup_LogoImageUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getLogoImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyGroup#getLogoImageUrl <em>Logo Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo Image Url</em>' attribute.
	 * @see #getLogoImageUrl()
	 * @generated
	 */
	void setLogoImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Num Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Employees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Employees</em>' attribute.
	 * @see #setNumEmployees(long)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyGroup_NumEmployees()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNumEmployees();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyGroup#getNumEmployees <em>Num Employees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Employees</em>' attribute.
	 * @see #getNumEmployees()
	 * @generated
	 */
	void setNumEmployees(long value);

	/**
	 * Returns the value of the '<em><b>Office Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office Site Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office Site Name</em>' attribute.
	 * @see #setOfficeSiteName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyGroup_OfficeSiteName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getOfficeSiteName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyGroup#getOfficeSiteName <em>Office Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Office Site Name</em>' attribute.
	 * @see #getOfficeSiteName()
	 * @generated
	 */
	void setOfficeSiteName(String value);

	/**
	 * Returns the value of the '<em><b>Ticker Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ticker Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticker Symbol</em>' attribute.
	 * @see #setTickerSymbol(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyGroup_TickerSymbol()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getTickerSymbol();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyGroup#getTickerSymbol <em>Ticker Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticker Symbol</em>' attribute.
	 * @see #getTickerSymbol()
	 * @generated
	 */
	void setTickerSymbol(String value);

} // PartyGroup
