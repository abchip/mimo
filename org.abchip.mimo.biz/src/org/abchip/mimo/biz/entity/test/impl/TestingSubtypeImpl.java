/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.TestingSubtype;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Subtype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingSubtypeImpl#getTestingTypeId <em>Testing Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingSubtypeImpl#getSubtypeDescription <em>Subtype Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingSubtypeImpl extends BizEntityImpl implements TestingSubtype {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTestingTypeId() <em>Testing Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingTypeId() <em>Testing Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingTypeId()
	 * @generated
	 * @ordered
	 */
	protected String testingTypeId = TESTING_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSubtypeDescription() <em>Subtype Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubtypeDescription() <em>Subtype Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String subtypeDescription = SUBTYPE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingSubtypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TESTING_SUBTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubtypeDescription() {
		return subtypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtypeDescription(String newSubtypeDescription) {
		String oldSubtypeDescription = subtypeDescription;
		subtypeDescription = newSubtypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_SUBTYPE__SUBTYPE_DESCRIPTION, oldSubtypeDescription, subtypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingTypeId() {
		return testingTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingTypeId(String newTestingTypeId) {
		String oldTestingTypeId = testingTypeId;
		testingTypeId = newTestingTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_SUBTYPE__TESTING_TYPE_ID, oldTestingTypeId, testingTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TESTING_SUBTYPE__TESTING_TYPE_ID:
				return getTestingTypeId();
			case TestPackage.TESTING_SUBTYPE__SUBTYPE_DESCRIPTION:
				return getSubtypeDescription();
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
			case TestPackage.TESTING_SUBTYPE__TESTING_TYPE_ID:
				setTestingTypeId((String)newValue);
				return;
			case TestPackage.TESTING_SUBTYPE__SUBTYPE_DESCRIPTION:
				setSubtypeDescription((String)newValue);
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
			case TestPackage.TESTING_SUBTYPE__TESTING_TYPE_ID:
				setTestingTypeId(TESTING_TYPE_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_SUBTYPE__SUBTYPE_DESCRIPTION:
				setSubtypeDescription(SUBTYPE_DESCRIPTION_EDEFAULT);
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
			case TestPackage.TESTING_SUBTYPE__TESTING_TYPE_ID:
				return TESTING_TYPE_ID_EDEFAULT == null ? testingTypeId != null : !TESTING_TYPE_ID_EDEFAULT.equals(testingTypeId);
			case TestPackage.TESTING_SUBTYPE__SUBTYPE_DESCRIPTION:
				return SUBTYPE_DESCRIPTION_EDEFAULT == null ? subtypeDescription != null : !SUBTYPE_DESCRIPTION_EDEFAULT.equals(subtypeDescription);
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
		result.append(" (testingTypeId: ");
		result.append(testingTypeId);
		result.append(", subtypeDescription: ");
		result.append(subtypeDescription);
		result.append(')');
		return result.toString();
	}

} //TestingSubtypeImpl
