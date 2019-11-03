/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort;
import org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping List Work Effort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListWorkEffortImpl#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListWorkEffortImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingListWorkEffortImpl extends BizEntityImpl implements ShoppingListWorkEffort {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getShoppingListId() <em>Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOPPING_LIST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShoppingListId() <em>Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListId()
	 * @generated
	 * @ordered
	 */
	protected String shoppingListId = SHOPPING_LIST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingListWorkEffortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShoppinglistPackage.Literals.SHOPPING_LIST_WORK_EFFORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShoppingListId() {
		return shoppingListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListId(String newShoppingListId) {
		String oldShoppingListId = shoppingListId;
		shoppingListId = newShoppingListId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__SHOPPING_LIST_ID, oldShoppingListId, shoppingListId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		String oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__SHOPPING_LIST_ID:
				return getShoppingListId();
			case ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__WORK_EFFORT_ID:
				return getWorkEffortId();
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
			case ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__SHOPPING_LIST_ID:
				setShoppingListId((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
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
			case ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__SHOPPING_LIST_ID:
				setShoppingListId(SHOPPING_LIST_ID_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
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
			case ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__SHOPPING_LIST_ID:
				return SHOPPING_LIST_ID_EDEFAULT == null ? shoppingListId != null : !SHOPPING_LIST_ID_EDEFAULT.equals(shoppingListId);
			case ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
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
		result.append(" (shoppingListId: ");
		result.append(shoppingListId);
		result.append(", workEffortId: ");
		result.append(workEffortId);
		result.append(')');
		return result.toString();
	}

} //ShoppingListWorkEffortImpl
