/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.context.CapabilityRight;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextEventType;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.ContextStatus;
import org.abchip.mimo.context.Identity;
import org.abchip.mimo.context.LockType;
import org.abchip.mimo.context.MessageDataField;
import org.abchip.mimo.context.MessageDescription;
import org.abchip.mimo.context.MessageException;
import org.abchip.mimo.context.MessageFile;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.context.ProviderUser;
import org.abchip.mimo.context.ThreadInfo;
import org.abchip.mimo.context.ThreadStatus;
import org.abchip.mimo.context.UserClass;
import org.abchip.mimo.data.DataDef;
import org.abchip.mimo.entity.Entity;
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
public class ContextFactoryImpl extends EFactoryImpl implements ContextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextFactory init() {
		try {
			ContextFactory theContextFactory = (ContextFactory)EPackage.Registry.INSTANCE.getEFactory(ContextPackage.eNS_URI);
			if (theContextFactory != null) {
				return theContextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextFactoryImpl() {
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
			case ContextPackage.CONTEXT_DESCRIPTION: return (EObject)createContextDescription();
			case ContextPackage.IDENTITY: return (EObject)createIdentity();
			case ContextPackage.MESSAGE_DESCRIPTION: return (EObject)createMessageDescription();
			case ContextPackage.MESSAGE_DATA_FIELD: return (EObject)createMessageDataField();
			case ContextPackage.MESSAGE_FILE: return (EObject)createMessageFile();
			case ContextPackage.PROVIDER_CONFIG: return (EObject)createProviderConfig();
			case ContextPackage.PROVIDER_USER: return (EObject)createProviderUser();
			case ContextPackage.THREAD_INFO: return (EObject)createThreadInfo();
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
			case ContextPackage.CAPABILITY_RIGHT:
				return createCapabilityRightFromString(eDataType, initialValue);
			case ContextPackage.CONTEXT_EVENT_TYPE:
				return createContextEventTypeFromString(eDataType, initialValue);
			case ContextPackage.CONTEXT_STATUS:
				return createContextStatusFromString(eDataType, initialValue);
			case ContextPackage.LOCK_TYPE:
				return createLockTypeFromString(eDataType, initialValue);
			case ContextPackage.THREAD_STATUS:
				return createThreadStatusFromString(eDataType, initialValue);
			case ContextPackage.USER_CLASS:
				return createUserClassFromString(eDataType, initialValue);
			case ContextPackage.MESSAGE_VARIABLE_LIST:
				return createMessageVariableListFromString(eDataType, initialValue);
			case ContextPackage.MESSAGE_EXCEPTION:
				return createMessageExceptionFromString(eDataType, initialValue);
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
			case ContextPackage.CAPABILITY_RIGHT:
				return convertCapabilityRightToString(eDataType, instanceValue);
			case ContextPackage.CONTEXT_EVENT_TYPE:
				return convertContextEventTypeToString(eDataType, instanceValue);
			case ContextPackage.CONTEXT_STATUS:
				return convertContextStatusToString(eDataType, instanceValue);
			case ContextPackage.LOCK_TYPE:
				return convertLockTypeToString(eDataType, instanceValue);
			case ContextPackage.THREAD_STATUS:
				return convertThreadStatusToString(eDataType, instanceValue);
			case ContextPackage.USER_CLASS:
				return convertUserClassToString(eDataType, instanceValue);
			case ContextPackage.MESSAGE_VARIABLE_LIST:
				return convertMessageVariableListToString(eDataType, instanceValue);
			case ContextPackage.MESSAGE_EXCEPTION:
				return convertMessageExceptionToString(eDataType, instanceValue);
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
	public ContextDescription createContextDescription() {
		ContextDescriptionImpl contextDescription = new ContextDescriptionImpl();
		return contextDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Entity> Identity<T> createIdentity() {
		IdentityImpl<T> identity = new IdentityImpl<T>();
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageDescription createMessageDescription() {
		MessageDescriptionImpl messageDescription = new MessageDescriptionImpl();
		return messageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <DD extends DataDef<?>> MessageDataField<DD> createMessageDataField() {
		MessageDataFieldImpl<DD> messageDataField = new MessageDataFieldImpl<DD>();
		return messageDataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageFile createMessageFile() {
		MessageFileImpl messageFile = new MessageFileImpl();
		return messageFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProviderConfig createProviderConfig() {
		ProviderConfigImpl providerConfig = new ProviderConfigImpl();
		return providerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProviderUser createProviderUser() {
		ProviderUserImpl providerUser = new ProviderUserImpl();
		return providerUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadInfo createThreadInfo() {
		ThreadInfoImpl threadInfo = new ThreadInfoImpl();
		return threadInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRight createCapabilityRightFromString(EDataType eDataType, String initialValue) {
		CapabilityRight result = CapabilityRight.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityRightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextEventType createContextEventTypeFromString(EDataType eDataType, String initialValue) {
		ContextEventType result = ContextEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextStatus createContextStatusFromString(EDataType eDataType, String initialValue) {
		ContextStatus result = ContextStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockType createLockTypeFromString(EDataType eDataType, String initialValue) {
		LockType result = LockType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLockTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadStatus createThreadStatusFromString(EDataType eDataType, String initialValue) {
		ThreadStatus result = ThreadStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThreadStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserClass createUserClassFromString(EDataType eDataType, String initialValue) {
		UserClass result = UserClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object[] createMessageVariableListFromString(EDataType eDataType, String initialValue) {
		return (Object[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageVariableListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageException createMessageExceptionFromString(EDataType eDataType, String initialValue) {
		return (MessageException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextPackage getContextPackage() {
		return (ContextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContextPackage getPackage() {
		return ContextPackage.eINSTANCE;
	}

} //ContextFactoryImpl
