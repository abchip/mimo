/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.webapp.visit.PlatformType;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl#getPlatformTypeId <em>Platform Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl#getPlatformName <em>Platform Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.PlatformTypeImpl#getPlatformVersion <em>Platform Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformTypeImpl extends BizEntityImpl implements PlatformType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.PLATFORM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatformTypeId() {
		return (String)eGet(VisitPackage.Literals.PLATFORM_TYPE__PLATFORM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformTypeId(String newPlatformTypeId) {
		eSet(VisitPackage.Literals.PLATFORM_TYPE__PLATFORM_TYPE_ID, newPlatformTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatformName() {
		return (String)eGet(VisitPackage.Literals.PLATFORM_TYPE__PLATFORM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformName(String newPlatformName) {
		eSet(VisitPackage.Literals.PLATFORM_TYPE__PLATFORM_NAME, newPlatformName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatformVersion() {
		return (String)eGet(VisitPackage.Literals.PLATFORM_TYPE__PLATFORM_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformVersion(String newPlatformVersion) {
		eSet(VisitPackage.Literals.PLATFORM_TYPE__PLATFORM_VERSION, newPlatformVersion);
	}

} //PlatformTypeImpl
