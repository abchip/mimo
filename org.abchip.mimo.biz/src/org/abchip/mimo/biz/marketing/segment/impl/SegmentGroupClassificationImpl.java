/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.segment.SegmentGroup;
import org.abchip.mimo.biz.marketing.segment.SegmentGroupClassification;
import org.abchip.mimo.biz.marketing.segment.SegmentPackage;
import org.abchip.mimo.biz.party.party.PartyClassificationGroup;
import org.eclipse.emf.ecore.EClass;

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
		return (PartyClassificationGroup)eGet(SegmentPackage.Literals.SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyClassificationGroupId(PartyClassificationGroup newPartyClassificationGroupId) {
		eSet(SegmentPackage.Literals.SEGMENT_GROUP_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID, newPartyClassificationGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentGroup getSegmentGroupId() {
		return (SegmentGroup)eGet(SegmentPackage.Literals.SEGMENT_GROUP_CLASSIFICATION__SEGMENT_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentGroupId(SegmentGroup newSegmentGroupId) {
		eSet(SegmentPackage.Literals.SEGMENT_GROUP_CLASSIFICATION__SEGMENT_GROUP_ID, newSegmentGroupId);
	}

} //SegmentGroupClassificationImpl
