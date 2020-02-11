/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.timesheet.impl;

import org.abchip.mimo.biz.workeffort.timesheet.*;
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
public class TimesheetFactoryImpl extends EFactoryImpl implements TimesheetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimesheetFactory init() {
		try {
			TimesheetFactory theTimesheetFactory = (TimesheetFactory)EPackage.Registry.INSTANCE.getEFactory(TimesheetPackage.eNS_URI);
			if (theTimesheetFactory != null) {
				return theTimesheetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimesheetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimesheetFactoryImpl() {
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
			case TimesheetPackage.TIME_ENTRY: return (EObject)createTimeEntry();
			case TimesheetPackage.TIMESHEET: return (EObject)createTimesheet();
			case TimesheetPackage.TIMESHEET_ROLE: return (EObject)createTimesheetRole();
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
	public TimeEntry createTimeEntry() {
		TimeEntryImpl timeEntry = new TimeEntryImpl();
		return timeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timesheet createTimesheet() {
		TimesheetImpl timesheet = new TimesheetImpl();
		return timesheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimesheetRole createTimesheetRole() {
		TimesheetRoleImpl timesheetRole = new TimesheetRoleImpl();
		return timesheetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimesheetPackage getTimesheetPackage() {
		return (TimesheetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimesheetPackage getPackage() {
		return TimesheetPackage.eINSTANCE;
	}

} //TimesheetFactoryImpl
