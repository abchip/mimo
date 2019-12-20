/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
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
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__DISABLED = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__DOMAIN = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__GROUP = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__ICON = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__LABEL = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__LENGTH = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__PRECISION = EntityPackage.ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__SCALE = EntityPackage.ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Top Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__TOP_SPLIT = EntityPackage.ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD__VIEW = EntityPackage.ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FIELD_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 12;


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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getView()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_View();

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#isDisabled()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getLabel()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getLength()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getName()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getPrecision()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getScale()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.form.FormField#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getDomain()
	 * @see #getFormField()
	 * @generated
	 */
	EReference getFormField_Domain();

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.form.FormField#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.form.FormField#getIcon()
	 * @see #getFormField()
	 * @generated
	 */
	EAttribute getFormField_Icon();

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
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__VIEW = eINSTANCE.getFormField_View();

		/**
		 * The meta object literal for the '<em><b>Top Split</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__TOP_SPLIT = eINSTANCE.getFormField_TopSplit();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__DISABLED = eINSTANCE.getFormField_Disabled();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__LABEL = eINSTANCE.getFormField_Label();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__LENGTH = eINSTANCE.getFormField_Length();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__NAME = eINSTANCE.getFormField_Name();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__PRECISION = eINSTANCE.getFormField_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__SCALE = eINSTANCE.getFormField_Scale();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_FIELD__DOMAIN = eINSTANCE.getFormField_Domain();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__GROUP = eINSTANCE.getFormField_Group();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FIELD__ICON = eINSTANCE.getFormField_Icon();

	}

} //FormPackage
