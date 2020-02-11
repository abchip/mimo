/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppingcart;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.product.catalog.ProdCatalog;
import org.abchip.mimo.biz.product.product.Product;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart Abandoned Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getCartAbandonedLineSeqId <em>Cart Abandoned Line Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservStart <em>Reserv Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getTotalWithAdjustments <em>Total With Adjustments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#isWasReserved <em>Was Reserved</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine()
 * @model annotation="mimo-ent-frame title='Order Abandoned Line'"
 * @generated
 */
public interface CartAbandonedLine extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cart Abandoned Line Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cart Abandoned Line Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart Abandoned Line Seq Id</em>' attribute.
	 * @see #setCartAbandonedLineSeqId(String)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_CartAbandonedLineSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCartAbandonedLineSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getCartAbandonedLineSeqId <em>Cart Abandoned Line Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cart Abandoned Line Seq Id</em>' attribute.
	 * @see #getCartAbandonedLineSeqId()
	 * @generated
	 */
	void setCartAbandonedLineSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Id</em>' attribute.
	 * @see #setConfigId(String)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_ConfigId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getConfigId <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Id</em>' attribute.
	 * @see #getConfigId()
	 * @generated
	 */
	void setConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Prod Catalog Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Catalog Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Catalog Id</em>' reference.
	 * @see #setProdCatalogId(ProdCatalog)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_ProdCatalogId()
	 * @model keys="prodCatalogId"
	 * @generated
	 */
	ProdCatalog getProdCatalogId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getProdCatalogId <em>Prod Catalog Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Catalog Id</em>' reference.
	 * @see #getProdCatalogId()
	 * @generated
	 */
	void setProdCatalogId(ProdCatalog value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_ProductId()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv2nd PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv2nd PP Perc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv2nd PP Perc</em>' attribute.
	 * @see #setReserv2ndPPPerc(BigDecimal)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_Reserv2ndPPPerc()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReserv2ndPPPerc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv2nd PP Perc</em>' attribute.
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 */
	void setReserv2ndPPPerc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Length</em>' attribute.
	 * @see #setReservLength(BigDecimal)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_ReservLength()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservLength <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Length</em>' attribute.
	 * @see #getReservLength()
	 * @generated
	 */
	void setReservLength(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Nth PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Nth PP Perc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Nth PP Perc</em>' attribute.
	 * @see #setReservNthPPPerc(BigDecimal)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_ReservNthPPPerc()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservNthPPPerc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Nth PP Perc</em>' attribute.
	 * @see #getReservNthPPPerc()
	 * @generated
	 */
	void setReservNthPPPerc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Persons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Persons</em>' attribute.
	 * @see #setReservPersons(BigDecimal)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_ReservPersons()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservPersons();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservPersons <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Persons</em>' attribute.
	 * @see #getReservPersons()
	 * @generated
	 */
	void setReservPersons(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Start</em>' attribute.
	 * @see #setReservStart(Date)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_ReservStart()
	 * @model
	 * @generated
	 */
	Date getReservStart();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservStart <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Start</em>' attribute.
	 * @see #getReservStart()
	 * @generated
	 */
	void setReservStart(Date value);

	/**
	 * Returns the value of the '<em><b>Total With Adjustments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total With Adjustments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total With Adjustments</em>' attribute.
	 * @see #setTotalWithAdjustments(BigDecimal)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_TotalWithAdjustments()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getTotalWithAdjustments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getTotalWithAdjustments <em>Total With Adjustments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total With Adjustments</em>' attribute.
	 * @see #getTotalWithAdjustments()
	 * @generated
	 */
	void setTotalWithAdjustments(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' attribute.
	 * @see #setUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_UnitPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getUnitPrice <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' attribute.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Was Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Was Reserved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Was Reserved</em>' attribute.
	 * @see #setWasReserved(boolean)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_WasReserved()
	 * @model
	 * @generated
	 */
	boolean isWasReserved();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#isWasReserved <em>Was Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Was Reserved</em>' attribute.
	 * @see #isWasReserved()
	 * @generated
	 */
	void setWasReserved(boolean value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage#getCartAbandonedLine_VisitId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

} // CartAbandonedLine
