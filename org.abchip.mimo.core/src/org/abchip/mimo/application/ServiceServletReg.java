/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Servlet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.ServiceServletReg#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ServiceServletReg#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.application.ApplicationPackage#getServiceServletReg()
 * @model
 * @generated
 */
public interface ServiceServletReg extends ServiceReg {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getServiceServletReg_Alias()
	 * @model required="true"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ServiceServletReg#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * The default value is <code>"javax.servlet.Servlet"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see org.abchip.mimo.application.ApplicationPackage#getServiceServletReg_InterfaceName()
	 * @model default="javax.servlet.Servlet" required="true" changeable="false"
	 * @generated
	 */
	@Override
	String getInterfaceName();

} // ServiceServletReg
