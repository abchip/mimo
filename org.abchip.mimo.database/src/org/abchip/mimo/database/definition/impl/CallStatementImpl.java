/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.database.definition.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.database.QualifiedName;
import org.abchip.mimo.database.definition.CallStatement;
import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.impl.CallStatementImpl#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.CallStatementImpl#getParms <em>Parms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallStatementImpl extends DefinitionStatementImpl implements CallStatement {
	/**
	 * The cached value of the '{@link #getProcedureName() <em>Procedure Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName procedureName;

	/**
	 * The cached value of the '{@link #getParms() <em>Parms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParms()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseDefinitionPackage.Literals.CALL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedName getProcedureName() {
		if (procedureName != null && ((EObject)procedureName).eIsProxy()) {
			InternalEObject oldProcedureName = (InternalEObject)procedureName;
			procedureName = (QualifiedName)eResolveProxy(oldProcedureName);
			if (procedureName != oldProcedureName) {
				InternalEObject newProcedureName = (InternalEObject)procedureName;
				NotificationChain msgs = oldProcedureName.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME, null, null);
				if (newProcedureName.eInternalContainer() == null) {
					msgs = newProcedureName.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME, oldProcedureName, procedureName));
			}
		}
		return procedureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName basicGetProcedureName() {
		return procedureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureName(QualifiedName newProcedureName, NotificationChain msgs) {
		QualifiedName oldProcedureName = procedureName;
		procedureName = newProcedureName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME, oldProcedureName, newProcedureName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcedureName(QualifiedName newProcedureName) {
		if (newProcedureName != procedureName) {
			NotificationChain msgs = null;
			if (procedureName != null)
				msgs = ((InternalEObject)procedureName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME, null, msgs);
			if (newProcedureName != null)
				msgs = ((InternalEObject)newProcedureName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME, null, msgs);
			msgs = basicSetProcedureName(newProcedureName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME, newProcedureName, newProcedureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getParms() {
		if (parms == null) {
			parms = new EDataTypeUniqueEList<String>(String.class, this, DatabaseDefinitionPackage.CALL_STATEMENT__PARMS);
		}
		return parms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME:
				return basicSetProcedureName(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME:
				if (resolve) return getProcedureName();
				return basicGetProcedureName();
			case DatabaseDefinitionPackage.CALL_STATEMENT__PARMS:
				return getParms();
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
			case DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME:
				setProcedureName((QualifiedName)newValue);
				return;
			case DatabaseDefinitionPackage.CALL_STATEMENT__PARMS:
				getParms().clear();
				getParms().addAll((Collection<? extends String>)newValue);
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
			case DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME:
				setProcedureName((QualifiedName)null);
				return;
			case DatabaseDefinitionPackage.CALL_STATEMENT__PARMS:
				getParms().clear();
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
			case DatabaseDefinitionPackage.CALL_STATEMENT__PROCEDURE_NAME:
				return procedureName != null;
			case DatabaseDefinitionPackage.CALL_STATEMENT__PARMS:
				return parms != null && !parms.isEmpty();
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
		result.append(" (parms: ");
		result.append(parms);
		result.append(')');
		return result.toString();
	}

} //CallStatementImpl
