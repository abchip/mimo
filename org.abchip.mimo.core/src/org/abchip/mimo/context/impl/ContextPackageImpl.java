/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.impl.ApplicationPackageImpl;
import org.abchip.mimo.context.AdapterFactory;
import org.abchip.mimo.context.Authentication;
import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.Capability;
import org.abchip.mimo.context.CapabilityRight;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.ExceptionManager;
import org.abchip.mimo.context.Identity;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.LockType;
import org.abchip.mimo.context.Logger;
import org.abchip.mimo.context.MessageDataField;
import org.abchip.mimo.context.MessageDescription;
import org.abchip.mimo.context.MessageException;
import org.abchip.mimo.context.MessageFile;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.UserClass;
import org.abchip.mimo.context.UserProfile;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.entity.impl.EntityPackageImpl;
import org.abchip.mimo.impl.MimoPackageImpl;
import org.abchip.mimo.net.NetPackage;
import org.abchip.mimo.net.impl.NetPackageImpl;
import org.abchip.mimo.resource.ResourcePackage;
import org.abchip.mimo.resource.impl.ResourcePackageImpl;
import org.abchip.mimo.util.UtilPackage;
import org.abchip.mimo.util.impl.UtilPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextPackageImpl extends EPackageImpl implements ContextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationUserPasswordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationUserTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityLockerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDataFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registryFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capabilityRightEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lockTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageVariableListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.context.ContextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContextPackageImpl() {
		super(eNS_URI, ContextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ContextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContextPackage init() {
		if (isInited) return (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContextPackageImpl theContextPackage = registeredContextPackage instanceof ContextPackageImpl ? (ContextPackageImpl)registeredContextPackage : new ContextPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MimoPackage.eNS_URI);
		MimoPackageImpl theMimoPackage = (MimoPackageImpl)(registeredPackage instanceof MimoPackageImpl ? registeredPackage : MimoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetPackage.eNS_URI);
		NetPackageImpl theNetPackage = (NetPackageImpl)(registeredPackage instanceof NetPackageImpl ? registeredPackage : NetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);
		ResourcePackageImpl theResourcePackage = (ResourcePackageImpl)(registeredPackage instanceof ResourcePackageImpl ? registeredPackage : ResourcePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theContextPackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theNetPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theContextPackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theNetPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContextPackage.eNS_URI, theContextPackage);
		return theContextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdapterFactory() {
		return adapterFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationManager() {
		return authenticationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationUserPassword() {
		return authenticationUserPasswordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationUserPassword_User() {
		return (EAttribute)authenticationUserPasswordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationUserPassword_Password() {
		return (EAttribute)authenticationUserPasswordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationUserPassword_Tenant() {
		return (EAttribute)authenticationUserPasswordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationUserToken() {
		return authenticationUserTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationUserToken_Provider() {
		return (EAttribute)authenticationUserTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationUserToken_AccessToken() {
		return (EAttribute)authenticationUserTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationUserToken_IdToken() {
		return (EAttribute)authenticationUserTokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationUserToken_Picture() {
		return (EAttribute)authenticationUserTokenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationUserToken_User() {
		return (EAttribute)authenticationUserTokenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationAnonymous() {
		return authenticationAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_Rights() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapability_EntityURI() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextRoot() {
		return contextRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextDescription() {
		return contextDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_Anonymous() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_DataPath() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_Id() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_Picture() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_Tenant() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_User() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextProvider() {
		return contextProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityLocker() {
		return entityLockerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExceptionManager() {
		return exceptionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentity() {
		return identityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLockManager() {
		return lockManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogger() {
		return loggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageDescription() {
		return messageDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageDescription_Name() {
		return (EAttribute)messageDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageDescription_Severity() {
		return (EAttribute)messageDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageDescription_MessageHelp() {
		return (EAttribute)messageDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageDescription_MessageText() {
		return (EAttribute)messageDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageDescription_MessageDataFields() {
		return (EReference)messageDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageDataField() {
		return messageDataFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageDataField_OutputMask() {
		return (EAttribute)messageDataFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageDataField_Definition() {
		return (EReference)messageDataFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageFile() {
		return messageFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageFile_Messages() {
		return (EReference)messageFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageFile_Name() {
		return (EAttribute)messageFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessageFile_Text() {
		return (EAttribute)messageFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegistry() {
		return registryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegistryFactory() {
		return registryFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserProfile() {
		return userProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserProfile_JobDescription() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserProfile_Name() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserProfile_Text() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserProfile_UserClass() {
		return (EAttribute)userProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCapabilityRight() {
		return capabilityRightEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLockType() {
		return lockTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUserClass() {
		return userClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMessageVariableList() {
		return messageVariableListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMessageException() {
		return messageExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextFactory getContextFactory() {
		return (ContextFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adapterFactoryEClass = createEClass(ADAPTER_FACTORY);

		authenticationEClass = createEClass(AUTHENTICATION);

		authenticationManagerEClass = createEClass(AUTHENTICATION_MANAGER);

		authenticationUserPasswordEClass = createEClass(AUTHENTICATION_USER_PASSWORD);
		createEAttribute(authenticationUserPasswordEClass, AUTHENTICATION_USER_PASSWORD__USER);
		createEAttribute(authenticationUserPasswordEClass, AUTHENTICATION_USER_PASSWORD__PASSWORD);
		createEAttribute(authenticationUserPasswordEClass, AUTHENTICATION_USER_PASSWORD__TENANT);

		authenticationUserTokenEClass = createEClass(AUTHENTICATION_USER_TOKEN);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__PROVIDER);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__ID_TOKEN);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__PICTURE);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__USER);

		authenticationAnonymousEClass = createEClass(AUTHENTICATION_ANONYMOUS);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__RIGHTS);
		createEAttribute(capabilityEClass, CAPABILITY__ENTITY_URI);

		contextEClass = createEClass(CONTEXT);

		contextDescriptionEClass = createEClass(CONTEXT_DESCRIPTION);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__ANONYMOUS);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__DATA_PATH);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__ID);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__PICTURE);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__TENANT);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__USER);

		contextProviderEClass = createEClass(CONTEXT_PROVIDER);

		contextRootEClass = createEClass(CONTEXT_ROOT);

		entityLockerEClass = createEClass(ENTITY_LOCKER);

		exceptionManagerEClass = createEClass(EXCEPTION_MANAGER);

		identityEClass = createEClass(IDENTITY);

		lockManagerEClass = createEClass(LOCK_MANAGER);

		loggerEClass = createEClass(LOGGER);

		messageDescriptionEClass = createEClass(MESSAGE_DESCRIPTION);
		createEAttribute(messageDescriptionEClass, MESSAGE_DESCRIPTION__NAME);
		createEAttribute(messageDescriptionEClass, MESSAGE_DESCRIPTION__SEVERITY);
		createEAttribute(messageDescriptionEClass, MESSAGE_DESCRIPTION__MESSAGE_HELP);
		createEAttribute(messageDescriptionEClass, MESSAGE_DESCRIPTION__MESSAGE_TEXT);
		createEReference(messageDescriptionEClass, MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS);

		messageDataFieldEClass = createEClass(MESSAGE_DATA_FIELD);
		createEAttribute(messageDataFieldEClass, MESSAGE_DATA_FIELD__OUTPUT_MASK);
		createEReference(messageDataFieldEClass, MESSAGE_DATA_FIELD__DEFINITION);

		messageFileEClass = createEClass(MESSAGE_FILE);
		createEReference(messageFileEClass, MESSAGE_FILE__MESSAGES);
		createEAttribute(messageFileEClass, MESSAGE_FILE__NAME);
		createEAttribute(messageFileEClass, MESSAGE_FILE__TEXT);

		registryEClass = createEClass(REGISTRY);

		registryFactoryEClass = createEClass(REGISTRY_FACTORY);

		userProfileEClass = createEClass(USER_PROFILE);
		createEAttribute(userProfileEClass, USER_PROFILE__JOB_DESCRIPTION);
		createEAttribute(userProfileEClass, USER_PROFILE__NAME);
		createEAttribute(userProfileEClass, USER_PROFILE__TEXT);
		createEAttribute(userProfileEClass, USER_PROFILE__USER_CLASS);

		// Create enums
		capabilityRightEEnum = createEEnum(CAPABILITY_RIGHT);
		lockTypeEEnum = createEEnum(LOCK_TYPE);
		userClassEEnum = createEEnum(USER_CLASS);

		// Create data types
		messageVariableListEDataType = createEDataType(MESSAGE_VARIABLE_LIST);
		messageExceptionEDataType = createEDataType(MESSAGE_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters
		ETypeParameter entityLockerEClass_N = addETypeParameter(entityLockerEClass, "N");
		ETypeParameter identityEClass_T = addETypeParameter(identityEClass, "T");
		ETypeParameter messageDataFieldEClass_DD = addETypeParameter(messageDataFieldEClass, "DD");
		ETypeParameter registryEClass_S = addETypeParameter(registryEClass, "S");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theEntityPackage.getEntityNameable());
		entityLockerEClass_N.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntity());
		identityEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theUtilPackage.getDataDef());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		messageDataFieldEClass_DD.getEBounds().add(g1);

		// Add supertypes to classes
		authenticationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		authenticationUserPasswordEClass.getESuperTypes().add(this.getAuthentication());
		authenticationUserTokenEClass.getESuperTypes().add(this.getAuthentication());
		authenticationAnonymousEClass.getESuperTypes().add(this.getAuthentication());
		capabilityEClass.getESuperTypes().add(theEntityPackage.getEntity());
		contextEClass.getESuperTypes().add(this.getContextProvider());
		contextDescriptionEClass.getESuperTypes().add(theEntityPackage.getEntity());
		contextRootEClass.getESuperTypes().add(this.getContext());
		identityEClass.getESuperTypes().add(theEntityPackage.getEntity());
		messageDescriptionEClass.getESuperTypes().add(theEntityPackage.getEntity());
		messageDescriptionEClass.getESuperTypes().add(theEntityPackage.getTextable());
		messageDataFieldEClass.getESuperTypes().add(theEntityPackage.getEntity());
		messageFileEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());
		messageFileEClass.getESuperTypes().add(theEntityPackage.getTextable());
		userProfileEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());
		userProfileEClass.getESuperTypes().add(theEntityPackage.getTextable());

		// Initialize classes and features; add operations and parameters
		initEClass(adapterFactoryEClass, AdapterFactory.class, "AdapterFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(adapterFactoryEClass, null, "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "adaptable", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "adapterType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(authenticationEClass, Authentication.class, "Authentication", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationManagerEClass, AuthenticationManager.class, "AuthenticationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(authenticationManagerEClass, null, "authenticate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAuthentication(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getIdentity());
		g2 = createEGenericType(this.getAuthentication());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(authenticationUserPasswordEClass, AuthenticationUserPassword.class, "AuthenticationUserPassword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationUserPassword_User(), ecorePackage.getEString(), "user", null, 1, 1, AuthenticationUserPassword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserPassword_Password(), ecorePackage.getEString(), "password", null, 1, 1, AuthenticationUserPassword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserPassword_Tenant(), ecorePackage.getEString(), "tenant", null, 0, 1, AuthenticationUserPassword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationUserTokenEClass, AuthenticationUserToken.class, "AuthenticationUserToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationUserToken_Provider(), ecorePackage.getEString(), "provider", null, 1, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserToken_AccessToken(), ecorePackage.getEString(), "accessToken", null, 1, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserToken_IdToken(), ecorePackage.getEString(), "idToken", null, 1, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserToken_Picture(), ecorePackage.getEString(), "picture", null, 0, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserToken_User(), ecorePackage.getEString(), "user", null, 1, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationAnonymousEClass, AuthenticationAnonymous.class, "AuthenticationAnonymous", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityEClass, Capability.class, "Capability", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_Rights(), this.getCapabilityRight(), "rights", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_EntityURI(), theUtilPackage.getJavaURI(), "entityURI", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(capabilityEClass, ecorePackage.getEString(), "getEntityName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contextEClass, null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "get", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEJavaObject(), "adaptable", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "adapter", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "inject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextEClass, ecorePackage.getEBoolean(), "isClosed", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "invoke", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "A");
		g1 = createEGenericType(theUtilPackage.getJavaAnnotation());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "qualifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "make", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextEClass, null, "registerAdapterFactory", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getAdapterFactory(), "factory", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "adapterType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, theUtilPackage.getJavaURL(), "getResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theUtilPackage.getJavaIOException());

		op = addEOperation(contextEClass, theUtilPackage.getJavaURL(), "getResources", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theUtilPackage.getJavaIOException());

		initEClass(contextDescriptionEClass, ContextDescription.class, "ContextDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextDescription_Anonymous(), ecorePackage.getEBoolean(), "anonymous", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_DataPath(), ecorePackage.getEString(), "dataPath", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_Id(), ecorePackage.getEString(), "id", null, 1, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_Picture(), ecorePackage.getEString(), "picture", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_Tenant(), ecorePackage.getEString(), "tenant", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_User(), ecorePackage.getEString(), "user", null, 1, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(contextDescriptionEClass, ecorePackage.getEBoolean(), "isTenant", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextProviderEClass, ContextProvider.class, "ContextProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contextProviderEClass, this.getContext(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextProviderEClass, this.getContextDescription(), "getContextDescription", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextRootEClass, ContextRoot.class, "ContextRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(contextRootEClass, this.getContext(), "createChildContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextRootEClass, this.getContext(), "createChildContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextDescription(), "contextDescription", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextRootEClass, null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextRootEClass, null, "getAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextRootEClass, null, "getAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(contextRootEClass, null, "loadClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(contextRootEClass, null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "remoteExport", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getJavaDictionary());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dictionary", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityLockerEClass, EntityLocker.class, "EntityLocker", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityLockerEClass, theUtilPackage.getJavaURI(), "getAddress", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityLockerEClass, ecorePackage.getEBoolean(), "isLocked", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityLockerEClass, null, "lock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityLockerEClass, ecorePackage.getEBoolean(), "tryLock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(entityLockerEClass, null, "unlock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exceptionManagerEClass, ExceptionManager.class, "ExceptionManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theUtilPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theUtilPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "variable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theUtilPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileLib", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(identityEClass, Identity.class, "Identity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(identityEClass, theUtilPackage.getJavaPrincipal(), "getJavaPrincipal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lockManagerEClass, LockManager.class, "LockManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lockManagerEClass, null, "getLocker", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "N");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaURI(), "address", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityLocker());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(lockManagerEClass, null, "getLocker", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "N");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "object", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityLocker());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(lockManagerEClass, theUtilPackage.getJavaConcurrentMap(), "getConcurrentMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addETypeParameter(op, "K");
		addETypeParameter(op, "V");
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lockManagerEClass, theUtilPackage.getJavaBlockingQueue(), "getQueue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addETypeParameter(op, "E");
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loggerEClass, Logger.class, "Logger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(loggerEClass, null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(loggerEClass, null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageDescriptionEClass, MessageDescription.class, "MessageDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, MessageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDescription_Severity(), ecorePackage.getEInt(), "severity", null, 0, 1, MessageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDescription_MessageHelp(), ecorePackage.getEString(), "messageHelp", null, 0, 1, MessageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDescription_MessageText(), ecorePackage.getEString(), "messageText", null, 0, 1, MessageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMessageDataField());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMessageDescription_MessageDataFields(), g1, null, "messageDataFields", null, 0, -1, MessageDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageDataFieldEClass, MessageDataField.class, "MessageDataField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageDataField_OutputMask(), ecorePackage.getEString(), "outputMask", null, 0, 1, MessageDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theUtilPackage.getDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMessageDataField_Definition(), g1, null, "definition", null, 0, 1, MessageDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageFileEClass, MessageFile.class, "MessageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageFile_Messages(), this.getMessageDescription(), null, "messages", null, 0, -1, MessageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageFile_Name(), ecorePackage.getEString(), "name", null, 1, 1, MessageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageFile_Text(), ecorePackage.getEString(), "text", null, 1, 1, MessageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(messageFileEClass, this.getMessageDescription(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theUtilPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(registryEClass, org.abchip.mimo.context.Registry.class, "Registry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(registryEClass, null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_S);
		initEOperation(op, g1);

		op = addEOperation(registryEClass, null, "list", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_S);
		initEOperation(op, g1);

		op = addEOperation(registryEClass, null, "lookupByPort", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "port", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_S);
		initEOperation(op, g1);

		op = addEOperation(registryEClass, null, "lookupByVendorVersion", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "vendor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "version", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_S);
		initEOperation(op, g1);

		initEClass(registryFactoryEClass, RegistryFactory.class, "RegistryFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(registryFactoryEClass, null, "createRegistry", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "S");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getRegistry());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(userProfileEClass, UserProfile.class, "UserProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProfile_JobDescription(), ecorePackage.getEString(), "jobDescription", null, 0, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_Name(), ecorePackage.getEString(), "name", null, 1, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_Text(), ecorePackage.getEString(), "text", null, 1, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_UserClass(), this.getUserClass(), "userClass", null, 1, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(capabilityRightEEnum, CapabilityRight.class, "CapabilityRight");
		addEEnumLiteral(capabilityRightEEnum, CapabilityRight.READ);
		addEEnumLiteral(capabilityRightEEnum, CapabilityRight.WRITE);
		addEEnumLiteral(capabilityRightEEnum, CapabilityRight.EXECUTE);

		initEEnum(lockTypeEEnum, LockType.class, "LockType");
		addEEnumLiteral(lockTypeEEnum, LockType.READ);
		addEEnumLiteral(lockTypeEEnum, LockType.WRITE);

		initEEnum(userClassEEnum, UserClass.class, "UserClass");
		addEEnumLiteral(userClassEEnum, UserClass.USER);

		// Initialize data types
		initEDataType(messageVariableListEDataType, Object[].class, "MessageVariableList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageExceptionEDataType, MessageException.class, "MessageException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //ContextPackageImpl
