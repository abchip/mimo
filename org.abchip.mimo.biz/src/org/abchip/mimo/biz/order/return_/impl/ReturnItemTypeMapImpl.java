/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.return_.ReturnHeaderType;
import org.abchip.mimo.biz.order.return_.ReturnItemType;
import org.abchip.mimo.biz.order.return_.ReturnItemTypeMap;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Item Type Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl#getReturnHeaderTypeId <em>Return Header Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl#getReturnItemMapKey <em>Return Item Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl#getReturnItemTypeId <em>Return Item Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnItemTypeMapImpl extends BizEntityImpl implements ReturnItemTypeMap {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnItemTypeMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_ITEM_TYPE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeaderType getReturnHeaderTypeId() {
		return (ReturnHeaderType)eGet(ReturnPackage.Literals.RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnHeaderTypeId(ReturnHeaderType newReturnHeaderTypeId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID, newReturnHeaderTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemMapKey() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemMapKey(String newReturnItemMapKey) {
		eSet(ReturnPackage.Literals.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY, newReturnItemMapKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnItemType getReturnItemTypeId() {
		return (ReturnItemType)eGet(ReturnPackage.Literals.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemTypeId(ReturnItemType newReturnItemTypeId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID, newReturnItemTypeId);
	}

} //ReturnItemTypeMapImpl
