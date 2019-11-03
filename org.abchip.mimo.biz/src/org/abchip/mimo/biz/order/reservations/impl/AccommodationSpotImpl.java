/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.reservations.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.reservations.AccommodationSpot;
import org.abchip.mimo.biz.order.reservations.ReservationsPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accommodation Spot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.impl.AccommodationSpotImpl#getAccommodationSpotId <em>Accommodation Spot Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.impl.AccommodationSpotImpl#getAccommodationClassId <em>Accommodation Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.impl.AccommodationSpotImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.impl.AccommodationSpotImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.reservations.impl.AccommodationSpotImpl#getNumberOfSpaces <em>Number Of Spaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccommodationSpotImpl extends BizEntityImpl implements AccommodationSpot {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getAccommodationSpotId() <em>Accommodation Spot Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationSpotId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOMMODATION_SPOT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccommodationSpotId() <em>Accommodation Spot Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationSpotId()
	 * @generated
	 * @ordered
	 */
	protected String accommodationSpotId = ACCOMMODATION_SPOT_ID_EDEFAULT;

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
	protected AccommodationSpotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationsPackage.Literals.ACCOMMODATION_SPOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_CLASS_ID, oldAccommodationClassId, accommodationClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccommodationSpotId() {
		return accommodationSpotId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationSpotId(String newAccommodationSpotId) {
		String oldAccommodationSpotId = accommodationSpotId;
		accommodationSpotId = newAccommodationSpotId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_SPOT_ID, oldAccommodationSpotId, accommodationSpotId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationsPackage.ACCOMMODATION_SPOT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationsPackage.ACCOMMODATION_SPOT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationsPackage.ACCOMMODATION_SPOT__NUMBER_OF_SPACES, oldNumberOfSpaces, numberOfSpaces));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_SPOT_ID:
				return getAccommodationSpotId();
			case ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_CLASS_ID:
				return getAccommodationClassId();
			case ReservationsPackage.ACCOMMODATION_SPOT__DESCRIPTION:
				return getDescription();
			case ReservationsPackage.ACCOMMODATION_SPOT__FIXED_ASSET_ID:
				return getFixedAssetId();
			case ReservationsPackage.ACCOMMODATION_SPOT__NUMBER_OF_SPACES:
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
			case ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_SPOT_ID:
				setAccommodationSpotId((String)newValue);
				return;
			case ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_CLASS_ID:
				setAccommodationClassId((String)newValue);
				return;
			case ReservationsPackage.ACCOMMODATION_SPOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ReservationsPackage.ACCOMMODATION_SPOT__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case ReservationsPackage.ACCOMMODATION_SPOT__NUMBER_OF_SPACES:
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
			case ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_SPOT_ID:
				setAccommodationSpotId(ACCOMMODATION_SPOT_ID_EDEFAULT);
				return;
			case ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_CLASS_ID:
				setAccommodationClassId(ACCOMMODATION_CLASS_ID_EDEFAULT);
				return;
			case ReservationsPackage.ACCOMMODATION_SPOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ReservationsPackage.ACCOMMODATION_SPOT__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case ReservationsPackage.ACCOMMODATION_SPOT__NUMBER_OF_SPACES:
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
			case ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_SPOT_ID:
				return ACCOMMODATION_SPOT_ID_EDEFAULT == null ? accommodationSpotId != null : !ACCOMMODATION_SPOT_ID_EDEFAULT.equals(accommodationSpotId);
			case ReservationsPackage.ACCOMMODATION_SPOT__ACCOMMODATION_CLASS_ID:
				return ACCOMMODATION_CLASS_ID_EDEFAULT == null ? accommodationClassId != null : !ACCOMMODATION_CLASS_ID_EDEFAULT.equals(accommodationClassId);
			case ReservationsPackage.ACCOMMODATION_SPOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ReservationsPackage.ACCOMMODATION_SPOT__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case ReservationsPackage.ACCOMMODATION_SPOT__NUMBER_OF_SPACES:
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
		result.append(" (accommodationSpotId: ");
		result.append(accommodationSpotId);
		result.append(", accommodationClassId: ");
		result.append(accommodationClassId);
		result.append(", description: ");
		result.append(description);
		result.append(", fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", numberOfSpaces: ");
		result.append(numberOfSpaces);
		result.append(')');
		return result.toString();
	}

} //AccommodationSpotImpl
