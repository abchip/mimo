/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.abchip.mimo.biz.service.schedule.TemporalExpression;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getTempExprId <em>Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getDate1 <em>Date1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getDate2 <em>Date2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getInteger1 <em>Integer1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getInteger2 <em>Integer2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getString1 <em>String1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getString2 <em>String2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getTempExprTypeId <em>Temp Expr Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.schedule.impl.TemporalExpressionImpl#getFromTemporalExpressionAssocs <em>From Temporal Expression Assocs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalExpressionImpl extends BizEntityImpl implements TemporalExpression {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getTempExprId() <em>Temp Expr Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempExprId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMP_EXPR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempExprId() <em>Temp Expr Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempExprId()
	 * @generated
	 * @ordered
	 */
	protected String tempExprId = TEMP_EXPR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate1() <em>Date1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate1()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate1() <em>Date1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate1()
	 * @generated
	 * @ordered
	 */
	protected Date date1 = DATE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate2() <em>Date2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate2()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate2() <em>Date2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate2()
	 * @generated
	 * @ordered
	 */
	protected Date date2 = DATE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInteger1() <em>Integer1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger1()
	 * @generated
	 * @ordered
	 */
	protected static final long INTEGER1_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInteger1() <em>Integer1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger1()
	 * @generated
	 * @ordered
	 */
	protected long integer1 = INTEGER1_EDEFAULT;

	/**
	 * The default value of the '{@link #getInteger2() <em>Integer2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger2()
	 * @generated
	 * @ordered
	 */
	protected static final long INTEGER2_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInteger2() <em>Integer2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger2()
	 * @generated
	 * @ordered
	 */
	protected long integer2 = INTEGER2_EDEFAULT;

	/**
	 * The default value of the '{@link #getString1() <em>String1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString1()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString1() <em>String1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString1()
	 * @generated
	 * @ordered
	 */
	protected String string1 = STRING1_EDEFAULT;

	/**
	 * The default value of the '{@link #getString2() <em>String2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString2()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString2() <em>String2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString2()
	 * @generated
	 * @ordered
	 */
	protected String string2 = STRING2_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempExprTypeId() <em>Temp Expr Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempExprTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMP_EXPR_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempExprTypeId() <em>Temp Expr Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempExprTypeId()
	 * @generated
	 * @ordered
	 */
	protected String tempExprTypeId = TEMP_EXPR_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromTemporalExpressionAssocs() <em>From Temporal Expression Assocs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTemporalExpressionAssocs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fromTemporalExpressionAssocs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.TEMPORAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTempExprId() {
		return tempExprId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempExprId(String newTempExprId) {
		tempExprId = newTempExprId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate1() {
		return date1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate1(Date newDate1) {
		date1 = newDate1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate2() {
		return date2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate2(Date newDate2) {
		date2 = newDate2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInteger1() {
		return integer1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInteger1(long newInteger1) {
		integer1 = newInteger1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInteger2() {
		return integer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInteger2(long newInteger2) {
		integer2 = newInteger2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getString1() {
		return string1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setString1(String newString1) {
		string1 = newString1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getString2() {
		return string2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setString2(String newString2) {
		string2 = newString2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTempExprTypeId() {
		return tempExprTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempExprTypeId(String newTempExprTypeId) {
		tempExprTypeId = newTempExprTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFromTemporalExpressionAssocs() {
		if (fromTemporalExpressionAssocs == null) {
			fromTemporalExpressionAssocs = new BasicInternalEList<String>(String.class);
		}
		return fromTemporalExpressionAssocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> jobSandboxs() {
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
	public List<String> toTemporalExpressionAssocs() {
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
	public List<String> workEfforts() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulePackage.TEMPORAL_EXPRESSION__TEMP_EXPR_ID:
				return getTempExprId();
			case SchedulePackage.TEMPORAL_EXPRESSION__DATE1:
				return getDate1();
			case SchedulePackage.TEMPORAL_EXPRESSION__DATE2:
				return getDate2();
			case SchedulePackage.TEMPORAL_EXPRESSION__DESCRIPTION:
				return getDescription();
			case SchedulePackage.TEMPORAL_EXPRESSION__INTEGER1:
				return getInteger1();
			case SchedulePackage.TEMPORAL_EXPRESSION__INTEGER2:
				return getInteger2();
			case SchedulePackage.TEMPORAL_EXPRESSION__STRING1:
				return getString1();
			case SchedulePackage.TEMPORAL_EXPRESSION__STRING2:
				return getString2();
			case SchedulePackage.TEMPORAL_EXPRESSION__TEMP_EXPR_TYPE_ID:
				return getTempExprTypeId();
			case SchedulePackage.TEMPORAL_EXPRESSION__FROM_TEMPORAL_EXPRESSION_ASSOCS:
				return getFromTemporalExpressionAssocs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchedulePackage.TEMPORAL_EXPRESSION__TEMP_EXPR_ID:
				setTempExprId((String)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__DATE1:
				setDate1((Date)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__DATE2:
				setDate2((Date)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__INTEGER1:
				setInteger1((Long)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__INTEGER2:
				setInteger2((Long)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__STRING1:
				setString1((String)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__STRING2:
				setString2((String)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__TEMP_EXPR_TYPE_ID:
				setTempExprTypeId((String)newValue);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__FROM_TEMPORAL_EXPRESSION_ASSOCS:
				getFromTemporalExpressionAssocs().clear();
				getFromTemporalExpressionAssocs().addAll((Collection<? extends String>)newValue);
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
			case SchedulePackage.TEMPORAL_EXPRESSION__TEMP_EXPR_ID:
				setTempExprId(TEMP_EXPR_ID_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__DATE1:
				setDate1(DATE1_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__DATE2:
				setDate2(DATE2_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__INTEGER1:
				setInteger1(INTEGER1_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__INTEGER2:
				setInteger2(INTEGER2_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__STRING1:
				setString1(STRING1_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__STRING2:
				setString2(STRING2_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__TEMP_EXPR_TYPE_ID:
				setTempExprTypeId(TEMP_EXPR_TYPE_ID_EDEFAULT);
				return;
			case SchedulePackage.TEMPORAL_EXPRESSION__FROM_TEMPORAL_EXPRESSION_ASSOCS:
				getFromTemporalExpressionAssocs().clear();
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
			case SchedulePackage.TEMPORAL_EXPRESSION__TEMP_EXPR_ID:
				return TEMP_EXPR_ID_EDEFAULT == null ? tempExprId != null : !TEMP_EXPR_ID_EDEFAULT.equals(tempExprId);
			case SchedulePackage.TEMPORAL_EXPRESSION__DATE1:
				return DATE1_EDEFAULT == null ? date1 != null : !DATE1_EDEFAULT.equals(date1);
			case SchedulePackage.TEMPORAL_EXPRESSION__DATE2:
				return DATE2_EDEFAULT == null ? date2 != null : !DATE2_EDEFAULT.equals(date2);
			case SchedulePackage.TEMPORAL_EXPRESSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SchedulePackage.TEMPORAL_EXPRESSION__INTEGER1:
				return integer1 != INTEGER1_EDEFAULT;
			case SchedulePackage.TEMPORAL_EXPRESSION__INTEGER2:
				return integer2 != INTEGER2_EDEFAULT;
			case SchedulePackage.TEMPORAL_EXPRESSION__STRING1:
				return STRING1_EDEFAULT == null ? string1 != null : !STRING1_EDEFAULT.equals(string1);
			case SchedulePackage.TEMPORAL_EXPRESSION__STRING2:
				return STRING2_EDEFAULT == null ? string2 != null : !STRING2_EDEFAULT.equals(string2);
			case SchedulePackage.TEMPORAL_EXPRESSION__TEMP_EXPR_TYPE_ID:
				return TEMP_EXPR_TYPE_ID_EDEFAULT == null ? tempExprTypeId != null : !TEMP_EXPR_TYPE_ID_EDEFAULT.equals(tempExprTypeId);
			case SchedulePackage.TEMPORAL_EXPRESSION__FROM_TEMPORAL_EXPRESSION_ASSOCS:
				return fromTemporalExpressionAssocs != null && !fromTemporalExpressionAssocs.isEmpty();
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
		result.append(" (tempExprId: ");
		result.append(tempExprId);
		result.append(", date1: ");
		result.append(date1);
		result.append(", date2: ");
		result.append(date2);
		result.append(", description: ");
		result.append(description);
		result.append(", integer1: ");
		result.append(integer1);
		result.append(", integer2: ");
		result.append(integer2);
		result.append(", string1: ");
		result.append(string1);
		result.append(", string2: ");
		result.append(string2);
		result.append(", tempExprTypeId: ");
		result.append(tempExprTypeId);
		result.append(", fromTemporalExpressionAssocs: ");
		result.append(fromTemporalExpressionAssocs);
		result.append(')');
		return result.toString();
	}

} //TemporalExpressionImpl
