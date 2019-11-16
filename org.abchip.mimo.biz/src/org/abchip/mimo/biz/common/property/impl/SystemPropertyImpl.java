/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.property.impl;

import org.abchip.mimo.biz.common.property.PropertyPackage;
import org.abchip.mimo.biz.common.property.SystemProperty;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.property.impl.SystemPropertyImpl#getSystemResourceId <em>System Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.property.impl.SystemPropertyImpl#getSystemPropertyId <em>System Property Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.property.impl.SystemPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.property.impl.SystemPropertyImpl#getSystemPropertyValue <em>System Property Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemPropertyImpl extends BizEntityImpl implements SystemProperty {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getSystemResourceId() <em>System Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemResourceId() <em>System Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemResourceId()
	 * @generated
	 * @ordered
	 */
	protected String systemResourceId = SYSTEM_RESOURCE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSystemPropertyId() <em>System Property Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPropertyId()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_PROPERTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSystemPropertyId() <em>System Property Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPropertyId()
	 * @generated
	 * @ordered
	 */
	protected String systemPropertyId = SYSTEM_PROPERTY_ID_EDEFAULT;
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
	 * The default value of the '{@link #getSystemPropertyValue() <em>System Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_PROPERTY_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSystemPropertyValue() <em>System Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected String systemPropertyValue = SYSTEM_PROPERTY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertyPackage.Literals.SYSTEM_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PropertyPackage.SYSTEM_PROPERTY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemPropertyId() {
		return systemPropertyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemPropertyId(String newSystemPropertyId) {
		String oldSystemPropertyId = systemPropertyId;
		systemPropertyId = newSystemPropertyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_ID, oldSystemPropertyId, systemPropertyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemPropertyValue() {
		return systemPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemPropertyValue(String newSystemPropertyValue) {
		String oldSystemPropertyValue = systemPropertyValue;
		systemPropertyValue = newSystemPropertyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_VALUE, oldSystemPropertyValue, systemPropertyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemResourceId() {
		return systemResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemResourceId(String newSystemResourceId) {
		String oldSystemResourceId = systemResourceId;
		systemResourceId = newSystemResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertyPackage.SYSTEM_PROPERTY__SYSTEM_RESOURCE_ID, oldSystemResourceId, systemResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_RESOURCE_ID:
				return getSystemResourceId();
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_ID:
				return getSystemPropertyId();
			case PropertyPackage.SYSTEM_PROPERTY__DESCRIPTION:
				return getDescription();
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_VALUE:
				return getSystemPropertyValue();
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
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_RESOURCE_ID:
				setSystemResourceId((String)newValue);
				return;
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_ID:
				setSystemPropertyId((String)newValue);
				return;
			case PropertyPackage.SYSTEM_PROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_VALUE:
				setSystemPropertyValue((String)newValue);
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
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_RESOURCE_ID:
				setSystemResourceId(SYSTEM_RESOURCE_ID_EDEFAULT);
				return;
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_ID:
				setSystemPropertyId(SYSTEM_PROPERTY_ID_EDEFAULT);
				return;
			case PropertyPackage.SYSTEM_PROPERTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_VALUE:
				setSystemPropertyValue(SYSTEM_PROPERTY_VALUE_EDEFAULT);
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
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_RESOURCE_ID:
				return SYSTEM_RESOURCE_ID_EDEFAULT == null ? systemResourceId != null : !SYSTEM_RESOURCE_ID_EDEFAULT.equals(systemResourceId);
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_ID:
				return SYSTEM_PROPERTY_ID_EDEFAULT == null ? systemPropertyId != null : !SYSTEM_PROPERTY_ID_EDEFAULT.equals(systemPropertyId);
			case PropertyPackage.SYSTEM_PROPERTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PropertyPackage.SYSTEM_PROPERTY__SYSTEM_PROPERTY_VALUE:
				return SYSTEM_PROPERTY_VALUE_EDEFAULT == null ? systemPropertyValue != null : !SYSTEM_PROPERTY_VALUE_EDEFAULT.equals(systemPropertyValue);
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
		result.append(" (systemResourceId: ");
		result.append(systemResourceId);
		result.append(", systemPropertyId: ");
		result.append(systemPropertyId);
		result.append(", description: ");
		result.append(description);
		result.append(", systemPropertyValue: ");
		result.append(systemPropertyValue);
		result.append(')');
		return result.toString();
	}

} //SystemPropertyImpl
