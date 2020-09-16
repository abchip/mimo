/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.ServiceEntityRequest#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceEntityRequest()
 * @model abstract="true"
 * @generated
 */
public interface ServiceEntityRequest<E extends EntityIdentifiable> extends ServiceRequest<ServiceResponse> {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(EntityIdentifiable)
	 * @see org.abchip.mimo.service.ServicePackage#getServiceEntityRequest_Entity()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	E getEntity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.ServiceEntityRequest#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(E value);

} // ServiceEntityRequest
