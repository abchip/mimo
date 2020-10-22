/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Find;
import org.abchip.mimo.entity.FindResponse;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.abchip.mimo.util.Lists;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Find</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.impl.FindImpl#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindImpl<E extends EntityIdentifiable> extends ServiceRequestImpl<FindResponse<E>> implements Find<E> {
	/**
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected String frame = FRAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.FIND;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrame(String newFrame) {
		String oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.FIND__FRAME, oldFrame, frame));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.FIND__FRAME:
				return getFrame();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.FIND__FRAME:
				setFrame((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityPackage.FIND__FRAME:
				setFrame(FRAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityPackage.FIND__FRAME:
				return FRAME_EDEFAULT == null ? frame != null : !FRAME_EDEFAULT.equals(frame);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (frame: ");
		result.append(frame);
		result.append(')');
		return result.toString();
	}

	@Override
	public FindResponse<E> call() throws Exception {

		Context context = this.getContext();
		FindResponse<E> response = this.buildResponse();

		ResourceReader<E> entityReader = context.getResourceManager().getResourceReader(this.getFrame());
		try (EntityIterator<E> entityIterator = entityReader.find()) {
			Lists.addAll(response.getEntities(), entityIterator);
		}

		return response;
	}

} // FindImpl
