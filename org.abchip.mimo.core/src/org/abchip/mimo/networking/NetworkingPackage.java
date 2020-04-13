/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.networking;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.abchip.mimo.networking.NetworkingFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "networking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/networking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-net";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkingPackage eINSTANCE = org.abchip.mimo.networking.impl.NetworkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.networking.impl.ConnectionPoolingConfigImpl <em>Connection Pooling Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.networking.impl.ConnectionPoolingConfigImpl
	 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getConnectionPoolingConfig()
	 * @generated
	 */
	int CONNECTION_POOLING_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Max Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POOLING_CONFIG__MAX_TOTAL = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Per Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POOLING_CONFIG__MAX_PER_ROUTE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection Pooling Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POOLING_CONFIG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.networking.impl.HostConfigImpl <em>Host Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.networking.impl.HostConfigImpl
	 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHostConfig()
	 * @generated
	 */
	int HOST_CONFIG = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.networking.impl.HttpServiceConfigImpl <em>Http Service Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.networking.impl.HttpServiceConfigImpl
	 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHttpServiceConfig()
	 * @generated
	 */
	int HTTP_SERVICE_CONFIG = 3;

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.networking.ConnectionPoolingConfig <em>Connection Pooling Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Pooling Config</em>'.
	 * @see org.abchip.mimo.networking.ConnectionPoolingConfig
	 * @generated
	 */
	EClass getConnectionPoolingConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.networking.ConnectionPoolingConfig#getMaxTotal <em>Max Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Total</em>'.
	 * @see org.abchip.mimo.networking.ConnectionPoolingConfig#getMaxTotal()
	 * @see #getConnectionPoolingConfig()
	 * @generated
	 */
	EAttribute getConnectionPoolingConfig_MaxTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.networking.ConnectionPoolingConfig#getMaxPerRoute <em>Max Per Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Per Route</em>'.
	 * @see org.abchip.mimo.networking.ConnectionPoolingConfig#getMaxPerRoute()
	 * @see #getConnectionPoolingConfig()
	 * @generated
	 */
	EAttribute getConnectionPoolingConfig_MaxPerRoute();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.networking.HostConfig <em>Host Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Config</em>'.
	 * @see org.abchip.mimo.networking.HostConfig
	 * @generated
	 */
	EClass getHostConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.networking.HostConfig#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.abchip.mimo.networking.HostConfig#getAddress()
	 * @see #getHostConfig()
	 * @generated
	 */
	EAttribute getHostConfig_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.networking.HostConfig#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.abchip.mimo.networking.HostConfig#getPort()
	 * @see #getHostConfig()
	 * @generated
	 */
	EAttribute getHostConfig_Port();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.networking.HttpClient <em>Http Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.networking.HttpClient
	 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHttpClient()
	 * @generated
	 */
	int HTTP_CLIENT = 1;

	/**
	 * The number of structural features of the '<em>Http Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CLIENT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONFIG__ADDRESS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONFIG__PORT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Host Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_CONFIG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_SERVICE_CONFIG__HOST = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_SERVICE_CONFIG__PATH = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Http Service Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_SERVICE_CONFIG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '<em>Http Post</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.http.client.methods.HttpPost
	 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHttpPost()
	 * @generated
	 */
	int HTTP_POST = 4;

	/**
	 * The meta object id for the '<em>Http Response Handler</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.http.client.ResponseHandler
	 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHttpResponseHandler()
	 * @generated
	 */
	int HTTP_RESPONSE_HANDLER = 5;

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.networking.HttpServiceConfig <em>Http Service Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Service Config</em>'.
	 * @see org.abchip.mimo.networking.HttpServiceConfig
	 * @generated
	 */
	EClass getHttpServiceConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.networking.HttpServiceConfig#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Host</em>'.
	 * @see org.abchip.mimo.networking.HttpServiceConfig#getHost()
	 * @see #getHttpServiceConfig()
	 * @generated
	 */
	EReference getHttpServiceConfig_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.networking.HttpServiceConfig#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.abchip.mimo.networking.HttpServiceConfig#getPath()
	 * @see #getHttpServiceConfig()
	 * @generated
	 */
	EAttribute getHttpServiceConfig_Path();

	/**
	 * Returns the meta object for data type '{@link org.apache.http.client.methods.HttpPost <em>Http Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Http Post</em>'.
	 * @see org.apache.http.client.methods.HttpPost
	 * @model instanceClass="org.apache.http.client.methods.HttpPost"
	 * @generated
	 */
	EDataType getHttpPost();

	/**
	 * Returns the meta object for data type '{@link org.apache.http.client.ResponseHandler <em>Http Response Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Http Response Handler</em>'.
	 * @see org.apache.http.client.ResponseHandler
	 * @model instanceClass="org.apache.http.client.ResponseHandler" typeParameters="T"
	 * @generated
	 */
	EDataType getHttpResponseHandler();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkingFactory getNetworkingFactory();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.networking.HttpClient <em>Http Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Client</em>'.
	 * @see org.abchip.mimo.networking.HttpClient
	 * @generated
	 */
	EClass getHttpClient();

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
		 * The meta object literal for the '{@link org.abchip.mimo.networking.impl.ConnectionPoolingConfigImpl <em>Connection Pooling Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.networking.impl.ConnectionPoolingConfigImpl
		 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getConnectionPoolingConfig()
		 * @generated
		 */
		EClass CONNECTION_POOLING_CONFIG = eINSTANCE.getConnectionPoolingConfig();
		/**
		 * The meta object literal for the '<em><b>Max Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POOLING_CONFIG__MAX_TOTAL = eINSTANCE.getConnectionPoolingConfig_MaxTotal();
		/**
		 * The meta object literal for the '<em><b>Max Per Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POOLING_CONFIG__MAX_PER_ROUTE = eINSTANCE.getConnectionPoolingConfig_MaxPerRoute();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.networking.impl.HostConfigImpl <em>Host Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.networking.impl.HostConfigImpl
		 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHostConfig()
		 * @generated
		 */
		EClass HOST_CONFIG = eINSTANCE.getHostConfig();
		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_CONFIG__ADDRESS = eINSTANCE.getHostConfig_Address();
		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST_CONFIG__PORT = eINSTANCE.getHostConfig_Port();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.networking.impl.HttpServiceConfigImpl <em>Http Service Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.networking.impl.HttpServiceConfigImpl
		 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHttpServiceConfig()
		 * @generated
		 */
		EClass HTTP_SERVICE_CONFIG = eINSTANCE.getHttpServiceConfig();
		/**
		 * The meta object literal for the '<em><b>Host</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_SERVICE_CONFIG__HOST = eINSTANCE.getHttpServiceConfig_Host();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_SERVICE_CONFIG__PATH = eINSTANCE.getHttpServiceConfig_Path();
		/**
		 * The meta object literal for the '<em>Http Post</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.http.client.methods.HttpPost
		 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHttpPost()
		 * @generated
		 */
		EDataType HTTP_POST = eINSTANCE.getHttpPost();
		/**
		 * The meta object literal for the '<em>Http Response Handler</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.http.client.ResponseHandler
		 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHttpResponseHandler()
		 * @generated
		 */
		EDataType HTTP_RESPONSE_HANDLER = eINSTANCE.getHttpResponseHandler();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.networking.HttpClient <em>Http Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.networking.HttpClient
		 * @see org.abchip.mimo.networking.impl.NetworkingPackageImpl#getHttpClient()
		 * @generated
		 */
		EClass HTTP_CLIENT = eINSTANCE.getHttpClient();

	}

} //NetworkingPackage
