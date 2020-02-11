/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingItemImpl#getTestingId <em>Testing Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingItemImpl#getTestingSeqId <em>Testing Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingItemImpl#getTestingHistory <em>Testing History</em>}</li>
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
		return (String)eGet(TestPackage.Literals.TESTING_ITEM__TESTING_HISTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingHistory(String newTestingHistory) {
		eSet(TestPackage.Literals.TESTING_ITEM__TESTING_HISTORY, newTestingHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Testing getTestingId() {
		return (Testing)eGet(TestPackage.Literals.TESTING_ITEM__TESTING_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingId(Testing newTestingId) {
		eSet(TestPackage.Literals.TESTING_ITEM__TESTING_ID, newTestingId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingSeqId() {
		return (String)eGet(TestPackage.Literals.TESTING_ITEM__TESTING_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingSeqId(String newTestingSeqId) {
		eSet(TestPackage.Literals.TESTING_ITEM__TESTING_SEQ_ID, newTestingSeqId);
	}

} //TestingItemImpl
