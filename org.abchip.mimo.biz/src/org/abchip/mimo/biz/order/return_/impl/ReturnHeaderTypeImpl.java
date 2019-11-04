/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.order.return_.ReturnHeaderType;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderTypeImpl#getReturnHeaderTypeId <em>Return Header Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnHeaderTypeImpl extends BizEntityTypeImpl<ReturnHeader> implements ReturnHeaderType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReturnHeaderTypeId() <em>Return Header Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnHeaderTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_HEADER_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnHeaderTypeId() <em>Return Header Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnHeaderTypeId()
	 * @generated
	 * @ordered
	 */
	protected String returnHeaderTypeId = RETURN_HEADER_TYPE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ReturnHeaderType parentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnHeaderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_HEADER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeaderType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (ReturnHeaderType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_HEADER_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnHeaderType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ReturnHeaderType newParentTypeId) {
		ReturnHeaderType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childReturnHeaderTypes() {
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
	public List<String> returnHeaders() {
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
	public List<String> returnItemTypeMaps() {
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
	public String getReturnHeaderTypeId() {
		return returnHeaderTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnHeaderTypeId(String newReturnHeaderTypeId) {
		String oldReturnHeaderTypeId = returnHeaderTypeId;
		returnHeaderTypeId = newReturnHeaderTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID, oldReturnHeaderTypeId, returnHeaderTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID:
				return getReturnHeaderTypeId();
			case ReturnPackage.RETURN_HEADER_TYPE__DESCRIPTION:
				return getDescription();
			case ReturnPackage.RETURN_HEADER_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
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
			case ReturnPackage.RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID:
				setReturnHeaderTypeId((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ReturnPackage.RETURN_HEADER_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ReturnHeaderType)newValue);
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
			case ReturnPackage.RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID:
				setReturnHeaderTypeId(RETURN_HEADER_TYPE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ReturnPackage.RETURN_HEADER_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ReturnHeaderType)null);
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
			case ReturnPackage.RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID:
				return RETURN_HEADER_TYPE_ID_EDEFAULT == null ? returnHeaderTypeId != null : !RETURN_HEADER_TYPE_ID_EDEFAULT.equals(returnHeaderTypeId);
			case ReturnPackage.RETURN_HEADER_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ReturnPackage.RETURN_HEADER_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
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
		result.append(" (returnHeaderTypeId: ");
		result.append(returnHeaderTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ReturnHeaderTypeImpl
