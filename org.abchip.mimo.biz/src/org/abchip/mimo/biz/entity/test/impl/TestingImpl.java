/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.Testing;
import org.abchip.mimo.biz.entity.test.TestingType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingId <em>Testing Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingDate <em>Testing Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingName <em>Testing Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingSize <em>Testing Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingTypeId <em>Testing Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingItems <em>Testing Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingImpl extends BizEntityTypedImpl<TestingType> implements Testing {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTestingId() <em>Testing Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingId()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingId() <em>Testing Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingId()
	 * @generated
	 * @ordered
	 */
	protected String testingId = TESTING_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;
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
	 * The default value of the '{@link #getTestingDate() <em>Testing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TESTING_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTestingDate() <em>Testing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingDate()
	 * @generated
	 * @ordered
	 */
	protected Date testingDate = TESTING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestingName() <em>Testing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingName()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingName() <em>Testing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingName()
	 * @generated
	 * @ordered
	 */
	protected String testingName = TESTING_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestingSize() <em>Testing Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingSize()
	 * @generated
	 * @ordered
	 */
	protected static final long TESTING_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTestingSize() <em>Testing Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingSize()
	 * @generated
	 * @ordered
	 */
	protected long testingSize = TESTING_SIZE_EDEFAULT;

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
	 * The cached value of the '{@link #getTestingItems() <em>Testing Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> testingItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TESTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING__COMMENTS, oldComments, comments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTestingDate() {
		return testingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingDate(Date newTestingDate) {
		Date oldTestingDate = testingDate;
		testingDate = newTestingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING__TESTING_DATE, oldTestingDate, testingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingId() {
		return testingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingId(String newTestingId) {
		String oldTestingId = testingId;
		testingId = newTestingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING__TESTING_ID, oldTestingId, testingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingName() {
		return testingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingName(String newTestingName) {
		String oldTestingName = testingName;
		testingName = newTestingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING__TESTING_NAME, oldTestingName, testingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTestingSize() {
		return testingSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingSize(long newTestingSize) {
		long oldTestingSize = testingSize;
		testingSize = newTestingSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING__TESTING_SIZE, oldTestingSize, testingSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TESTING__TESTING_TYPE_ID, oldTestingTypeId, testingTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getTestingItems() {
		if (testingItems == null) {
			testingItems = new EDataTypeUniqueEList<String>(String.class, this, TestPackage.TESTING__TESTING_ITEMS);
		}
		return testingItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TESTING__TESTING_ID:
				return getTestingId();
			case TestPackage.TESTING__COMMENTS:
				return getComments();
			case TestPackage.TESTING__DESCRIPTION:
				return getDescription();
			case TestPackage.TESTING__TESTING_DATE:
				return getTestingDate();
			case TestPackage.TESTING__TESTING_NAME:
				return getTestingName();
			case TestPackage.TESTING__TESTING_SIZE:
				return getTestingSize();
			case TestPackage.TESTING__TESTING_TYPE_ID:
				return getTestingTypeId();
			case TestPackage.TESTING__TESTING_ITEMS:
				return getTestingItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestPackage.TESTING__TESTING_ID:
				setTestingId((String)newValue);
				return;
			case TestPackage.TESTING__COMMENTS:
				setComments((String)newValue);
				return;
			case TestPackage.TESTING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TestPackage.TESTING__TESTING_DATE:
				setTestingDate((Date)newValue);
				return;
			case TestPackage.TESTING__TESTING_NAME:
				setTestingName((String)newValue);
				return;
			case TestPackage.TESTING__TESTING_SIZE:
				setTestingSize((Long)newValue);
				return;
			case TestPackage.TESTING__TESTING_TYPE_ID:
				setTestingTypeId((String)newValue);
				return;
			case TestPackage.TESTING__TESTING_ITEMS:
				getTestingItems().clear();
				getTestingItems().addAll((Collection<? extends String>)newValue);
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
			case TestPackage.TESTING__TESTING_ID:
				setTestingId(TESTING_ID_EDEFAULT);
				return;
			case TestPackage.TESTING__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case TestPackage.TESTING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TestPackage.TESTING__TESTING_DATE:
				setTestingDate(TESTING_DATE_EDEFAULT);
				return;
			case TestPackage.TESTING__TESTING_NAME:
				setTestingName(TESTING_NAME_EDEFAULT);
				return;
			case TestPackage.TESTING__TESTING_SIZE:
				setTestingSize(TESTING_SIZE_EDEFAULT);
				return;
			case TestPackage.TESTING__TESTING_TYPE_ID:
				setTestingTypeId(TESTING_TYPE_ID_EDEFAULT);
				return;
			case TestPackage.TESTING__TESTING_ITEMS:
				getTestingItems().clear();
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
			case TestPackage.TESTING__TESTING_ID:
				return TESTING_ID_EDEFAULT == null ? testingId != null : !TESTING_ID_EDEFAULT.equals(testingId);
			case TestPackage.TESTING__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case TestPackage.TESTING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TestPackage.TESTING__TESTING_DATE:
				return TESTING_DATE_EDEFAULT == null ? testingDate != null : !TESTING_DATE_EDEFAULT.equals(testingDate);
			case TestPackage.TESTING__TESTING_NAME:
				return TESTING_NAME_EDEFAULT == null ? testingName != null : !TESTING_NAME_EDEFAULT.equals(testingName);
			case TestPackage.TESTING__TESTING_SIZE:
				return testingSize != TESTING_SIZE_EDEFAULT;
			case TestPackage.TESTING__TESTING_TYPE_ID:
				return TESTING_TYPE_ID_EDEFAULT == null ? testingTypeId != null : !TESTING_TYPE_ID_EDEFAULT.equals(testingTypeId);
			case TestPackage.TESTING__TESTING_ITEMS:
				return testingItems != null && !testingItems.isEmpty();
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
		result.append(" (testingId: ");
		result.append(testingId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", description: ");
		result.append(description);
		result.append(", testingDate: ");
		result.append(testingDate);
		result.append(", testingName: ");
		result.append(testingName);
		result.append(", testingSize: ");
		result.append(testingSize);
		result.append(", testingTypeId: ");
		result.append(testingTypeId);
		result.append(", testingItems: ");
		result.append(testingItems);
		result.append(')');
		return result.toString();
	}

} //TestingImpl
