/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.workeffort.workeffort.Deliverable;
import org.abchip.mimo.biz.workeffort.workeffort.DeliverableType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl#getDeliverableId <em>Deliverable Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl#getDeliverableName <em>Deliverable Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl#getDeliverableTypeId <em>Deliverable Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliverableImpl extends BizEntityTypedImpl<DeliverableType> implements Deliverable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.DELIVERABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliverableId() {
		return (String)eGet(WorkeffortPackage.Literals.DELIVERABLE__DELIVERABLE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverableId(String newDeliverableId) {
		eSet(WorkeffortPackage.Literals.DELIVERABLE__DELIVERABLE_ID, newDeliverableId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliverableName() {
		return (String)eGet(WorkeffortPackage.Literals.DELIVERABLE__DELIVERABLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverableName(String newDeliverableName) {
		eSet(WorkeffortPackage.Literals.DELIVERABLE__DELIVERABLE_NAME, newDeliverableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliverableType getDeliverableTypeId() {
		return (DeliverableType)eGet(WorkeffortPackage.Literals.DELIVERABLE__DELIVERABLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverableTypeId(DeliverableType newDeliverableTypeId) {
		eSet(WorkeffortPackage.Literals.DELIVERABLE__DELIVERABLE_TYPE_ID, newDeliverableTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(WorkeffortPackage.Literals.DELIVERABLE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(WorkeffortPackage.Literals.DELIVERABLE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> requirements() {
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
	public List<String> workEffortDeliverableProds() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WorkeffortPackage.DELIVERABLE___REQUIREMENTS:
				return requirements();
			case WorkeffortPackage.DELIVERABLE___WORK_EFFORT_DELIVERABLE_PRODS:
				return workEffortDeliverableProds();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeliverableImpl
