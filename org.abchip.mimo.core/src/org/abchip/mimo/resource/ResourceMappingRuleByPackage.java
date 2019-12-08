/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Rule By Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.ResourceMappingRuleByPackage#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceMappingRuleByPackage()
 * @model
 * @generated
 */
public interface ResourceMappingRuleByPackage extends ResourceMappingRule {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.abchip.mimo.resource.ResourcePackage#getResourceMappingRuleByPackage_Package()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.ResourceMappingRuleByPackage#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

} // ResourceMappingRuleByPackage
