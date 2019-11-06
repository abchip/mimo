/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account Trans Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransAttributeImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransAttributeImpl#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransAttributeImpl#getAttrValue <em>Attr Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransAttributeImpl#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountTransAttributeImpl extends BizEntityImpl implements FinAccountTransAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected String attrName = ATTR_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getAttrDescription() <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttrDescription() <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrDescription()
	 * @generated
	 * @ordered
	 */
	protected String attrDescription = ATTR_DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected String attrValue = ATTR_VALUE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFinAccountTransId() <em>Fin Account Trans Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransId()
	 * @generated
	 * @ordered
	 */
	protected FinAccountTrans finAccountTransId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountTransAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrDescription() {
		return attrDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrDescription(String newAttrDescription) {
		attrDescription = newAttrDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrValue() {
		return attrValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrValue(String newAttrValue) {
		attrValue = newAttrValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTrans getFinAccountTransId() {
		if (finAccountTransId != null && ((EObject)finAccountTransId).eIsProxy()) {
			InternalEObject oldFinAccountTransId = (InternalEObject)finAccountTransId;
			finAccountTransId = (FinAccountTrans)eResolveProxy(oldFinAccountTransId);
			if (finAccountTransId != oldFinAccountTransId) {
			}
		}
		return finAccountTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccountTrans basicGetFinAccountTransId() {
		return finAccountTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransId(FinAccountTrans newFinAccountTransId) {
		finAccountTransId = newFinAccountTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrName() {
		return attrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		attrName = newAttrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_NAME:
				return getAttrName();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_DESCRIPTION:
				return getAttrDescription();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_VALUE:
				return getAttrValue();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__FIN_ACCOUNT_TRANS_ID:
				if (resolve) return getFinAccountTransId();
				return basicGetFinAccountTransId();
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_VALUE:
				setAttrValue((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((FinAccountTrans)newValue);
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription(ATTR_DESCRIPTION_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_VALUE:
				setAttrValue(ATTR_VALUE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((FinAccountTrans)null);
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_DESCRIPTION:
				return ATTR_DESCRIPTION_EDEFAULT == null ? attrDescription != null : !ATTR_DESCRIPTION_EDEFAULT.equals(attrDescription);
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_VALUE:
				return ATTR_VALUE_EDEFAULT == null ? attrValue != null : !ATTR_VALUE_EDEFAULT.equals(attrValue);
			case FinaccountPackage.FIN_ACCOUNT_TRANS_ATTRIBUTE__FIN_ACCOUNT_TRANS_ID:
				return finAccountTransId != null;
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
		result.append(" (attrName: ");
		result.append(attrName);
		result.append(", attrDescription: ");
		result.append(attrDescription);
		result.append(", attrValue: ");
		result.append(attrValue);
		result.append(')');
		return result.toString();
	}

} //FinAccountTransAttributeImpl
