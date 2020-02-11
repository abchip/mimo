/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Price Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPriceChangeId <em>Product Price Change Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getChangedByUserLogin <em>Changed By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getChangedDate <em>Changed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getOldPrice <em>Old Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getPrice <em>Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPriceTypeId <em>Product Price Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange()
 * @model annotation="mimo-ent-frame title='Product Price Change History' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPriceChange extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Changed By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed By User Login</em>' reference.
	 * @see #setChangedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_ChangedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getChangedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getChangedByUserLogin <em>Changed By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed By User Login</em>' reference.
	 * @see #getChangedByUserLogin()
	 * @generated
	 */
	void setChangedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Changed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed Date</em>' attribute.
	 * @see #setChangedDate(Date)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_ChangedDate()
	 * @model
	 * @generated
	 */
	Date getChangedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getChangedDate <em>Changed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed Date</em>' attribute.
	 * @see #getChangedDate()
	 * @generated
	 */
	void setChangedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_CurrencyUomId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

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
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Old Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Price</em>' attribute.
	 * @see #setOldPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_OldPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getOldPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getOldPrice <em>Old Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Price</em>' attribute.
	 * @see #getOldPrice()
	 * @generated
	 */
	void setOldPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_Price()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_ProductId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Change Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Change Id</em>' attribute.
	 * @see #setProductPriceChangeId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_ProductPriceChangeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPriceChangeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPriceChangeId <em>Product Price Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Change Id</em>' attribute.
	 * @see #getProductPriceChangeId()
	 * @generated
	 */
	void setProductPriceChangeId(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Purpose Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Purpose Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Purpose Id</em>' attribute.
	 * @see #setProductPricePurposeId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_ProductPricePurposeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPricePurposeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPricePurposeId <em>Product Price Purpose Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Purpose Id</em>' attribute.
	 * @see #getProductPricePurposeId()
	 * @generated
	 */
	void setProductPricePurposeId(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Type Id</em>' attribute.
	 * @see #setProductPriceTypeId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_ProductPriceTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPriceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPriceTypeId <em>Product Price Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Type Id</em>' attribute.
	 * @see #getProductPriceTypeId()
	 * @generated
	 */
	void setProductPriceTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #setProductStoreGroupId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_ProductStoreGroupId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductStoreGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductStoreGroupId <em>Product Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #getProductStoreGroupId()
	 * @generated
	 */
	void setProductStoreGroupId(String value);

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
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceChange_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ProductPriceChange
