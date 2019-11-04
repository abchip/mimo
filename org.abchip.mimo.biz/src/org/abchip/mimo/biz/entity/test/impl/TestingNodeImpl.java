/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import java.util.List;

import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.TestingNode;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeImpl#getTestingNodeId <em>Testing Node Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeImpl#getPrimaryParentNodeId <em>Primary Parent Node Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingNodeImpl extends BizEntityImpl implements TestingNode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTestingNodeId() <em>Testing Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingNodeId() <em>Testing Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingNodeId()
	 * @generated
	 * @ordered
	 */
	protected String testingNodeId = TESTING_NODE_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getPrimaryParentNodeId() <em>Primary Parent Node Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryParentNodeId()
	 * @generated
	 * @ordered
	 */
	protected TestingNode primaryParentNodeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TESTING_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_NODE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingNode getPrimaryParentNodeId() {
		if (primaryParentNodeId != null && ((EObject)primaryParentNodeId).eIsProxy()) {
			InternalEObject oldPrimaryParentNodeId = (InternalEObject)primaryParentNodeId;
			primaryParentNodeId = (TestingNode)eResolveProxy(oldPrimaryParentNodeId);
			if (primaryParentNodeId != oldPrimaryParentNodeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.TESTING_NODE__PRIMARY_PARENT_NODE_ID, oldPrimaryParentNodeId, primaryParentNodeId));
			}
		}
		return primaryParentNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingNode basicGetPrimaryParentNodeId() {
		return primaryParentNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryParentNodeId(TestingNode newPrimaryParentNodeId) {
		TestingNode oldPrimaryParentNodeId = primaryParentNodeId;
		primaryParentNodeId = newPrimaryParentNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_NODE__PRIMARY_PARENT_NODE_ID, oldPrimaryParentNodeId, primaryParentNodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> primaryChildTestingNodes() {
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
	public String getTestingNodeId() {
		return testingNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingNodeId(String newTestingNodeId) {
		String oldTestingNodeId = testingNodeId;
		testingNodeId = newTestingNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING_NODE__TESTING_NODE_ID, oldTestingNodeId, testingNodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TESTING_NODE__TESTING_NODE_ID:
				return getTestingNodeId();
			case TestPackage.TESTING_NODE__DESCRIPTION:
				return getDescription();
			case TestPackage.TESTING_NODE__PRIMARY_PARENT_NODE_ID:
				if (resolve) return getPrimaryParentNodeId();
				return basicGetPrimaryParentNodeId();
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
			case TestPackage.TESTING_NODE__TESTING_NODE_ID:
				setTestingNodeId((String)newValue);
				return;
			case TestPackage.TESTING_NODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TestPackage.TESTING_NODE__PRIMARY_PARENT_NODE_ID:
				setPrimaryParentNodeId((TestingNode)newValue);
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
			case TestPackage.TESTING_NODE__TESTING_NODE_ID:
				setTestingNodeId(TESTING_NODE_ID_EDEFAULT);
				return;
			case TestPackage.TESTING_NODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TestPackage.TESTING_NODE__PRIMARY_PARENT_NODE_ID:
				setPrimaryParentNodeId((TestingNode)null);
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
			case TestPackage.TESTING_NODE__TESTING_NODE_ID:
				return TESTING_NODE_ID_EDEFAULT == null ? testingNodeId != null : !TESTING_NODE_ID_EDEFAULT.equals(testingNodeId);
			case TestPackage.TESTING_NODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TestPackage.TESTING_NODE__PRIMARY_PARENT_NODE_ID:
				return primaryParentNodeId != null;
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
		result.append(" (testingNodeId: ");
		result.append(testingNodeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TestingNodeImpl
