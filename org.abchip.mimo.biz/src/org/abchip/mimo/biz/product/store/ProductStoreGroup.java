/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupName <em>Product Store Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupTypeId <em>Product Store Group Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreGroup()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ProductStoreGroup extends BizEntityTyped<ProductStoreGroupType> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Name</em>' attribute.
	 * @see #setProductStoreGroupName(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreGroup_ProductStoreGroupName()
	 * @model
	 * @generated
	 */
	String getProductStoreGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupName <em>Product Store Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Name</em>' attribute.
	 * @see #getProductStoreGroupName()
	 * @generated
	 */
	void setProductStoreGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Type Id</em>' attribute.
	 * @see #setProductStoreGroupTypeId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreGroup_ProductStoreGroupTypeId()
	 * @model annotation="mimo-ent-domain frame='ProductStoreGroupType'"
	 * @generated
	 */
	String getProductStoreGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupTypeId <em>Product Store Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Type Id</em>' attribute.
	 * @see #getProductStoreGroupTypeId()
	 * @generated
	 */
	void setProductStoreGroupTypeId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore' route='primaryStoreGroupId'"
	 * @generated
	 */
	List<String> primaryProductStores();

	/**
	 * Returns the value of the '<em><b>Primary Parent Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Parent Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Parent Group Id</em>' attribute.
	 * @see #setPrimaryParentGroupId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreGroup_PrimaryParentGroupId()
	 * @model annotation="mimo-ent-domain frame='ProductStoreGroup'"
	 * @generated
	 */
	String getPrimaryParentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Parent Group Id</em>' attribute.
	 * @see #getPrimaryParentGroupId()
	 * @generated
	 */
	void setPrimaryParentGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #setProductStoreGroupId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreGroup_ProductStoreGroupId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductStoreGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupId <em>Product Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #getProductStoreGroupId()
	 * @generated
	 */
	void setProductStoreGroupId(String value);

} // ProductStoreGroup
