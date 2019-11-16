/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import java.util.Date;

import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.Testing;
import org.abchip.mimo.biz.entity.test.TestingNode;
import org.abchip.mimo.biz.entity.test.TestingNodeMember;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Node Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getExtendFromDate <em>Extend From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getExtendThruDate <em>Extend Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getTestingId <em>Testing Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getTestingNodeId <em>Testing Node Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingNodeMemberImpl extends BizEntityImpl implements TestingNodeMember {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getExtendFromDate() <em>Extend From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXTEND_FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExtendFromDate() <em>Extend From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date extendFromDate = EXTEND_FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getExtendThruDate() <em>Extend Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXTEND_THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExtendThruDate() <em>Extend Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date extendThruDate = EXTEND_THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;
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
	 * The cached value of the '{@link #getTestingNodeId() <em>Testing Node Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingNodeId()
	 * @generated
	 * @ordered
	 */
	protected TestingNode testingNodeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingNodeMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TESTING_NODE_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExtendFromDate() {
		return extendFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendFromDate(Date newExtendFromDate) {
		Date oldExtendFromDate = extendFromDate;
		extendFromDate = newExtendFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_NODE_MEMBER__EXTEND_FROM_DATE, oldExtendFromDate, extendFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExtendThruDate() {
		return extendThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendThruDate(Date newExtendThruDate) {
		Date oldExtendThruDate = extendThruDate;
		extendThruDate = newExtendThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_NODE_MEMBER__EXTEND_THRU_DATE, oldExtendThruDate, extendThruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_NODE_MEMBER__FROM_DATE, oldFromDate, fromDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.TESTING_NODE_MEMBER__TESTING_ID, oldTestingId, testingId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_NODE_MEMBER__TESTING_ID, oldTestingId, testingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingNode getTestingNodeId() {
		if (testingNodeId != null && ((EObject)testingNodeId).eIsProxy()) {
			InternalEObject oldTestingNodeId = (InternalEObject)testingNodeId;
			testingNodeId = (TestingNode)eResolveProxy(oldTestingNodeId);
			if (testingNodeId != oldTestingNodeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.TESTING_NODE_MEMBER__TESTING_NODE_ID, oldTestingNodeId, testingNodeId));
			}
		}
		return testingNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingNode basicGetTestingNodeId() {
		return testingNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingNodeId(TestingNode newTestingNodeId) {
		TestingNode oldTestingNodeId = testingNodeId;
		testingNodeId = newTestingNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_NODE_MEMBER__TESTING_NODE_ID, oldTestingNodeId, testingNodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_NODE_MEMBER__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TESTING_NODE_MEMBER__FROM_DATE:
				return getFromDate();
			case TestPackage.TESTING_NODE_MEMBER__EXTEND_FROM_DATE:
				return getExtendFromDate();
			case TestPackage.TESTING_NODE_MEMBER__EXTEND_THRU_DATE:
				return getExtendThruDate();
			case TestPackage.TESTING_NODE_MEMBER__THRU_DATE:
				return getThruDate();
			case TestPackage.TESTING_NODE_MEMBER__TESTING_ID:
				if (resolve) return getTestingId();
				return basicGetTestingId();
			case TestPackage.TESTING_NODE_MEMBER__TESTING_NODE_ID:
				if (resolve) return getTestingNodeId();
				return basicGetTestingNodeId();
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
			case TestPackage.TESTING_NODE_MEMBER__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TestPackage.TESTING_NODE_MEMBER__EXTEND_FROM_DATE:
				setExtendFromDate((Date)newValue);
				return;
			case TestPackage.TESTING_NODE_MEMBER__EXTEND_THRU_DATE:
				setExtendThruDate((Date)newValue);
				return;
			case TestPackage.TESTING_NODE_MEMBER__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case TestPackage.TESTING_NODE_MEMBER__TESTING_ID:
				setTestingId((Testing)newValue);
				return;
			case TestPackage.TESTING_NODE_MEMBER__TESTING_NODE_ID:
				setTestingNodeId((TestingNode)newValue);
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
			case TestPackage.TESTING_NODE_MEMBER__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TestPackage.TESTING_NODE_MEMBER__EXTEND_FROM_DATE:
				setExtendFromDate(EXTEND_FROM_DATE_EDEFAULT);
				return;
			case TestPackage.TESTING_NODE_MEMBER__EXTEND_THRU_DATE:
				setExtendThruDate(EXTEND_THRU_DATE_EDEFAULT);
				return;
			case TestPackage.TESTING_NODE_MEMBER__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case TestPackage.TESTING_NODE_MEMBER__TESTING_ID:
				setTestingId((Testing)null);
				return;
			case TestPackage.TESTING_NODE_MEMBER__TESTING_NODE_ID:
				setTestingNodeId((TestingNode)null);
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
			case TestPackage.TESTING_NODE_MEMBER__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TestPackage.TESTING_NODE_MEMBER__EXTEND_FROM_DATE:
				return EXTEND_FROM_DATE_EDEFAULT == null ? extendFromDate != null : !EXTEND_FROM_DATE_EDEFAULT.equals(extendFromDate);
			case TestPackage.TESTING_NODE_MEMBER__EXTEND_THRU_DATE:
				return EXTEND_THRU_DATE_EDEFAULT == null ? extendThruDate != null : !EXTEND_THRU_DATE_EDEFAULT.equals(extendThruDate);
			case TestPackage.TESTING_NODE_MEMBER__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case TestPackage.TESTING_NODE_MEMBER__TESTING_ID:
				return testingId != null;
			case TestPackage.TESTING_NODE_MEMBER__TESTING_NODE_ID:
				return testingNodeId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", extendFromDate: ");
		result.append(extendFromDate);
		result.append(", extendThruDate: ");
		result.append(extendThruDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //TestingNodeMemberImpl
