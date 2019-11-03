/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.return_.ReturnItemTypeMap;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Item Type Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl#getReturnItemMapKey <em>Return Item Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl#getReturnHeaderTypeId <em>Return Header Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl#getReturnItemTypeId <em>Return Item Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnItemTypeMapImpl extends BizEntityImpl implements ReturnItemTypeMap {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReturnItemMapKey() <em>Return Item Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemMapKey()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_MAP_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemMapKey() <em>Return Item Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemMapKey()
	 * @generated
	 * @ordered
	 */
	protected String returnItemMapKey = RETURN_ITEM_MAP_KEY_EDEFAULT;

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
	 * The default value of the '{@link #getReturnItemTypeId() <em>Return Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemTypeId() <em>Return Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String returnItemTypeId = RETURN_ITEM_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnItemTypeMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_ITEM_TYPE_MAP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID, oldReturnHeaderTypeId, returnHeaderTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemMapKey() {
		return returnItemMapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemMapKey(String newReturnItemMapKey) {
		String oldReturnItemMapKey = returnItemMapKey;
		returnItemMapKey = newReturnItemMapKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY, oldReturnItemMapKey, returnItemMapKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemTypeId() {
		return returnItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemTypeId(String newReturnItemTypeId) {
		String oldReturnItemTypeId = returnItemTypeId;
		returnItemTypeId = newReturnItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID, oldReturnItemTypeId, returnItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY:
				return getReturnItemMapKey();
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID:
				return getReturnHeaderTypeId();
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID:
				return getReturnItemTypeId();
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
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY:
				setReturnItemMapKey((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID:
				setReturnHeaderTypeId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID:
				setReturnItemTypeId((String)newValue);
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
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY:
				setReturnItemMapKey(RETURN_ITEM_MAP_KEY_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID:
				setReturnHeaderTypeId(RETURN_HEADER_TYPE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID:
				setReturnItemTypeId(RETURN_ITEM_TYPE_ID_EDEFAULT);
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
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY:
				return RETURN_ITEM_MAP_KEY_EDEFAULT == null ? returnItemMapKey != null : !RETURN_ITEM_MAP_KEY_EDEFAULT.equals(returnItemMapKey);
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID:
				return RETURN_HEADER_TYPE_ID_EDEFAULT == null ? returnHeaderTypeId != null : !RETURN_HEADER_TYPE_ID_EDEFAULT.equals(returnHeaderTypeId);
			case ReturnPackage.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID:
				return RETURN_ITEM_TYPE_ID_EDEFAULT == null ? returnItemTypeId != null : !RETURN_ITEM_TYPE_ID_EDEFAULT.equals(returnItemTypeId);
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
		result.append(" (returnItemMapKey: ");
		result.append(returnItemMapKey);
		result.append(", returnHeaderTypeId: ");
		result.append(returnHeaderTypeId);
		result.append(", returnItemTypeId: ");
		result.append(returnItemTypeId);
		result.append(')');
		return result.toString();
	}

} //ReturnItemTypeMapImpl
