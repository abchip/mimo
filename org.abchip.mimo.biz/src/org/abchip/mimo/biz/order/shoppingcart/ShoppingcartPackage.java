/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppingcart;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.order.shoppingcart.ShoppingcartFactory
 * @model kind="package"
 * @generated
 */
public interface ShoppingcartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shoppingcart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/order/shoppingcart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-shoppingcart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShoppingcartPackage eINSTANCE = org.abchip.mimo.biz.order.shoppingcart.impl.ShoppingcartPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl <em>Cart Abandoned Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl
	 * @see org.abchip.mimo.biz.order.shoppingcart.impl.ShoppingcartPackageImpl#getCartAbandonedLine()
	 * @generated
	 */
	int CART_ABANDONED_LINE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cart Abandoned Line Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__CART_ABANDONED_LINE_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__VISIT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prod Catalog Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__PROD_CATALOG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reserv2nd PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__RESERV2ND_PP_PERC = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__RESERV_LENGTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reserv Nth PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__RESERV_NTH_PP_PERC = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__RESERV_PERSONS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__RESERV_START = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Total With Adjustments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__TOTAL_WITH_ADJUSTMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__UNIT_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Was Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE__WAS_RESERVED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Cart Abandoned Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ABANDONED_LINE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine <em>Cart Abandoned Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart Abandoned Line</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine
	 * @generated
	 */
	EClass getCartAbandonedLine();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getVisitId()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_VisitId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getCartAbandonedLineSeqId <em>Cart Abandoned Line Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cart Abandoned Line Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getCartAbandonedLineSeqId()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_CartAbandonedLineSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getConfigId()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_ConfigId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getProdCatalogId <em>Prod Catalog Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prod Catalog Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getProdCatalogId()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EReference getCartAbandonedLine_ProdCatalogId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getProductId()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EReference getCartAbandonedLine_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getQuantity()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv2nd PP Perc</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReserv2ndPPPerc()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_Reserv2ndPPPerc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservLength <em>Reserv Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Length</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservLength()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_ReservLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Nth PP Perc</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservNthPPPerc()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_ReservNthPPPerc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservPersons <em>Reserv Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Persons</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservPersons()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_ReservPersons();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservStart <em>Reserv Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Start</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getReservStart()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_ReservStart();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getTotalWithAdjustments <em>Total With Adjustments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total With Adjustments</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getTotalWithAdjustments()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_TotalWithAdjustments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#getUnitPrice()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_UnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#isWasReserved <em>Was Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Was Reserved</em>'.
	 * @see org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine#isWasReserved()
	 * @see #getCartAbandonedLine()
	 * @generated
	 */
	EAttribute getCartAbandonedLine_WasReserved();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShoppingcartFactory getShoppingcartFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl <em>Cart Abandoned Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl
		 * @see org.abchip.mimo.biz.order.shoppingcart.impl.ShoppingcartPackageImpl#getCartAbandonedLine()
		 * @generated
		 */
		EClass CART_ABANDONED_LINE = eINSTANCE.getCartAbandonedLine();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__VISIT_ID = eINSTANCE.getCartAbandonedLine_VisitId();

		/**
		 * The meta object literal for the '<em><b>Cart Abandoned Line Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__CART_ABANDONED_LINE_SEQ_ID = eINSTANCE.getCartAbandonedLine_CartAbandonedLineSeqId();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__CONFIG_ID = eINSTANCE.getCartAbandonedLine_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART_ABANDONED_LINE__PROD_CATALOG_ID = eINSTANCE.getCartAbandonedLine_ProdCatalogId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART_ABANDONED_LINE__PRODUCT_ID = eINSTANCE.getCartAbandonedLine_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__QUANTITY = eINSTANCE.getCartAbandonedLine_Quantity();

		/**
		 * The meta object literal for the '<em><b>Reserv2nd PP Perc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__RESERV2ND_PP_PERC = eINSTANCE.getCartAbandonedLine_Reserv2ndPPPerc();

		/**
		 * The meta object literal for the '<em><b>Reserv Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__RESERV_LENGTH = eINSTANCE.getCartAbandonedLine_ReservLength();

		/**
		 * The meta object literal for the '<em><b>Reserv Nth PP Perc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__RESERV_NTH_PP_PERC = eINSTANCE.getCartAbandonedLine_ReservNthPPPerc();

		/**
		 * The meta object literal for the '<em><b>Reserv Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__RESERV_PERSONS = eINSTANCE.getCartAbandonedLine_ReservPersons();

		/**
		 * The meta object literal for the '<em><b>Reserv Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__RESERV_START = eINSTANCE.getCartAbandonedLine_ReservStart();

		/**
		 * The meta object literal for the '<em><b>Total With Adjustments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__TOTAL_WITH_ADJUSTMENTS = eINSTANCE.getCartAbandonedLine_TotalWithAdjustments();

		/**
		 * The meta object literal for the '<em><b>Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__UNIT_PRICE = eINSTANCE.getCartAbandonedLine_UnitPrice();

		/**
		 * The meta object literal for the '<em><b>Was Reserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ABANDONED_LINE__WAS_RESERVED = eINSTANCE.getCartAbandonedLine_WasReserved();

	}

} //ShoppingcartPackage
