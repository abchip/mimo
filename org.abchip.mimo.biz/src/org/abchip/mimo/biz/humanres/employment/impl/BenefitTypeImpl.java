/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import java.util.List;

import org.abchip.mimo.biz.humanres.employment.BenefitType;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class BenefitTypeImpl extends BizEntityImpl implements BenefitType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getBenefitTypeId() <em>Benefit Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String BENEFIT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBenefitTypeId() <em>Benefit Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitTypeId()
	 * @generated
	 * @ordered
	 */
	protected String benefitTypeId = BENEFIT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBenefitName() <em>Benefit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitName()
	 * @generated
	 * @ordered
	 */
	protected static final String BENEFIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBenefitName() <em>Benefit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitName()
	 * @generated
	 * @ordered
	 */
	protected String benefitName = BENEFIT_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getEmployerPaidPercentage() <em>Employer Paid Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerPaidPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double EMPLOYER_PAID_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEmployerPaidPercentage() <em>Employer Paid Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerPaidPercentage()
	 * @generated
	 * @ordered
	 */
	protected double employerPaidPercentage = EMPLOYER_PAID_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected BenefitType parentTypeId;

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
		return benefitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefitName(String newBenefitName) {
		String oldBenefitName = benefitName;
		benefitName = newBenefitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.BENEFIT_TYPE__BENEFIT_NAME, oldBenefitName, benefitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBenefitTypeId() {
		return benefitTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBenefitTypeId(String newBenefitTypeId) {
		String oldBenefitTypeId = benefitTypeId;
		benefitTypeId = newBenefitTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.BENEFIT_TYPE__BENEFIT_TYPE_ID, oldBenefitTypeId, benefitTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.BENEFIT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEmployerPaidPercentage() {
		return employerPaidPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployerPaidPercentage(double newEmployerPaidPercentage) {
		double oldEmployerPaidPercentage = employerPaidPercentage;
		employerPaidPercentage = newEmployerPaidPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.BENEFIT_TYPE__EMPLOYER_PAID_PERCENTAGE, oldEmployerPaidPercentage, employerPaidPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.BENEFIT_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BenefitType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (BenefitType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.BENEFIT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(BenefitType newParentTypeId) {
		BenefitType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.BENEFIT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childBenefitTypes() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmploymentPackage.BENEFIT_TYPE__BENEFIT_TYPE_ID:
				return getBenefitTypeId();
			case EmploymentPackage.BENEFIT_TYPE__BENEFIT_NAME:
				return getBenefitName();
			case EmploymentPackage.BENEFIT_TYPE__DESCRIPTION:
				return getDescription();
			case EmploymentPackage.BENEFIT_TYPE__EMPLOYER_PAID_PERCENTAGE:
				return getEmployerPaidPercentage();
			case EmploymentPackage.BENEFIT_TYPE__HAS_TABLE:
				return isHasTable();
			case EmploymentPackage.BENEFIT_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
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
			case EmploymentPackage.BENEFIT_TYPE__BENEFIT_TYPE_ID:
				setBenefitTypeId((String)newValue);
				return;
			case EmploymentPackage.BENEFIT_TYPE__BENEFIT_NAME:
				setBenefitName((String)newValue);
				return;
			case EmploymentPackage.BENEFIT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EmploymentPackage.BENEFIT_TYPE__EMPLOYER_PAID_PERCENTAGE:
				setEmployerPaidPercentage((Double)newValue);
				return;
			case EmploymentPackage.BENEFIT_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case EmploymentPackage.BENEFIT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((BenefitType)newValue);
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
			case EmploymentPackage.BENEFIT_TYPE__BENEFIT_TYPE_ID:
				setBenefitTypeId(BENEFIT_TYPE_ID_EDEFAULT);
				return;
			case EmploymentPackage.BENEFIT_TYPE__BENEFIT_NAME:
				setBenefitName(BENEFIT_NAME_EDEFAULT);
				return;
			case EmploymentPackage.BENEFIT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EmploymentPackage.BENEFIT_TYPE__EMPLOYER_PAID_PERCENTAGE:
				setEmployerPaidPercentage(EMPLOYER_PAID_PERCENTAGE_EDEFAULT);
				return;
			case EmploymentPackage.BENEFIT_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case EmploymentPackage.BENEFIT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((BenefitType)null);
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
			case EmploymentPackage.BENEFIT_TYPE__BENEFIT_TYPE_ID:
				return BENEFIT_TYPE_ID_EDEFAULT == null ? benefitTypeId != null : !BENEFIT_TYPE_ID_EDEFAULT.equals(benefitTypeId);
			case EmploymentPackage.BENEFIT_TYPE__BENEFIT_NAME:
				return BENEFIT_NAME_EDEFAULT == null ? benefitName != null : !BENEFIT_NAME_EDEFAULT.equals(benefitName);
			case EmploymentPackage.BENEFIT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EmploymentPackage.BENEFIT_TYPE__EMPLOYER_PAID_PERCENTAGE:
				return employerPaidPercentage != EMPLOYER_PAID_PERCENTAGE_EDEFAULT;
			case EmploymentPackage.BENEFIT_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case EmploymentPackage.BENEFIT_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
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
		result.append(" (benefitTypeId: ");
		result.append(benefitTypeId);
		result.append(", benefitName: ");
		result.append(benefitName);
		result.append(", description: ");
		result.append(description);
		result.append(", employerPaidPercentage: ");
		result.append(employerPaidPercentage);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(')');
		return result.toString();
	}

} //BenefitTypeImpl
