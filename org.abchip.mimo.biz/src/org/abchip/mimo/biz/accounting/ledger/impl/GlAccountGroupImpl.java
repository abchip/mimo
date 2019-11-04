/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.GlAccountGroup;
import org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_GROUP__DESCRIPTION, oldDescription, description));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID, oldGlAccountGroupTypeId, glAccountGroupTypeId));
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
		GlAccountGroupType oldGlAccountGroupTypeId = glAccountGroupTypeId;
		glAccountGroupTypeId = newGlAccountGroupTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID, oldGlAccountGroupTypeId, glAccountGroupTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID, oldGlAccountGroupId, glAccountGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID:
				return getGlAccountGroupId();
			case LedgerPackage.GL_ACCOUNT_GROUP__DESCRIPTION:
				return getDescription();
			case LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID:
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
			case LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID:
				setGlAccountGroupId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID:
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
			case LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID:
				setGlAccountGroupId(GL_ACCOUNT_GROUP_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID:
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
			case LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID:
				return GL_ACCOUNT_GROUP_ID_EDEFAULT == null ? glAccountGroupId != null : !GL_ACCOUNT_GROUP_ID_EDEFAULT.equals(glAccountGroupId);
			case LedgerPackage.GL_ACCOUNT_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LedgerPackage.GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID:
				return glAccountGroupTypeId != null;
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
		result.append(" (glAccountGroupId: ");
		result.append(glAccountGroupId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //GlAccountGroupImpl
