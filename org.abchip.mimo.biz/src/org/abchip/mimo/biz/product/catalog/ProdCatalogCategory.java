/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.catalog;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prod Catalog Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getProdCatalogCategoryTypeId <em>Prod Catalog Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategory()
 * @model
 * @generated
 */
public interface ProdCatalogCategory extends BizEntityTyped<ProdCatalogCategoryType> {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategory_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategory_ProductCategoryId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductCategory'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategory_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategory_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Prod Catalog Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Catalog Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Catalog Id</em>' attribute.
	 * @see #setProdCatalogId(String)
	 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategory_ProdCatalogId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProdCatalog'"
	 * @generated
	 */
	String getProdCatalogId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getProdCatalogId <em>Prod Catalog Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Catalog Id</em>' attribute.
	 * @see #getProdCatalogId()
	 * @generated
	 */
	void setProdCatalogId(String value);

	/**
	 * Returns the value of the '<em><b>Prod Catalog Category Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Catalog Category Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Catalog Category Type Id</em>' attribute.
	 * @see #setProdCatalogCategoryTypeId(String)
	 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategory_ProdCatalogCategoryTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProdCatalogCategoryType'"
	 * @generated
	 */
	String getProdCatalogCategoryTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategory#getProdCatalogCategoryTypeId <em>Prod Catalog Category Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Catalog Category Type Id</em>' attribute.
	 * @see #getProdCatalogCategoryTypeId()
	 * @generated
	 */
	void setProdCatalogCategoryTypeId(String value);

} // ProdCatalogCategory
