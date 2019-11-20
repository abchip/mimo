/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.util.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.application.ApplicationPackage;

import org.abchip.mimo.application.impl.ApplicationPackageImpl;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.context.impl.ContextPackageImpl;

import org.abchip.mimo.data.DataPackage;

import org.abchip.mimo.data.impl.DataPackageImpl;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.entity.impl.EntityPackageImpl;

import org.abchip.mimo.impl.MimoPackageImpl;

import org.abchip.mimo.java.JavaPackage;

import org.abchip.mimo.java.impl.JavaPackageImpl;

import org.abchip.mimo.net.NetPackage;

import org.abchip.mimo.net.impl.NetPackageImpl;

import org.abchip.mimo.resource.ResourcePackage;

import org.abchip.mimo.resource.impl.ResourcePackageImpl;

import org.abchip.mimo.util.Classes;
import org.abchip.mimo.util.Files;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Singleton;
import org.abchip.mimo.util.Streams;
import org.abchip.mimo.util.Strings;
import org.abchip.mimo.util.ThreadInfo;
import org.abchip.mimo.util.ThreadManager;
import org.abchip.mimo.util.ThreadStatus;
import org.abchip.mimo.util.Threads;
import org.abchip.mimo.util.URIs;
import org.abchip.mimo.util.UtilFactory;
import org.abchip.mimo.util.UtilPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilPackageImpl extends EPackageImpl implements UtilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringsEClass = null;

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
	private EClass threadsEClass = null;

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
	private EClass urIsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum threadStatusEEnum = null;

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
	 * @see org.abchip.mimo.util.UtilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilPackageImpl() {
		super(eNS_URI, UtilFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UtilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilPackage init() {
		if (isInited) return (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUtilPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UtilPackageImpl theUtilPackage = registeredUtilPackage instanceof UtilPackageImpl ? (UtilPackageImpl)registeredUtilPackage : new UtilPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetPackage.eNS_URI);
		NetPackageImpl theNetPackage = (NetPackageImpl)(registeredPackage instanceof NetPackageImpl ? registeredPackage : NetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);
		ResourcePackageImpl theResourcePackage = (ResourcePackageImpl)(registeredPackage instanceof ResourcePackageImpl ? registeredPackage : ResourcePackage.eINSTANCE);

		// Create package meta-data objects
		theUtilPackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theNetPackage.createPackageContents();
		theResourcePackage.createPackageContents();

		// Initialize created meta-data
		theUtilPackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theNetPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilPackage.eNS_URI, theUtilPackage);
		return theUtilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClasses() {
		return classesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiles() {
		return filesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLists() {
		return listsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleton() {
		return singletonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStreams() {
		return streamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrings() {
		return stringsEClass;
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
	public EClass getThreads() {
		return threadsEClass;
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
	public EClass getURIs() {
		return urIsEClass;
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
	public UtilFactory getUtilFactory() {
		return (UtilFactory)getEFactoryInstance();
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
		classesEClass = createEClass(CLASSES);

		filesEClass = createEClass(FILES);

		listsEClass = createEClass(LISTS);

		singletonEClass = createEClass(SINGLETON);

		streamsEClass = createEClass(STREAMS);

		stringsEClass = createEClass(STRINGS);

		threadEClass = createEClass(THREAD);

		threadsEClass = createEClass(THREADS);

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

		urIsEClass = createEClass(UR_IS);

		// Create enums
		threadStatusEEnum = createEEnum(THREAD_STATUS);
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
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters
		ETypeParameter singletonEClass_S = addETypeParameter(singletonEClass, "S");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaObject());
		singletonEClass_S.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getSingleton());
		EGenericType g2 = createEGenericType(this.getLists());
		g1.getETypeArguments().add(g2);
		listsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSingleton());
		g2 = createEGenericType(this.getStrings());
		g1.getETypeArguments().add(g2);
		stringsEClass.getEGenericSuperTypes().add(g1);
		threadEClass.getESuperTypes().add(theEntityPackage.getEntity());
		g1 = createEGenericType(this.getSingleton());
		g2 = createEGenericType(this.getThreads());
		g1.getETypeArguments().add(g2);
		threadsEClass.getEGenericSuperTypes().add(g1);
		threadInfoEClass.getESuperTypes().add(theEntityPackage.getEntity());
		g1 = createEGenericType(this.getSingleton());
		g2 = createEGenericType(this.getThreadManager());
		g1.getETypeArguments().add(g2);
		threadManagerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(classesEClass, Classes.class, "Classes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(classesEClass, null, "getAllInterfaces", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "input", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(filesEClass, Files.class, "Files", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(filesEClass, ecorePackage.getEString(), "getBaseName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(filesEClass, null, "cleanDirectory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theJavaPackage.getJavaIOException());

		op = addEOperation(filesEClass, null, "deleteDirectory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theJavaPackage.getJavaIOException());

		addEOperation(filesEClass, ecorePackage.getEString(), "getSeparator", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(filesEClass, theJavaPackage.getJavaFile(), "copyToFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaInputStream(), "stream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theJavaPackage.getJavaIOException());

		initEClass(listsEClass, Lists.class, "Lists", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(listsEClass, null, "addFirst", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theJavaPackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addLast", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theJavaPackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theJavaPackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "oldElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "newElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theJavaPackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "oldElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "newElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "slice", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theJavaPackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "limit", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theJavaPackage.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(singletonEClass, Singleton.class, "Singleton", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(streamsEClass, Streams.class, "Streams", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(streamsEClass, null, "copy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaInputStream(), "input", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringsEClass, Strings.class, "Strings", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "appendChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "chars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "times", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "before", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEBooleanObject(), "checkEquals", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "escape", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "firstToUpper", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "firstToLower", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEBooleanObject(), "isEmptyTrim", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEBooleanObject(), "isOneOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "values", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "left", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "lSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "lSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filler", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "removeFirstChar", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "removeLastChar", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "right", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "rSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "rSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filler", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfChars", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filler", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "trimL", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringsEClass, ecorePackage.getEString(), "trimR", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(threadEClass, org.abchip.mimo.util.Thread.class, "Thread", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(threadsEClass, Threads.class, "Threads", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(threadsEClass, theJavaPackage.getJavaThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "threadGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaThreadGroup(), "threadGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadsEClass, theJavaPackage.getJavaThreadInfo(), "listThreadInfos", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadsEClass, theJavaPackage.getJavaThreadGroup(), "listThreadGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThread(), "lookupBlockingThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThread(), "lookupLockingThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaThreadInfo(), "info", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThreadGroup(), "lookupThreadGroup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThreadInfo(), "lookupThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThreadInfo(), "lookupThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, theJavaPackage.getJavaThreadInfo(), "lookupThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

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

		initEClass(urIsEClass, URIs.class, "URIs", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(urIsEClass, ecorePackage.getEString(), "getBaseName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaURI(), "uri", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(urIsEClass, null, "parseParameter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "query", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize enums and add enum literals
		initEEnum(threadStatusEEnum, ThreadStatus.class, "ThreadStatus");
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.NEW);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.RUNNABLE);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.BLOCKED);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.WAITING);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.TIMED_WAITING);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.TERMINATED);
	}

} //UtilPackageImpl
