/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Requirement Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkReqFulfTypeId <em>Work Req Fulf Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkRequirementFulfillment()
 * @model
 * @generated
 */
public interface WorkRequirementFulfillment extends BizEntityTyped<WorkReqFulfType> {
	/**
	 * Returns the value of the '<em><b>Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Id</em>' attribute.
	 * @see #setRequirementId(String)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkRequirementFulfillment_RequirementId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Requirement'"
	 * @generated
	 */
	String getRequirementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getRequirementId <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Id</em>' attribute.
	 * @see #getRequirementId()
	 * @generated
	 */
	void setRequirementId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkRequirementFulfillment_WorkEffortId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

	/**
	 * Returns the value of the '<em><b>Work Req Fulf Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Req Fulf Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Req Fulf Type Id</em>' attribute.
	 * @see #setWorkReqFulfTypeId(String)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkRequirementFulfillment_WorkReqFulfTypeId()
	 * @model annotation="mimo-ent-domain frame='WorkReqFulfType'"
	 * @generated
	 */
	String getWorkReqFulfTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkReqFulfTypeId <em>Work Req Fulf Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Req Fulf Type Id</em>' attribute.
	 * @see #getWorkReqFulfTypeId()
	 * @generated
	 */
	void setWorkReqFulfTypeId(String value);

} // WorkRequirementFulfillment
