/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application;

import java.util.concurrent.Callable;

import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.SetLog#getLogPattern <em>Log Pattern</em>}</li>
 *   <li>{@link org.abchip.mimo.application.SetLog#getLogLevel <em>Log Level</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.application.ApplicationPackage#getSetLog()
 * @model superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.service.ServiceResponse&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.service.ServiceResponse&gt;"
 * @generated
 */
public interface SetLog extends ServiceRequest<ServiceResponse>, Callable<ServiceResponse> {
	/**
	 * Returns the value of the '<em><b>Log Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Pattern</em>' attribute.
	 * @see #setLogPattern(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getSetLog_LogPattern()
	 * @model required="true"
	 * @generated
	 */
	String getLogPattern();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.SetLog#getLogPattern <em>Log Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Pattern</em>' attribute.
	 * @see #getLogPattern()
	 * @generated
	 */
	void setLogPattern(String value);

	/**
	 * Returns the value of the '<em><b>Log Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.application.ApplicationLogLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Level</em>' attribute.
	 * @see org.abchip.mimo.application.ApplicationLogLevel
	 * @see #setLogLevel(ApplicationLogLevel)
	 * @see org.abchip.mimo.application.ApplicationPackage#getSetLog_LogLevel()
	 * @model required="true"
	 * @generated
	 */
	ApplicationLogLevel getLogLevel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.SetLog#getLogLevel <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Level</em>' attribute.
	 * @see org.abchip.mimo.application.ApplicationLogLevel
	 * @see #getLogLevel()
	 * @generated
	 */
	void setLogLevel(ApplicationLogLevel value);

} // SetLog
