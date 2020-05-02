/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.application.Service;
import org.abchip.mimo.application.Service.Scope;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Set</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceSet()
 * @model abstract="true"
 * @generated
 */
@Service(scope = Scope.CONTEXT)
public interface ResourceSet extends Entity {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" frameIdRequired="true" tenantIdRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Resource<E> getResource(String frameId, String tenantId);

} // ResourceSet
