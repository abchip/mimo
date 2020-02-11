/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant.impl;

import java.util.List;
import org.abchip.mimo.biz.entity.tenant.Component;
import org.abchip.mimo.biz.entity.tenant.TenantComponent;
import org.abchip.mimo.biz.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(TenantPackage.Literals.COMPONENT__COMPONENT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentName(String newComponentName) {
		eSet(TenantPackage.Literals.COMPONENT__COMPONENT_NAME, newComponentName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootLocation() {
		return (String)eGet(TenantPackage.Literals.COMPONENT__ROOT_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootLocation(String newRootLocation) {
		eSet(TenantPackage.Literals.COMPONENT__ROOT_LOCATION, newRootLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TenantComponent> getTenantComponents() {
		return (List<TenantComponent>)eGet(TenantPackage.Literals.COMPONENT__TENANT_COMPONENTS, true);
	}

} //ComponentImpl
