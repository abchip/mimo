/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(EntityPackage.Literals.FRAME__NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(EntityPackage.Literals.FRAME__NAME, newName);
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
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getKeys() {
		return (List<String>)eGet(EntityPackage.Literals.FRAME__KEYS, true);
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
	@SuppressWarnings("unchecked")
	@Override
	public List<Slot> getSlots() {
		return (List<Slot>)eGet(EntityPackage.Literals.FRAME__SLOTS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSlotsNumber() {
		return (Integer)eGet(EntityPackage.Literals.FRAME__SLOTS_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRoutesNumber() {
		return (Integer)eGet(EntityPackage.Literals.FRAME__ROUTES_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getSuperNames() {
		return (List<String>)eGet(EntityPackage.Literals.FRAME__SUPER_NAMES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextFormula() {
		return (String)eGet(EntityPackage.Literals.FRAME__TEXT_FORMULA, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFormula(String newTextFormula) {
		eSet(EntityPackage.Literals.FRAME__TEXT_FORMULA, newTextFormula);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return (Boolean)eGet(EntityPackage.Literals.FRAME__ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		eSet(EntityPackage.Literals.FRAME__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoIncrement() {
		return (Boolean)eGet(EntityPackage.Literals.FRAME__AUTO_INCREMENT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoIncrement(boolean newAutoIncrement) {
		eSet(EntityPackage.Literals.FRAME__AUTO_INCREMENT, newAutoIncrement);
	}

} // FrameImpl
