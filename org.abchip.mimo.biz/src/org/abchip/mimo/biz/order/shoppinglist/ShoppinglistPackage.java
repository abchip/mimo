/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist;

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
 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistFactory
 * @model kind="package"
 * @generated
 */
public interface ShoppinglistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shoppinglist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/order/shoppinglist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-shoppinglist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShoppinglistPackage eINSTANCE = org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl <em>Shopping List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingList()
	 * @generated
	 */
	int SHOPPING_LIST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shopping List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHOPPING_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Carrier Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CARRIER_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Carrier Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CARRIER_ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CURRENCY_UOM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__IS_ACTIVE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__IS_PUBLIC = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Admin Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LAST_ADMIN_MODIFIED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Ordered Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LAST_ORDERED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LIST_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parent Shopping List Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PARENT_SHOPPING_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PAYMENT_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Product Promo Code Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PRODUCT_PROMO_CODE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Recurrence Info Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__RECURRENCE_INFO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Shopping List Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHOPPING_LIST_ITEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Shopping List Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHOPPING_LIST_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Shopping List Work Efforts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Visitor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__VISITOR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Shopping List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl <em>Shopping List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListItem()
	 * @generated
	 */
	int SHOPPING_LIST_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shopping List Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__SHOPPING_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shopping List Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modified Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__MODIFIED_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quantity Purchased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__QUANTITY_PURCHASED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__RESERV_LENGTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__RESERV_PERSONS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__RESERV_START = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Shopping List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl <em>Shopping List Item Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListItemSurvey()
	 * @generated
	 */
	int SHOPPING_LIST_ITEM_SURVEY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shopping List Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Survey Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shopping List Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shopping List Item Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListTypeImpl <em>Shopping List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListTypeImpl
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListType()
	 * @generated
	 */
	int SHOPPING_LIST_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shopping List Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__SHOPPING_LIST_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shopping List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListWorkEffortImpl <em>Shopping List Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListWorkEffortImpl
	 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListWorkEffort()
	 * @generated
	 */
	int SHOPPING_LIST_WORK_EFFORT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shopping List Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__SHOPPING_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shopping List Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList <em>Shopping List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList
	 * @generated
	 */
	EClass getShoppingList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListId <em>Shopping List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_ShoppingListId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCarrierPartyId <em>Carrier Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCarrierPartyId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_CarrierPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCarrierRoleTypeId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_CarrierRoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getContactMechId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCurrencyUom()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getDescription()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#isIsActive()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#isIsPublic()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getLastAdminModified <em>Last Admin Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Admin Modified</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getLastAdminModified()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_LastAdminModified();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getLastOrderedDate <em>Last Ordered Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Ordered Date</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getLastOrderedDate()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_LastOrderedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getListName <em>List Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Name</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getListName()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_ListName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getParentShoppingListId <em>Parent Shopping List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Shopping List Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getParentShoppingListId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ParentShoppingListId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getPartyId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getPaymentMethodId <em>Payment Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getPaymentMethodId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_PaymentMethodId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getProductPromoCodeId <em>Product Promo Code Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Code Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getProductPromoCodeId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ProductPromoCodeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getProductStoreId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getRecurrenceInfoId <em>Recurrence Info Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurrence Info Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getRecurrenceInfoId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_RecurrenceInfoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShipmentMethodTypeId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListItems <em>Shopping List Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shopping List Items</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListItems()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ShoppingListItems();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListTypeId <em>Shopping List Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shopping List Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListTypeId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ShoppingListTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListWorkEfforts <em>Shopping List Work Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shopping List Work Efforts</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListWorkEfforts()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ShoppingListWorkEfforts();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getVisitorId <em>Visitor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visitor Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getVisitorId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_VisitorId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem <em>Shopping List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List Item</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem
	 * @generated
	 */
	EClass getShoppingListItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getShoppingListId <em>Shopping List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shopping List Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getShoppingListId()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EReference getShoppingListItem_ShoppingListId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getShoppingListItemSeqId()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ShoppingListItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getConfigId()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getModifiedPrice <em>Modified Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Price</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getModifiedPrice()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ModifiedPrice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getProductId()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EReference getShoppingListItem_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getQuantity()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getQuantityPurchased <em>Quantity Purchased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Purchased</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getQuantityPurchased()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_QuantityPurchased();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getReservLength <em>Reserv Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Length</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getReservLength()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ReservLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getReservPersons <em>Reserv Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Persons</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getReservPersons()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ReservPersons();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getReservStart <em>Reserv Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Start</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem#getReservStart()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ReservStart();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey <em>Shopping List Item Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List Item Survey</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey
	 * @generated
	 */
	EClass getShoppingListItemSurvey();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getShoppingListId <em>Shopping List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shopping List Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getShoppingListId()
	 * @see #getShoppingListItemSurvey()
	 * @generated
	 */
	EReference getShoppingListItemSurvey_ShoppingListId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getShoppingListItemSeqId()
	 * @see #getShoppingListItemSurvey()
	 * @generated
	 */
	EAttribute getShoppingListItemSurvey_ShoppingListItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getSurveyResponseId <em>Survey Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Response Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getSurveyResponseId()
	 * @see #getShoppingListItemSurvey()
	 * @generated
	 */
	EReference getShoppingListItemSurvey_SurveyResponseId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListType <em>Shopping List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List Type</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListType
	 * @generated
	 */
	EClass getShoppingListType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListType#getShoppingListTypeId <em>Shopping List Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListType#getShoppingListTypeId()
	 * @see #getShoppingListType()
	 * @generated
	 */
	EAttribute getShoppingListType_ShoppingListTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListType#getDescription()
	 * @see #getShoppingListType()
	 * @generated
	 */
	EAttribute getShoppingListType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort <em>Shopping List Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List Work Effort</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort
	 * @generated
	 */
	EClass getShoppingListWorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort#getShoppingListId <em>Shopping List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shopping List Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort#getShoppingListId()
	 * @see #getShoppingListWorkEffort()
	 * @generated
	 */
	EReference getShoppingListWorkEffort_ShoppingListId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort#getWorkEffortId()
	 * @see #getShoppingListWorkEffort()
	 * @generated
	 */
	EReference getShoppingListWorkEffort_WorkEffortId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShoppinglistFactory getShoppinglistFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl <em>Shopping List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingList()
		 * @generated
		 */
		EClass SHOPPING_LIST = eINSTANCE.getShoppingList();

		/**
		 * The meta object literal for the '<em><b>Shopping List Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__SHOPPING_LIST_ID = eINSTANCE.getShoppingList_ShoppingListId();

		/**
		 * The meta object literal for the '<em><b>Carrier Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__CARRIER_PARTY_ID = eINSTANCE.getShoppingList_CarrierPartyId();

		/**
		 * The meta object literal for the '<em><b>Carrier Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__CARRIER_ROLE_TYPE_ID = eINSTANCE.getShoppingList_CarrierRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__CONTACT_MECH_ID = eINSTANCE.getShoppingList_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__CURRENCY_UOM = eINSTANCE.getShoppingList_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__DESCRIPTION = eINSTANCE.getShoppingList_Description();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__IS_ACTIVE = eINSTANCE.getShoppingList_IsActive();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__IS_PUBLIC = eINSTANCE.getShoppingList_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Last Admin Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__LAST_ADMIN_MODIFIED = eINSTANCE.getShoppingList_LastAdminModified();

		/**
		 * The meta object literal for the '<em><b>Last Ordered Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__LAST_ORDERED_DATE = eINSTANCE.getShoppingList_LastOrderedDate();

		/**
		 * The meta object literal for the '<em><b>List Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__LIST_NAME = eINSTANCE.getShoppingList_ListName();

		/**
		 * The meta object literal for the '<em><b>Parent Shopping List Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PARENT_SHOPPING_LIST_ID = eINSTANCE.getShoppingList_ParentShoppingListId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PARTY_ID = eINSTANCE.getShoppingList_PartyId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PAYMENT_METHOD_ID = eINSTANCE.getShoppingList_PaymentMethodId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PRODUCT_PROMO_CODE_ID = eINSTANCE.getShoppingList_ProductPromoCodeId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PRODUCT_STORE_ID = eINSTANCE.getShoppingList_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Recurrence Info Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__RECURRENCE_INFO_ID = eINSTANCE.getShoppingList_RecurrenceInfoId();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getShoppingList_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Shopping List Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__SHOPPING_LIST_ITEMS = eINSTANCE.getShoppingList_ShoppingListItems();

		/**
		 * The meta object literal for the '<em><b>Shopping List Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__SHOPPING_LIST_TYPE_ID = eINSTANCE.getShoppingList_ShoppingListTypeId();

		/**
		 * The meta object literal for the '<em><b>Shopping List Work Efforts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS = eINSTANCE.getShoppingList_ShoppingListWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Visitor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__VISITOR_ID = eINSTANCE.getShoppingList_VisitorId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl <em>Shopping List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListItem()
		 * @generated
		 */
		EClass SHOPPING_LIST_ITEM = eINSTANCE.getShoppingListItem();

		/**
		 * The meta object literal for the '<em><b>Shopping List Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_ITEM__SHOPPING_LIST_ID = eINSTANCE.getShoppingListItem_ShoppingListId();

		/**
		 * The meta object literal for the '<em><b>Shopping List Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID = eINSTANCE.getShoppingListItem_ShoppingListItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__CONFIG_ID = eINSTANCE.getShoppingListItem_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Modified Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__MODIFIED_PRICE = eINSTANCE.getShoppingListItem_ModifiedPrice();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_ITEM__PRODUCT_ID = eINSTANCE.getShoppingListItem_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__QUANTITY = eINSTANCE.getShoppingListItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Quantity Purchased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__QUANTITY_PURCHASED = eINSTANCE.getShoppingListItem_QuantityPurchased();

		/**
		 * The meta object literal for the '<em><b>Reserv Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__RESERV_LENGTH = eINSTANCE.getShoppingListItem_ReservLength();

		/**
		 * The meta object literal for the '<em><b>Reserv Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__RESERV_PERSONS = eINSTANCE.getShoppingListItem_ReservPersons();

		/**
		 * The meta object literal for the '<em><b>Reserv Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__RESERV_START = eINSTANCE.getShoppingListItem_ReservStart();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl <em>Shopping List Item Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListItemSurvey()
		 * @generated
		 */
		EClass SHOPPING_LIST_ITEM_SURVEY = eINSTANCE.getShoppingListItemSurvey();

		/**
		 * The meta object literal for the '<em><b>Shopping List Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID = eINSTANCE.getShoppingListItemSurvey_ShoppingListId();

		/**
		 * The meta object literal for the '<em><b>Shopping List Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID = eINSTANCE.getShoppingListItemSurvey_ShoppingListItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Survey Response Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID = eINSTANCE.getShoppingListItemSurvey_SurveyResponseId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListTypeImpl <em>Shopping List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListTypeImpl
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListType()
		 * @generated
		 */
		EClass SHOPPING_LIST_TYPE = eINSTANCE.getShoppingListType();

		/**
		 * The meta object literal for the '<em><b>Shopping List Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_TYPE__SHOPPING_LIST_TYPE_ID = eINSTANCE.getShoppingListType_ShoppingListTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_TYPE__DESCRIPTION = eINSTANCE.getShoppingListType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListWorkEffortImpl <em>Shopping List Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListWorkEffortImpl
		 * @see org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListWorkEffort()
		 * @generated
		 */
		EClass SHOPPING_LIST_WORK_EFFORT = eINSTANCE.getShoppingListWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Shopping List Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_WORK_EFFORT__SHOPPING_LIST_ID = eINSTANCE.getShoppingListWorkEffort_ShoppingListId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_WORK_EFFORT__WORK_EFFORT_ID = eINSTANCE.getShoppingListWorkEffort_WorkEffortId();

	}

} //ShoppinglistPackage
