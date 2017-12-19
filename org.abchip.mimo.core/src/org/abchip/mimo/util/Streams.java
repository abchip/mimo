/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.util;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streams</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.util.UtilPackage#getStreams()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Streams {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inputDataType="org.abchip.mimo.util.JavaInputStream" inputRequired="true" outputDataType="org.abchip.mimo.util.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void copy(InputStream input, OutputStream output);

} // Streams
