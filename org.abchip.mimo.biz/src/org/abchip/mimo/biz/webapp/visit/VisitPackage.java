/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit;

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
 * @see org.abchip.mimo.biz.webapp.visit.VisitFactory
 * @model kind="package"
 * @generated
 */
public interface VisitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/webapp/visit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-visit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisitPackage eINSTANCE = org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl <em>Browser Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getBrowserType()
	 * @generated
	 */
	int BROWSER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Browser Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_TYPE__BROWSER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Browser Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_TYPE__BROWSER_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Browser Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_TYPE__BROWSER_VERSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Browser Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSER_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl <em>Platform Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getPlatformType()
	 * @generated
	 */
	int PLATFORM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Platform Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__PLATFORM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__PLATFORM_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Platform Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE__PLATFORM_VERSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Platform Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.ProtocolTypeImpl <em>Protocol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.ProtocolTypeImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Protocol Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__PROTOCOL_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__PROTOCOL_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl <em>Server Hit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getServerHit()
	 * @generated
	 */
	int SERVER_HIT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Hit Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__HIT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__VISIT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hit Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__HIT_START_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id By Ip Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Internal Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__INTERNAL_CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Num Of Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__NUM_OF_BYTES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ref By Web Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Referrer Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__REFERRER_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Request Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__REQUEST_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Running Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__RUNNING_TIME_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Server Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__SERVER_HOST_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Server Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__SERVER_IP_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Server Hit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl <em>Server Hit Bin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getServerHitBin()
	 * @generated
	 */
	int SERVER_HIT_BIN = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Server Hit Bin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__SERVER_HIT_BIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bin End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__BIN_END_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bin Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__BIN_START_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hit Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__HIT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Internal Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__INTERNAL_CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__MAX_TIME_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__MIN_TIME_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Number Hits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__NUMBER_HITS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Server Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__SERVER_HOST_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Server Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__SERVER_IP_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Total Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN__TOTAL_TIME_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Server Hit Bin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_BIN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitTypeImpl <em>Server Hit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.ServerHitTypeImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getServerHitType()
	 * @generated
	 */
	int SERVER_HIT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Hit Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_TYPE__HIT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server Hit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_HIT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl <em>User Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getUserAgent()
	 * @generated
	 */
	int USER_AGENT = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>User Agent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__USER_AGENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Browser Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__BROWSER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Platform Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__PLATFORM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protocol Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__PROTOCOL_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Agent Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__USER_AGENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Agent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT__USER_AGENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>User Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentMethodTypeImpl <em>User Agent Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.UserAgentMethodTypeImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getUserAgentMethodType()
	 * @generated
	 */
	int USER_AGENT_METHOD_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_METHOD_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_METHOD_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_METHOD_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_METHOD_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>User Agent Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_METHOD_TYPE__USER_AGENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_METHOD_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Agent Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_METHOD_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentTypeImpl <em>User Agent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.UserAgentTypeImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getUserAgentType()
	 * @generated
	 */
	int USER_AGENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>User Agent Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_TYPE__USER_AGENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Agent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_AGENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl <em>Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getVisit()
	 * @generated
	 */
	int VISIT = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__VISIT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CLIENT_HOST_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CLIENT_IP_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Client Ip Country Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CLIENT_IP_COUNTRY_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client Ip Isp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CLIENT_IP_ISP_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Client Ip Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CLIENT_IP_POSTAL_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Client Ip State Prov Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CLIENT_IP_STATE_PROV_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Client User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CLIENT_USER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__COOKIE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Initial Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__INITIAL_LOCALE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Initial Referrer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__INITIAL_REFERRER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Initial Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__INITIAL_REQUEST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Initial User Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__INITIAL_USER_AGENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Server Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__SERVER_HOST_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Server Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__SERVER_IP_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__SESSION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>User Agent Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__USER_AGENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>User Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__USER_CREATED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Visitor Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__VISITOR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Webapp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT__WEBAPP_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.visit.impl.VisitorImpl <em>Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitorImpl
	 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getVisitor()
	 * @generated
	 */
	int VISITOR = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Visitor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__VISITOR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.BrowserType <em>Browser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browser Type</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.BrowserType
	 * @generated
	 */
	EClass getBrowserType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserTypeId <em>Browser Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Browser Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserTypeId()
	 * @see #getBrowserType()
	 * @generated
	 */
	EAttribute getBrowserType_BrowserTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserName <em>Browser Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Browser Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserName()
	 * @see #getBrowserType()
	 * @generated
	 */
	EAttribute getBrowserType_BrowserName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserVersion <em>Browser Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Browser Version</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserVersion()
	 * @see #getBrowserType()
	 * @generated
	 */
	EAttribute getBrowserType_BrowserVersion();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.PlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Type</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.PlatformType
	 * @generated
	 */
	EClass getPlatformType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformTypeId <em>Platform Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformTypeId()
	 * @see #getPlatformType()
	 * @generated
	 */
	EAttribute getPlatformType_PlatformTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformName <em>Platform Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformName()
	 * @see #getPlatformType()
	 * @generated
	 */
	EAttribute getPlatformType_PlatformName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformVersion <em>Platform Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Version</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformVersion()
	 * @see #getPlatformType()
	 * @generated
	 */
	EAttribute getPlatformType_PlatformVersion();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Type</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ProtocolType
	 * @generated
	 */
	EClass getProtocolType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ProtocolType#getProtocolTypeId <em>Protocol Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ProtocolType#getProtocolTypeId()
	 * @see #getProtocolType()
	 * @generated
	 */
	EAttribute getProtocolType_ProtocolTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ProtocolType#getProtocolName <em>Protocol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ProtocolType#getProtocolName()
	 * @see #getProtocolType()
	 * @generated
	 */
	EAttribute getProtocolType_ProtocolName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.ServerHit <em>Server Hit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Hit</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit
	 * @generated
	 */
	EClass getServerHit();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getVisitId()
	 * @see #getServerHit()
	 * @generated
	 */
	EReference getServerHit_VisitId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getContentId()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_ContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getHitStartDateTime <em>Hit Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hit Start Date Time</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getHitStartDateTime()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_HitStartDateTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getHitTypeId <em>Hit Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hit Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getHitTypeId()
	 * @see #getServerHit()
	 * @generated
	 */
	EReference getServerHit_HitTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getIdByIpContactMechId <em>Id By Ip Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id By Ip Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getIdByIpContactMechId()
	 * @see #getServerHit()
	 * @generated
	 */
	EReference getServerHit_IdByIpContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getInternalContentId <em>Internal Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Content Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getInternalContentId()
	 * @see #getServerHit()
	 * @generated
	 */
	EReference getServerHit_InternalContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getNumOfBytes <em>Num Of Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Bytes</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getNumOfBytes()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_NumOfBytes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getPartyId()
	 * @see #getServerHit()
	 * @generated
	 */
	EReference getServerHit_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getRefByWebContactMechId <em>Ref By Web Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref By Web Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getRefByWebContactMechId()
	 * @see #getServerHit()
	 * @generated
	 */
	EReference getServerHit_RefByWebContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getReferrerUrl <em>Referrer Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referrer Url</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getReferrerUrl()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_ReferrerUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getRequestUrl <em>Request Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Url</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getRequestUrl()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_RequestUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getRunningTimeMillis <em>Running Time Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Time Millis</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getRunningTimeMillis()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_RunningTimeMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getServerHostName <em>Server Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Host Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getServerHostName()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_ServerHostName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getServerIpAddress <em>Server Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Ip Address</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getServerIpAddress()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_ServerIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getStatusId()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHit#getUserLoginId()
	 * @see #getServerHit()
	 * @generated
	 */
	EAttribute getServerHit_UserLoginId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin <em>Server Hit Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Hit Bin</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin
	 * @generated
	 */
	EClass getServerHitBin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerHitBinId <em>Server Hit Bin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Hit Bin Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerHitBinId()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_ServerHitBinId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getBinEndDateTime <em>Bin End Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bin End Date Time</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getBinEndDateTime()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_BinEndDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getBinStartDateTime <em>Bin Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bin Start Date Time</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getBinStartDateTime()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_BinStartDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getContentId()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getHitTypeId <em>Hit Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hit Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getHitTypeId()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EReference getServerHitBin_HitTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getInternalContentId <em>Internal Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Content Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getInternalContentId()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EReference getServerHitBin_InternalContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getMaxTimeMillis <em>Max Time Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Time Millis</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getMaxTimeMillis()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_MaxTimeMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getMinTimeMillis <em>Min Time Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Time Millis</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getMinTimeMillis()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_MinTimeMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getNumberHits <em>Number Hits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Hits</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getNumberHits()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_NumberHits();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerHostName <em>Server Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Host Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerHostName()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_ServerHostName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerIpAddress <em>Server Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Ip Address</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getServerIpAddress()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_ServerIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitBin#getTotalTimeMillis <em>Total Time Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Time Millis</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitBin#getTotalTimeMillis()
	 * @see #getServerHitBin()
	 * @generated
	 */
	EAttribute getServerHitBin_TotalTimeMillis();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.ServerHitType <em>Server Hit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Hit Type</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitType
	 * @generated
	 */
	EClass getServerHitType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitType#getHitTypeId <em>Hit Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hit Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitType#getHitTypeId()
	 * @see #getServerHitType()
	 * @generated
	 */
	EAttribute getServerHitType_HitTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.ServerHitType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.ServerHitType#getDescription()
	 * @see #getServerHitType()
	 * @generated
	 */
	EAttribute getServerHitType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.UserAgent <em>User Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Agent</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgent
	 * @generated
	 */
	EClass getUserAgent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentId <em>User Agent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Agent Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentId()
	 * @see #getUserAgent()
	 * @generated
	 */
	EAttribute getUserAgent_UserAgentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getBrowserTypeId <em>Browser Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Browser Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgent#getBrowserTypeId()
	 * @see #getUserAgent()
	 * @generated
	 */
	EReference getUserAgent_BrowserTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getPlatformTypeId <em>Platform Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Platform Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgent#getPlatformTypeId()
	 * @see #getUserAgent()
	 * @generated
	 */
	EReference getUserAgent_PlatformTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getProtocolTypeId <em>Protocol Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgent#getProtocolTypeId()
	 * @see #getUserAgent()
	 * @generated
	 */
	EReference getUserAgent_ProtocolTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Agent Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentMethodTypeId()
	 * @see #getUserAgent()
	 * @generated
	 */
	EReference getUserAgent_UserAgentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentTypeId <em>User Agent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Agent Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentTypeId()
	 * @see #getUserAgent()
	 * @generated
	 */
	EReference getUserAgent_UserAgentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.UserAgentMethodType <em>User Agent Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Agent Method Type</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgentMethodType
	 * @generated
	 */
	EClass getUserAgentMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.UserAgentMethodType#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Agent Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgentMethodType#getUserAgentMethodTypeId()
	 * @see #getUserAgentMethodType()
	 * @generated
	 */
	EAttribute getUserAgentMethodType_UserAgentMethodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.UserAgentMethodType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgentMethodType#getDescription()
	 * @see #getUserAgentMethodType()
	 * @generated
	 */
	EAttribute getUserAgentMethodType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.UserAgentType <em>User Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Agent Type</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgentType
	 * @generated
	 */
	EClass getUserAgentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.UserAgentType#getUserAgentTypeId <em>User Agent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Agent Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgentType#getUserAgentTypeId()
	 * @see #getUserAgentType()
	 * @generated
	 */
	EAttribute getUserAgentType_UserAgentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.UserAgentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.UserAgentType#getDescription()
	 * @see #getUserAgentType()
	 * @generated
	 */
	EAttribute getUserAgentType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.Visit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visit</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit
	 * @generated
	 */
	EClass getVisit();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getVisitId()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_VisitId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientHostName <em>Client Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Host Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getClientHostName()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ClientHostName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpAddress <em>Client Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Ip Address</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getClientIpAddress()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ClientIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpCountryGeoId <em>Client Ip Country Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Ip Country Geo Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getClientIpCountryGeoId()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ClientIpCountryGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpIspName <em>Client Ip Isp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Ip Isp Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getClientIpIspName()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ClientIpIspName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpPostalCode <em>Client Ip Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Ip Postal Code</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getClientIpPostalCode()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ClientIpPostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpStateProvGeoId <em>Client Ip State Prov Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Ip State Prov Geo Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getClientIpStateProvGeoId()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ClientIpStateProvGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientUser <em>Client User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client User</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getClientUser()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ClientUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getContactMechId()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getCookie <em>Cookie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookie</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getCookie()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_Cookie();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getFromDate()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialLocale <em>Initial Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Locale</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getInitialLocale()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_InitialLocale();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialReferrer <em>Initial Referrer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Referrer</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getInitialReferrer()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_InitialReferrer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialRequest <em>Initial Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Request</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getInitialRequest()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_InitialRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialUserAgent <em>Initial User Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial User Agent</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getInitialUserAgent()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_InitialUserAgent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getPartyId()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getRoleTypeId()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getServerHostName <em>Server Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Host Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getServerHostName()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ServerHostName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getServerIpAddress <em>Server Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Ip Address</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getServerIpAddress()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ServerIpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getSessionId <em>Session Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getSessionId()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_SessionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getThruDate()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_ThruDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.Visit#getUserAgentId <em>User Agent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Agent Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getUserAgentId()
	 * @see #getVisit()
	 * @generated
	 */
	EReference getVisit_UserAgentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#isUserCreated <em>User Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Created</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#isUserCreated()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_UserCreated();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getUserLoginId()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_UserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.Visit#getVisitorId <em>Visitor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visitor Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getVisitorId()
	 * @see #getVisit()
	 * @generated
	 */
	EReference getVisit_VisitorId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visit#getWebappName <em>Webapp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webapp Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visit#getWebappName()
	 * @see #getVisit()
	 * @generated
	 */
	EAttribute getVisit_WebappName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.visit.Visitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitor</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visitor
	 * @generated
	 */
	EClass getVisitor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visitor#getVisitorId <em>Visitor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visitor Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visitor#getVisitorId()
	 * @see #getVisitor()
	 * @generated
	 */
	EAttribute getVisitor_VisitorId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.visit.Visitor#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visitor#getPartyId()
	 * @see #getVisitor()
	 * @generated
	 */
	EAttribute getVisitor_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.visit.Visitor#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.visit.Visitor#getUserLoginId()
	 * @see #getVisitor()
	 * @generated
	 */
	EReference getVisitor_UserLoginId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisitFactory getVisitFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl <em>Browser Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getBrowserType()
		 * @generated
		 */
		EClass BROWSER_TYPE = eINSTANCE.getBrowserType();

		/**
		 * The meta object literal for the '<em><b>Browser Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSER_TYPE__BROWSER_TYPE_ID = eINSTANCE.getBrowserType_BrowserTypeId();

		/**
		 * The meta object literal for the '<em><b>Browser Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSER_TYPE__BROWSER_NAME = eINSTANCE.getBrowserType_BrowserName();

		/**
		 * The meta object literal for the '<em><b>Browser Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSER_TYPE__BROWSER_VERSION = eINSTANCE.getBrowserType_BrowserVersion();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl <em>Platform Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getPlatformType()
		 * @generated
		 */
		EClass PLATFORM_TYPE = eINSTANCE.getPlatformType();

		/**
		 * The meta object literal for the '<em><b>Platform Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_TYPE__PLATFORM_TYPE_ID = eINSTANCE.getPlatformType_PlatformTypeId();

		/**
		 * The meta object literal for the '<em><b>Platform Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_TYPE__PLATFORM_NAME = eINSTANCE.getPlatformType_PlatformName();

		/**
		 * The meta object literal for the '<em><b>Platform Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_TYPE__PLATFORM_VERSION = eINSTANCE.getPlatformType_PlatformVersion();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.ProtocolTypeImpl <em>Protocol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.ProtocolTypeImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getProtocolType()
		 * @generated
		 */
		EClass PROTOCOL_TYPE = eINSTANCE.getProtocolType();

		/**
		 * The meta object literal for the '<em><b>Protocol Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_TYPE__PROTOCOL_TYPE_ID = eINSTANCE.getProtocolType_ProtocolTypeId();

		/**
		 * The meta object literal for the '<em><b>Protocol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_TYPE__PROTOCOL_NAME = eINSTANCE.getProtocolType_ProtocolName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl <em>Server Hit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getServerHit()
		 * @generated
		 */
		EClass SERVER_HIT = eINSTANCE.getServerHit();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_HIT__VISIT_ID = eINSTANCE.getServerHit_VisitId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__CONTENT_ID = eINSTANCE.getServerHit_ContentId();

		/**
		 * The meta object literal for the '<em><b>Hit Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__HIT_START_DATE_TIME = eINSTANCE.getServerHit_HitStartDateTime();

		/**
		 * The meta object literal for the '<em><b>Hit Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_HIT__HIT_TYPE_ID = eINSTANCE.getServerHit_HitTypeId();

		/**
		 * The meta object literal for the '<em><b>Id By Ip Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID = eINSTANCE.getServerHit_IdByIpContactMechId();

		/**
		 * The meta object literal for the '<em><b>Internal Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_HIT__INTERNAL_CONTENT_ID = eINSTANCE.getServerHit_InternalContentId();

		/**
		 * The meta object literal for the '<em><b>Num Of Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__NUM_OF_BYTES = eINSTANCE.getServerHit_NumOfBytes();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_HIT__PARTY_ID = eINSTANCE.getServerHit_PartyId();

		/**
		 * The meta object literal for the '<em><b>Ref By Web Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID = eINSTANCE.getServerHit_RefByWebContactMechId();

		/**
		 * The meta object literal for the '<em><b>Referrer Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__REFERRER_URL = eINSTANCE.getServerHit_ReferrerUrl();

		/**
		 * The meta object literal for the '<em><b>Request Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__REQUEST_URL = eINSTANCE.getServerHit_RequestUrl();

		/**
		 * The meta object literal for the '<em><b>Running Time Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__RUNNING_TIME_MILLIS = eINSTANCE.getServerHit_RunningTimeMillis();

		/**
		 * The meta object literal for the '<em><b>Server Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__SERVER_HOST_NAME = eINSTANCE.getServerHit_ServerHostName();

		/**
		 * The meta object literal for the '<em><b>Server Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__SERVER_IP_ADDRESS = eINSTANCE.getServerHit_ServerIpAddress();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__STATUS_ID = eINSTANCE.getServerHit_StatusId();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT__USER_LOGIN_ID = eINSTANCE.getServerHit_UserLoginId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl <em>Server Hit Bin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getServerHitBin()
		 * @generated
		 */
		EClass SERVER_HIT_BIN = eINSTANCE.getServerHitBin();

		/**
		 * The meta object literal for the '<em><b>Server Hit Bin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__SERVER_HIT_BIN_ID = eINSTANCE.getServerHitBin_ServerHitBinId();

		/**
		 * The meta object literal for the '<em><b>Bin End Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__BIN_END_DATE_TIME = eINSTANCE.getServerHitBin_BinEndDateTime();

		/**
		 * The meta object literal for the '<em><b>Bin Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__BIN_START_DATE_TIME = eINSTANCE.getServerHitBin_BinStartDateTime();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__CONTENT_ID = eINSTANCE.getServerHitBin_ContentId();

		/**
		 * The meta object literal for the '<em><b>Hit Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_HIT_BIN__HIT_TYPE_ID = eINSTANCE.getServerHitBin_HitTypeId();

		/**
		 * The meta object literal for the '<em><b>Internal Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_HIT_BIN__INTERNAL_CONTENT_ID = eINSTANCE.getServerHitBin_InternalContentId();

		/**
		 * The meta object literal for the '<em><b>Max Time Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__MAX_TIME_MILLIS = eINSTANCE.getServerHitBin_MaxTimeMillis();

		/**
		 * The meta object literal for the '<em><b>Min Time Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__MIN_TIME_MILLIS = eINSTANCE.getServerHitBin_MinTimeMillis();

		/**
		 * The meta object literal for the '<em><b>Number Hits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__NUMBER_HITS = eINSTANCE.getServerHitBin_NumberHits();

		/**
		 * The meta object literal for the '<em><b>Server Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__SERVER_HOST_NAME = eINSTANCE.getServerHitBin_ServerHostName();

		/**
		 * The meta object literal for the '<em><b>Server Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__SERVER_IP_ADDRESS = eINSTANCE.getServerHitBin_ServerIpAddress();

		/**
		 * The meta object literal for the '<em><b>Total Time Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_BIN__TOTAL_TIME_MILLIS = eINSTANCE.getServerHitBin_TotalTimeMillis();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitTypeImpl <em>Server Hit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.ServerHitTypeImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getServerHitType()
		 * @generated
		 */
		EClass SERVER_HIT_TYPE = eINSTANCE.getServerHitType();

		/**
		 * The meta object literal for the '<em><b>Hit Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_TYPE__HIT_TYPE_ID = eINSTANCE.getServerHitType_HitTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_HIT_TYPE__DESCRIPTION = eINSTANCE.getServerHitType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl <em>User Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getUserAgent()
		 * @generated
		 */
		EClass USER_AGENT = eINSTANCE.getUserAgent();

		/**
		 * The meta object literal for the '<em><b>User Agent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_AGENT__USER_AGENT_ID = eINSTANCE.getUserAgent_UserAgentId();

		/**
		 * The meta object literal for the '<em><b>Browser Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_AGENT__BROWSER_TYPE_ID = eINSTANCE.getUserAgent_BrowserTypeId();

		/**
		 * The meta object literal for the '<em><b>Platform Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_AGENT__PLATFORM_TYPE_ID = eINSTANCE.getUserAgent_PlatformTypeId();

		/**
		 * The meta object literal for the '<em><b>Protocol Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_AGENT__PROTOCOL_TYPE_ID = eINSTANCE.getUserAgent_ProtocolTypeId();

		/**
		 * The meta object literal for the '<em><b>User Agent Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_AGENT__USER_AGENT_METHOD_TYPE_ID = eINSTANCE.getUserAgent_UserAgentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>User Agent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_AGENT__USER_AGENT_TYPE_ID = eINSTANCE.getUserAgent_UserAgentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentMethodTypeImpl <em>User Agent Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.UserAgentMethodTypeImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getUserAgentMethodType()
		 * @generated
		 */
		EClass USER_AGENT_METHOD_TYPE = eINSTANCE.getUserAgentMethodType();

		/**
		 * The meta object literal for the '<em><b>User Agent Method Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_AGENT_METHOD_TYPE__USER_AGENT_METHOD_TYPE_ID = eINSTANCE.getUserAgentMethodType_UserAgentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_AGENT_METHOD_TYPE__DESCRIPTION = eINSTANCE.getUserAgentMethodType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentTypeImpl <em>User Agent Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.UserAgentTypeImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getUserAgentType()
		 * @generated
		 */
		EClass USER_AGENT_TYPE = eINSTANCE.getUserAgentType();

		/**
		 * The meta object literal for the '<em><b>User Agent Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_AGENT_TYPE__USER_AGENT_TYPE_ID = eINSTANCE.getUserAgentType_UserAgentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_AGENT_TYPE__DESCRIPTION = eINSTANCE.getUserAgentType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl <em>Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getVisit()
		 * @generated
		 */
		EClass VISIT = eINSTANCE.getVisit();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__VISIT_ID = eINSTANCE.getVisit_VisitId();

		/**
		 * The meta object literal for the '<em><b>Client Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__CLIENT_HOST_NAME = eINSTANCE.getVisit_ClientHostName();

		/**
		 * The meta object literal for the '<em><b>Client Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__CLIENT_IP_ADDRESS = eINSTANCE.getVisit_ClientIpAddress();

		/**
		 * The meta object literal for the '<em><b>Client Ip Country Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__CLIENT_IP_COUNTRY_GEO_ID = eINSTANCE.getVisit_ClientIpCountryGeoId();

		/**
		 * The meta object literal for the '<em><b>Client Ip Isp Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__CLIENT_IP_ISP_NAME = eINSTANCE.getVisit_ClientIpIspName();

		/**
		 * The meta object literal for the '<em><b>Client Ip Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__CLIENT_IP_POSTAL_CODE = eINSTANCE.getVisit_ClientIpPostalCode();

		/**
		 * The meta object literal for the '<em><b>Client Ip State Prov Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__CLIENT_IP_STATE_PROV_GEO_ID = eINSTANCE.getVisit_ClientIpStateProvGeoId();

		/**
		 * The meta object literal for the '<em><b>Client User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__CLIENT_USER = eINSTANCE.getVisit_ClientUser();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__CONTACT_MECH_ID = eINSTANCE.getVisit_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Cookie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__COOKIE = eINSTANCE.getVisit_Cookie();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__FROM_DATE = eINSTANCE.getVisit_FromDate();

		/**
		 * The meta object literal for the '<em><b>Initial Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__INITIAL_LOCALE = eINSTANCE.getVisit_InitialLocale();

		/**
		 * The meta object literal for the '<em><b>Initial Referrer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__INITIAL_REFERRER = eINSTANCE.getVisit_InitialReferrer();

		/**
		 * The meta object literal for the '<em><b>Initial Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__INITIAL_REQUEST = eINSTANCE.getVisit_InitialRequest();

		/**
		 * The meta object literal for the '<em><b>Initial User Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__INITIAL_USER_AGENT = eINSTANCE.getVisit_InitialUserAgent();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__PARTY_ID = eINSTANCE.getVisit_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__ROLE_TYPE_ID = eINSTANCE.getVisit_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Server Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__SERVER_HOST_NAME = eINSTANCE.getVisit_ServerHostName();

		/**
		 * The meta object literal for the '<em><b>Server Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__SERVER_IP_ADDRESS = eINSTANCE.getVisit_ServerIpAddress();

		/**
		 * The meta object literal for the '<em><b>Session Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__SESSION_ID = eINSTANCE.getVisit_SessionId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__THRU_DATE = eINSTANCE.getVisit_ThruDate();

		/**
		 * The meta object literal for the '<em><b>User Agent Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIT__USER_AGENT_ID = eINSTANCE.getVisit_UserAgentId();

		/**
		 * The meta object literal for the '<em><b>User Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__USER_CREATED = eINSTANCE.getVisit_UserCreated();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__USER_LOGIN_ID = eINSTANCE.getVisit_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>Visitor Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIT__VISITOR_ID = eINSTANCE.getVisit_VisitorId();

		/**
		 * The meta object literal for the '<em><b>Webapp Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIT__WEBAPP_NAME = eINSTANCE.getVisit_WebappName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.visit.impl.VisitorImpl <em>Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitorImpl
		 * @see org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl#getVisitor()
		 * @generated
		 */
		EClass VISITOR = eINSTANCE.getVisitor();

		/**
		 * The meta object literal for the '<em><b>Visitor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISITOR__VISITOR_ID = eINSTANCE.getVisitor_VisitorId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISITOR__PARTY_ID = eINSTANCE.getVisitor_PartyId();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISITOR__USER_LOGIN_ID = eINSTANCE.getVisitor_UserLoginId();

	}

} //VisitPackage
