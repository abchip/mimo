/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.service.reg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ServiceScope Command Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.reg.ServiceCommandProviderReg#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.reg.RegPackage#getServiceCommandProviderReg()
 * @model
 * @generated
 */
public interface ServiceCommandProviderReg extends ServiceReg {
	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * The default value is <code>"org.eclipse.osgi.framework.console.CommandProvider"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see org.abchip.mimo.service.reg.RegPackage#getServiceCommandProviderReg_InterfaceName()
	 * @model default="org.eclipse.osgi.framework.console.CommandProvider" required="true" changeable="false"
	 * @generated
	 */
	@Override
	String getInterfaceName();

} // ServiceCommandProviderReg
