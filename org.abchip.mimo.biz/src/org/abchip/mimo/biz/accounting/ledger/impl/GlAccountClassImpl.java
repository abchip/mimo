/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.GlAccountClass;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountClassImpl#getGlAccountClassId <em>Gl Account Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountClassImpl#isIsAssetClass <em>Is Asset Class</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountClassImpl#getParentClassId <em>Parent Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountClassImpl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlAccountClassImpl extends BizEntityImpl implements GlAccountClass {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getGlAccountClassId() <em>Gl Account Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountClassId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_CLASS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlAccountClassId() <em>Gl Account Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountClassId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountClassId = GL_ACCOUNT_CLASS_ID_EDEFAULT;
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
	 * The default value of the '{@link #isIsAssetClass() <em>Is Asset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssetClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSET_CLASS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsAssetClass() <em>Is Asset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssetClass()
	 * @generated
	 * @ordered
	 */
	protected boolean isAssetClass = IS_ASSET_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getParentClassId() <em>Parent Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClassId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_CLASS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentClassId() <em>Parent Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClassId()
	 * @generated
	 * @ordered
	 */
	protected String parentClassId = PARENT_CLASS_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlAccountClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_ACCOUNT_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_CLASS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAssetClass() {
		return isAssetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAssetClass(boolean newIsAssetClass) {
		boolean oldIsAssetClass = isAssetClass;
		isAssetClass = newIsAssetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_CLASS__IS_ASSET_CLASS, oldIsAssetClass, isAssetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentClassId() {
		return parentClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentClassId(String newParentClassId) {
		String oldParentClassId = parentClassId;
		parentClassId = newParentClassId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_CLASS__PARENT_CLASS_ID, oldParentClassId, parentClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_CLASS__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childGlAccountClasses() {
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
	public List<String> glAccounts() {
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
	public String getGlAccountClassId() {
		return glAccountClassId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountClassId(String newGlAccountClassId) {
		String oldGlAccountClassId = glAccountClassId;
		glAccountClassId = newGlAccountClassId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_ACCOUNT_CLASS__GL_ACCOUNT_CLASS_ID, oldGlAccountClassId, glAccountClassId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_ACCOUNT_CLASS__GL_ACCOUNT_CLASS_ID:
				return getGlAccountClassId();
			case LedgerPackage.GL_ACCOUNT_CLASS__DESCRIPTION:
				return getDescription();
			case LedgerPackage.GL_ACCOUNT_CLASS__IS_ASSET_CLASS:
				return isIsAssetClass();
			case LedgerPackage.GL_ACCOUNT_CLASS__PARENT_CLASS_ID:
				return getParentClassId();
			case LedgerPackage.GL_ACCOUNT_CLASS__SEQUENCE_NUM:
				return getSequenceNum();
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
			case LedgerPackage.GL_ACCOUNT_CLASS__GL_ACCOUNT_CLASS_ID:
				setGlAccountClassId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CLASS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CLASS__IS_ASSET_CLASS:
				setIsAssetClass((Boolean)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CLASS__PARENT_CLASS_ID:
				setParentClassId((String)newValue);
				return;
			case LedgerPackage.GL_ACCOUNT_CLASS__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
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
			case LedgerPackage.GL_ACCOUNT_CLASS__GL_ACCOUNT_CLASS_ID:
				setGlAccountClassId(GL_ACCOUNT_CLASS_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_CLASS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_CLASS__IS_ASSET_CLASS:
				setIsAssetClass(IS_ASSET_CLASS_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_CLASS__PARENT_CLASS_ID:
				setParentClassId(PARENT_CLASS_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_ACCOUNT_CLASS__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
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
			case LedgerPackage.GL_ACCOUNT_CLASS__GL_ACCOUNT_CLASS_ID:
				return GL_ACCOUNT_CLASS_ID_EDEFAULT == null ? glAccountClassId != null : !GL_ACCOUNT_CLASS_ID_EDEFAULT.equals(glAccountClassId);
			case LedgerPackage.GL_ACCOUNT_CLASS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LedgerPackage.GL_ACCOUNT_CLASS__IS_ASSET_CLASS:
				return isAssetClass != IS_ASSET_CLASS_EDEFAULT;
			case LedgerPackage.GL_ACCOUNT_CLASS__PARENT_CLASS_ID:
				return PARENT_CLASS_ID_EDEFAULT == null ? parentClassId != null : !PARENT_CLASS_ID_EDEFAULT.equals(parentClassId);
			case LedgerPackage.GL_ACCOUNT_CLASS__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
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
		result.append(" (glAccountClassId: ");
		result.append(glAccountClassId);
		result.append(", description: ");
		result.append(description);
		result.append(", isAssetClass: ");
		result.append(isAssetClass);
		result.append(", parentClassId: ");
		result.append(parentClassId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //GlAccountClassImpl
