/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.service.schedule.JobSandbox;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Group Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getGroupOrderId <em>Group Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getJobId <em>Job Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getReqOrderQty <em>Req Order Qty</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getSoldOrderQty <em>Sold Order Qty</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGroupOrder()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductGroupOrder extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGroupOrder_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Group Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Order Id</em>' attribute.
	 * @see #setGroupOrderId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGroupOrder_GroupOrderId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGroupOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getGroupOrderId <em>Group Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Order Id</em>' attribute.
	 * @see #getGroupOrderId()
	 * @generated
	 */
	void setGroupOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Job Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Id</em>' reference.
	 * @see #setJobId(JobSandbox)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGroupOrder_JobId()
	 * @model keys="jobId"
	 * @generated
	 */
	JobSandbox getJobId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getJobId <em>Job Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Id</em>' reference.
	 * @see #getJobId()
	 * @generated
	 */
	void setJobId(JobSandbox value);

	/**
	 * Returns the value of the '<em><b>Req Order Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Order Qty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Order Qty</em>' attribute.
	 * @see #setReqOrderQty(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGroupOrder_ReqOrderQty()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReqOrderQty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getReqOrderQty <em>Req Order Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Order Qty</em>' attribute.
	 * @see #getReqOrderQty()
	 * @generated
	 */
	void setReqOrderQty(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sold Order Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sold Order Qty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sold Order Qty</em>' attribute.
	 * @see #setSoldOrderQty(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGroupOrder_SoldOrderQty()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getSoldOrderQty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getSoldOrderQty <em>Sold Order Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sold Order Qty</em>' attribute.
	 * @see #getSoldOrderQty()
	 * @generated
	 */
	void setSoldOrderQty(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGroupOrder_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGroupOrder_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGroupOrder_ProductId()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

} // ProductGroupOrder
