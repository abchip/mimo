/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataCategory#getDataCategoryId <em>Data Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataCategory#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataCategory#getParentCategoryId <em>Parent Category Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataCategory()
 * @model annotation="mimo-ent-frame dictionary='ContentEntityLabels'"
 * @generated
 */
public interface DataCategory extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataCategory_CategoryName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataCategory#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>Data Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Category Id</em>' attribute.
	 * @see #setDataCategoryId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataCategory_DataCategoryId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDataCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataCategory#getDataCategoryId <em>Data Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Category Id</em>' attribute.
	 * @see #getDataCategoryId()
	 * @generated
	 */
	void setDataCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category Id</em>' reference.
	 * @see #setParentCategoryId(DataCategory)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataCategory_ParentCategoryId()
	 * @model keys="dataCategoryId"
	 * @generated
	 */
	DataCategory getParentCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataCategory#getParentCategoryId <em>Parent Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Category Id</em>' reference.
	 * @see #getParentCategoryId()
	 * @generated
	 */
	void setParentCategoryId(DataCategory value);

} // DataCategory
