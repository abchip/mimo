/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.impl;

import org.abchip.mimo.edi.EDIPackage;
import org.abchip.mimo.edi.EdiFrameSetup;

import org.abchip.mimo.entity.impl.EntityNameableImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edi Frame Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.impl.EdiFrameSetupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.impl.EdiFrameSetupImpl#getEntityCondition <em>Entity Condition</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.impl.EdiFrameSetupImpl#getEntityEvent <em>Entity Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdiFrameSetupImpl extends EntityNameableImpl implements EdiFrameSetup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getEntityCondition() <em>Entity Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityCondition() <em>Entity Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityCondition()
	 * @generated
	 * @ordered
	 */
	protected String entityCondition = ENTITY_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityEvent() <em>Entity Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityEvent() <em>Entity Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityEvent()
	 * @generated
	 * @ordered
	 */
	protected String entityEvent = ENTITY_EVENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdiFrameSetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDIPackage.Literals.EDI_FRAME_SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDIPackage.EDI_FRAME_SETUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityCondition() {
		return entityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityCondition(String newEntityCondition) {
		String oldEntityCondition = entityCondition;
		entityCondition = newEntityCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDIPackage.EDI_FRAME_SETUP__ENTITY_CONDITION, oldEntityCondition, entityCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityEvent() {
		return entityEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityEvent(String newEntityEvent) {
		String oldEntityEvent = entityEvent;
		entityEvent = newEntityEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDIPackage.EDI_FRAME_SETUP__ENTITY_EVENT, oldEntityEvent, entityEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDIPackage.EDI_FRAME_SETUP__NAME:
				return getName();
			case EDIPackage.EDI_FRAME_SETUP__ENTITY_CONDITION:
				return getEntityCondition();
			case EDIPackage.EDI_FRAME_SETUP__ENTITY_EVENT:
				return getEntityEvent();
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
			case EDIPackage.EDI_FRAME_SETUP__NAME:
				setName((String)newValue);
				return;
			case EDIPackage.EDI_FRAME_SETUP__ENTITY_CONDITION:
				setEntityCondition((String)newValue);
				return;
			case EDIPackage.EDI_FRAME_SETUP__ENTITY_EVENT:
				setEntityEvent((String)newValue);
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
			case EDIPackage.EDI_FRAME_SETUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EDIPackage.EDI_FRAME_SETUP__ENTITY_CONDITION:
				setEntityCondition(ENTITY_CONDITION_EDEFAULT);
				return;
			case EDIPackage.EDI_FRAME_SETUP__ENTITY_EVENT:
				setEntityEvent(ENTITY_EVENT_EDEFAULT);
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
			case EDIPackage.EDI_FRAME_SETUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EDIPackage.EDI_FRAME_SETUP__ENTITY_CONDITION:
				return ENTITY_CONDITION_EDEFAULT == null ? entityCondition != null : !ENTITY_CONDITION_EDEFAULT.equals(entityCondition);
			case EDIPackage.EDI_FRAME_SETUP__ENTITY_EVENT:
				return ENTITY_EVENT_EDEFAULT == null ? entityEvent != null : !ENTITY_EVENT_EDEFAULT.equals(entityEvent);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", entityCondition: ");
		result.append(entityCondition);
		result.append(", entityEvent: ");
		result.append(entityEvent);
		result.append(')');
		return result.toString();
	}

} //EdiFrameSetupImpl
