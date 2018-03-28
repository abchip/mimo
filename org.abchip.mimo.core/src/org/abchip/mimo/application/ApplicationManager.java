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
package org.abchip.mimo.application;

import java.io.OutputStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ApplicationManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextRequired="true" applicationRequired="true" outputDataType="org.abchip.mimo.util.JavaOutputStream"
	 * @generated
	 */
	Application start(Class<?> context, Application application, OutputStream output);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void restart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean restartCalled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean stopCalled();

} // ApplicationManager
