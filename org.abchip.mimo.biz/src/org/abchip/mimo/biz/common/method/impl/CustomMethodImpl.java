/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.method.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.method.CustomMethodType;
import org.abchip.mimo.biz.common.method.MethodPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.method.impl.CustomMethodImpl#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.method.impl.CustomMethodImpl#getCustomMethodName <em>Custom Method Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.method.impl.CustomMethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.method.impl.CustomMethodImpl#getCustomMethodTypeId <em>Custom Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.method.impl.CustomMethodImpl#getFixedAssetDepMethods <em>Fixed Asset Dep Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomMethodImpl extends BizEntityTypedImpl<CustomMethodType> implements CustomMethod {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected String customMethodId = CUSTOM_METHOD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomMethodName() <em>Custom Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomMethodName() <em>Custom Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodName()
	 * @generated
	 * @ordered
	 */
	protected String customMethodName = CUSTOM_METHOD_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getCustomMethodTypeId() <em>Custom Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethodType customMethodTypeId;

	/**
	 * The cached value of the '{@link #getFixedAssetDepMethods() <em>Fixed Asset Dep Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetDepMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fixedAssetDepMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MethodPackage.Literals.CUSTOM_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomMethodId() {
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(String newCustomMethodId) {
		String oldCustomMethodId = customMethodId;
		customMethodId = newCustomMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomMethodName() {
		return customMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodName(String newCustomMethodName) {
		String oldCustomMethodName = customMethodName;
		customMethodName = newCustomMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_NAME, oldCustomMethodName, customMethodName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.CUSTOM_METHOD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFixedAssetDepMethods() {
		if (fixedAssetDepMethods == null) {
			fixedAssetDepMethods = new EDataTypeUniqueEList<String>(String.class, this, MethodPackage.CUSTOM_METHOD__FIXED_ASSET_DEP_METHODS);
		}
		return fixedAssetDepMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> contents() {
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
	public List<String> costComponentCalcs() {
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
	public List<String> invoicePartyAcctgPreferences() {
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
	public List<String> orderPartyAcctgPreferences() {
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
	public List<String> productStoreShipmentMeths() {
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
	public List<String> quotePartyAcctgPreferences() {
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
	public List<String> uomCustomMethodUomConversions() {
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
	public List<String> workEfforts() {
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
	public CustomMethodType getCustomMethodTypeId() {
		if (customMethodTypeId != null && ((EObject)customMethodTypeId).eIsProxy()) {
			InternalEObject oldCustomMethodTypeId = (InternalEObject)customMethodTypeId;
			customMethodTypeId = (CustomMethodType)eResolveProxy(oldCustomMethodTypeId);
			if (customMethodTypeId != oldCustomMethodTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID, oldCustomMethodTypeId, customMethodTypeId));
			}
		}
		return customMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethodType basicGetCustomMethodTypeId() {
		return customMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodTypeId(CustomMethodType newCustomMethodTypeId) {
		CustomMethodType oldCustomMethodTypeId = customMethodTypeId;
		customMethodTypeId = newCustomMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID, oldCustomMethodTypeId, customMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_ID:
				return getCustomMethodId();
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_NAME:
				return getCustomMethodName();
			case MethodPackage.CUSTOM_METHOD__DESCRIPTION:
				return getDescription();
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID:
				if (resolve) return getCustomMethodTypeId();
				return basicGetCustomMethodTypeId();
			case MethodPackage.CUSTOM_METHOD__FIXED_ASSET_DEP_METHODS:
				return getFixedAssetDepMethods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_ID:
				setCustomMethodId((String)newValue);
				return;
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_NAME:
				setCustomMethodName((String)newValue);
				return;
			case MethodPackage.CUSTOM_METHOD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID:
				setCustomMethodTypeId((CustomMethodType)newValue);
				return;
			case MethodPackage.CUSTOM_METHOD__FIXED_ASSET_DEP_METHODS:
				getFixedAssetDepMethods().clear();
				getFixedAssetDepMethods().addAll((Collection<? extends String>)newValue);
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
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_ID:
				setCustomMethodId(CUSTOM_METHOD_ID_EDEFAULT);
				return;
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_NAME:
				setCustomMethodName(CUSTOM_METHOD_NAME_EDEFAULT);
				return;
			case MethodPackage.CUSTOM_METHOD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID:
				setCustomMethodTypeId((CustomMethodType)null);
				return;
			case MethodPackage.CUSTOM_METHOD__FIXED_ASSET_DEP_METHODS:
				getFixedAssetDepMethods().clear();
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
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_ID:
				return CUSTOM_METHOD_ID_EDEFAULT == null ? customMethodId != null : !CUSTOM_METHOD_ID_EDEFAULT.equals(customMethodId);
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_NAME:
				return CUSTOM_METHOD_NAME_EDEFAULT == null ? customMethodName != null : !CUSTOM_METHOD_NAME_EDEFAULT.equals(customMethodName);
			case MethodPackage.CUSTOM_METHOD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MethodPackage.CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID:
				return customMethodTypeId != null;
			case MethodPackage.CUSTOM_METHOD__FIXED_ASSET_DEP_METHODS:
				return fixedAssetDepMethods != null && !fixedAssetDepMethods.isEmpty();
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
		result.append(" (customMethodId: ");
		result.append(customMethodId);
		result.append(", customMethodName: ");
		result.append(customMethodName);
		result.append(", description: ");
		result.append(description);
		result.append(", fixedAssetDepMethods: ");
		result.append(fixedAssetDepMethods);
		result.append(')');
		return result.toString();
	}

} //CustomMethodImpl
