/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.database.definition.impl;

import org.abchip.mimo.database.QualifiedName;
import org.abchip.mimo.database.definition.CreateIndexStatement;
import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;
import org.abchip.mimo.database.definition.IndexDef;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Index Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.impl.CreateIndexStatementImpl#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.CreateIndexStatementImpl#getOnTable <em>On Table</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.CreateIndexStatementImpl#getSortBy <em>Sort By</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.CreateIndexStatementImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateIndexStatementImpl extends DefinitionStatementImpl implements CreateIndexStatement {

	/**
	 * The cached value of the '{@link #getIndexName() <em>Index Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName indexName;

	/**
	 * The cached value of the '{@link #getOnTable() <em>On Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTable()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName onTable;

	/**
	 * The cached value of the '{@link #getSortBy() <em>Sort By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortBy()
	 * @generated
	 * @ordered
	 */
	protected IndexDef sortBy;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateIndexStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseDefinitionPackage.Literals.CREATE_INDEX_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedName getIndexName() {
		if (indexName != null && ((EObject)indexName).eIsProxy()) {
			InternalEObject oldIndexName = (InternalEObject)indexName;
			indexName = (QualifiedName)eResolveProxy(oldIndexName);
			if (indexName != oldIndexName) {
				InternalEObject newIndexName = (InternalEObject)indexName;
				NotificationChain msgs = oldIndexName.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, null, null);
				if (newIndexName.eInternalContainer() == null) {
					msgs = newIndexName.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, oldIndexName, indexName));
			}
		}
		return indexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName basicGetIndexName() {
		return indexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexName(QualifiedName newIndexName, NotificationChain msgs) {
		QualifiedName oldIndexName = indexName;
		indexName = newIndexName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, oldIndexName, newIndexName);
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
	public void setIndexName(QualifiedName newIndexName) {
		if (newIndexName != indexName) {
			NotificationChain msgs = null;
			if (indexName != null)
				msgs = ((InternalEObject)indexName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, null, msgs);
			if (newIndexName != null)
				msgs = ((InternalEObject)newIndexName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, null, msgs);
			msgs = basicSetIndexName(newIndexName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME, newIndexName, newIndexName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedName getOnTable() {
		if (onTable != null && ((EObject)onTable).eIsProxy()) {
			InternalEObject oldOnTable = (InternalEObject)onTable;
			onTable = (QualifiedName)eResolveProxy(oldOnTable);
			if (onTable != oldOnTable) {
				InternalEObject newOnTable = (InternalEObject)onTable;
				NotificationChain msgs = oldOnTable.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE, null, null);
				if (newOnTable.eInternalContainer() == null) {
					msgs = newOnTable.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE, oldOnTable, onTable));
			}
		}
		return onTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName basicGetOnTable() {
		return onTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnTable(QualifiedName newOnTable, NotificationChain msgs) {
		QualifiedName oldOnTable = onTable;
		onTable = newOnTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE, oldOnTable, newOnTable);
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
	public void setOnTable(QualifiedName newOnTable) {
		if (newOnTable != onTable) {
			NotificationChain msgs = null;
			if (onTable != null)
				msgs = ((InternalEObject)onTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE, null, msgs);
			if (newOnTable != null)
				msgs = ((InternalEObject)newOnTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE, null, msgs);
			msgs = basicSetOnTable(newOnTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE, newOnTable, newOnTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexDef getSortBy() {
		if (sortBy != null && ((EObject)sortBy).eIsProxy()) {
			InternalEObject oldSortBy = (InternalEObject)sortBy;
			sortBy = (IndexDef)eResolveProxy(oldSortBy);
			if (sortBy != oldSortBy) {
				InternalEObject newSortBy = (InternalEObject)sortBy;
				NotificationChain msgs = oldSortBy.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY, null, null);
				if (newSortBy.eInternalContainer() == null) {
					msgs = newSortBy.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY, oldSortBy, sortBy));
			}
		}
		return sortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexDef basicGetSortBy() {
		return sortBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortBy(IndexDef newSortBy, NotificationChain msgs) {
		IndexDef oldSortBy = sortBy;
		sortBy = newSortBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY, oldSortBy, newSortBy);
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
	public void setSortBy(IndexDef newSortBy) {
		if (newSortBy != sortBy) {
			NotificationChain msgs = null;
			if (sortBy != null)
				msgs = ((InternalEObject)sortBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY, null, msgs);
			if (newSortBy != null)
				msgs = ((InternalEObject)newSortBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY, null, msgs);
			msgs = basicSetSortBy(newSortBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY, newSortBy, newSortBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				return basicSetIndexName(null, msgs);
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				return basicSetOnTable(null, msgs);
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				return basicSetSortBy(null, msgs);
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
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				if (resolve) return getIndexName();
				return basicGetIndexName();
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				if (resolve) return getOnTable();
				return basicGetOnTable();
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				if (resolve) return getSortBy();
				return basicGetSortBy();
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__UNIQUE:
				return isUnique();
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
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				setIndexName((QualifiedName)newValue);
				return;
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				setOnTable((QualifiedName)newValue);
				return;
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				setSortBy((IndexDef)newValue);
				return;
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__UNIQUE:
				setUnique((Boolean)newValue);
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
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				setIndexName((QualifiedName)null);
				return;
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				setOnTable((QualifiedName)null);
				return;
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				setSortBy((IndexDef)null);
				return;
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
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
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__INDEX_NAME:
				return indexName != null;
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__ON_TABLE:
				return onTable != null;
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__SORT_BY:
				return sortBy != null;
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
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
		result.append(" (unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} //CreateIndexStatementImpl
