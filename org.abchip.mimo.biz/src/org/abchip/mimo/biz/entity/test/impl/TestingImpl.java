/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.Testing;
import org.abchip.mimo.biz.entity.test.TestingItem;
import org.abchip.mimo.biz.entity.test.TestingType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingItems <em>Testing Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingName <em>Testing Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingSize <em>Testing Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl#getTestingTypeId <em>Testing Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingImpl extends BizEntityImpl implements Testing {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		return (String)eGet(TestPackage.Literals.TESTING__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(TestPackage.Literals.TESTING__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(TestPackage.Literals.TESTING__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(TestPackage.Literals.TESTING__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTestingDate() {
		return (Date)eGet(TestPackage.Literals.TESTING__TESTING_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingDate(Date newTestingDate) {
		eSet(TestPackage.Literals.TESTING__TESTING_DATE, newTestingDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TestingItem> getTestingItems() {
		return (List<TestingItem>)eGet(TestPackage.Literals.TESTING__TESTING_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingId() {
		return (String)eGet(TestPackage.Literals.TESTING__TESTING_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingId(String newTestingId) {
		eSet(TestPackage.Literals.TESTING__TESTING_ID, newTestingId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingName() {
		return (String)eGet(TestPackage.Literals.TESTING__TESTING_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingName(String newTestingName) {
		eSet(TestPackage.Literals.TESTING__TESTING_NAME, newTestingName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTestingSize() {
		return (Long)eGet(TestPackage.Literals.TESTING__TESTING_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingSize(long newTestingSize) {
		eSet(TestPackage.Literals.TESTING__TESTING_SIZE, newTestingSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingType getTestingTypeId() {
		return (TestingType)eGet(TestPackage.Literals.TESTING__TESTING_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingTypeId(TestingType newTestingTypeId) {
		eSet(TestPackage.Literals.TESTING__TESTING_TYPE_ID, newTestingTypeId);
	}

} //TestingImpl
