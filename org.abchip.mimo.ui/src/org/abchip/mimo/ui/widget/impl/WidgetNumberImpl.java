/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.widget.impl;

import org.abchip.mimo.ui.widget.WidgetNumber;
import org.abchip.mimo.ui.widget.WidgetNumberAttribute;
import org.abchip.mimo.ui.widget.WidgetPackage;
import org.abchip.mimo.ui.widget.WidgetType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.widget.impl.WidgetNumberImpl#getView <em>View</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.widget.impl.WidgetNumberImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.widget.impl.WidgetNumberImpl#getPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetNumberImpl extends WidgetImpl implements WidgetNumber {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected static final WidgetType VIEW_EDEFAULT = WidgetType.TEXT;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected WidgetType view = VIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected WidgetNumberAttribute attributes;

	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.Literals.WIDGET_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetType getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.WIDGET_NUMBER__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetNumberAttribute getAttributes() {
		if (attributes != null && ((EObject)attributes).eIsProxy()) {
			InternalEObject oldAttributes = (InternalEObject)attributes;
			attributes = (WidgetNumberAttribute)eResolveProxy(oldAttributes);
			if (attributes != oldAttributes) {
				InternalEObject newAttributes = (InternalEObject)attributes;
				NotificationChain msgs = oldAttributes.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.WIDGET_NUMBER__ATTRIBUTES, null, null);
				if (newAttributes.eInternalContainer() == null) {
					msgs = newAttributes.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.WIDGET_NUMBER__ATTRIBUTES, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WidgetPackage.WIDGET_NUMBER__ATTRIBUTES, oldAttributes, attributes));
			}
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetNumberAttribute basicGetAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(WidgetNumberAttribute newAttributes, NotificationChain msgs) {
		WidgetNumberAttribute oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WidgetPackage.WIDGET_NUMBER__ATTRIBUTES, oldAttributes, newAttributes);
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
	public void setAttributes(WidgetNumberAttribute newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.WIDGET_NUMBER__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.WIDGET_NUMBER__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.WIDGET_NUMBER__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WidgetPackage.WIDGET_NUMBER__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
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
			case WidgetPackage.WIDGET_NUMBER__VIEW:
				return getView();
			case WidgetPackage.WIDGET_NUMBER__ATTRIBUTES:
				if (resolve) return getAttributes();
				return basicGetAttributes();
			case WidgetPackage.WIDGET_NUMBER__PLACEHOLDER:
				return getPlaceholder();
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
			case WidgetPackage.WIDGET_NUMBER__ATTRIBUTES:
				setAttributes((WidgetNumberAttribute)newValue);
				return;
			case WidgetPackage.WIDGET_NUMBER__PLACEHOLDER:
				setPlaceholder((String)newValue);
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
			case WidgetPackage.WIDGET_NUMBER__ATTRIBUTES:
				setAttributes((WidgetNumberAttribute)null);
				return;
			case WidgetPackage.WIDGET_NUMBER__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
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
			case WidgetPackage.WIDGET_NUMBER__VIEW:
				return view != VIEW_EDEFAULT;
			case WidgetPackage.WIDGET_NUMBER__ATTRIBUTES:
				return attributes != null;
			case WidgetPackage.WIDGET_NUMBER__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
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
		result.append(" (view: ");
		result.append(view);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(')');
		return result.toString();
	}

} //WidgetNumberImpl
