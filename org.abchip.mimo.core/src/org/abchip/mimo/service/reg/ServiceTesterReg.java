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
 * A representation of the model object '<em><b>Service Tester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.reg.ServiceTesterReg#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.reg.RegPackage#getServiceTesterReg()
 * @model
 * @generated
 */
public interface ServiceTesterReg extends ServiceReg {

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * The default value is <code>"org.abchip.mimo.tester.TestSuiteLauncher"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see org.abchip.mimo.service.reg.RegPackage#getServiceTesterReg_InterfaceName()
	 * @model default="org.abchip.mimo.tester.TestSuiteLauncher" required="true" changeable="false"
	 * @generated
	 */
	@Override
	String getInterfaceName();
} // ServiceTesterReg