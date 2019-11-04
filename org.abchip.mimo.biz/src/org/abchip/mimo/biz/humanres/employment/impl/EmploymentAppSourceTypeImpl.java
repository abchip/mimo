/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import java.util.List;

import org.abchip.mimo.biz.humanres.employment.EmploymentAppSourceType;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employment App Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppSourceTypeImpl#getEmploymentAppSourceTypeId <em>Employment App Source Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppSourceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppSourceTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppSourceTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmploymentAppSourceTypeImpl extends BizEntityImpl implements EmploymentAppSourceType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEmploymentAppSourceTypeId() <em>Employment App Source Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentAppSourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmploymentAppSourceTypeId() <em>Employment App Source Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentAppSourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String employmentAppSourceTypeId = EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected EmploymentAppSourceType parentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmploymentAppSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.EMPLOYMENT_APP_SOURCE_TYPE;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmploymentAppSourceTypeId() {
		return employmentAppSourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmploymentAppSourceTypeId(String newEmploymentAppSourceTypeId) {
		String oldEmploymentAppSourceTypeId = employmentAppSourceTypeId;
		employmentAppSourceTypeId = newEmploymentAppSourceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__EMPLOYMENT_APP_SOURCE_TYPE_ID, oldEmploymentAppSourceTypeId, employmentAppSourceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmploymentAppSourceType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (EmploymentAppSourceType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmploymentAppSourceType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(EmploymentAppSourceType newParentTypeId) {
		EmploymentAppSourceType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childEmploymentAppSourceTypes() {
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
	public List<String> employmentApps() {
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
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				return getEmploymentAppSourceTypeId();
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__DESCRIPTION:
				return getDescription();
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__HAS_TABLE:
				return isHasTable();
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
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
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				setEmploymentAppSourceTypeId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE_ID:
				setParentTypeId((EmploymentAppSourceType)newValue);
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
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				setEmploymentAppSourceTypeId(EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE_ID:
				setParentTypeId((EmploymentAppSourceType)null);
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
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				return EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT == null ? employmentAppSourceTypeId != null : !EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT.equals(employmentAppSourceTypeId);
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
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
		result.append(" (employmentAppSourceTypeId: ");
		result.append(employmentAppSourceTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(')');
		return result.toString();
	}

} //EmploymentAppSourceTypeImpl
