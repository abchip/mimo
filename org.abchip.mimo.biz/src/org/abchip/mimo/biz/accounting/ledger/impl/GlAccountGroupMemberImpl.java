/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account Group Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl#getGlAccountGroupId <em>Gl Account Group Id</em>}</li>
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
	 * The default value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountId = GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGlAccountGroupTypeId() <em>Gl Account Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_GROUP_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlAccountGroupTypeId() <em>Gl Account Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountGroupTypeId = GL_ACCOUNT_GROUP_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGlAccountGroupId() <em>Gl Account Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_GROUP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlAccountGroupId() <em>Gl Account Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountGroupId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountGroupId = GL_ACCOUNT_GROUP_ID_EDEFAULT;

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
	public String getGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(String newGlAccountId) {
		String oldGlAccountId = glAccountId;
		glAccountId = newGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountGroupId() {
		return glAccountGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountGroupId(String newGlAccountGroupId) {
		String oldGlAccountGroupId = glAccountGroupId;
		glAccountGroupId = newGlAccountGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID, oldGlAccountGroupId, glAccountGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountGroupTypeId() {
		return glAccountGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountGroupTypeId(String newGlAccountGroupTypeId) {
		String oldGlAccountGroupTypeId = glAccountGroupTypeId;
		glAccountGroupTypeId = newGlAccountGroupTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID, oldGlAccountGroupTypeId, glAccountGroupTypeId));
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
				return getGlAccountId();
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID:
				return getGlAccountGroupTypeId();
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID:
				return getGlAccountGroupId();
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
				setGlAccountId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID:
				setGlAccountGroupTypeId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID:
				setGlAccountGroupId((String)newValue);
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
				setGlAccountId(GL_ACCOUNT_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID:
				setGlAccountGroupTypeId(GL_ACCOUNT_GROUP_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID:
				setGlAccountGroupId(GL_ACCOUNT_GROUP_ID_EDEFAULT);
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
				return GL_ACCOUNT_ID_EDEFAULT == null ? glAccountId != null : !GL_ACCOUNT_ID_EDEFAULT.equals(glAccountId);
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID:
				return GL_ACCOUNT_GROUP_TYPE_ID_EDEFAULT == null ? glAccountGroupTypeId != null : !GL_ACCOUNT_GROUP_TYPE_ID_EDEFAULT.equals(glAccountGroupTypeId);
			case LedgerPackage.GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID:
				return GL_ACCOUNT_GROUP_ID_EDEFAULT == null ? glAccountGroupId != null : !GL_ACCOUNT_GROUP_ID_EDEFAULT.equals(glAccountGroupId);
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
		result.append(" (glAccountId: ");
		result.append(glAccountId);
		result.append(", glAccountGroupTypeId: ");
		result.append(glAccountGroupTypeId);
		result.append(", glAccountGroupId: ");
		result.append(glAccountGroupId);
		result.append(')');
		return result.toString();
	}

} //GlAccountGroupMemberImpl
