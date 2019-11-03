/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.status;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Valid Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.status.StatusValidChange#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.StatusValidChange#getStatusIdTo <em>Status Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.StatusValidChange#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.StatusValidChange#getTransitionName <em>Transition Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.status.StatusPackage#getStatusValidChange()
 * @model
 * @generated
 */
public interface StatusValidChange extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' attribute.
	 * @see #setConditionExpression(String)
	 * @see org.abchip.mimo.biz.common.status.StatusPackage#getStatusValidChange_ConditionExpression()
	 * @model
	 * @generated
	 */
	String getConditionExpression();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getConditionExpression <em>Condition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' attribute.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(String value);

	/**
	 * Returns the value of the '<em><b>Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Name</em>' attribute.
	 * @see #setTransitionName(String)
	 * @see org.abchip.mimo.biz.common.status.StatusPackage#getStatusValidChange_TransitionName()
	 * @model
	 * @generated
	 */
	String getTransitionName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getTransitionName <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Name</em>' attribute.
	 * @see #getTransitionName()
	 * @generated
	 */
	void setTransitionName(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.common.status.StatusPackage#getStatusValidChange_StatusId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id To</em>' attribute.
	 * @see #setStatusIdTo(String)
	 * @see org.abchip.mimo.biz.common.status.StatusPackage#getStatusValidChange_StatusIdTo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getStatusIdTo <em>Status Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id To</em>' attribute.
	 * @see #getStatusIdTo()
	 * @generated
	 */
	void setStatusIdTo(String value);

} // StatusValidChange
