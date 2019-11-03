/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import org.abchip.mimo.biz.common.geo.GeoAssoc;
import org.abchip.mimo.biz.common.geo.GeoAssocType;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoAssocImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoAssocImpl#getGeoIdTo <em>Geo Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoAssocImpl#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoAssocImpl extends BizEntityTypedImpl<GeoAssocType> implements GeoAssoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getGeoId() <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeoId() <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected String geoId = GEO_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGeoIdTo() <em>Geo Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeoIdTo() <em>Geo Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoIdTo()
	 * @generated
	 * @ordered
	 */
	protected String geoIdTo = GEO_ID_TO_EDEFAULT;
	/**
	 * The default value of the '{@link #getGeoAssocTypeId() <em>Geo Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_ASSOC_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeoAssocTypeId() <em>Geo Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected String geoAssocTypeId = GEO_ASSOC_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoPackage.Literals.GEO_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoId() {
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(String newGeoId) {
		String oldGeoId = geoId;
		geoId = newGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_ASSOC__GEO_ID, oldGeoId, geoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoIdTo() {
		return geoIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdTo(String newGeoIdTo) {
		String oldGeoIdTo = geoIdTo;
		geoIdTo = newGeoIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_ASSOC__GEO_ID_TO, oldGeoIdTo, geoIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoAssocTypeId() {
		return geoAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoAssocTypeId(String newGeoAssocTypeId) {
		String oldGeoAssocTypeId = geoAssocTypeId;
		geoAssocTypeId = newGeoAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID, oldGeoAssocTypeId, geoAssocTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeoPackage.GEO_ASSOC__GEO_ID:
				return getGeoId();
			case GeoPackage.GEO_ASSOC__GEO_ID_TO:
				return getGeoIdTo();
			case GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID:
				return getGeoAssocTypeId();
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
			case GeoPackage.GEO_ASSOC__GEO_ID:
				setGeoId((String)newValue);
				return;
			case GeoPackage.GEO_ASSOC__GEO_ID_TO:
				setGeoIdTo((String)newValue);
				return;
			case GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID:
				setGeoAssocTypeId((String)newValue);
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
			case GeoPackage.GEO_ASSOC__GEO_ID:
				setGeoId(GEO_ID_EDEFAULT);
				return;
			case GeoPackage.GEO_ASSOC__GEO_ID_TO:
				setGeoIdTo(GEO_ID_TO_EDEFAULT);
				return;
			case GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID:
				setGeoAssocTypeId(GEO_ASSOC_TYPE_ID_EDEFAULT);
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
			case GeoPackage.GEO_ASSOC__GEO_ID:
				return GEO_ID_EDEFAULT == null ? geoId != null : !GEO_ID_EDEFAULT.equals(geoId);
			case GeoPackage.GEO_ASSOC__GEO_ID_TO:
				return GEO_ID_TO_EDEFAULT == null ? geoIdTo != null : !GEO_ID_TO_EDEFAULT.equals(geoIdTo);
			case GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID:
				return GEO_ASSOC_TYPE_ID_EDEFAULT == null ? geoAssocTypeId != null : !GEO_ASSOC_TYPE_ID_EDEFAULT.equals(geoAssocTypeId);
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
		result.append(" (geoId: ");
		result.append(geoId);
		result.append(", geoIdTo: ");
		result.append(geoIdTo);
		result.append(", geoAssocTypeId: ");
		result.append(geoAssocTypeId);
		result.append(')');
		return result.toString();
	}

} //GeoAssocImpl
