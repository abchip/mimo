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
	public EOperation getAdapterFactory__GetAdapter__Context_Object_Class() {
		return adapterFactoryEClass.getEOperations().get(0);
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
	public EOperation getAuthenticationManager__Authenticate__Authentication() {
		return authenticationManagerEClass.getEOperations().get(0);
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
	public EOperation getCapability__GetEntityName() {
		return capabilityEClass.getEOperations().get(0);
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
	public EOperation getContext__Close() {
		return contextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__Get__Class() {
		return contextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__GetAdapter__Object_Class() {
		return contextEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__Inject__Object() {
		return contextEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__IsClosed() {
		return contextEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__Invoke__Object_Class() {
		return contextEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__Make__Class() {
		return contextEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__RegisterAdapterFactory__AdapterFactory_Class() {
		return contextEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__Set__Class_Object() {
		return contextEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__Set__String_Object() {
		return contextEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__GetResource__Class_String() {
		return contextEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__GetResources__Class_String() {
		return contextEClass.getEOperations().get(11);
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
	public EOperation getContextRoot__CreateChildContext__String() {
		return contextRootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContextRoot__CreateChildContext__ContextDescription() {
		return contextRootEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContextRoot__Get__Class_String() {
		return contextRootEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContextRoot__GetAll__Class() {
		return contextRootEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContextRoot__GetAll__Class_String() {
		return contextRootEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContextRoot__LoadClass__String() {
		return contextRootEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContextRoot__Set__String_Object_boolean_Dictionary() {
		return contextRootEClass.getEOperations().get(6);
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
	public EOperation getContextDescription__IsTenant() {
		return contextDescriptionEClass.getEOperations().get(0);
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
	public EOperation getContextProvider__GetContext() {
		return contextProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContextProvider__GetContextDescription() {
		return contextProviderEClass.getEOperations().get(1);
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
	public EOperation getEntityLocker__GetAddress() {
		return entityLockerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityLocker__IsLocked__LockType() {
		return entityLockerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityLocker__Lock__LockType() {
		return entityLockerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityLocker__TryLock__long_LockType() {
		return entityLockerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityLocker__Unlock__LockType() {
		return entityLockerEClass.getEOperations().get(4);
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
	public EOperation getExceptionManager__PrepareException__ContextProvider_Enum() {
		return exceptionManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExceptionManager__PrepareException__ContextProvider_Enum_Object() {
		return exceptionManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExceptionManager__PrepareException__ContextProvider_Enum_Object_1() {
		return exceptionManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExceptionManager__PrepareException__ContextProvider_String_String_String_Object() {
		return exceptionManagerEClass.getEOperations().get(3);
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
	public EOperation getIdentity__GetJavaPrincipal() {
		return identityEClass.getEOperations().get(0);
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
	public EOperation getLockManager__GetLocker__ContextProvider_URI() {
		return lockManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLockManager__GetLocker__ContextProvider_EntityNameable() {
		return lockManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLockManager__GetConcurrentMap__ContextProvider_String() {
		return lockManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLockManager__GetQueue__ContextProvider_String() {
		return lockManagerEClass.getEOperations().get(3);
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
	public EOperation getLogger__Debug__String() {
		return loggerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Debug__Throwable() {
		return loggerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Debug__String_Throwable() {
		return loggerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Error__String() {
		return loggerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Error__Throwable() {
		return loggerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Error__String_Throwable() {
		return loggerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Info__String() {
		return loggerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Info__Throwable() {
		return loggerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Info__String_Throwable() {
		return loggerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Warning__String() {
		return loggerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Warning__Throwable() {
		return loggerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLogger__Warning__String_Throwable() {
		return loggerEClass.getEOperations().get(11);
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
	public EOperation getMessageFile__Lookup__String() {
		return messageFileEClass.getEOperations().get(0);
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
	public EOperation getRegistry__Lookup__String() {
		return registryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegistry__List() {
		return registryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegistry__LookupByPort__int() {
		return registryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegistry__LookupByVendorVersion__String_String() {
		return registryEClass.getEOperations().get(3);
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
	public EOperation getRegistryFactory__CreateRegistry__Class() {
		return registryFactoryEClass.getEOperations().get(0);
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
		createEOperation(adapterFactoryEClass, ADAPTER_FACTORY___GET_ADAPTER__CONTEXT_OBJECT_CLASS);

		authenticationEClass = createEClass(AUTHENTICATION);

		authenticationManagerEClass = createEClass(AUTHENTICATION_MANAGER);
		createEOperation(authenticationManagerEClass, AUTHENTICATION_MANAGER___AUTHENTICATE__AUTHENTICATION);

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
		createEOperation(capabilityEClass, CAPABILITY___GET_ENTITY_NAME);

		contextEClass = createEClass(CONTEXT);
		createEOperation(contextEClass, CONTEXT___CLOSE);
		createEOperation(contextEClass, CONTEXT___GET__CLASS);
		createEOperation(contextEClass, CONTEXT___GET_ADAPTER__OBJECT_CLASS);
		createEOperation(contextEClass, CONTEXT___INJECT__OBJECT);
		createEOperation(contextEClass, CONTEXT___IS_CLOSED);
		createEOperation(contextEClass, CONTEXT___INVOKE__OBJECT_CLASS);
		createEOperation(contextEClass, CONTEXT___MAKE__CLASS);
		createEOperation(contextEClass, CONTEXT___REGISTER_ADAPTER_FACTORY__ADAPTERFACTORY_CLASS);
		createEOperation(contextEClass, CONTEXT___SET__CLASS_OBJECT);
		createEOperation(contextEClass, CONTEXT___SET__STRING_OBJECT);
		createEOperation(contextEClass, CONTEXT___GET_RESOURCE__CLASS_STRING);
		createEOperation(contextEClass, CONTEXT___GET_RESOURCES__CLASS_STRING);

		contextDescriptionEClass = createEClass(CONTEXT_DESCRIPTION);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__ANONYMOUS);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__DATA_PATH);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__ID);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__PICTURE);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__TENANT);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__USER);
		createEOperation(contextDescriptionEClass, CONTEXT_DESCRIPTION___IS_TENANT);

		contextProviderEClass = createEClass(CONTEXT_PROVIDER);
		createEOperation(contextProviderEClass, CONTEXT_PROVIDER___GET_CONTEXT);
		createEOperation(contextProviderEClass, CONTEXT_PROVIDER___GET_CONTEXT_DESCRIPTION);

		contextRootEClass = createEClass(CONTEXT_ROOT);
		createEOperation(contextRootEClass, CONTEXT_ROOT___CREATE_CHILD_CONTEXT__STRING);
		createEOperation(contextRootEClass, CONTEXT_ROOT___CREATE_CHILD_CONTEXT__CONTEXTDESCRIPTION);
		createEOperation(contextRootEClass, CONTEXT_ROOT___GET__CLASS_STRING);
		createEOperation(contextRootEClass, CONTEXT_ROOT___GET_ALL__CLASS);
		createEOperation(contextRootEClass, CONTEXT_ROOT___GET_ALL__CLASS_STRING);
		createEOperation(contextRootEClass, CONTEXT_ROOT___LOAD_CLASS__STRING);
		createEOperation(contextRootEClass, CONTEXT_ROOT___SET__STRING_OBJECT_BOOLEAN_DICTIONARY);

		entityLockerEClass = createEClass(ENTITY_LOCKER);
		createEOperation(entityLockerEClass, ENTITY_LOCKER___GET_ADDRESS);
		createEOperation(entityLockerEClass, ENTITY_LOCKER___IS_LOCKED__LOCKTYPE);
		createEOperation(entityLockerEClass, ENTITY_LOCKER___LOCK__LOCKTYPE);
		createEOperation(entityLockerEClass, ENTITY_LOCKER___TRY_LOCK__LONG_LOCKTYPE);
		createEOperation(entityLockerEClass, ENTITY_LOCKER___UNLOCK__LOCKTYPE);

		exceptionManagerEClass = createEClass(EXCEPTION_MANAGER);
		createEOperation(exceptionManagerEClass, EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_ENUM);
		createEOperation(exceptionManagerEClass, EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_ENUM_OBJECT);
		createEOperation(exceptionManagerEClass, EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_ENUM_OBJECT_1);
		createEOperation(exceptionManagerEClass, EXCEPTION_MANAGER___PREPARE_EXCEPTION__CONTEXTPROVIDER_STRING_STRING_STRING_OBJECT);

		identityEClass = createEClass(IDENTITY);
		createEOperation(identityEClass, IDENTITY___GET_JAVA_PRINCIPAL);

		lockManagerEClass = createEClass(LOCK_MANAGER);
		createEOperation(lockManagerEClass, LOCK_MANAGER___GET_LOCKER__CONTEXTPROVIDER_URI);
		createEOperation(lockManagerEClass, LOCK_MANAGER___GET_LOCKER__CONTEXTPROVIDER_ENTITYNAMEABLE);
		createEOperation(lockManagerEClass, LOCK_MANAGER___GET_CONCURRENT_MAP__CONTEXTPROVIDER_STRING);
		createEOperation(lockManagerEClass, LOCK_MANAGER___GET_QUEUE__CONTEXTPROVIDER_STRING);

		loggerEClass = createEClass(LOGGER);
		createEOperation(loggerEClass, LOGGER___DEBUG__STRING);
		createEOperation(loggerEClass, LOGGER___DEBUG__THROWABLE);
		createEOperation(loggerEClass, LOGGER___DEBUG__STRING_THROWABLE);
		createEOperation(loggerEClass, LOGGER___ERROR__STRING);
		createEOperation(loggerEClass, LOGGER___ERROR__THROWABLE);
		createEOperation(loggerEClass, LOGGER___ERROR__STRING_THROWABLE);
		createEOperation(loggerEClass, LOGGER___INFO__STRING);
		createEOperation(loggerEClass, LOGGER___INFO__THROWABLE);
		createEOperation(loggerEClass, LOGGER___INFO__STRING_THROWABLE);
		createEOperation(loggerEClass, LOGGER___WARNING__STRING);
		createEOperation(loggerEClass, LOGGER___WARNING__THROWABLE);
		createEOperation(loggerEClass, LOGGER___WARNING__STRING_THROWABLE);

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
		createEOperation(messageFileEClass, MESSAGE_FILE___LOOKUP__STRING);

		registryEClass = createEClass(REGISTRY);
		createEOperation(registryEClass, REGISTRY___LOOKUP__STRING);
		createEOperation(registryEClass, REGISTRY___LIST);
		createEOperation(registryEClass, REGISTRY___LOOKUP_BY_PORT__INT);
		createEOperation(registryEClass, REGISTRY___LOOKUP_BY_VENDOR_VERSION__STRING_STRING);

		registryFactoryEClass = createEClass(REGISTRY_FACTORY);
		createEOperation(registryFactoryEClass, REGISTRY_FACTORY___CREATE_REGISTRY__CLASS);

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

		// Initialize classes, features, and operations; add parameters
		initEClass(adapterFactoryEClass, AdapterFactory.class, "AdapterFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAdapterFactory__GetAdapter__Context_Object_Class(), null, "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getAuthenticationManager__Authenticate__Authentication(), null, "authenticate", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEOperation(getCapability__GetEntityName(), ecorePackage.getEString(), "getEntityName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getContext__Close(), null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContext__Get__Class(), null, "get", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getContext__GetAdapter__Object_Class(), null, "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getContext__Inject__Object(), null, "inject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContext__IsClosed(), ecorePackage.getEBoolean(), "isClosed", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContext__Invoke__Object_Class(), null, "invoke", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "A");
		g1 = createEGenericType(theUtilPackage.getJavaAnnotation());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "qualifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContext__Make__Class(), null, "make", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getContext__RegisterAdapterFactory__AdapterFactory_Class(), null, "registerAdapterFactory", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaObject());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getAdapterFactory(), "factory", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "adapterType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContext__Set__Class_Object(), null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContext__Set__String_Object(), null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContext__GetResource__Class_String(), theUtilPackage.getJavaURL(), "getResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theUtilPackage.getJavaIOException());

		op = initEOperation(getContext__GetResources__Class_String(), theUtilPackage.getJavaURL(), "getResources", 0, -1, IS_UNIQUE, IS_ORDERED);
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

		initEOperation(getContextDescription__IsTenant(), ecorePackage.getEBoolean(), "isTenant", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextProviderEClass, ContextProvider.class, "ContextProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getContextProvider__GetContext(), this.getContext(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContextProvider__GetContextDescription(), this.getContextDescription(), "getContextDescription", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextRootEClass, ContextRoot.class, "ContextRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getContextRoot__CreateChildContext__String(), this.getContext(), "createChildContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContextRoot__CreateChildContext__ContextDescription(), this.getContext(), "createChildContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextDescription(), "contextDescription", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContextRoot__Get__Class_String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getContextRoot__GetAll__Class(), null, "getAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getContextRoot__GetAll__Class_String(), null, "getAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getContextRoot__LoadClass__String(), null, "loadClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getContextRoot__Set__String_Object_boolean_Dictionary(), null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
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

		initEOperation(getEntityLocker__GetAddress(), theUtilPackage.getJavaURI(), "getAddress", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntityLocker__IsLocked__LockType(), ecorePackage.getEBoolean(), "isLocked", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntityLocker__Lock__LockType(), null, "lock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntityLocker__TryLock__long_LockType(), ecorePackage.getEBoolean(), "tryLock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "time", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntityLocker__Unlock__LockType(), null, "unlock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLockType(), "lockType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exceptionManagerEClass, ExceptionManager.class, "ExceptionManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getExceptionManager__PrepareException__ContextProvider_Enum(), this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theUtilPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExceptionManager__PrepareException__ContextProvider_Enum_Object(), this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theUtilPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "variable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExceptionManager__PrepareException__ContextProvider_Enum_Object_1(), this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theUtilPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExceptionManager__PrepareException__ContextProvider_String_String_String_Object(), this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileLib", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(identityEClass, Identity.class, "Identity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIdentity__GetJavaPrincipal(), theUtilPackage.getJavaPrincipal(), "getJavaPrincipal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lockManagerEClass, LockManager.class, "LockManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLockManager__GetLocker__ContextProvider_URI(), null, "getLocker", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "N");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaURI(), "address", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityLocker());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getLockManager__GetLocker__ContextProvider_EntityNameable(), null, "getLocker", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getLockManager__GetConcurrentMap__ContextProvider_String(), theUtilPackage.getJavaConcurrentMap(), "getConcurrentMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addETypeParameter(op, "K");
		addETypeParameter(op, "V");
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLockManager__GetQueue__ContextProvider_String(), theUtilPackage.getJavaBlockingQueue(), "getQueue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addETypeParameter(op, "E");
		addEParameter(op, this.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loggerEClass, Logger.class, "Logger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getLogger__Debug__String(), null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Debug__Throwable(), null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Debug__String_Throwable(), null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Error__String(), null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Error__Throwable(), null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Error__String_Throwable(), null, "error", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Info__String(), null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Info__Throwable(), null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Info__String_Throwable(), null, "info", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Warning__String(), null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Warning__Throwable(), null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaThrowable(), "throwable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Warning__String_Throwable(), null, "warning", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getMessageFile__Lookup__String(), this.getMessageDescription(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theUtilPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(registryEClass, org.abchip.mimo.context.Registry.class, "Registry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRegistry__Lookup__String(), null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_S);
		initEOperation(op, g1);

		op = initEOperation(getRegistry__List(), null, "list", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_S);
		initEOperation(op, g1);

		op = initEOperation(getRegistry__LookupByPort__int(), null, "lookupByPort", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "port", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_S);
		initEOperation(op, g1);

		op = initEOperation(getRegistry__LookupByVendorVersion__String_String(), null, "lookupByVendorVersion", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "vendor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "version", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_S);
		initEOperation(op, g1);

		initEClass(registryFactoryEClass, RegistryFactory.class, "RegistryFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRegistryFactory__CreateRegistry__Class(), null, "createRegistry", 1, 1, IS_UNIQUE, IS_ORDERED);
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
