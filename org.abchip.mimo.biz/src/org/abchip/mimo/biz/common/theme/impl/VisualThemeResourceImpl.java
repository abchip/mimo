/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.theme.ThemePackage;
import org.abchip.mimo.biz.common.theme.VisualTheme;
import org.abchip.mimo.biz.common.theme.VisualThemeResource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Theme Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getResourceValue <em>Resource Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getVisualThemeId <em>Visual Theme Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getResourceTypeEnumId <em>Resource Type Enum Id</em>}</li>
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
	 * The cached value of the '{@link #getVisualThemeId() <em>Visual Theme Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualThemeId()
	 * @generated
	 * @ordered
	 */
	protected VisualTheme visualThemeId;
	/**
	 * The cached value of the '{@link #getResourceTypeEnumId() <em>Resource Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration resourceTypeEnumId;

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
	public VisualTheme getVisualThemeId() {
		if (visualThemeId != null && ((EObject)visualThemeId).eIsProxy()) {
			InternalEObject oldVisualThemeId = (InternalEObject)visualThemeId;
			visualThemeId = (VisualTheme)eResolveProxy(oldVisualThemeId);
			if (visualThemeId != oldVisualThemeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID, oldVisualThemeId, visualThemeId));
			}
		}
		return visualThemeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualTheme basicGetVisualThemeId() {
		return visualThemeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeId(VisualTheme newVisualThemeId) {
		VisualTheme oldVisualThemeId = visualThemeId;
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
	public Enumeration getResourceTypeEnumId() {
		if (resourceTypeEnumId != null && ((EObject)resourceTypeEnumId).eIsProxy()) {
			InternalEObject oldResourceTypeEnumId = (InternalEObject)resourceTypeEnumId;
			resourceTypeEnumId = (Enumeration)eResolveProxy(oldResourceTypeEnumId);
			if (resourceTypeEnumId != oldResourceTypeEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID, oldResourceTypeEnumId, resourceTypeEnumId));
			}
		}
		return resourceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetResourceTypeEnumId() {
		return resourceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceTypeEnumId(Enumeration newResourceTypeEnumId) {
		Enumeration oldResourceTypeEnumId = resourceTypeEnumId;
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
			case ThemePackage.VISUAL_THEME_RESOURCE__SEQUENCE_ID:
				return getSequenceId();
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_VALUE:
				return getResourceValue();
			case ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID:
				if (resolve) return getVisualThemeId();
				return basicGetVisualThemeId();
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID:
				if (resolve) return getResourceTypeEnumId();
				return basicGetResourceTypeEnumId();
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
			case ThemePackage.VISUAL_THEME_RESOURCE__SEQUENCE_ID:
				setSequenceId((String)newValue);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_VALUE:
				setResourceValue((String)newValue);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID:
				setVisualThemeId((VisualTheme)newValue);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID:
				setResourceTypeEnumId((Enumeration)newValue);
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
			case ThemePackage.VISUAL_THEME_RESOURCE__SEQUENCE_ID:
				setSequenceId(SEQUENCE_ID_EDEFAULT);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_VALUE:
				setResourceValue(RESOURCE_VALUE_EDEFAULT);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID:
				setVisualThemeId((VisualTheme)null);
				return;
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID:
				setResourceTypeEnumId((Enumeration)null);
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
			case ThemePackage.VISUAL_THEME_RESOURCE__SEQUENCE_ID:
				return SEQUENCE_ID_EDEFAULT == null ? sequenceId != null : !SEQUENCE_ID_EDEFAULT.equals(sequenceId);
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_VALUE:
				return RESOURCE_VALUE_EDEFAULT == null ? resourceValue != null : !RESOURCE_VALUE_EDEFAULT.equals(resourceValue);
			case ThemePackage.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID:
				return visualThemeId != null;
			case ThemePackage.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID:
				return resourceTypeEnumId != null;
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
		result.append(" (sequenceId: ");
		result.append(sequenceId);
		result.append(", resourceValue: ");
		result.append(resourceValue);
		result.append(')');
		return result.toString();
	}

} //VisualThemeResourceImpl
