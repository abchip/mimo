/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Benefit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getBenefitTypeId <em>Benefit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getBenefitName <em>Benefit Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getEmployerPaidPercentage <em>Employer Paid Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.BenefitType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getBenefitType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface BenefitType extends BizEntityType<PartyBenefit> {
	/**
	 * Returns the value of the '<em><b>Benefit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Name</em>' attribute.
	 * @see #setBenefitName(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getBenefitType_BenefitName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getBenefitName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getBenefitName <em>Benefit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Name</em>' attribute.
	 * @see #getBenefitName()
	 * @generated
	 */
	void setBenefitName(String value);

	/**
	 * Returns the value of the '<em><b>Benefit Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Type Id</em>' attribute.
	 * @see #setBenefitTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getBenefitType_BenefitTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBenefitTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getBenefitTypeId <em>Benefit Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Type Id</em>' attribute.
	 * @see #getBenefitTypeId()
	 * @generated
	 */
	void setBenefitTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getBenefitType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Employer Paid Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer Paid Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer Paid Percentage</em>' attribute.
	 * @see #setEmployerPaidPercentage(double)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getBenefitType_EmployerPaidPercentage()
	 * @model
	 * @generated
	 */
	double getEmployerPaidPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getEmployerPaidPercentage <em>Employer Paid Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employer Paid Percentage</em>' attribute.
	 * @see #getEmployerPaidPercentage()
	 * @generated
	 */
	void setEmployerPaidPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getBenefitType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.BenefitType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(BenefitType)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getBenefitType_ParentTypeId()
	 * @model keys="benefitTypeId"
	 * @generated
	 */
	BenefitType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.BenefitType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(BenefitType value);

} // BenefitType
