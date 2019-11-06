/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.party.communication.CommunicationEventType;
import org.abchip.mimo.biz.party.communication.CommunicationPackage;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Event Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventTypeImpl#getCommunicationEventTypeId <em>Communication Event Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventTypeImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationEventTypeImpl extends BizEntityTypeImpl<CommunicationEvent> implements CommunicationEventType {
	/**
	 * The default value of the '{@link #getCommunicationEventTypeId() <em>Communication Event Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_EVENT_TYPE_ID_EDEFAULT = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getCommunicationEventTypeId() <em>Communication Event Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventTypeId()
	 * @generated
	 * @ordered
	 */
	protected String communicationEventTypeId = COMMUNICATION_EVENT_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected CommunicationEventType parentTypeId;

	/**
	 * The cached value of the '{@link #getContactMechTypeId() <em>Contact Mech Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContactMechType contactMechTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationEventTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_EVENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType getContactMechTypeId() {
		if (contactMechTypeId != null && ((EObject)contactMechTypeId).eIsProxy()) {
			InternalEObject oldContactMechTypeId = (InternalEObject)contactMechTypeId;
			contactMechTypeId = (ContactMechType)eResolveProxy(oldContactMechTypeId);
			if (contactMechTypeId != oldContactMechTypeId) {
			}
		}
		return contactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMechType basicGetContactMechTypeId() {
		return contactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(ContactMechType newContactMechTypeId) {
		contactMechTypeId = newContactMechTypeId;
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
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		hasTable = newHasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (CommunicationEventType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationEventType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(CommunicationEventType newParentTypeId) {
		parentTypeId = newParentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childCommunicationEventTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> communicationEvents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventTypeId() {
		return communicationEventTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventTypeId(String newCommunicationEventTypeId) {
		communicationEventTypeId = newCommunicationEventTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__COMMUNICATION_EVENT_TYPE_ID:
				return getCommunicationEventTypeId();
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__DESCRIPTION:
				return getDescription();
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__HAS_TABLE:
				return isHasTable();
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__CONTACT_MECH_TYPE_ID:
				if (resolve) return getContactMechTypeId();
				return basicGetContactMechTypeId();
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
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__COMMUNICATION_EVENT_TYPE_ID:
				setCommunicationEventTypeId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((CommunicationEventType)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId((ContactMechType)newValue);
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
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__COMMUNICATION_EVENT_TYPE_ID:
				setCommunicationEventTypeId(COMMUNICATION_EVENT_TYPE_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((CommunicationEventType)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId((ContactMechType)null);
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
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__COMMUNICATION_EVENT_TYPE_ID:
				return COMMUNICATION_EVENT_TYPE_ID_EDEFAULT == null ? communicationEventTypeId != null : !COMMUNICATION_EVENT_TYPE_ID_EDEFAULT.equals(communicationEventTypeId);
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case CommunicationPackage.COMMUNICATION_EVENT_TYPE__CONTACT_MECH_TYPE_ID:
				return contactMechTypeId != null;
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
		result.append(" (communicationEventTypeId: ");
		result.append(communicationEventTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(')');
		return result.toString();
	}

} //CommunicationEventTypeImpl
