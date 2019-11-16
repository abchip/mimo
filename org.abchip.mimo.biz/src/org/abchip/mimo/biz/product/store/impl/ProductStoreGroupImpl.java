/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.store.ProductStoreGroup;
import org.abchip.mimo.biz.product.store.ProductStoreGroupType;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getProductStoreGroupName <em>Product Store Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getProductStoreGroupTypeId <em>Product Store Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreGroupImpl extends BizEntityTypedImpl<ProductStoreGroupType> implements ProductStoreGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_GROUP__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(StorePackage.Literals.PRODUCT_STORE_GROUP__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreGroupName() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreGroupName(String newProductStoreGroupName) {
		eSet(StorePackage.Literals.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME, newProductStoreGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroupType getProductStoreGroupTypeId() {
		return (ProductStoreGroupType)eGet(StorePackage.Literals.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreGroupTypeId(ProductStoreGroupType newProductStoreGroupTypeId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID, newProductStoreGroupTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> primaryProductStores() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StorePackage.PRODUCT_STORE_GROUP___PRIMARY_PRODUCT_STORES:
				return primaryProductStores();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroup getPrimaryParentGroupId() {
		return (ProductStoreGroup)eGet(StorePackage.Literals.PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryParentGroupId(ProductStoreGroup newPrimaryParentGroupId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID, newPrimaryParentGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreGroupId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreGroupId(String newProductStoreGroupId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID, newProductStoreGroupId);
	}

} //ProductStoreGroupImpl
