/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.Testing;
import org.abchip.mimo.biz.entity.test.TestingItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingItemImpl#getTestingSeqId <em>Testing Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingItemImpl#getTestingHistory <em>Testing History</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingItemImpl#getTestingId <em>Testing Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingItemImpl extends BizEntityImpl implements TestingItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTestingSeqId() <em>Testing Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingSeqId() <em>Testing Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingSeqId()
	 * @generated
	 * @ordered
	 */
	protected String testingSeqId = TESTING_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTestingHistory() <em>Testing History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_HISTORY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTestingHistory() <em>Testing History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingHistory()
	 * @generated
	 * @ordered
	 */
	protected String testingHistory = TESTING_HISTORY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTestingId() <em>Testing Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingId()
	 * @generated
	 * @ordered
	 */
	protected Testing testingId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TESTING_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingHistory() {
		return testingHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingHistory(String newTestingHistory) {
		String oldTestingHistory = testingHistory;
		testingHistory = newTestingHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_ITEM__TESTING_HISTORY, oldTestingHistory, testingHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Testing getTestingId() {
		if (testingId != null && ((EObject)testingId).eIsProxy()) {
			InternalEObject oldTestingId = (InternalEObject)testingId;
			testingId = (Testing)eResolveProxy(oldTestingId);
			if (testingId != oldTestingId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.TESTING_ITEM__TESTING_ID, oldTestingId, testingId));
			}
		}
		return testingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testing basicGetTestingId() {
		return testingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingId(Testing newTestingId) {
		Testing oldTestingId = testingId;
		testingId = newTestingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_ITEM__TESTING_ID, oldTestingId, testingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingSeqId() {
		return testingSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingSeqId(String newTestingSeqId) {
		String oldTestingSeqId = testingSeqId;
		testingSeqId = newTestingSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_ITEM__TESTING_SEQ_ID, oldTestingSeqId, testingSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TESTING_ITEM__TESTING_SEQ_ID:
				return getTestingSeqId();
			case TestPackage.TESTING_ITEM__TESTING_HISTORY:
				return getTestingHistory();
			case TestPackage.TESTING_ITEM__TESTING_ID:
				if (resolve) return getTestingId();
				return basicGetTestingId();
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
			case TestPackage.TESTING_ITEM__TESTING_SEQ_ID:
				setTestingSeqId((String)newValue);
				return;
			case TestPackage.TESTING_ITEM__TESTING_HISTORY:
				setTestingHistory((String)newValue);
				return;
			case TestPackage.TESTING_ITEM__TESTING_ID:
				setTestingId((Testing)newValue);
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
			case TestPackage.TESTING_ITEM__TESTING_SEQ_ID:
				setTestingSeqId(TESTING_SEQ_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_ITEM__TESTING_HISTORY:
				setTestingHistory(TESTING_HISTORY_EDEFAULT);
				return;
			case TestPackage.TESTING_ITEM__TESTING_ID:
				setTestingId((Testing)null);
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
			case TestPackage.TESTING_ITEM__TESTING_SEQ_ID:
				return TESTING_SEQ_ID_EDEFAULT == null ? testingSeqId != null : !TESTING_SEQ_ID_EDEFAULT.equals(testingSeqId);
			case TestPackage.TESTING_ITEM__TESTING_HISTORY:
				return TESTING_HISTORY_EDEFAULT == null ? testingHistory != null : !TESTING_HISTORY_EDEFAULT.equals(testingHistory);
			case TestPackage.TESTING_ITEM__TESTING_ID:
				return testingId != null;
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
		result.append(" (testingSeqId: ");
		result.append(testingSeqId);
		result.append(", testingHistory: ");
		result.append(testingHistory);
		result.append(')');
		return result.toString();
	}

} //TestingItemImpl
