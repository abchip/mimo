/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.database.definition.impl;

import org.abchip.mimo.database.QualifiedName;
import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;
import org.abchip.mimo.database.definition.DropRange;
import org.abchip.mimo.database.definition.DropStatement;
import org.abchip.mimo.database.definition.TargetElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.impl.DropStatementImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.DropStatementImpl#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.definition.impl.DropStatementImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropStatementImpl extends DefinitionStatementImpl implements DropStatement {
	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final DropRange RANGE_EDEFAULT = DropRange.RESTRICT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected DropRange range = RANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetName() <em>Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected QualifiedName targetName;

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
	protected DropStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseDefinitionPackage.Literals.DROP_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropRange getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(DropRange newRange) {
		DropRange oldRange = range;
		range = newRange == null ? RANGE_EDEFAULT : newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.DROP_STATEMENT__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedName getTargetName() {
		return targetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetName(QualifiedName newTargetName, NotificationChain msgs) {
		QualifiedName oldTargetName = targetName;
		targetName = newTargetName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.DROP_STATEMENT__TARGET_NAME, oldTargetName, newTargetName);
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
	public void setTargetName(QualifiedName newTargetName) {
		if (newTargetName != targetName) {
			NotificationChain msgs = null;
			if (targetName != null)
				msgs = ((InternalEObject)targetName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.DROP_STATEMENT__TARGET_NAME, null, msgs);
			if (newTargetName != null)
				msgs = ((InternalEObject)newTargetName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseDefinitionPackage.DROP_STATEMENT__TARGET_NAME, null, msgs);
			msgs = basicSetTargetName(newTargetName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.DROP_STATEMENT__TARGET_NAME, newTargetName, newTargetName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.DROP_STATEMENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseDefinitionPackage.DROP_STATEMENT__TARGET_NAME:
				return basicSetTargetName(null, msgs);
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
			case DatabaseDefinitionPackage.DROP_STATEMENT__RANGE:
				return getRange();
			case DatabaseDefinitionPackage.DROP_STATEMENT__TARGET_NAME:
				return getTargetName();
			case DatabaseDefinitionPackage.DROP_STATEMENT__TARGET:
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
			case DatabaseDefinitionPackage.DROP_STATEMENT__RANGE:
				setRange((DropRange)newValue);
				return;
			case DatabaseDefinitionPackage.DROP_STATEMENT__TARGET_NAME:
				setTargetName((QualifiedName)newValue);
				return;
			case DatabaseDefinitionPackage.DROP_STATEMENT__TARGET:
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
			case DatabaseDefinitionPackage.DROP_STATEMENT__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case DatabaseDefinitionPackage.DROP_STATEMENT__TARGET_NAME:
				setTargetName((QualifiedName)null);
				return;
			case DatabaseDefinitionPackage.DROP_STATEMENT__TARGET:
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
			case DatabaseDefinitionPackage.DROP_STATEMENT__RANGE:
				return range != RANGE_EDEFAULT;
			case DatabaseDefinitionPackage.DROP_STATEMENT__TARGET_NAME:
				return targetName != null;
			case DatabaseDefinitionPackage.DROP_STATEMENT__TARGET:
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
		result.append(" (range: ");
		result.append(range);
		result.append(", target: ");
		result.append(target);
		result.append(')');
		return result.toString();
	}

} //DropStatementImpl
