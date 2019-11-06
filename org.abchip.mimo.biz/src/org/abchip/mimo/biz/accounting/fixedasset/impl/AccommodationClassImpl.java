/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.util.List;

import org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accommodation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationClassImpl#getAccommodationClassId <em>Accommodation Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationClassImpl#getParentClassId <em>Parent Class Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccommodationClassImpl extends BizEntityImpl implements AccommodationClass {
	/**
	 * The default value of the '{@link #getAccommodationClassId() <em>Accommodation Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationClassId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOMMODATION_CLASS_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getAccommodationClassId() <em>Accommodation Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationClassId()
	 * @generated
	 * @ordered
	 */
	protected String accommodationClassId = ACCOMMODATION_CLASS_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getParentClassId() <em>Parent Class Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClassId()
	 * @generated
	 * @ordered
	 */
	protected AccommodationClass parentClassId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccommodationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.ACCOMMODATION_CLASS;
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
	public AccommodationClass getParentClassId() {
		if (parentClassId != null && ((EObject)parentClassId).eIsProxy()) {
			InternalEObject oldParentClassId = (InternalEObject)parentClassId;
			parentClassId = (AccommodationClass)eResolveProxy(oldParentClassId);
			if (parentClassId != oldParentClassId) {
			}
		}
		return parentClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccommodationClass basicGetParentClassId() {
		return parentClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentClassId(AccommodationClass newParentClassId) {
		parentClassId = newParentClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> accommodationMaps() {
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
	public List<String> accommodationSpots() {
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
	public List<String> childAccommodationClasses() {
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
	public String getAccommodationClassId() {
		return accommodationClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationClassId(String newAccommodationClassId) {
		accommodationClassId = newAccommodationClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.ACCOMMODATION_CLASS__ACCOMMODATION_CLASS_ID:
				return getAccommodationClassId();
			case FixedassetPackage.ACCOMMODATION_CLASS__DESCRIPTION:
				return getDescription();
			case FixedassetPackage.ACCOMMODATION_CLASS__PARENT_CLASS_ID:
				if (resolve) return getParentClassId();
				return basicGetParentClassId();
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
			case FixedassetPackage.ACCOMMODATION_CLASS__ACCOMMODATION_CLASS_ID:
				setAccommodationClassId((String)newValue);
				return;
			case FixedassetPackage.ACCOMMODATION_CLASS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FixedassetPackage.ACCOMMODATION_CLASS__PARENT_CLASS_ID:
				setParentClassId((AccommodationClass)newValue);
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
			case FixedassetPackage.ACCOMMODATION_CLASS__ACCOMMODATION_CLASS_ID:
				setAccommodationClassId(ACCOMMODATION_CLASS_ID_EDEFAULT);
				return;
			case FixedassetPackage.ACCOMMODATION_CLASS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FixedassetPackage.ACCOMMODATION_CLASS__PARENT_CLASS_ID:
				setParentClassId((AccommodationClass)null);
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
			case FixedassetPackage.ACCOMMODATION_CLASS__ACCOMMODATION_CLASS_ID:
				return ACCOMMODATION_CLASS_ID_EDEFAULT == null ? accommodationClassId != null : !ACCOMMODATION_CLASS_ID_EDEFAULT.equals(accommodationClassId);
			case FixedassetPackage.ACCOMMODATION_CLASS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FixedassetPackage.ACCOMMODATION_CLASS__PARENT_CLASS_ID:
				return parentClassId != null;
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
		result.append(" (accommodationClassId: ");
		result.append(accommodationClassId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AccommodationClassImpl
