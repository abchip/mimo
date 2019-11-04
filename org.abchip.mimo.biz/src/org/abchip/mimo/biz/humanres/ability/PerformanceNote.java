/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getCommunicationDate <em>Communication Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerformanceNote()
 * @model
 * @generated
 */
public interface PerformanceNote extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerformanceNote_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Communication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Date</em>' attribute.
	 * @see #setCommunicationDate(Date)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerformanceNote_CommunicationDate()
	 * @model
	 * @generated
	 */
	Date getCommunicationDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getCommunicationDate <em>Communication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Date</em>' attribute.
	 * @see #getCommunicationDate()
	 * @generated
	 */
	void setCommunicationDate(Date value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerformanceNote_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerformanceNote_PartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getPartyId <em>Party Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerformanceNote_RoleTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerformanceNote_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerformanceNote#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // PerformanceNote
