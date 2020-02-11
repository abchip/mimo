/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.techdata.impl;

import org.abchip.mimo.biz.manufacturing.techdata.*;
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
public class TechdataFactoryImpl extends EFactoryImpl implements TechdataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TechdataFactory init() {
		try {
			TechdataFactory theTechdataFactory = (TechdataFactory)EPackage.Registry.INSTANCE.getEFactory(TechdataPackage.eNS_URI);
			if (theTechdataFactory != null) {
				return theTechdataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TechdataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechdataFactoryImpl() {
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
			case TechdataPackage.TECH_DATA_CALENDAR: return (EObject)createTechDataCalendar();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_DAY: return (EObject)createTechDataCalendarExcDay();
			case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK: return (EObject)createTechDataCalendarExcWeek();
			case TechdataPackage.TECH_DATA_CALENDAR_WEEK: return (EObject)createTechDataCalendarWeek();
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
	public TechDataCalendar createTechDataCalendar() {
		TechDataCalendarImpl techDataCalendar = new TechDataCalendarImpl();
		return techDataCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendarExcDay createTechDataCalendarExcDay() {
		TechDataCalendarExcDayImpl techDataCalendarExcDay = new TechDataCalendarExcDayImpl();
		return techDataCalendarExcDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendarExcWeek createTechDataCalendarExcWeek() {
		TechDataCalendarExcWeekImpl techDataCalendarExcWeek = new TechDataCalendarExcWeekImpl();
		return techDataCalendarExcWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendarWeek createTechDataCalendarWeek() {
		TechDataCalendarWeekImpl techDataCalendarWeek = new TechDataCalendarWeekImpl();
		return techDataCalendarWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechdataPackage getTechdataPackage() {
		return (TechdataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TechdataPackage getPackage() {
		return TechdataPackage.eINSTANCE;
	}

} //TechdataFactoryImpl
