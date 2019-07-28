/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getResourceRoot <em>Resource Root</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getResourceTemporary <em>Resource Temporary</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextDescriptionImpl extends EntityImpl implements ContextDescription {
	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
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
	 * The default value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected String tenant = TENANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

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
	@Override
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS, oldAnonymous, anonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getResourceRoot() {
		return resourceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getResourceTemporary() {
		return resourceTemporary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public String getTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenant(String newTenant) {
		String oldTenant = tenant;
		tenant = newTenant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__TENANT, oldTenant, tenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.CONTEXT_DESCRIPTION__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS:
				return isAnonymous();
			case ContextPackage.CONTEXT_DESCRIPTION__ID:
				return getId();
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCES:
				return getResources();
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_ROOT:
				return getResourceRoot();
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_TEMPORARY:
				return getResourceTemporary();
			case ContextPackage.CONTEXT_DESCRIPTION__TENANT:
				return getTenant();
			case ContextPackage.CONTEXT_DESCRIPTION__USER:
				return getUser();
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
			case ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS:
				setAnonymous((Boolean)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__ID:
				setId((String)newValue);
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
			case ContextPackage.CONTEXT_DESCRIPTION__TENANT:
				setTenant((String)newValue);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__USER:
				setUser((String)newValue);
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
			case ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS:
				setAnonymous(ANONYMOUS_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__ID:
				setId(ID_EDEFAULT);
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
			case ContextPackage.CONTEXT_DESCRIPTION__TENANT:
				setTenant(TENANT_EDEFAULT);
				return;
			case ContextPackage.CONTEXT_DESCRIPTION__USER:
				setUser(USER_EDEFAULT);
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
			case ContextPackage.CONTEXT_DESCRIPTION__ANONYMOUS:
				return anonymous != ANONYMOUS_EDEFAULT;
			case ContextPackage.CONTEXT_DESCRIPTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_ROOT:
				return RESOURCE_ROOT_EDEFAULT == null ? resourceRoot != null : !RESOURCE_ROOT_EDEFAULT.equals(resourceRoot);
			case ContextPackage.CONTEXT_DESCRIPTION__RESOURCE_TEMPORARY:
				return RESOURCE_TEMPORARY_EDEFAULT == null ? resourceTemporary != null : !RESOURCE_TEMPORARY_EDEFAULT.equals(resourceTemporary);
			case ContextPackage.CONTEXT_DESCRIPTION__TENANT:
				return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
			case ContextPackage.CONTEXT_DESCRIPTION__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
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
		result.append(" (anonymous: ");
		result.append(anonymous);
		result.append(", id: ");
		result.append(id);
		result.append(", resources: ");
		result.append(resources);
		result.append(", resourceRoot: ");
		result.append(resourceRoot);
		result.append(", resourceTemporary: ");
		result.append(resourceTemporary);
		result.append(", tenant: ");
		result.append(tenant);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //ContextDescriptionImpl
