/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.tracking.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.marketing.tracking.TrackingCode;
import org.abchip.mimo.biz.marketing.tracking.TrackingCodeType;
import org.abchip.mimo.biz.marketing.tracking.TrackingPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracking Code Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeTypeImpl#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackingCodeTypeImpl extends BizEntityTypeImpl<TrackingCode> implements TrackingCodeType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackingCodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackingPackage.Literals.TRACKING_CODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(TrackingPackage.Literals.TRACKING_CODE_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> trackingCodeOrders() {
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
	public List<String> trackingCodes() {
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
	public String getTrackingCodeTypeId() {
		return (String)eGet(TrackingPackage.Literals.TRACKING_CODE_TYPE__TRACKING_CODE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeTypeId(String newTrackingCodeTypeId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_TYPE__TRACKING_CODE_TYPE_ID, newTrackingCodeTypeId);
	}

} //TrackingCodeTypeImpl
