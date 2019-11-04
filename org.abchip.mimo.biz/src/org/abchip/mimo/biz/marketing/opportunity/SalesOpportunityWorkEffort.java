/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity Work Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityWorkEffort()
 * @model
 * @generated
 */
public interface SalesOpportunityWorkEffort extends BizEntity {
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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityWorkEffort_SalesOpportunityId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSalesOpportunityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort#getSalesOpportunityId <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #getSalesOpportunityId()
	 * @generated
	 */
	void setSalesOpportunityId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' reference.
	 * @see #setWorkEffortId(WorkEffort)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityWorkEffort_WorkEffortId()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort#getWorkEffortId <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' reference.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(WorkEffort value);

} // SalesOpportunityWorkEffort
