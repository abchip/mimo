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

import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.ServiceRegistry;
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
 *   <li>{@link org.abchip.mimo.application.impl.ServiceRegistryImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.ServiceRegistryImpl#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceRegistryImpl extends ServiceRefImpl implements ServiceRegistry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.SERVICE_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceRegistryEntry> getEntries() {
		return (List<ServiceRegistryEntry>)eGet(ApplicationPackage.Literals.SERVICE_REGISTRY__ENTRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterfaceName() {
		return (String)eGet(ApplicationPackage.Literals.SERVICE_REGISTRY__INTERFACE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceName(String newInterfaceName) {
		eSet(ApplicationPackage.Literals.SERVICE_REGISTRY__INTERFACE_NAME, newInterfaceName);
	}

} //ServiceRegistryImpl
