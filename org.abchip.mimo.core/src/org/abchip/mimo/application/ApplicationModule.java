/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.application;

import java.util.List;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.service.reg.ServiceReg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.ApplicationModule#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationModule#getServices <em>Services</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationModule#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationModule()
 * @model
 * @generated
 */
public interface ApplicationModule extends Entity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.service.reg.ServiceReg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationModule_Services()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<ServiceReg> getServices();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"ACT"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.application.ModuleStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.application.ModuleStatus
	 * @see #setStatus(ModuleStatus)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationModule_Status()
	 * @model default="ACT" required="true"
	 * @generated
	 */
	ModuleStatus getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationModule#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.application.ModuleStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ModuleStatus value);

} // Module
