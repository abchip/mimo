/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.abchip.mimo.biz.service.schedule.TemporalExpression;
import org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Expression Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionAssocImpl#getFromTempExprId <em>From Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionAssocImpl#getToTempExprId <em>To Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionAssocImpl#getExprAssocType <em>Expr Assoc Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalExpressionAssocImpl extends BizEntityImpl implements TemporalExpressionAssoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalExpressionAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.TEMPORAL_EXPRESSION_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExpression getFromTempExprId() {
		return (TemporalExpression)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION_ASSOC__FROM_TEMP_EXPR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromTempExprId(TemporalExpression newFromTempExprId) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION_ASSOC__FROM_TEMP_EXPR_ID, newFromTempExprId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExpression getToTempExprId() {
		return (TemporalExpression)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION_ASSOC__TO_TEMP_EXPR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToTempExprId(TemporalExpression newToTempExprId) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION_ASSOC__TO_TEMP_EXPR_ID, newToTempExprId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExprAssocType() {
		return (String)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION_ASSOC__EXPR_ASSOC_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExprAssocType(String newExprAssocType) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION_ASSOC__EXPR_ASSOC_TYPE, newExprAssocType);
	}

} //TemporalExpressionAssocImpl
