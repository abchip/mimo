/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import org.abchip.mimo.biz.humanres.employment.BenefitType;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.humanres.employment.PartyBenefit;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Benefit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.BenefitTypeImpl#getBenefitTypeId <em>Benefit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.BenefitTypeImpl#getBenefitName <em>Benefit Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.BenefitTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.BenefitTypeImpl#getEmployerPaidPercentage <em>Employer Paid Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.BenefitTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.BenefitTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BenefitTypeImpl extends BizEntityTypeImpl<PartyBenefit> implements BenefitType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BenefitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.BENEFIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBenefitName() {
		return (String)eGet(EmploymentPackage.Literals.BENEFIT_TYPE__BENEFIT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefitName(String newBenefitName) {
		eSet(EmploymentPackage.Literals.BENEFIT_TYPE__BENEFIT_NAME, newBenefitName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBenefitTypeId() {
		return (String)eGet(EmploymentPackage.Literals.BENEFIT_TYPE__BENEFIT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefitTypeId(String newBenefitTypeId) {
		eSet(EmploymentPackage.Literals.BENEFIT_TYPE__BENEFIT_TYPE_ID, newBenefitTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(EmploymentPackage.Literals.BENEFIT_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(EmploymentPackage.Literals.BENEFIT_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEmployerPaidPercentage() {
		return (Double)eGet(EmploymentPackage.Literals.BENEFIT_TYPE__EMPLOYER_PAID_PERCENTAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployerPaidPercentage(double newEmployerPaidPercentage) {
		eSet(EmploymentPackage.Literals.BENEFIT_TYPE__EMPLOYER_PAID_PERCENTAGE, newEmployerPaidPercentage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(EmploymentPackage.Literals.BENEFIT_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(EmploymentPackage.Literals.BENEFIT_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BenefitType getParentTypeId() {
		return (BenefitType)eGet(EmploymentPackage.Literals.BENEFIT_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(BenefitType newParentTypeId) {
		eSet(EmploymentPackage.Literals.BENEFIT_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

} //BenefitTypeImpl
