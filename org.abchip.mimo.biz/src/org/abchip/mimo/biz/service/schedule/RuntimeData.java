/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RuntimeData#getRuntimeDataId <em>Runtime Data Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.RuntimeData#getRuntimeInfo <em>Runtime Info</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRuntimeData()
 * @model
 * @generated
 */
public interface RuntimeData extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Runtime Data Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Data Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Data Id</em>' attribute.
	 * @see #setRuntimeDataId(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRuntimeData_RuntimeDataId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getRuntimeDataId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RuntimeData#getRuntimeDataId <em>Runtime Data Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Data Id</em>' attribute.
	 * @see #getRuntimeDataId()
	 * @generated
	 */
	void setRuntimeDataId(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Info</em>' attribute.
	 * @see #setRuntimeInfo(String)
	 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage#getRuntimeData_RuntimeInfo()
	 * @model
	 * @generated
	 */
	String getRuntimeInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.schedule.RuntimeData#getRuntimeInfo <em>Runtime Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Info</em>' attribute.
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	void setRuntimeInfo(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ApplicationSandbox' route='runtimeDataId'"
	 * @generated
	 */
	List<String> applicationSandboxs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='JobSandbox' route='runtimeDataId'"
	 * @generated
	 */
	List<String> jobSandboxs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort' route='runtimeDataId'"
	 * @generated
	 */
	List<String> workEfforts();

} // RuntimeData
