/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.facility.FacilityGroup;
import org.abchip.mimo.biz.product.facility.FacilityGroupType;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getFacilityGroupId() <em>Facility Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityGroupId() <em>Facility Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityGroupId()
	 * @generated
	 * @ordered
	 */
	protected String facilityGroupId = FACILITY_GROUP_ID_EDEFAULT;

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
	 * The default value of the '{@link #getFacilityGroupName() <em>Facility Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityGroupName() <em>Facility Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityGroupName()
	 * @generated
	 * @ordered
	 */
	protected String facilityGroupName = FACILITY_GROUP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFacilityGroupTypeId() <em>Facility Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected FacilityGroupType facilityGroupTypeId;

	/**
	 * The cached value of the '{@link #getPrimaryParentGroupId() <em>Primary Parent Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryParentGroupId()
	 * @generated
	 * @ordered
	 */
	protected FacilityGroup primaryParentGroupId;

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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityGroupName() {
		return facilityGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityGroupName(String newFacilityGroupName) {
		String oldFacilityGroupName = facilityGroupName;
		facilityGroupName = newFacilityGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_NAME, oldFacilityGroupName, facilityGroupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroupType getFacilityGroupTypeId() {
		if (facilityGroupTypeId != null && ((EObject)facilityGroupTypeId).eIsProxy()) {
			InternalEObject oldFacilityGroupTypeId = (InternalEObject)facilityGroupTypeId;
			facilityGroupTypeId = (FacilityGroupType)eResolveProxy(oldFacilityGroupTypeId);
			if (facilityGroupTypeId != oldFacilityGroupTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_TYPE_ID, oldFacilityGroupTypeId, facilityGroupTypeId));
			}
		}
		return facilityGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityGroupType basicGetFacilityGroupTypeId() {
		return facilityGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityGroupTypeId(FacilityGroupType newFacilityGroupTypeId) {
		FacilityGroupType oldFacilityGroupTypeId = facilityGroupTypeId;
		facilityGroupTypeId = newFacilityGroupTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_TYPE_ID, oldFacilityGroupTypeId, facilityGroupTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroup getPrimaryParentGroupId() {
		if (primaryParentGroupId != null && ((EObject)primaryParentGroupId).eIsProxy()) {
			InternalEObject oldPrimaryParentGroupId = (InternalEObject)primaryParentGroupId;
			primaryParentGroupId = (FacilityGroup)eResolveProxy(oldPrimaryParentGroupId);
			if (primaryParentGroupId != oldPrimaryParentGroupId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID, oldPrimaryParentGroupId, primaryParentGroupId));
			}
		}
		return primaryParentGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityGroup basicGetPrimaryParentGroupId() {
		return primaryParentGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryParentGroupId(FacilityGroup newPrimaryParentGroupId) {
		FacilityGroup oldPrimaryParentGroupId = primaryParentGroupId;
		primaryParentGroupId = newPrimaryParentGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID, oldPrimaryParentGroupId, primaryParentGroupId));
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
	public String getFacilityGroupId() {
		return facilityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityGroupId(String newFacilityGroupId) {
		String oldFacilityGroupId = facilityGroupId;
		facilityGroupId = newFacilityGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_ID, oldFacilityGroupId, facilityGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_ID:
				return getFacilityGroupId();
			case FacilityPackage.FACILITY_GROUP__DESCRIPTION:
				return getDescription();
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_NAME:
				return getFacilityGroupName();
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_TYPE_ID:
				if (resolve) return getFacilityGroupTypeId();
				return basicGetFacilityGroupTypeId();
			case FacilityPackage.FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID:
				if (resolve) return getPrimaryParentGroupId();
				return basicGetPrimaryParentGroupId();
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
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_ID:
				setFacilityGroupId((String)newValue);
				return;
			case FacilityPackage.FACILITY_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_NAME:
				setFacilityGroupName((String)newValue);
				return;
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_TYPE_ID:
				setFacilityGroupTypeId((FacilityGroupType)newValue);
				return;
			case FacilityPackage.FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID:
				setPrimaryParentGroupId((FacilityGroup)newValue);
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
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_ID:
				setFacilityGroupId(FACILITY_GROUP_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_NAME:
				setFacilityGroupName(FACILITY_GROUP_NAME_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_TYPE_ID:
				setFacilityGroupTypeId((FacilityGroupType)null);
				return;
			case FacilityPackage.FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID:
				setPrimaryParentGroupId((FacilityGroup)null);
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
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_ID:
				return FACILITY_GROUP_ID_EDEFAULT == null ? facilityGroupId != null : !FACILITY_GROUP_ID_EDEFAULT.equals(facilityGroupId);
			case FacilityPackage.FACILITY_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_NAME:
				return FACILITY_GROUP_NAME_EDEFAULT == null ? facilityGroupName != null : !FACILITY_GROUP_NAME_EDEFAULT.equals(facilityGroupName);
			case FacilityPackage.FACILITY_GROUP__FACILITY_GROUP_TYPE_ID:
				return facilityGroupTypeId != null;
			case FacilityPackage.FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID:
				return primaryParentGroupId != null;
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
		result.append(" (facilityGroupId: ");
		result.append(facilityGroupId);
		result.append(", description: ");
		result.append(description);
		result.append(", facilityGroupName: ");
		result.append(facilityGroupName);
		result.append(')');
		return result.toString();
	}

} //FacilityGroupImpl
