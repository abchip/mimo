/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdentType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Ident</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentImpl#getIdValue <em>Id Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentImpl#getFixedAssetIdentTypeId <em>Fixed Asset Ident Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetIdentImpl extends BizEntityTypedImpl<FixedAssetIdentType> implements FixedAssetIdent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getIdValue() <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIdValue() <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdValue()
	 * @generated
	 * @ordered
	 */
	protected String idValue = ID_VALUE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;
	/**
	 * The cached value of the '{@link #getFixedAssetIdentTypeId() <em>Fixed Asset Ident Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetIdentTypeId()
	 * @generated
	 * @ordered
	 */
	protected FixedAssetIdentType fixedAssetIdentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetIdentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET_IDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdValue() {
		return idValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdValue(String newIdValue) {
		String oldIdValue = idValue;
		idValue = newIdValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_IDENT__ID_VALUE, oldIdValue, idValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		FixedAsset oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetIdentType getFixedAssetIdentTypeId() {
		if (fixedAssetIdentTypeId != null && ((EObject)fixedAssetIdentTypeId).eIsProxy()) {
			InternalEObject oldFixedAssetIdentTypeId = (InternalEObject)fixedAssetIdentTypeId;
			fixedAssetIdentTypeId = (FixedAssetIdentType)eResolveProxy(oldFixedAssetIdentTypeId);
			if (fixedAssetIdentTypeId != oldFixedAssetIdentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE_ID, oldFixedAssetIdentTypeId, fixedAssetIdentTypeId));
			}
		}
		return fixedAssetIdentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAssetIdentType basicGetFixedAssetIdentTypeId() {
		return fixedAssetIdentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetIdentTypeId(FixedAssetIdentType newFixedAssetIdentTypeId) {
		FixedAssetIdentType oldFixedAssetIdentTypeId = fixedAssetIdentTypeId;
		fixedAssetIdentTypeId = newFixedAssetIdentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE_ID, oldFixedAssetIdentTypeId, fixedAssetIdentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.FIXED_ASSET_IDENT__ID_VALUE:
				return getIdValue();
			case FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE_ID:
				if (resolve) return getFixedAssetIdentTypeId();
				return basicGetFixedAssetIdentTypeId();
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
			case FixedassetPackage.FIXED_ASSET_IDENT__ID_VALUE:
				setIdValue((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE_ID:
				setFixedAssetIdentTypeId((FixedAssetIdentType)newValue);
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
			case FixedassetPackage.FIXED_ASSET_IDENT__ID_VALUE:
				setIdValue(ID_VALUE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE_ID:
				setFixedAssetIdentTypeId((FixedAssetIdentType)null);
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
			case FixedassetPackage.FIXED_ASSET_IDENT__ID_VALUE:
				return ID_VALUE_EDEFAULT == null ? idValue != null : !ID_VALUE_EDEFAULT.equals(idValue);
			case FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case FixedassetPackage.FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE_ID:
				return fixedAssetIdentTypeId != null;
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
		result.append(" (idValue: ");
		result.append(idValue);
		result.append(')');
		return result.toString();
	}

} //FixedAssetIdentImpl
