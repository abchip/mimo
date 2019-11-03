/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Group Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroupClassification#getSegmentGroupId <em>Segment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroupClassification#getPartyClassificationGroupId <em>Party Classification Group Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroupClassification()
 * @model
 * @generated
 */
public interface SegmentGroupClassification extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Party Classification Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Classification Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classification Group Id</em>' attribute.
	 * @see #setPartyClassificationGroupId(String)
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroupClassification_PartyClassificationGroupId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='PartyClassificationGroup'"
	 * @generated
	 */
	String getPartyClassificationGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroupClassification#getPartyClassificationGroupId <em>Party Classification Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Classification Group Id</em>' attribute.
	 * @see #getPartyClassificationGroupId()
	 * @generated
	 */
	void setPartyClassificationGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Segment Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Id</em>' attribute.
	 * @see #setSegmentGroupId(String)
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroupClassification_SegmentGroupId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='SegmentGroup'"
	 * @generated
	 */
	String getSegmentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroupClassification#getSegmentGroupId <em>Segment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group Id</em>' attribute.
	 * @see #getSegmentGroupId()
	 * @generated
	 */
	void setSegmentGroupId(String value);

} // SegmentGroupClassification
