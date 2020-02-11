/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.group;

import org.abchip.mimo.biz.BizPackage;
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
 * @see org.abchip.mimo.biz.entity.group.GroupFactory
 * @model kind="package"
 * @generated
 */
public interface GroupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "group";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/entity/group";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-group";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupPackage eINSTANCE = org.abchip.mimo.biz.entity.group.impl.GroupPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl <em>Entity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl
	 * @see org.abchip.mimo.biz.entity.group.impl.GroupPackageImpl#getEntityGroup()
	 * @generated
	 */
	int ENTITY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Entity Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP__ENTITY_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Group Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP__ENTITY_GROUP_ENTRIES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP__ENTITY_GROUP_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupEntryImpl <em>Entity Group Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.group.impl.EntityGroupEntryImpl
	 * @see org.abchip.mimo.biz.entity.group.impl.GroupPackageImpl#getEntityGroupEntry()
	 * @generated
	 */
	int ENTITY_GROUP_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP_ENTRY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP_ENTRY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP_ENTRY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP_ENTRY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Entity Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP_ENTRY__ENTITY_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Or Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP_ENTRY__ENTITY_OR_PACKAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appl Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP_ENTRY__APPL_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Group Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_GROUP_ENTRY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.group.EntityGroup <em>Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Group</em>'.
	 * @see org.abchip.mimo.biz.entity.group.EntityGroup
	 * @generated
	 */
	EClass getEntityGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupId <em>Entity Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Group Id</em>'.
	 * @see org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupId()
	 * @see #getEntityGroup()
	 * @generated
	 */
	EAttribute getEntityGroup_EntityGroupId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupEntries <em>Entity Group Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity Group Entries</em>'.
	 * @see org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupEntries()
	 * @see #getEntityGroup()
	 * @generated
	 */
	EReference getEntityGroup_EntityGroupEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupName <em>Entity Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Group Name</em>'.
	 * @see org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupName()
	 * @see #getEntityGroup()
	 * @generated
	 */
	EAttribute getEntityGroup_EntityGroupName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.group.EntityGroupEntry <em>Entity Group Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Group Entry</em>'.
	 * @see org.abchip.mimo.biz.entity.group.EntityGroupEntry
	 * @generated
	 */
	EClass getEntityGroupEntry();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.group.EntityGroupEntry#getEntityGroupId <em>Entity Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Group Id</em>'.
	 * @see org.abchip.mimo.biz.entity.group.EntityGroupEntry#getEntityGroupId()
	 * @see #getEntityGroupEntry()
	 * @generated
	 */
	EReference getEntityGroupEntry_EntityGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.group.EntityGroupEntry#getEntityOrPackage <em>Entity Or Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Or Package</em>'.
	 * @see org.abchip.mimo.biz.entity.group.EntityGroupEntry#getEntityOrPackage()
	 * @see #getEntityGroupEntry()
	 * @generated
	 */
	EAttribute getEntityGroupEntry_EntityOrPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.group.EntityGroupEntry#getApplEnumId <em>Appl Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appl Enum Id</em>'.
	 * @see org.abchip.mimo.biz.entity.group.EntityGroupEntry#getApplEnumId()
	 * @see #getEntityGroupEntry()
	 * @generated
	 */
	EAttribute getEntityGroupEntry_ApplEnumId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroupFactory getGroupFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl <em>Entity Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl
		 * @see org.abchip.mimo.biz.entity.group.impl.GroupPackageImpl#getEntityGroup()
		 * @generated
		 */
		EClass ENTITY_GROUP = eINSTANCE.getEntityGroup();

		/**
		 * The meta object literal for the '<em><b>Entity Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_GROUP__ENTITY_GROUP_ID = eINSTANCE.getEntityGroup_EntityGroupId();

		/**
		 * The meta object literal for the '<em><b>Entity Group Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_GROUP__ENTITY_GROUP_ENTRIES = eINSTANCE.getEntityGroup_EntityGroupEntries();

		/**
		 * The meta object literal for the '<em><b>Entity Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_GROUP__ENTITY_GROUP_NAME = eINSTANCE.getEntityGroup_EntityGroupName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupEntryImpl <em>Entity Group Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.group.impl.EntityGroupEntryImpl
		 * @see org.abchip.mimo.biz.entity.group.impl.GroupPackageImpl#getEntityGroupEntry()
		 * @generated
		 */
		EClass ENTITY_GROUP_ENTRY = eINSTANCE.getEntityGroupEntry();

		/**
		 * The meta object literal for the '<em><b>Entity Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_GROUP_ENTRY__ENTITY_GROUP_ID = eINSTANCE.getEntityGroupEntry_EntityGroupId();

		/**
		 * The meta object literal for the '<em><b>Entity Or Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_GROUP_ENTRY__ENTITY_OR_PACKAGE = eINSTANCE.getEntityGroupEntry_EntityOrPackage();

		/**
		 * The meta object literal for the '<em><b>Appl Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_GROUP_ENTRY__APPL_ENUM_ID = eINSTANCE.getEntityGroupEntry_ApplEnumId();

	}

} //GroupPackage
