/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.net.impl;

import org.abchip.mimo.net.*;

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
public class NetFactoryImpl extends EFactoryImpl implements NetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetFactory init() {
		try {
			NetFactory theNetFactory = (NetFactory)EPackage.Registry.INSTANCE.getEFactory(NetPackage.eNS_URI);
			if (theNetFactory != null) {
				return theNetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetFactoryImpl() {
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
			case NetPackage.CONNECTION_POOLING_CONFIG: return (EObject)createConnectionPoolingConfig();
			case NetPackage.HOST_CONFIG: return (EObject)createHostConfig();
			case NetPackage.HTTP_SERVICE_CONFIG: return (EObject)createHttpServiceConfig();
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
			case NetPackage.HTTP_POST:
				return createHttpPostFromString(eDataType, initialValue);
			case NetPackage.HTTP_RESPONSE_HANDLER:
				return createHttpResponseHandlerFromString(eDataType, initialValue);
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
			case NetPackage.HTTP_POST:
				return convertHttpPostToString(eDataType, instanceValue);
			case NetPackage.HTTP_RESPONSE_HANDLER:
				return convertHttpResponseHandlerToString(eDataType, instanceValue);
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
	@Override
	public NetPackage getNetPackage() {
		return (NetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NetPackage getPackage() {
		return NetPackage.eINSTANCE;
	}

} //NetFactoryImpl
