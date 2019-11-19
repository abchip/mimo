/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Files</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.util.UtilPackage#getFiles()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Files {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" fileNameRequired="true"
	 * @generated
	 */
	String getBaseName(String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.java.JavaIOException" pathRequired="true"
	 * @generated
	 */
	void cleanDirectory(String path) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.java.JavaIOException" pathRequired="true"
	 * @generated
	 */
	void deleteDirectory(String path) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getSeparator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaFile" required="true" exceptions="org.abchip.mimo.java.JavaIOException" streamDataType="org.abchip.mimo.java.JavaInputStream" streamRequired="true"
	 * @generated
	 */
	File copyToFile(InputStream stream) throws IOException;

} // Files
