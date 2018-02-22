/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.impl;

import org.abchip.mimo.language.LanguageExpression;
import org.abchip.mimo.language.LanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageExpressionImpl#getExpressionRow <em>Expression Row</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageExpressionImpl extends MinimalEObjectImpl.Container implements LanguageExpression {
	/**
	 * The default value of the '{@link #getExpressionRow() <em>Expression Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionRow()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXPRESSION_ROW_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExpressionRow() <em>Expression Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionRow()
	 * @generated
	 * @ordered
	 */
	protected Object expressionRow = EXPRESSION_ROW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanguagePackage.Literals.LANGUAGE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExpressionRow() {
		return expressionRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionRow(Object newExpressionRow) {
		Object oldExpressionRow = expressionRow;
		expressionRow = newExpressionRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.LANGUAGE_EXPRESSION__EXPRESSION_ROW, oldExpressionRow, expressionRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LanguagePackage.LANGUAGE_EXPRESSION__EXPRESSION_ROW:
				return getExpressionRow();
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
			case LanguagePackage.LANGUAGE_EXPRESSION__EXPRESSION_ROW:
				setExpressionRow(newValue);
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
			case LanguagePackage.LANGUAGE_EXPRESSION__EXPRESSION_ROW:
				setExpressionRow(EXPRESSION_ROW_EDEFAULT);
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
			case LanguagePackage.LANGUAGE_EXPRESSION__EXPRESSION_ROW:
				return EXPRESSION_ROW_EDEFAULT == null ? expressionRow != null : !EXPRESSION_ROW_EDEFAULT.equals(expressionRow);
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
		result.append(" (expressionRow: ");
		result.append(expressionRow);
		result.append(')');
		return result.toString();
	}

} //LanguageExpressionImpl
