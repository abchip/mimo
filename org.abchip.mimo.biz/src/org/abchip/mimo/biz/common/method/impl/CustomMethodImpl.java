/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.method.impl;

import java.util.List;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.method.CustomMethodType;
import org.abchip.mimo.biz.common.method.MethodPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.common.method.impl.CustomMethodImpl#getCustomMethodTypeId <em>Custom Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.method.impl.CustomMethodImpl#getDescription <em>Description</em>}</li>
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
		return (String)eGet(MethodPackage.Literals.CUSTOM_METHOD__CUSTOM_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(String newCustomMethodId) {
		eSet(MethodPackage.Literals.CUSTOM_METHOD__CUSTOM_METHOD_ID, newCustomMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomMethodName() {
		return (String)eGet(MethodPackage.Literals.CUSTOM_METHOD__CUSTOM_METHOD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodName(String newCustomMethodName) {
		eSet(MethodPackage.Literals.CUSTOM_METHOD__CUSTOM_METHOD_NAME, newCustomMethodName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(MethodPackage.Literals.CUSTOM_METHOD__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(MethodPackage.Literals.CUSTOM_METHOD__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FixedAssetDepMethod> getFixedAssetDepMethods() {
		return (List<FixedAssetDepMethod>)eGet(MethodPackage.Literals.CUSTOM_METHOD__FIXED_ASSET_DEP_METHODS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethodType getCustomMethodTypeId() {
		return (CustomMethodType)eGet(MethodPackage.Literals.CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodTypeId(CustomMethodType newCustomMethodTypeId) {
		eSet(MethodPackage.Literals.CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID, newCustomMethodTypeId);
	}

} //CustomMethodImpl
