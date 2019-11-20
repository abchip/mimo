/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.application;

import java.util.List;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityIdentifiable;
<<<<<<< HEAD
=======
import org.abchip.mimo.entity.Textable;
>>>>>>> branch 'master' of https://github.com/abchip/mimo.git


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.Application#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getComponents <em>Components</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getConfig <em>Config</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getContextDescription <em>Context Description</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getPort <em>Port</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.application.ApplicationPackage#getApplication()
 * @model
 * @generated
 */
<<<<<<< HEAD
public interface Application extends EntityIdentifiable, Context {
=======
public interface Application extends EntityIdentifiable, Textable, Context {
>>>>>>> branch 'master' of https://github.com/abchip/mimo.git

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.application.ServiceCommandProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Commands()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<ServiceCommandProvider> getCommands();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.application.ApplicationComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Components()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<ApplicationComponent> getComponents();

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
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Config()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ServiceConfig getConfig();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getConfig <em>Config</em>}' containment reference.
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
	 * @see #setContext(ContextRoot)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Context()
	 * @model containment="true" resolveProxies="true" transient="true"
	 * @generated
	 */
	ContextRoot getContext();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ContextRoot value);

	/**
	 * Returns the value of the '<em><b>Context Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Description</em>' containment reference.
	 * @see #setContextDescription(ContextDescription)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_ContextDescription()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	@Override
	ContextDescription getContextDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getContextDescription <em>Context Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Description</em>' containment reference.
	 * @see #getContextDescription()
	 * @generated
	 */
	void setContextDescription(ContextDescription value);

	/**
	 * Returns the value of the '<em><b>Hooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.application.ServiceHook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hooks</em>' containment reference list.
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Hooks()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<ServiceHook> getHooks();

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
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);
} // Application
