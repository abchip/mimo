/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getLinkSeqId <em>Link Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getDetailSubScreen <em>Detail Sub Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getDetailText <em>Detail Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getImageTwoUrl <em>Image Two Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getLinkInfo <em>Link Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getLinkTypeEnumId <em>Link Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getTitleText <em>Title Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink()
 * @model
 * @generated
 */
public interface ProductCategoryLink extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Detail Sub Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Sub Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Sub Screen</em>' attribute.
	 * @see #setDetailSubScreen(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_DetailSubScreen()
	 * @model
	 * @generated
	 */
	String getDetailSubScreen();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getDetailSubScreen <em>Detail Sub Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Sub Screen</em>' attribute.
	 * @see #getDetailSubScreen()
	 * @generated
	 */
	void setDetailSubScreen(String value);

	/**
	 * Returns the value of the '<em><b>Detail Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Text</em>' attribute.
	 * @see #setDetailText(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_DetailText()
	 * @model
	 * @generated
	 */
	String getDetailText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getDetailText <em>Detail Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Text</em>' attribute.
	 * @see #getDetailText()
	 * @generated
	 */
	void setDetailText(String value);

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
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Image Two Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Two Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Two Url</em>' attribute.
	 * @see #setImageTwoUrl(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_ImageTwoUrl()
	 * @model
	 * @generated
	 */
	String getImageTwoUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getImageTwoUrl <em>Image Two Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Two Url</em>' attribute.
	 * @see #getImageTwoUrl()
	 * @generated
	 */
	void setImageTwoUrl(String value);

	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_ImageUrl()
	 * @model
	 * @generated
	 */
	String getImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Link Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Info</em>' attribute.
	 * @see #setLinkInfo(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_LinkInfo()
	 * @model
	 * @generated
	 */
	String getLinkInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getLinkInfo <em>Link Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Info</em>' attribute.
	 * @see #getLinkInfo()
	 * @generated
	 */
	void setLinkInfo(String value);

	/**
	 * Returns the value of the '<em><b>Link Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Seq Id</em>' attribute.
	 * @see #setLinkSeqId(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_LinkSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getLinkSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getLinkSeqId <em>Link Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Seq Id</em>' attribute.
	 * @see #getLinkSeqId()
	 * @generated
	 */
	void setLinkSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Link Type Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type Enum Id</em>' attribute.
	 * @see #setLinkTypeEnumId(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_LinkTypeEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getLinkTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getLinkTypeEnumId <em>Link Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type Enum Id</em>' attribute.
	 * @see #getLinkTypeEnumId()
	 * @generated
	 */
	void setLinkTypeEnumId(String value);

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
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getSequenceNum <em>Sequence Num</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Title Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Text</em>' attribute.
	 * @see #setTitleText(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_TitleText()
	 * @model
	 * @generated
	 */
	String getTitleText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getTitleText <em>Title Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Text</em>' attribute.
	 * @see #getTitleText()
	 * @generated
	 */
	void setTitleText(String value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryLink_ProductCategoryId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductCategory'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryLink#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

} // ProductCategoryLink
