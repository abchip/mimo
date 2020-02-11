/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Node Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getTestingId <em>Testing Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getTestingNodeId <em>Testing Node Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getExtendFromDate <em>Extend From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getExtendThruDate <em>Extend Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl#getThruDate <em>Thru Date</em>}</li>
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
		return (Date)eGet(TestPackage.Literals.TESTING_NODE_MEMBER__EXTEND_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendFromDate(Date newExtendFromDate) {
		eSet(TestPackage.Literals.TESTING_NODE_MEMBER__EXTEND_FROM_DATE, newExtendFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExtendThruDate() {
		return (Date)eGet(TestPackage.Literals.TESTING_NODE_MEMBER__EXTEND_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendThruDate(Date newExtendThruDate) {
		eSet(TestPackage.Literals.TESTING_NODE_MEMBER__EXTEND_THRU_DATE, newExtendThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(TestPackage.Literals.TESTING_NODE_MEMBER__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(TestPackage.Literals.TESTING_NODE_MEMBER__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Testing getTestingId() {
		return (Testing)eGet(TestPackage.Literals.TESTING_NODE_MEMBER__TESTING_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingId(Testing newTestingId) {
		eSet(TestPackage.Literals.TESTING_NODE_MEMBER__TESTING_ID, newTestingId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestingNode getTestingNodeId() {
		return (TestingNode)eGet(TestPackage.Literals.TESTING_NODE_MEMBER__TESTING_NODE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingNodeId(TestingNode newTestingNodeId) {
		eSet(TestPackage.Literals.TESTING_NODE_MEMBER__TESTING_NODE_ID, newTestingNodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(TestPackage.Literals.TESTING_NODE_MEMBER__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(TestPackage.Literals.TESTING_NODE_MEMBER__THRU_DATE, newThruDate);
	}

} //TestingNodeMemberImpl
