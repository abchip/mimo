/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test;

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
 * @see org.abchip.mimo.biz.entity.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/entity/test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = org.abchip.mimo.biz.entity.test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl <em>Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestFieldType()
	 * @generated
	 */
	int TEST_FIELD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Test Field Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blob Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__BLOB_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Byte Array Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__BYTE_ARRAY_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clob Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__CLOB_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__DATE_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Time Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__DATE_TIME_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fixed Point Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__FIXED_POINT_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Floating Point Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__FLOATING_POINT_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Numeric Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__NUMERIC_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Object Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__OBJECT_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Time Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE__TIME_FIELD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl <em>Testing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestingImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTesting()
	 * @generated
	 */
	int TESTING = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Testing Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Testing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_ITEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Testing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Testing Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_SIZE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Testing Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TESTING_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingCryptoImpl <em>Testing Crypto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestingCryptoImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingCrypto()
	 * @generated
	 */
	int TESTING_CRYPTO = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Testing Crypto Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__TESTING_CRYPTO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encrypted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__ENCRYPTED_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Salted Encrypted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Testing Crypto Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unencrypted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO__UNENCRYPTED_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Testing Crypto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CRYPTO_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingItemImpl <em>Testing Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestingItemImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingItem()
	 * @generated
	 */
	int TESTING_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Testing Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__TESTING_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Testing Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__TESTING_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Testing History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM__TESTING_HISTORY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Testing Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeImpl <em>Testing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestingNodeImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingNode()
	 * @generated
	 */
	int TESTING_NODE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Testing Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__TESTING_NODE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primary Parent Node Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE__PRIMARY_PARENT_NODE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Testing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl <em>Testing Node Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingNodeMember()
	 * @generated
	 */
	int TESTING_NODE_MEMBER = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Testing Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__TESTING_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Testing Node Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__TESTING_NODE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extend From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__EXTEND_FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extend Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__EXTEND_THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Testing Node Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_NODE_MEMBER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingRemoveAllImpl <em>Testing Remove All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestingRemoveAllImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingRemoveAll()
	 * @generated
	 */
	int TESTING_REMOVE_ALL = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Testing Remove All Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Testing Remove All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_REMOVE_ALL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl <em>Testing Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingStatus()
	 * @generated
	 */
	int TESTING_STATUS = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Testing Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__TESTING_STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__STATUS_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Testing Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS__TESTING_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Testing Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingSubtypeImpl <em>Testing Subtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestingSubtypeImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingSubtype()
	 * @generated
	 */
	int TESTING_SUBTYPE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Testing Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__TESTING_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtype Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE__SUBTYPE_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Testing Subtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SUBTYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingTypeImpl <em>Testing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.test.impl.TestingTypeImpl
	 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingType()
	 * @generated
	 */
	int TESTING_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Testing Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__TESTING_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Testing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.TestFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType
	 * @generated
	 */
	EClass getTestFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getTestFieldTypeId <em>Test Field Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Field Type Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getTestFieldTypeId()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_TestFieldTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getBlobField <em>Blob Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blob Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getBlobField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_BlobField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getByteArrayField <em>Byte Array Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Array Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getByteArrayField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_ByteArrayField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getClobField <em>Clob Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clob Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getClobField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_ClobField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getDateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getDateField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_DateField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getDateTimeField <em>Date Time Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getDateTimeField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_DateTimeField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getFixedPointField <em>Fixed Point Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Point Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getFixedPointField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_FixedPointField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getFloatingPointField <em>Floating Point Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating Point Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getFloatingPointField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_FloatingPointField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getNumericField <em>Numeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getNumericField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_NumericField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getObjectField <em>Object Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getObjectField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_ObjectField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestFieldType#getTimeField <em>Time Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Field</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestFieldType#getTimeField()
	 * @see #getTestFieldType()
	 * @generated
	 */
	EAttribute getTestFieldType_TimeField();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.Testing <em>Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing</em>'.
	 * @see org.abchip.mimo.biz.entity.test.Testing
	 * @generated
	 */
	EClass getTesting();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.Testing#getTestingId <em>Testing Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.Testing#getTestingId()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_TestingId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.Testing#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.entity.test.Testing#getComments()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.Testing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.entity.test.Testing#getDescription()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.Testing#getTestingDate <em>Testing Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Date</em>'.
	 * @see org.abchip.mimo.biz.entity.test.Testing#getTestingDate()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_TestingDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.entity.test.Testing#getTestingItems <em>Testing Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Testing Items</em>'.
	 * @see org.abchip.mimo.biz.entity.test.Testing#getTestingItems()
	 * @see #getTesting()
	 * @generated
	 */
	EReference getTesting_TestingItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.Testing#getTestingName <em>Testing Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Name</em>'.
	 * @see org.abchip.mimo.biz.entity.test.Testing#getTestingName()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_TestingName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.Testing#getTestingSize <em>Testing Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Size</em>'.
	 * @see org.abchip.mimo.biz.entity.test.Testing#getTestingSize()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_TestingSize();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.test.Testing#getTestingTypeId <em>Testing Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testing Type Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.Testing#getTestingTypeId()
	 * @see #getTesting()
	 * @generated
	 */
	EReference getTesting_TestingTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.TestingCrypto <em>Testing Crypto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Crypto</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingCrypto
	 * @generated
	 */
	EClass getTestingCrypto();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getTestingCryptoId <em>Testing Crypto Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Crypto Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingCrypto#getTestingCryptoId()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_TestingCryptoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getEncryptedValue <em>Encrypted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted Value</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingCrypto#getEncryptedValue()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_EncryptedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getSaltedEncryptedValue <em>Salted Encrypted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salted Encrypted Value</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingCrypto#getSaltedEncryptedValue()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_SaltedEncryptedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getTestingCryptoTypeId <em>Testing Crypto Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Crypto Type Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingCrypto#getTestingCryptoTypeId()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_TestingCryptoTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingCrypto#getUnencryptedValue <em>Unencrypted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unencrypted Value</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingCrypto#getUnencryptedValue()
	 * @see #getTestingCrypto()
	 * @generated
	 */
	EAttribute getTestingCrypto_UnencryptedValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.TestingItem <em>Testing Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Item</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingItem
	 * @generated
	 */
	EClass getTestingItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.test.TestingItem#getTestingId <em>Testing Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testing Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingItem#getTestingId()
	 * @see #getTestingItem()
	 * @generated
	 */
	EReference getTestingItem_TestingId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingItem#getTestingSeqId <em>Testing Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Seq Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingItem#getTestingSeqId()
	 * @see #getTestingItem()
	 * @generated
	 */
	EAttribute getTestingItem_TestingSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingItem#getTestingHistory <em>Testing History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing History</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingItem#getTestingHistory()
	 * @see #getTestingItem()
	 * @generated
	 */
	EAttribute getTestingItem_TestingHistory();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.TestingNode <em>Testing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Node</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNode
	 * @generated
	 */
	EClass getTestingNode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingNode#getTestingNodeId <em>Testing Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Node Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNode#getTestingNodeId()
	 * @see #getTestingNode()
	 * @generated
	 */
	EAttribute getTestingNode_TestingNodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingNode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNode#getDescription()
	 * @see #getTestingNode()
	 * @generated
	 */
	EAttribute getTestingNode_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.test.TestingNode#getPrimaryParentNodeId <em>Primary Parent Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Parent Node Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNode#getPrimaryParentNodeId()
	 * @see #getTestingNode()
	 * @generated
	 */
	EReference getTestingNode_PrimaryParentNodeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.TestingNodeMember <em>Testing Node Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Node Member</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNodeMember
	 * @generated
	 */
	EClass getTestingNodeMember();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.test.TestingNodeMember#getTestingNodeId <em>Testing Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testing Node Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNodeMember#getTestingNodeId()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EReference getTestingNodeMember_TestingNodeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.test.TestingNodeMember#getTestingId <em>Testing Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testing Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNodeMember#getTestingId()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EReference getTestingNodeMember_TestingId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingNodeMember#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNodeMember#getFromDate()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EAttribute getTestingNodeMember_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingNodeMember#getExtendFromDate <em>Extend From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extend From Date</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNodeMember#getExtendFromDate()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EAttribute getTestingNodeMember_ExtendFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingNodeMember#getExtendThruDate <em>Extend Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extend Thru Date</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNodeMember#getExtendThruDate()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EAttribute getTestingNodeMember_ExtendThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingNodeMember#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingNodeMember#getThruDate()
	 * @see #getTestingNodeMember()
	 * @generated
	 */
	EAttribute getTestingNodeMember_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.TestingRemoveAll <em>Testing Remove All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Remove All</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingRemoveAll
	 * @generated
	 */
	EClass getTestingRemoveAll();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingRemoveAll#getTestingRemoveAllId <em>Testing Remove All Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Remove All Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingRemoveAll#getTestingRemoveAllId()
	 * @see #getTestingRemoveAll()
	 * @generated
	 */
	EAttribute getTestingRemoveAll_TestingRemoveAllId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingRemoveAll#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingRemoveAll#getDescription()
	 * @see #getTestingRemoveAll()
	 * @generated
	 */
	EAttribute getTestingRemoveAll_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.TestingStatus <em>Testing Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Status</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingStatus
	 * @generated
	 */
	EClass getTestingStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingStatus#getTestingStatusId <em>Testing Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Status Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingStatus#getTestingStatusId()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EAttribute getTestingStatus_TestingStatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.test.TestingStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingStatus#getChangeByUserLoginId()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EReference getTestingStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingStatus#getStatusDate()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EAttribute getTestingStatus_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.test.TestingStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingStatus#getStatusId()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EReference getTestingStatus_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingStatus#getTestingId <em>Testing Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingStatus#getTestingId()
	 * @see #getTestingStatus()
	 * @generated
	 */
	EAttribute getTestingStatus_TestingId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.TestingSubtype <em>Testing Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Subtype</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingSubtype
	 * @generated
	 */
	EClass getTestingSubtype();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingSubtype#getTestingTypeId <em>Testing Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Type Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingSubtype#getTestingTypeId()
	 * @see #getTestingSubtype()
	 * @generated
	 */
	EAttribute getTestingSubtype_TestingTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingSubtype#getSubtypeDescription <em>Subtype Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype Description</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingSubtype#getSubtypeDescription()
	 * @see #getTestingSubtype()
	 * @generated
	 */
	EAttribute getTestingSubtype_SubtypeDescription();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.test.TestingType <em>Testing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Type</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingType
	 * @generated
	 */
	EClass getTestingType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingType#getTestingTypeId <em>Testing Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Type Id</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingType#getTestingTypeId()
	 * @see #getTestingType()
	 * @generated
	 */
	EAttribute getTestingType_TestingTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.test.TestingType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.entity.test.TestingType#getDescription()
	 * @see #getTestingType()
	 * @generated
	 */
	EAttribute getTestingType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl <em>Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestFieldTypeImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestFieldType()
		 * @generated
		 */
		EClass TEST_FIELD_TYPE = eINSTANCE.getTestFieldType();

		/**
		 * The meta object literal for the '<em><b>Test Field Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__TEST_FIELD_TYPE_ID = eINSTANCE.getTestFieldType_TestFieldTypeId();

		/**
		 * The meta object literal for the '<em><b>Blob Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__BLOB_FIELD = eINSTANCE.getTestFieldType_BlobField();

		/**
		 * The meta object literal for the '<em><b>Byte Array Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__BYTE_ARRAY_FIELD = eINSTANCE.getTestFieldType_ByteArrayField();

		/**
		 * The meta object literal for the '<em><b>Clob Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__CLOB_FIELD = eINSTANCE.getTestFieldType_ClobField();

		/**
		 * The meta object literal for the '<em><b>Date Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__DATE_FIELD = eINSTANCE.getTestFieldType_DateField();

		/**
		 * The meta object literal for the '<em><b>Date Time Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__DATE_TIME_FIELD = eINSTANCE.getTestFieldType_DateTimeField();

		/**
		 * The meta object literal for the '<em><b>Fixed Point Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__FIXED_POINT_FIELD = eINSTANCE.getTestFieldType_FixedPointField();

		/**
		 * The meta object literal for the '<em><b>Floating Point Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__FLOATING_POINT_FIELD = eINSTANCE.getTestFieldType_FloatingPointField();

		/**
		 * The meta object literal for the '<em><b>Numeric Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__NUMERIC_FIELD = eINSTANCE.getTestFieldType_NumericField();

		/**
		 * The meta object literal for the '<em><b>Object Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__OBJECT_FIELD = eINSTANCE.getTestFieldType_ObjectField();

		/**
		 * The meta object literal for the '<em><b>Time Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD_TYPE__TIME_FIELD = eINSTANCE.getTestFieldType_TimeField();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingImpl <em>Testing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestingImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTesting()
		 * @generated
		 */
		EClass TESTING = eINSTANCE.getTesting();

		/**
		 * The meta object literal for the '<em><b>Testing Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__TESTING_ID = eINSTANCE.getTesting_TestingId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__COMMENTS = eINSTANCE.getTesting_Comments();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__DESCRIPTION = eINSTANCE.getTesting_Description();

		/**
		 * The meta object literal for the '<em><b>Testing Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__TESTING_DATE = eINSTANCE.getTesting_TestingDate();

		/**
		 * The meta object literal for the '<em><b>Testing Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING__TESTING_ITEMS = eINSTANCE.getTesting_TestingItems();

		/**
		 * The meta object literal for the '<em><b>Testing Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__TESTING_NAME = eINSTANCE.getTesting_TestingName();

		/**
		 * The meta object literal for the '<em><b>Testing Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__TESTING_SIZE = eINSTANCE.getTesting_TestingSize();

		/**
		 * The meta object literal for the '<em><b>Testing Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING__TESTING_TYPE_ID = eINSTANCE.getTesting_TestingTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingCryptoImpl <em>Testing Crypto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestingCryptoImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingCrypto()
		 * @generated
		 */
		EClass TESTING_CRYPTO = eINSTANCE.getTestingCrypto();

		/**
		 * The meta object literal for the '<em><b>Testing Crypto Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__TESTING_CRYPTO_ID = eINSTANCE.getTestingCrypto_TestingCryptoId();

		/**
		 * The meta object literal for the '<em><b>Encrypted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__ENCRYPTED_VALUE = eINSTANCE.getTestingCrypto_EncryptedValue();

		/**
		 * The meta object literal for the '<em><b>Salted Encrypted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__SALTED_ENCRYPTED_VALUE = eINSTANCE.getTestingCrypto_SaltedEncryptedValue();

		/**
		 * The meta object literal for the '<em><b>Testing Crypto Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__TESTING_CRYPTO_TYPE_ID = eINSTANCE.getTestingCrypto_TestingCryptoTypeId();

		/**
		 * The meta object literal for the '<em><b>Unencrypted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CRYPTO__UNENCRYPTED_VALUE = eINSTANCE.getTestingCrypto_UnencryptedValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingItemImpl <em>Testing Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestingItemImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingItem()
		 * @generated
		 */
		EClass TESTING_ITEM = eINSTANCE.getTestingItem();

		/**
		 * The meta object literal for the '<em><b>Testing Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_ITEM__TESTING_ID = eINSTANCE.getTestingItem_TestingId();

		/**
		 * The meta object literal for the '<em><b>Testing Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_ITEM__TESTING_SEQ_ID = eINSTANCE.getTestingItem_TestingSeqId();

		/**
		 * The meta object literal for the '<em><b>Testing History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_ITEM__TESTING_HISTORY = eINSTANCE.getTestingItem_TestingHistory();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeImpl <em>Testing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestingNodeImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingNode()
		 * @generated
		 */
		EClass TESTING_NODE = eINSTANCE.getTestingNode();

		/**
		 * The meta object literal for the '<em><b>Testing Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE__TESTING_NODE_ID = eINSTANCE.getTestingNode_TestingNodeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE__DESCRIPTION = eINSTANCE.getTestingNode_Description();

		/**
		 * The meta object literal for the '<em><b>Primary Parent Node Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_NODE__PRIMARY_PARENT_NODE_ID = eINSTANCE.getTestingNode_PrimaryParentNodeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl <em>Testing Node Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestingNodeMemberImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingNodeMember()
		 * @generated
		 */
		EClass TESTING_NODE_MEMBER = eINSTANCE.getTestingNodeMember();

		/**
		 * The meta object literal for the '<em><b>Testing Node Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_NODE_MEMBER__TESTING_NODE_ID = eINSTANCE.getTestingNodeMember_TestingNodeId();

		/**
		 * The meta object literal for the '<em><b>Testing Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_NODE_MEMBER__TESTING_ID = eINSTANCE.getTestingNodeMember_TestingId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE_MEMBER__FROM_DATE = eINSTANCE.getTestingNodeMember_FromDate();

		/**
		 * The meta object literal for the '<em><b>Extend From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE_MEMBER__EXTEND_FROM_DATE = eINSTANCE.getTestingNodeMember_ExtendFromDate();

		/**
		 * The meta object literal for the '<em><b>Extend Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE_MEMBER__EXTEND_THRU_DATE = eINSTANCE.getTestingNodeMember_ExtendThruDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_NODE_MEMBER__THRU_DATE = eINSTANCE.getTestingNodeMember_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingRemoveAllImpl <em>Testing Remove All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestingRemoveAllImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingRemoveAll()
		 * @generated
		 */
		EClass TESTING_REMOVE_ALL = eINSTANCE.getTestingRemoveAll();

		/**
		 * The meta object literal for the '<em><b>Testing Remove All Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID = eINSTANCE.getTestingRemoveAll_TestingRemoveAllId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_REMOVE_ALL__DESCRIPTION = eINSTANCE.getTestingRemoveAll_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl <em>Testing Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestingStatusImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingStatus()
		 * @generated
		 */
		EClass TESTING_STATUS = eINSTANCE.getTestingStatus();

		/**
		 * The meta object literal for the '<em><b>Testing Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_STATUS__TESTING_STATUS_ID = eINSTANCE.getTestingStatus_TestingStatusId();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getTestingStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_STATUS__STATUS_DATE = eINSTANCE.getTestingStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_STATUS__STATUS_ID = eINSTANCE.getTestingStatus_StatusId();

		/**
		 * The meta object literal for the '<em><b>Testing Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_STATUS__TESTING_ID = eINSTANCE.getTestingStatus_TestingId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingSubtypeImpl <em>Testing Subtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestingSubtypeImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingSubtype()
		 * @generated
		 */
		EClass TESTING_SUBTYPE = eINSTANCE.getTestingSubtype();

		/**
		 * The meta object literal for the '<em><b>Testing Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_SUBTYPE__TESTING_TYPE_ID = eINSTANCE.getTestingSubtype_TestingTypeId();

		/**
		 * The meta object literal for the '<em><b>Subtype Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_SUBTYPE__SUBTYPE_DESCRIPTION = eINSTANCE.getTestingSubtype_SubtypeDescription();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.test.impl.TestingTypeImpl <em>Testing Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.test.impl.TestingTypeImpl
		 * @see org.abchip.mimo.biz.entity.test.impl.TestPackageImpl#getTestingType()
		 * @generated
		 */
		EClass TESTING_TYPE = eINSTANCE.getTestingType();

		/**
		 * The meta object literal for the '<em><b>Testing Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_TYPE__TESTING_TYPE_ID = eINSTANCE.getTestingType_TestingTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_TYPE__DESCRIPTION = eINSTANCE.getTestingType_Description();

	}

} //TestPackage
