/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity.impl;

import java.util.List;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.ResourceNotifier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.impl.EntityReaderImpl#getContextProvider <em>Context Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.EntityReaderImpl#getNotifier <em>Notifier</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.EntityReaderImpl#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityReaderImpl<E extends EntityNameable> extends MinimalEObjectImpl.Container implements EntityReader<E> {
	/**
	 * The cached value of the '{@link #getContextProvider() <em>Context Provider</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContextProvider()
	 * @generated
	 * @ordered
	 */
	protected ContextProvider contextProvider;

	/**
	 * The cached value of the '{@link #getNotifier() <em>Notifier</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNotifier()
	 * @generated
	 * @ordered
	 */
	protected ResourceNotifier<E> notifier;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame<E> frame;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY_READER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextProvider getContextProvider() {
		return contextProvider;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextProvider(ContextProvider newContextProvider) {
		ContextProvider oldContextProvider = contextProvider;
		contextProvider = newContextProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY_READER__CONTEXT_PROVIDER, oldContextProvider, contextProvider));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ResourceNotifier<E> getNotifier() {
		if (notifier != null && ((EObject)notifier).eIsProxy()) {
			InternalEObject oldNotifier = (InternalEObject)notifier;
			notifier = (ResourceNotifier<E>)eResolveProxy(oldNotifier);
			if (notifier != oldNotifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityPackage.ENTITY_READER__NOTIFIER, oldNotifier, notifier));
			}
		}
		return notifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceNotifier<E> basicGetNotifier() {
		return notifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotifier(ResourceNotifier<E> newNotifier) {
		ResourceNotifier<E> oldNotifier = notifier;
		notifier = newNotifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY_READER__NOTIFIER, oldNotifier, notifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Frame<E> getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrame(Frame<E> newFrame) {
		Frame<E> oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.ENTITY_READER__FRAME, oldFrame, frame));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract boolean exists(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract EntityIterator<E> find(String filter, String fields, int nrElem);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract List<String> findNames(String filter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public E first() {
		try (EntityIterator<E> entityIterator = find(null, null, 1)) {
			if (entityIterator.hasNext())
				return entityIterator.next();
			else
				return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract String getResourceName();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract E lookup(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.ENTITY_READER__CONTEXT_PROVIDER:
				return getContextProvider();
			case EntityPackage.ENTITY_READER__NOTIFIER:
				if (resolve) return getNotifier();
				return basicGetNotifier();
			case EntityPackage.ENTITY_READER__FRAME:
				return getFrame();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.ENTITY_READER__CONTEXT_PROVIDER:
				setContextProvider((ContextProvider)newValue);
				return;
			case EntityPackage.ENTITY_READER__NOTIFIER:
				setNotifier((ResourceNotifier<E>)newValue);
				return;
			case EntityPackage.ENTITY_READER__FRAME:
				setFrame((Frame<E>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityPackage.ENTITY_READER__CONTEXT_PROVIDER:
				setContextProvider((ContextProvider)null);
				return;
			case EntityPackage.ENTITY_READER__NOTIFIER:
				setNotifier((ResourceNotifier<E>)null);
				return;
			case EntityPackage.ENTITY_READER__FRAME:
				setFrame((Frame<E>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityPackage.ENTITY_READER__CONTEXT_PROVIDER:
				return contextProvider != null;
			case EntityPackage.ENTITY_READER__NOTIFIER:
				return notifier != null;
			case EntityPackage.ENTITY_READER__FRAME:
				return frame != null;
		}
		return super.eIsSet(featureID);
	}
} // QResourceImpl