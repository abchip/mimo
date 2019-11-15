/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context.impl;

import java.net.URI;
import java.util.List;

import org.abchip.mimo.context.Capability;
import org.abchip.mimo.context.CapabilityRight;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.CapabilityImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.CapabilityImpl#getEntityURI <em>Entity URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CapabilityImpl extends EntityImpl implements Capability {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CapabilityRight> getRights() {
		return (List<CapabilityRight>)eGet(ContextPackage.Literals.CAPABILITY__RIGHTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getEntityURI() {
		return (URI)eGet(ContextPackage.Literals.CAPABILITY__ENTITY_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityURI(URI newEntityURI) {
		eSet(ContextPackage.Literals.CAPABILITY__ENTITY_URI, newEntityURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEntityName() {
		return getEntityURI().getFragment();
	}

} //CapabilityImpl
