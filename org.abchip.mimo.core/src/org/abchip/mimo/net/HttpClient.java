/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.net;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Client</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.net.NetPackage#getHttpClient()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HttpClient {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.java.JavaException" methodDataType="org.abchip.mimo.net.HttpPost" methodRequired="true" handlerDataType="org.abchip.mimo.net.HttpResponseHandler&lt;T&gt;" handlerRequired="true"
	 * @generated
	 */
	<T> T execute(HttpPost method, ResponseHandler<T> handler) throws Exception;
} // HttpClient
