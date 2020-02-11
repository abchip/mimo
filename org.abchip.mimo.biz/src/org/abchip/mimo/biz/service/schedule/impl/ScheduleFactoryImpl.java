/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule.impl;

import org.abchip.mimo.biz.service.schedule.*;
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
public class ScheduleFactoryImpl extends EFactoryImpl implements ScheduleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScheduleFactory init() {
		try {
			ScheduleFactory theScheduleFactory = (ScheduleFactory)EPackage.Registry.INSTANCE.getEFactory(SchedulePackage.eNS_URI);
			if (theScheduleFactory != null) {
				return theScheduleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScheduleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleFactoryImpl() {
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
			case SchedulePackage.JOB_MANAGER_LOCK: return (EObject)createJobManagerLock();
			case SchedulePackage.JOB_SANDBOX: return (EObject)createJobSandbox();
			case SchedulePackage.RECURRENCE_INFO: return (EObject)createRecurrenceInfo();
			case SchedulePackage.RECURRENCE_RULE: return (EObject)createRecurrenceRule();
			case SchedulePackage.RUNTIME_DATA: return (EObject)createRuntimeData();
			case SchedulePackage.TEMPORAL_EXPRESSION: return (EObject)createTemporalExpression();
			case SchedulePackage.TEMPORAL_EXPRESSION_ASSOC: return (EObject)createTemporalExpressionAssoc();
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
	public JobManagerLock createJobManagerLock() {
		JobManagerLockImpl jobManagerLock = new JobManagerLockImpl();
		return jobManagerLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobSandbox createJobSandbox() {
		JobSandboxImpl jobSandbox = new JobSandboxImpl();
		return jobSandbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceInfo createRecurrenceInfo() {
		RecurrenceInfoImpl recurrenceInfo = new RecurrenceInfoImpl();
		return recurrenceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceRule createRecurrenceRule() {
		RecurrenceRuleImpl recurrenceRule = new RecurrenceRuleImpl();
		return recurrenceRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeData createRuntimeData() {
		RuntimeDataImpl runtimeData = new RuntimeDataImpl();
		return runtimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExpression createTemporalExpression() {
		TemporalExpressionImpl temporalExpression = new TemporalExpressionImpl();
		return temporalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExpressionAssoc createTemporalExpressionAssoc() {
		TemporalExpressionAssocImpl temporalExpressionAssoc = new TemporalExpressionAssocImpl();
		return temporalExpressionAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulePackage getSchedulePackage() {
		return (SchedulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchedulePackage getPackage() {
		return SchedulePackage.eINSTANCE;
	}

} //ScheduleFactoryImpl
