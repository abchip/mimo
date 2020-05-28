/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.impl;

import org.abchip.mimo.entity.EntityIdentifiable;

import org.abchip.mimo.service.ServiceEntityRequest;
import org.abchip.mimo.service.ServicePackage;
import org.abchip.mimo.service.ServiceResponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.impl.ServiceEntityRequestImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceEntityRequestImpl<E extends EntityIdentifiable> extends ServiceRequestImpl<ServiceResponse> implements ServiceEntityRequest<E> {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected E entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEntityRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_ENTITY_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public E getEntity() {
		if (entity != null && ((EObject)entity).eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (E)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				InternalEObject newEntity = (InternalEObject)entity;
				NotificationChain msgs = oldEntity.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY, null, null);
				if (newEntity.eInternalContainer() == null) {
					msgs = newEntity.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(E newEntity, NotificationChain msgs) {
		E oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(E newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY:
				return basicSetEntity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
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
			case ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY:
				setEntity((E)newValue);
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
			case ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY:
				setEntity((E)null);
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
			case ServicePackage.SERVICE_ENTITY_REQUEST__ENTITY:
				return entity != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceEntityRequestImpl