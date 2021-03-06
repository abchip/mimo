/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.view.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.ui.UIPackage;

import org.abchip.mimo.ui.event.EventPackage;

import org.abchip.mimo.ui.event.impl.EventPackageImpl;

import org.abchip.mimo.ui.form.FormPackage;

import org.abchip.mimo.ui.form.impl.FormPackageImpl;

import org.abchip.mimo.ui.impl.UIPackageImpl;

import org.abchip.mimo.ui.menu.MenuPackage;

import org.abchip.mimo.ui.menu.impl.MenuPackageImpl;

import org.abchip.mimo.ui.query.QueryPackage;

import org.abchip.mimo.ui.query.impl.QueryPackageImpl;

import org.abchip.mimo.ui.schema.SchemaPackage;

import org.abchip.mimo.ui.schema.impl.SchemaPackageImpl;

import org.abchip.mimo.ui.toolbar.ToolbarPackage;

import org.abchip.mimo.ui.toolbar.impl.ToolbarPackageImpl;

import org.abchip.mimo.ui.view.View;
import org.abchip.mimo.ui.view.ViewCard;
import org.abchip.mimo.ui.view.ViewDashboard;
import org.abchip.mimo.ui.view.ViewEditor;
import org.abchip.mimo.ui.view.ViewFactory;
import org.abchip.mimo.ui.view.ViewSearch;
import org.abchip.mimo.ui.view.ViewImport;
import org.abchip.mimo.ui.view.ViewPackage;
import org.abchip.mimo.ui.view.ViewType;

import org.abchip.mimo.ui.widget.WidgetPackage;

