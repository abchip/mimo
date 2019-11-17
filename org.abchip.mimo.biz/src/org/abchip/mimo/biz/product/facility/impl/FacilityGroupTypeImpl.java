/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.facility.FacilityGroup;
import org.abchip.mimo.biz.product.facility.FacilityGroupType;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupTypeImpl#getFacilityGroupTypeId <em>Facility Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacilityGroupTypeImpl extends BizEntityTypeImpl<FacilityGroup> implements FacilityGroupType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilityPackage.Literals.FACILITY_GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_GROUP_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(FacilityPackage.Literals.FACILITY_GROUP_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> facilityGroups() {
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
	public String getFacilityGroupTypeId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_GROUP_TYPE__FACILITY_GROUP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityGroupTypeId(String newFacilityGroupTypeId) {
		eSet(FacilityPackage.Literals.FACILITY_GROUP_TYPE__FACILITY_GROUP_TYPE_ID, newFacilityGroupTypeId);
	}

} //FacilityGroupTypeImpl
