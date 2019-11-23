/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Effort Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getWorkEffortContentTypeId <em>Work Effort Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContentType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface WorkEffortContentType extends BizEntityType<WorkEffortContent> {
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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContentType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getDescription <em>Description</em>}' attribute.
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
	 * @see #setParentTypeId(WorkEffortContentType)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContentType_ParentTypeId()
	 * @model keys="workEffortContentTypeId"
	 * @generated
	 */
	WorkEffortContentType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(WorkEffortContentType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffortContentType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childWorkEffortContentTypes();

	/**
	 * Returns the value of the '<em><b>Work Effort Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Content Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Content Type Id</em>' attribute.
	 * @see #setWorkEffortContentTypeId(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortContentType_WorkEffortContentTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getWorkEffortContentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType#getWorkEffortContentTypeId <em>Work Effort Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Content Type Id</em>' attribute.
	 * @see #getWorkEffortContentTypeId()
	 * @generated
	 */
	void setWorkEffortContentTypeId(String value);

} // WorkEffortContentType
