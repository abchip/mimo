/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.entity.impl;

import org.abchip.mimo.EMFEntity2FrameAdapter;
import org.abchip.mimo.EMFFrameAdapter;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Object</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Frame<? extends Entity> isa() {

		EClass eClass = eClass();

		EMFEntity2FrameAdapter adapter = (EMFEntity2FrameAdapter) EcoreUtil.getRegisteredAdapter(eClass, EMFEntity2FrameAdapter.class);
		if (adapter == null) {
			synchronized (eClass) {
				adapter = (EMFEntity2FrameAdapter) EcoreUtil.getRegisteredAdapter(eClass, EMFEntity2FrameAdapter.class);
				if (adapter == null) {
					Frame<?> frame = new EMFFrameAdapter<Entity>(eClass);
					adapter = new EMFEntity2FrameAdapter(frame);
					eClass.eAdapters().add(adapter);
				}
			}
		}

		return adapter.getFrame();
	}
} // EntityImpl
