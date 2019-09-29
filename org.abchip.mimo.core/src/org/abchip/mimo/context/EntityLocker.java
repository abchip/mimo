/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

import java.net.URI;

import org.abchip.mimo.entity.EntityNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Locker</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getEntityLocker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EntityLocker<N extends EntityNameable> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.abchip.mimo.util.JavaURI" required="true"
	 * @generated
	 */
	URI getAddress();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	void lock(LockType lockType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	boolean tryLock(long time, LockType lockType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	void unlock(LockType lockType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	boolean isLocked(LockType lockType);

} // EntityLocker
