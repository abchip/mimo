/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.database.definition.impl;

import org.abchip.mimo.database.QualifiedName;
import org.abchip.mimo.database.definition.CreateAliasStatement;
import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Alias Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.impl.CreateAliasStatementImpl#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.CreateAliasStatementImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateAliasStatementImpl extends DefinitionStatementImpl implements CreateAliasStatement {
	/**
	 * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName aliasName;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName tableName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateAliasStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseDefinitionPackage.Literals.CREATE_ALIAS_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName getAliasName() {
		return aliasName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliasName(QualifiedName newAliasName, NotificationChain msgs) {
		QualifiedName oldAliasName = aliasName;
		aliasName = newAliasName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, oldAliasName, newAliasName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasName(QualifiedName newAliasName) {
		if (newAliasName != aliasName) {
			NotificationChain msgs = null;
			if (aliasName != null)
				msgs = ((InternalEObject)aliasName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, null, msgs);
			if (newAliasName != null)
				msgs = ((InternalEObject)newAliasName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, null, msgs);
			msgs = basicSetAliasName(newAliasName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME, newAliasName, newAliasName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableName(QualifiedName newTableName, NotificationChain msgs) {
		QualifiedName oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, oldTableName, newTableName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(QualifiedName newTableName) {
		if (newTableName != tableName) {
			NotificationChain msgs = null;
			if (tableName != null)
				msgs = ((InternalEObject)tableName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, null, msgs);
			if (newTableName != null)
				msgs = ((InternalEObject)newTableName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, null, msgs);
			msgs = basicSetTableName(newTableName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME, newTableName, newTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				return basicSetAliasName(null, msgs);
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				return basicSetTableName(null, msgs);
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
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				return getAliasName();
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				return getTableName();
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
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				setAliasName((QualifiedName)newValue);
				return;
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				setTableName((QualifiedName)newValue);
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
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				setAliasName((QualifiedName)null);
				return;
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				setTableName((QualifiedName)null);
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
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__ALIAS_NAME:
				return aliasName != null;
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT__TABLE_NAME:
				return tableName != null;
		}
		return super.eIsSet(featureID);
	}

} //CreateAliasStatementImpl
