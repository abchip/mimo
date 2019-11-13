/**

 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource Provider</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceProvider()
 * @model abstract="true"
 * @generated
 */
public interface ResourceProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true"
	 * @generated
	 */
	boolean isActive(ContextProvider contextProvider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	ContextProvider login(String contextId, AuthenticationAnonymous authentication);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	ContextProvider login(String contextId, AuthenticationUserPassword authentication);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIdRequired="true" authenticationRequired="true"
	 * @generated
	 */
	ContextProvider login(String contextId, AuthenticationUserToken authentication);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model authenticationRequired="true" createRequired="true"
	 * @generated
	 */
	boolean checkLogin(AuthenticationUserToken authentication, boolean create);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true" klassRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, Class<E> klass, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, Frame<E> frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, String frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true"
	 * @generated
	 */
	void logout(ContextProvider contextProvider);

} // ResourceProvider