/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.ServiceMethodRequest#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceMethodRequest()
 * @model abstract="true"
 * @generated
 */
public interface ServiceMethodRequest<E extends EntityIdentifiable, T> extends ServiceRequest<ServiceMethodResponse<T>> {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(EntityIdentifiable)
	 * @see org.abchip.mimo.service.ServicePackage#getServiceMethodRequest_Entity()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	E getEntity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.ServiceMethodRequest#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(E value);

} // ServiceMethodRequest
