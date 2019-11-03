/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.abchip.mimo.biz.order.return_.ReturnType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnTypeImpl#getReturnTypeId <em>Return Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnTypeImpl#getSequenceId <em>Sequence Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnTypeImpl extends BizEntityImpl implements ReturnType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReturnTypeId() <em>Return Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnTypeId() <em>Return Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeId()
	 * @generated
	 * @ordered
	 */
	protected String returnTypeId = RETURN_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getSequenceId() <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceId() <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceId()
	 * @generated
	 * @ordered
	 */
	protected String sequenceId = SEQUENCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnTypeId() {
		return returnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnTypeId(String newReturnTypeId) {
		String oldReturnTypeId = returnTypeId;
		returnTypeId = newReturnTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_TYPE__RETURN_TYPE_ID, oldReturnTypeId, returnTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequenceId() {
		return sequenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceId(String newSequenceId) {
		String oldSequenceId = sequenceId;
		sequenceId = newSequenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_TYPE__SEQUENCE_ID, oldSequenceId, sequenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> returnAdjustments() {
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
	public List<String> returnItems() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_TYPE__RETURN_TYPE_ID:
				return getReturnTypeId();
			case ReturnPackage.RETURN_TYPE__DESCRIPTION:
				return getDescription();
			case ReturnPackage.RETURN_TYPE__SEQUENCE_ID:
				return getSequenceId();
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
			case ReturnPackage.RETURN_TYPE__RETURN_TYPE_ID:
				setReturnTypeId((String)newValue);
				return;
			case ReturnPackage.RETURN_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ReturnPackage.RETURN_TYPE__SEQUENCE_ID:
				setSequenceId((String)newValue);
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
			case ReturnPackage.RETURN_TYPE__RETURN_TYPE_ID:
				setReturnTypeId(RETURN_TYPE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ReturnPackage.RETURN_TYPE__SEQUENCE_ID:
				setSequenceId(SEQUENCE_ID_EDEFAULT);
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
			case ReturnPackage.RETURN_TYPE__RETURN_TYPE_ID:
				return RETURN_TYPE_ID_EDEFAULT == null ? returnTypeId != null : !RETURN_TYPE_ID_EDEFAULT.equals(returnTypeId);
			case ReturnPackage.RETURN_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ReturnPackage.RETURN_TYPE__SEQUENCE_ID:
				return SEQUENCE_ID_EDEFAULT == null ? sequenceId != null : !SEQUENCE_ID_EDEFAULT.equals(sequenceId);
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
		result.append(" (returnTypeId: ");
		result.append(returnTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", sequenceId: ");
		result.append(sequenceId);
		result.append(')');
		return result.toString();
	}

} //ReturnTypeImpl
