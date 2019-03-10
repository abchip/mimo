/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.util.impl;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

import java.lang.Iterable;
import java.lang.Thread;

import java.lang.annotation.Annotation;

import java.lang.management.ThreadInfo;

import java.lang.reflect.Type;

import java.net.URI;
import java.net.URL;

import java.nio.ByteBuffer;

import java.nio.charset.Charset;

import java.security.Principal;

import java.util.Dictionary;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.impl.ApplicationPackageImpl;
import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.context.impl.ContextPackageImpl;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.entity.impl.EntityPackageImpl;

import org.abchip.mimo.expression.ExpressionPackage;

import org.abchip.mimo.expression.impl.ExpressionPackageImpl;
import org.abchip.mimo.impl.MimoPackageImpl;
import org.abchip.mimo.net.NetPackage;
import org.abchip.mimo.net.impl.NetPackageImpl;
import org.abchip.mimo.util.BinaryDef;
import org.abchip.mimo.util.BinaryType;
import org.abchip.mimo.util.CharacterDef;
import org.abchip.mimo.util.Classes;
import org.abchip.mimo.util.DataDef;
import org.abchip.mimo.util.DataDefType;
import org.abchip.mimo.util.DateFormat;
import org.abchip.mimo.util.DatetimeDef;
import org.abchip.mimo.util.DatetimeType;
import org.abchip.mimo.util.DecimalDef;
import org.abchip.mimo.util.DecimalType;
import org.abchip.mimo.util.Files;
import org.abchip.mimo.util.FloatingDef;
import org.abchip.mimo.util.FloatingType;
import org.abchip.mimo.util.IdentityDef;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.UtilFactory;
import org.abchip.mimo.util.UtilPackage;
import org.abchip.mimo.util.NumericDef;
import org.abchip.mimo.util.Singleton;
import org.abchip.mimo.util.Streams;
import org.abchip.mimo.util.StringDef;
import org.abchip.mimo.util.Strings;
import org.abchip.mimo.util.ThreadManager;
import org.abchip.mimo.util.ThreadStatus;
import org.abchip.mimo.util.Threads;
import org.abchip.mimo.util.TimeFormat;
import org.abchip.mimo.util.URIs;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	private EClass binaryDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterDefEClass = null;

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
	private EClass dataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalDefEClass = null;

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
	private EClass floatingDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaByteBufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaBlockingQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaCallableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaCharsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaCloseableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaConcurrentMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaExecutorServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaIterableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaPrincipalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaRunnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaSerializableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaThreadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaThreadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaThreadInfoEClass = null;

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
	private EClass numericDefEClass = null;

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
	private EClass stringDefEClass = null;

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
	private EEnum binaryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataDefTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datetimeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decimalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum floatingTypeEEnum = null;

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
	private EEnum timeFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaAnnotationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaDictionaryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaInputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaIOExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaOutputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaPropertiesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaThrowableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaURLEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaWriterEDataType = null;

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(registeredPackage instanceof ExpressionPackageImpl ? registeredPackage : ExpressionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetPackage.eNS_URI);
		NetPackageImpl theNetPackage = (NetPackageImpl)(registeredPackage instanceof NetPackageImpl ? registeredPackage : NetPackage.eINSTANCE);

		// Create package meta-data objects
		theUtilPackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theNetPackage.createPackageContents();

		// Initialize created meta-data
		theUtilPackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theNetPackage.initializePackageContents();

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
	public EClass getBinaryDef() {
		return binaryDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryDef_Type() {
		return (EAttribute)binaryDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryDef_Unsigned() {
		return (EAttribute)binaryDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacterDef() {
		return characterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterDef_Length() {
		return (EAttribute)characterDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterDef_Varying() {
		return (EAttribute)characterDefEClass.getEStructuralFeatures().get(1);
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
	public EClass getDataDef() {
		return dataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataDef_Formulas() {
		return (EAttribute)dataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatetimeDef() {
		return datetimeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatetimeDef_Type() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatetimeDef_DateFormat() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatetimeDef_TimeFormat() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimalDef() {
		return decimalDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalDef_Precision() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalDef_Scale() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalDef_Type() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(2);
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
	public EClass getFloatingDef() {
		return floatingDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFloatingDef_Type() {
		return (EAttribute)floatingDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentityDef() {
		return identityDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaByteBuffer() {
		return javaByteBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaBlockingQueue() {
		return javaBlockingQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaCallable() {
		return javaCallableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaCharset() {
		return javaCharsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaCloseable() {
		return javaCloseableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaConcurrentMap() {
		return javaConcurrentMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaEnum() {
		return javaEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaExecutorService() {
		return javaExecutorServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaFile() {
		return javaFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaIterable() {
		return javaIterableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaIterator() {
		return javaIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaList() {
		return javaListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaNumber() {
		return javaNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaPrincipal() {
		return javaPrincipalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaRunnable() {
		return javaRunnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaThread() {
		return javaThreadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaThreadGroup() {
		return javaThreadGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaThreadInfo() {
		return javaThreadInfoEClass;
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
	public EClass getNumericDef() {
		return numericDefEClass;
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
	public EClass getStringDef() {
		return stringDefEClass;
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
	public EEnum getBinaryType() {
		return binaryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataDefType() {
		return dataDefTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatetimeType() {
		return datetimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDateFormat() {
		return dateFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDecimalType() {
		return decimalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFloatingType() {
		return floatingTypeEEnum;
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
	public EEnum getTimeFormat() {
		return timeFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaAnnotation() {
		return javaAnnotationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaDictionary() {
		return javaDictionaryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaException() {
		return javaExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaInputStream() {
		return javaInputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaIOException() {
		return javaIOExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaMap() {
		return javaMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaOutputStream() {
		return javaOutputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaProperties() {
		return javaPropertiesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaThrowable() {
		return javaThrowableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaType() {
		return javaTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaURI() {
		return javaURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaURL() {
		return javaURLEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaWriter() {
		return javaWriterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaSerializable() {
		return javaSerializableEClass;
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
		binaryDefEClass = createEClass(BINARY_DEF);
		createEAttribute(binaryDefEClass, BINARY_DEF__TYPE);
		createEAttribute(binaryDefEClass, BINARY_DEF__UNSIGNED);

		characterDefEClass = createEClass(CHARACTER_DEF);
		createEAttribute(characterDefEClass, CHARACTER_DEF__LENGTH);
		createEAttribute(characterDefEClass, CHARACTER_DEF__VARYING);

		classesEClass = createEClass(CLASSES);

		dataDefEClass = createEClass(DATA_DEF);
		createEAttribute(dataDefEClass, DATA_DEF__FORMULAS);

		datetimeDefEClass = createEClass(DATETIME_DEF);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__TYPE);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__DATE_FORMAT);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__TIME_FORMAT);

		decimalDefEClass = createEClass(DECIMAL_DEF);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__PRECISION);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__SCALE);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__TYPE);

		filesEClass = createEClass(FILES);

		floatingDefEClass = createEClass(FLOATING_DEF);
		createEAttribute(floatingDefEClass, FLOATING_DEF__TYPE);

		identityDefEClass = createEClass(IDENTITY_DEF);

		javaByteBufferEClass = createEClass(JAVA_BYTE_BUFFER);

		javaBlockingQueueEClass = createEClass(JAVA_BLOCKING_QUEUE);

		javaCallableEClass = createEClass(JAVA_CALLABLE);

		javaCharsetEClass = createEClass(JAVA_CHARSET);

		javaCloseableEClass = createEClass(JAVA_CLOSEABLE);

		javaConcurrentMapEClass = createEClass(JAVA_CONCURRENT_MAP);

		javaEnumEClass = createEClass(JAVA_ENUM);

		javaExecutorServiceEClass = createEClass(JAVA_EXECUTOR_SERVICE);

		javaFileEClass = createEClass(JAVA_FILE);

		javaIterableEClass = createEClass(JAVA_ITERABLE);

		javaIteratorEClass = createEClass(JAVA_ITERATOR);

		javaListEClass = createEClass(JAVA_LIST);

		javaNumberEClass = createEClass(JAVA_NUMBER);

		javaPrincipalEClass = createEClass(JAVA_PRINCIPAL);

		javaRunnableEClass = createEClass(JAVA_RUNNABLE);

		javaSerializableEClass = createEClass(JAVA_SERIALIZABLE);

		javaThreadEClass = createEClass(JAVA_THREAD);

		javaThreadGroupEClass = createEClass(JAVA_THREAD_GROUP);

		javaThreadInfoEClass = createEClass(JAVA_THREAD_INFO);

		listsEClass = createEClass(LISTS);

		numericDefEClass = createEClass(NUMERIC_DEF);

		singletonEClass = createEClass(SINGLETON);

		streamsEClass = createEClass(STREAMS);

		stringDefEClass = createEClass(STRING_DEF);

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
		binaryTypeEEnum = createEEnum(BINARY_TYPE);
		dataDefTypeEEnum = createEEnum(DATA_DEF_TYPE);
		datetimeTypeEEnum = createEEnum(DATETIME_TYPE);
		dateFormatEEnum = createEEnum(DATE_FORMAT);
		decimalTypeEEnum = createEEnum(DECIMAL_TYPE);
		floatingTypeEEnum = createEEnum(FLOATING_TYPE);
		threadStatusEEnum = createEEnum(THREAD_STATUS);
		timeFormatEEnum = createEEnum(TIME_FORMAT);

		// Create data types
		javaAnnotationEDataType = createEDataType(JAVA_ANNOTATION);
		javaDictionaryEDataType = createEDataType(JAVA_DICTIONARY);
		javaExceptionEDataType = createEDataType(JAVA_EXCEPTION);
		javaInputStreamEDataType = createEDataType(JAVA_INPUT_STREAM);
		javaIOExceptionEDataType = createEDataType(JAVA_IO_EXCEPTION);
		javaMapEDataType = createEDataType(JAVA_MAP);
		javaOutputStreamEDataType = createEDataType(JAVA_OUTPUT_STREAM);
		javaPropertiesEDataType = createEDataType(JAVA_PROPERTIES);
		javaThrowableEDataType = createEDataType(JAVA_THROWABLE);
		javaTypeEDataType = createEDataType(JAVA_TYPE);
		javaURIEDataType = createEDataType(JAVA_URI);
		javaURLEDataType = createEDataType(JAVA_URL);
		javaWriterEDataType = createEDataType(JAVA_WRITER);
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

		// Create type parameters
		addETypeParameter(dataDefEClass, "D");
		addETypeParameter(javaCallableEClass, "V");
		addETypeParameter(javaIterableEClass, "T");
		addETypeParameter(javaIteratorEClass, "T");
		addETypeParameter(javaListEClass, "E");
		ETypeParameter singletonEClass_S = addETypeParameter(singletonEClass, "S");
		addETypeParameter(javaDictionaryEDataType, "K");
		addETypeParameter(javaDictionaryEDataType, "V");
		addETypeParameter(javaMapEDataType, "K");
		addETypeParameter(javaMapEDataType, "V");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaObject());
		singletonEClass_S.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getDataDef());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		characterDefEClass.getEGenericSuperTypes().add(g1);
		dataDefEClass.getESuperTypes().add(theEntityPackage.getEntity());
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(ecorePackage.getEDate());
		g1.getETypeArguments().add(g2);
		datetimeDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(this.getJavaNumber());
		g1.getETypeArguments().add(g2);
		decimalDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(ecorePackage.getEFloatObject());
		g1.getETypeArguments().add(g2);
		floatingDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(this.getJavaNumber());
		g1.getETypeArguments().add(g2);
		identityDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSingleton());
		g2 = createEGenericType(this.getLists());
		g1.getETypeArguments().add(g2);
		listsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(this.getJavaNumber());
		g1.getETypeArguments().add(g2);
		numericDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		stringDefEClass.getEGenericSuperTypes().add(g1);
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
		initEClass(binaryDefEClass, BinaryDef.class, "BinaryDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryDef_Type(), this.getBinaryType(), "type", null, 1, 1, BinaryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryDef_Unsigned(), ecorePackage.getEBoolean(), "unsigned", null, 0, 1, BinaryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterDefEClass, CharacterDef.class, "CharacterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterDef_Length(), ecorePackage.getEInt(), "length", null, 1, 1, CharacterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterDef_Varying(), ecorePackage.getEBoolean(), "varying", null, 0, 1, CharacterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(dataDefEClass, DataDef.class, "DataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDef_Formulas(), ecorePackage.getEString(), "formulas", null, 0, -1, DataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dataDefEClass, null, "getJavaClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(dataDefEClass, this.getDataDefType(), "getDataDefType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datetimeDefEClass, DatetimeDef.class, "DatetimeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatetimeDef_Type(), this.getDatetimeType(), "type", null, 1, 1, DatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeDef_DateFormat(), this.getDateFormat(), "dateFormat", null, 0, 1, DatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeDef_TimeFormat(), this.getTimeFormat(), "timeFormat", null, 0, 1, DatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalDefEClass, DecimalDef.class, "DecimalDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalDef_Precision(), ecorePackage.getEInt(), "precision", null, 1, 1, DecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalDef_Scale(), ecorePackage.getEInt(), "scale", null, 0, 1, DecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalDef_Type(), this.getDecimalType(), "type", null, 0, 1, DecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filesEClass, Files.class, "Files", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(filesEClass, ecorePackage.getEString(), "getBaseName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(filesEClass, null, "cleanDirectory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJavaIOException());

		op = addEOperation(filesEClass, null, "deleteDirectory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJavaIOException());

		addEOperation(filesEClass, ecorePackage.getEString(), "getSeparator", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(filesEClass, this.getJavaFile(), "copyToFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInputStream(), "stream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getJavaIOException());

		initEClass(floatingDefEClass, FloatingDef.class, "FloatingDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingDef_Type(), this.getFloatingType(), "type", null, 1, 1, FloatingDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityDefEClass, IdentityDef.class, "IdentityDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaByteBufferEClass, ByteBuffer.class, "JavaByteBuffer", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaBlockingQueueEClass, BlockingQueue.class, "JavaBlockingQueue", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.util.concurrent.BlockingQueue<E>");

		initEClass(javaCallableEClass, Callable.class, "JavaCallable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaCharsetEClass, Charset.class, "JavaCharset", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaCloseableEClass, Closeable.class, "JavaCloseable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaConcurrentMapEClass, ConcurrentMap.class, "JavaConcurrentMap", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.util.concurrent.ConcurrentMap<K, V>");

		initEClass(javaEnumEClass, Enum.class, "JavaEnum", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "java.lang.Enum<E>");

		initEClass(javaExecutorServiceEClass, ExecutorService.class, "JavaExecutorService", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaFileEClass, File.class, "JavaFile", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaIterableEClass, Iterable.class, "JavaIterable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaIteratorEClass, Iterator.class, "JavaIterator", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaListEClass, List.class, "JavaList", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaNumberEClass, Number.class, "JavaNumber", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaPrincipalEClass, Principal.class, "JavaPrincipal", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaRunnableEClass, Runnable.class, "JavaRunnable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaSerializableEClass, Serializable.class, "JavaSerializable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaThreadEClass, Thread.class, "JavaThread", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaThreadGroupEClass, ThreadGroup.class, "JavaThreadGroup", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaThreadInfoEClass, ThreadInfo.class, "JavaThreadInfo", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(listsEClass, Lists.class, "Lists", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(listsEClass, null, "addFirst", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addLast", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "oldElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "newElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listsEClass, null, "addAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(this.getJavaList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "list", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "oldElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "newElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numericDefEClass, NumericDef.class, "NumericDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singletonEClass, Singleton.class, "Singleton", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(streamsEClass, Streams.class, "Streams", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(streamsEClass, null, "copy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaInputStream(), "input", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringDefEClass, StringDef.class, "StringDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		addEOperation(threadEClass, this.getJavaThread(), "getJavaThread", 1, 1, IS_UNIQUE, IS_ORDERED);

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

		addEOperation(threadsEClass, this.getJavaThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "threadGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThread(), "listThreads", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaThreadGroup(), "threadGroup", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadsEClass, this.getJavaThreadInfo(), "listThreadInfos", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(threadsEClass, this.getJavaThreadGroup(), "listThreadGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThread(), "lookupBlockingThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThread(), "lookupLockingThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThread(), "lookupThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaThreadInfo(), "info", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThreadGroup(), "lookupThreadGroup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThreadInfo(), "lookupThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThreadInfo(), "lookupThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadsEClass, this.getJavaThreadInfo(), "lookupThreadInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaThread(), "thread", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(threadInfoEClass, org.abchip.mimo.util.ThreadInfo.class, "ThreadInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreadInfo_ThreadName(), ecorePackage.getEString(), "threadName", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadId(), ecorePackage.getELong(), "threadId", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadPriority(), ecorePackage.getEInt(), "threadPriority", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadCPUUsage(), ecorePackage.getEDouble(), "threadCPUUsage", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadStatus(), this.getThreadStatus(), "threadStatus", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadRunnable(), ecorePackage.getEBoolean(), "threadRunnable", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadInterrupted(), ecorePackage.getEBoolean(), "threadInterrupted", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadNative(), ecorePackage.getEBoolean(), "threadNative", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadSuspended(), ecorePackage.getEBoolean(), "threadSuspended", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreadInfo_ThreadDaemon(), ecorePackage.getEBoolean(), "threadDaemon", null, 1, 1, org.abchip.mimo.util.ThreadInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threadManagerEClass, ThreadManager.class, "ThreadManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(threadManagerEClass, this.getThread(), "createThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaRunnable(), "runnable", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(threadManagerEClass, this.getThread(), "createThread", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJavaRunnable(), "runnable", 1, 1, IS_UNIQUE, IS_ORDERED);
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
		addEParameter(op, this.getJavaURI(), "uri", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryTypeEEnum, BinaryType.class, "BinaryType");
		addEEnumLiteral(binaryTypeEEnum, BinaryType.BYTE);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.SHORT);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.INTEGER);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.LONG);

		initEEnum(dataDefTypeEEnum, DataDefType.class, "DataDefType");
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.ADAPTER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.ARRAY);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.BINARY);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.BUFFER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.CHARACTER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.DATA_STRUCT);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.DATETIME);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.DECIMAL);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.FLOATING);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.HEXADECIMAL);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.IDENTITY);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.INDICATOR);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.LIST);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.POINTER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.SCROLLER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.STRING);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.STROLLER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.STRUCT);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.WRAPPER);

		initEEnum(datetimeTypeEEnum, DatetimeType.class, "DatetimeType");
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.DATE);
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.TIME);
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.TIME_STAMP);

		initEEnum(dateFormatEEnum, DateFormat.class, "DateFormat");
		addEEnumLiteral(dateFormatEEnum, DateFormat.ISO);
		addEEnumLiteral(dateFormatEEnum, DateFormat.MDY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.DMY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.YMD);
		addEEnumLiteral(dateFormatEEnum, DateFormat.YYMD);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JUL);
		addEEnumLiteral(dateFormatEEnum, DateFormat.USA);
		addEEnumLiteral(dateFormatEEnum, DateFormat.EUR);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JIS);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JOBRUN);

		initEEnum(decimalTypeEEnum, DecimalType.class, "DecimalType");
		addEEnumLiteral(decimalTypeEEnum, DecimalType.ZONED);
		addEEnumLiteral(decimalTypeEEnum, DecimalType.PACKED);

		initEEnum(floatingTypeEEnum, FloatingType.class, "FloatingType");
		addEEnumLiteral(floatingTypeEEnum, FloatingType.SINGLE);
		addEEnumLiteral(floatingTypeEEnum, FloatingType.DOUBLE);

		initEEnum(threadStatusEEnum, ThreadStatus.class, "ThreadStatus");
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.NEW);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.RUNNABLE);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.BLOCKED);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.WAITING);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.TIMED_WAITING);
		addEEnumLiteral(threadStatusEEnum, ThreadStatus.TERMINATED);

		initEEnum(timeFormatEEnum, TimeFormat.class, "TimeFormat");
		addEEnumLiteral(timeFormatEEnum, TimeFormat.ISO);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.HMS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.USA);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.EUR);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JIS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JOBRUN);

		// Initialize data types
		initEDataType(javaAnnotationEDataType, Annotation.class, "JavaAnnotation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaDictionaryEDataType, Dictionary.class, "JavaDictionary", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaExceptionEDataType, Exception.class, "JavaException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaInputStreamEDataType, InputStream.class, "JavaInputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaIOExceptionEDataType, IOException.class, "JavaIOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaMapEDataType, Map.class, "JavaMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaOutputStreamEDataType, OutputStream.class, "JavaOutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaPropertiesEDataType, Properties.class, "JavaProperties", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaThrowableEDataType, Throwable.class, "JavaThrowable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaTypeEDataType, Type.class, "JavaType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaURIEDataType, URI.class, "JavaURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaURLEDataType, URL.class, "JavaURL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaWriterEDataType, Writer.class, "JavaWriter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //UtilPackageImpl
