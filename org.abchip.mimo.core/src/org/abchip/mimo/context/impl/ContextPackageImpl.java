/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.application.ApplicationPackage;

import org.abchip.mimo.application.impl.ApplicationPackageImpl;
import org.abchip.mimo.authentication.AuthenticationPackage;
import org.abchip.mimo.authentication.impl.AuthenticationPackageImpl;
import org.abchip.mimo.context.AdapterFactory;
import org.abchip.mimo.context.Capability;
import org.abchip.mimo.context.CapabilityRight;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextEvent;
import org.abchip.mimo.context.ContextEventType;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextListener;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.ContextStatus;
import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.ExceptionManager;
import org.abchip.mimo.context.Factory;
import org.abchip.mimo.context.Identity;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.LockType;
import org.abchip.mimo.context.MessageDataField;
import org.abchip.mimo.context.MessageDescription;
import org.abchip.mimo.context.MessageException;
import org.abchip.mimo.context.MessageFile;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.context.ProviderUser;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.context.ThreadInfo;
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.context.ThreadStatus;
import org.abchip.mimo.context.UserClass;
import org.abchip.mimo.context.UserProfile;

import org.abchip.mimo.data.DataPackage;

import org.abchip.mimo.data.impl.DataPackageImpl;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.entity.impl.EntityPackageImpl;

import org.abchip.mimo.impl.MimoPackageImpl;

import org.abchip.mimo.java.JavaPackage;

import org.abchip.mimo.java.impl.JavaPackageImpl;
import org.abchip.mimo.networking.NetworkingPackage;
import org.abchip.mimo.networking.impl.NetworkingPackageImpl;
import org.abchip.mimo.resource.ResourcePackage;

