/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.geo.GeoAssoc;
import org.abchip.mimo.biz.common.geo.GeoAssocType;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * The cached value of the '{@link #getGeoId() <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo geoId;
	/**
	 * The cached value of the '{@link #getGeoIdTo() <em>Geo Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoIdTo()
	 * @generated
	 * @ordered
	 */
	protected Geo geoIdTo;
	/**
	 * The cached value of the '{@link #getGeoAssocTypeId() <em>Geo Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected GeoAssocType geoAssocTypeId;

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
	public Geo getGeoId() {
		if (geoId != null && ((EObject)geoId).eIsProxy()) {
			InternalEObject oldGeoId = (InternalEObject)geoId;
			geoId = (Geo)eResolveProxy(oldGeoId);
			if (geoId != oldGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeoPackage.GEO_ASSOC__GEO_ID, oldGeoId, geoId));
			}
		}
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoId() {
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(Geo newGeoId) {
		Geo oldGeoId = geoId;
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
	public Geo getGeoIdTo() {
		if (geoIdTo != null && ((EObject)geoIdTo).eIsProxy()) {
			InternalEObject oldGeoIdTo = (InternalEObject)geoIdTo;
			geoIdTo = (Geo)eResolveProxy(oldGeoIdTo);
			if (geoIdTo != oldGeoIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeoPackage.GEO_ASSOC__GEO_ID_TO, oldGeoIdTo, geoIdTo));
			}
		}
		return geoIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoIdTo() {
		return geoIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdTo(Geo newGeoIdTo) {
		Geo oldGeoIdTo = geoIdTo;
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
	public GeoAssocType getGeoAssocTypeId() {
		if (geoAssocTypeId != null && ((EObject)geoAssocTypeId).eIsProxy()) {
			InternalEObject oldGeoAssocTypeId = (InternalEObject)geoAssocTypeId;
			geoAssocTypeId = (GeoAssocType)eResolveProxy(oldGeoAssocTypeId);
			if (geoAssocTypeId != oldGeoAssocTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID, oldGeoAssocTypeId, geoAssocTypeId));
			}
		}
		return geoAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoAssocType basicGetGeoAssocTypeId() {
		return geoAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoAssocTypeId(GeoAssocType newGeoAssocTypeId) {
		GeoAssocType oldGeoAssocTypeId = geoAssocTypeId;
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
				if (resolve) return getGeoId();
				return basicGetGeoId();
			case GeoPackage.GEO_ASSOC__GEO_ID_TO:
				if (resolve) return getGeoIdTo();
				return basicGetGeoIdTo();
			case GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID:
				if (resolve) return getGeoAssocTypeId();
				return basicGetGeoAssocTypeId();
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
				setGeoId((Geo)newValue);
				return;
			case GeoPackage.GEO_ASSOC__GEO_ID_TO:
				setGeoIdTo((Geo)newValue);
				return;
			case GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID:
				setGeoAssocTypeId((GeoAssocType)newValue);
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
				setGeoId((Geo)null);
				return;
			case GeoPackage.GEO_ASSOC__GEO_ID_TO:
				setGeoIdTo((Geo)null);
				return;
			case GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID:
				setGeoAssocTypeId((GeoAssocType)null);
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
				return geoId != null;
			case GeoPackage.GEO_ASSOC__GEO_ID_TO:
				return geoIdTo != null;
			case GeoPackage.GEO_ASSOC__GEO_ASSOC_TYPE_ID:
				return geoAssocTypeId != null;
		}
		return super.eIsSet(featureID);
	}

} //GeoAssocImpl
