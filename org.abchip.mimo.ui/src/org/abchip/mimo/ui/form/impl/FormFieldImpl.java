/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.form.impl;

import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.impl.EntityImpl;

import org.abchip.mimo.ui.form.FormField;
import org.abchip.mimo.ui.form.FormPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.form.impl.FormFieldImpl#isContextMenu <em>Context Menu</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.impl.FormFieldImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.impl.FormFieldImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.impl.FormFieldImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.impl.FormFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.impl.FormFieldImpl#getView <em>View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormFieldImpl extends EntityImpl implements FormField {
	/**
	 * The default value of the '{@link #isContextMenu() <em>Context Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextMenu()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTEXT_MENU_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContextMenu() <em>Context Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextMenu()
	 * @generated
	 * @ordered
	 */
	protected boolean contextMenu = CONTEXT_MENU_EDEFAULT;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected String view = VIEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.Literals.FORM_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContextMenu() {
		return contextMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextMenu(boolean newContextMenu) {
		boolean oldContextMenu = contextMenu;
		contextMenu = newContextMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__CONTEXT_MENU, oldContextMenu, contextMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setView(String newView) {
		String oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__VIEW, oldView, view));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain getDomain() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__DOMAIN, oldDomain, newDomain);
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
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_FIELD__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_FIELD__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__DOMAIN, newDomain, newDomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.FORM_FIELD__DOMAIN:
				return basicSetDomain(null, msgs);
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
			case FormPackage.FORM_FIELD__CONTEXT_MENU:
				return isContextMenu();
			case FormPackage.FORM_FIELD__DOMAIN:
				return getDomain();
			case FormPackage.FORM_FIELD__ICON:
				return getIcon();
			case FormPackage.FORM_FIELD__LABEL:
				return getLabel();
			case FormPackage.FORM_FIELD__NAME:
				return getName();
			case FormPackage.FORM_FIELD__VIEW:
				return getView();
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
			case FormPackage.FORM_FIELD__CONTEXT_MENU:
				setContextMenu((Boolean)newValue);
				return;
			case FormPackage.FORM_FIELD__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case FormPackage.FORM_FIELD__ICON:
				setIcon((String)newValue);
				return;
			case FormPackage.FORM_FIELD__LABEL:
				setLabel((String)newValue);
				return;
			case FormPackage.FORM_FIELD__NAME:
				setName((String)newValue);
				return;
			case FormPackage.FORM_FIELD__VIEW:
				setView((String)newValue);
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
			case FormPackage.FORM_FIELD__CONTEXT_MENU:
				setContextMenu(CONTEXT_MENU_EDEFAULT);
				return;
			case FormPackage.FORM_FIELD__DOMAIN:
				setDomain((Domain)null);
				return;
			case FormPackage.FORM_FIELD__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case FormPackage.FORM_FIELD__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormPackage.FORM_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.FORM_FIELD__VIEW:
				setView(VIEW_EDEFAULT);
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
			case FormPackage.FORM_FIELD__CONTEXT_MENU:
				return contextMenu != CONTEXT_MENU_EDEFAULT;
			case FormPackage.FORM_FIELD__DOMAIN:
				return domain != null;
			case FormPackage.FORM_FIELD__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case FormPackage.FORM_FIELD__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormPackage.FORM_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.FORM_FIELD__VIEW:
				return VIEW_EDEFAULT == null ? view != null : !VIEW_EDEFAULT.equals(view);
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
		result.append(" (contextMenu: ");
		result.append(contextMenu);
		result.append(", icon: ");
		result.append(icon);
		result.append(", label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(", view: ");
		result.append(view);
		result.append(')');
		return result.toString();
	}

} //FormFieldImpl
