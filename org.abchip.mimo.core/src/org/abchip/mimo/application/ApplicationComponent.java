/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.application;

import java.util.List;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.service.ServiceConfig;
import org.abchip.mimo.service.reg.ServiceCommandProviderReg;
import org.abchip.mimo.service.reg.ServiceHookReg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.ApplicationComponent#getConfig <em>Config</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationComponent#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationComponent#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationComponent#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationComponent#getModules <em>Modules</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationComponent#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationComponent#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationComponent()
 * @model
 * @generated
 */
public interface ApplicationComponent extends Entity, ContextProvider {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(ServiceConfig)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationComponent_Config()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ServiceConfig getConfig();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationComponent#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(ServiceConfig value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationComponent_Context()
	 * @model containment="true" resolveProxies="true" transient="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationComponent#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.service.reg.ServiceCommandProviderReg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationComponent_Commands()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<ServiceCommandProviderReg> getCommands();

	/**
	 * Returns the value of the '<em><b>Hooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.service.reg.ServiceHookReg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hooks</em>' containment reference list.
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationComponent_Hooks()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<ServiceHookReg> getHooks();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.application.ApplicationModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationComponent_Modules()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<ApplicationModule> getModules();

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
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationComponent_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"ACT"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.application.ComponentStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.application.ComponentStatus
	 * @see #setStatus(ComponentStatus)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationComponent_Status()
	 * @model default="ACT" required="true"
	 * @generated
	 */
	ComponentStatus getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationComponent#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.application.ComponentStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ComponentStatus value);

} // ApplicationComponent
