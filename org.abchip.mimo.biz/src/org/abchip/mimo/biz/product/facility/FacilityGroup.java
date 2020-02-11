/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import org.abchip.mimo.biz.BizEntity;

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
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface FacilityGroup extends BizEntity {
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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * @model annotation="mimo-ent-format type='name' length='100'"
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
	 * Returns the value of the '<em><b>Facility Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Group Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Group Type Id</em>' reference.
	 * @see #setFacilityGroupTypeId(FacilityGroupType)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroup_FacilityGroupTypeId()
	 * @model keys="facilityGroupTypeId"
	 * @generated
	 */
	FacilityGroupType getFacilityGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupTypeId <em>Facility Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Group Type Id</em>' reference.
	 * @see #getFacilityGroupTypeId()
	 * @generated
	 */
	void setFacilityGroupTypeId(FacilityGroupType value);

	/**
	 * Returns the value of the '<em><b>Primary Parent Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Parent Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Parent Group Id</em>' reference.
	 * @see #setPrimaryParentGroupId(FacilityGroup)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroup_PrimaryParentGroupId()
	 * @model keys="facilityGroupId"
	 * @generated
	 */
	FacilityGroup getPrimaryParentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Parent Group Id</em>' reference.
	 * @see #getPrimaryParentGroupId()
	 * @generated
	 */
	void setPrimaryParentGroupId(FacilityGroup value);

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