import org.abchip.mimo.ui.widget.impl.WidgetPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
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
public class ViewPackageImpl extends EPackageImpl implements ViewPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDashboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum viewTypeEEnum = null;

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
	 * @see org.abchip.mimo.ui.view.ViewPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewPackageImpl() {
		super(eNS_URI, ViewFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViewPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewPackage init() {
		if (isInited) return (ViewPackage)EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViewPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ViewPackageImpl theViewPackage = registeredViewPackage instanceof ViewPackageImpl ? (ViewPackageImpl)registeredViewPackage : new ViewPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UIPackage.eNS_URI);
		UIPackageImpl theUIPackage = (UIPackageImpl)(registeredPackage instanceof UIPackageImpl ? registeredPackage : UIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);
		FormPackageImpl theFormPackage = (FormPackageImpl)(registeredPackage instanceof FormPackageImpl ? registeredPackage : FormPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
		EventPackageImpl theEventPackage = (EventPackageImpl)(registeredPackage instanceof EventPackageImpl ? registeredPackage : EventPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MenuPackage.eNS_URI);
		MenuPackageImpl theMenuPackage = (MenuPackageImpl)(registeredPackage instanceof MenuPackageImpl ? registeredPackage : MenuPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(registeredPackage instanceof QueryPackageImpl ? registeredPackage : QueryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ToolbarPackage.eNS_URI);
		ToolbarPackageImpl theToolbarPackage = (ToolbarPackageImpl)(registeredPackage instanceof ToolbarPackageImpl ? registeredPackage : ToolbarPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI);
		WidgetPackageImpl theWidgetPackage = (WidgetPackageImpl)(registeredPackage instanceof WidgetPackageImpl ? registeredPackage : WidgetPackage.eINSTANCE);

		// Create package meta-data objects
		theViewPackage.createPackageContents();
		theUIPackage.createPackageContents();
		theFormPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theMenuPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theToolbarPackage.createPackageContents();
		theWidgetPackage.createPackageContents();

		// Initialize created meta-data
		theViewPackage.initializePackageContents();
		theUIPackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theMenuPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theToolbarPackage.initializePackageContents();
		theWidgetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewPackage.eNS_URI, theViewPackage);
		return theViewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Name() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Disabled() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Entry() {
		return (EReference)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewCard() {
		return viewCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewCard_Type() {
		return (EAttribute)viewCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewDashboard() {
		return viewDashboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewDashboard_Type() {
		return (EAttribute)viewDashboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewEditor() {
		return viewEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewEditor_Type() {
		return (EAttribute)viewEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewSearch() {
		return viewSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewSearch_Type() {
		return (EAttribute)viewSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewImport() {
		return viewImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewImport_Type() {
		return (EAttribute)viewImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getViewType() {
		return viewTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewFactory getViewFactory() {
		return (ViewFactory)getEFactoryInstance();
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
		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__NAME);
		createEAttribute(viewEClass, VIEW__DISABLED);
		createEReference(viewEClass, VIEW__ENTRY);

		viewCardEClass = createEClass(VIEW_CARD);
		createEAttribute(viewCardEClass, VIEW_CARD__TYPE);

		viewDashboardEClass = createEClass(VIEW_DASHBOARD);
		createEAttribute(viewDashboardEClass, VIEW_DASHBOARD__TYPE);

		viewEditorEClass = createEClass(VIEW_EDITOR);
		createEAttribute(viewEditorEClass, VIEW_EDITOR__TYPE);

		viewSearchEClass = createEClass(VIEW_SEARCH);
		createEAttribute(viewSearchEClass, VIEW_SEARCH__TYPE);

		viewImportEClass = createEClass(VIEW_IMPORT);
		createEAttribute(viewImportEClass, VIEW_IMPORT__TYPE);

		// Create enums
		viewTypeEEnum = createEEnum(VIEW_TYPE);
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
		UIPackage theUIPackage = (UIPackage)EPackage.Registry.INSTANCE.getEPackage(UIPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters
		ETypeParameter viewEClass_E = addETypeParameter(viewEClass, "E");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theUIPackage.getEntry());
		viewEClass_E.getEBounds().add(g1);

		// Add supertypes to classes
		viewEClass.getESuperTypes().add(theEntityPackage.getEntity());
		g1 = createEGenericType(this.getView());
		EGenericType g2 = createEGenericType(theUIPackage.getEntryFramed());
		g1.getETypeArguments().add(g2);
		viewCardEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView());
		g2 = createEGenericType(theUIPackage.getEntryFramed());
		g1.getETypeArguments().add(g2);
		viewDashboardEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView());
		g2 = createEGenericType(theUIPackage.getEntryFramed());
		g1.getETypeArguments().add(g2);
		viewEditorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView());
		g2 = createEGenericType(theUIPackage.getEntryFramed());
		g1.getETypeArguments().add(g2);
		viewSearchEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView());
		g2 = createEGenericType(theUIPackage.getEntryFramed());
		g1.getETypeArguments().add(g2);
		viewImportEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Disabled(), ecorePackage.getEBoolean(), "disabled", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(viewEClass_E);
		initEReference(getView_Entry(), g1, null, "entry", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(viewEClass, this.getViewType(), "getType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(viewCardEClass, ViewCard.class, "ViewCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewCard_Type(), this.getViewType(), "type", "mm-card", 1, 1, ViewCard.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewDashboardEClass, ViewDashboard.class, "ViewDashboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewDashboard_Type(), this.getViewType(), "type", "mm-dashboard", 1, 1, ViewDashboard.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEditorEClass, ViewEditor.class, "ViewEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewEditor_Type(), this.getViewType(), "type", "mm-editor", 1, 1, ViewEditor.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewSearchEClass, ViewSearch.class, "ViewSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewSearch_Type(), this.getViewType(), "type", "mm-search", 1, 1, ViewSearch.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewImportEClass, ViewImport.class, "ViewImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewImport_Type(), this.getViewType(), "type", "mm-import", 1, 1, ViewImport.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(viewTypeEEnum, ViewType.class, "ViewType");
		addEEnumLiteral(viewTypeEEnum, ViewType.CARD);
		addEEnumLiteral(viewTypeEEnum, ViewType.DASHBARD);
		addEEnumLiteral(viewTypeEEnum, ViewType.EDITOR);
		addEEnumLiteral(viewTypeEEnum, ViewType.IMPORT);
		addEEnumLiteral(viewTypeEEnum, ViewType.REPORT);
		addEEnumLiteral(viewTypeEEnum, ViewType.SEARCH);
	}

} //ViewPackageImpl
