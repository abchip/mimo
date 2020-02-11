/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.tracking.impl;

import org.abchip.mimo.biz.marketing.tracking.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrackingFactoryImpl extends EFactoryImpl implements TrackingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrackingFactory init() {
		try {
			TrackingFactory theTrackingFactory = (TrackingFactory)EPackage.Registry.INSTANCE.getEFactory(TrackingPackage.eNS_URI);
			if (theTrackingFactory != null) {
				return theTrackingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TrackingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TrackingPackage.TRACKING_CODE: return (EObject)createTrackingCode();
			case TrackingPackage.TRACKING_CODE_ORDER: return (EObject)createTrackingCodeOrder();
			case TrackingPackage.TRACKING_CODE_ORDER_RETURN: return (EObject)createTrackingCodeOrderReturn();
			case TrackingPackage.TRACKING_CODE_TYPE: return (EObject)createTrackingCodeType();
			case TrackingPackage.TRACKING_CODE_VISIT: return (EObject)createTrackingCodeVisit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCode createTrackingCode() {
		TrackingCodeImpl trackingCode = new TrackingCodeImpl();
		return trackingCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCodeOrder createTrackingCodeOrder() {
		TrackingCodeOrderImpl trackingCodeOrder = new TrackingCodeOrderImpl();
		return trackingCodeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCodeOrderReturn createTrackingCodeOrderReturn() {
		TrackingCodeOrderReturnImpl trackingCodeOrderReturn = new TrackingCodeOrderReturnImpl();
		return trackingCodeOrderReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCodeType createTrackingCodeType() {
		TrackingCodeTypeImpl trackingCodeType = new TrackingCodeTypeImpl();
		return trackingCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCodeVisit createTrackingCodeVisit() {
		TrackingCodeVisitImpl trackingCodeVisit = new TrackingCodeVisitImpl();
		return trackingCodeVisit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingPackage getTrackingPackage() {
		return (TrackingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TrackingPackage getPackage() {
		return TrackingPackage.eINSTANCE;
	}

} //TrackingFactoryImpl
