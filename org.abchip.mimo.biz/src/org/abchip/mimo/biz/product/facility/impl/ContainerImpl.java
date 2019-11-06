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
import org.abchip.mimo.biz.product.facility.ContainerType;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ContainerImpl#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ContainerImpl#getContainerTypeId <em>Container Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.ContainerImpl#getFacilityId <em>Facility Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends BizEntityTypedImpl<ContainerType> implements org.abchip.mimo.biz.product.facility.Container {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getContainerId() <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerId() <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerId()
	 * @generated
	 * @ordered
	 */
	protected String containerId = CONTAINER_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getContainerTypeId() <em>Container Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContainerType containerTypeId;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility facilityId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilityPackage.Literals.CONTAINER;
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
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerType getContainerTypeId() {
		if (containerTypeId != null && ((EObject)containerTypeId).eIsProxy()) {
			InternalEObject oldContainerTypeId = (InternalEObject)containerTypeId;
			containerTypeId = (ContainerType)eResolveProxy(oldContainerTypeId);
			if (containerTypeId != oldContainerTypeId) {
			}
		}
		return containerTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerType basicGetContainerTypeId() {
		return containerTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerTypeId(ContainerType newContainerTypeId) {
		containerTypeId = newContainerTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		if (facilityId != null && ((EObject)facilityId).eIsProxy()) {
			InternalEObject oldFacilityId = (InternalEObject)facilityId;
			facilityId = (Facility)eResolveProxy(oldFacilityId);
			if (facilityId != oldFacilityId) {
			}
		}
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		facilityId = newFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> inventoryItems() {
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
	public List<String> inventoryTransfers() {
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
	public List<String> toInventoryTransfers() {
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
	public String getContainerId() {
		return containerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerId(String newContainerId) {
		containerId = newContainerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilityPackage.CONTAINER__CONTAINER_ID:
				return getContainerId();
			case FacilityPackage.CONTAINER__DESCRIPTION:
				return getDescription();
			case FacilityPackage.CONTAINER__CONTAINER_TYPE_ID:
				if (resolve) return getContainerTypeId();
				return basicGetContainerTypeId();
			case FacilityPackage.CONTAINER__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
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
			case FacilityPackage.CONTAINER__CONTAINER_ID:
				setContainerId((String)newValue);
				return;
			case FacilityPackage.CONTAINER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FacilityPackage.CONTAINER__CONTAINER_TYPE_ID:
				setContainerTypeId((ContainerType)newValue);
				return;
			case FacilityPackage.CONTAINER__FACILITY_ID:
				setFacilityId((Facility)newValue);
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
			case FacilityPackage.CONTAINER__CONTAINER_ID:
				setContainerId(CONTAINER_ID_EDEFAULT);
				return;
			case FacilityPackage.CONTAINER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FacilityPackage.CONTAINER__CONTAINER_TYPE_ID:
				setContainerTypeId((ContainerType)null);
				return;
			case FacilityPackage.CONTAINER__FACILITY_ID:
				setFacilityId((Facility)null);
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
			case FacilityPackage.CONTAINER__CONTAINER_ID:
				return CONTAINER_ID_EDEFAULT == null ? containerId != null : !CONTAINER_ID_EDEFAULT.equals(containerId);
			case FacilityPackage.CONTAINER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FacilityPackage.CONTAINER__CONTAINER_TYPE_ID:
				return containerTypeId != null;
			case FacilityPackage.CONTAINER__FACILITY_ID:
				return facilityId != null;
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
		result.append(" (containerId: ");
		result.append(containerId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
