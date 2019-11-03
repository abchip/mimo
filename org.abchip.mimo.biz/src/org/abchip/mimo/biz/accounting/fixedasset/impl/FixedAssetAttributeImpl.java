/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetAttributeImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetAttributeImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetAttributeImpl#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetAttributeImpl#getAttrValue <em>Attr Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetAttributeImpl extends BizEntityImpl implements FixedAssetAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetId = FIXED_ASSET_ID_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET_ATTRIBUTE;
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
		String oldAttrDescription = attrDescription;
		attrDescription = newAttrDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_DESCRIPTION, oldAttrDescription, attrDescription));
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
		String oldAttrValue = attrValue;
		attrValue = newAttrValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_VALUE, oldAttrValue, attrValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		String oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_ATTRIBUTE__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
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
		String oldAttrName = attrName;
		attrName = newAttrName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_NAME, oldAttrName, attrName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__FIXED_ASSET_ID:
				return getFixedAssetId();
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_NAME:
				return getAttrName();
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_DESCRIPTION:
				return getAttrDescription();
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_VALUE:
				return getAttrValue();
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
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_VALUE:
				setAttrValue((String)newValue);
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
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription(ATTR_DESCRIPTION_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_VALUE:
				setAttrValue(ATTR_VALUE_EDEFAULT);
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
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_DESCRIPTION:
				return ATTR_DESCRIPTION_EDEFAULT == null ? attrDescription != null : !ATTR_DESCRIPTION_EDEFAULT.equals(attrDescription);
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE__ATTR_VALUE:
				return ATTR_VALUE_EDEFAULT == null ? attrValue != null : !ATTR_VALUE_EDEFAULT.equals(attrValue);
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
		result.append(" (fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", attrName: ");
		result.append(attrName);
		result.append(", attrDescription: ");
		result.append(attrDescription);
		result.append(", attrValue: ");
		result.append(attrValue);
		result.append(')');
		return result.toString();
	}

} //FixedAssetAttributeImpl
