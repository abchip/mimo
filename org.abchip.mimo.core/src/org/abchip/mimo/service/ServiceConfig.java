/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.service;

import java.util.List;
import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.ServiceConfig#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceConfig()
 * @model
 * @generated
 */
public interface ServiceConfig extends Entity {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.entity.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see org.abchip.mimo.service.ServicePackage#getServiceConfig_Entities()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	List<Entity> getEntities();

} // ServiceConfig
