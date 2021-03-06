/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application;

import java.util.List;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.resource.ResourceMapping;
import org.abchip.mimo.service.ServiceConfig;
import org.abchip.mimo.service.ServiceMapping;
import org.abchip.mimo.service.reg.ServiceCommandProviderReg;
import org.abchip.mimo.service.reg.ServiceHookReg;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.Application#getAdminKey <em>Admin Key</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getComponents <em>Components</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getConfig <em>Config</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getContextDescription <em>Context Description</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getLogs <em>Logs</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getResourceMapping <em>Resource Mapping</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getServiceMapping <em>Service Mapping</em>}</li>
 *   <li>{@link org.abchip.mimo.application.Application#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.application.ApplicationPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Entity, ContextProvider {
	/**
	 * Returns the value of the '<em><b>Admin Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Key</em>' attribute.
	 * @see #setAdminKey(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_AdminKey()
	 * @model
	 * @generated
	 */
	String getAdminKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getAdminKey <em>Admin Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Key</em>' attribute.
	 * @see #getAdminKey()
	 * @generated
	 */
	void setAdminKey(String value);

	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' attribute.
	 * @see #setPlugin(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Plugin()
	 * @model
	 * @generated
	 */
	String getPlugin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getPlugin <em>Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin</em>' attribute.
	 * @see #getPlugin()
	 * @generated
	 */
	void setPlugin(String value);

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
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Commands()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<ServiceCommandProviderReg> getCommands();

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
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
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
	 * The list contents are of type {@link org.abchip.mimo.service.reg.ServiceHookReg}.
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
	List<ServiceHookReg> getHooks();

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' containment reference.
	 * @see #setLogs(ApplicationLogs)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Logs()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ApplicationLogs getLogs();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getLogs <em>Logs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logs</em>' containment reference.
	 * @see #getLogs()
	 * @generated
	 */
	void setLogs(ApplicationLogs value);

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
	 * @model id="true" required="true"
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
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference.
	 * @see #setPaths(ApplicationPaths)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_Paths()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ApplicationPaths getPaths();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getPaths <em>Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paths</em>' containment reference.
	 * @see #getPaths()
	 * @generated
	 */
	void setPaths(ApplicationPaths value);

	/**
	 * Returns the value of the '<em><b>Resource Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Mapping</em>' containment reference.
	 * @see #setResourceMapping(ResourceMapping)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_ResourceMapping()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ResourceMapping getResourceMapping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getResourceMapping <em>Resource Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Mapping</em>' containment reference.
	 * @see #getResourceMapping()
	 * @generated
	 */
	void setResourceMapping(ResourceMapping value);

	/**
	 * Returns the value of the '<em><b>Service Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Mapping</em>' containment reference.
	 * @see #setServiceMapping(ServiceMapping)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplication_ServiceMapping()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	ServiceMapping getServiceMapping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.Application#getServiceMapping <em>Service Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Mapping</em>' containment reference.
	 * @see #getServiceMapping()
	 * @generated
	 */
	void setServiceMapping(ServiceMapping value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List<ApplicationComponent> getActiveComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.abchip.mimo.application.ApplicationBundle" required="true"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getInstallArea();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	String locateBundle(String name);

} // Application
