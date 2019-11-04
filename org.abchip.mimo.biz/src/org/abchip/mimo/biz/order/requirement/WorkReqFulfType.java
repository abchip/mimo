/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Req Fulf Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.WorkReqFulfType#getWorkReqFulfTypeId <em>Work Req Fulf Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.WorkReqFulfType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkReqFulfType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface WorkReqFulfType extends BizEntityType<WorkRequirementFulfillment> {
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
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkReqFulfType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.WorkReqFulfType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkRequirementFulfillment' route='workReqFulfTypeId'"
	 * @generated
	 */
	List<String> workRequirementFulfillments();

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
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getWorkReqFulfType_WorkReqFulfTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getWorkReqFulfTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.WorkReqFulfType#getWorkReqFulfTypeId <em>Work Req Fulf Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Req Fulf Type Id</em>' attribute.
	 * @see #getWorkReqFulfTypeId()
	 * @generated
	 */
	void setWorkReqFulfTypeId(String value);

} // WorkReqFulfType
