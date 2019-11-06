/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.marketing.segment.SegmentGroup;
import org.abchip.mimo.biz.marketing.segment.SegmentGroupType;
import org.abchip.mimo.biz.marketing.segment.SegmentPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupTypeImpl#getSegmentGroupTypeId <em>Segment Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentGroupTypeImpl extends BizEntityTypeImpl<SegmentGroup> implements SegmentGroupType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSegmentGroupTypeId() <em>Segment Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_GROUP_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentGroupTypeId() <em>Segment Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected String segmentGroupTypeId = SEGMENT_GROUP_TYPE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SegmentPackage.Literals.SEGMENT_GROUP_TYPE;
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
	public List<String> segmentGroups() {
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
	public String getSegmentGroupTypeId() {
		return segmentGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentGroupTypeId(String newSegmentGroupTypeId) {
		segmentGroupTypeId = newSegmentGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SegmentPackage.SEGMENT_GROUP_TYPE__SEGMENT_GROUP_TYPE_ID:
				return getSegmentGroupTypeId();
			case SegmentPackage.SEGMENT_GROUP_TYPE__DESCRIPTION:
				return getDescription();
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
			case SegmentPackage.SEGMENT_GROUP_TYPE__SEGMENT_GROUP_TYPE_ID:
				setSegmentGroupTypeId((String)newValue);
				return;
			case SegmentPackage.SEGMENT_GROUP_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case SegmentPackage.SEGMENT_GROUP_TYPE__SEGMENT_GROUP_TYPE_ID:
				setSegmentGroupTypeId(SEGMENT_GROUP_TYPE_ID_EDEFAULT);
				return;
			case SegmentPackage.SEGMENT_GROUP_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case SegmentPackage.SEGMENT_GROUP_TYPE__SEGMENT_GROUP_TYPE_ID:
				return SEGMENT_GROUP_TYPE_ID_EDEFAULT == null ? segmentGroupTypeId != null : !SEGMENT_GROUP_TYPE_ID_EDEFAULT.equals(segmentGroupTypeId);
			case SegmentPackage.SEGMENT_GROUP_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (segmentGroupTypeId: ");
		result.append(segmentGroupTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SegmentGroupTypeImpl
