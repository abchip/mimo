/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.widget;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Widget Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.ui.widget.WidgetPackage#getWidgetType()
 * @model
 * @generated
 */
public enum WidgetType implements Enumerator {
	/**
	 * The '<em><b>Browser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROWSER_VALUE
	 * @generated
	 * @ordered
	 */
	BROWSER(0, "Browser", "mm-browser"), /**
	 * The '<em><b>Check Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK_BOX(0, "CheckBox", "mm-checkbox"), /**
	 * The '<em><b>Combo Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBO_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	COMBO_BOX(0, "ComboBox", "mm-combo"), /**
	 * The '<em><b>Counter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTER(0, "Counter", "mm-counter"), /**
	 * The '<em><b>Dashboard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASHBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	DASHBOARD(0, "Dashboard", "mm-dashboard"), /**
	 * The '<em><b>Date Picker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_PICKER_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_PICKER(0, "DatePicker", "mm-datepicker"), /**
	 * The '<em><b>Form</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORM_VALUE
	 * @generated
	 * @ordered
	 */
	FORM(0, "Form", "mm-form"), /**
	 * The '<em><b>Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(0, "Image", "mm-image"), /**
	 * The '<em><b>Layout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAYOUT_VALUE
	 * @generated
	 * @ordered
	 */
	LAYOUT(0, "Layout", "mm-layout"), /**
	 * The '<em><b>Menu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENU_VALUE
	 * @generated
	 * @ordered
	 */
	MENU(0, "Menu", "mm-menu"), /**
	 * The '<em><b>Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(0, "Number", "mm-number"), /**
	 * The '<em><b>Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY(0, "Property", "mm-property"), /**
	 * The '<em><b>Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY(0, "Query", "mm-query"), /**
	 * The '<em><b>Review</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEW(0, "Review", "mm-review"), /**
	 * The '<em><b>Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCH(0, "Switch", "mm-switch"), /**
	 * The '<em><b>Tab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAB_VALUE
	 * @generated
	 * @ordered
	 */
	TAB(0, "Tab", "mm-tab"), /**
	 * The '<em><b>Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE(0, "Table", "mm-table"), /**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(0, "Text", "mm-text"), /**
	 * The '<em><b>Text Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_AREA_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_AREA(0, "TextArea", "mm-textarea"), /**
	 * The '<em><b>Toolbar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOLBAR_VALUE
	 * @generated
	 * @ordered
	 */
	TOOLBAR(0, "Toolbar", "mm-toolbar"), /**
	 * The '<em><b>Uploader</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOADER_VALUE
	 * @generated
	 * @ordered
	 */
	UPLOADER(0, "Uploader", "mm-uploader"), /**
	 * The '<em><b>View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	VIEW(0, "View", "mm-view");

	/**
	 * The '<em><b>Browser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Browser</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BROWSER
	 * @model name="Browser" literal="mm-browser"
	 * @generated
	 * @ordered
	 */
	public static final int BROWSER_VALUE = 0;

	/**
	 * The '<em><b>Check Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Check Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECK_BOX
	 * @model name="CheckBox" literal="mm-checkbox"
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_BOX_VALUE = 0;

	/**
	 * The '<em><b>Combo Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Combo Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBO_BOX
	 * @model name="ComboBox" literal="mm-combo"
	 * @generated
	 * @ordered
	 */
	public static final int COMBO_BOX_VALUE = 0;

	/**
	 * The '<em><b>Counter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Counter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNTER
	 * @model name="Counter" literal="mm-counter"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTER_VALUE = 0;

	/**
	 * The '<em><b>Dashboard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dashboard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DASHBOARD
	 * @model name="Dashboard" literal="mm-dashboard"
	 * @generated
	 * @ordered
	 */
	public static final int DASHBOARD_VALUE = 0;

	/**
	 * The '<em><b>Date Picker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Picker</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_PICKER
	 * @model name="DatePicker" literal="mm-datepicker"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_PICKER_VALUE = 0;

	/**
	 * The '<em><b>Form</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Form</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORM
	 * @model name="Form" literal="mm-form"
	 * @generated
	 * @ordered
	 */
	public static final int FORM_VALUE = 0;

	/**
	 * The '<em><b>Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE
	 * @model name="Image" literal="mm-image"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 0;

	/**
	 * The '<em><b>Layout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Layout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAYOUT
	 * @model name="Layout" literal="mm-layout"
	 * @generated
	 * @ordered
	 */
	public static final int LAYOUT_VALUE = 0;

	/**
	 * The '<em><b>Menu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Menu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENU
	 * @model name="Menu" literal="mm-menu"
	 * @generated
	 * @ordered
	 */
	public static final int MENU_VALUE = 0;

	/**
	 * The '<em><b>Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model name="Number" literal="mm-number"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 0;

	/**
	 * The '<em><b>Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPERTY
	 * @model name="Property" literal="mm-property"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE = 0;

	/**
	 * The '<em><b>Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Query</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUERY
	 * @model name="Query" literal="mm-query"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_VALUE = 0;

	/**
	 * The '<em><b>Review</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Review</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVIEW
	 * @model name="Review" literal="mm-review"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEW_VALUE = 0;

	/**
	 * The '<em><b>Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWITCH
	 * @model name="Switch" literal="mm-switch"
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_VALUE = 0;

	/**
	 * The '<em><b>Tab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tab</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAB
	 * @model name="Tab" literal="mm-tab"
	 * @generated
	 * @ordered
	 */
	public static final int TAB_VALUE = 0;

	/**
	 * The '<em><b>Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE
	 * @model name="Table" literal="mm-table"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VALUE = 0;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="Text" literal="mm-text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 0;

	/**
	 * The '<em><b>Text Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text Area</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT_AREA
	 * @model name="TextArea" literal="mm-textarea"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_AREA_VALUE = 0;

	/**
	 * The '<em><b>Toolbar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Toolbar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOOLBAR
	 * @model name="Toolbar" literal="mm-toolbar"
	 * @generated
	 * @ordered
	 */
	public static final int TOOLBAR_VALUE = 0;

	/**
	 * The '<em><b>Uploader</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uploader</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPLOADER
	 * @model name="Uploader" literal="mm-uploader"
	 * @generated
	 * @ordered
	 */
	public static final int UPLOADER_VALUE = 0;

	/**
	 * The '<em><b>View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>View</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIEW
	 * @model name="View" literal="mm-view"
	 * @generated
	 * @ordered
	 */
	public static final int VIEW_VALUE = 0;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WidgetType[] VALUES_ARRAY =
		new WidgetType[] {
			BROWSER,
			CHECK_BOX,
			COMBO_BOX,
			COUNTER,
			DASHBOARD,
			DATE_PICKER,
			FORM,
			IMAGE,
			LAYOUT,
			MENU,
			NUMBER,
			PROPERTY,
			QUERY,
			REVIEW,
			SWITCH,
			TAB,
			TABLE,
			TEXT,
			TEXT_AREA,
			TOOLBAR,
			UPLOADER,
			VIEW,
		};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WidgetType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WidgetType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WidgetType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WidgetType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WidgetType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WidgetType get(int value) {
		switch (value) {
			case BROWSER_VALUE: return BROWSER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WidgetType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //WidgetType
