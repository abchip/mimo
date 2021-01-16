/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.query.impl;

import org.abchip.mimo.database.query.DatabaseQueryPackage;
import org.abchip.mimo.database.query.NameHelper;
import org.abchip.mimo.database.query.StatementWriter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Writer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.query.impl.StatementWriterImpl#getNameHelper <em>Name Helper</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StatementWriterImpl extends MinimalEObjectImpl.Container implements StatementWriter {
	/**
	 * The cached value of the '{@link #getNameHelper() <em>Name Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameHelper()
	 * @generated
	 * @ordered
	 */
	protected NameHelper nameHelper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseQueryPackage.Literals.STATEMENT_WRITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameHelper getNameHelper() {
		if (nameHelper != null && ((EObject)nameHelper).eIsProxy()) {
			InternalEObject oldNameHelper = (InternalEObject)nameHelper;
			nameHelper = (NameHelper)eResolveProxy(oldNameHelper);
			if (nameHelper != oldNameHelper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseQueryPackage.STATEMENT_WRITER__NAME_HELPER, oldNameHelper, nameHelper));
			}
		}
		return nameHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameHelper basicGetNameHelper() {
		return nameHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameHelper(NameHelper newNameHelper) {
		NameHelper oldNameHelper = nameHelper;
		nameHelper = newNameHelper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseQueryPackage.STATEMENT_WRITER__NAME_HELPER, oldNameHelper, nameHelper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabaseQueryPackage.STATEMENT_WRITER__NAME_HELPER:
				if (resolve) return getNameHelper();
				return basicGetNameHelper();
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
			case DatabaseQueryPackage.STATEMENT_WRITER__NAME_HELPER:
				setNameHelper((NameHelper)newValue);
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
			case DatabaseQueryPackage.STATEMENT_WRITER__NAME_HELPER:
				setNameHelper((NameHelper)null);
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
			case DatabaseQueryPackage.STATEMENT_WRITER__NAME_HELPER:
				return nameHelper != null;
		}
		return super.eIsSet(featureID);
	}

} //StatementWriterImpl
