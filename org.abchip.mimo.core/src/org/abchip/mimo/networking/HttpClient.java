/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.networking;

import java.io.Closeable;

import org.abchip.mimo.application.ServiceScope;
import org.abchip.mimo.application.ServiceScope.Scope;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Http
 * Client</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.networking.NetworkingPackage#getHttpClient()
 * @model interface="true" abstract="true" superTypes="org.abchip.mimo.java.JavaCloseable"
 * @generated
 */
@ServiceScope(Scope.CONTEXT)
public interface HttpClient extends Closeable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.networking.NetworkingException" methodDataType="org.abchip.mimo.networking.HttpPost" methodRequired="true" handlerDataType="org.abchip.mimo.networking.HttpResponseHandler&lt;T&gt;" handlerRequired="true"
	 * @generated
	 */
	<T> T execute(HttpPost method, ResponseHandler<T> handler) throws NetworkingException;
} // HttpClient
