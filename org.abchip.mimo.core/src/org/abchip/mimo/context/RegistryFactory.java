/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Object Registry Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getRegistryFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RegistryFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" klassRequired="true"
	 * @generated
	 */
	<K> Registry<K> createRegistry(Class<K> klass);

} // RegistryFactory
