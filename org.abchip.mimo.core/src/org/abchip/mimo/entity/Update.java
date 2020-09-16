/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import java.util.concurrent.Callable;
import org.abchip.mimo.service.ServiceEntityRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.entity.EntityPackage#getUpdate()
 * @model superTypes="org.abchip.mimo.service.ServiceEntityRequest&lt;E&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.java.JavaVoid&gt;"
 * @generated
 */
public interface Update<E extends EntityIdentifiable> extends ServiceEntityRequest<E>, Callable<Void> {

} // Update
