/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.ApplicationLogEntry#getPackage <em>Package</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationLogEntry#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationLogEntry()
 * @model
 * @generated
 */
public interface ApplicationLogEntry extends Entity {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationLogEntry_Package()
	 * @model required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationLogEntry#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"WARN"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.application.ApplicationLogLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see org.abchip.mimo.application.ApplicationLogLevel
	 * @see #setLevel(ApplicationLogLevel)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationLogEntry_Level()
	 * @model default="WARN" required="true"
	 * @generated
	 */
	ApplicationLogLevel getLevel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationLogEntry#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see org.abchip.mimo.application.ApplicationLogLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(ApplicationLogLevel value);

} // ApplicationLogEntry
