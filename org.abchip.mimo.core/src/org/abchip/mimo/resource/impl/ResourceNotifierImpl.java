/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource.impl;

import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.resource.ResourceEvent;
import org.abchip.mimo.resource.ResourceListener;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourcePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource Notifier</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ResourceNotifierImpl<E extends EntityNameable> extends MinimalEObjectImpl.Container implements ResourceNotifier<E> {

	/**
	 * @generated NOT
	 */
	private List<ResourceListener<E>> listeners = new ArrayList<ResourceListener<E>>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceNotifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePackage.Literals.RESOURCE_NOTIFIER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void fireEvent(ResourceEvent<E> event) {
		for (ResourceListener<E> listener : listeners)
			listener.handleEvent(event);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<ResourceListener<E>> getListeners() {
		return this.listeners;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public void registerListener(ResourceListener<E> listener) {
		listeners.add(listener);
	}

} // ResourceNotifierImpl
