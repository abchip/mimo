/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment;

import java.util.List;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.product.store.ProductStore;

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
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupClassifications <em>Segment Group Classifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupGeos <em>Segment Group Geos</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupTypeId <em>Segment Group Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SegmentGroup extends BizEntity {
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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_ProductStoreId()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Segment Group Classifications</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.marketing.segment.SegmentGroupClassification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Group Classifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Classifications</em>' reference list.
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupClassifications()
	 * @model derived="true"
	 * @generated
	 */
	List<SegmentGroupClassification> getSegmentGroupClassifications();

	/**
	 * Returns the value of the '<em><b>Segment Group Geos</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.marketing.segment.SegmentGroupGeo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Group Geos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Geos</em>' reference list.
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupGeos()
	 * @model derived="true"
	 * @generated
	 */
	List<SegmentGroupGeo> getSegmentGroupGeos();

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
	 * Returns the value of the '<em><b>Segment Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Group Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Group Type Id</em>' reference.
	 * @see #setSegmentGroupTypeId(SegmentGroupType)
	 * @see org.abchip.mimo.biz.marketing.segment.SegmentPackage#getSegmentGroup_SegmentGroupTypeId()
	 * @model keys="segmentGroupTypeId"
	 * @generated
	 */
	SegmentGroupType getSegmentGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.segment.SegmentGroup#getSegmentGroupTypeId <em>Segment Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Group Type Id</em>' reference.
	 * @see #getSegmentGroupTypeId()
	 * @generated
	 */
	void setSegmentGroupTypeId(SegmentGroupType value);

} // SegmentGroup
