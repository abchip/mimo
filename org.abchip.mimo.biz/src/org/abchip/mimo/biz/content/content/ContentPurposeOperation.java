/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.party.party.RoleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Purpose Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getContentPurposeTypeId <em>Content Purpose Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getContentOperationId <em>Content Operation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getPrivilegeEnumId <em>Privilege Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurposeOperation()
 * @model annotation="mimo-ent-frame title='Content Purpose'"
 * @generated
 */
public interface ContentPurposeOperation extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Content Operation Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Operation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Operation Id</em>' reference.
	 * @see #setContentOperationId(ContentOperation)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurposeOperation_ContentOperationId()
	 * @model keys="contentOperationId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContentOperation getContentOperationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getContentOperationId <em>Content Operation Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Operation Id</em>' reference.
	 * @see #getContentOperationId()
	 * @generated
	 */
	void setContentOperationId(ContentOperation value);

	/**
	 * Returns the value of the '<em><b>Content Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Purpose Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Purpose Type Id</em>' reference.
	 * @see #setContentPurposeTypeId(ContentPurposeType)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurposeOperation_ContentPurposeTypeId()
	 * @model keys="contentPurposeTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContentPurposeType getContentPurposeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getContentPurposeTypeId <em>Content Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Purpose Type Id</em>' reference.
	 * @see #getContentPurposeTypeId()
	 * @generated
	 */
	void setContentPurposeTypeId(ContentPurposeType value);

	/**
	 * Returns the value of the '<em><b>Privilege Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privilege Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilege Enum Id</em>' reference.
	 * @see #setPrivilegeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurposeOperation_PrivilegeEnumId()
	 * @model keys="enumId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Enumeration getPrivilegeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getPrivilegeEnumId <em>Privilege Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege Enum Id</em>' reference.
	 * @see #getPrivilegeEnumId()
	 * @generated
	 */
	void setPrivilegeEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' reference.
	 * @see #setRoleTypeId(RoleType)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurposeOperation_RoleTypeId()
	 * @model keys="roleTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getRoleTypeId <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' reference.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(RoleType value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentPurposeOperation_StatusId()
	 * @model keys="statusId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentPurposeOperation#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

} // ContentPurposeOperation
