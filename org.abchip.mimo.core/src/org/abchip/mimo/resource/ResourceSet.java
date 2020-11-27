/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.application.ServiceScope;
import org.abchip.mimo.application.ServiceScope.Scope;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Set</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceSet()
 * @model abstract="true"
 * @generated
 */
@ServiceScope(Scope.CONTEXT)
public interface ResourceSet extends Entity {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.resource.ResourceException" klassRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Resource<E> getResource(Class<E> klass) throws ResourceException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.resource.ResourceException" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Resource<E> getResource(Frame<E> frame) throws ResourceException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.resource.ResourceException" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Resource<E> getResource(String frame) throws ResourceException;
} // ResourceSet
