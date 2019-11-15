/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getPicture <em>Picture</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ContextDescriptionImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextDescriptionImpl extends EntityImpl implements ContextDescription {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnonymous() {
		return (Boolean)eGet(ContextPackage.Literals.CONTEXT_DESCRIPTION__ANONYMOUS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnonymous(boolean newAnonymous) {
		eSet(ContextPackage.Literals.CONTEXT_DESCRIPTION__ANONYMOUS, newAnonymous);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataPath() {
		return (String)eGet(ContextPackage.Literals.CONTEXT_DESCRIPTION__DATA_PATH, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataPath(String newDataPath) {
		eSet(ContextPackage.Literals.CONTEXT_DESCRIPTION__DATA_PATH, newDataPath);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eGet(ContextPackage.Literals.CONTEXT_DESCRIPTION__ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eSet(ContextPackage.Literals.CONTEXT_DESCRIPTION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPicture() {
		return (String)eGet(ContextPackage.Literals.CONTEXT_DESCRIPTION__PICTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicture(String newPicture) {
		eSet(ContextPackage.Literals.CONTEXT_DESCRIPTION__PICTURE, newPicture);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenant() {
		return (String)eGet(ContextPackage.Literals.CONTEXT_DESCRIPTION__TENANT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenant(String newTenant) {
		eSet(ContextPackage.Literals.CONTEXT_DESCRIPTION__TENANT, newTenant);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return (String)eGet(ContextPackage.Literals.CONTEXT_DESCRIPTION__USER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		eSet(ContextPackage.Literals.CONTEXT_DESCRIPTION__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isTenant() {
		if (this.getTenant() != null && !this.getTenant().isEmpty())
			return true;
		else
			return false;
	}

} // ContextDescriptionImpl
