/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.communication.CommunicationEventPurpose;
import org.abchip.mimo.biz.party.communication.CommunicationPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Event Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPurposeImpl#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPurposeImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPurposeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationEventPurposeImpl extends BizEntityImpl implements CommunicationEventPurpose {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getCommunicationEventPrpTypId() <em>Communication Event Prp Typ Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventPrpTypId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_EVENT_PRP_TYP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCommunicationEventPrpTypId() <em>Communication Event Prp Typ Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventPrpTypId()
	 * @generated
	 * @ordered
	 */
	protected String communicationEventPrpTypId = COMMUNICATION_EVENT_PRP_TYP_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_EVENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected String communicationEventId = COMMUNICATION_EVENT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationEventPurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_EVENT_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventId() {
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(String newCommunicationEventId) {
		String oldCommunicationEventId = communicationEventId;
		communicationEventId = newCommunicationEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventPrpTypId() {
		return communicationEventPrpTypId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventPrpTypId(String newCommunicationEventPrpTypId) {
		String oldCommunicationEventPrpTypId = communicationEventPrpTypId;
		communicationEventPrpTypId = newCommunicationEventPrpTypId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_PRP_TYP_ID, oldCommunicationEventPrpTypId, communicationEventPrpTypId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_PRP_TYP_ID:
				return getCommunicationEventPrpTypId();
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_ID:
				return getCommunicationEventId();
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__DESCRIPTION:
				return getDescription();
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
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_PRP_TYP_ID:
				setCommunicationEventPrpTypId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__DESCRIPTION:
				setDescription((String)newValue);
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
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_PRP_TYP_ID:
				setCommunicationEventPrpTypId(COMMUNICATION_EVENT_PRP_TYP_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_ID:
				setCommunicationEventId(COMMUNICATION_EVENT_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_PRP_TYP_ID:
				return COMMUNICATION_EVENT_PRP_TYP_ID_EDEFAULT == null ? communicationEventPrpTypId != null : !COMMUNICATION_EVENT_PRP_TYP_ID_EDEFAULT.equals(communicationEventPrpTypId);
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_ID:
				return COMMUNICATION_EVENT_ID_EDEFAULT == null ? communicationEventId != null : !COMMUNICATION_EVENT_ID_EDEFAULT.equals(communicationEventId);
			case CommunicationPackage.COMMUNICATION_EVENT_PURPOSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (communicationEventPrpTypId: ");
		result.append(communicationEventPrpTypId);
		result.append(", communicationEventId: ");
		result.append(communicationEventId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CommunicationEventPurposeImpl
