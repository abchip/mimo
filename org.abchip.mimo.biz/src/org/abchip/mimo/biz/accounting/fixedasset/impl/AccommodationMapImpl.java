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
import org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap;
import org.abchip.mimo.biz.accounting.fixedasset.AccommodationMapType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accommodation Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getAccommodationMapId <em>Accommodation Map Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getNumberOfSpaces <em>Number Of Spaces</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getAccommodationClassId <em>Accommodation Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getAccommodationMapTypeId <em>Accommodation Map Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccommodationMapImpl extends BizEntityTypedImpl<AccommodationMapType> implements AccommodationMap {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getAccommodationMapId() <em>Accommodation Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationMapId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOMMODATION_MAP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAccommodationMapId() <em>Accommodation Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationMapId()
	 * @generated
	 * @ordered
	 */
	protected String accommodationMapId = ACCOMMODATION_MAP_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumberOfSpaces() <em>Number Of Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSpaces()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMBER_OF_SPACES_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getNumberOfSpaces() <em>Number Of Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSpaces()
	 * @generated
	 * @ordered
	 */
	protected long numberOfSpaces = NUMBER_OF_SPACES_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAccommodationClassId() <em>Accommodation Class Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationClassId()
	 * @generated
	 * @ordered
	 */
	protected AccommodationClass accommodationClassId;
	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;
	/**
	 * The cached value of the '{@link #getAccommodationMapTypeId() <em>Accommodation Map Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationMapTypeId()
	 * @generated
	 * @ordered
	 */
	protected AccommodationMapType accommodationMapTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccommodationMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.ACCOMMODATION_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccommodationMapId() {
		return accommodationMapId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationMapId(String newAccommodationMapId) {
		accommodationMapId = newAccommodationMapId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumberOfSpaces() {
		return numberOfSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfSpaces(long newNumberOfSpaces) {
		numberOfSpaces = newNumberOfSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> workEfforts() {
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
	public AccommodationClass getAccommodationClassId() {
		if (accommodationClassId != null && ((EObject)accommodationClassId).eIsProxy()) {
			InternalEObject oldAccommodationClassId = (InternalEObject)accommodationClassId;
			accommodationClassId = (AccommodationClass)eResolveProxy(oldAccommodationClassId);
			if (accommodationClassId != oldAccommodationClassId) {
			}
		}
		return accommodationClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccommodationClass basicGetAccommodationClassId() {
		return accommodationClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationClassId(AccommodationClass newAccommodationClassId) {
		accommodationClassId = newAccommodationClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		fixedAssetId = newFixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccommodationMapType getAccommodationMapTypeId() {
		if (accommodationMapTypeId != null && ((EObject)accommodationMapTypeId).eIsProxy()) {
			InternalEObject oldAccommodationMapTypeId = (InternalEObject)accommodationMapTypeId;
			accommodationMapTypeId = (AccommodationMapType)eResolveProxy(oldAccommodationMapTypeId);
			if (accommodationMapTypeId != oldAccommodationMapTypeId) {
			}
		}
		return accommodationMapTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccommodationMapType basicGetAccommodationMapTypeId() {
		return accommodationMapTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationMapTypeId(AccommodationMapType newAccommodationMapTypeId) {
		accommodationMapTypeId = newAccommodationMapTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID:
				return getAccommodationMapId();
			case FixedassetPackage.ACCOMMODATION_MAP__NUMBER_OF_SPACES:
				return getNumberOfSpaces();
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID:
				if (resolve) return getAccommodationClassId();
				return basicGetAccommodationClassId();
			case FixedassetPackage.ACCOMMODATION_MAP__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID:
				if (resolve) return getAccommodationMapTypeId();
				return basicGetAccommodationMapTypeId();
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
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID:
				setAccommodationMapId((String)newValue);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__NUMBER_OF_SPACES:
				setNumberOfSpaces((Long)newValue);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID:
				setAccommodationClassId((AccommodationClass)newValue);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID:
				setAccommodationMapTypeId((AccommodationMapType)newValue);
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
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID:
				setAccommodationMapId(ACCOMMODATION_MAP_ID_EDEFAULT);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__NUMBER_OF_SPACES:
				setNumberOfSpaces(NUMBER_OF_SPACES_EDEFAULT);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID:
				setAccommodationClassId((AccommodationClass)null);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID:
				setAccommodationMapTypeId((AccommodationMapType)null);
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
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID:
				return ACCOMMODATION_MAP_ID_EDEFAULT == null ? accommodationMapId != null : !ACCOMMODATION_MAP_ID_EDEFAULT.equals(accommodationMapId);
			case FixedassetPackage.ACCOMMODATION_MAP__NUMBER_OF_SPACES:
				return numberOfSpaces != NUMBER_OF_SPACES_EDEFAULT;
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID:
				return accommodationClassId != null;
			case FixedassetPackage.ACCOMMODATION_MAP__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID:
				return accommodationMapTypeId != null;
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
		result.append(" (accommodationMapId: ");
		result.append(accommodationMapId);
		result.append(", numberOfSpaces: ");
		result.append(numberOfSpaces);
		result.append(')');
		return result.toString();
	}

} //AccommodationMapImpl
