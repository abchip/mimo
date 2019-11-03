/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp;
import org.abchip.mimo.biz.party.communication.CommunicationPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Event Prp Typ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#getCommunicationEventPurposes <em>Communication Event Purposes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationEventPrpTypImpl extends BizEntityImpl implements CommunicationEventPrpTyp {
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
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String parentTypeId = PARENT_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunicationEventPurposes() <em>Communication Event Purposes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> communicationEventPurposes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationEventPrpTypImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION, oldDescription, description));
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
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(String newParentTypeId) {
		String oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCommunicationEventPurposes() {
		if (communicationEventPurposes == null) {
			communicationEventPurposes = new EDataTypeUniqueEList<String>(String.class, this, CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES);
		}
		return communicationEventPurposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childCommunicationEventPrpTyps() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID, oldCommunicationEventPrpTypId, communicationEventPrpTypId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID:
				return getCommunicationEventPrpTypId();
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION:
				return getDescription();
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE:
				return isHasTable();
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE_ID:
				return getParentTypeId();
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES:
				return getCommunicationEventPurposes();
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
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID:
				setCommunicationEventPrpTypId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE_ID:
				setParentTypeId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES:
				getCommunicationEventPurposes().clear();
				getCommunicationEventPurposes().addAll((Collection<? extends String>)newValue);
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
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID:
				setCommunicationEventPrpTypId(COMMUNICATION_EVENT_PRP_TYP_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE_ID:
				setParentTypeId(PARENT_TYPE_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES:
				getCommunicationEventPurposes().clear();
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
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID:
				return COMMUNICATION_EVENT_PRP_TYP_ID_EDEFAULT == null ? communicationEventPrpTypId != null : !COMMUNICATION_EVENT_PRP_TYP_ID_EDEFAULT.equals(communicationEventPrpTypId);
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE_ID:
				return PARENT_TYPE_ID_EDEFAULT == null ? parentTypeId != null : !PARENT_TYPE_ID_EDEFAULT.equals(parentTypeId);
			case CommunicationPackage.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES:
				return communicationEventPurposes != null && !communicationEventPurposes.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", parentTypeId: ");
		result.append(parentTypeId);
		result.append(", communicationEventPurposes: ");
		result.append(communicationEventPurposes);
		result.append(')');
		return result.toString();
	}

} //CommunicationEventPrpTypImpl
