/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.application.ApplicationPackage;

import org.abchip.mimo.application.impl.ApplicationPackageImpl;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationPackage;
import org.abchip.mimo.authentication.AuthenticationProvider;
import org.abchip.mimo.authentication.AuthenticationProviderRegistry;
import org.abchip.mimo.authentication.Authentication;
import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationAnonymous;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.context.impl.ContextPackageImpl;

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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthenticationPackageImpl extends EPackageImpl implements AuthenticationPackage {
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
	private EClass authenticationAdminKeyEClass = null;
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
	private EClass authenticationProviderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationProviderRegistryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType authenticationExceptionEDataType = null;
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
	 * @see org.abchip.mimo.authentication.AuthenticationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuthenticationPackageImpl() {
		super(eNS_URI, AuthenticationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AuthenticationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AuthenticationPackage init() {
		if (isInited) return (AuthenticationPackage)EPackage.Registry.INSTANCE.getEPackage(AuthenticationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAuthenticationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AuthenticationPackageImpl theAuthenticationPackage = registeredAuthenticationPackage instanceof AuthenticationPackageImpl ? (AuthenticationPackageImpl)registeredAuthenticationPackage : new AuthenticationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MimoPackage.eNS_URI);
		MimoPackageImpl theMimoPackage = (MimoPackageImpl)(registeredPackage instanceof MimoPackageImpl ? registeredPackage : MimoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(registeredPackage instanceof ContextPackageImpl ? registeredPackage : ContextPackage.eINSTANCE);
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
		theAuthenticationPackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theServicePackage.createPackageContents();
		theRegPackage.createPackageContents();

		// Initialize created meta-data
		theAuthenticationPackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theRegPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAuthenticationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuthenticationPackage.eNS_URI, theAuthenticationPackage);
		return theAuthenticationPackage;
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
	public EAttribute getAuthentication_Tenant() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationAdminKey() {
		return authenticationAdminKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthenticationAdminKey_AdminKey() {
		return (EAttribute)authenticationAdminKeyEClass.getEStructuralFeatures().get(0);
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
	public EClass getAuthenticationProvider() {
		return authenticationProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthenticationProviderRegistry() {
		return authenticationProviderRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAuthenticationException() {
		return authenticationExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationFactory getAuthenticationFactory() {
		return (AuthenticationFactory)getEFactoryInstance();
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
		authenticationEClass = createEClass(AUTHENTICATION);
		createEAttribute(authenticationEClass, AUTHENTICATION__TENANT);

		authenticationAdminKeyEClass = createEClass(AUTHENTICATION_ADMIN_KEY);
		createEAttribute(authenticationAdminKeyEClass, AUTHENTICATION_ADMIN_KEY__ADMIN_KEY);

		authenticationAnonymousEClass = createEClass(AUTHENTICATION_ANONYMOUS);

		authenticationManagerEClass = createEClass(AUTHENTICATION_MANAGER);

		authenticationUserPasswordEClass = createEClass(AUTHENTICATION_USER_PASSWORD);
		createEAttribute(authenticationUserPasswordEClass, AUTHENTICATION_USER_PASSWORD__USER);
		createEAttribute(authenticationUserPasswordEClass, AUTHENTICATION_USER_PASSWORD__PASSWORD);

		authenticationUserTokenEClass = createEClass(AUTHENTICATION_USER_TOKEN);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__PROVIDER);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__ID_TOKEN);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__PICTURE);
		createEAttribute(authenticationUserTokenEClass, AUTHENTICATION_USER_TOKEN__USER);

		authenticationProviderEClass = createEClass(AUTHENTICATION_PROVIDER);

		authenticationProviderRegistryEClass = createEClass(AUTHENTICATION_PROVIDER_REGISTRY);

		// Create data types
		authenticationExceptionEDataType = createEDataType(AUTHENTICATION_EXCEPTION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		authenticationEClass.getESuperTypes().add(theEntityPackage.getEntity());
		authenticationAdminKeyEClass.getESuperTypes().add(this.getAuthentication());
		authenticationAnonymousEClass.getESuperTypes().add(this.getAuthentication());
		authenticationUserPasswordEClass.getESuperTypes().add(this.getAuthentication());
		authenticationUserTokenEClass.getESuperTypes().add(this.getAuthentication());
		EGenericType g1 = createEGenericType(theContextPackage.getRegistry());
		EGenericType g2 = createEGenericType(this.getAuthenticationProvider());
		g1.getETypeArguments().add(g2);
		authenticationProviderRegistryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(authenticationEClass, Authentication.class, "Authentication", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthentication_Tenant(), ecorePackage.getEString(), "tenant", null, 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationAdminKeyEClass, AuthenticationAdminKey.class, "AuthenticationAdminKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationAdminKey_AdminKey(), ecorePackage.getEString(), "adminKey", null, 1, 1, AuthenticationAdminKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationAnonymousEClass, AuthenticationAnonymous.class, "AuthenticationAnonymous", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationManagerEClass, AuthenticationManager.class, "AuthenticationManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(authenticationManagerEClass, ecorePackage.getEBoolean(), "checkLogin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAuthenticationUserToken(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "create", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(authenticationManagerEClass, theContextPackage.getContextHandler(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAuthenticationAnonymous(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getAuthenticationException());

		op = addEOperation(authenticationManagerEClass, theContextPackage.getContextHandler(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAuthenticationUserPassword(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getAuthenticationException());

		op = addEOperation(authenticationManagerEClass, theContextPackage.getContextHandler(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAuthenticationUserToken(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getAuthenticationException());

		op = addEOperation(authenticationManagerEClass, theContextPackage.getContextHandler(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAuthenticationAdminKey(), "authentication", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getAuthenticationException());

		initEClass(authenticationUserPasswordEClass, AuthenticationUserPassword.class, "AuthenticationUserPassword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationUserPassword_User(), ecorePackage.getEString(), "user", null, 1, 1, AuthenticationUserPassword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserPassword_Password(), ecorePackage.getEString(), "password", null, 1, 1, AuthenticationUserPassword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationUserTokenEClass, AuthenticationUserToken.class, "AuthenticationUserToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationUserToken_Provider(), ecorePackage.getEString(), "provider", null, 1, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserToken_AccessToken(), ecorePackage.getEString(), "accessToken", null, 1, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserToken_IdToken(), ecorePackage.getEString(), "idToken", null, 1, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserToken_Picture(), ecorePackage.getEString(), "picture", null, 0, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationUserToken_User(), ecorePackage.getEString(), "user", null, 1, 1, AuthenticationUserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationProviderEClass, AuthenticationProvider.class, "AuthenticationProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(authenticationProviderEClass, ecorePackage.getEString(), "getRedirectLocation", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contextId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getAuthenticationException());

		op = addEOperation(authenticationProviderEClass, this.getAuthenticationUserToken(), "checkAccessToken", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "authorizationCode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getAuthenticationException());

		initEClass(authenticationProviderRegistryEClass, AuthenticationProviderRegistry.class, "AuthenticationProviderRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(authenticationExceptionEDataType, AuthenticationException.class, "AuthenticationException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //AuthenticationPackageImpl
