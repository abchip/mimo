/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.server.impl;

import org.abchip.mimo.server.Job;
import org.abchip.mimo.server.JobCapability;
import org.abchip.mimo.server.JobDescription;
import org.abchip.mimo.server.JobEvent;
import org.abchip.mimo.server.JobEventType;
import org.abchip.mimo.server.JobLog;
import org.abchip.mimo.server.JobLogEntry;
import org.abchip.mimo.server.JobMessage;
import org.abchip.mimo.server.JobReference;
import org.abchip.mimo.server.JobRunInfo;
import org.abchip.mimo.server.JobStatus;
import org.abchip.mimo.server.JobType;
import org.abchip.mimo.server.ServerException;
import org.abchip.mimo.server.ServerFactory;
import org.abchip.mimo.server.ServerPackage;
import org.abchip.mimo.server.SystemEvent;
import org.abchip.mimo.server.SystemEventType;
import org.abchip.mimo.server.SystemStatus;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ServerFactoryImpl extends EFactoryImpl implements ServerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServerFactory init() {
		try {
			ServerFactory theServerFactory = (ServerFactory)EPackage.Registry.INSTANCE.getEFactory(ServerPackage.eNS_URI);
			if (theServerFactory != null) {
				return theServerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerFactoryImpl() {
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
			case ServerPackage.JOB: return (EObject)createJob();
			case ServerPackage.JOB_CAPABILITY: return (EObject)createJobCapability();
			case ServerPackage.JOB_DESCRIPTION: return (EObject)createJobDescription();
			case ServerPackage.JOB_EVENT: return (EObject)createJobEvent();
			case ServerPackage.JOB_LOG: return (EObject)createJobLog();
			case ServerPackage.JOB_LOG_ENTRY: return (EObject)createJobLogEntry();
			case ServerPackage.JOB_MESSAGE: return (EObject)createJobMessage();
			case ServerPackage.JOB_REFERENCE: return (EObject)createJobReference();
			case ServerPackage.JOB_RUN_INFO: return (EObject)createJobRunInfo();
			case ServerPackage.SYSTEM: return (EObject)createSystem();
			case ServerPackage.SYSTEM_EVENT: return (EObject)createSystemEvent();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ServerPackage.JOB_EVENT_TYPE:
				return createJobEventTypeFromString(eDataType, initialValue);
			case ServerPackage.JOB_STATUS:
				return createJobStatusFromString(eDataType, initialValue);
			case ServerPackage.JOB_TYPE:
				return createJobTypeFromString(eDataType, initialValue);
			case ServerPackage.SYSTEM_EVENT_TYPE:
				return createSystemEventTypeFromString(eDataType, initialValue);
			case ServerPackage.SYSTEM_STATUS:
				return createSystemStatusFromString(eDataType, initialValue);
			case ServerPackage.SERVER_EXCEPTION:
				return createServerExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ServerPackage.JOB_EVENT_TYPE:
				return convertJobEventTypeToString(eDataType, instanceValue);
			case ServerPackage.JOB_STATUS:
				return convertJobStatusToString(eDataType, instanceValue);
			case ServerPackage.JOB_TYPE:
				return convertJobTypeToString(eDataType, instanceValue);
			case ServerPackage.SYSTEM_EVENT_TYPE:
				return convertSystemEventTypeToString(eDataType, instanceValue);
			case ServerPackage.SYSTEM_STATUS:
				return convertSystemStatusToString(eDataType, instanceValue);
			case ServerPackage.SERVER_EXCEPTION:
				return convertServerExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobCapability createJobCapability() {
		JobCapabilityImpl jobCapability = new JobCapabilityImpl();
		return jobCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobDescription createJobDescription() {
		JobDescriptionImpl jobDescription = new JobDescriptionImpl();
		return jobDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobEvent createJobEvent() {
		JobEventImpl jobEvent = new JobEventImpl();
		return jobEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobLog createJobLog() {
		JobLogImpl jobLog = new JobLogImpl();
		return jobLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobLogEntry createJobLogEntry() {
		JobLogEntryImpl jobLogEntry = new JobLogEntryImpl();
		return jobLogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobMessage createJobMessage() {
		JobMessageImpl jobMessage = new JobMessageImpl();
		return jobMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobReference createJobReference() {
		JobReferenceImpl jobReference = new JobReferenceImpl();
		return jobReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobRunInfo createJobRunInfo() {
		JobRunInfoImpl jobRunInfo = new JobRunInfoImpl();
		return jobRunInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.server.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemEvent createSystemEvent() {
		SystemEventImpl systemEvent = new SystemEventImpl();
		return systemEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEventType createJobEventTypeFromString(EDataType eDataType, String initialValue) {
		JobEventType result = JobEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobStatus createJobStatusFromString(EDataType eDataType, String initialValue) {
		JobStatus result = JobStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobType createJobTypeFromString(EDataType eDataType, String initialValue) {
		JobType result = JobType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemEventType createSystemEventTypeFromString(EDataType eDataType, String initialValue) {
		SystemEventType result = SystemEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStatus createSystemStatusFromString(EDataType eDataType, String initialValue) {
		SystemStatus result = SystemStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerException createServerExceptionFromString(EDataType eDataType, String initialValue) {
		return (ServerException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerPackage getServerPackage() {
		return (ServerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServerPackage getPackage() {
		return ServerPackage.eINSTANCE;
	}

} //ServerFactoryImpl
