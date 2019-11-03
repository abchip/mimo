/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.communication.CommContentAssocType;
import org.abchip.mimo.biz.party.communication.CommunicationPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Content Assoc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommContentAssocTypeImpl#getCommContentAssocTypeId <em>Comm Content Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommContentAssocTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommContentAssocTypeImpl extends BizEntityImpl implements CommContentAssocType {
	/**
	 * The default value of the '{@link #getCommContentAssocTypeId() <em>Comm Content Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommContentAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMM_CONTENT_ASSOC_TYPE_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getCommContentAssocTypeId() <em>Comm Content Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommContentAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected String commContentAssocTypeId = COMM_CONTENT_ASSOC_TYPE_ID_EDEFAULT;
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
	protected CommContentAssocTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMM_CONTENT_ASSOC_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommContentAssocTypeId() {
		return commContentAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommContentAssocTypeId(String newCommContentAssocTypeId) {
		String oldCommContentAssocTypeId = commContentAssocTypeId;
		commContentAssocTypeId = newCommContentAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__COMM_CONTENT_ASSOC_TYPE_ID, oldCommContentAssocTypeId, commContentAssocTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__COMM_CONTENT_ASSOC_TYPE_ID:
				return getCommContentAssocTypeId();
			case CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__DESCRIPTION:
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
			case CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__COMM_CONTENT_ASSOC_TYPE_ID:
				setCommContentAssocTypeId((String)newValue);
				return;
			case CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__DESCRIPTION:
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
			case CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__COMM_CONTENT_ASSOC_TYPE_ID:
				setCommContentAssocTypeId(COMM_CONTENT_ASSOC_TYPE_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__DESCRIPTION:
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
			case CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__COMM_CONTENT_ASSOC_TYPE_ID:
				return COMM_CONTENT_ASSOC_TYPE_ID_EDEFAULT == null ? commContentAssocTypeId != null : !COMM_CONTENT_ASSOC_TYPE_ID_EDEFAULT.equals(commContentAssocTypeId);
			case CommunicationPackage.COMM_CONTENT_ASSOC_TYPE__DESCRIPTION:
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
		result.append(" (commContentAssocTypeId: ");
		result.append(commContentAssocTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CommContentAssocTypeImpl
