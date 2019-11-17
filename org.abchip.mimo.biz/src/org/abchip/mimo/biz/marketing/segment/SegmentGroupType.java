/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroupType#getSegmentGroupTypeId <em>Segment Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroupType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroupType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SegmentGroupType extends BizEntityType<SegmentGroup> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroupType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroupType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SegmentGroup' route='segmentGroupTypeId'"
	 * @generated
	 */
	List<String> segmentGroups();

	/**
	 * Returns the value of the '<em><b>Segment Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Group Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Type Id</em>' attribute.
	 * @see #setSegmentGroupTypeId(String)
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroupType_SegmentGroupTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSegmentGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroupType#getSegmentGroupTypeId <em>Segment Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group Type Id</em>' attribute.
	 * @see #getSegmentGroupTypeId()
	 * @generated
	 */
	void setSegmentGroupTypeId(String value);

} // SegmentGroupType
