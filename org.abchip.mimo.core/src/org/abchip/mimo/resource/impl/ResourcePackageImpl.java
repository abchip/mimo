/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.application.ApplicationPackage;

import org.abchip.mimo.application.impl.ApplicationPackageImpl;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.context.impl.ContextPackageImpl;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.entity.impl.EntityPackageImpl;

import org.abchip.mimo.impl.MimoPackageImpl;

import org.abchip.mimo.net.NetPackage;

import org.abchip.mimo.net.impl.NetPackageImpl;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceEvent;
import org.abchip.mimo.resource.ResourceEventType;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceListener;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourcePackage;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;

import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.util.UtilPackage;

import org.abchip.mimo.util.impl.UtilPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ResourcePackageImpl extends EPackageImpl implements ResourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceNotifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProviderRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceSerializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceEventTypeEEnum = null;

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
	 * @see org.abchip.mimo.resource.ResourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcePackageImpl() {
		super(eNS_URI, ResourceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourcePackage init() {
		if (isInited) return (ResourcePackage)EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResourcePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResourcePackageImpl theResourcePackage = registeredResourcePackage instanceof ResourcePackageImpl ? (ResourcePackageImpl)registeredResourcePackage : new ResourcePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MimoPackage.eNS_URI);
		MimoPackageImpl theMimoPackage = (MimoPackageImpl)(registeredPackage instanceof MimoPackageImpl ? registeredPackage : MimoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(registeredPackage instanceof ContextPackageImpl ? registeredPackage : ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetPackage.eNS_URI);
		NetPackageImpl theNetPackage = (NetPackageImpl)(registeredPackage instanceof NetPackageImpl ? registeredPackage : NetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theResourcePackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theNetPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theResourcePackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theNetPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourcePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourcePackage.eNS_URI, theResourcePackage);
		return theResourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_ResourceConfig() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResource__Create__EntityNameable_boolean() {
		return resourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResource__Delete__EntityNameable() {
		return resourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResource__GetFrame() {
		return resourceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResource__GetTenant() {
		return resourceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResource__NextSequence() {
		return resourceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResource__Read__String_String_boolean() {
		return resourceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResource__Read__String_String_String_int_boolean() {
		return resourceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResource__Update__EntityNameable() {
		return resourceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceConfig() {
		return resourceConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceConfig_LockSupport() {
		return (EAttribute)resourceConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceConfig_OrderSupport() {
		return (EAttribute)resourceConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceConfig_PageSize() {
		return (EAttribute)resourceConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceEvent() {
		return resourceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceEvent__GetContextProvider() {
		return resourceEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceEvent__GetEventType() {
		return resourceEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceEvent__GetNewName() {
		return resourceEventEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceEvent__GetOldName() {
		return resourceEventEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceEvent__GetSource() {
		return resourceEventEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceListener() {
		return resourceListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceListener__HandleEvent__ResourceEvent() {
		return resourceListenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceManager() {
		return resourceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__CreateResourceSerializer__Class_SerializationType() {
		return resourceManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__CreateResourceSerializer__Frame_SerializationType() {
		return resourceManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__CreateResourceSerializer__String_SerializationType() {
		return resourceManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceReader__ContextProvider_Class() {
		return resourceManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceReader__ContextProvider_Frame() {
		return resourceManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceReader__ContextProvider_String() {
		return resourceManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceReader__ContextProvider_Class_String() {
		return resourceManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceReader__ContextProvider_Frame_String() {
		return resourceManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceReader__ContextProvider_String_String() {
		return resourceManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceWriter__ContextProvider_Class() {
		return resourceManagerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceWriter__ContextProvider_Frame() {
		return resourceManagerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceWriter__ContextProvider_String() {
		return resourceManagerEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceWriter__ContextProvider_Class_String() {
		return resourceManagerEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceWriter__ContextProvider_Frame_String() {
		return resourceManagerEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetResourceWriter__ContextProvider_String_String() {
		return resourceManagerEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetProvider__Class() {
		return resourceManagerEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetProvider__Frame() {
		return resourceManagerEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__GetProvider__String() {
		return resourceManagerEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__RegisterListener__Class_ResourceListener() {
		return resourceManagerEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__RegisterListener__Frame_ResourceListener() {
		return resourceManagerEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__RegisterListener__String_ResourceListener() {
		return resourceManagerEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__RegisterProvider__Class_ResourceProvider() {
		return resourceManagerEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__RegisterProvider__Frame_ResourceProvider() {
		return resourceManagerEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceManager__RegisterProvider__String_ResourceProvider() {
		return resourceManagerEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceNotifier() {
		return resourceNotifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceNotifier__FireEvent__ResourceEvent() {
		return resourceNotifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceNotifier__GetListeners() {
		return resourceNotifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceNotifier__RegisterListener__ResourceListener() {
		return resourceNotifierEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceProvider() {
		return resourceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__CheckLogin__AuthenticationUserToken_boolean() {
		return resourceProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__GetResource__ContextProvider_Class() {
		return resourceProviderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__GetResource__ContextProvider_Frame() {
		return resourceProviderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__GetResource__ContextProvider_String() {
		return resourceProviderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__GetResource__ContextProvider_Class_String() {
		return resourceProviderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__GetResource__ContextProvider_Frame_String() {
		return resourceProviderEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__GetResource__ContextProvider_String_String() {
		return resourceProviderEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__IsActive__ContextProvider() {
		return resourceProviderEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__Login__String_AuthenticationAnonymous() {
		return resourceProviderEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__Login__String_AuthenticationUserPassword() {
		return resourceProviderEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__Login__String_AuthenticationUserToken() {
		return resourceProviderEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceProvider__Logout__ContextProvider() {
		return resourceProviderEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceProviderRegistry() {
		return resourceProviderRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceReader() {
		return resourceReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceReader_Notifier() {
		return (EReference)resourceReaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__Find() {
		return resourceReaderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__Find__String() {
		return resourceReaderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__Find__String_String() {
		return resourceReaderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__Find__String_String_String() {
		return resourceReaderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__Find__String_String_String_int() {
		return resourceReaderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__Find__String_String_String_int_boolean() {
		return resourceReaderEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__First() {
		return resourceReaderEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__First__boolean() {
		return resourceReaderEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__GetFrame() {
		return resourceReaderEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__Lookup__String() {
		return resourceReaderEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__Lookup__String_boolean() {
		return resourceReaderEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceReader__GetContextProvider() {
		return resourceReaderEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceSerializer() {
		return resourceSerializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceSerializer_Frame() {
		return (EReference)resourceSerializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceSerializer__Add__Entity() {
		return resourceSerializerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceSerializer__AddAll__List() {
		return resourceSerializerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceSerializer__Clear() {
		return resourceSerializerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceSerializer__Load__InputStream_boolean() {
		return resourceSerializerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceSerializer__Load__String_boolean() {
		return resourceSerializerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceSerializer__Save__OutputStream() {
		return resourceSerializerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceSerializer__Get() {
		return resourceSerializerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceSerializer__GetAll() {
		return resourceSerializerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceSerializer__IsEmpty() {
		return resourceSerializerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceWriter() {
		return resourceWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceWriter__Delete__EntityNameable() {
		return resourceWriterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceWriter__Create__EntityNameable() {
		return resourceWriterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceWriter__Create__EntityNameable_boolean() {
		return resourceWriterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceWriter__NextSequence() {
		return resourceWriterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResourceWriter__Update__EntityNameable() {
		return resourceWriterEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getResourceEventType() {
		return resourceEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceFactory getResourceFactory() {
		return (ResourceFactory)getEFactoryInstance();
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
		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__RESOURCE_CONFIG);
		createEOperation(resourceEClass, RESOURCE___CREATE__ENTITYNAMEABLE_BOOLEAN);
		createEOperation(resourceEClass, RESOURCE___DELETE__ENTITYNAMEABLE);
		createEOperation(resourceEClass, RESOURCE___GET_FRAME);
		createEOperation(resourceEClass, RESOURCE___GET_TENANT);
		createEOperation(resourceEClass, RESOURCE___NEXT_SEQUENCE);
		createEOperation(resourceEClass, RESOURCE___READ__STRING_STRING_BOOLEAN);
		createEOperation(resourceEClass, RESOURCE___READ__STRING_STRING_STRING_INT_BOOLEAN);
		createEOperation(resourceEClass, RESOURCE___UPDATE__ENTITYNAMEABLE);

		resourceConfigEClass = createEClass(RESOURCE_CONFIG);
		createEAttribute(resourceConfigEClass, RESOURCE_CONFIG__LOCK_SUPPORT);
		createEAttribute(resourceConfigEClass, RESOURCE_CONFIG__ORDER_SUPPORT);
		createEAttribute(resourceConfigEClass, RESOURCE_CONFIG__PAGE_SIZE);

		resourceEventEClass = createEClass(RESOURCE_EVENT);
		createEOperation(resourceEventEClass, RESOURCE_EVENT___GET_CONTEXT_PROVIDER);
		createEOperation(resourceEventEClass, RESOURCE_EVENT___GET_EVENT_TYPE);
		createEOperation(resourceEventEClass, RESOURCE_EVENT___GET_NEW_NAME);
		createEOperation(resourceEventEClass, RESOURCE_EVENT___GET_OLD_NAME);
		createEOperation(resourceEventEClass, RESOURCE_EVENT___GET_SOURCE);

		resourceListenerEClass = createEClass(RESOURCE_LISTENER);
		createEOperation(resourceListenerEClass, RESOURCE_LISTENER___HANDLE_EVENT__RESOURCEEVENT);

		resourceManagerEClass = createEClass(RESOURCE_MANAGER);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___CREATE_RESOURCE_SERIALIZER__CLASS_SERIALIZATIONTYPE);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___CREATE_RESOURCE_SERIALIZER__FRAME_SERIALIZATIONTYPE);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___CREATE_RESOURCE_SERIALIZER__STRING_SERIALIZATIONTYPE);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_CLASS);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_FRAME);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_STRING);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_CLASS_STRING);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_FRAME_STRING);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_READER__CONTEXTPROVIDER_STRING_STRING);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_CLASS);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_FRAME);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_STRING);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_CLASS_STRING);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_FRAME_STRING);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_RESOURCE_WRITER__CONTEXTPROVIDER_STRING_STRING);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_PROVIDER__CLASS);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_PROVIDER__FRAME);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___GET_PROVIDER__STRING);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___REGISTER_LISTENER__CLASS_RESOURCELISTENER);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___REGISTER_LISTENER__FRAME_RESOURCELISTENER);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___REGISTER_LISTENER__STRING_RESOURCELISTENER);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___REGISTER_PROVIDER__CLASS_RESOURCEPROVIDER);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___REGISTER_PROVIDER__FRAME_RESOURCEPROVIDER);
		createEOperation(resourceManagerEClass, RESOURCE_MANAGER___REGISTER_PROVIDER__STRING_RESOURCEPROVIDER);

		resourceNotifierEClass = createEClass(RESOURCE_NOTIFIER);
		createEOperation(resourceNotifierEClass, RESOURCE_NOTIFIER___FIRE_EVENT__RESOURCEEVENT);
		createEOperation(resourceNotifierEClass, RESOURCE_NOTIFIER___GET_LISTENERS);
		createEOperation(resourceNotifierEClass, RESOURCE_NOTIFIER___REGISTER_LISTENER__RESOURCELISTENER);

		resourceProviderEClass = createEClass(RESOURCE_PROVIDER);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___CHECK_LOGIN__AUTHENTICATIONUSERTOKEN_BOOLEAN);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_CLASS);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_FRAME);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_STRING);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_CLASS_STRING);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_FRAME_STRING);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___GET_RESOURCE__CONTEXTPROVIDER_STRING_STRING);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___IS_ACTIVE__CONTEXTPROVIDER);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___LOGIN__STRING_AUTHENTICATIONANONYMOUS);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___LOGIN__STRING_AUTHENTICATIONUSERPASSWORD);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___LOGIN__STRING_AUTHENTICATIONUSERTOKEN);
		createEOperation(resourceProviderEClass, RESOURCE_PROVIDER___LOGOUT__CONTEXTPROVIDER);

		resourceProviderRegistryEClass = createEClass(RESOURCE_PROVIDER_REGISTRY);

		resourceReaderEClass = createEClass(RESOURCE_READER);
		createEReference(resourceReaderEClass, RESOURCE_READER__NOTIFIER);
		createEOperation(resourceReaderEClass, RESOURCE_READER___FIND);
		createEOperation(resourceReaderEClass, RESOURCE_READER___FIND__STRING);
		createEOperation(resourceReaderEClass, RESOURCE_READER___FIND__STRING_STRING);
		createEOperation(resourceReaderEClass, RESOURCE_READER___FIND__STRING_STRING_STRING);
		createEOperation(resourceReaderEClass, RESOURCE_READER___FIND__STRING_STRING_STRING_INT);
		createEOperation(resourceReaderEClass, RESOURCE_READER___FIND__STRING_STRING_STRING_INT_BOOLEAN);
		createEOperation(resourceReaderEClass, RESOURCE_READER___FIRST);
		createEOperation(resourceReaderEClass, RESOURCE_READER___FIRST__BOOLEAN);
		createEOperation(resourceReaderEClass, RESOURCE_READER___GET_FRAME);
		createEOperation(resourceReaderEClass, RESOURCE_READER___LOOKUP__STRING);
		createEOperation(resourceReaderEClass, RESOURCE_READER___LOOKUP__STRING_BOOLEAN);
		createEOperation(resourceReaderEClass, RESOURCE_READER___GET_CONTEXT_PROVIDER);

		resourceSerializerEClass = createEClass(RESOURCE_SERIALIZER);
		createEReference(resourceSerializerEClass, RESOURCE_SERIALIZER__FRAME);
		createEOperation(resourceSerializerEClass, RESOURCE_SERIALIZER___ADD__ENTITY);
		createEOperation(resourceSerializerEClass, RESOURCE_SERIALIZER___ADD_ALL__LIST);
		createEOperation(resourceSerializerEClass, RESOURCE_SERIALIZER___CLEAR);
		createEOperation(resourceSerializerEClass, RESOURCE_SERIALIZER___LOAD__INPUTSTREAM_BOOLEAN);
		createEOperation(resourceSerializerEClass, RESOURCE_SERIALIZER___LOAD__STRING_BOOLEAN);
		createEOperation(resourceSerializerEClass, RESOURCE_SERIALIZER___SAVE__OUTPUTSTREAM);
		createEOperation(resourceSerializerEClass, RESOURCE_SERIALIZER___GET);
		createEOperation(resourceSerializerEClass, RESOURCE_SERIALIZER___GET_ALL);
		createEOperation(resourceSerializerEClass, RESOURCE_SERIALIZER___IS_EMPTY);

		resourceWriterEClass = createEClass(RESOURCE_WRITER);
		createEOperation(resourceWriterEClass, RESOURCE_WRITER___DELETE__ENTITYNAMEABLE);
		createEOperation(resourceWriterEClass, RESOURCE_WRITER___CREATE__ENTITYNAMEABLE);
		createEOperation(resourceWriterEClass, RESOURCE_WRITER___CREATE__ENTITYNAMEABLE_BOOLEAN);
		createEOperation(resourceWriterEClass, RESOURCE_WRITER___NEXT_SEQUENCE);
		createEOperation(resourceWriterEClass, RESOURCE_WRITER___UPDATE__ENTITYNAMEABLE);

		// Create enums
		resourceEventTypeEEnum = createEEnum(RESOURCE_EVENT_TYPE);
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
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters
		ETypeParameter resourceEClass_E = addETypeParameter(resourceEClass, "E");
		ETypeParameter resourceEventEClass_E = addETypeParameter(resourceEventEClass, "E");
		ETypeParameter resourceListenerEClass_E = addETypeParameter(resourceListenerEClass, "E");
		ETypeParameter resourceNotifierEClass_E = addETypeParameter(resourceNotifierEClass, "E");
		ETypeParameter resourceReaderEClass_E = addETypeParameter(resourceReaderEClass, "E");
		ETypeParameter resourceSerializerEClass_E = addETypeParameter(resourceSerializerEClass, "E");
		ETypeParameter resourceWriterEClass_E = addETypeParameter(resourceWriterEClass, "E");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theEntityPackage.getEntityNameable());
		resourceEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		resourceEventEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		resourceListenerEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		resourceNotifierEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		resourceReaderEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntity());
		resourceSerializerEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		resourceWriterEClass_E.getEBounds().add(g1);

		// Add supertypes to classes
		resourceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		resourceConfigEClass.getESuperTypes().add(theEntityPackage.getEntity());
		g1 = createEGenericType(theContextPackage.getRegistry());
		EGenericType g2 = createEGenericType(this.getResourceProvider());
		g1.getETypeArguments().add(g2);
		resourceProviderRegistryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(resourceWriterEClass_E);
		g1.getETypeArguments().add(g2);
		resourceWriterEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_ResourceConfig(), this.getResourceConfig(), null, "resourceConfig", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getResource__Create__EntityNameable_boolean(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "update", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResource__Delete__EntityNameable(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResource__GetFrame(), null, "getFrame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(resourceEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getResource__GetTenant(), ecorePackage.getEString(), "getTenant", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getResource__NextSequence(), ecorePackage.getEString(), "nextSequence", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResource__Read__String_String_boolean(), null, "read", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		initEOperation(op, g1);

		op = initEOperation(getResource__Read__String_String_String_int_boolean(), null, "read", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "limit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		initEOperation(op, g1);

		op = initEOperation(getResource__Update__EntityNameable(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceConfigEClass, ResourceConfig.class, "ResourceConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceConfig_LockSupport(), ecorePackage.getEBoolean(), "lockSupport", null, 1, 1, ResourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceConfig_OrderSupport(), ecorePackage.getEBoolean(), "orderSupport", null, 1, 1, ResourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceConfig_PageSize(), ecorePackage.getEInt(), "pageSize", "100", 1, 1, ResourceConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEventEClass, ResourceEvent.class, "ResourceEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getResourceEvent__GetContextProvider(), theContextPackage.getContextProvider(), "getContextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getResourceEvent__GetEventType(), this.getResourceEventType(), "getEventType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getResourceEvent__GetNewName(), ecorePackage.getEString(), "getNewName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getResourceEvent__GetOldName(), ecorePackage.getEString(), "getOldName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceEvent__GetSource(), null, "getSource", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceEventEClass_E);
		initEOperation(op, g1);

		initEClass(resourceListenerEClass, ResourceListener.class, "ResourceListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getResourceListener__HandleEvent__ResourceEvent(), null, "handleEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceEvent());
		g2 = createEGenericType(resourceListenerEClass_E);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceManagerEClass, ResourceManager.class, "ResourceManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getResourceManager__CreateResourceSerializer__Class_SerializationType(), null, "createResourceSerializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntity());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEntityPackage.getSerializationType(), "serializationType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSerializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__CreateResourceSerializer__Frame_SerializationType(), null, "createResourceSerializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntity());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEntityPackage.getSerializationType(), "serializationType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSerializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__CreateResourceSerializer__String_SerializationType(), null, "createResourceSerializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntity());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEntityPackage.getSerializationType(), "serializationType", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceSerializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceReader__ContextProvider_Class(), null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceReader__ContextProvider_Frame(), null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceReader__ContextProvider_String(), null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceReader__ContextProvider_Class_String(), null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceReader__ContextProvider_Frame_String(), null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceReader__ContextProvider_String_String(), null, "getResourceReader", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceReader());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceWriter__ContextProvider_Class(), null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceWriter__ContextProvider_Frame(), null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceWriter__ContextProvider_String(), null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceWriter__ContextProvider_Class_String(), null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceWriter__ContextProvider_Frame_String(), null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetResourceWriter__ContextProvider_String_String(), null, "getResourceWriter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceWriter());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceManager__GetProvider__Class(), this.getResourceProvider(), "getProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceManager__GetProvider__Frame(), this.getResourceProvider(), "getProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceManager__GetProvider__String(), this.getResourceProvider(), "getProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceManager__RegisterListener__Class_ResourceListener(), null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceManager__RegisterListener__Frame_ResourceListener(), null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceManager__RegisterListener__String_ResourceListener(), null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceManager__RegisterProvider__Class_ResourceProvider(), null, "registerProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceProvider(), "provider", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceManager__RegisterProvider__Frame_ResourceProvider(), null, "registerProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceProvider(), "provider", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceManager__RegisterProvider__String_ResourceProvider(), null, "registerProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceProvider(), "provider", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceNotifierEClass, ResourceNotifier.class, "ResourceNotifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getResourceNotifier__FireEvent__ResourceEvent(), null, "fireEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceEvent());
		g2 = createEGenericType(resourceNotifierEClass_E);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "event", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceNotifier__GetListeners(), null, "getListeners", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(resourceNotifierEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceNotifier__RegisterListener__ResourceListener(), null, "registerListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResourceListener());
		g2 = createEGenericType(resourceNotifierEClass_E);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listener", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceProviderEClass, ResourceProvider.class, "ResourceProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getResourceProvider__CheckLogin__AuthenticationUserToken_boolean(), ecorePackage.getEBoolean(), "checkLogin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getAuthenticationUserToken(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "create", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceProvider__GetResource__ContextProvider_Class(), null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceProvider__GetResource__ContextProvider_Frame(), null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceProvider__GetResource__ContextProvider_String(), null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceProvider__GetResource__ContextProvider_Class_String(), null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "klass", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceProvider__GetResource__ContextProvider_Frame_String(), null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceProvider__GetResource__ContextProvider_String_String(), null, "getResource", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theEntityPackage.getEntityNameable());
		t1.getEBounds().add(g1);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "frame", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tenant", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getResource());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceProvider__IsActive__ContextProvider(), ecorePackage.getEBoolean(), "isActive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceProvider__Login__String_AuthenticationAnonymous(), theContextPackage.getContextProvider(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getAuthenticationAnonymous(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceProvider__Login__String_AuthenticationUserPassword(), theContextPackage.getContextProvider(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getAuthenticationUserPassword(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceProvider__Login__String_AuthenticationUserToken(), theContextPackage.getContextProvider(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getAuthenticationUserToken(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceProvider__Logout__ContextProvider(), null, "logout", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContextProvider(), "contextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceProviderRegistryEClass, ResourceProviderRegistry.class, "ResourceProviderRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceReaderEClass, ResourceReader.class, "ResourceReader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getResourceNotifier());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEReference(getResourceReader_Notifier(), g1, null, "notifier", null, 0, 1, ResourceReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getResourceReader__Find(), null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__Find__String(), null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__Find__String_String(), null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__Find__String_String_String(), null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__Find__String_String_String_int(), null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "limit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__Find__String_String_String_int_boolean(), null, "find", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "limit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getEntityIterator());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__First(), null, "first", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__First__boolean(), null, "first", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__GetFrame(), null, "getFrame", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(resourceReaderEClass_E);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__Lookup__String(), null, "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		op = initEOperation(getResourceReader__Lookup__String_boolean(), null, "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceReaderEClass_E);
		initEOperation(op, g1);

		initEOperation(getResourceReader__GetContextProvider(), theContextPackage.getContextProvider(), "getContextProvider", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceSerializerEClass, ResourceSerializer.class, "ResourceSerializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theEntityPackage.getFrame());
		g2 = createEGenericType(resourceSerializerEClass_E);
		g1.getETypeArguments().add(g2);
		initEReference(getResourceSerializer_Frame(), g1, null, "frame", null, 1, 1, ResourceSerializer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getResourceSerializer__Add__Entity(), null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceSerializer__AddAll__List(), null, "addAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		addEParameter(op, g1, "entities", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getResourceSerializer__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceSerializer__Load__InputStream_boolean(), null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaInputStream(), "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "append", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theUtilPackage.getJavaIOException());

		op = initEOperation(getResourceSerializer__Load__String_boolean(), null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "append", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theUtilPackage.getJavaIOException());

		op = initEOperation(getResourceSerializer__Save__OutputStream(), null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaOutputStream(), "outputStream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theUtilPackage.getJavaIOException());

		op = initEOperation(getResourceSerializer__Get(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		initEOperation(op, g1);

		op = initEOperation(getResourceSerializer__GetAll(), null, "getAll", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceSerializerEClass_E);
		initEOperation(op, g1);

		initEOperation(getResourceSerializer__IsEmpty(), ecorePackage.getEBoolean(), "isEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourceWriterEClass, ResourceWriter.class, "ResourceWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getResourceWriter__Delete__EntityNameable(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceWriter__Create__EntityNameable(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceWriter__Create__EntityNameable_boolean(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "update", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getResourceWriter__NextSequence(), ecorePackage.getEString(), "nextSequence", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getResourceWriter__Update__EntityNameable(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(resourceWriterEClass_E);
		addEParameter(op, g1, "entity", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resourceEventTypeEEnum, ResourceEventType.class, "ResourceEventType");
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.BEFORE_SAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.AFTER_SAVE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.BEFORE_DELETE);
		addEEnumLiteral(resourceEventTypeEEnum, ResourceEventType.AFTER_DELETE);
	}

} //ResourcePackageImpl
