/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import org.abchip.mimo.context.ContextProvider;

import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.ResourceSerializer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Serializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.impl.ResourceSerializerImpl#getContextProvider <em>Context Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.ResourceSerializerImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.ResourceSerializerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceSerializerImpl<E extends EntityNameable> extends MinimalEObjectImpl.Container implements ResourceSerializer<E> {
	/**
	 * The cached value of the '{@link #getContextProvider() <em>Context Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextProvider()
	 * @generated
	 * @ordered
	 */
	protected ContextProvider contextProvider;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame<E> frame;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceSerializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.RESOURCE_SERIALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextProvider getContextProvider() {
		return contextProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextProvider(ContextProvider newContextProvider) {
		ContextProvider oldContextProvider = contextProvider;
		contextProvider = newContextProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.RESOURCE_SERIALIZER__CONTEXT_PROVIDER, oldContextProvider, contextProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame<E> getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(Frame<E> newFrame) {
		Frame<E> oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.RESOURCE_SERIALIZER__FRAME, oldFrame, frame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.RESOURCE_SERIALIZER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.RESOURCE_SERIALIZER__CONTEXT_PROVIDER:
				return getContextProvider();
			case EntityPackage.RESOURCE_SERIALIZER__FRAME:
				return getFrame();
			case EntityPackage.RESOURCE_SERIALIZER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.RESOURCE_SERIALIZER__CONTEXT_PROVIDER:
				setContextProvider((ContextProvider)newValue);
				return;
			case EntityPackage.RESOURCE_SERIALIZER__FRAME:
				setFrame((Frame<E>)newValue);
				return;
			case EntityPackage.RESOURCE_SERIALIZER__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityPackage.RESOURCE_SERIALIZER__CONTEXT_PROVIDER:
				setContextProvider((ContextProvider)null);
				return;
			case EntityPackage.RESOURCE_SERIALIZER__FRAME:
				setFrame((Frame<E>)null);
				return;
			case EntityPackage.RESOURCE_SERIALIZER__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityPackage.RESOURCE_SERIALIZER__CONTEXT_PROVIDER:
				return contextProvider != null;
			case EntityPackage.RESOURCE_SERIALIZER__FRAME:
				return frame != null;
			case EntityPackage.RESOURCE_SERIALIZER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResourceSerializerImpl
