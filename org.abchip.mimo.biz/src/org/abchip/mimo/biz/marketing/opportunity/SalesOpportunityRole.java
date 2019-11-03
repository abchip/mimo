/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getRoleTypeId <em>Role Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityRole()
 * @model
 * @generated
 */
public interface SalesOpportunityRole extends BizEntity {
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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityRole_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getPartyId <em>Party Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityRole_RoleTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #setSalesOpportunityId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityRole_SalesOpportunityId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunity'"
	 * @generated
	 */
	String getSalesOpportunityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getSalesOpportunityId <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #getSalesOpportunityId()
	 * @generated
	 */
	void setSalesOpportunityId(String value);

} // SalesOpportunityRole
