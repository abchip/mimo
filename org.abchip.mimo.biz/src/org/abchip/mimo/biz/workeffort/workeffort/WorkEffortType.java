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
 * A representation of the model object '<em><b>Work Effort Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getWorkEffortTypeId <em>Work Effort Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getWorkEffortTypeAttrs <em>Work Effort Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface WorkEffortType extends BizEntityType<WorkEffort> {
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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortType_HasTable()
	 * @model annotation="mimo-ent-format type='indicator' length='1'"
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(WorkEffortType)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortType_ParentTypeId()
	 * @model keys="workEffortTypeId"
	 * @generated
	 */
	WorkEffortType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(WorkEffortType value);

	/**
	 * Returns the value of the '<em><b>Work Effort Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Type Id</em>' attribute.
	 * @see #setWorkEffortTypeId(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortType_WorkEffortTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getWorkEffortTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType#getWorkEffortTypeId <em>Work Effort Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Type Id</em>' attribute.
	 * @see #getWorkEffortTypeId()
	 * @generated
	 */
	void setWorkEffortTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffortType_WorkEffortTypeAttrs()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffortTypeAttr'"
	 * @generated
	 */
	List<String> getWorkEffortTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffortType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childWorkEffortTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort' route='workEffortTypeId'"
	 * @generated
	 */
	List<String> workEfforts();

} // WorkEffortType
