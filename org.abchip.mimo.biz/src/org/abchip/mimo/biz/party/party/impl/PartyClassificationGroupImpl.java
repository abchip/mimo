/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.PartyClassificationGroup;
import org.abchip.mimo.biz.party.party.PartyClassificationType;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Classification Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl#getPartyClassificationGroupId <em>Party Classification Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl#getParentGroupId <em>Parent Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl#getPartyClassificationTypeId <em>Party Classification Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyClassificationGroupImpl extends BizEntityImpl implements PartyClassificationGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPartyClassificationGroupId() <em>Party Classification Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyClassificationGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_CLASSIFICATION_GROUP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyClassificationGroupId() <em>Party Classification Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyClassificationGroupId()
	 * @generated
	 * @ordered
	 */
	protected String partyClassificationGroupId = PARTY_CLASSIFICATION_GROUP_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getParentGroupId() <em>Parent Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGroupId()
	 * @generated
	 * @ordered
	 */
	protected PartyClassificationGroup parentGroupId;

	/**
	 * The cached value of the '{@link #getPartyClassificationTypeId() <em>Party Classification Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyClassificationTypeId()
	 * @generated
	 * @ordered
	 */
	protected PartyClassificationType partyClassificationTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyClassificationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_CLASSIFICATION_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyClassificationGroup getParentGroupId() {
		if (parentGroupId != null && ((EObject)parentGroupId).eIsProxy()) {
			InternalEObject oldParentGroupId = (InternalEObject)parentGroupId;
			parentGroupId = (PartyClassificationGroup)eResolveProxy(oldParentGroupId);
			if (parentGroupId != oldParentGroupId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID, oldParentGroupId, parentGroupId));
			}
		}
		return parentGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyClassificationGroup basicGetParentGroupId() {
		return parentGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentGroupId(PartyClassificationGroup newParentGroupId) {
		PartyClassificationGroup oldParentGroupId = parentGroupId;
		parentGroupId = newParentGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID, oldParentGroupId, parentGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyClassificationType getPartyClassificationTypeId() {
		if (partyClassificationTypeId != null && ((EObject)partyClassificationTypeId).eIsProxy()) {
			InternalEObject oldPartyClassificationTypeId = (InternalEObject)partyClassificationTypeId;
			partyClassificationTypeId = (PartyClassificationType)eResolveProxy(oldPartyClassificationTypeId);
			if (partyClassificationTypeId != oldPartyClassificationTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID, oldPartyClassificationTypeId, partyClassificationTypeId));
			}
		}
		return partyClassificationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyClassificationType basicGetPartyClassificationTypeId() {
		return partyClassificationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyClassificationTypeId(PartyClassificationType newPartyClassificationTypeId) {
		PartyClassificationType oldPartyClassificationTypeId = partyClassificationTypeId;
		partyClassificationTypeId = newPartyClassificationTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID, oldPartyClassificationTypeId, partyClassificationTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childPartyClassificationGroups() {
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
	public List<String> segmentGroupClassifications() {
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
	public String getPartyClassificationGroupId() {
		return partyClassificationGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyClassificationGroupId(String newPartyClassificationGroupId) {
		String oldPartyClassificationGroupId = partyClassificationGroupId;
		partyClassificationGroupId = newPartyClassificationGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID, oldPartyClassificationGroupId, partyClassificationGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID:
				return getPartyClassificationGroupId();
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__DESCRIPTION:
				return getDescription();
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID:
				if (resolve) return getParentGroupId();
				return basicGetParentGroupId();
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID:
				if (resolve) return getPartyClassificationTypeId();
				return basicGetPartyClassificationTypeId();
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
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID:
				setPartyClassificationGroupId((String)newValue);
				return;
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID:
				setParentGroupId((PartyClassificationGroup)newValue);
				return;
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID:
				setPartyClassificationTypeId((PartyClassificationType)newValue);
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
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID:
				setPartyClassificationGroupId(PARTY_CLASSIFICATION_GROUP_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID:
				setParentGroupId((PartyClassificationGroup)null);
				return;
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID:
				setPartyClassificationTypeId((PartyClassificationType)null);
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
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID:
				return PARTY_CLASSIFICATION_GROUP_ID_EDEFAULT == null ? partyClassificationGroupId != null : !PARTY_CLASSIFICATION_GROUP_ID_EDEFAULT.equals(partyClassificationGroupId);
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID:
				return parentGroupId != null;
			case PartyPackage.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID:
				return partyClassificationTypeId != null;
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
		result.append(" (partyClassificationGroupId: ");
		result.append(partyClassificationGroupId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PartyClassificationGroupImpl
