/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Update;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.impl.ServiceEntityRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Update</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class UpdateImpl<E extends EntityIdentifiable> extends ServiceEntityRequestImpl<E> implements Update<E> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.UPDATE;
	}

	@Override
	public Void call() throws Exception {

		E entity = this.getEntity();

		ResourceWriter<E> entityWriter = this.getContext().getResourceManager().getResourceWriter(entity.isa(), this.getTenant());
		entityWriter.update(entity);

		return null;
	}
} // UpdateImpl