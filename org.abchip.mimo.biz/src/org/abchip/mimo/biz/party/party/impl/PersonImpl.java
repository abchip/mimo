/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Date;

import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.Person;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#isGender <em>Gender</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#getLastNameLocal <em>Last Name Local</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PersonImpl#isMaritalStatus <em>Marital Status</em>}</li>
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
	 * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate = BIRTH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardId() <em>Card Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardId()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardId() <em>Card Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardId()
	 * @generated
	 * @ordered
	 */
	protected String cardId = CARD_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDeceasedDate() <em>Deceased Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DECEASED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeceasedDate() <em>Deceased Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeceasedDate()
	 * @generated
	 * @ordered
	 */
	protected Date deceasedDate = DECEASED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmploymentStatusEnumId() <em>Employment Status Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentStatusEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYMENT_STATUS_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmploymentStatusEnumId() <em>Employment Status Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentStatusEnumId()
	 * @generated
	 * @ordered
	 */
	protected String employmentStatusEnumId = EMPLOYMENT_STATUS_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isExistingCustomer() <em>Existing Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExistingCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXISTING_CUSTOMER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExistingCustomer() <em>Existing Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExistingCustomer()
	 * @generated
	 * @ordered
	 */
	protected boolean existingCustomer = EXISTING_CUSTOMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstNameLocal() <em>First Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNameLocal()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstNameLocal() <em>First Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNameLocal()
	 * @generated
	 * @ordered
	 */
	protected String firstNameLocal = FIRST_NAME_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGender()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGender()
	 * @generated
	 * @ordered
	 */
	protected boolean gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastNameLocal() <em>Last Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNameLocal()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastNameLocal() <em>Last Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNameLocal()
	 * @generated
	 * @ordered
	 */
	protected String lastNameLocal = LAST_NAME_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaritalStatus() <em>Marital Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaritalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARITAL_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaritalStatus() <em>Marital Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaritalStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean maritalStatus = MARITAL_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemberId() <em>Member Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberId()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberId() <em>Member Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberId()
	 * @generated
	 * @ordered
	 */
	protected String memberId = MEMBER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected String middleName = MIDDLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiddleNameLocal() <em>Middle Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleNameLocal()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiddleNameLocal() <em>Middle Name Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleNameLocal()
	 * @generated
	 * @ordered
	 */
	protected String middleNameLocal = MIDDLE_NAME_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonthsWithEmployer() <em>Months With Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthsWithEmployer()
	 * @generated
	 * @ordered
	 */
	protected static final long MONTHS_WITH_EMPLOYER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMonthsWithEmployer() <em>Months With Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthsWithEmployer()
	 * @generated
	 * @ordered
	 */
	protected long monthsWithEmployer = MONTHS_WITH_EMPLOYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMothersMaidenName() <em>Mothers Maiden Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMothersMaidenName()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTHERS_MAIDEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMothersMaidenName() <em>Mothers Maiden Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMothersMaidenName()
	 * @generated
	 * @ordered
	 */
	protected String mothersMaidenName = MOTHERS_MAIDEN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected String nickname = NICKNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccupation() <em>Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupation()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCUPATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccupation() <em>Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupation()
	 * @generated
	 * @ordered
	 */
	protected String occupation = OCCUPATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLocal() <em>Other Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLocal()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLocal() <em>Other Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLocal()
	 * @generated
	 * @ordered
	 */
	protected String otherLocal = OTHER_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassportExpireDate() <em>Passport Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportExpireDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PASSPORT_EXPIRE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPassportExpireDate() <em>Passport Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportExpireDate()
	 * @generated
	 * @ordered
	 */
	protected Date passportExpireDate = PASSPORT_EXPIRE_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPassportNumber() <em>Passport Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSPORT_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPassportNumber() <em>Passport Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportNumber()
	 * @generated
	 * @ordered
	 */
	protected String passportNumber = PASSPORT_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getPersonalTitle() <em>Personal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONAL_TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPersonalTitle() <em>Personal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalTitle()
	 * @generated
	 * @ordered
	 */
	protected String personalTitle = PERSONAL_TITLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getResidenceStatusEnumId() <em>Residence Status Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidenceStatusEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESIDENCE_STATUS_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResidenceStatusEnumId() <em>Residence Status Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidenceStatusEnumId()
	 * @generated
	 * @ordered
	 */
	protected String residenceStatusEnumId = RESIDENCE_STATUS_ENUM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSalutation() <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalutation()
	 * @generated
	 * @ordered
	 */
	protected static final String SALUTATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSalutation() <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalutation()
	 * @generated
	 * @ordered
	 */
	protected String salutation = SALUTATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getSocialSecurityNumber() <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialSecurityNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIAL_SECURITY_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSocialSecurityNumber() <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialSecurityNumber()
	 * @generated
	 * @ordered
	 */
	protected String socialSecurityNumber = SOCIAL_SECURITY_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalYearsWorkExperience() <em>Total Years Work Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalYearsWorkExperience()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_YEARS_WORK_EXPERIENCE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getTotalYearsWorkExperience() <em>Total Years Work Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalYearsWorkExperience()
	 * @generated
	 * @ordered
	 */
	protected double totalYearsWorkExperience = TOTAL_YEARS_WORK_EXPERIENCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;
	/**
	 * The default value of the '{@link #getYearsWithEmployer() <em>Years With Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsWithEmployer()
	 * @generated
	 * @ordered
	 */
	protected static final long YEARS_WITH_EMPLOYER_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getYearsWithEmployer() <em>Years With Employer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsWithEmployer()
	 * @generated
	 * @ordered
	 */
	protected long yearsWithEmployer = YEARS_WITH_EMPLOYER_EDEFAULT;

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
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardId() {
		return cardId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardId(String newCardId) {
		String oldCardId = cardId;
		cardId = newCardId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__CARD_ID, oldCardId, cardId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDeceasedDate() {
		return deceasedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeceasedDate(Date newDeceasedDate) {
		Date oldDeceasedDate = deceasedDate;
		deceasedDate = newDeceasedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__DECEASED_DATE, oldDeceasedDate, deceasedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmploymentStatusEnumId() {
		return employmentStatusEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmploymentStatusEnumId(String newEmploymentStatusEnumId) {
		String oldEmploymentStatusEnumId = employmentStatusEnumId;
		employmentStatusEnumId = newEmploymentStatusEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__EMPLOYMENT_STATUS_ENUM_ID, oldEmploymentStatusEnumId, employmentStatusEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExistingCustomer() {
		return existingCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingCustomer(boolean newExistingCustomer) {
		boolean oldExistingCustomer = existingCustomer;
		existingCustomer = newExistingCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__EXISTING_CUSTOMER, oldExistingCustomer, existingCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstNameLocal() {
		return firstNameLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstNameLocal(String newFirstNameLocal) {
		String oldFirstNameLocal = firstNameLocal;
		firstNameLocal = newFirstNameLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__FIRST_NAME_LOCAL, oldFirstNameLocal, firstNameLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(boolean newGender) {
		boolean oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastNameLocal() {
		return lastNameLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastNameLocal(String newLastNameLocal) {
		String oldLastNameLocal = lastNameLocal;
		lastNameLocal = newLastNameLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__LAST_NAME_LOCAL, oldLastNameLocal, lastNameLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaritalStatus(boolean newMaritalStatus) {
		boolean oldMaritalStatus = maritalStatus;
		maritalStatus = newMaritalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__MARITAL_STATUS, oldMaritalStatus, maritalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberId() {
		return memberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberId(String newMemberId) {
		String oldMemberId = memberId;
		memberId = newMemberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__MEMBER_ID, oldMemberId, memberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleName(String newMiddleName) {
		String oldMiddleName = middleName;
		middleName = newMiddleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__MIDDLE_NAME, oldMiddleName, middleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleNameLocal() {
		return middleNameLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleNameLocal(String newMiddleNameLocal) {
		String oldMiddleNameLocal = middleNameLocal;
		middleNameLocal = newMiddleNameLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__MIDDLE_NAME_LOCAL, oldMiddleNameLocal, middleNameLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMonthsWithEmployer() {
		return monthsWithEmployer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonthsWithEmployer(long newMonthsWithEmployer) {
		long oldMonthsWithEmployer = monthsWithEmployer;
		monthsWithEmployer = newMonthsWithEmployer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__MONTHS_WITH_EMPLOYER, oldMonthsWithEmployer, monthsWithEmployer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMothersMaidenName() {
		return mothersMaidenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMothersMaidenName(String newMothersMaidenName) {
		String oldMothersMaidenName = mothersMaidenName;
		mothersMaidenName = newMothersMaidenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__MOTHERS_MAIDEN_NAME, oldMothersMaidenName, mothersMaidenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNickname() {
		return nickname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNickname(String newNickname) {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOccupation() {
		return occupation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccupation(String newOccupation) {
		String oldOccupation = occupation;
		occupation = newOccupation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__OCCUPATION, oldOccupation, occupation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLocal() {
		return otherLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLocal(String newOtherLocal) {
		String oldOtherLocal = otherLocal;
		otherLocal = newOtherLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__OTHER_LOCAL, oldOtherLocal, otherLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPassportExpireDate() {
		return passportExpireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassportExpireDate(Date newPassportExpireDate) {
		Date oldPassportExpireDate = passportExpireDate;
		passportExpireDate = newPassportExpireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__PASSPORT_EXPIRE_DATE, oldPassportExpireDate, passportExpireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassportNumber() {
		return passportNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassportNumber(String newPassportNumber) {
		String oldPassportNumber = passportNumber;
		passportNumber = newPassportNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__PASSPORT_NUMBER, oldPassportNumber, passportNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonalTitle() {
		return personalTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonalTitle(String newPersonalTitle) {
		String oldPersonalTitle = personalTitle;
		personalTitle = newPersonalTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__PERSONAL_TITLE, oldPersonalTitle, personalTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResidenceStatusEnumId() {
		return residenceStatusEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResidenceStatusEnumId(String newResidenceStatusEnumId) {
		String oldResidenceStatusEnumId = residenceStatusEnumId;
		residenceStatusEnumId = newResidenceStatusEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__RESIDENCE_STATUS_ENUM_ID, oldResidenceStatusEnumId, residenceStatusEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalutation() {
		return salutation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalutation(String newSalutation) {
		String oldSalutation = salutation;
		salutation = newSalutation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__SALUTATION, oldSalutation, salutation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocialSecurityNumber(String newSocialSecurityNumber) {
		String oldSocialSecurityNumber = socialSecurityNumber;
		socialSecurityNumber = newSocialSecurityNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__SOCIAL_SECURITY_NUMBER, oldSocialSecurityNumber, socialSecurityNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__SUFFIX, oldSuffix, suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalYearsWorkExperience() {
		return totalYearsWorkExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalYearsWorkExperience(double newTotalYearsWorkExperience) {
		double oldTotalYearsWorkExperience = totalYearsWorkExperience;
		totalYearsWorkExperience = newTotalYearsWorkExperience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__TOTAL_YEARS_WORK_EXPERIENCE, oldTotalYearsWorkExperience, totalYearsWorkExperience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getYearsWithEmployer() {
		return yearsWithEmployer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearsWithEmployer(long newYearsWithEmployer) {
		long oldYearsWithEmployer = yearsWithEmployer;
		yearsWithEmployer = newYearsWithEmployer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PERSON__YEARS_WITH_EMPLOYER, oldYearsWithEmployer, yearsWithEmployer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PERSON__BIRTH_DATE:
				return getBirthDate();
			case PartyPackage.PERSON__CARD_ID:
				return getCardId();
			case PartyPackage.PERSON__COMMENTS:
				return getComments();
			case PartyPackage.PERSON__DECEASED_DATE:
				return getDeceasedDate();
			case PartyPackage.PERSON__EMPLOYMENT_STATUS_ENUM_ID:
				return getEmploymentStatusEnumId();
			case PartyPackage.PERSON__EXISTING_CUSTOMER:
				return isExistingCustomer();
			case PartyPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case PartyPackage.PERSON__FIRST_NAME_LOCAL:
				return getFirstNameLocal();
			case PartyPackage.PERSON__GENDER:
				return isGender();
			case PartyPackage.PERSON__HEIGHT:
				return getHeight();
			case PartyPackage.PERSON__LAST_NAME:
				return getLastName();
			case PartyPackage.PERSON__LAST_NAME_LOCAL:
				return getLastNameLocal();
			case PartyPackage.PERSON__MARITAL_STATUS:
				return isMaritalStatus();
			case PartyPackage.PERSON__MEMBER_ID:
				return getMemberId();
			case PartyPackage.PERSON__MIDDLE_NAME:
				return getMiddleName();
			case PartyPackage.PERSON__MIDDLE_NAME_LOCAL:
				return getMiddleNameLocal();
			case PartyPackage.PERSON__MONTHS_WITH_EMPLOYER:
				return getMonthsWithEmployer();
			case PartyPackage.PERSON__MOTHERS_MAIDEN_NAME:
				return getMothersMaidenName();
			case PartyPackage.PERSON__NICKNAME:
				return getNickname();
			case PartyPackage.PERSON__OCCUPATION:
				return getOccupation();
			case PartyPackage.PERSON__OTHER_LOCAL:
				return getOtherLocal();
			case PartyPackage.PERSON__PASSPORT_EXPIRE_DATE:
				return getPassportExpireDate();
			case PartyPackage.PERSON__PASSPORT_NUMBER:
				return getPassportNumber();
			case PartyPackage.PERSON__PERSONAL_TITLE:
				return getPersonalTitle();
			case PartyPackage.PERSON__RESIDENCE_STATUS_ENUM_ID:
				return getResidenceStatusEnumId();
			case PartyPackage.PERSON__SALUTATION:
				return getSalutation();
			case PartyPackage.PERSON__SOCIAL_SECURITY_NUMBER:
				return getSocialSecurityNumber();
			case PartyPackage.PERSON__SUFFIX:
				return getSuffix();
			case PartyPackage.PERSON__TOTAL_YEARS_WORK_EXPERIENCE:
				return getTotalYearsWorkExperience();
			case PartyPackage.PERSON__WEIGHT:
				return getWeight();
			case PartyPackage.PERSON__YEARS_WITH_EMPLOYER:
				return getYearsWithEmployer();
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
			case PartyPackage.PERSON__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case PartyPackage.PERSON__CARD_ID:
				setCardId((String)newValue);
				return;
			case PartyPackage.PERSON__COMMENTS:
				setComments((String)newValue);
				return;
			case PartyPackage.PERSON__DECEASED_DATE:
				setDeceasedDate((Date)newValue);
				return;
			case PartyPackage.PERSON__EMPLOYMENT_STATUS_ENUM_ID:
				setEmploymentStatusEnumId((String)newValue);
				return;
			case PartyPackage.PERSON__EXISTING_CUSTOMER:
				setExistingCustomer((Boolean)newValue);
				return;
			case PartyPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case PartyPackage.PERSON__FIRST_NAME_LOCAL:
				setFirstNameLocal((String)newValue);
				return;
			case PartyPackage.PERSON__GENDER:
				setGender((Boolean)newValue);
				return;
			case PartyPackage.PERSON__HEIGHT:
				setHeight((Double)newValue);
				return;
			case PartyPackage.PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case PartyPackage.PERSON__LAST_NAME_LOCAL:
				setLastNameLocal((String)newValue);
				return;
			case PartyPackage.PERSON__MARITAL_STATUS:
				setMaritalStatus((Boolean)newValue);
				return;
			case PartyPackage.PERSON__MEMBER_ID:
				setMemberId((String)newValue);
				return;
			case PartyPackage.PERSON__MIDDLE_NAME:
				setMiddleName((String)newValue);
				return;
			case PartyPackage.PERSON__MIDDLE_NAME_LOCAL:
				setMiddleNameLocal((String)newValue);
				return;
			case PartyPackage.PERSON__MONTHS_WITH_EMPLOYER:
				setMonthsWithEmployer((Long)newValue);
				return;
			case PartyPackage.PERSON__MOTHERS_MAIDEN_NAME:
				setMothersMaidenName((String)newValue);
				return;
			case PartyPackage.PERSON__NICKNAME:
				setNickname((String)newValue);
				return;
			case PartyPackage.PERSON__OCCUPATION:
				setOccupation((String)newValue);
				return;
			case PartyPackage.PERSON__OTHER_LOCAL:
				setOtherLocal((String)newValue);
				return;
			case PartyPackage.PERSON__PASSPORT_EXPIRE_DATE:
				setPassportExpireDate((Date)newValue);
				return;
			case PartyPackage.PERSON__PASSPORT_NUMBER:
				setPassportNumber((String)newValue);
				return;
			case PartyPackage.PERSON__PERSONAL_TITLE:
				setPersonalTitle((String)newValue);
				return;
			case PartyPackage.PERSON__RESIDENCE_STATUS_ENUM_ID:
				setResidenceStatusEnumId((String)newValue);
				return;
			case PartyPackage.PERSON__SALUTATION:
				setSalutation((String)newValue);
				return;
			case PartyPackage.PERSON__SOCIAL_SECURITY_NUMBER:
				setSocialSecurityNumber((String)newValue);
				return;
			case PartyPackage.PERSON__SUFFIX:
				setSuffix((String)newValue);
				return;
			case PartyPackage.PERSON__TOTAL_YEARS_WORK_EXPERIENCE:
				setTotalYearsWorkExperience((Double)newValue);
				return;
			case PartyPackage.PERSON__WEIGHT:
				setWeight((Double)newValue);
				return;
			case PartyPackage.PERSON__YEARS_WITH_EMPLOYER:
				setYearsWithEmployer((Long)newValue);
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
			case PartyPackage.PERSON__BIRTH_DATE:
				setBirthDate(BIRTH_DATE_EDEFAULT);
				return;
			case PartyPackage.PERSON__CARD_ID:
				setCardId(CARD_ID_EDEFAULT);
				return;
			case PartyPackage.PERSON__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PartyPackage.PERSON__DECEASED_DATE:
				setDeceasedDate(DECEASED_DATE_EDEFAULT);
				return;
			case PartyPackage.PERSON__EMPLOYMENT_STATUS_ENUM_ID:
				setEmploymentStatusEnumId(EMPLOYMENT_STATUS_ENUM_ID_EDEFAULT);
				return;
			case PartyPackage.PERSON__EXISTING_CUSTOMER:
				setExistingCustomer(EXISTING_CUSTOMER_EDEFAULT);
				return;
			case PartyPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case PartyPackage.PERSON__FIRST_NAME_LOCAL:
				setFirstNameLocal(FIRST_NAME_LOCAL_EDEFAULT);
				return;
			case PartyPackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case PartyPackage.PERSON__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PartyPackage.PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case PartyPackage.PERSON__LAST_NAME_LOCAL:
				setLastNameLocal(LAST_NAME_LOCAL_EDEFAULT);
				return;
			case PartyPackage.PERSON__MARITAL_STATUS:
				setMaritalStatus(MARITAL_STATUS_EDEFAULT);
				return;
			case PartyPackage.PERSON__MEMBER_ID:
				setMemberId(MEMBER_ID_EDEFAULT);
				return;
			case PartyPackage.PERSON__MIDDLE_NAME:
				setMiddleName(MIDDLE_NAME_EDEFAULT);
				return;
			case PartyPackage.PERSON__MIDDLE_NAME_LOCAL:
				setMiddleNameLocal(MIDDLE_NAME_LOCAL_EDEFAULT);
				return;
			case PartyPackage.PERSON__MONTHS_WITH_EMPLOYER:
				setMonthsWithEmployer(MONTHS_WITH_EMPLOYER_EDEFAULT);
				return;
			case PartyPackage.PERSON__MOTHERS_MAIDEN_NAME:
				setMothersMaidenName(MOTHERS_MAIDEN_NAME_EDEFAULT);
				return;
			case PartyPackage.PERSON__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case PartyPackage.PERSON__OCCUPATION:
				setOccupation(OCCUPATION_EDEFAULT);
				return;
			case PartyPackage.PERSON__OTHER_LOCAL:
				setOtherLocal(OTHER_LOCAL_EDEFAULT);
				return;
			case PartyPackage.PERSON__PASSPORT_EXPIRE_DATE:
				setPassportExpireDate(PASSPORT_EXPIRE_DATE_EDEFAULT);
				return;
			case PartyPackage.PERSON__PASSPORT_NUMBER:
				setPassportNumber(PASSPORT_NUMBER_EDEFAULT);
				return;
			case PartyPackage.PERSON__PERSONAL_TITLE:
				setPersonalTitle(PERSONAL_TITLE_EDEFAULT);
				return;
			case PartyPackage.PERSON__RESIDENCE_STATUS_ENUM_ID:
				setResidenceStatusEnumId(RESIDENCE_STATUS_ENUM_ID_EDEFAULT);
				return;
			case PartyPackage.PERSON__SALUTATION:
				setSalutation(SALUTATION_EDEFAULT);
				return;
			case PartyPackage.PERSON__SOCIAL_SECURITY_NUMBER:
				setSocialSecurityNumber(SOCIAL_SECURITY_NUMBER_EDEFAULT);
				return;
			case PartyPackage.PERSON__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case PartyPackage.PERSON__TOTAL_YEARS_WORK_EXPERIENCE:
				setTotalYearsWorkExperience(TOTAL_YEARS_WORK_EXPERIENCE_EDEFAULT);
				return;
			case PartyPackage.PERSON__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case PartyPackage.PERSON__YEARS_WITH_EMPLOYER:
				setYearsWithEmployer(YEARS_WITH_EMPLOYER_EDEFAULT);
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
			case PartyPackage.PERSON__BIRTH_DATE:
				return BIRTH_DATE_EDEFAULT == null ? birthDate != null : !BIRTH_DATE_EDEFAULT.equals(birthDate);
			case PartyPackage.PERSON__CARD_ID:
				return CARD_ID_EDEFAULT == null ? cardId != null : !CARD_ID_EDEFAULT.equals(cardId);
			case PartyPackage.PERSON__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PartyPackage.PERSON__DECEASED_DATE:
				return DECEASED_DATE_EDEFAULT == null ? deceasedDate != null : !DECEASED_DATE_EDEFAULT.equals(deceasedDate);
			case PartyPackage.PERSON__EMPLOYMENT_STATUS_ENUM_ID:
				return EMPLOYMENT_STATUS_ENUM_ID_EDEFAULT == null ? employmentStatusEnumId != null : !EMPLOYMENT_STATUS_ENUM_ID_EDEFAULT.equals(employmentStatusEnumId);
			case PartyPackage.PERSON__EXISTING_CUSTOMER:
				return existingCustomer != EXISTING_CUSTOMER_EDEFAULT;
			case PartyPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case PartyPackage.PERSON__FIRST_NAME_LOCAL:
				return FIRST_NAME_LOCAL_EDEFAULT == null ? firstNameLocal != null : !FIRST_NAME_LOCAL_EDEFAULT.equals(firstNameLocal);
			case PartyPackage.PERSON__GENDER:
				return gender != GENDER_EDEFAULT;
			case PartyPackage.PERSON__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case PartyPackage.PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case PartyPackage.PERSON__LAST_NAME_LOCAL:
				return LAST_NAME_LOCAL_EDEFAULT == null ? lastNameLocal != null : !LAST_NAME_LOCAL_EDEFAULT.equals(lastNameLocal);
			case PartyPackage.PERSON__MARITAL_STATUS:
				return maritalStatus != MARITAL_STATUS_EDEFAULT;
			case PartyPackage.PERSON__MEMBER_ID:
				return MEMBER_ID_EDEFAULT == null ? memberId != null : !MEMBER_ID_EDEFAULT.equals(memberId);
			case PartyPackage.PERSON__MIDDLE_NAME:
				return MIDDLE_NAME_EDEFAULT == null ? middleName != null : !MIDDLE_NAME_EDEFAULT.equals(middleName);
			case PartyPackage.PERSON__MIDDLE_NAME_LOCAL:
				return MIDDLE_NAME_LOCAL_EDEFAULT == null ? middleNameLocal != null : !MIDDLE_NAME_LOCAL_EDEFAULT.equals(middleNameLocal);
			case PartyPackage.PERSON__MONTHS_WITH_EMPLOYER:
				return monthsWithEmployer != MONTHS_WITH_EMPLOYER_EDEFAULT;
			case PartyPackage.PERSON__MOTHERS_MAIDEN_NAME:
				return MOTHERS_MAIDEN_NAME_EDEFAULT == null ? mothersMaidenName != null : !MOTHERS_MAIDEN_NAME_EDEFAULT.equals(mothersMaidenName);
			case PartyPackage.PERSON__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case PartyPackage.PERSON__OCCUPATION:
				return OCCUPATION_EDEFAULT == null ? occupation != null : !OCCUPATION_EDEFAULT.equals(occupation);
			case PartyPackage.PERSON__OTHER_LOCAL:
				return OTHER_LOCAL_EDEFAULT == null ? otherLocal != null : !OTHER_LOCAL_EDEFAULT.equals(otherLocal);
			case PartyPackage.PERSON__PASSPORT_EXPIRE_DATE:
				return PASSPORT_EXPIRE_DATE_EDEFAULT == null ? passportExpireDate != null : !PASSPORT_EXPIRE_DATE_EDEFAULT.equals(passportExpireDate);
			case PartyPackage.PERSON__PASSPORT_NUMBER:
				return PASSPORT_NUMBER_EDEFAULT == null ? passportNumber != null : !PASSPORT_NUMBER_EDEFAULT.equals(passportNumber);
			case PartyPackage.PERSON__PERSONAL_TITLE:
				return PERSONAL_TITLE_EDEFAULT == null ? personalTitle != null : !PERSONAL_TITLE_EDEFAULT.equals(personalTitle);
			case PartyPackage.PERSON__RESIDENCE_STATUS_ENUM_ID:
				return RESIDENCE_STATUS_ENUM_ID_EDEFAULT == null ? residenceStatusEnumId != null : !RESIDENCE_STATUS_ENUM_ID_EDEFAULT.equals(residenceStatusEnumId);
			case PartyPackage.PERSON__SALUTATION:
				return SALUTATION_EDEFAULT == null ? salutation != null : !SALUTATION_EDEFAULT.equals(salutation);
			case PartyPackage.PERSON__SOCIAL_SECURITY_NUMBER:
				return SOCIAL_SECURITY_NUMBER_EDEFAULT == null ? socialSecurityNumber != null : !SOCIAL_SECURITY_NUMBER_EDEFAULT.equals(socialSecurityNumber);
			case PartyPackage.PERSON__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
			case PartyPackage.PERSON__TOTAL_YEARS_WORK_EXPERIENCE:
				return totalYearsWorkExperience != TOTAL_YEARS_WORK_EXPERIENCE_EDEFAULT;
			case PartyPackage.PERSON__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case PartyPackage.PERSON__YEARS_WITH_EMPLOYER:
				return yearsWithEmployer != YEARS_WITH_EMPLOYER_EDEFAULT;
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
		result.append(" (birthDate: ");
		result.append(birthDate);
		result.append(", cardId: ");
		result.append(cardId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", deceasedDate: ");
		result.append(deceasedDate);
		result.append(", employmentStatusEnumId: ");
		result.append(employmentStatusEnumId);
		result.append(", existingCustomer: ");
		result.append(existingCustomer);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", firstNameLocal: ");
		result.append(firstNameLocal);
		result.append(", gender: ");
		result.append(gender);
		result.append(", height: ");
		result.append(height);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", lastNameLocal: ");
		result.append(lastNameLocal);
		result.append(", maritalStatus: ");
		result.append(maritalStatus);
		result.append(", memberId: ");
		result.append(memberId);
		result.append(", middleName: ");
		result.append(middleName);
		result.append(", middleNameLocal: ");
		result.append(middleNameLocal);
		result.append(", monthsWithEmployer: ");
		result.append(monthsWithEmployer);
		result.append(", mothersMaidenName: ");
		result.append(mothersMaidenName);
		result.append(", nickname: ");
		result.append(nickname);
		result.append(", occupation: ");
		result.append(occupation);
		result.append(", otherLocal: ");
		result.append(otherLocal);
		result.append(", passportExpireDate: ");
		result.append(passportExpireDate);
		result.append(", passportNumber: ");
		result.append(passportNumber);
		result.append(", personalTitle: ");
		result.append(personalTitle);
		result.append(", residenceStatusEnumId: ");
		result.append(residenceStatusEnumId);
		result.append(", salutation: ");
		result.append(salutation);
		result.append(", socialSecurityNumber: ");
		result.append(socialSecurityNumber);
		result.append(", suffix: ");
		result.append(suffix);
		result.append(", totalYearsWorkExperience: ");
		result.append(totalYearsWorkExperience);
		result.append(", weight: ");
		result.append(weight);
		result.append(", yearsWithEmployer: ");
		result.append(yearsWithEmployer);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
