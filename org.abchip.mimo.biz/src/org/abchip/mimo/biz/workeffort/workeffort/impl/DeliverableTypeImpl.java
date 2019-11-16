/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.workeffort.workeffort.Deliverable;
import org.abchip.mimo.biz.workeffort.workeffort.DeliverableType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableTypeImpl#getDeliverableTypeId <em>Deliverable Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliverableTypeImpl extends BizEntityTypeImpl<Deliverable> implements DeliverableType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.DELIVERABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliverableTypeId() {
		return (String)eGet(WorkeffortPackage.Literals.DELIVERABLE_TYPE__DELIVERABLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverableTypeId(String newDeliverableTypeId) {
		eSet(WorkeffortPackage.Literals.DELIVERABLE_TYPE__DELIVERABLE_TYPE_ID, newDeliverableTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(WorkeffortPackage.Literals.DELIVERABLE_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(WorkeffortPackage.Literals.DELIVERABLE_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> deliverables() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> quoteItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //DeliverableTypeImpl
