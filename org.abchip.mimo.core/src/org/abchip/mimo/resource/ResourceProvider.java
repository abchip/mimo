/**

 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
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
	 * @model required="true" exceptions="org.abchip.mimo.resource.ResourceException" contextRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Resource<E> createResource(Context context, Frame<E> frame, String tenantId) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.resource.ResourceException" contextRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Resource<E> createResource(Context context, Class<E> klass, String tenantId) throws ResourceException;

} // ResourceProvider
