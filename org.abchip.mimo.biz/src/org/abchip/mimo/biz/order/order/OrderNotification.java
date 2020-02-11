/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderNotification#getOrderNotificationId <em>Order Notification Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderNotification#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderNotification#getEmailType <em>Email Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderNotification#getNotificationDate <em>Notification Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderNotification#getOrderId <em>Order Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderNotification()
 * @model
 * @generated
 */
public interface OrderNotification extends BizEntity {
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderNotification_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderNotification#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Email Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Type</em>' reference.
	 * @see #setEmailType(Enumeration)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderNotification_EmailType()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getEmailType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderNotification#getEmailType <em>Email Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Type</em>' reference.
	 * @see #getEmailType()
	 * @generated
	 */
	void setEmailType(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Notification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Date</em>' attribute.
	 * @see #setNotificationDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderNotification_NotificationDate()
	 * @model
	 * @generated
	 */
	Date getNotificationDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderNotification#getNotificationDate <em>Notification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Date</em>' attribute.
	 * @see #getNotificationDate()
	 * @generated
	 */
	void setNotificationDate(Date value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderNotification_OrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderNotification#getOrderId <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' reference.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Notification Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Notification Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Notification Id</em>' attribute.
	 * @see #setOrderNotificationId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderNotification_OrderNotificationId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderNotificationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderNotification#getOrderNotificationId <em>Order Notification Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Notification Id</em>' attribute.
	 * @see #getOrderNotificationId()
	 * @generated
	 */
	void setOrderNotificationId(String value);

} // OrderNotification
