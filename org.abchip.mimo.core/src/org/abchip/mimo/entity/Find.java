/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import java.util.concurrent.Callable;

import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.Find#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Find#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Find#getFields <em>Fields</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Find#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Find#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.Find#isProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getFind()
 * @model superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.entity.FindResponse&lt;E&gt;&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.entity.FindResponse&lt;E&gt;&gt;"
 * @generated
 */
public interface Find<E extends EntityIdentifiable> extends ServiceRequest<FindResponse<E>>, Callable<FindResponse<E>> {

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #setFrame(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getFind_Frame()
	 * @model required="true"
	 * @generated
	 */
	String getFrame();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Find#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getFind_Filter()
	 * @model
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Find#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' attribute.
	 * @see #setFields(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getFind_Fields()
	 * @model
	 * @generated
	 */
	String getFields();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Find#getFields <em>Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields</em>' attribute.
	 * @see #getFields()
	 * @generated
	 */
	void setFields(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(String)
	 * @see org.abchip.mimo.entity.EntityPackage#getFind_Order()
	 * @model
	 * @generated
	 */
	String getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Find#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(String value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(int)
	 * @see org.abchip.mimo.entity.EntityPackage#getFind_Limit()
	 * @model
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Find#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' attribute.
	 * @see #setProxy(boolean)
	 * @see org.abchip.mimo.entity.EntityPackage#getFind_Proxy()
	 * @model
	 * @generated
	 */
	boolean isProxy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.Find#isProxy <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' attribute.
	 * @see #isProxy()
	 * @generated
	 */
	void setProxy(boolean value);
} // Find
