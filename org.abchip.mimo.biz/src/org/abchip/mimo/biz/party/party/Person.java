/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.util.Date;
import org.abchip.mimo.biz.common.Gender;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.party.MaritalStatus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getCardId <em>Card Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getDeceasedDate <em>Deceased Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getEmploymentStatusEnumId <em>Employment Status Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#isExistingCustomer <em>Existing Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getFirstNameLocal <em>First Name Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getHeight <em>Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getLastNameLocal <em>Last Name Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getMemberId <em>Member Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getMiddleNameLocal <em>Middle Name Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getMonthsWithEmployer <em>Months With Employer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getMothersMaidenName <em>Mothers Maiden Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getNickname <em>Nickname</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getOtherLocal <em>Other Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getPassportExpireDate <em>Passport Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getPassportNumber <em>Passport Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getPersonalTitle <em>Personal Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getResidenceStatusEnumId <em>Residence Status Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getSocialSecurityNumber <em>Social Security Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getTotalYearsWorkExperience <em>Total Years Work Experience</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Person#getYearsWithEmployer <em>Years With Employer</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Person extends Party {
	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' attribute.
	 * @see #setBirthDate(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_BirthDate()
	 * @model
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getBirthDate <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' attribute.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Card Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Id</em>' attribute.
	 * @see #setCardId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_CardId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCardId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getCardId <em>Card Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Id</em>' attribute.
	 * @see #getCardId()
	 * @generated
	 */
	void setCardId(String value);

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
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Deceased Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deceased Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deceased Date</em>' attribute.
	 * @see #setDeceasedDate(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_DeceasedDate()
	 * @model
	 * @generated
	 */
	Date getDeceasedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getDeceasedDate <em>Deceased Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deceased Date</em>' attribute.
	 * @see #getDeceasedDate()
	 * @generated
	 */
	void setDeceasedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Existing Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existing Customer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Customer</em>' attribute.
	 * @see #setExistingCustomer(boolean)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_ExistingCustomer()
	 * @model
	 * @generated
	 */
	boolean isExistingCustomer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#isExistingCustomer <em>Existing Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Customer</em>' attribute.
	 * @see #isExistingCustomer()
	 * @generated
	 */
	void setExistingCustomer(boolean value);

	/**
	 * Returns the value of the '<em><b>Employment Status Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employment Status Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employment Status Enum Id</em>' reference.
	 * @see #setEmploymentStatusEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_EmploymentStatusEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getEmploymentStatusEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getEmploymentStatusEnumId <em>Employment Status Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment Status Enum Id</em>' reference.
	 * @see #getEmploymentStatusEnumId()
	 * @generated
	 */
	void setEmploymentStatusEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_FirstName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>First Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name Local</em>' attribute.
	 * @see #setFirstNameLocal(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_FirstNameLocal()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getFirstNameLocal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getFirstNameLocal <em>First Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name Local</em>' attribute.
	 * @see #getFirstNameLocal()
	 * @generated
	 */
	void setFirstNameLocal(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.biz.common.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see org.abchip.mimo.biz.common.Gender
	 * @see #setGender(Gender)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see org.abchip.mimo.biz.common.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_LastName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name Local</em>' attribute.
	 * @see #setLastNameLocal(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_LastNameLocal()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getLastNameLocal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getLastNameLocal <em>Last Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name Local</em>' attribute.
	 * @see #getLastNameLocal()
	 * @generated
	 */
	void setLastNameLocal(String value);

	/**
	 * Returns the value of the '<em><b>Marital Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.biz.party.MaritalStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marital Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marital Status</em>' attribute.
	 * @see org.abchip.mimo.biz.party.MaritalStatus
	 * @see #setMaritalStatus(MaritalStatus)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_MaritalStatus()
	 * @model
	 * @generated
	 */
	MaritalStatus getMaritalStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getMaritalStatus <em>Marital Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marital Status</em>' attribute.
	 * @see org.abchip.mimo.biz.party.MaritalStatus
	 * @see #getMaritalStatus()
	 * @generated
	 */
	void setMaritalStatus(MaritalStatus value);

	/**
	 * Returns the value of the '<em><b>Member Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Id</em>' attribute.
	 * @see #setMemberId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_MemberId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getMemberId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getMemberId <em>Member Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Id</em>' attribute.
	 * @see #getMemberId()
	 * @generated
	 */
	void setMemberId(String value);

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #setMiddleName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_MiddleName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getMiddleName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #getMiddleName()
	 * @generated
	 */
	void setMiddleName(String value);

	/**
	 * Returns the value of the '<em><b>Middle Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name Local</em>' attribute.
	 * @see #setMiddleNameLocal(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_MiddleNameLocal()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getMiddleNameLocal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getMiddleNameLocal <em>Middle Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name Local</em>' attribute.
	 * @see #getMiddleNameLocal()
	 * @generated
	 */
	void setMiddleNameLocal(String value);

	/**
	 * Returns the value of the '<em><b>Months With Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Months With Employer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Months With Employer</em>' attribute.
	 * @see #setMonthsWithEmployer(long)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_MonthsWithEmployer()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMonthsWithEmployer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getMonthsWithEmployer <em>Months With Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Months With Employer</em>' attribute.
	 * @see #getMonthsWithEmployer()
	 * @generated
	 */
	void setMonthsWithEmployer(long value);

	/**
	 * Returns the value of the '<em><b>Mothers Maiden Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mothers Maiden Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mothers Maiden Name</em>' attribute.
	 * @see #setMothersMaidenName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_MothersMaidenName()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMothersMaidenName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getMothersMaidenName <em>Mothers Maiden Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mothers Maiden Name</em>' attribute.
	 * @see #getMothersMaidenName()
	 * @generated
	 */
	void setMothersMaidenName(String value);

	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nickname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_Nickname()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Occupation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupation</em>' attribute.
	 * @see #setOccupation(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_Occupation()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getOccupation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getOccupation <em>Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupation</em>' attribute.
	 * @see #getOccupation()
	 * @generated
	 */
	void setOccupation(String value);

	/**
	 * Returns the value of the '<em><b>Other Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Local</em>' attribute.
	 * @see #setOtherLocal(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_OtherLocal()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getOtherLocal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getOtherLocal <em>Other Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Local</em>' attribute.
	 * @see #getOtherLocal()
	 * @generated
	 */
	void setOtherLocal(String value);

	/**
	 * Returns the value of the '<em><b>Passport Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passport Expire Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passport Expire Date</em>' attribute.
	 * @see #setPassportExpireDate(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_PassportExpireDate()
	 * @model
	 * @generated
	 */
	Date getPassportExpireDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getPassportExpireDate <em>Passport Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport Expire Date</em>' attribute.
	 * @see #getPassportExpireDate()
	 * @generated
	 */
	void setPassportExpireDate(Date value);

	/**
	 * Returns the value of the '<em><b>Passport Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passport Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passport Number</em>' attribute.
	 * @see #setPassportNumber(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_PassportNumber()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPassportNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getPassportNumber <em>Passport Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport Number</em>' attribute.
	 * @see #getPassportNumber()
	 * @generated
	 */
	void setPassportNumber(String value);

	/**
	 * Returns the value of the '<em><b>Personal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Title</em>' attribute.
	 * @see #setPersonalTitle(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_PersonalTitle()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getPersonalTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getPersonalTitle <em>Personal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Title</em>' attribute.
	 * @see #getPersonalTitle()
	 * @generated
	 */
	void setPersonalTitle(String value);

	/**
	 * Returns the value of the '<em><b>Residence Status Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residence Status Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residence Status Enum Id</em>' reference.
	 * @see #setResidenceStatusEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_ResidenceStatusEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getResidenceStatusEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getResidenceStatusEnumId <em>Residence Status Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residence Status Enum Id</em>' reference.
	 * @see #getResidenceStatusEnumId()
	 * @generated
	 */
	void setResidenceStatusEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salutation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salutation</em>' attribute.
	 * @see #setSalutation(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_Salutation()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getSalutation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getSalutation <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salutation</em>' attribute.
	 * @see #getSalutation()
	 * @generated
	 */
	void setSalutation(String value);

	/**
	 * Returns the value of the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Security Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Security Number</em>' attribute.
	 * @see #setSocialSecurityNumber(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_SocialSecurityNumber()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSocialSecurityNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getSocialSecurityNumber <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Security Number</em>' attribute.
	 * @see #getSocialSecurityNumber()
	 * @generated
	 */
	void setSocialSecurityNumber(String value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_Suffix()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Total Years Work Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Years Work Experience</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Years Work Experience</em>' attribute.
	 * @see #setTotalYearsWorkExperience(double)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_TotalYearsWorkExperience()
	 * @model
	 * @generated
	 */
	double getTotalYearsWorkExperience();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getTotalYearsWorkExperience <em>Total Years Work Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Years Work Experience</em>' attribute.
	 * @see #getTotalYearsWorkExperience()
	 * @generated
	 */
	void setTotalYearsWorkExperience(double value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Years With Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Years With Employer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years With Employer</em>' attribute.
	 * @see #setYearsWithEmployer(long)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPerson_YearsWithEmployer()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getYearsWithEmployer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Person#getYearsWithEmployer <em>Years With Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years With Employer</em>' attribute.
	 * @see #getYearsWithEmployer()
	 * @generated
	 */
	void setYearsWithEmployer(long value);

} // Person
