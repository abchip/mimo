/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.segment.SegmentGroupClassification;
import org.abchip.mimo.biz.marketing.segment.SegmentPackage;
import org.abchip.mimo.biz.party.party.PartyClassificationGroup;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment Group Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupClassificationImpl#getSegmentGroupId <em>Segment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupClassificationImpl#getPartyClassificationGroupId <em>Party Classification Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentGroupClassificationImpl extends BizEntityImpl implements SegmentGroupClassification {
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
	 * The cached value of the '{@link #getPartyClassificationGroupId() <em>Party Classification Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyClassificationGroupId()
	 * @generated
	 * @ordered
	 */
	protected PartyClassificationGroup partyClassificationGroupId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentGroupClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SegmentPackage.Literals.SEGMENT_GROUP_CLASSIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyClassificationGroup getPartyClassificationGroupId() {
		if (partyClassificationGroupId != null && ((EObject)partyClassificationGroupId).eIsProxy()) {
			InternalEObject oldPartyClassificationGroupId = (InternalEObject)partyClassificationGroupId;
			partyClassificationGroupId = (PartyClassificationGroup)eResolveProxy(oldPartyClassificationGroupId);
			if (partyClassificationGroupId != oldPartyClassificationGroupId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID, oldPartyClassificationGroupId, partyClassificationGroupId));
			}
		}
		return partyClassificationGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyClassificationGroup basicGetPartyClassificationGroupId() {
		return partyClassificationGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyClassificationGroupId(PartyClassificationGroup newPartyClassificationGroupId) {
		PartyClassificationGroup oldPartyClassificationGroupId = partyClassificationGroupId;
		partyClassificationGroupId = newPartyClassificationGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID, oldPartyClassificationGroupId, partyClassificationGroupId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__SEGMENT_GROUP_ID, oldSegmentGroupId, segmentGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__SEGMENT_GROUP_ID:
				return getSegmentGroupId();
			case SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID:
				if (resolve) return getPartyClassificationGroupId();
				return basicGetPartyClassificationGroupId();
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
			case SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__SEGMENT_GROUP_ID:
				setSegmentGroupId((String)newValue);
				return;
			case SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID:
				setPartyClassificationGroupId((PartyClassificationGroup)newValue);
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
			case SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__SEGMENT_GROUP_ID:
				setSegmentGroupId(SEGMENT_GROUP_ID_EDEFAULT);
				return;
			case SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID:
				setPartyClassificationGroupId((PartyClassificationGroup)null);
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
			case SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__SEGMENT_GROUP_ID:
				return SEGMENT_GROUP_ID_EDEFAULT == null ? segmentGroupId != null : !SEGMENT_GROUP_ID_EDEFAULT.equals(segmentGroupId);
			case SegmentPackage.SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID:
				return partyClassificationGroupId != null;
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

} //SegmentGroupClassificationImpl