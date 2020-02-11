/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Trans Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl#getProcessWorkEffortId <em>Process Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl#getToActivityId <em>To Activity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortTransBoxImpl#getTransitionId <em>Transition Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortTransBoxImpl extends BizEntityImpl implements WorkEffortTransBox {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortTransBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_TRANS_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getProcessWorkEffortId() {
		return (WorkEffort)eGet(WorkeffortPackage.Literals.WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessWorkEffortId(WorkEffort newProcessWorkEffortId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID, newProcessWorkEffortId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToActivityId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToActivityId(String newToActivityId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID, newToActivityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransitionId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_TRANS_BOX__TRANSITION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionId(String newTransitionId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_TRANS_BOX__TRANSITION_ID, newTransitionId);
	}

} //WorkEffortTransBoxImpl
