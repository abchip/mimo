/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import java.util.concurrent.Callable;

import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.Update#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getUpdate()
 * @model superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.service.ServiceResponse&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.service.ServiceResponse&gt;"
 * @generated
 */
public interface Update<E extends EntityIdentifiable> extends ServiceRequest<ServiceResponse>, Callable<ServiceResponse> {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(EntityIdentifiable)
	 * @see org.abchip.mimo.entity.EntityPackage#getUpdate_Entity()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	E getEntity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Update#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(E value);

} // Update
