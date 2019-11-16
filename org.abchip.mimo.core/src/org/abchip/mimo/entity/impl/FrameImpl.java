/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Frame</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.impl.FrameImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FrameImpl#isAutoIncrement <em>Auto Increment</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FrameImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FrameImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FrameImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FrameImpl#getSlotsNumber <em>Slots Number</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FrameImpl#getRoutesNumber <em>Routes Number</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FrameImpl#getSuperNames <em>Super Names</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.impl.FrameImpl#getTextFormula <em>Text Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FrameImpl<E extends Entity> extends EntityNameableImpl implements Frame<E> {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;
	/**
	 * The default value of the '{@link #isAutoIncrement() <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_INCREMENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAutoIncrement() <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoIncrement()
	 * @generated
	 * @ordered
	 */
	protected boolean autoIncrement = AUTO_INCREMENT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keys;
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
	 * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slots;
	/**
	 * The default value of the '{@link #getSlotsNumber() <em>Slots Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotsNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SLOTS_NUMBER_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSlotsNumber() <em>Slots Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotsNumber()
	 * @generated
	 * @ordered
	 */
	protected int slotsNumber = SLOTS_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoutesNumber() <em>Routes Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutesNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUTES_NUMBER_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getRoutesNumber() <em>Routes Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutesNumber()
	 * @generated
	 * @ordered
	 */
	protected int routesNumber = ROUTES_NUMBER_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSuperNames() <em>Super Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> superNames;
	/**
	 * The default value of the '{@link #getTextFormula() <em>Text Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FORMULA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTextFormula() <em>Text Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormula()
	 * @generated
	 * @ordered
	 */
	protected String textFormula = TEXT_FORMULA_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.FRAME;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract Frame<? super E> ako();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract E createEntity();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getKeys() {
		if (keys == null) {
			keys = new BasicInternalEList<String>(String.class);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract Slot getSlot(String name);
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Slot> getSlots() {
		if (slots == null) {
			slots = new BasicInternalEList<Slot>(Slot.class);
		}
		return slots;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSlotsNumber() {
		return slotsNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRoutesNumber() {
		return routesNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSuperNames() {
		if (superNames == null) {
			superNames = new BasicInternalEList<String>(String.class);
		}
		return superNames;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextFormula() {
		return textFormula;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFormula(String newTextFormula) {
		textFormula = newTextFormula;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<Frame<? super E>> getSuperFrames() {

		List<Frame<? super E>> frames = new ArrayList<Frame<? super E>>();
		addFrames(this, frames);

		return frames;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract Object getValue(Entity entity, String slotName, boolean resolve);

	private void addFrames(Frame<? super E> frame, List<Frame<? super E>> frames) {
		Frame<? super E> ako = frame.ako();
		if (ako != null) {
			frames.add(ako);
			addFrames(ako, frames);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract void setValue(Entity entity, String slotName, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.FRAME__SLOTS:
				return ((InternalEList<?>)getSlots()).basicRemove(otherEnd, msgs);
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
			case EntityPackage.FRAME__ABSTRACT:
				return isAbstract();
			case EntityPackage.FRAME__AUTO_INCREMENT:
				return isAutoIncrement();
			case EntityPackage.FRAME__KEYS:
				return getKeys();
			case EntityPackage.FRAME__NAME:
				return getName();
			case EntityPackage.FRAME__SLOTS:
				return getSlots();
			case EntityPackage.FRAME__SLOTS_NUMBER:
				return getSlotsNumber();
			case EntityPackage.FRAME__ROUTES_NUMBER:
				return getRoutesNumber();
			case EntityPackage.FRAME__SUPER_NAMES:
				return getSuperNames();
			case EntityPackage.FRAME__TEXT_FORMULA:
				return getTextFormula();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.FRAME__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case EntityPackage.FRAME__AUTO_INCREMENT:
				setAutoIncrement((Boolean)newValue);
				return;
			case EntityPackage.FRAME__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends String>)newValue);
				return;
			case EntityPackage.FRAME__NAME:
				setName((String)newValue);
				return;
			case EntityPackage.FRAME__SLOTS:
				getSlots().clear();
				getSlots().addAll((Collection<? extends Slot>)newValue);
				return;
			case EntityPackage.FRAME__TEXT_FORMULA:
				setTextFormula((String)newValue);
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
			case EntityPackage.FRAME__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case EntityPackage.FRAME__AUTO_INCREMENT:
				setAutoIncrement(AUTO_INCREMENT_EDEFAULT);
				return;
			case EntityPackage.FRAME__KEYS:
				getKeys().clear();
				return;
			case EntityPackage.FRAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntityPackage.FRAME__SLOTS:
				getSlots().clear();
				return;
			case EntityPackage.FRAME__TEXT_FORMULA:
				setTextFormula(TEXT_FORMULA_EDEFAULT);
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
			case EntityPackage.FRAME__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case EntityPackage.FRAME__AUTO_INCREMENT:
				return autoIncrement != AUTO_INCREMENT_EDEFAULT;
			case EntityPackage.FRAME__KEYS:
				return keys != null && !keys.isEmpty();
			case EntityPackage.FRAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntityPackage.FRAME__SLOTS:
				return slots != null && !slots.isEmpty();
			case EntityPackage.FRAME__SLOTS_NUMBER:
				return slotsNumber != SLOTS_NUMBER_EDEFAULT;
			case EntityPackage.FRAME__ROUTES_NUMBER:
				return routesNumber != ROUTES_NUMBER_EDEFAULT;
			case EntityPackage.FRAME__SUPER_NAMES:
				return superNames != null && !superNames.isEmpty();
			case EntityPackage.FRAME__TEXT_FORMULA:
				return TEXT_FORMULA_EDEFAULT == null ? textFormula != null : !TEXT_FORMULA_EDEFAULT.equals(textFormula);
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", autoIncrement: ");
		result.append(autoIncrement);
		result.append(", keys: ");
		result.append(keys);
		result.append(", name: ");
		result.append(name);
		result.append(", slotsNumber: ");
		result.append(slotsNumber);
		result.append(", routesNumber: ");
		result.append(routesNumber);
		result.append(", superNames: ");
		result.append(superNames);
		result.append(", textFormula: ");
		result.append(textFormula);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		abstract_ = newAbstract;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoIncrement() {
		return autoIncrement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoIncrement(boolean newAutoIncrement) {
		autoIncrement = newAutoIncrement;
	}

} // FrameImpl
