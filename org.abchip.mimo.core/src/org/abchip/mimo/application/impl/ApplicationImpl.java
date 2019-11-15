/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.application.impl;

import java.util.List;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.ServiceCommandProvider;
import org.abchip.mimo.application.ServiceConfig;
import org.abchip.mimo.application.ServiceHook;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.impl.EntityNameableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getContextDescription <em>Context Description</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends EntityNameableImpl implements Application {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceCommandProvider> getCommands() {
		return (List<ServiceCommandProvider>)eGet(ApplicationPackage.Literals.APPLICATION__COMMANDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ApplicationComponent> getComponents() {
		return (List<ApplicationComponent>)eGet(ApplicationPackage.Literals.APPLICATION__COMPONENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceConfig getConfig() {
		return (ServiceConfig)eGet(ApplicationPackage.Literals.APPLICATION__CONFIG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(ServiceConfig newConfig) {
		eSet(ApplicationPackage.Literals.APPLICATION__CONFIG, newConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceHook> getHooks() {
		return (List<ServiceHook>)eGet(ApplicationPackage.Literals.APPLICATION__HOOKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eGet(ApplicationPackage.Literals.APPLICATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(ApplicationPackage.Literals.APPLICATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return (Integer)eGet(ApplicationPackage.Literals.APPLICATION__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		eSet(ApplicationPackage.Literals.APPLICATION__PORT, newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eGet(ApplicationPackage.Literals.APPLICATION__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eSet(ApplicationPackage.Literals.APPLICATION__TEXT, newText);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextRoot getContext() {
		return (ContextRoot)eGet(ApplicationPackage.Literals.APPLICATION__CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(ContextRoot newContext) {
		eSet(ApplicationPackage.Literals.APPLICATION__CONTEXT, newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextDescription getContextDescription() {
		return (ContextDescription)eGet(ApplicationPackage.Literals.APPLICATION__CONTEXT_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextDescription(ContextDescription newContextDescription) {
		eSet(ApplicationPackage.Literals.APPLICATION__CONTEXT_DESCRIPTION, newContextDescription);
	}

} //ApplicationImpl
