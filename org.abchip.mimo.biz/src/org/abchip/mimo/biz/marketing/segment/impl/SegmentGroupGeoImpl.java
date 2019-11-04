/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment.impl;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.segment.SegmentGroupGeo;
import org.abchip.mimo.biz.marketing.segment.SegmentPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment Group Geo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupGeoImpl#getSegmentGroupId <em>Segment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupGeoImpl#getGeoId <em>Geo Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentGroupGeoImpl extends BizEntityImpl implements SegmentGroupGeo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSegmentGroupId() <em>Segment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentGroupId() <em>Segment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentGroupId()
	 * @generated
	 * @ordered
	 */
	protected String segmentGroupId = SEGMENT_GROUP_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentGroupGeoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SegmentPackage.Literals.SEGMENT_GROUP_GEO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SegmentPackage.SEGMENT_GROUP_GEO__GEO_ID, oldGeoId, geoId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SegmentPackage.SEGMENT_GROUP_GEO__GEO_ID, oldGeoId, geoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSegmentGroupId() {
		return segmentGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentGroupId(String newSegmentGroupId) {
		String oldSegmentGroupId = segmentGroupId;
		segmentGroupId = newSegmentGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SegmentPackage.SEGMENT_GROUP_GEO__SEGMENT_GROUP_ID, oldSegmentGroupId, segmentGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SegmentPackage.SEGMENT_GROUP_GEO__SEGMENT_GROUP_ID:
				return getSegmentGroupId();
			case SegmentPackage.SEGMENT_GROUP_GEO__GEO_ID:
				if (resolve) return getGeoId();
				return basicGetGeoId();
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
			case SegmentPackage.SEGMENT_GROUP_GEO__SEGMENT_GROUP_ID:
				setSegmentGroupId((String)newValue);
				return;
			case SegmentPackage.SEGMENT_GROUP_GEO__GEO_ID:
				setGeoId((Geo)newValue);
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
			case SegmentPackage.SEGMENT_GROUP_GEO__SEGMENT_GROUP_ID:
				setSegmentGroupId(SEGMENT_GROUP_ID_EDEFAULT);
				return;
			case SegmentPackage.SEGMENT_GROUP_GEO__GEO_ID:
				setGeoId((Geo)null);
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
			case SegmentPackage.SEGMENT_GROUP_GEO__SEGMENT_GROUP_ID:
				return SEGMENT_GROUP_ID_EDEFAULT == null ? segmentGroupId != null : !SEGMENT_GROUP_ID_EDEFAULT.equals(segmentGroupId);
			case SegmentPackage.SEGMENT_GROUP_GEO__GEO_ID:
				return geoId != null;
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
		result.append(" (segmentGroupId: ");
		result.append(segmentGroupId);
		result.append(')');
		return result.toString();
	}

} //SegmentGroupGeoImpl