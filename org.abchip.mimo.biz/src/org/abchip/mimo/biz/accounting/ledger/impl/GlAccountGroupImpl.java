/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.GlAccountGroup;
import org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupImpl#getGlAccountGroupId <em>Gl Account Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupImpl#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlAccountGroupImpl extends BizEntityTypedImpl<GlAccountGroupType> implements GlAccountGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlAccountGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_ACCOUNT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT_GROUP__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT_GROUP__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountGroupType getGlAccountGroupTypeId() {
		return (GlAccountGroupType)eGet(LedgerPackage.Literals.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountGroupTypeId(GlAccountGroupType newGlAccountGroupTypeId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID, newGlAccountGroupTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> glAccountGroupMembers() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LedgerPackage.GL_ACCOUNT_GROUP___GL_ACCOUNT_GROUP_MEMBERS:
				return glAccountGroupMembers();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountGroupId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountGroupId(String newGlAccountGroupId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID, newGlAccountGroupId);
	}

} //GlAccountGroupImpl
