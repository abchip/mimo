/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.core.test.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import org.abchip.mimo.core.test.ObjectA;
import org.abchip.mimo.core.test.ObjectB;
import org.abchip.mimo.core.test.TestPackage;

import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.core.test.impl.ObjectAImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.impl.ObjectAImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.impl.ObjectAImpl#getObjectB <em>Object B</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.impl.ObjectAImpl#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.abchip.mimo.core.test.impl.ObjectAImpl#getDynamic2 <em>Dynamic2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectAImpl extends EntityIdentifiableImpl implements ObjectA {
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
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectB() <em>Object B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectB()
	 * @generated
	 * @ordered
	 */
	protected ObjectB objectB;

	/**
	 * The cached setting delegate for the '{@link #getDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DYNAMIC__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TestPackage.Literals.OBJECT_A__DYNAMIC).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getDynamic2() <em>Dynamic2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic2()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DYNAMIC2__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TestPackage.Literals.OBJECT_A__DYNAMIC2).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.OBJECT_A;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.OBJECT_A__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.OBJECT_A__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectB getObjectB() {
		return objectB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectB(ObjectB newObjectB, NotificationChain msgs) {
		ObjectB oldObjectB = objectB;
		objectB = newObjectB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.OBJECT_A__OBJECT_B, oldObjectB, newObjectB);
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
	public void setObjectB(ObjectB newObjectB) {
		if (newObjectB != objectB) {
			NotificationChain msgs = null;
			if (objectB != null)
				msgs = ((InternalEObject)objectB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.OBJECT_A__OBJECT_B, null, msgs);
			if (newObjectB != null)
				msgs = ((InternalEObject)newObjectB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.OBJECT_A__OBJECT_B, null, msgs);
			msgs = basicSetObjectB(newObjectB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.OBJECT_A__OBJECT_B, newObjectB, newObjectB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDynamic() {
		return (String)DYNAMIC__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamic(String newDynamic) {
		DYNAMIC__ESETTING_DELEGATE.dynamicSet(this, null, 0, newDynamic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDynamic2() {
		return (String)DYNAMIC2__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamic2(String newDynamic2) {
		DYNAMIC2__ESETTING_DELEGATE.dynamicSet(this, null, 0, newDynamic2);
	}

	/**
	 * The cached invocation delegate for the '{@link #getTotal() <em>Get Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_TOTAL__EINVOCATION_DELEGATE = ((EOperation.Internal)TestPackage.Literals.OBJECT_A.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotal() {
		try {
			return (BigDecimal)GET_TOTAL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.OBJECT_A__OBJECT_B:
				return basicSetObjectB(null, msgs);
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
			case TestPackage.OBJECT_A__NAME:
				return getName();
			case TestPackage.OBJECT_A__TEXT:
				return getText();
			case TestPackage.OBJECT_A__OBJECT_B:
				return getObjectB();
			case TestPackage.OBJECT_A__DYNAMIC:
				return getDynamic();
			case TestPackage.OBJECT_A__DYNAMIC2:
				return getDynamic2();
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
			case TestPackage.OBJECT_A__NAME:
				setName((String)newValue);
				return;
			case TestPackage.OBJECT_A__TEXT:
				setText((String)newValue);
				return;
			case TestPackage.OBJECT_A__OBJECT_B:
				setObjectB((ObjectB)newValue);
				return;
			case TestPackage.OBJECT_A__DYNAMIC:
				setDynamic((String)newValue);
				return;
			case TestPackage.OBJECT_A__DYNAMIC2:
				setDynamic2((String)newValue);
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
			case TestPackage.OBJECT_A__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.OBJECT_A__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TestPackage.OBJECT_A__OBJECT_B:
				setObjectB((ObjectB)null);
				return;
			case TestPackage.OBJECT_A__DYNAMIC:
				DYNAMIC__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case TestPackage.OBJECT_A__DYNAMIC2:
				DYNAMIC2__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case TestPackage.OBJECT_A__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.OBJECT_A__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TestPackage.OBJECT_A__OBJECT_B:
				return objectB != null;
			case TestPackage.OBJECT_A__DYNAMIC:
				return DYNAMIC__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TestPackage.OBJECT_A__DYNAMIC2:
				return DYNAMIC2__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ObjectAImpl
