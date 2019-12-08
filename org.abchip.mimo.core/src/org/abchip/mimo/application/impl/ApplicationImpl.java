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

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.ServiceCommandProvider;
import org.abchip.mimo.application.ServiceConfig;
import org.abchip.mimo.application.ServiceHook;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.abchip.mimo.resource.ResourceMapping;
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
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getResourceMapping <em>Resource Mapping</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ApplicationImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends EntityIdentifiableImpl implements Application {
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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected ContextRoot context;
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
	 * The cached value of the '{@link #getResourceMapping() <em>Resource Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceMapping()
	 * @generated
	 * @ordered
	 */
	protected ResourceMapping resourceMapping;
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
	@Override
	public List<ServiceCommandProvider> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList.Resolving<ServiceCommandProvider>(ServiceCommandProvider.class, this, ApplicationPackage.APPLICATION__COMMANDS);
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
			components = new EObjectContainmentEList.Resolving<ApplicationComponent>(ApplicationComponent.class, this, ApplicationPackage.APPLICATION__COMPONENTS);
		}
		return components;
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
				NotificationChain msgs = oldConfig.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONFIG, null, null);
				if (newConfig.eInternalContainer() == null) {
					msgs = newConfig.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONFIG, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__CONFIG, oldConfig, config));
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
	@Override
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
			hooks = new EObjectContainmentEList.Resolving<ServiceHook>(ServiceHook.class, this, ApplicationPackage.APPLICATION__HOOKS);
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
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public ResourceMapping getResourceMapping() {
		if (resourceMapping != null && ((EObject)resourceMapping).eIsProxy()) {
			InternalEObject oldResourceMapping = (InternalEObject)resourceMapping;
			resourceMapping = (ResourceMapping)eResolveProxy(oldResourceMapping);
			if (resourceMapping != oldResourceMapping) {
				InternalEObject newResourceMapping = (InternalEObject)resourceMapping;
				NotificationChain msgs = oldResourceMapping.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__RESOURCE_MAPPING, null, null);
				if (newResourceMapping.eInternalContainer() == null) {
					msgs = newResourceMapping.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__RESOURCE_MAPPING, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__RESOURCE_MAPPING, oldResourceMapping, resourceMapping));
			}
		}
		return resourceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceMapping basicGetResourceMapping() {
		return resourceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceMapping(ResourceMapping newResourceMapping, NotificationChain msgs) {
		ResourceMapping oldResourceMapping = resourceMapping;
		resourceMapping = newResourceMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__RESOURCE_MAPPING, oldResourceMapping, newResourceMapping);
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
	public void setResourceMapping(ResourceMapping newResourceMapping) {
		if (newResourceMapping != resourceMapping) {
			NotificationChain msgs = null;
			if (resourceMapping != null)
				msgs = ((InternalEObject)resourceMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__RESOURCE_MAPPING, null, msgs);
			if (newResourceMapping != null)
				msgs = ((InternalEObject)newResourceMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__RESOURCE_MAPPING, null, msgs);
			msgs = basicSetResourceMapping(newResourceMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__RESOURCE_MAPPING, newResourceMapping, newResourceMapping));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APPLICATION__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APPLICATION__CONFIG:
				return basicSetConfig(null, msgs);
			case ApplicationPackage.APPLICATION__CONTEXT:
				return basicSetContext(null, msgs);
			case ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION:
				return basicSetContextDescription(null, msgs);
			case ApplicationPackage.APPLICATION__HOOKS:
				return ((InternalEList<?>)getHooks()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.APPLICATION__RESOURCE_MAPPING:
				return basicSetResourceMapping(null, msgs);
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
				if (resolve) return getConfig();
				return basicGetConfig();
			case ApplicationPackage.APPLICATION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION:
				if (resolve) return getContextDescription();
				return basicGetContextDescription();
			case ApplicationPackage.APPLICATION__HOOKS:
				return getHooks();
			case ApplicationPackage.APPLICATION__NAME:
				return getName();
			case ApplicationPackage.APPLICATION__PORT:
				return getPort();
			case ApplicationPackage.APPLICATION__RESOURCE_MAPPING:
				if (resolve) return getResourceMapping();
				return basicGetResourceMapping();
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
				setContext((ContextRoot)newValue);
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
			case ApplicationPackage.APPLICATION__RESOURCE_MAPPING:
				setResourceMapping((ResourceMapping)newValue);
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
				setContext((ContextRoot)null);
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
			case ApplicationPackage.APPLICATION__RESOURCE_MAPPING:
				setResourceMapping((ResourceMapping)null);
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
			case ApplicationPackage.APPLICATION__RESOURCE_MAPPING:
				return resourceMapping != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", port: ");
		result.append(port);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextRoot getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (ContextRoot)eResolveProxy(oldContext);
			if (context != oldContext) {
				InternalEObject newContext = (InternalEObject)context;
				NotificationChain msgs = oldContext.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONTEXT, null, null);
				if (newContext.eInternalContainer() == null) {
					msgs = newContext.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONTEXT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
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
	public ContextRoot basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(ContextRoot newContext, NotificationChain msgs) {
		ContextRoot oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__CONTEXT, oldContext, newContext);
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
	public void setContext(ContextRoot newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextDescription getContextDescription() {
		if (contextDescription != null && ((EObject)contextDescription).eIsProxy()) {
			InternalEObject oldContextDescription = (InternalEObject)contextDescription;
			contextDescription = (ContextDescription)eResolveProxy(oldContextDescription);
			if (contextDescription != oldContextDescription) {
				InternalEObject newContextDescription = (InternalEObject)contextDescription;
				NotificationChain msgs = oldContextDescription.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION, null, null);
				if (newContextDescription.eInternalContainer() == null) {
					msgs = newContextDescription.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.APPLICATION__CONTEXT_DESCRIPTION, oldContextDescription, contextDescription));
			}
		}
		return contextDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDescription basicGetContextDescription() {
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
	@Override
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

} //ApplicationImpl
