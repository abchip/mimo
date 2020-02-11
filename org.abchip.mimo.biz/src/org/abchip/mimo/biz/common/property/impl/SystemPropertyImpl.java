/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.property.impl;

import org.abchip.mimo.biz.common.property.PropertyPackage;
import org.abchip.mimo.biz.common.property.SystemProperty;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.property.impl.SystemPropertyImpl#getSystemPropertyId <em>System Property Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.property.impl.SystemPropertyImpl#getSystemResourceId <em>System Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.property.impl.SystemPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.property.impl.SystemPropertyImpl#getSystemPropertyValue <em>System Property Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemPropertyImpl extends BizEntityImpl implements SystemProperty {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.SYSTEM_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(PropertyPackage.Literals.SYSTEM_PROPERTY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(PropertyPackage.Literals.SYSTEM_PROPERTY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemPropertyId() {
		return (String)eGet(PropertyPackage.Literals.SYSTEM_PROPERTY__SYSTEM_PROPERTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemPropertyId(String newSystemPropertyId) {
		eSet(PropertyPackage.Literals.SYSTEM_PROPERTY__SYSTEM_PROPERTY_ID, newSystemPropertyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemPropertyValue() {
		return (String)eGet(PropertyPackage.Literals.SYSTEM_PROPERTY__SYSTEM_PROPERTY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemPropertyValue(String newSystemPropertyValue) {
		eSet(PropertyPackage.Literals.SYSTEM_PROPERTY__SYSTEM_PROPERTY_VALUE, newSystemPropertyValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemResourceId() {
		return (String)eGet(PropertyPackage.Literals.SYSTEM_PROPERTY__SYSTEM_RESOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemResourceId(String newSystemResourceId) {
		eSet(PropertyPackage.Literals.SYSTEM_PROPERTY__SYSTEM_RESOURCE_ID, newSystemResourceId);
	}

} //SystemPropertyImpl
