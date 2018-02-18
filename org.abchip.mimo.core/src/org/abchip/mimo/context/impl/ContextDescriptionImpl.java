/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getResourceRoot <em>Resource Root</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getResourceTemporary <em>Resource Temporary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextDescriptionImpl extends MinimalEObjectImpl.Container implements ContextDescription {
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
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> resources;
	/**
	 * The default value of the '{@link #getResourceRoot() <em>Resource Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_ROOT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResourceRoot() <em>Resource Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRoot()
	 * @generated
	 * @ordered
	 */
	protected String resourceRoot = RESOURCE_ROOT_EDEFAULT;
	/**
	 * The default value of the '{@link #getResourceTemporary() <em>Resource Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTemporary()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TEMPORARY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResourceTemporary() <em>Resource Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTemporary()
	 * @generated
	 * @ordered
	 */
	protected String resourceTemporary = RESOURCE_TEMPORARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getResources() {
		if (resources == null) {
			resources = new EDataTypeUniqueEList<String>(String.class, this, ContextPackage.CONTEXT_DESCRIPTION__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceRoot() {
		return resourceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRoot(String newResourceRoot) {
		String oldResourceRoot = resourceRoot;
		resourceRoot = newResourceRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_ROOT, oldResourceRoot, resourceRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceTemporary() {
		return resourceTemporary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceTemporary(String newResourceTemporary) {
		String oldResourceTemporary = resourceTemporary;
		resourceTemporary = newResourceTemporary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_TEMPORARY, oldResourceTemporary, resourceTemporary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.CONTEXT_DESCRIPTION__NAME:
				return getName();
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCES:
				return getResources();
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_ROOT:
				return getResourceRoot();
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_TEMPORARY:
				return getResourceTemporary();
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
			case ContextPackage.CONTEXT_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends String>)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_ROOT:
				setResourceRoot((String)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_TEMPORARY:
				setResourceTemporary((String)newValue);
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
			case ContextPackage.CONTEXT_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCES:
				getResources().clear();
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_ROOT:
				setResourceRoot(RESOURCE_ROOT_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_TEMPORARY:
				setResourceTemporary(RESOURCE_TEMPORARY_EDEFAULT);
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
			case ContextPackage.CONTEXT_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_ROOT:
				return RESOURCE_ROOT_EDEFAULT == null ? resourceRoot != null : !RESOURCE_ROOT_EDEFAULT.equals(resourceRoot);
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_TEMPORARY:
				return RESOURCE_TEMPORARY_EDEFAULT == null ? resourceTemporary != null : !RESOURCE_TEMPORARY_EDEFAULT.equals(resourceTemporary);
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
		result.append(", resources: ");
		result.append(resources);
		result.append(", resourceRoot: ");
		result.append(resourceRoot);
		result.append(", resourceTemporary: ");
		result.append(resourceTemporary);
		result.append(')');
		return result.toString();
	}

} //ContextDescriptionImpl
