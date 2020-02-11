/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.webapp.visit.ProtocolType;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ProtocolTypeImpl#getProtocolTypeId <em>Protocol Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ProtocolTypeImpl#getProtocolName <em>Protocol Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolTypeImpl extends BizEntityImpl implements ProtocolType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.PROTOCOL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocolTypeId() {
		return (String)eGet(VisitPackage.Literals.PROTOCOL_TYPE__PROTOCOL_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolTypeId(String newProtocolTypeId) {
		eSet(VisitPackage.Literals.PROTOCOL_TYPE__PROTOCOL_TYPE_ID, newProtocolTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocolName() {
		return (String)eGet(VisitPackage.Literals.PROTOCOL_TYPE__PROTOCOL_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolName(String newProtocolName) {
		eSet(VisitPackage.Literals.PROTOCOL_TYPE__PROTOCOL_NAME, newProtocolName);
	}

} //ProtocolTypeImpl
