/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getProductContentTypeId <em>Product Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getUseRoleTypeId <em>Use Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductContent#getUseTimeUomId <em>Use Time Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent()
 * @model
 * @generated
 */
public interface ProductContent extends BizEntityTyped<ProductContentType> {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_ContentId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Content'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase From Date</em>' attribute.
	 * @see #setPurchaseFromDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_PurchaseFromDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getPurchaseFromDate <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase From Date</em>' attribute.
	 * @see #getPurchaseFromDate()
	 * @generated
	 */
	void setPurchaseFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #setPurchaseThruDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_PurchaseThruDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getPurchaseThruDate <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #getPurchaseThruDate()
	 * @generated
	 */
	void setPurchaseThruDate(Date value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getSequenceNum <em>Sequence Num</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Count Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Count Limit</em>' attribute.
	 * @see #setUseCountLimit(long)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_UseCountLimit()
	 * @model
	 * @generated
	 */
	long getUseCountLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getUseCountLimit <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Count Limit</em>' attribute.
	 * @see #getUseCountLimit()
	 * @generated
	 */
	void setUseCountLimit(long value);

	/**
	 * Returns the value of the '<em><b>Use Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Role Type Id</em>' attribute.
	 * @see #setUseRoleTypeId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_UseRoleTypeId()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getUseRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getUseRoleTypeId <em>Use Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Role Type Id</em>' attribute.
	 * @see #getUseRoleTypeId()
	 * @generated
	 */
	void setUseRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Time</em>' attribute.
	 * @see #setUseTime(long)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_UseTime()
	 * @model
	 * @generated
	 */
	long getUseTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getUseTime <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time</em>' attribute.
	 * @see #getUseTime()
	 * @generated
	 */
	void setUseTime(long value);

	/**
	 * Returns the value of the '<em><b>Use Time Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Time Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Time Uom Id</em>' attribute.
	 * @see #setUseTimeUomId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_UseTimeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUseTimeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getUseTimeUomId <em>Use Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time Uom Id</em>' attribute.
	 * @see #getUseTimeUomId()
	 * @generated
	 */
	void setUseTimeUomId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_ProductId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Product Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Content Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Content Type Id</em>' attribute.
	 * @see #setProductContentTypeId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductContent_ProductContentTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductContentType'"
	 * @generated
	 */
	String getProductContentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductContent#getProductContentTypeId <em>Product Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Content Type Id</em>' attribute.
	 * @see #getProductContentTypeId()
	 * @generated
	 */
	void setProductContentTypeId(String value);

} // ProductContent
