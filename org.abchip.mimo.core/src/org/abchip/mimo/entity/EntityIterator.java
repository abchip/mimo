/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.entity;

import java.io.Closeable;
import java.lang.Iterable;
import java.util.Iterator;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Entity Iterator</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.entity.EntityPackage#getEntityIterator()
 * @model interface="true" abstract="true" superTypes="org.abchip.mimo.util.JavaIterator&lt;E&gt; org.abchip.mimo.util.JavaIterable&lt;E&gt; org.abchip.mimo.util.JavaCloseable"
 * @generated
 */
public interface EntityIterator<E extends Entity> extends Iterator<E>, Iterable<E>, Closeable {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	@Override
	boolean hasNext();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	@Override
	E next();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	@Override
	void remove();

} // EntityIterator
