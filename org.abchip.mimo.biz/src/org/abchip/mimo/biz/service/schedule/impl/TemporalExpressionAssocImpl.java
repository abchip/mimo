/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.abchip.mimo.biz.service.schedule.TemporalExpressionAssoc;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getFromTempExprId() <em>From Temp Expr Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTempExprId()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_TEMP_EXPR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromTempExprId() <em>From Temp Expr Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTempExprId()
	 * @generated
	 * @ordered
	 */
	protected String fromTempExprId = FROM_TEMP_EXPR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTempExprId() <em>To Temp Expr Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTempExprId()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_TEMP_EXPR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToTempExprId() <em>To Temp Expr Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTempExprId()
	 * @generated
	 * @ordered
	 */
	protected String toTempExprId = TO_TEMP_EXPR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExprAssocType() <em>Expr Assoc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprAssocType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPR_ASSOC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExprAssocType() <em>Expr Assoc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprAssocType()
	 * @generated
	 * @ordered
	 */
	protected String exprAssocType = EXPR_ASSOC_TYPE_EDEFAULT;

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
	public String getFromTempExprId() {
		return fromTempExprId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromTempExprId(String newFromTempExprId) {
		String oldFromTempExprId = fromTempExprId;
		fromTempExprId = newFromTempExprId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__FROM_TEMP_EXPR_ID, oldFromTempExprId, fromTempExprId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToTempExprId() {
		return toTempExprId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToTempExprId(String newToTempExprId) {
		String oldToTempExprId = toTempExprId;
		toTempExprId = newToTempExprId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__TO_TEMP_EXPR_ID, oldToTempExprId, toTempExprId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExprAssocType() {
		return exprAssocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExprAssocType(String newExprAssocType) {
		String oldExprAssocType = exprAssocType;
		exprAssocType = newExprAssocType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__EXPR_ASSOC_TYPE, oldExprAssocType, exprAssocType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__FROM_TEMP_EXPR_ID:
				return getFromTempExprId();
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__TO_TEMP_EXPR_ID:
				return getToTempExprId();
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__EXPR_ASSOC_TYPE:
				return getExprAssocType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__FROM_TEMP_EXPR_ID:
				setFromTempExprId((String)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__TO_TEMP_EXPR_ID:
				setToTempExprId((String)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__EXPR_ASSOC_TYPE:
				setExprAssocType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__FROM_TEMP_EXPR_ID:
				setFromTempExprId(FROM_TEMP_EXPR_ID_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__TO_TEMP_EXPR_ID:
				setToTempExprId(TO_TEMP_EXPR_ID_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__EXPR_ASSOC_TYPE:
				setExprAssocType(EXPR_ASSOC_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__FROM_TEMP_EXPR_ID:
				return FROM_TEMP_EXPR_ID_EDEFAULT == null ? fromTempExprId != null : !FROM_TEMP_EXPR_ID_EDEFAULT.equals(fromTempExprId);
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__TO_TEMP_EXPR_ID:
				return TO_TEMP_EXPR_ID_EDEFAULT == null ? toTempExprId != null : !TO_TEMP_EXPR_ID_EDEFAULT.equals(toTempExprId);
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC__EXPR_ASSOC_TYPE:
				return EXPR_ASSOC_TYPE_EDEFAULT == null ? exprAssocType != null : !EXPR_ASSOC_TYPE_EDEFAULT.equals(exprAssocType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fromTempExprId: ");
		result.append(fromTempExprId);
		result.append(", toTempExprId: ");
		result.append(toTempExprId);
		result.append(", exprAssocType: ");
		result.append(exprAssocType);
		result.append(')');
		return result.toString();
	}

} //TemporalExpressionAssocImpl
