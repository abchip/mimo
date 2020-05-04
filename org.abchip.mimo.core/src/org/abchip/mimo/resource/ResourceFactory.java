/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.entity.EntityIdentifiable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.resource.ResourcePackage
 * @generated
 */
public interface ResourceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceFactory eINSTANCE = org.abchip.mimo.resource.impl.ResourceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Load Seed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Seed</em>'.
	 * @generated
	 */
	LoadSeed createLoadSeed();

	/**
	 * Returns a new object of class '<em>Load Seeds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Seeds</em>'.
	 * @generated
	 */
	LoadSeeds createLoadSeeds();

	/**
	 * Returns a new object of class '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config</em>'.
	 * @generated
	 */
	ResourceConfig createResourceConfig();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	ResourceMapping createResourceMapping();

	/**
	 * Returns a new object of class '<em>Mapping Rule By Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Rule By Frame</em>'.
	 * @generated
	 */
	ResourceMappingRuleByFrame createResourceMappingRuleByFrame();

	/**
	 * Returns a new object of class '<em>Mapping Rule By Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Rule By Package</em>'.
	 * @generated
	 */
	ResourceMappingRuleByPackage createResourceMappingRuleByPackage();

	/**
	 * Returns a new object of class '<em>Notifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notifier</em>'.
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceNotifier<E> createResourceNotifier();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcePackage getResourcePackage();

} //ResourceFactory
