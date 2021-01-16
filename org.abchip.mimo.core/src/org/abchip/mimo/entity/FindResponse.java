/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import java.util.List;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.FindResponse#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getFindResponse()
 * @model
 * @generated
 */
public interface FindResponse<E extends EntityIdentifiable> extends ServiceResponse {

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see org.abchip.mimo.entity.EntityPackage#getFindResponse_Entities()
	 * @model required="true"
	 * @generated
	 */
	List<E> getEntities();
} // FindResponse
