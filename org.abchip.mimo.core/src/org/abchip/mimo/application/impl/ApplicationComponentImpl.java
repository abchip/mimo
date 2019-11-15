/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.application.impl;

import java.util.Collection;
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected ServiceConfig config;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getHooks() <em>Hooks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHooks()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceHook> hooks;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceCommandProvider> commands;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationModule> modules;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
		if (config != null && ((EObject)config).eIsProxy()) {
			InternalEObject oldConfig = (InternalEObject)config;
			config = (ServiceConfig)eResolveProxy(oldConfig);
			if (config != oldConfig) {
				InternalEObject newConfig = (InternalEObject)config;
				NotificationChain msgs = oldConfig.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_COMPONENT__CONFIG, null, null);
				if (newConfig.eInternalContainer() == null) {
					msgs = newConfig.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_COMPONENT__CONFIG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION_COMPONENT__CONFIG, oldConfig, config));
			}
		}
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfig basicGetConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(ServiceConfig newConfig, NotificationChain msgs) {
		ServiceConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_COMPONENT__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(ServiceConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_COMPONENT__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_COMPONENT__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_COMPONENT__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<ServiceCommandProvider> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList.Resolving<ServiceCommandProvider>(ServiceCommandProvider.class, this, ApplicationPackage.APPLICATION_COMPONENT__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<ServiceHook> getHooks() {
		if (hooks == null) {
			hooks = new EObjectContainmentEList.Resolving<ServiceHook>(ServiceHook.class, this, ApplicationPackage.APPLICATION_COMPONENT__HOOKS);
		}
		return hooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<ApplicationModule> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList.Resolving<ApplicationModule>(ApplicationModule.class, this, ApplicationPackage.APPLICATION_COMPONENT__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_COMPONENT__NAME, oldName, name));
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
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Context)eResolveProxy(oldContext);
			if (context != oldContext) {
				InternalEObject newContext = (InternalEObject)context;
				NotificationChain msgs = oldContext.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_COMPONENT__CONTEXT, null, null);
				if (newContext.eInternalContainer() == null) {
					msgs = newContext.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_COMPONENT__CONTEXT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION_COMPONENT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_COMPONENT__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_COMPONENT__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION_COMPONENT__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_COMPONENT__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_COMPONENT__CONFIG:
				return basicSetConfig(null, msgs);
			case ApplicationPackage.APPLICATION_COMPONENT__CONTEXT:
				return basicSetContext(null, msgs);
			case ApplicationPackage.APPLICATION_COMPONENT__HOOKS:
				return ((InternalEList<?>)getHooks()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APPLICATION_COMPONENT__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APPLICATION_COMPONENT__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_COMPONENT__CONFIG:
				if (resolve) return getConfig();
				return basicGetConfig();
			case ApplicationPackage.APPLICATION_COMPONENT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ApplicationPackage.APPLICATION_COMPONENT__HOOKS:
				return getHooks();
			case ApplicationPackage.APPLICATION_COMPONENT__COMMANDS:
				return getCommands();
			case ApplicationPackage.APPLICATION_COMPONENT__MODULES:
				return getModules();
			case ApplicationPackage.APPLICATION_COMPONENT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_COMPONENT__CONFIG:
				setConfig((ServiceConfig)newValue);
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__CONTEXT:
				setContext((Context)newValue);
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__HOOKS:
				getHooks().clear();
				getHooks().addAll((Collection<? extends ServiceHook>)newValue);
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends ServiceCommandProvider>)newValue);
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends ApplicationModule>)newValue);
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_COMPONENT__CONFIG:
				setConfig((ServiceConfig)null);
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__CONTEXT:
				setContext((Context)null);
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__HOOKS:
				getHooks().clear();
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__COMMANDS:
				getCommands().clear();
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__MODULES:
				getModules().clear();
				return;
			case ApplicationPackage.APPLICATION_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_COMPONENT__CONFIG:
				return config != null;
			case ApplicationPackage.APPLICATION_COMPONENT__CONTEXT:
				return context != null;
			case ApplicationPackage.APPLICATION_COMPONENT__HOOKS:
				return hooks != null && !hooks.isEmpty();
			case ApplicationPackage.APPLICATION_COMPONENT__COMMANDS:
				return commands != null && !commands.isEmpty();
			case ApplicationPackage.APPLICATION_COMPONENT__MODULES:
				return modules != null && !modules.isEmpty();
			case ApplicationPackage.APPLICATION_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApplicationComponentImpl
