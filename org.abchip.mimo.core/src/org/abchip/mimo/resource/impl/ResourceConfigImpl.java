/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import org.abchip.mimo.entity.impl.EntityImpl;

import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourcePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.impl.ResourceConfigImpl#isLockSupport <em>Lock Support</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.impl.ResourceConfigImpl#isOrderSupport <em>Order Support</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.impl.ResourceConfigImpl#getPageSize <em>Page Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceConfigImpl extends EntityImpl implements ResourceConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePackage.Literals.RESOURCE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLockSupport() {
		return (Boolean)eGet(ResourcePackage.Literals.RESOURCE_CONFIG__LOCK_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockSupport(boolean newLockSupport) {
		eSet(ResourcePackage.Literals.RESOURCE_CONFIG__LOCK_SUPPORT, newLockSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrderSupport() {
		return (Boolean)eGet(ResourcePackage.Literals.RESOURCE_CONFIG__ORDER_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderSupport(boolean newOrderSupport) {
		eSet(ResourcePackage.Literals.RESOURCE_CONFIG__ORDER_SUPPORT, newOrderSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPageSize() {
		return (Integer)eGet(ResourcePackage.Literals.RESOURCE_CONFIG__PAGE_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageSize(int newPageSize) {
		eSet(ResourcePackage.Literals.RESOURCE_CONFIG__PAGE_SIZE, newPageSize);
	}

} //ResourceConfigImpl
