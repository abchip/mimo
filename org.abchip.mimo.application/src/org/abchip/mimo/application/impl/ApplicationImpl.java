/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.application.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
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
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceCommandProvider> commands;
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationComponent> components;
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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;
	/**
	 * The cached value of the '{@link #getContextDescription() <em>Context Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextDescription()
	 * @generated
	 * @ordered
	 */
	protected ContextDescription contextDescription;
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
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

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
	public List<ServiceCommandProvider> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<ServiceCommandProvider>(ServiceCommandProvider.class, this, ApplicationPackage.APPLICATION__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<ApplicationComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ApplicationComponent>(ApplicationComponent.class, this, ApplicationPackage.APPLICATION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConfig getConfig() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(ServiceConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<ServiceHook> getHooks() {
		if (hooks == null) {
			hooks = new EObjectContainmentEList<ServiceHook>(ServiceHook.class, this, ApplicationPackage.APPLICATION__HOOKS);
		}
		return hooks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__TEXT, oldText, text));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__CONTEXT, oldContext, context));
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
	public void setContext(Context newContext) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDescription getContextDescription() {
		return contextDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextDescription(ContextDescription newContextDescription, NotificationChain msgs) {
		ContextDescription oldContextDescription = contextDescription;
		contextDescription = newContextDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION, oldContextDescription, newContextDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextDescription(ContextDescription newContextDescription) {
		if (newContextDescription != contextDescription) {
			NotificationChain msgs = null;
			if (contextDescription != null)
				msgs = ((InternalEObject)contextDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION, null, msgs);
			if (newContextDescription != null)
				msgs = ((InternalEObject)newContextDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION, null, msgs);
			msgs = basicSetContextDescription(newContextDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION, newContextDescription, newContextDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APPLICATION__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APPLICATION__CONFIG:
				return basicSetConfig(null, msgs);
			case ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION:
				return basicSetContextDescription(null, msgs);
			case ApplicationPackage.APPLICATION__HOOKS:
				return ((InternalEList<?>)getHooks()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.APPLICATION__COMMANDS:
				return getCommands();
			case ApplicationPackage.APPLICATION__COMPONENTS:
				return getComponents();
			case ApplicationPackage.APPLICATION__CONFIG:
				return getConfig();
			case ApplicationPackage.APPLICATION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION:
				return getContextDescription();
			case ApplicationPackage.APPLICATION__HOOKS:
				return getHooks();
			case ApplicationPackage.APPLICATION__NAME:
				return getName();
			case ApplicationPackage.APPLICATION__PORT:
				return getPort();
			case ApplicationPackage.APPLICATION__TEXT:
				return getText();
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
			case ApplicationPackage.APPLICATION__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends ServiceCommandProvider>)newValue);
				return;
			case ApplicationPackage.APPLICATION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ApplicationComponent>)newValue);
				return;
			case ApplicationPackage.APPLICATION__CONFIG:
				setConfig((ServiceConfig)newValue);
				return;
			case ApplicationPackage.APPLICATION__CONTEXT:
				setContext((Context)newValue);
				return;
			case ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION:
				setContextDescription((ContextDescription)newValue);
				return;
			case ApplicationPackage.APPLICATION__HOOKS:
				getHooks().clear();
				getHooks().addAll((Collection<? extends ServiceHook>)newValue);
				return;
			case ApplicationPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.APPLICATION__PORT:
				setPort((Integer)newValue);
				return;
			case ApplicationPackage.APPLICATION__TEXT:
				setText((String)newValue);
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
			case ApplicationPackage.APPLICATION__COMMANDS:
				getCommands().clear();
				return;
			case ApplicationPackage.APPLICATION__COMPONENTS:
				getComponents().clear();
				return;
			case ApplicationPackage.APPLICATION__CONFIG:
				setConfig((ServiceConfig)null);
				return;
			case ApplicationPackage.APPLICATION__CONTEXT:
				setContext((Context)null);
				return;
			case ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION:
				setContextDescription((ContextDescription)null);
				return;
			case ApplicationPackage.APPLICATION__HOOKS:
				getHooks().clear();
				return;
			case ApplicationPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ApplicationPackage.APPLICATION__TEXT:
				setText(TEXT_EDEFAULT);
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
			case ApplicationPackage.APPLICATION__COMMANDS:
				return commands != null && !commands.isEmpty();
			case ApplicationPackage.APPLICATION__COMPONENTS:
				return components != null && !components.isEmpty();
			case ApplicationPackage.APPLICATION__CONFIG:
				return config != null;
			case ApplicationPackage.APPLICATION__CONTEXT:
				return context != null;
			case ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION:
				return contextDescription != null;
			case ApplicationPackage.APPLICATION__HOOKS:
				return hooks != null && !hooks.isEmpty();
			case ApplicationPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.APPLICATION__PORT:
				return port != PORT_EDEFAULT;
			case ApplicationPackage.APPLICATION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", port: ");
		result.append(port);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
