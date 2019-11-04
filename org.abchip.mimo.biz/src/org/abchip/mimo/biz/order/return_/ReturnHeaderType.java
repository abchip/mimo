/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Header Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType#getReturnHeaderTypeId <em>Return Header Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeaderType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ReturnHeaderType extends BizEntityType<ReturnHeader> {
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeaderType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(ReturnHeaderType)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeaderType_ParentTypeId()
	 * @model keys="returnHeaderTypeId"
	 * @generated
	 */
	ReturnHeaderType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(ReturnHeaderType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnHeaderType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childReturnHeaderTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnHeader' route='returnHeaderTypeId'"
	 * @generated
	 */
	List<String> returnHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnItemTypeMap' route='returnHeaderTypeId'"
	 * @generated
	 */
	List<String> returnItemTypeMaps();

	/**
	 * Returns the value of the '<em><b>Return Header Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Header Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Header Type Id</em>' attribute.
	 * @see #setReturnHeaderTypeId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnHeaderType_ReturnHeaderTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getReturnHeaderTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType#getReturnHeaderTypeId <em>Return Header Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Header Type Id</em>' attribute.
	 * @see #getReturnHeaderTypeId()
	 * @generated
	 */
	void setReturnHeaderTypeId(String value);

} // ReturnHeaderType