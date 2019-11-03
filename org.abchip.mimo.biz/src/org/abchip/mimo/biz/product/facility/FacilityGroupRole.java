/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Group Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole#getFacilityGroupId <em>Facility Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole#getRoleTypeId <em>Role Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroupRole()
 * @model
 * @generated
 */
public interface FacilityGroupRole extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroupRole_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroupRole_RoleTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

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
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacilityGroupRole_FacilityGroupId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='FacilityGroup'"
	 * @generated
	 */
	String getFacilityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole#getFacilityGroupId <em>Facility Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Group Id</em>' attribute.
	 * @see #getFacilityGroupId()
	 * @generated
	 */
	void setFacilityGroupId(String value);

} // FacilityGroupRole
