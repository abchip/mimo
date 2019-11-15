/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.application.impl;

import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.ServiceRegistryEntry;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.impl.ServiceRegistryEntryImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ServiceRegistryEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ServiceRegistryEntryImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ServiceRegistryEntryImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceRegistryEntryImpl extends ServiceRefImpl implements ServiceRegistryEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRegistryEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.SERVICE_REGISTRY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterfaceName() {
		return (String)eGet(ApplicationPackage.Literals.SERVICE_REGISTRY_ENTRY__INTERFACE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceName(String newInterfaceName) {
		eSet(ApplicationPackage.Literals.SERVICE_REGISTRY_ENTRY__INTERFACE_NAME, newInterfaceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eGet(ApplicationPackage.Literals.SERVICE_REGISTRY_ENTRY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(ApplicationPackage.Literals.SERVICE_REGISTRY_ENTRY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return (String)eGet(ApplicationPackage.Literals.SERVICE_REGISTRY_ENTRY__VENDOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		eSet(ApplicationPackage.Literals.SERVICE_REGISTRY_ENTRY__VENDOR, newVendor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eGet(ApplicationPackage.Literals.SERVICE_REGISTRY_ENTRY__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eSet(ApplicationPackage.Literals.SERVICE_REGISTRY_ENTRY__VERSION, newVersion);
	}

} //ServiceRegistryImpl