import org.abchip.mimo.resource.impl.ResourcePackageImpl;
import org.abchip.mimo.service.ServicePackage;
import org.abchip.mimo.service.impl.ServicePackageImpl;
import org.abchip.mimo.service.reg.RegPackage;
import org.abchip.mimo.service.reg.impl.RegPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.EcorePackage;
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
	private EClass contextDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextListenerEClass = null;

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
	private EClass factoryEClass = null;

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
	private EClass providerConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerUserEClass = null;

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
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadManagerEClass = null;

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
	private EClass contextProviderEClass = null;

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
	private EEnum contextEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextStatusEEnum = null;

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
	private EEnum threadStatusEEnum = null;

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

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MimoPackage.eNS_URI);
		MimoPackageImpl theMimoPackage = (MimoPackageImpl)(registeredPackage instanceof MimoPackageImpl ? registeredPackage : MimoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AuthenticationPackage.eNS_URI);
		AuthenticationPackageImpl theAuthenticationPackage = (AuthenticationPackageImpl)(registeredPackage instanceof AuthenticationPackageImpl ? registeredPackage : AuthenticationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(registeredPackage instanceof JavaPackageImpl ? registeredPackage : JavaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = (NetworkingPackageImpl)(registeredPackage instanceof NetworkingPackageImpl ? registeredPackage : NetworkingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);
		ResourcePackageImpl theResourcePackage = (ResourcePackageImpl)(registeredPackage instanceof ResourcePackageImpl ? registeredPackage : ResourcePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(registeredPackage instanceof ServicePackageImpl ? registeredPackage : ServicePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegPackage.eNS_URI);
		RegPackageImpl theRegPackage = (RegPackageImpl)(registeredPackage instanceof RegPackageImpl ? registeredPackage : RegPackage.eINSTANCE);

		// Create package meta-data objects
		theContextPackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theAuthenticationPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theServicePackage.createPackageContents();
		theRegPackage.createPackageContents();

		// Initialize created meta-data
		theContextPackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theAuthenticationPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theRegPackage.initializePackageContents();

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
	public EAttribute getContextDescription_CurrencyUom() {
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
	public EAttribute getContextDescription_Locale() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_Picture() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_Status() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_Tenant() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_TimeZone() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextDescription_User() {
		return (EAttribute)contextDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextEvent() {
		return contextEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextListener() {
		return contextListenerEClass;
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
	public EClass getFactory() {
		return factoryEClass;
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
	public EClass getProviderConfig() {
		return providerConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProviderConfig_Host() {
		return (EReference)providerConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProviderConfig_Path() {
		return (EAttribute)providerConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProviderConfig_PublicUser() {
		return (EReference)providerConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProviderUser() {
		return providerUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProviderUser_User() {
		return (EAttribute)providerUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProviderUser_Password() {
		return (EAttribute)providerUserEClass.getEStructuralFeatures().get(1);
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
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadInfo() {
		return threadInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadName() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadId() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadPriority() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadCPUUsage() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadStatus() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadRunnable() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadInterrupted() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadNative() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadSuspended() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreadInfo_ThreadDaemon() {
		return (EAttribute)threadInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreadManager() {
		return threadManagerEClass;
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
	public EClass getContextProvider() {
		return contextProviderEClass;
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
	public EEnum getContextEventType() {
		return contextEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContextStatus() {
		return contextStatusEEnum;
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
	public EEnum getThreadStatus() {
		return threadStatusEEnum;
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

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__RIGHTS);
		createEAttribute(capabilityEClass, CAPABILITY__ENTITY_URI);

		contextEClass = createEClass(CONTEXT);

		contextDescriptionEClass = createEClass(CONTEXT_DESCRIPTION);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__ANONYMOUS);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__CURRENCY_UOM);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__ID);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__LOCALE);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__PICTURE);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__STATUS);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__TENANT);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__TIME_ZONE);
		createEAttribute(contextDescriptionEClass, CONTEXT_DESCRIPTION__USER);

		contextEventEClass = createEClass(CONTEXT_EVENT);

		contextListenerEClass = createEClass(CONTEXT_LISTENER);

		contextProviderEClass = createEClass(CONTEXT_PROVIDER);

		contextRootEClass = createEClass(CONTEXT_ROOT);

		entityLockerEClass = createEClass(ENTITY_LOCKER);

		exceptionManagerEClass = createEClass(EXCEPTION_MANAGER);

		factoryEClass = createEClass(FACTORY);

		identityEClass = createEClass(IDENTITY);

		lockManagerEClass = createEClass(LOCK_MANAGER);

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

		providerConfigEClass = createEClass(PROVIDER_CONFIG);
		createEReference(providerConfigEClass, PROVIDER_CONFIG__HOST);
		createEAttribute(providerConfigEClass, PROVIDER_CONFIG__PATH);
		createEReference(providerConfigEClass, PROVIDER_CONFIG__PUBLIC_USER);

		providerUserEClass = createEClass(PROVIDER_USER);
		createEAttribute(providerUserEClass, PROVIDER_USER__USER);
		createEAttribute(providerUserEClass, PROVIDER_USER__PASSWORD);

		registryEClass = createEClass(REGISTRY);

		registryFactoryEClass = createEClass(REGISTRY_FACTORY);

		threadEClass = createEClass(THREAD);

		threadInfoEClass = createEClass(THREAD_INFO);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_NAME);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_ID);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_PRIORITY);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_CPU_USAGE);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_STATUS);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_RUNNABLE);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_INTERRUPTED);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_NATIVE);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_SUSPENDED);
		createEAttribute(threadInfoEClass, THREAD_INFO__THREAD_DAEMON);

		threadManagerEClass = createEClass(THREAD_MANAGER);

		userProfileEClass = createEClass(USER_PROFILE);
		createEAttribute(userProfileEClass, USER_PROFILE__JOB_DESCRIPTION);
		createEAttribute(userProfileEClass, USER_PROFILE__NAME);
		createEAttribute(userProfileEClass, USER_PROFILE__TEXT);
		createEAttribute(userProfileEClass, USER_PROFILE__USER_CLASS);

		// Create enums
		capabilityRightEEnum = createEEnum(CAPABILITY_RIGHT);
		contextEventTypeEEnum = createEEnum(CONTEXT_EVENT_TYPE);
		contextStatusEEnum = createEEnum(CONTEXT_STATUS);
		lockTypeEEnum = createEEnum(LOCK_TYPE);
		threadStatusEEnum = createEEnum(THREAD_STATUS);
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
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		ResourcePackage theResourcePackage = (ResourcePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		NetworkingPackage theNetworkingPackage = (NetworkingPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);

		// Create type parameters
		ETypeParameter entityLockerEClass_N = addETypeParameter(entityLockerEClass, "N");
		ETypeParameter factoryEClass_S = addETypeParameter(factoryEClass, "S");
		ETypeParameter identityEClass_T = addETypeParameter(identityEClass, "T");
		ETypeParameter messageDataFieldEClass_DD = addETypeParameter(messageDataFieldEClass, "DD");
		ETypeParameter registryEClass_K = addETypeParameter(registryEClass, "K");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		entityLockerEClass_N.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntity());
		identityEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theDataPackage.getDataDef());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		messageDataFieldEClass_DD.getEBounds().add(g1);

		// Add supertypes to classes
		capabilityEClass.getESuperTypes().add(theEntityPackage.getEntity());
		contextDescriptionEClass.getESuperTypes().add(theEntityPackage.getEntity());
		contextProviderEClass.getESuperTypes().add(theJavaPackage.getJavaCloseable());
		contextRootEClass.getESuperTypes().add(this.getContext());
		identityEClass.getESuperTypes().add(theEntityPackage.getEntity());
		messageDescriptionEClass.getESuperTypes().add(theEntityPackage.getEntity());
		messageDataFieldEClass.getESuperTypes().add(theEntityPackage.getEntity());
		messageFileEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		providerConfigEClass.getESuperTypes().add(theEntityPackage.getEntity());
		providerUserEClass.getESuperTypes().add(theEntityPackage.getEntity());
		threadEClass.getESuperTypes().add(theEntityPackage.getEntity());
		threadInfoEClass.getESuperTypes().add(theEntityPackage.getEntity());
		userProfileEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());

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

		initEClass(capabilityEClass, Capability.class, "Capability", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_Rights(), this.getCapabilityRight(), "rights", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_EntityURI(), theJavaPackage.getJavaURI(), "entityURI", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(capabilityEClass, ecorePackage.getEString(), "getEntityName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contextEClass, null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		addEOperation(contextEClass, this.getContextDescription(), "getContextDescription", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextEClass, theResourcePackage.getResourceManager(), "getResourceManager", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "inject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextEClass, ecorePackage.getEBoolean(), "isClosed", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, null, "invoke", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "A");
		g1 = createEGenericType(theJavaPackage.getJavaAnnotation());
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

		op = addEOperation(contextEClass, null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextListener(), "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

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

		initEClass(contextDescriptionEClass, ContextDescription.class, "ContextDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextDescription_Anonymous(), ecorePackage.getEBoolean(), "anonymous", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_CurrencyUom(), ecorePackage.getEString(), "currencyUom", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_Id(), ecorePackage.getEString(), "id", null, 1, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_Locale(), ecorePackage.getEString(), "locale", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_Picture(), ecorePackage.getEString(), "picture", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_Status(), this.getContextStatus(), "status", null, 1, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_Tenant(), ecorePackage.getEString(), "tenant", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_TimeZone(), ecorePackage.getEString(), "timeZone", null, 0, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextDescription_User(), ecorePackage.getEString(), "user", null, 1, 1, ContextDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(contextDescriptionEClass, ecorePackage.getEBoolean(), "isTenant", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextEventEClass, ContextEvent.class, "ContextEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contextEventEClass, this.getContext(), "getContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextEventEClass, this.getContextEventType(), "getEventType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextListenerEClass, ContextListener.class, "ContextListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(contextListenerEClass, null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextEvent(), "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextProviderEClass, ContextProvider.class, "ContextProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(contextProviderEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contextProviderEClass, this.getContext(), "get", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextRootEClass, ContextRoot.class, "ContextRoot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(contextRootEClass, this.getContextProvider(), "createChildContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextId", 1, 1, IS_UNIQUE, IS_ORDERED);

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

		op = addEOperation(contextRootEClass, null, "set", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "remoteExport", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theJavaPackage.getJavaDictionary());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dictionary", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entityLockerEClass, EntityLocker.class, "EntityLocker", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(entityLockerEClass, theJavaPackage.getJavaURI(), "getAddress", 1, 1, IS_UNIQUE, IS_ORDERED);

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
		g1 = createEGenericType(theJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "variable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaEnum(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(exceptionManagerEClass, this.getMessageException(), "prepareException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "messageFileLib", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageVariableList(), "variables", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(factoryEClass, Factory.class, "Factory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(factoryEClass, null, "create", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(factoryEClass_S);
		initEOperation(op, g1);

		op = addEOperation(factoryEClass, null, "getInterfaceClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(factoryEClass_S);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(identityEClass, Identity.class, "Identity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(identityEClass, theJavaPackage.getJavaPrincipal(), "getJavaPrincipal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lockManagerEClass, LockManager.class, "LockManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lockManagerEClass, null, "getLocker", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "N");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaURI(), "address", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityLocker());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(lockManagerEClass, null, "getLocker", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "N");
		g1 = createEGenericType(theEntityPackage.getEntityIdentifiable());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "object", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEntityLocker());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(lockManagerEClass, theJavaPackage.getJavaConcurrentMap(), "getConcurrentMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addETypeParameter(op, "K");
		addETypeParameter(op, "V");
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lockManagerEClass, theJavaPackage.getJavaBlockingQueue(), "getQueue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addETypeParameter(op, "E");
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		g1 = createEGenericType(theDataPackage.getDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMessageDataField_Definition(), g1, null, "definition", null, 0, 1, MessageDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageFileEClass, MessageFile.class, "MessageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageFile_Messages(), this.getMessageDescription(), null, "messages", null, 0, -1, MessageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageFile_Name(), ecorePackage.getEString(), "name", null, 1, 1, MessageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageFile_Text(), ecorePackage.getEString(), "text", null, 1, 1, MessageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(messageFileEClass, this.getMessageDescription(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theJavaPackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(providerConfigEClass, ProviderConfig.class, "ProviderConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProviderConfig_Host(), theNetworkingPackage.getHostConfig(), null, "host", null, 1, 1, ProviderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderConfig_Path(), ecorePackage.getEString(), "path", null, 1, 1, ProviderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProviderConfig_PublicUser(), this.getProviderUser(), null, "publicUser", null, 0, 1, ProviderConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerUserEClass, ProviderUser.class, "ProviderUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProviderUser_User(), ecorePackage.getEString(), "user", null, 1, 1, ProviderUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProviderUser_Password(), ecorePackage.getEString(), "password", null, 1, 1, ProviderUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registryEClass, org.abchip.mimo.context.Registry.class, "Registry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(registryEClass, null, "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_K);
		initEOperation(op, g1);

		op = addEOperation(registryEClass, null, "list", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_K);
		initEOperation(op, g1);

		op = addEOperation(registryEClass, null, "lookupByVendorVersion", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "vendor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "version", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(registryEClass_K);
		initEOperation(op, g1);

		initEClass(registryFactoryEClass, RegistryFactory.class, "RegistryFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(registryFactoryEClass, null, "createRegistry", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "K");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getRegistry());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(threadEClass, org.abchip.mimo.context.Thread.class, "Thread", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "checkRunnable", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, theJavaPackage.getJavaThread(), "getJavaThread", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getELong(), "getThreadID", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEString(), "getThreadName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEInt(), "getThreadPriority", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEDouble(), "getThreadCPUUsage", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, this.getThreadStatus(), "getThreadStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "isInterrupted", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "isNative", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "isSuspended", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadEClass, ecorePackage.getEBoolean(), "isThreadDaemon", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(threadInfoEClass, ThreadInfo.class, "ThreadInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreadInfo_ThreadName(), ecorePackage.getEString(), "threadName", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadId(), ecorePackage.getELong(), "threadId", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadPriority(), ecorePackage.getEInt(), "threadPriority", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadCPUUsage(), ecorePackage.getEDouble(), "threadCPUUsage", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadStatus(), this.getThreadStatus(), "threadStatus", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadRunnable(), ecorePackage.getEBoolean(), "threadRunnable", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadInterrupted(), ecorePackage.getEBoolean(), "threadInterrupted", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadNative(), ecorePackage.getEBoolean(), "threadNative", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadSuspended(), ecorePackage.getEBoolean(), "threadSuspended", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadDaemon(), ecorePackage.getEBoolean(), "threadDaemon", null, 1, 1, ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threadManagerEClass, ThreadManager.class, "ThreadManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(threadManagerEClass, this.getThread(), "createThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaRunnable(), "runnable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, this.getThread(), "createThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaRunnable(), "runnable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "daemon", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadManagerEClass, this.getThread(), "currentThread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, this.getThreadInfo(), "getThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadManagerEClass, this.getThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, this.getThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, this.getThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, null, "release", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, null, "suspend", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userProfileEClass, UserProfile.class, "UserProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProfile_JobDescription(), ecorePackage.getEString(), "jobDescription", null, 0, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_Name(), ecorePackage.getEString(), "name", null, 1, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_Text(), ecorePackage.getEString(), "text", null, 1, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProfile_UserClass(), this.getUserClass(), "userClass", null, 1, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(capabilityRightEEnum, CapabilityRight.class, "CapabilityRight");
		addEEnumLiteral(capabilityRightEEnum, CapabilityRight.READ);
		addEEnumLiteral(capabilityRightEEnum, CapabilityRight.WRITE);
		addEEnumLiteral(capabilityRightEEnum, CapabilityRight.EXECUTE);

		initEEnum(contextEventTypeEEnum, ContextEventType.class, "ContextEventType");
		addEEnumLiteral(contextEventTypeEEnum, ContextEventType.CLOSING);

		initEEnum(contextStatusEEnum, ContextStatus.class, "ContextStatus");
		addEEnumLiteral(contextStatusEEnum, ContextStatus.ACTIVE);
		addEEnumLiteral(contextStatusEEnum, ContextStatus.CLOSED);

		initEEnum(lockTypeEEnum, LockType.class, "LockType");
		addEEnumLiteral(lockTypeEEnum, LockType.READ);
		addEEnumLiteral(lockTypeEEnum, LockType.WRITE);

		initEEnum(threadStatusEEnum, ThreadStatus.class, "ThreadStatus");
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.NEW);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.RUNNABLE);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.BLOCKED);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.WAITING);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.TIMED_WAITING);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.TERMINATED);

		initEEnum(userClassEEnum, UserClass.class, "UserClass");
		addEEnumLiteral(userClassEEnum, UserClass.USER);

		// Initialize data types
		initEDataType(messageVariableListEDataType, Object[].class, "MessageVariableList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(messageExceptionEDataType, MessageException.class, "MessageException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //ContextPackageImpl
