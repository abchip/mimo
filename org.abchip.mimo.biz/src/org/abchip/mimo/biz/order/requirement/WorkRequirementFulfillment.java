/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

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
public interface WorkRequirementFulfillment extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Id</em>' reference.
	 * @see #setRequirementId(Requirement)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkRequirementFulfillment_RequirementId()
	 * @model keys="requirementId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Requirement getRequirementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getRequirementId <em>Requirement Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Id</em>' reference.
	 * @see #getRequirementId()
	 * @generated
	 */
	void setRequirementId(Requirement value);

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
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkRequirementFulfillment_WorkEffortId()
	 * @model keys="workEffortId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkEffortId <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' reference.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Work Req Fulf Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Req Fulf Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Req Fulf Type Id</em>' reference.
	 * @see #setWorkReqFulfTypeId(WorkReqFulfType)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkRequirementFulfillment_WorkReqFulfTypeId()
	 * @model keys="workReqFulfTypeId"
	 * @generated
	 */
	WorkReqFulfType getWorkReqFulfTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.WorkRequirementFulfillment#getWorkReqFulfTypeId <em>Work Req Fulf Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Req Fulf Type Id</em>' reference.
	 * @see #getWorkReqFulfTypeId()
	 * @generated
	 */
	void setWorkReqFulfTypeId(WorkReqFulfType value);

} // WorkRequirementFulfillment
