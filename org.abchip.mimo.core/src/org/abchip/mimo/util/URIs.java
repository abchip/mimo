/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.net.URI;
import java.util.Map;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>UR
 * Is</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.util.UtilPackage#getURIs()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface URIs extends Singleton<URIs> {

	URIs qINSTANCE = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" uriDataType="org.abchip.mimo.java.JavaURI" uriRequired="true"
	 * @generated
	 */
	String getBaseName(URI uri);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" queryRequired="true"
	 * @generated
	 */
	Map<String, String> parseParameter(String query);

} // URIs
