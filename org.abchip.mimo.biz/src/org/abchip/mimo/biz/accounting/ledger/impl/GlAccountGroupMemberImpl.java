/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccountGroup;
import org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember;
import org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account Group Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl#getGlAccountGroupId <em>Gl Account Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlAccountGroupMemberImpl extends BizEntityImpl implements GlAccountGroupMember {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount glAccountId;
	/**
	 * The cached value of the '{@link #getGlAccountGroupId() <em>Gl Account Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountGroupId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountGroup glAccountGroupId;
	/**
	 * The cached value of the '{@link #getGlAccountGroupTypeId() <em>Gl Account Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountGroupType glAccountGroupTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlAccountGroupMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_ACCOUNT_GROUP_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getGlAccountId() {
		if (glAccountId != null && ((EObject)glAccountId).eIsProxy()) {
			InternalEObject oldGlAccountId = (InternalEObject)glAccountId;
			glAccountId = (GlAccount)eResolveProxy(oldGlAccountId);
			if (glAccountId != oldGlAccountId) {
			}
		}
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(GlAccount newGlAccountId) {
		glAccountId = newGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountGroup getGlAccountGroupId() {
		if (glAccountGroupId != null && ((EObject)glAccountGroupId).eIsProxy()) {
			InternalEObject oldGlAccountGroupId = (InternalEObject)glAccountGroupId;
			glAccountGroupId = (GlAccountGroup)eResolveProxy(oldGlAccountGroupId);
			if (glAccountGroupId != oldGlAccountGroupId) {
			}
		}
		return glAccountGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountGroup basicGetGlAccountGroupId() {
		return glAccountGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountGroupId(GlAccountGroup newGlAccountGroupId) {
		glAccountGroupId = newGlAccountGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountGroupType getGlAccountGroupTypeId() {
		if (glAccountGroupTypeId != null && ((EObject)glAccountGroupTypeId).eIsProxy()) {
			InternalEObject oldGlAccountGroupTypeId = (InternalEObject)glAccountGroupTypeId;
			glAccountGroupTypeId = (GlAccountGroupType)eResolveProxy(oldGlAccountGroupTypeId);
			if (glAccountGroupTypeId != oldGlAccountGroupTypeId) {
			}
		}
		return glAccountGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountGroupType basicGetGlAccountGroupTypeId() {
		return glAccountGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountGroupTypeId(GlAccountGroupType newGlAccountGroupTypeId) {
		glAccountGroupTypeId = newGlAccountGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_ID:
				if (resolve) return getGlAccountId();
				return basicGetGlAccountId();
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID:
				if (resolve) return getGlAccountGroupId();
				return basicGetGlAccountGroupId();
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID:
				if (resolve) return getGlAccountGroupTypeId();
				return basicGetGlAccountGroupTypeId();
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
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID:
				setGlAccountGroupId((GlAccountGroup)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID:
				setGlAccountGroupTypeId((GlAccountGroupType)newValue);
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
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)null);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID:
				setGlAccountGroupId((GlAccountGroup)null);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID:
				setGlAccountGroupTypeId((GlAccountGroupType)null);
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
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_ID:
				return glAccountId != null;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID:
				return glAccountGroupId != null;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID:
				return glAccountGroupTypeId != null;
		}
		return super.eIsSet(featureID);
	}

} //GlAccountGroupMemberImpl
