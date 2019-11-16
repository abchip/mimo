/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import org.abchip.mimo.biz.accounting.ledger.GlAccountCategory;
import org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryType;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryImpl#getGlAccountCategoryId <em>Gl Account Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryImpl#getGlAccountCategoryTypeId <em>Gl Account Category Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlAccountCategoryImpl extends BizEntityTypedImpl<GlAccountCategoryType> implements GlAccountCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getGlAccountCategoryId() <em>Gl Account Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_CATEGORY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlAccountCategoryId() <em>Gl Account Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountCategoryId = GL_ACCOUNT_CATEGORY_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getGlAccountCategoryTypeId() <em>Gl Account Category Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountCategoryTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountCategoryType glAccountCategoryTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlAccountCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_ACCOUNT_CATEGORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_CATEGORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountCategoryType getGlAccountCategoryTypeId() {
		if (glAccountCategoryTypeId != null && ((EObject)glAccountCategoryTypeId).eIsProxy()) {
			InternalEObject oldGlAccountCategoryTypeId = (InternalEObject)glAccountCategoryTypeId;
			glAccountCategoryTypeId = (GlAccountCategoryType)eResolveProxy(oldGlAccountCategoryTypeId);
			if (glAccountCategoryTypeId != oldGlAccountCategoryTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE_ID, oldGlAccountCategoryTypeId, glAccountCategoryTypeId));
			}
		}
		return glAccountCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountCategoryType basicGetGlAccountCategoryTypeId() {
		return glAccountCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountCategoryTypeId(GlAccountCategoryType newGlAccountCategoryTypeId) {
		GlAccountCategoryType oldGlAccountCategoryTypeId = glAccountCategoryTypeId;
		glAccountCategoryTypeId = newGlAccountCategoryTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE_ID, oldGlAccountCategoryTypeId, glAccountCategoryTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountCategoryId() {
		return glAccountCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountCategoryId(String newGlAccountCategoryId) {
		String oldGlAccountCategoryId = glAccountCategoryId;
		glAccountCategoryId = newGlAccountCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_ID, oldGlAccountCategoryId, glAccountCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_ID:
				return getGlAccountCategoryId();
			case LedgerPackage.GL_ACCOUNT_CATEGORY__DESCRIPTION:
				return getDescription();
			case LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE_ID:
				if (resolve) return getGlAccountCategoryTypeId();
				return basicGetGlAccountCategoryTypeId();
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
			case LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_ID:
				setGlAccountCategoryId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE_ID:
				setGlAccountCategoryTypeId((GlAccountCategoryType)newValue);
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
			case LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_ID:
				setGlAccountCategoryId(GL_ACCOUNT_CATEGORY_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE_ID:
				setGlAccountCategoryTypeId((GlAccountCategoryType)null);
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
			case LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_ID:
				return GL_ACCOUNT_CATEGORY_ID_EDEFAULT == null ? glAccountCategoryId != null : !GL_ACCOUNT_CATEGORY_ID_EDEFAULT.equals(glAccountCategoryId);
			case LedgerPackage.GL_ACCOUNT_CATEGORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LedgerPackage.GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE_ID:
				return glAccountCategoryTypeId != null;
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
		result.append(" (glAccountCategoryId: ");
		result.append(glAccountCategoryId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //GlAccountCategoryImpl
