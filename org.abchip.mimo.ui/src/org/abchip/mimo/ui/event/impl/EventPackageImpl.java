/**
 * Copyright (c) 2017, 2020 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.event.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.ui.UIPackage;

import org.abchip.mimo.ui.event.Event;
import org.abchip.mimo.ui.event.EventFactory;
import org.abchip.mimo.ui.event.EventPackage;

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

import org.abchip.mimo.ui.view.ViewPackage;
import org.abchip.mimo.ui.view.impl.ViewPackageImpl;
import org.abchip.mimo.ui.widget.WidgetPackage;

import org.abchip.mimo.ui.widget.impl.WidgetPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventPackageImpl extends EPackageImpl implements EventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;
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
	 * @see org.abchip.mimo.ui.event.EventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EventPackageImpl() {
		super(eNS_URI, EventFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EventPackage init() {
		if (isInited) return (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEventPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EventPackageImpl theEventPackage = registeredEventPackage instanceof EventPackageImpl ? (EventPackageImpl)registeredEventPackage : new EventPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UIPackage.eNS_URI);
		UIPackageImpl theUIPackage = (UIPackageImpl)(registeredPackage instanceof UIPackageImpl ? registeredPackage : UIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);
		FormPackageImpl theFormPackage = (FormPackageImpl)(registeredPackage instanceof FormPackageImpl ? registeredPackage : FormPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MenuPackage.eNS_URI);
		MenuPackageImpl theMenuPackage = (MenuPackageImpl)(registeredPackage instanceof MenuPackageImpl ? registeredPackage : MenuPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(registeredPackage instanceof QueryPackageImpl ? registeredPackage : QueryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ToolbarPackage.eNS_URI);
		ToolbarPackageImpl theToolbarPackage = (ToolbarPackageImpl)(registeredPackage instanceof ToolbarPackageImpl ? registeredPackage : ToolbarPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(registeredPackage instanceof ViewPackageImpl ? registeredPackage : ViewPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI);
		WidgetPackageImpl theWidgetPackage = (WidgetPackageImpl)(registeredPackage instanceof WidgetPackageImpl ? registeredPackage : WidgetPackage.eINSTANCE);

		// Create package meta-data objects
		theEventPackage.createPackageContents();
		theUIPackage.createPackageContents();
		theFormPackage.createPackageContents();
		theMenuPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theToolbarPackage.createPackageContents();
		theViewPackage.createPackageContents();
		theWidgetPackage.createPackageContents();

		// Initialize created meta-data
		theEventPackage.initializePackageContents();
		theUIPackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theMenuPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theToolbarPackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theWidgetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEventPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EventPackage.eNS_URI, theEventPackage);
		return theEventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventFactory getEventFactory() {
		return (EventFactory)getEFactoryInstance();
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
		eventEClass = createEClass(EVENT);
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
		eventEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //EventPackageImpl
