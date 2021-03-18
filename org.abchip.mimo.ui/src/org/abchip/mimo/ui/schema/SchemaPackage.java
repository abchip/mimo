/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.schema;

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
 * @see org.abchip.mimo.ui.schema.SchemaFactory
 * @model kind="package"
 * @generated
 */
public interface SchemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/ui/schema";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui-schema";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaPackage eINSTANCE = org.abchip.mimo.ui.schema.impl.SchemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.schema.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.schema.impl.SchemaImpl
	 * @see org.abchip.mimo.ui.schema.impl.SchemaPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__COLUMNS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.schema.impl.SchemaColumnImpl
	 * @see org.abchip.mimo.ui.schema.impl.SchemaPackageImpl#getSchemaColumn()
	 * @generated
	 */
	int SCHEMA_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__ADJUST = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__CONTEXT_MENU = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__DOMAIN = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__GROUP = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__HEADER = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__HIDDEN = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__ICON = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__ID = EntityPackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Left Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__LEFT_SPLIT = EntityPackage.ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__SORT = EntityPackage.ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN__WIDGET = EntityPackage.ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_COLUMN_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 11;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.schema.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see org.abchip.mimo.ui.schema.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.ui.schema.Schema#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.abchip.mimo.ui.schema.Schema#getColumns()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.schema.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.schema.SchemaColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn
	 * @generated
	 */
	EClass getSchemaColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.SchemaColumn#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#getId()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EAttribute getSchemaColumn_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.SchemaColumn#isLeftSplit <em>Left Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Split</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#isLeftSplit()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EAttribute getSchemaColumn_LeftSplit();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.SchemaColumn#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#getSort()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EAttribute getSchemaColumn_Sort();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.schema.SchemaColumn#getWidget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Widget</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#getWidget()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EReference getSchemaColumn_Widget();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.schema.SchemaColumn#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#getDomain()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EReference getSchemaColumn_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.SchemaColumn#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#getGroup()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EAttribute getSchemaColumn_Group();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.SchemaColumn#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#getHeader()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EAttribute getSchemaColumn_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.SchemaColumn#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#isHidden()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EAttribute getSchemaColumn_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.SchemaColumn#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#getIcon()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EAttribute getSchemaColumn_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.SchemaColumn#isAdjust <em>Adjust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjust</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#isAdjust()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EAttribute getSchemaColumn_Adjust();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.schema.SchemaColumn#isContextMenu <em>Context Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Menu</em>'.
	 * @see org.abchip.mimo.ui.schema.SchemaColumn#isContextMenu()
	 * @see #getSchemaColumn()
	 * @generated
	 */
	EAttribute getSchemaColumn_ContextMenu();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchemaFactory getSchemaFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.schema.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.schema.impl.SchemaImpl
		 * @see org.abchip.mimo.ui.schema.impl.SchemaPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__COLUMNS = eINSTANCE.getSchema_Columns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.schema.impl.SchemaColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.schema.impl.SchemaColumnImpl
		 * @see org.abchip.mimo.ui.schema.impl.SchemaPackageImpl#getSchemaColumn()
		 * @generated
		 */
		EClass SCHEMA_COLUMN = eINSTANCE.getSchemaColumn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_COLUMN__ID = eINSTANCE.getSchemaColumn_Id();

		/**
		 * The meta object literal for the '<em><b>Left Split</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_COLUMN__LEFT_SPLIT = eINSTANCE.getSchemaColumn_LeftSplit();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_COLUMN__SORT = eINSTANCE.getSchemaColumn_Sort();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_COLUMN__WIDGET = eINSTANCE.getSchemaColumn_Widget();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_COLUMN__DOMAIN = eINSTANCE.getSchemaColumn_Domain();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_COLUMN__GROUP = eINSTANCE.getSchemaColumn_Group();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_COLUMN__HEADER = eINSTANCE.getSchemaColumn_Header();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_COLUMN__HIDDEN = eINSTANCE.getSchemaColumn_Hidden();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_COLUMN__ICON = eINSTANCE.getSchemaColumn_Icon();

		/**
		 * The meta object literal for the '<em><b>Adjust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_COLUMN__ADJUST = eINSTANCE.getSchemaColumn_Adjust();

		/**
		 * The meta object literal for the '<em><b>Context Menu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_COLUMN__CONTEXT_MENU = eINSTANCE.getSchemaColumn_ContextMenu();

	}

} //SchemaPackage
