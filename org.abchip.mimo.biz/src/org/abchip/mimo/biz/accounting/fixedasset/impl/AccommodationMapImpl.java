/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.util.List;

import org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap;
import org.abchip.mimo.biz.accounting.fixedasset.AccommodationMapType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accommodation Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getAccommodationMapId <em>Accommodation Map Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getAccommodationClassId <em>Accommodation Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getAccommodationMapTypeId <em>Accommodation Map Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl#getNumberOfSpaces <em>Number Of Spaces</em>}</li>
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
	 * The default value of the '{@link #getAccommodationClassId() <em>Accommodation Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationClassId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOMMODATION_CLASS_ID_EDEFAULT = null;
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
	 * The default value of the '{@link #getAccommodationMapTypeId() <em>Accommodation Map Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationMapTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOMMODATION_MAP_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccommodationMapTypeId() <em>Accommodation Map Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationMapTypeId()
	 * @generated
	 * @ordered
	 */
	protected String accommodationMapTypeId = ACCOMMODATION_MAP_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetId = FIXED_ASSET_ID_EDEFAULT;
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
		String oldAccommodationMapId = accommodationMapId;
		accommodationMapId = newAccommodationMapId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID, oldAccommodationMapId, accommodationMapId));
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
		long oldNumberOfSpaces = numberOfSpaces;
		numberOfSpaces = newNumberOfSpaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.ACCOMMODATION_MAP__NUMBER_OF_SPACES, oldNumberOfSpaces, numberOfSpaces));
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
		String oldAccommodationClassId = accommodationClassId;
		accommodationClassId = newAccommodationClassId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID, oldAccommodationClassId, accommodationClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		String oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.ACCOMMODATION_MAP__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccommodationMapTypeId() {
		return accommodationMapTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationMapTypeId(String newAccommodationMapTypeId) {
		String oldAccommodationMapTypeId = accommodationMapTypeId;
		accommodationMapTypeId = newAccommodationMapTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID, oldAccommodationMapTypeId, accommodationMapTypeId));
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
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID:
				return getAccommodationClassId();
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID:
				return getAccommodationMapTypeId();
			case FixedassetPackage.ACCOMMODATION_MAP__FIXED_ASSET_ID:
				return getFixedAssetId();
			case FixedassetPackage.ACCOMMODATION_MAP__NUMBER_OF_SPACES:
				return getNumberOfSpaces();
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
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID:
				setAccommodationClassId((String)newValue);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID:
				setAccommodationMapTypeId((String)newValue);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__NUMBER_OF_SPACES:
				setNumberOfSpaces((Long)newValue);
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
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID:
				setAccommodationClassId(ACCOMMODATION_CLASS_ID_EDEFAULT);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID:
				setAccommodationMapTypeId(ACCOMMODATION_MAP_TYPE_ID_EDEFAULT);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case FixedassetPackage.ACCOMMODATION_MAP__NUMBER_OF_SPACES:
				setNumberOfSpaces(NUMBER_OF_SPACES_EDEFAULT);
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
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID:
				return ACCOMMODATION_CLASS_ID_EDEFAULT == null ? accommodationClassId != null : !ACCOMMODATION_CLASS_ID_EDEFAULT.equals(accommodationClassId);
			case FixedassetPackage.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID:
				return ACCOMMODATION_MAP_TYPE_ID_EDEFAULT == null ? accommodationMapTypeId != null : !ACCOMMODATION_MAP_TYPE_ID_EDEFAULT.equals(accommodationMapTypeId);
			case FixedassetPackage.ACCOMMODATION_MAP__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case FixedassetPackage.ACCOMMODATION_MAP__NUMBER_OF_SPACES:
				return numberOfSpaces != NUMBER_OF_SPACES_EDEFAULT;
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
		result.append(", accommodationClassId: ");
		result.append(accommodationClassId);
		result.append(", accommodationMapTypeId: ");
		result.append(accommodationMapTypeId);
		result.append(", fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", numberOfSpaces: ");
		result.append(numberOfSpaces);
		result.append(')');
		return result.toString();
	}

} //AccommodationMapImpl
