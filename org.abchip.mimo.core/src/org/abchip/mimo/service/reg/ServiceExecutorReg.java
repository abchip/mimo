/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.service.reg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ServiceScope Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.reg.ServiceExecutorReg#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.abchip.mimo.service.reg.ServiceExecutorReg#isRemoteExport <em>Remote Export</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.reg.RegPackage#getServiceExecutorReg()
 * @model
 * @generated
 */
public interface ServiceExecutorReg extends ServiceReg {
	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see org.abchip.mimo.service.reg.RegPackage#getServiceExecutorReg_InterfaceName()
	 * @model required="true"
	 * @generated
	 */
	@Override
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.reg.ServiceExecutorReg#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Export</em>' attribute.
	 * @see #setRemoteExport(boolean)
	 * @see org.abchip.mimo.service.reg.RegPackage#getServiceExecutorReg_RemoteExport()
	 * @model required="true"
	 * @generated
	 */
	boolean isRemoteExport();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.reg.ServiceExecutorReg#isRemoteExport <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Export</em>' attribute.
	 * @see #isRemoteExport()
	 * @generated
	 */
	void setRemoteExport(boolean value);

} // ServiceExecutorReg
