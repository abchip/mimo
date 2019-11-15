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

import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ApplicationModule;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.ServiceCommandProvider;
import org.abchip.mimo.application.ServiceConfig;
import org.abchip.mimo.application.ServiceHook;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.entity.impl.EntityNameableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationComponentImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationComponentImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationComponentImpl#getHooks <em>Hooks</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationComponentImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationComponentImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationComponentImpl extends EntityNameableImpl implements ApplicationComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceConfig getConfig() {
		return (ServiceConfig)eGet(ApplicationPackage.Literals.APPLICATION_COMPONENT__CONFIG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(ServiceConfig newConfig) {
		eSet(ApplicationPackage.Literals.APPLICATION_COMPONENT__CONFIG, newConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceCommandProvider> getCommands() {
		return (List<ServiceCommandProvider>)eGet(ApplicationPackage.Literals.APPLICATION_COMPONENT__COMMANDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceHook> getHooks() {
		return (List<ServiceHook>)eGet(ApplicationPackage.Literals.APPLICATION_COMPONENT__HOOKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ApplicationModule> getModules() {
		return (List<ApplicationModule>)eGet(ApplicationPackage.Literals.APPLICATION_COMPONENT__MODULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eGet(ApplicationPackage.Literals.APPLICATION_COMPONENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(ApplicationPackage.Literals.APPLICATION_COMPONENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextDescription getContextDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		return (Context)eGet(ApplicationPackage.Literals.APPLICATION_COMPONENT__CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		eSet(ApplicationPackage.Literals.APPLICATION_COMPONENT__CONTEXT, newContext);
	}

} //ApplicationComponentImpl
