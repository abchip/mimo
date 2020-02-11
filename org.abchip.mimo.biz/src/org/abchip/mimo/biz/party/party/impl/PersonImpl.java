/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.Gender;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.party.MaritalStatus;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.Person;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getCardId <em>Card Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getDeceasedDate <em>Deceased Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getEmploymentStatusEnumId <em>Employment Status Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#isExistingCustomer <em>Existing Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getFirstNameLocal <em>First Name Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getLastNameLocal <em>Last Name Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getMaritalStatus <em>Marital Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getMemberId <em>Member Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getMiddleNameLocal <em>Middle Name Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getMonthsWithEmployer <em>Months With Employer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getMothersMaidenName <em>Mothers Maiden Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getOtherLocal <em>Other Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getPassportExpireDate <em>Passport Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getPassportNumber <em>Passport Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getPersonalTitle <em>Personal Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getResidenceStatusEnumId <em>Residence Status Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getSocialSecurityNumber <em>Social Security Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getTotalYearsWorkExperience <em>Total Years Work Experience</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getYearsWithEmployer <em>Years With Employer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends PartyImpl implements Person {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBirthDate() {
		return (Date)eGet(PartyPackage.Literals.PERSON__BIRTH_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthDate(Date newBirthDate) {
		eSet(PartyPackage.Literals.PERSON__BIRTH_DATE, newBirthDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardId() {
		return (String)eGet(PartyPackage.Literals.PERSON__CARD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardId(String newCardId) {
		eSet(PartyPackage.Literals.PERSON__CARD_ID, newCardId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(PartyPackage.Literals.PERSON__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(PartyPackage.Literals.PERSON__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDeceasedDate() {
		return (Date)eGet(PartyPackage.Literals.PERSON__DECEASED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeceasedDate(Date newDeceasedDate) {
		eSet(PartyPackage.Literals.PERSON__DECEASED_DATE, newDeceasedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExistingCustomer() {
		return (Boolean)eGet(PartyPackage.Literals.PERSON__EXISTING_CUSTOMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingCustomer(boolean newExistingCustomer) {
		eSet(PartyPackage.Literals.PERSON__EXISTING_CUSTOMER, newExistingCustomer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getEmploymentStatusEnumId() {
		return (Enumeration)eGet(PartyPackage.Literals.PERSON__EMPLOYMENT_STATUS_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmploymentStatusEnumId(Enumeration newEmploymentStatusEnumId) {
		eSet(PartyPackage.Literals.PERSON__EMPLOYMENT_STATUS_ENUM_ID, newEmploymentStatusEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return (String)eGet(PartyPackage.Literals.PERSON__FIRST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		eSet(PartyPackage.Literals.PERSON__FIRST_NAME, newFirstName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstNameLocal() {
		return (String)eGet(PartyPackage.Literals.PERSON__FIRST_NAME_LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstNameLocal(String newFirstNameLocal) {
		eSet(PartyPackage.Literals.PERSON__FIRST_NAME_LOCAL, newFirstNameLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gender getGender() {
		return (Gender)eGet(PartyPackage.Literals.PERSON__GENDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(Gender newGender) {
		eSet(PartyPackage.Literals.PERSON__GENDER, newGender);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return (Double)eGet(PartyPackage.Literals.PERSON__HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(double newHeight) {
		eSet(PartyPackage.Literals.PERSON__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return (String)eGet(PartyPackage.Literals.PERSON__LAST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		eSet(PartyPackage.Literals.PERSON__LAST_NAME, newLastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastNameLocal() {
		return (String)eGet(PartyPackage.Literals.PERSON__LAST_NAME_LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastNameLocal(String newLastNameLocal) {
		eSet(PartyPackage.Literals.PERSON__LAST_NAME_LOCAL, newLastNameLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaritalStatus getMaritalStatus() {
		return (MaritalStatus)eGet(PartyPackage.Literals.PERSON__MARITAL_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaritalStatus(MaritalStatus newMaritalStatus) {
		eSet(PartyPackage.Literals.PERSON__MARITAL_STATUS, newMaritalStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberId() {
		return (String)eGet(PartyPackage.Literals.PERSON__MEMBER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberId(String newMemberId) {
		eSet(PartyPackage.Literals.PERSON__MEMBER_ID, newMemberId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleName() {
		return (String)eGet(PartyPackage.Literals.PERSON__MIDDLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleName(String newMiddleName) {
		eSet(PartyPackage.Literals.PERSON__MIDDLE_NAME, newMiddleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleNameLocal() {
		return (String)eGet(PartyPackage.Literals.PERSON__MIDDLE_NAME_LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleNameLocal(String newMiddleNameLocal) {
		eSet(PartyPackage.Literals.PERSON__MIDDLE_NAME_LOCAL, newMiddleNameLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMonthsWithEmployer() {
		return (Long)eGet(PartyPackage.Literals.PERSON__MONTHS_WITH_EMPLOYER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonthsWithEmployer(long newMonthsWithEmployer) {
		eSet(PartyPackage.Literals.PERSON__MONTHS_WITH_EMPLOYER, newMonthsWithEmployer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMothersMaidenName() {
		return (String)eGet(PartyPackage.Literals.PERSON__MOTHERS_MAIDEN_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMothersMaidenName(String newMothersMaidenName) {
		eSet(PartyPackage.Literals.PERSON__MOTHERS_MAIDEN_NAME, newMothersMaidenName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNickname() {
		return (String)eGet(PartyPackage.Literals.PERSON__NICKNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNickname(String newNickname) {
		eSet(PartyPackage.Literals.PERSON__NICKNAME, newNickname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOccupation() {
		return (String)eGet(PartyPackage.Literals.PERSON__OCCUPATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccupation(String newOccupation) {
		eSet(PartyPackage.Literals.PERSON__OCCUPATION, newOccupation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLocal() {
		return (String)eGet(PartyPackage.Literals.PERSON__OTHER_LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLocal(String newOtherLocal) {
		eSet(PartyPackage.Literals.PERSON__OTHER_LOCAL, newOtherLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPassportExpireDate() {
		return (Date)eGet(PartyPackage.Literals.PERSON__PASSPORT_EXPIRE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassportExpireDate(Date newPassportExpireDate) {
		eSet(PartyPackage.Literals.PERSON__PASSPORT_EXPIRE_DATE, newPassportExpireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassportNumber() {
		return (String)eGet(PartyPackage.Literals.PERSON__PASSPORT_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassportNumber(String newPassportNumber) {
		eSet(PartyPackage.Literals.PERSON__PASSPORT_NUMBER, newPassportNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonalTitle() {
		return (String)eGet(PartyPackage.Literals.PERSON__PERSONAL_TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonalTitle(String newPersonalTitle) {
		eSet(PartyPackage.Literals.PERSON__PERSONAL_TITLE, newPersonalTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getResidenceStatusEnumId() {
		return (Enumeration)eGet(PartyPackage.Literals.PERSON__RESIDENCE_STATUS_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResidenceStatusEnumId(Enumeration newResidenceStatusEnumId) {
		eSet(PartyPackage.Literals.PERSON__RESIDENCE_STATUS_ENUM_ID, newResidenceStatusEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalutation() {
		return (String)eGet(PartyPackage.Literals.PERSON__SALUTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalutation(String newSalutation) {
		eSet(PartyPackage.Literals.PERSON__SALUTATION, newSalutation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocialSecurityNumber() {
		return (String)eGet(PartyPackage.Literals.PERSON__SOCIAL_SECURITY_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocialSecurityNumber(String newSocialSecurityNumber) {
		eSet(PartyPackage.Literals.PERSON__SOCIAL_SECURITY_NUMBER, newSocialSecurityNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		return (String)eGet(PartyPackage.Literals.PERSON__SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(String newSuffix) {
		eSet(PartyPackage.Literals.PERSON__SUFFIX, newSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalYearsWorkExperience() {
		return (Double)eGet(PartyPackage.Literals.PERSON__TOTAL_YEARS_WORK_EXPERIENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalYearsWorkExperience(double newTotalYearsWorkExperience) {
		eSet(PartyPackage.Literals.PERSON__TOTAL_YEARS_WORK_EXPERIENCE, newTotalYearsWorkExperience);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return (Double)eGet(PartyPackage.Literals.PERSON__WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		eSet(PartyPackage.Literals.PERSON__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getYearsWithEmployer() {
		return (Long)eGet(PartyPackage.Literals.PERSON__YEARS_WITH_EMPLOYER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearsWithEmployer(long newYearsWithEmployer) {
		eSet(PartyPackage.Literals.PERSON__YEARS_WITH_EMPLOYER, newYearsWithEmployer);
	}

} //PersonImpl
