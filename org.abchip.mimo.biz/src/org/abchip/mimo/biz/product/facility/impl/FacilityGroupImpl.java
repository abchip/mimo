/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.facility.FacilityGroup;
import org.abchip.mimo.biz.product.facility.FacilityGroupType;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupImpl#getFacilityGroupId <em>Facility Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupImpl#getFacilityGroupName <em>Facility Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupImpl#getFacilityGroupTypeId <em>Facility Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupImpl#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacilityGroupImpl extends BizEntityTypedImpl<FacilityGroupType> implements FacilityGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilityPackage.Literals.FACILITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_GROUP__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(FacilityPackage.Literals.FACILITY_GROUP__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityGroupName() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_GROUP__FACILITY_GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityGroupName(String newFacilityGroupName) {
		eSet(FacilityPackage.Literals.FACILITY_GROUP__FACILITY_GROUP_NAME, newFacilityGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroupType getFacilityGroupTypeId() {
		return (FacilityGroupType)eGet(FacilityPackage.Literals.FACILITY_GROUP__FACILITY_GROUP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityGroupTypeId(FacilityGroupType newFacilityGroupTypeId) {
		eSet(FacilityPackage.Literals.FACILITY_GROUP__FACILITY_GROUP_TYPE_ID, newFacilityGroupTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroup getPrimaryParentGroupId() {
		return (FacilityGroup)eGet(FacilityPackage.Literals.FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryParentGroupId(FacilityGroup newPrimaryParentGroupId) {
		eSet(FacilityPackage.Literals.FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID, newPrimaryParentGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> facilities() {
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
			case FacilityPackage.FACILITY_GROUP___FACILITIES:
				return facilities();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityGroupId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_GROUP__FACILITY_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityGroupId(String newFacilityGroupId) {
		eSet(FacilityPackage.Literals.FACILITY_GROUP__FACILITY_GROUP_ID, newFacilityGroupId);
	}

} //FacilityGroupImpl
