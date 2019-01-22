/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.context.impl;

import java.security.Principal;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.Identity;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IdentityImpl<T extends Entity> extends EntityImpl implements Identity<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Principal principal;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IdentityImpl(Principal principal) {
		super();
		this.principal = principal;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.IDENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Principal getJavaPrincipal() {
		return this.principal;
	}

} //IdentityImpl
