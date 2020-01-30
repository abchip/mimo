/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.impl;

import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.impl.EntityImpl;

import org.abchip.mimo.ui.UIPackage;
import org.abchip.mimo.ui.Widget;
import org.abchip.mimo.ui.WidgetPattern;
import org.abchip.mimo.ui.WidgetType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.impl.WidgetImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.impl.WidgetImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.impl.WidgetImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.impl.WidgetImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.impl.WidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.impl.WidgetImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WidgetImpl extends EntityImpl implements Widget {
	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean disabled = DISABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain domain;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected WidgetPattern pattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UIPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabled(boolean newDisabled) {
		boolean oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.WIDGET__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain getDomain() {
		if (domain != null && ((EObject)domain).eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (Domain)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				InternalEObject newDomain = (InternalEObject)domain;
				NotificationChain msgs = oldDomain.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIPackage.WIDGET__DOMAIN, null, null);
				if (newDomain.eInternalContainer() == null) {
					msgs = newDomain.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIPackage.WIDGET__DOMAIN, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UIPackage.WIDGET__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		Domain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIPackage.WIDGET__DOMAIN, oldDomain, newDomain);
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
	public void setDomain(Domain newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIPackage.WIDGET__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIPackage.WIDGET__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.WIDGET__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.WIDGET__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.WIDGET__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetPattern getPattern() {
		if (pattern != null && ((EObject)pattern).eIsProxy()) {
			InternalEObject oldPattern = (InternalEObject)pattern;
			pattern = (WidgetPattern)eResolveProxy(oldPattern);
			if (pattern != oldPattern) {
				InternalEObject newPattern = (InternalEObject)pattern;
				NotificationChain msgs = oldPattern.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIPackage.WIDGET__PATTERN, null, null);
				if (newPattern.eInternalContainer() == null) {
					msgs = newPattern.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIPackage.WIDGET__PATTERN, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UIPackage.WIDGET__PATTERN, oldPattern, pattern));
			}
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetPattern basicGetPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(WidgetPattern newPattern, NotificationChain msgs) {
		WidgetPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIPackage.WIDGET__PATTERN, oldPattern, newPattern);
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
	public void setPattern(WidgetPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIPackage.WIDGET__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIPackage.WIDGET__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UIPackage.WIDGET__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetType getView() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UIPackage.WIDGET__DOMAIN:
				return basicSetDomain(null, msgs);
			case UIPackage.WIDGET__PATTERN:
				return basicSetPattern(null, msgs);
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
			case UIPackage.WIDGET__DISABLED:
				return isDisabled();
			case UIPackage.WIDGET__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case UIPackage.WIDGET__ICON:
				return getIcon();
			case UIPackage.WIDGET__LABEL:
				return getLabel();
			case UIPackage.WIDGET__NAME:
				return getName();
			case UIPackage.WIDGET__PATTERN:
				if (resolve) return getPattern();
				return basicGetPattern();
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
			case UIPackage.WIDGET__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case UIPackage.WIDGET__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case UIPackage.WIDGET__ICON:
				setIcon((String)newValue);
				return;
			case UIPackage.WIDGET__LABEL:
				setLabel((String)newValue);
				return;
			case UIPackage.WIDGET__NAME:
				setName((String)newValue);
				return;
			case UIPackage.WIDGET__PATTERN:
				setPattern((WidgetPattern)newValue);
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
			case UIPackage.WIDGET__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case UIPackage.WIDGET__DOMAIN:
				setDomain((Domain)null);
				return;
			case UIPackage.WIDGET__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case UIPackage.WIDGET__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case UIPackage.WIDGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UIPackage.WIDGET__PATTERN:
				setPattern((WidgetPattern)null);
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
			case UIPackage.WIDGET__DISABLED:
				return disabled != DISABLED_EDEFAULT;
			case UIPackage.WIDGET__DOMAIN:
				return domain != null;
			case UIPackage.WIDGET__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case UIPackage.WIDGET__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case UIPackage.WIDGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UIPackage.WIDGET__PATTERN:
				return pattern != null;
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
		result.append(" (disabled: ");
		result.append(disabled);
		result.append(", icon: ");
		result.append(icon);
		result.append(", label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
