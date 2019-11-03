/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import java.math.BigDecimal;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getOpportunityStageId <em>Opportunity Stage Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getDefaultProbability <em>Default Probability</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityStage()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SalesOpportunityStage extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Default Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Probability</em>' attribute.
	 * @see #setDefaultProbability(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityStage_DefaultProbability()
	 * @model
	 * @generated
	 */
	BigDecimal getDefaultProbability();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getDefaultProbability <em>Default Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Probability</em>' attribute.
	 * @see #getDefaultProbability()
	 * @generated
	 */
	void setDefaultProbability(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityStage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Opportunity Stage Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opportunity Stage Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opportunity Stage Id</em>' attribute.
	 * @see #setOpportunityStageId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityStage_OpportunityStageId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getOpportunityStageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getOpportunityStageId <em>Opportunity Stage Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opportunity Stage Id</em>' attribute.
	 * @see #getOpportunityStageId()
	 * @generated
	 */
	void setOpportunityStageId(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunityStage_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunity' route='opportunityStageId'"
	 * @generated
	 */
	List<String> salesOpportunities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunityHistory' route='opportunityStageId'"
	 * @generated
	 */
	List<String> salesOpportunityHistories();

} // SalesOpportunityStage
