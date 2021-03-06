/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.reg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ServiceScope Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.reg.ServiceFactoryReg#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.reg.RegPackage#getServiceFactoryReg()
 * @model
 * @generated
 */
public interface ServiceFactoryReg extends ServiceReg {
	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * The default value is <code>"org.abchip.mimo.context.Factory"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see org.abchip.mimo.service.reg.RegPackage#getServiceFactoryReg_InterfaceName()
	 * @model default="org.abchip.mimo.context.Factory" required="true" changeable="false"
	 * @generated
	 */
	String getInterfaceName();

} // ServiceFactoryReg
