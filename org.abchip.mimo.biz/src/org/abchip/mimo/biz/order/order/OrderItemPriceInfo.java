/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.product.price.ProductPriceRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Price Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getOrderItemPriceInfoId <em>Order Item Price Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getModifyAmount <em>Modify Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getRateCode <em>Rate Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemPriceInfo()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface OrderItemPriceInfo extends BizEntity {
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemPriceInfo_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Modify Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Amount</em>' attribute.
	 * @see #setModifyAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemPriceInfo_ModifyAmount()
	 * @model annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getModifyAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getModifyAmount <em>Modify Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Amount</em>' attribute.
	 * @see #getModifyAmount()
	 * @generated
	 */
	void setModifyAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' reference.
	 * @see #setOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemPriceInfo_OrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getOrderId <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' reference.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Item Price Info Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Price Info Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Price Info Id</em>' attribute.
	 * @see #setOrderItemPriceInfoId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemPriceInfo_OrderItemPriceInfoId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemPriceInfoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getOrderItemPriceInfoId <em>Order Item Price Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Price Info Id</em>' attribute.
	 * @see #getOrderItemPriceInfoId()
	 * @generated
	 */
	void setOrderItemPriceInfoId(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemPriceInfo_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Action Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Action Seq Id</em>' attribute.
	 * @see #setProductPriceActionSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemPriceInfo_ProductPriceActionSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPriceActionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Action Seq Id</em>' attribute.
	 * @see #getProductPriceActionSeqId()
	 * @generated
	 */
	void setProductPriceActionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Rule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Rule Id</em>' reference.
	 * @see #setProductPriceRuleId(ProductPriceRule)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemPriceInfo_ProductPriceRuleId()
	 * @model keys="productPriceRuleId"
	 * @generated
	 */
	ProductPriceRule getProductPriceRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getProductPriceRuleId <em>Product Price Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Rule Id</em>' reference.
	 * @see #getProductPriceRuleId()
	 * @generated
	 */
	void setProductPriceRuleId(ProductPriceRule value);

	/**
	 * Returns the value of the '<em><b>Rate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Code</em>' attribute.
	 * @see #setRateCode(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemPriceInfo_RateCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getRateCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemPriceInfo#getRateCode <em>Rate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Code</em>' attribute.
	 * @see #getRateCode()
	 * @generated
	 */
	void setRateCode(String value);

} // OrderItemPriceInfo
