/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupId <em>Facility Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupName <em>Facility Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupTypeId <em>Facility Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroup()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface FacilityGroup extends BizEntityTyped<FacilityGroupType> {
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
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Facility Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Group Name</em>' attribute.
	 * @see #setFacilityGroupName(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroup_FacilityGroupName()
	 * @model
	 * @generated
	 */
	String getFacilityGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupName <em>Facility Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Group Name</em>' attribute.
	 * @see #getFacilityGroupName()
	 * @generated
	 */
	void setFacilityGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Facility Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Group Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Group Type Id</em>' attribute.
	 * @see #setFacilityGroupTypeId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroup_FacilityGroupTypeId()
	 * @model annotation="mimo-ent-domain frame='FacilityGroupType'"
	 * @generated
	 */
	String getFacilityGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupTypeId <em>Facility Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Group Type Id</em>' attribute.
	 * @see #getFacilityGroupTypeId()
	 * @generated
	 */
	void setFacilityGroupTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Primary Parent Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Parent Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Parent Group Id</em>' attribute.
	 * @see #setPrimaryParentGroupId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroup_PrimaryParentGroupId()
	 * @model annotation="mimo-ent-domain frame='FacilityGroup'"
	 * @generated
	 */
	String getPrimaryParentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Parent Group Id</em>' attribute.
	 * @see #getPrimaryParentGroupId()
	 * @generated
	 */
	void setPrimaryParentGroupId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Facility' route='primaryFacilityGroupId'"
	 * @generated
	 */
	List<String> facilities();

	/**
	 * Returns the value of the '<em><b>Facility Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Group Id</em>' attribute.
	 * @see #setFacilityGroupId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroup_FacilityGroupId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getFacilityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupId <em>Facility Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Group Id</em>' attribute.
	 * @see #getFacilityGroupId()
	 * @generated
	 */
	void setFacilityGroupId(String value);

} // FacilityGroup
