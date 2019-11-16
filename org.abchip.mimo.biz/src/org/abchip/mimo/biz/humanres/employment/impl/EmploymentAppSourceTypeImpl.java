/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.humanres.employment.EmploymentAppSourceType;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employment App Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppSourceTypeImpl#getEmploymentAppSourceTypeId <em>Employment App Source Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppSourceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppSourceTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppSourceTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmploymentAppSourceTypeImpl extends BizEntityImpl implements EmploymentAppSourceType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmploymentAppSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmploymentAppSourceTypeId() {
		return (String)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE__EMPLOYMENT_APP_SOURCE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmploymentAppSourceTypeId(String newEmploymentAppSourceTypeId) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE__EMPLOYMENT_APP_SOURCE_TYPE_ID, newEmploymentAppSourceTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmploymentAppSourceType getParentTypeId() {
		return (EmploymentAppSourceType)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(EmploymentAppSourceType newParentTypeId) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childEmploymentAppSourceTypes() {
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
	public List<String> employmentApps() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE___CHILD_EMPLOYMENT_APP_SOURCE_TYPES:
				return childEmploymentAppSourceTypes();
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE___EMPLOYMENT_APPS:
				return employmentApps();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EmploymentAppSourceTypeImpl
