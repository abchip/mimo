/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme.impl;

import org.abchip.mimo.biz.common.theme.ThemePackage;
import org.abchip.mimo.biz.common.theme.VisualTheme;
import org.abchip.mimo.biz.common.theme.VisualThemeSet;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Theme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl#getVisualThemeId <em>Visual Theme Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl#getVisualThemeSetId <em>Visual Theme Set Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualThemeImpl extends BizEntityImpl implements VisualTheme {
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
	 * The cached value of the '{@link #getVisualThemeSetId() <em>Visual Theme Set Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualThemeSetId()
	 * @generated
	 * @ordered
	 */
	protected VisualThemeSet visualThemeSetId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualThemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThemePackage.Literals.VISUAL_THEME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ThemePackage.VISUAL_THEME__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualThemeSet getVisualThemeSetId() {
		if (visualThemeSetId != null && ((EObject)visualThemeSetId).eIsProxy()) {
			InternalEObject oldVisualThemeSetId = (InternalEObject)visualThemeSetId;
			visualThemeSetId = (VisualThemeSet)eResolveProxy(oldVisualThemeSetId);
			if (visualThemeSetId != oldVisualThemeSetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThemePackage.VISUAL_THEME__VISUAL_THEME_SET_ID, oldVisualThemeSetId, visualThemeSetId));
			}
		}
		return visualThemeSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualThemeSet basicGetVisualThemeSetId() {
		return visualThemeSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeSetId(VisualThemeSet newVisualThemeSetId) {
		VisualThemeSet oldVisualThemeSetId = visualThemeSetId;
		visualThemeSetId = newVisualThemeSetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThemePackage.VISUAL_THEME__VISUAL_THEME_SET_ID, oldVisualThemeSetId, visualThemeSetId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ThemePackage.VISUAL_THEME__VISUAL_THEME_ID, oldVisualThemeId, visualThemeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThemePackage.VISUAL_THEME__VISUAL_THEME_ID:
				return getVisualThemeId();
			case ThemePackage.VISUAL_THEME__DESCRIPTION:
				return getDescription();
			case ThemePackage.VISUAL_THEME__VISUAL_THEME_SET_ID:
				if (resolve) return getVisualThemeSetId();
				return basicGetVisualThemeSetId();
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
			case ThemePackage.VISUAL_THEME__VISUAL_THEME_ID:
				setVisualThemeId((String)newValue);
				return;
			case ThemePackage.VISUAL_THEME__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ThemePackage.VISUAL_THEME__VISUAL_THEME_SET_ID:
				setVisualThemeSetId((VisualThemeSet)newValue);
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
			case ThemePackage.VISUAL_THEME__VISUAL_THEME_ID:
				setVisualThemeId(VISUAL_THEME_ID_EDEFAULT);
				return;
			case ThemePackage.VISUAL_THEME__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ThemePackage.VISUAL_THEME__VISUAL_THEME_SET_ID:
				setVisualThemeSetId((VisualThemeSet)null);
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
			case ThemePackage.VISUAL_THEME__VISUAL_THEME_ID:
				return VISUAL_THEME_ID_EDEFAULT == null ? visualThemeId != null : !VISUAL_THEME_ID_EDEFAULT.equals(visualThemeId);
			case ThemePackage.VISUAL_THEME__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ThemePackage.VISUAL_THEME__VISUAL_THEME_SET_ID:
				return visualThemeSetId != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //VisualThemeImpl
