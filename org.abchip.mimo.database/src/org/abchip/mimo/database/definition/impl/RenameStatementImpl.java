/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.database.definition.impl;

import org.abchip.mimo.database.QualifiedName;
import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;
import org.abchip.mimo.database.definition.RenameStatement;
import org.abchip.mimo.database.definition.TargetElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.impl.RenameStatementImpl#getNewName <em>New Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.RenameStatementImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.RenameStatementImpl#getOriginalName <em>Original Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.RenameStatementImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameStatementImpl extends DefinitionStatementImpl implements RenameStatement {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected String newName = NEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected String system = SYSTEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOriginalName() <em>Original Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName originalName;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final TargetElement TARGET_EDEFAULT = TargetElement.ALIAS;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TargetElement target = TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseDefinitionPackage.Literals.RENAME_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewName() {
		return newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewName(String newNewName) {
		String oldNewName = newName;
		newName = newNewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.RENAME_STATEMENT__NEW_NAME, oldNewName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem(String newSystem) {
		String oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.RENAME_STATEMENT__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedName getOriginalName() {
		if (originalName != null && ((EObject)originalName).eIsProxy()) {
			InternalEObject oldOriginalName = (InternalEObject)originalName;
			originalName = (QualifiedName)eResolveProxy(oldOriginalName);
			if (originalName != oldOriginalName) {
				InternalEObject newOriginalName = (InternalEObject)originalName;
				NotificationChain msgs = oldOriginalName.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME, null, null);
				if (newOriginalName.eInternalContainer() == null) {
					msgs = newOriginalName.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME, oldOriginalName, originalName));
			}
		}
		return originalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedName basicGetOriginalName() {
		return originalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalName(QualifiedName newOriginalName, NotificationChain msgs) {
		QualifiedName oldOriginalName = originalName;
		originalName = newOriginalName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME, oldOriginalName, newOriginalName);
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
	public void setOriginalName(QualifiedName newOriginalName) {
		if (newOriginalName != originalName) {
			NotificationChain msgs = null;
			if (originalName != null)
				msgs = ((InternalEObject)originalName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME, null, msgs);
			if (newOriginalName != null)
				msgs = ((InternalEObject)newOriginalName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME, null, msgs);
			msgs = basicSetOriginalName(newOriginalName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME, newOriginalName, newOriginalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetElement getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TargetElement newTarget) {
		TargetElement oldTarget = target;
		target = newTarget == null ? TARGET_EDEFAULT : newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.RENAME_STATEMENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME:
				return basicSetOriginalName(null, msgs);
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
			case DatabaseDefinitionPackage.RENAME_STATEMENT__NEW_NAME:
				return getNewName();
			case DatabaseDefinitionPackage.RENAME_STATEMENT__SYSTEM:
				return getSystem();
			case DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME:
				if (resolve) return getOriginalName();
				return basicGetOriginalName();
			case DatabaseDefinitionPackage.RENAME_STATEMENT__TARGET:
				return getTarget();
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
			case DatabaseDefinitionPackage.RENAME_STATEMENT__NEW_NAME:
				setNewName((String)newValue);
				return;
			case DatabaseDefinitionPackage.RENAME_STATEMENT__SYSTEM:
				setSystem((String)newValue);
				return;
			case DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME:
				setOriginalName((QualifiedName)newValue);
				return;
			case DatabaseDefinitionPackage.RENAME_STATEMENT__TARGET:
				setTarget((TargetElement)newValue);
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
			case DatabaseDefinitionPackage.RENAME_STATEMENT__NEW_NAME:
				setNewName(NEW_NAME_EDEFAULT);
				return;
			case DatabaseDefinitionPackage.RENAME_STATEMENT__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME:
				setOriginalName((QualifiedName)null);
				return;
			case DatabaseDefinitionPackage.RENAME_STATEMENT__TARGET:
				setTarget(TARGET_EDEFAULT);
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
			case DatabaseDefinitionPackage.RENAME_STATEMENT__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
			case DatabaseDefinitionPackage.RENAME_STATEMENT__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
			case DatabaseDefinitionPackage.RENAME_STATEMENT__ORIGINAL_NAME:
				return originalName != null;
			case DatabaseDefinitionPackage.RENAME_STATEMENT__TARGET:
				return target != TARGET_EDEFAULT;
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
		result.append(" (newName: ");
		result.append(newName);
		result.append(", system: ");
		result.append(system);
		result.append(", target: ");
		result.append(target);
		result.append(')');
		return result.toString();
	}

} //RenameStatementImpl
