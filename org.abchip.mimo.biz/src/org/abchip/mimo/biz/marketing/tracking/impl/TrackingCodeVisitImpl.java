/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.tracking.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.tracking.TrackingCodeVisit;
import org.abchip.mimo.biz.marketing.tracking.TrackingPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracking Code Visit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeVisitImpl#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeVisitImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeVisitImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeVisitImpl#getSourceEnumId <em>Source Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackingCodeVisitImpl extends BizEntityImpl implements TrackingCodeVisit {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getTrackingCodeId() <em>Tracking Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_CODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingCodeId() <em>Tracking Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCodeId()
	 * @generated
	 * @ordered
	 */
	protected String trackingCodeId = TRACKING_CODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceEnumId() <em>Source Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceEnumId() <em>Source Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEnumId()
	 * @generated
	 * @ordered
	 */
	protected String sourceEnumId = SOURCE_ENUM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackingCodeVisitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackingPackage.Literals.TRACKING_CODE_VISIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_VISIT__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceEnumId() {
		return sourceEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceEnumId(String newSourceEnumId) {
		String oldSourceEnumId = sourceEnumId;
		sourceEnumId = newSourceEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_VISIT__SOURCE_ENUM_ID, oldSourceEnumId, sourceEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingCodeId() {
		return trackingCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeId(String newTrackingCodeId) {
		String oldTrackingCodeId = trackingCodeId;
		trackingCodeId = newTrackingCodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_VISIT__TRACKING_CODE_ID, oldTrackingCodeId, trackingCodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		String oldVisitId = visitId;
		visitId = newVisitId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_VISIT__VISIT_ID, oldVisitId, visitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackingPackage.TRACKING_CODE_VISIT__TRACKING_CODE_ID:
				return getTrackingCodeId();
			case TrackingPackage.TRACKING_CODE_VISIT__VISIT_ID:
				return getVisitId();
			case TrackingPackage.TRACKING_CODE_VISIT__FROM_DATE:
				return getFromDate();
			case TrackingPackage.TRACKING_CODE_VISIT__SOURCE_ENUM_ID:
				return getSourceEnumId();
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
			case TrackingPackage.TRACKING_CODE_VISIT__TRACKING_CODE_ID:
				setTrackingCodeId((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE_VISIT__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE_VISIT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TrackingPackage.TRACKING_CODE_VISIT__SOURCE_ENUM_ID:
				setSourceEnumId((String)newValue);
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
			case TrackingPackage.TRACKING_CODE_VISIT__TRACKING_CODE_ID:
				setTrackingCodeId(TRACKING_CODE_ID_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE_VISIT__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE_VISIT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE_VISIT__SOURCE_ENUM_ID:
				setSourceEnumId(SOURCE_ENUM_ID_EDEFAULT);
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
			case TrackingPackage.TRACKING_CODE_VISIT__TRACKING_CODE_ID:
				return TRACKING_CODE_ID_EDEFAULT == null ? trackingCodeId != null : !TRACKING_CODE_ID_EDEFAULT.equals(trackingCodeId);
			case TrackingPackage.TRACKING_CODE_VISIT__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case TrackingPackage.TRACKING_CODE_VISIT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TrackingPackage.TRACKING_CODE_VISIT__SOURCE_ENUM_ID:
				return SOURCE_ENUM_ID_EDEFAULT == null ? sourceEnumId != null : !SOURCE_ENUM_ID_EDEFAULT.equals(sourceEnumId);
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
		result.append(" (trackingCodeId: ");
		result.append(trackingCodeId);
		result.append(", visitId: ");
		result.append(visitId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", sourceEnumId: ");
		result.append(sourceEnumId);
		result.append(')');
		return result.toString();
	}

} //TrackingCodeVisitImpl
