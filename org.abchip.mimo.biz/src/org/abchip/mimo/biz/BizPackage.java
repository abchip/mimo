/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.abchip.mimo.biz.BizFactory
 * @model kind="package"
 * @generated
 */
public interface BizPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "biz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BizPackage eINSTANCE = org.abchip.mimo.biz.impl.BizPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.impl.BizEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.impl.BizEntityImpl
	 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntity()
	 * @generated
	 */
	int BIZ_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.impl.BizEntityNoteImpl <em>Entity Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.impl.BizEntityNoteImpl
	 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntityNote()
	 * @generated
	 */
	int BIZ_ENTITY_NOTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE__CREATED_STAMP = BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE__CREATED_TX_STAMP = BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP = BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP = BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE__NOTE_ID = BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_FEATURE_COUNT = BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.impl.BizEntityTypedImpl <em>Entity Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.impl.BizEntityTypedImpl
	 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntityTyped()
	 * @generated
	 */
	int BIZ_ENTITY_TYPED = 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.impl.BizEntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.impl.BizEntityTypeImpl
	 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntityType()
	 * @generated
	 */
	int BIZ_ENTITY_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl <em>Entity Note Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.impl.BizEntityNoteDataImpl
	 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntityNoteData()
	 * @generated
	 */
	int BIZ_ENTITY_NOTE_DATA = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__CREATED_STAMP = BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__CREATED_TX_STAMP = BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__LAST_UPDATED_STAMP = BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__LAST_UPDATED_TX_STAMP = BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__NOTE_ID = BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>More Info Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_ID = BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>More Info Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_NAME = BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>More Info Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__MORE_INFO_URL = BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Note Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__NOTE_DATE_TIME = BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Note Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__NOTE_INFO = BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Note Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__NOTE_NAME = BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Note Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA__NOTE_PARTY = BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Entity Note Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_NOTE_DATA_FEATURE_COUNT = BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPED__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPED__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entity Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPED_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIZ_ENTITY_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.BizEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.abchip.mimo.biz.BizEntity
	 * @generated
	 */
	EClass getBizEntity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.BizEntityNote <em>Entity Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Note</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNote
	 * @generated
	 */
	EClass getBizEntityNote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.BizEntityNote#getNoteId <em>Note Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Id</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNote#getNoteId()
	 * @see #getBizEntityNote()
	 * @generated
	 */
	EAttribute getBizEntityNote_NoteId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.BizEntityTyped <em>Entity Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Typed</em>'.
	 * @see org.abchip.mimo.biz.BizEntityTyped
	 * @generated
	 */
	EClass getBizEntityTyped();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.BizEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see org.abchip.mimo.biz.BizEntityType
	 * @generated
	 */
	EClass getBizEntityType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.BizEntityNoteData <em>Entity Note Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Note Data</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNoteData
	 * @generated
	 */
	EClass getBizEntityNoteData();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteId <em>Note Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Id</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNoteData#getNoteId()
	 * @see #getBizEntityNoteData()
	 * @generated
	 */
	EAttribute getBizEntityNoteData_NoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoItemId <em>More Info Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>More Info Item Id</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoItemId()
	 * @see #getBizEntityNoteData()
	 * @generated
	 */
	EAttribute getBizEntityNoteData_MoreInfoItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoItemName <em>More Info Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>More Info Item Name</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoItemName()
	 * @see #getBizEntityNoteData()
	 * @generated
	 */
	EAttribute getBizEntityNoteData_MoreInfoItemName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoUrl <em>More Info Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>More Info Url</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoUrl()
	 * @see #getBizEntityNoteData()
	 * @generated
	 */
	EAttribute getBizEntityNoteData_MoreInfoUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteDateTime <em>Note Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Date Time</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNoteData#getNoteDateTime()
	 * @see #getBizEntityNoteData()
	 * @generated
	 */
	EAttribute getBizEntityNoteData_NoteDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteInfo <em>Note Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Info</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNoteData#getNoteInfo()
	 * @see #getBizEntityNoteData()
	 * @generated
	 */
	EAttribute getBizEntityNoteData_NoteInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteName <em>Note Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Name</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNoteData#getNoteName()
	 * @see #getBizEntityNoteData()
	 * @generated
	 */
	EAttribute getBizEntityNoteData_NoteName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteParty <em>Note Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Party</em>'.
	 * @see org.abchip.mimo.biz.BizEntityNoteData#getNoteParty()
	 * @see #getBizEntityNoteData()
	 * @generated
	 */
	EAttribute getBizEntityNoteData_NoteParty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BizFactory getBizFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.impl.BizEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.impl.BizEntityImpl
		 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntity()
		 * @generated
		 */
		EClass BIZ_ENTITY = eINSTANCE.getBizEntity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.impl.BizEntityNoteImpl <em>Entity Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.impl.BizEntityNoteImpl
		 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntityNote()
		 * @generated
		 */
		EClass BIZ_ENTITY_NOTE = eINSTANCE.getBizEntityNote();

		/**
		 * The meta object literal for the '<em><b>Note Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_ENTITY_NOTE__NOTE_ID = eINSTANCE.getBizEntityNote_NoteId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.impl.BizEntityTypedImpl <em>Entity Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.impl.BizEntityTypedImpl
		 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntityTyped()
		 * @generated
		 */
		EClass BIZ_ENTITY_TYPED = eINSTANCE.getBizEntityTyped();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.impl.BizEntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.impl.BizEntityTypeImpl
		 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntityType()
		 * @generated
		 */
		EClass BIZ_ENTITY_TYPE = eINSTANCE.getBizEntityType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl <em>Entity Note Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.impl.BizEntityNoteDataImpl
		 * @see org.abchip.mimo.biz.impl.BizPackageImpl#getBizEntityNoteData()
		 * @generated
		 */
		EClass BIZ_ENTITY_NOTE_DATA = eINSTANCE.getBizEntityNoteData();

		/**
		 * The meta object literal for the '<em><b>Note Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_ENTITY_NOTE_DATA__NOTE_ID = eINSTANCE.getBizEntityNoteData_NoteId();

		/**
		 * The meta object literal for the '<em><b>More Info Item Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_ID = eINSTANCE.getBizEntityNoteData_MoreInfoItemId();

		/**
		 * The meta object literal for the '<em><b>More Info Item Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_NAME = eINSTANCE.getBizEntityNoteData_MoreInfoItemName();

		/**
		 * The meta object literal for the '<em><b>More Info Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_ENTITY_NOTE_DATA__MORE_INFO_URL = eINSTANCE.getBizEntityNoteData_MoreInfoUrl();

		/**
		 * The meta object literal for the '<em><b>Note Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_ENTITY_NOTE_DATA__NOTE_DATE_TIME = eINSTANCE.getBizEntityNoteData_NoteDateTime();

		/**
		 * The meta object literal for the '<em><b>Note Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_ENTITY_NOTE_DATA__NOTE_INFO = eINSTANCE.getBizEntityNoteData_NoteInfo();

		/**
		 * The meta object literal for the '<em><b>Note Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_ENTITY_NOTE_DATA__NOTE_NAME = eINSTANCE.getBizEntityNoteData_NoteName();

		/**
		 * The meta object literal for the '<em><b>Note Party</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIZ_ENTITY_NOTE_DATA__NOTE_PARTY = eINSTANCE.getBizEntityNoteData_NoteParty();

	}

} //BizPackage
