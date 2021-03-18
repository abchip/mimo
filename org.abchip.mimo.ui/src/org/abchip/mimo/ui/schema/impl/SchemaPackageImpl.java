/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.schema.impl;

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
import org.abchip.mimo.ui.schema.Schema;
import org.abchip.mimo.ui.schema.SchemaColumn;
import org.abchip.mimo.ui.schema.SchemaFactory;
import org.abchip.mimo.ui.schema.SchemaPackage;

import org.abchip.mimo.ui.toolbar.ToolbarPackage;
import org.abchip.mimo.ui.toolbar.impl.ToolbarPackageImpl;
import org.abchip.mimo.ui.view.ViewPackage;
import org.abchip.mimo.ui.view.impl.ViewPackageImpl;
import org.abchip.mimo.ui.widget.WidgetPackage;
import org.abchip.mimo.ui.widget.impl.WidgetPackageImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaPackageImpl extends EPackageImpl implements SchemaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaColumnEClass = null;

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
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchemaPackageImpl() {
		super(eNS_URI, SchemaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchemaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchemaPackage init() {
		if (isInited) return (SchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchemaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchemaPackageImpl theSchemaPackage = registeredSchemaPackage instanceof SchemaPackageImpl ? (SchemaPackageImpl)registeredSchemaPackage : new SchemaPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ToolbarPackage.eNS_URI);
		ToolbarPackageImpl theToolbarPackage = (ToolbarPackageImpl)(registeredPackage instanceof ToolbarPackageImpl ? registeredPackage : ToolbarPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(registeredPackage instanceof ViewPackageImpl ? registeredPackage : ViewPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI);
		WidgetPackageImpl theWidgetPackage = (WidgetPackageImpl)(registeredPackage instanceof WidgetPackageImpl ? registeredPackage : WidgetPackage.eINSTANCE);

		// Create package meta-data objects
		theSchemaPackage.createPackageContents();
		theUIPackage.createPackageContents();
		theFormPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theMenuPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		theToolbarPackage.createPackageContents();
		theViewPackage.createPackageContents();
		theWidgetPackage.createPackageContents();

		// Initialize created meta-data
		theSchemaPackage.initializePackageContents();
		theUIPackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theMenuPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		theToolbarPackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theWidgetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchemaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchemaPackage.eNS_URI, theSchemaPackage);
		return theSchemaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Columns() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Name() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaColumn() {
		return schemaColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaColumn_Id() {
		return (EAttribute)schemaColumnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaColumn_LeftSplit() {
		return (EAttribute)schemaColumnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaColumn_Sort() {
		return (EAttribute)schemaColumnEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaColumn_Widget() {
		return (EReference)schemaColumnEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaColumn_Domain() {
		return (EReference)schemaColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaColumn_Group() {
		return (EAttribute)schemaColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaColumn_Header() {
		return (EAttribute)schemaColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaColumn_Hidden() {
		return (EAttribute)schemaColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaColumn_Icon() {
		return (EAttribute)schemaColumnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaColumn_Adjust() {
		return (EAttribute)schemaColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaColumn_ContextMenu() {
		return (EAttribute)schemaColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaFactory getSchemaFactory() {
		return (SchemaFactory)getEFactoryInstance();
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
		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__COLUMNS);
		createEAttribute(schemaEClass, SCHEMA__NAME);

		schemaColumnEClass = createEClass(SCHEMA_COLUMN);
		createEAttribute(schemaColumnEClass, SCHEMA_COLUMN__ADJUST);
		createEAttribute(schemaColumnEClass, SCHEMA_COLUMN__CONTEXT_MENU);
		createEReference(schemaColumnEClass, SCHEMA_COLUMN__DOMAIN);
		createEAttribute(schemaColumnEClass, SCHEMA_COLUMN__GROUP);
		createEAttribute(schemaColumnEClass, SCHEMA_COLUMN__HEADER);
		createEAttribute(schemaColumnEClass, SCHEMA_COLUMN__HIDDEN);
		createEAttribute(schemaColumnEClass, SCHEMA_COLUMN__ICON);
		createEAttribute(schemaColumnEClass, SCHEMA_COLUMN__ID);
		createEAttribute(schemaColumnEClass, SCHEMA_COLUMN__LEFT_SPLIT);
		createEAttribute(schemaColumnEClass, SCHEMA_COLUMN__SORT);
		createEReference(schemaColumnEClass, SCHEMA_COLUMN__WIDGET);
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
		WidgetPackage theWidgetPackage = (WidgetPackage)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		schemaEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		schemaColumnEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_Columns(), this.getSchemaColumn(), null, "columns", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Name(), ecorePackage.getEString(), "name", null, 1, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(schemaEClass, this.getSchemaColumn(), "getColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(schemaColumnEClass, SchemaColumn.class, "SchemaColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaColumn_Adjust(), ecorePackage.getEBoolean(), "adjust", null, 0, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaColumn_ContextMenu(), ecorePackage.getEBoolean(), "contextMenu", null, 0, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaColumn_Domain(), theEntityPackage.getDomain(), null, "domain", null, 0, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaColumn_Group(), ecorePackage.getEString(), "group", null, 0, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaColumn_Header(), ecorePackage.getEString(), "header", null, 0, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaColumn_Hidden(), ecorePackage.getEBoolean(), "hidden", null, 0, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaColumn_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaColumn_Id(), ecorePackage.getEString(), "id", null, 1, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaColumn_LeftSplit(), ecorePackage.getEBoolean(), "leftSplit", null, 0, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaColumn_Sort(), ecorePackage.getEString(), "sort", null, 0, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaColumn_Widget(), theWidgetPackage.getWidget(), null, "widget", null, 1, 1, SchemaColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// mimo-ent
		createMimoentAnnotations();
	}

	/**
	 * Initializes the annotations for <b>mimo-ent</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentAnnotations() {
		String source = "mimo-ent";
		addAnnotation
		  (getSchemaColumn_ContextMenu(),
		   source,
		   new String[] {
			   "frame", "frame"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //SchemaPackageImpl
