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
package org.abchip.mimo.database.definition.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;
import org.abchip.mimo.database.definition.DefinitionParseError;
import org.abchip.mimo.database.definition.DefinitionParseResult;
import org.abchip.mimo.database.definition.DefinitionStatement;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parse Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.impl.DefinitionParseResultImpl#getDefinitionStatement <em>Definition Statement</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.DefinitionParseResultImpl#getErrorList <em>Error List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionParseResultImpl extends MinimalEObjectImpl.Container implements DefinitionParseResult {
	/**
	 * The cached value of the '{@link #getDefinitionStatement() <em>Definition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionStatement()
	 * @generated
	 * @ordered
	 */
	protected DefinitionStatement definitionStatement;

	/**
	 * The cached value of the '{@link #getErrorList() <em>Error List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorList()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionParseError> errorList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionParseResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseDefinitionPackage.Literals.DEFINITION_PARSE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionStatement getDefinitionStatement() {
		if (definitionStatement != null && ((EObject)definitionStatement).eIsProxy()) {
			InternalEObject oldDefinitionStatement = (InternalEObject)definitionStatement;
			definitionStatement = (DefinitionStatement)eResolveProxy(oldDefinitionStatement);
			if (definitionStatement != oldDefinitionStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT, oldDefinitionStatement, definitionStatement));
			}
		}
		return definitionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionStatement basicGetDefinitionStatement() {
		return definitionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionStatement(DefinitionStatement newDefinitionStatement) {
		DefinitionStatement oldDefinitionStatement = definitionStatement;
		definitionStatement = newDefinitionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT, oldDefinitionStatement, definitionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DefinitionParseError> getErrorList() {
		if (errorList == null) {
			errorList = new EObjectResolvingEList<DefinitionParseError>(DefinitionParseError.class, this, DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__ERROR_LIST);
		}
		return errorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT:
				if (resolve) return getDefinitionStatement();
				return basicGetDefinitionStatement();
			case DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__ERROR_LIST:
				return getErrorList();
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
			case DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT:
				setDefinitionStatement((DefinitionStatement)newValue);
				return;
			case DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__ERROR_LIST:
				getErrorList().clear();
				getErrorList().addAll((Collection<? extends DefinitionParseError>)newValue);
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
			case DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT:
				setDefinitionStatement((DefinitionStatement)null);
				return;
			case DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__ERROR_LIST:
				getErrorList().clear();
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
			case DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT:
				return definitionStatement != null;
			case DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT__ERROR_LIST:
				return errorList != null && !errorList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefinitionParseResultImpl
