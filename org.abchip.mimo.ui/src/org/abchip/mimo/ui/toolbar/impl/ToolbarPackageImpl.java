/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.toolbar.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.ui.UIPackage;
import org.abchip.mimo.ui.form.FormPackage;
import org.abchip.mimo.ui.form.impl.FormPackageImpl;
import org.abchip.mimo.ui.impl.UIPackageImpl;
import org.abchip.mimo.ui.menu.MenuPackage;

import org.abchip.mimo.ui.menu.impl.MenuPackageImpl;

import org.abchip.mimo.ui.schema.SchemaPackage;

import org.abchip.mimo.ui.schema.impl.SchemaPackageImpl;

import org.abchip.mimo.ui.toolbar.Toolbar;
import org.abchip.mimo.ui.toolbar.ToolbarFactory;
import org.abchip.mimo.ui.toolbar.ToolbarPackage;
import org.abchip.mimo.ui.toolbar.ToolbarView;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolbarPackageImpl extends EPackageImpl implements ToolbarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolbarViewEClass = null;

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
	 * @see org.abchip.mimo.ui.toolbar.ToolbarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToolbarPackageImpl() {
		super(eNS_URI, ToolbarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToolbarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToolbarPackage init() {
		if (isInited) return (ToolbarPackage)EPackage.Registry.INSTANCE.getEPackage(ToolbarPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredToolbarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ToolbarPackageImpl theToolbarPackage = registeredToolbarPackage instanceof ToolbarPackageImpl ? (ToolbarPackageImpl)registeredToolbarPackage : new ToolbarPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UIPackage.eNS_URI);
		UIPackageImpl theUIPackage = (UIPackageImpl)(registeredPackage instanceof UIPackageImpl ? registeredPackage : UIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MenuPackage.eNS_URI);
		MenuPackageImpl theMenuPackage = (MenuPackageImpl)(registeredPackage instanceof MenuPackageImpl ? registeredPackage : MenuPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);
		FormPackageImpl theFormPackage = (FormPackageImpl)(registeredPackage instanceof FormPackageImpl ? registeredPackage : FormPackage.eINSTANCE);

		// Create package meta-data objects
		theToolbarPackage.createPackageContents();
		theUIPackage.createPackageContents();
		theMenuPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theFormPackage.createPackageContents();

		// Initialize created meta-data
		theToolbarPackage.initializePackageContents();
		theUIPackage.initializePackageContents();
		theMenuPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theFormPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToolbarPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToolbarPackage.eNS_URI, theToolbarPackage);
		return theToolbarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolbar() {
		return toolbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolbar_Elements() {
		return (EReference)toolbarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolbar_Name() {
		return (EAttribute)toolbarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolbarView() {
		return toolbarViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolbarView_Action() {
		return (EAttribute)toolbarViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolbarView_Icon() {
		return (EAttribute)toolbarViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolbarView_Label() {
		return (EAttribute)toolbarViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolbarView_View() {
		return (EAttribute)toolbarViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolbarFactory getToolbarFactory() {
		return (ToolbarFactory)getEFactoryInstance();
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
		toolbarEClass = createEClass(TOOLBAR);
		createEReference(toolbarEClass, TOOLBAR__ELEMENTS);
		createEAttribute(toolbarEClass, TOOLBAR__NAME);

		toolbarViewEClass = createEClass(TOOLBAR_VIEW);
		createEAttribute(toolbarViewEClass, TOOLBAR_VIEW__ACTION);
		createEAttribute(toolbarViewEClass, TOOLBAR_VIEW__ICON);
		createEAttribute(toolbarViewEClass, TOOLBAR_VIEW__LABEL);
		createEAttribute(toolbarViewEClass, TOOLBAR_VIEW__VIEW);
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

		// Set bounds for type parameters

		// Add supertypes to classes
		toolbarEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());
		toolbarViewEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(toolbarEClass, Toolbar.class, "Toolbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolbar_Elements(), this.getToolbarView(), null, "elements", null, 0, -1, Toolbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolbar_Name(), ecorePackage.getEString(), "name", null, 1, 1, Toolbar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolbarViewEClass, ToolbarView.class, "ToolbarView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolbarView_Action(), ecorePackage.getEString(), "action", null, 0, 1, ToolbarView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolbarView_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, ToolbarView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolbarView_Label(), ecorePackage.getEString(), "label", null, 0, 1, ToolbarView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolbarView_View(), ecorePackage.getEString(), "view", null, 1, 1, ToolbarView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ToolbarPackageImpl
