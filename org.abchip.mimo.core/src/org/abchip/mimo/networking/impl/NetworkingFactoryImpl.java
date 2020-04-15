/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.networking.impl;

import org.abchip.mimo.networking.*;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkingFactoryImpl extends EFactoryImpl implements NetworkingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkingFactory init() {
		try {
			NetworkingFactory theNetworkingFactory = (NetworkingFactory)EPackage.Registry.INSTANCE.getEFactory(NetworkingPackage.eNS_URI);
			if (theNetworkingFactory != null) {
				return theNetworkingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetworkingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NetworkingPackage.CONNECTION_POOLING_CONFIG: return (EObject)createConnectionPoolingConfig();
			case NetworkingPackage.CONNECTION_POOLING_ROUTE_CONFIG: return (EObject)createConnectionPoolingRouteConfig();
			case NetworkingPackage.HOST_CONFIG: return (EObject)createHostConfig();
			case NetworkingPackage.HTTP_SERVICE_CONFIG: return (EObject)createHttpServiceConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NetworkingPackage.HTTP_POST:
				return createHttpPostFromString(eDataType, initialValue);
			case NetworkingPackage.HTTP_RESPONSE_HANDLER:
				return createHttpResponseHandlerFromString(eDataType, initialValue);
			case NetworkingPackage.NETWORKING_EXCEPTION:
				return createNetworkingExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NetworkingPackage.HTTP_POST:
				return convertHttpPostToString(eDataType, instanceValue);
			case NetworkingPackage.HTTP_RESPONSE_HANDLER:
				return convertHttpResponseHandlerToString(eDataType, instanceValue);
			case NetworkingPackage.NETWORKING_EXCEPTION:
				return convertNetworkingExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionPoolingConfig createConnectionPoolingConfig() {
		ConnectionPoolingConfigImpl connectionPoolingConfig = new ConnectionPoolingConfigImpl();
		return connectionPoolingConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionPoolingRouteConfig createConnectionPoolingRouteConfig() {
		ConnectionPoolingRouteConfigImpl connectionPoolingRouteConfig = new ConnectionPoolingRouteConfigImpl();
		return connectionPoolingRouteConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostConfig createHostConfig() {
		HostConfigImpl hostConfig = new HostConfigImpl();
		return hostConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HttpServiceConfig createHttpServiceConfig() {
		HttpServiceConfigImpl httpServiceConfig = new HttpServiceConfigImpl();
		return httpServiceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpPost createHttpPostFromString(EDataType eDataType, String initialValue) {
		return (HttpPost)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpPostToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHandler<?> createHttpResponseHandlerFromString(EDataType eDataType, String initialValue) {
		return (ResponseHandler<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpResponseHandlerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkingException createNetworkingExceptionFromString(EDataType eDataType, String initialValue) {
		return (NetworkingException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkingExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkingPackage getNetworkingPackage() {
		return (NetworkingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NetworkingPackage getPackage() {
		return NetworkingPackage.eINSTANCE;
	}

} //NetworkingFactoryImpl
