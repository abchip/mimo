/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.impl;

import org.abchip.mimo.biz.entity.EntityPackage;
import org.abchip.mimo.biz.entity.JavaResource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.impl.JavaResourceImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.impl.JavaResourceImpl#getResourceValue <em>Resource Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaResourceImpl extends BizEntityImpl implements JavaResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.JAVA_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceName() {
		return (String)eGet(EntityPackage.Literals.JAVA_RESOURCE__RESOURCE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceName(String newResourceName) {
		eSet(EntityPackage.Literals.JAVA_RESOURCE__RESOURCE_NAME, newResourceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getResourceValue() {
		return (byte[])eGet(EntityPackage.Literals.JAVA_RESOURCE__RESOURCE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceValue(byte[] newResourceValue) {
		eSet(EntityPackage.Literals.JAVA_RESOURCE__RESOURCE_VALUE, newResourceValue);
	}

} //JavaResourceImpl
