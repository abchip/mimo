/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import org.abchip.mimo.biz.BizEntity;

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
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductStoreGroup extends BizEntity {
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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * @model annotation="mimo-ent-format type='name' length='100'"
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
	 * Returns the value of the '<em><b>Product Store Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Type Id</em>' reference.
	 * @see #setProductStoreGroupTypeId(ProductStoreGroupType)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreGroup_ProductStoreGroupTypeId()
	 * @model keys="productStoreGroupTypeId"
	 * @generated
	 */
	ProductStoreGroupType getProductStoreGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupTypeId <em>Product Store Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Type Id</em>' reference.
	 * @see #getProductStoreGroupTypeId()
	 * @generated
	 */
	void setProductStoreGroupTypeId(ProductStoreGroupType value);

	/**
	 * Returns the value of the '<em><b>Primary Parent Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Parent Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Parent Group Id</em>' reference.
	 * @see #setPrimaryParentGroupId(ProductStoreGroup)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreGroup_PrimaryParentGroupId()
	 * @model keys="productStoreGroupId"
	 * @generated
	 */
	ProductStoreGroup getPrimaryParentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Parent Group Id</em>' reference.
	 * @see #getPrimaryParentGroupId()
	 * @generated
	 */
	void setPrimaryParentGroupId(ProductStoreGroup value);

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
