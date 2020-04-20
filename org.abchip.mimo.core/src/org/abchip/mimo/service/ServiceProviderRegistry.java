/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Registry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceProviderRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceProviderRegistry extends Registry<ServiceProvider> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" requestRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> ServiceProvider getServiceProvider(Context context, R request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" klassRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> ServiceProvider getServiceProvider(Context context, Class<R> klass);

} // ServiceProviderRegistry
