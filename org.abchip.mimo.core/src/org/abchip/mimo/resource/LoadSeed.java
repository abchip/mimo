/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

import java.util.concurrent.Callable;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Seed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.LoadSeed#getSeedId <em>Seed Id</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.LoadSeed#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getLoadSeed()
 * @model superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.service.ServiceResponse&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.service.ServiceResponse&gt;"
 * @generated
 */
public interface LoadSeed extends ServiceRequest<ServiceResponse>, Callable<ServiceResponse> {
	/**
	 * Returns the value of the '<em><b>Seed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Id</em>' attribute.
	 * @see #setSeedId(String)
	 * @see org.abchip.mimo.resource.ResourcePackage#getLoadSeed_SeedId()
	 * @model required="true"
	 * @generated
	 */
	String getSeedId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.LoadSeed#getSeedId <em>Seed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Id</em>' attribute.
	 * @see #getSeedId()
	 * @generated
	 */
	void setSeedId(String value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see #setUpdate(boolean)
	 * @see org.abchip.mimo.resource.ResourcePackage#getLoadSeed_Update()
	 * @model
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.LoadSeed#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see #isUpdate()
	 * @generated
	 */
	void setUpdate(boolean value);

} // LoadSeed
