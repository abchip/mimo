/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Cust Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getRequirementId <em>Requirement Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getRequirementCustRequest()
 * @model
 * @generated
 */
public interface RequirementCustRequest extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cust Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Id</em>' attribute.
	 * @see #setCustRequestId(String)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getRequirementCustRequest_CustRequestId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='CustRequest'"
	 * @generated
	 */
	String getCustRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getCustRequestId <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Id</em>' attribute.
	 * @see #getCustRequestId()
	 * @generated
	 */
	void setCustRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #setCustRequestItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getRequirementCustRequest_CustRequestItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCustRequestItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #getCustRequestItemSeqId()
	 * @generated
	 */
	void setCustRequestItemSeqId(String value);

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
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getRequirementCustRequest_RequirementId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Requirement'"
	 * @generated
	 */
	String getRequirementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.RequirementCustRequest#getRequirementId <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Id</em>' attribute.
	 * @see #getRequirementId()
	 * @generated
	 */
	void setRequirementId(String value);

} // RequirementCustRequest
