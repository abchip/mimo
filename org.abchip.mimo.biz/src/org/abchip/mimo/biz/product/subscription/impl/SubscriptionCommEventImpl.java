/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.product.subscription.Subscription;
import org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription Comm Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionCommEventImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionCommEventImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionCommEventImpl extends BizEntityImpl implements SubscriptionCommEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected CommunicationEvent communicationEventId;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected Subscription subscriptionId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionCommEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubscriptionPackage.Literals.SUBSCRIPTION_COMM_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEvent getCommunicationEventId() {
		if (communicationEventId != null && ((EObject)communicationEventId).eIsProxy()) {
			InternalEObject oldCommunicationEventId = (InternalEObject)communicationEventId;
			communicationEventId = (CommunicationEvent)eResolveProxy(oldCommunicationEventId);
			if (communicationEventId != oldCommunicationEventId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
			}
		}
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationEvent basicGetCommunicationEventId() {
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(CommunicationEvent newCommunicationEventId) {
		CommunicationEvent oldCommunicationEventId = communicationEventId;
		communicationEventId = newCommunicationEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscription getSubscriptionId() {
		if (subscriptionId != null && ((EObject)subscriptionId).eIsProxy()) {
			InternalEObject oldSubscriptionId = (InternalEObject)subscriptionId;
			subscriptionId = (Subscription)eResolveProxy(oldSubscriptionId);
			if (subscriptionId != oldSubscriptionId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId));
			}
		}
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription basicGetSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionId(Subscription newSubscriptionId) {
		Subscription oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__COMMUNICATION_EVENT_ID:
				if (resolve) return getCommunicationEventId();
				return basicGetCommunicationEventId();
			case SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__SUBSCRIPTION_ID:
				if (resolve) return getSubscriptionId();
				return basicGetSubscriptionId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((CommunicationEvent)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__SUBSCRIPTION_ID:
				setSubscriptionId((Subscription)newValue);
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
			case SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((CommunicationEvent)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__SUBSCRIPTION_ID:
				setSubscriptionId((Subscription)null);
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
			case SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__COMMUNICATION_EVENT_ID:
				return communicationEventId != null;
			case SubscriptionPackage.SUBSCRIPTION_COMM_EVENT__SUBSCRIPTION_ID:
				return subscriptionId != null;
		}
		return super.eIsSet(featureID);
	}

} //SubscriptionCommEventImpl
