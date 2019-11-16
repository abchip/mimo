/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.entity.tenant.Component;
import org.abchip.mimo.biz.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.ComponentImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.ComponentImpl#getRootLocation <em>Root Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.ComponentImpl#getTenantComponents <em>Tenant Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends BizEntityImpl implements Component {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected String componentName = COMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootLocation() <em>Root Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootLocation() <em>Root Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootLocation()
	 * @generated
	 * @ordered
	 */
	protected String rootLocation = ROOT_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTenantComponents() <em>Tenant Components</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tenantComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TenantPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentName() {
		return componentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentName(String newComponentName) {
		String oldComponentName = componentName;
		componentName = newComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TenantPackage.COMPONENT__COMPONENT_NAME, oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootLocation() {
		return rootLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootLocation(String newRootLocation) {
		String oldRootLocation = rootLocation;
		rootLocation = newRootLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TenantPackage.COMPONENT__ROOT_LOCATION, oldRootLocation, rootLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getTenantComponents() {
		if (tenantComponents == null) {
			tenantComponents = new EDataTypeUniqueEList<String>(String.class, this, TenantPackage.COMPONENT__TENANT_COMPONENTS);
		}
		return tenantComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TenantPackage.COMPONENT__COMPONENT_NAME:
				return getComponentName();
			case TenantPackage.COMPONENT__ROOT_LOCATION:
				return getRootLocation();
			case TenantPackage.COMPONENT__TENANT_COMPONENTS:
				return getTenantComponents();
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
			case TenantPackage.COMPONENT__COMPONENT_NAME:
				setComponentName((String)newValue);
				return;
			case TenantPackage.COMPONENT__ROOT_LOCATION:
				setRootLocation((String)newValue);
				return;
			case TenantPackage.COMPONENT__TENANT_COMPONENTS:
				getTenantComponents().clear();
				getTenantComponents().addAll((Collection<? extends String>)newValue);
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
			case TenantPackage.COMPONENT__COMPONENT_NAME:
				setComponentName(COMPONENT_NAME_EDEFAULT);
				return;
			case TenantPackage.COMPONENT__ROOT_LOCATION:
				setRootLocation(ROOT_LOCATION_EDEFAULT);
				return;
			case TenantPackage.COMPONENT__TENANT_COMPONENTS:
				getTenantComponents().clear();
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
			case TenantPackage.COMPONENT__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? componentName != null : !COMPONENT_NAME_EDEFAULT.equals(componentName);
			case TenantPackage.COMPONENT__ROOT_LOCATION:
				return ROOT_LOCATION_EDEFAULT == null ? rootLocation != null : !ROOT_LOCATION_EDEFAULT.equals(rootLocation);
			case TenantPackage.COMPONENT__TENANT_COMPONENTS:
				return tenantComponents != null && !tenantComponents.isEmpty();
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
		result.append(" (componentName: ");
		result.append(componentName);
		result.append(", rootLocation: ");
		result.append(rootLocation);
		result.append(", tenantComponents: ");
		result.append(tenantComponents);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
