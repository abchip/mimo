/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.note;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.abchip.mimo.biz.common.note.NoteFactory
 * @model kind="package"
 * @generated
 */
public interface NotePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "note";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/note";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-note";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotePackage eINSTANCE = org.abchip.mimo.biz.common.note.impl.NotePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.note.impl.NoteDataImpl
	 * @see org.abchip.mimo.biz.common.note.impl.NotePackageImpl#getNoteData()
	 * @generated
	 */
	int NOTE_DATA = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__NOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>More Info Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__MORE_INFO_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>More Info Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__MORE_INFO_ITEM_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>More Info Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__MORE_INFO_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Note Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__NOTE_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Note Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__NOTE_INFO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Note Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__NOTE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Note Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA__NOTE_PARTY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;


	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The operation id for the '<em>Cust Request Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___CUST_REQUEST_NOTES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Invoice Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___INVOICE_NOTES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Marketing Campaign Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___MARKETING_CAMPAIGN_NOTES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Order Header Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___ORDER_HEADER_NOTES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Party Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___PARTY_NOTES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Quote Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___QUOTE_NOTES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Work Effort Notes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___WORK_EFFORT_NOTES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Work Efforts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA___WORK_EFFORTS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_DATA_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.note.NoteData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.abchip.mimo.biz.common.note.NoteData
	 * @generated
	 */
	EClass getNoteData();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.note.NoteData#getNoteId <em>Note Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Id</em>'.
	 * @see org.abchip.mimo.biz.common.note.NoteData#getNoteId()
	 * @see #getNoteData()
	 * @generated
	 */
	EAttribute getNoteData_NoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.note.NoteData#getMoreInfoItemId <em>More Info Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>More Info Item Id</em>'.
	 * @see org.abchip.mimo.biz.common.note.NoteData#getMoreInfoItemId()
	 * @see #getNoteData()
	 * @generated
	 */
	EAttribute getNoteData_MoreInfoItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.note.NoteData#getMoreInfoItemName <em>More Info Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>More Info Item Name</em>'.
	 * @see org.abchip.mimo.biz.common.note.NoteData#getMoreInfoItemName()
	 * @see #getNoteData()
	 * @generated
	 */
	EAttribute getNoteData_MoreInfoItemName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.note.NoteData#getMoreInfoUrl <em>More Info Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>More Info Url</em>'.
	 * @see org.abchip.mimo.biz.common.note.NoteData#getMoreInfoUrl()
	 * @see #getNoteData()
	 * @generated
	 */
	EAttribute getNoteData_MoreInfoUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.note.NoteData#getNoteDateTime <em>Note Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Date Time</em>'.
	 * @see org.abchip.mimo.biz.common.note.NoteData#getNoteDateTime()
	 * @see #getNoteData()
	 * @generated
	 */
	EAttribute getNoteData_NoteDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.note.NoteData#getNoteInfo <em>Note Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Info</em>'.
	 * @see org.abchip.mimo.biz.common.note.NoteData#getNoteInfo()
	 * @see #getNoteData()
	 * @generated
	 */
	EAttribute getNoteData_NoteInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.note.NoteData#getNoteName <em>Note Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Name</em>'.
	 * @see org.abchip.mimo.biz.common.note.NoteData#getNoteName()
	 * @see #getNoteData()
	 * @generated
	 */
	EAttribute getNoteData_NoteName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.note.NoteData#getNoteParty <em>Note Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Note Party</em>'.
	 * @see org.abchip.mimo.biz.common.note.NoteData#getNoteParty()
	 * @see #getNoteData()
	 * @generated
	 */
	EReference getNoteData_NoteParty();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.note.NoteData#custRequestNotes() <em>Cust Request Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cust Request Notes</em>' operation.
	 * @see org.abchip.mimo.biz.common.note.NoteData#custRequestNotes()
	 * @generated
	 */
	EOperation getNoteData__CustRequestNotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.note.NoteData#invoiceNotes() <em>Invoice Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoice Notes</em>' operation.
	 * @see org.abchip.mimo.biz.common.note.NoteData#invoiceNotes()
	 * @generated
	 */
	EOperation getNoteData__InvoiceNotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.note.NoteData#marketingCampaignNotes() <em>Marketing Campaign Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Marketing Campaign Notes</em>' operation.
	 * @see org.abchip.mimo.biz.common.note.NoteData#marketingCampaignNotes()
	 * @generated
	 */
	EOperation getNoteData__MarketingCampaignNotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.note.NoteData#orderHeaderNotes() <em>Order Header Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Header Notes</em>' operation.
	 * @see org.abchip.mimo.biz.common.note.NoteData#orderHeaderNotes()
	 * @generated
	 */
	EOperation getNoteData__OrderHeaderNotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.note.NoteData#partyNotes() <em>Party Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Notes</em>' operation.
	 * @see org.abchip.mimo.biz.common.note.NoteData#partyNotes()
	 * @generated
	 */
	EOperation getNoteData__PartyNotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.note.NoteData#quoteNotes() <em>Quote Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quote Notes</em>' operation.
	 * @see org.abchip.mimo.biz.common.note.NoteData#quoteNotes()
	 * @generated
	 */
	EOperation getNoteData__QuoteNotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.note.NoteData#workEffortNotes() <em>Work Effort Notes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Work Effort Notes</em>' operation.
	 * @see org.abchip.mimo.biz.common.note.NoteData#workEffortNotes()
	 * @generated
	 */
	EOperation getNoteData__WorkEffortNotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.note.NoteData#workEfforts() <em>Work Efforts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Work Efforts</em>' operation.
	 * @see org.abchip.mimo.biz.common.note.NoteData#workEfforts()
	 * @generated
	 */
	EOperation getNoteData__WorkEfforts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NoteFactory getNoteFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.note.impl.NoteDataImpl
		 * @see org.abchip.mimo.biz.common.note.impl.NotePackageImpl#getNoteData()
		 * @generated
		 */
		EClass NOTE_DATA = eINSTANCE.getNoteData();

		/**
		 * The meta object literal for the '<em><b>Note Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_DATA__NOTE_ID = eINSTANCE.getNoteData_NoteId();

		/**
		 * The meta object literal for the '<em><b>More Info Item Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_DATA__MORE_INFO_ITEM_ID = eINSTANCE.getNoteData_MoreInfoItemId();

		/**
		 * The meta object literal for the '<em><b>More Info Item Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_DATA__MORE_INFO_ITEM_NAME = eINSTANCE.getNoteData_MoreInfoItemName();

		/**
		 * The meta object literal for the '<em><b>More Info Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_DATA__MORE_INFO_URL = eINSTANCE.getNoteData_MoreInfoUrl();

		/**
		 * The meta object literal for the '<em><b>Note Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_DATA__NOTE_DATE_TIME = eINSTANCE.getNoteData_NoteDateTime();

		/**
		 * The meta object literal for the '<em><b>Note Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_DATA__NOTE_INFO = eINSTANCE.getNoteData_NoteInfo();

		/**
		 * The meta object literal for the '<em><b>Note Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_DATA__NOTE_NAME = eINSTANCE.getNoteData_NoteName();

		/**
		 * The meta object literal for the '<em><b>Note Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE_DATA__NOTE_PARTY = eINSTANCE.getNoteData_NoteParty();

		/**
		 * The meta object literal for the '<em><b>Cust Request Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_DATA___CUST_REQUEST_NOTES = eINSTANCE.getNoteData__CustRequestNotes();

		/**
		 * The meta object literal for the '<em><b>Invoice Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_DATA___INVOICE_NOTES = eINSTANCE.getNoteData__InvoiceNotes();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_DATA___MARKETING_CAMPAIGN_NOTES = eINSTANCE.getNoteData__MarketingCampaignNotes();

		/**
		 * The meta object literal for the '<em><b>Order Header Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_DATA___ORDER_HEADER_NOTES = eINSTANCE.getNoteData__OrderHeaderNotes();

		/**
		 * The meta object literal for the '<em><b>Party Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_DATA___PARTY_NOTES = eINSTANCE.getNoteData__PartyNotes();

		/**
		 * The meta object literal for the '<em><b>Quote Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_DATA___QUOTE_NOTES = eINSTANCE.getNoteData__QuoteNotes();

		/**
		 * The meta object literal for the '<em><b>Work Effort Notes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_DATA___WORK_EFFORT_NOTES = eINSTANCE.getNoteData__WorkEffortNotes();

		/**
		 * The meta object literal for the '<em><b>Work Efforts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTE_DATA___WORK_EFFORTS = eINSTANCE.getNoteData__WorkEfforts();

	}

} //NotePackage
