/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme.impl;

import org.abchip.mimo.biz.common.theme.ThemePackage;
import org.abchip.mimo.biz.common.theme.VisualThemeResource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Theme Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getVisualThemeId <em>Visual Theme Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getResourceTypeEnumId <em>Resource Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getResourceValue <em>Resource Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualThemeResourceImpl extends BizEntityImpl implements VisualThemeResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getVisualThemeId() <em>Visual Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualThemeId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISUAL_THEME_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVisualThemeId() <em>Visual Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualThemeId()
	 * @generated
	 * @ordered
	 */
	protected String visualThemeId = VISUAL_THEME_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getResourceTypeEnumId() <em>Resource Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TYPE_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResourceTypeEnumId() <em>Resource Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected String resourceTypeEnumId = RESOURCE_TYPE_ENUM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSequenceId() <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSequenceId() <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceId()
	 * @generated
	 * @ordered
	 */
	protected String sequenceId = SEQUENCE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getResourceValue() <em>Resource Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResourceValue() <em>Resource Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceValue()
	 * @generated
	 * @ordered
	 */
	protected String resourceValue = RESOURCE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualThemeResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThemePackage.Literals.VISUAL_THEME_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceValue() {
		return resourceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceValue(String newResourceValue) {
		String oldResourceValue = resourceValue;
		resourceValue = newResourceValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_VALUE, oldResourceValue, resourceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequenceId() {
		return sequenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceId(String newSequenceId) {
		String oldSequenceId = sequenceId;
		sequenceId = newSequenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThemePackage.VISUAL_THEME_RESOURCE__SEQUENCE_ID, oldSequenceId, sequenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisualThemeId() {
		return visualThemeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeId(String newVisualThemeId) {
		String oldVisualThemeId = visualThemeId;
		visualThemeId = newVisualThemeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID, oldVisualThemeId, visualThemeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceTypeEnumId() {
		return resourceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceTypeEnumId(String newResourceTypeEnumId) {
		String oldResourceTypeEnumId = resourceTypeEnumId;
		resourceTypeEnumId = newResourceTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID, oldResourceTypeEnumId, resourceTypeEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID:
				return getVisualThemeId();
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID:
				return getResourceTypeEnumId();
			case ThemePackage.VISUAL_THEME_RESOURCE__SEQUENCE_ID:
				return getSequenceId();
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_VALUE:
				return getResourceValue();
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
			case ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID:
				setVisualThemeId((String)newValue);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID:
				setResourceTypeEnumId((String)newValue);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__SEQUENCE_ID:
				setSequenceId((String)newValue);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_VALUE:
				setResourceValue((String)newValue);
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
			case ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID:
				setVisualThemeId(VISUAL_THEME_ID_EDEFAULT);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID:
				setResourceTypeEnumId(RESOURCE_TYPE_ENUM_ID_EDEFAULT);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__SEQUENCE_ID:
				setSequenceId(SEQUENCE_ID_EDEFAULT);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_VALUE:
				setResourceValue(RESOURCE_VALUE_EDEFAULT);
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
			case ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID:
				return VISUAL_THEME_ID_EDEFAULT == null ? visualThemeId != null : !VISUAL_THEME_ID_EDEFAULT.equals(visualThemeId);
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID:
				return RESOURCE_TYPE_ENUM_ID_EDEFAULT == null ? resourceTypeEnumId != null : !RESOURCE_TYPE_ENUM_ID_EDEFAULT.equals(resourceTypeEnumId);
			case ThemePackage.VISUAL_THEME_RESOURCE__SEQUENCE_ID:
				return SEQUENCE_ID_EDEFAULT == null ? sequenceId != null : !SEQUENCE_ID_EDEFAULT.equals(sequenceId);
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_VALUE:
				return RESOURCE_VALUE_EDEFAULT == null ? resourceValue != null : !RESOURCE_VALUE_EDEFAULT.equals(resourceValue);
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
		result.append(" (visualThemeId: ");
		result.append(visualThemeId);
		result.append(", resourceTypeEnumId: ");
		result.append(resourceTypeEnumId);
		result.append(", sequenceId: ");
		result.append(sequenceId);
		result.append(", resourceValue: ");
		result.append(resourceValue);
		result.append(')');
		return result.toString();
	}

} //VisualThemeResourceImpl
