/**
 * Copyright (c) 2017, 2020 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.form.impl;

import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.ui.form.FormField;
import org.abchip.mimo.ui.form.FormPackage;
import org.abchip.mimo.ui.widget.Widget;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link org.abchip.mimo.ui.form.impl.FormFieldImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.impl.FormFieldImpl#isKey <em>Key</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.impl.FormFieldImpl#getWidget <em>Widget</em>}</li>
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
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected boolean key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected Widget widget;

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
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(boolean newKey) {
		boolean oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Widget getWidget() {
		if (widget != null && ((EObject)widget).eIsProxy()) {
			InternalEObject oldWidget = (InternalEObject)widget;
			widget = (Widget)eResolveProxy(oldWidget);
			if (widget != oldWidget) {
				InternalEObject newWidget = (InternalEObject)widget;
				NotificationChain msgs = oldWidget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_FIELD__WIDGET, null, null);
				if (newWidget.eInternalContainer() == null) {
					msgs = newWidget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_FIELD__WIDGET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormPackage.FORM_FIELD__WIDGET, oldWidget, widget));
			}
		}
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget basicGetWidget() {
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidget(Widget newWidget, NotificationChain msgs) {
		Widget oldWidget = widget;
		widget = newWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__WIDGET, oldWidget, newWidget);
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
	public void setWidget(Widget newWidget) {
		if (newWidget != widget) {
			NotificationChain msgs = null;
			if (widget != null)
				msgs = ((InternalEObject)widget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_FIELD__WIDGET, null, msgs);
			if (newWidget != null)
				msgs = ((InternalEObject)newWidget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormPackage.FORM_FIELD__WIDGET, null, msgs);
			msgs = basicSetWidget(newWidget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FORM_FIELD__WIDGET, newWidget, newWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormPackage.FORM_FIELD__WIDGET:
				return basicSetWidget(null, msgs);
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
			case FormPackage.FORM_FIELD__GROUP:
				return getGroup();
			case FormPackage.FORM_FIELD__KEY:
				return isKey();
			case FormPackage.FORM_FIELD__WIDGET:
				if (resolve) return getWidget();
				return basicGetWidget();
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
			case FormPackage.FORM_FIELD__GROUP:
				setGroup((String)newValue);
				return;
			case FormPackage.FORM_FIELD__KEY:
				setKey((Boolean)newValue);
				return;
			case FormPackage.FORM_FIELD__WIDGET:
				setWidget((Widget)newValue);
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
			case FormPackage.FORM_FIELD__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case FormPackage.FORM_FIELD__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case FormPackage.FORM_FIELD__WIDGET:
				setWidget((Widget)null);
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
			case FormPackage.FORM_FIELD__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case FormPackage.FORM_FIELD__KEY:
				return key != KEY_EDEFAULT;
			case FormPackage.FORM_FIELD__WIDGET:
				return widget != null;
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
		result.append(", group: ");
		result.append(group);
		result.append(", key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //FormFieldImpl
