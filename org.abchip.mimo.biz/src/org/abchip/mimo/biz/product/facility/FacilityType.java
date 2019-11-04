/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityType#getFacilityTypeId <em>Facility Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityType#getFacilityTypeAttrs <em>Facility Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface FacilityType extends BizEntityType<Facility> {
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
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(FacilityType)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityType_ParentTypeId()
	 * @model keys="facilityTypeId"
	 * @generated
	 */
	FacilityType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(FacilityType value);

	/**
	 * Returns the value of the '<em><b>Facility Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityType_FacilityTypeAttrs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FacilityTypeAttr'"
	 * @generated
	 */
	List<String> getFacilityTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FacilityType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childFacilityTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Facility' route='facilityTypeId'"
	 * @generated
	 */
	List<String> facilities();

	/**
	 * Returns the value of the '<em><b>Facility Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Type Id</em>' attribute.
	 * @see #setFacilityTypeId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityType_FacilityTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getFacilityTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityType#getFacilityTypeId <em>Facility Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Type Id</em>' attribute.
	 * @see #getFacilityTypeId()
	 * @generated
	 */
	void setFacilityTypeId(String value);

} // FacilityType
