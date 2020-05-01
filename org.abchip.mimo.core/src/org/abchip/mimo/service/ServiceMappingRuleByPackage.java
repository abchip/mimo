/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Rule By Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.ServiceMappingRuleByPackage#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceMappingRuleByPackage()
 * @model
 * @generated
 */
public interface ServiceMappingRuleByPackage extends ServiceMappingRule {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.abchip.mimo.service.ServicePackage#getServiceMappingRuleByPackage_Package()
	 * @model required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.ServiceMappingRuleByPackage#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

} // ServiceMappingRuleByPackage
