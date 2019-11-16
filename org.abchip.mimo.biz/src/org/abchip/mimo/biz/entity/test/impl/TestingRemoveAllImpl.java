/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.TestingRemoveAll;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Remove All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingRemoveAllImpl#getTestingRemoveAllId <em>Testing Remove All Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingRemoveAllImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingRemoveAllImpl extends BizEntityImpl implements TestingRemoveAll {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTestingRemoveAllId() <em>Testing Remove All Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingRemoveAllId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_REMOVE_ALL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingRemoveAllId() <em>Testing Remove All Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingRemoveAllId()
	 * @generated
	 * @ordered
	 */
	protected String testingRemoveAllId = TESTING_REMOVE_ALL_ID_EDEFAULT;
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
	protected TestingRemoveAllImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TESTING_REMOVE_ALL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_REMOVE_ALL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingRemoveAllId() {
		return testingRemoveAllId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingRemoveAllId(String newTestingRemoveAllId) {
		String oldTestingRemoveAllId = testingRemoveAllId;
		testingRemoveAllId = newTestingRemoveAllId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID, oldTestingRemoveAllId, testingRemoveAllId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID:
				return getTestingRemoveAllId();
			case TestPackage.TESTING_REMOVE_ALL__DESCRIPTION:
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
			case TestPackage.TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID:
				setTestingRemoveAllId((String)newValue);
				return;
			case TestPackage.TESTING_REMOVE_ALL__DESCRIPTION:
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
			case TestPackage.TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID:
				setTestingRemoveAllId(TESTING_REMOVE_ALL_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_REMOVE_ALL__DESCRIPTION:
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
			case TestPackage.TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID:
				return TESTING_REMOVE_ALL_ID_EDEFAULT == null ? testingRemoveAllId != null : !TESTING_REMOVE_ALL_ID_EDEFAULT.equals(testingRemoveAllId);
			case TestPackage.TESTING_REMOVE_ALL__DESCRIPTION:
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
		result.append(" (testingRemoveAllId: ");
		result.append(testingRemoveAllId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TestingRemoveAllImpl
