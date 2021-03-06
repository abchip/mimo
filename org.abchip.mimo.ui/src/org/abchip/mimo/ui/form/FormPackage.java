/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.form;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.ui.form.FormFactory
 * @model kind="package"
 * @generated
 */
public interface FormPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "form";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/ui/form";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui-form";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormPackage eINSTANCE = org.abchip.mimo.ui.form.impl.FormPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.form.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.form.impl.FormImpl
	 * @see org.abchip.mimo.ui.form.impl.FormPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FIELDS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.form.impl.FormFieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.form.impl.FormFieldImpl
	 * @see org.abchip.mimo.ui.form.impl.FormPackageImpl#getFormField()
	 * @generated
	 */
	int FORM_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Context Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__CONTEXT_MENU = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__GROUP = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__KEY = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Top Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__TOP_SPLIT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__WIDGET = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.form.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see org.abchip.mimo.ui.form.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.ui.form.Form#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.abchip.mimo.ui.form.Form#getFields()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Fields();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.Form#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.form.Form#getName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.form.FormField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.abchip.mimo.ui.form.FormField
	 * @generated
	 */
	EClass getFormField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#isContextMenu <em>Context Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Menu</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#isContextMenu()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_ContextMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getGroup()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Group();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#isKey()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#isTopSplit <em>Top Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Split</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#isTopSplit()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_TopSplit();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.form.FormField#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widget</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getWidget()
	 * @see #getFormField()
	 * @generated
	 */
	EReference getFormField_Widget();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormFactory getFormFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.form.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.form.impl.FormImpl
		 * @see org.abchip.mimo.ui.form.impl.FormPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__FIELDS = eINSTANCE.getForm_Fields();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NAME = eINSTANCE.getForm_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.form.impl.FormFieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.form.impl.FormFieldImpl
		 * @see org.abchip.mimo.ui.form.impl.FormPackageImpl#getFormField()
		 * @generated
		 */
		EClass FORM_FIELD = eINSTANCE.getFormField();

		/**
		 * The meta object literal for the '<em><b>Context Menu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__CONTEXT_MENU = eINSTANCE.getFormField_ContextMenu();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__GROUP = eINSTANCE.getFormField_Group();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__KEY = eINSTANCE.getFormField_Key();

		/**
		 * The meta object literal for the '<em><b>Top Split</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__TOP_SPLIT = eINSTANCE.getFormField_TopSplit();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_FIELD__WIDGET = eINSTANCE.getFormField_Widget();

	}

} //FormPackage
