/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupId <em>Segment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupTypeId <em>Segment Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupClassifications <em>Segment Group Classifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupGeos <em>Segment Group Geos</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SegmentGroup extends BizEntityTyped<SegmentGroupType> {
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
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_ProductStoreId()
	 * @model annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

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
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSegmentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupId <em>Segment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group Id</em>' attribute.
	 * @see #getSegmentGroupId()
	 * @generated
	 */
	void setSegmentGroupId(String value);

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
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupTypeId()
	 * @model annotation="mimo-ent-domain frame='SegmentGroupType'"
	 * @generated
	 */
	String getSegmentGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupTypeId <em>Segment Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group Type Id</em>' attribute.
	 * @see #getSegmentGroupTypeId()
	 * @generated
	 */
	void setSegmentGroupTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Segment Group Classifications</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Group Classifications</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Classifications</em>' attribute list.
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupClassifications()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SegmentGroupClassification'"
	 * @generated
	 */
	List<String> getSegmentGroupClassifications();

	/**
	 * Returns the value of the '<em><b>Segment Group Geos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Group Geos</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Geos</em>' attribute list.
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupGeos()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SegmentGroupGeo'"
	 * @generated
	 */
	List<String> getSegmentGroupGeos();

} // SegmentGroup
