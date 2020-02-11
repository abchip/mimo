/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biz Entity Note Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteId <em>Note Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoItemId <em>More Info Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoItemName <em>More Info Item Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoUrl <em>More Info Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteDateTime <em>Note Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteInfo <em>Note Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteName <em>Note Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteParty <em>Note Party</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNoteData()
 * @model abstract="true"
 * @generated
 */
public interface BizEntityNoteData extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Id</em>' attribute.
	 * @see #setNoteId(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNoteData_NoteId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getNoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteId <em>Note Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Id</em>' attribute.
	 * @see #getNoteId()
	 * @generated
	 */
	void setNoteId(String value);

	/**
	 * Returns the value of the '<em><b>More Info Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>More Info Item Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>More Info Item Id</em>' attribute.
	 * @see #setMoreInfoItemId(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNoteData_MoreInfoItemId()
	 * @model
	 * @generated
	 */
	String getMoreInfoItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoItemId <em>More Info Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>More Info Item Id</em>' attribute.
	 * @see #getMoreInfoItemId()
	 * @generated
	 */
	void setMoreInfoItemId(String value);

	/**
	 * Returns the value of the '<em><b>More Info Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>More Info Item Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>More Info Item Name</em>' attribute.
	 * @see #setMoreInfoItemName(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNoteData_MoreInfoItemName()
	 * @model
	 * @generated
	 */
	String getMoreInfoItemName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoItemName <em>More Info Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>More Info Item Name</em>' attribute.
	 * @see #getMoreInfoItemName()
	 * @generated
	 */
	void setMoreInfoItemName(String value);

	/**
	 * Returns the value of the '<em><b>More Info Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>More Info Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>More Info Url</em>' attribute.
	 * @see #setMoreInfoUrl(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNoteData_MoreInfoUrl()
	 * @model
	 * @generated
	 */
	String getMoreInfoUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizEntityNoteData#getMoreInfoUrl <em>More Info Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>More Info Url</em>' attribute.
	 * @see #getMoreInfoUrl()
	 * @generated
	 */
	void setMoreInfoUrl(String value);

	/**
	 * Returns the value of the '<em><b>Note Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Date Time</em>' attribute.
	 * @see #setNoteDateTime(Date)
	 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNoteData_NoteDateTime()
	 * @model
	 * @generated
	 */
	Date getNoteDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteDateTime <em>Note Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Date Time</em>' attribute.
	 * @see #getNoteDateTime()
	 * @generated
	 */
	void setNoteDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Note Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Info</em>' attribute.
	 * @see #setNoteInfo(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNoteData_NoteInfo()
	 * @model
	 * @generated
	 */
	String getNoteInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteInfo <em>Note Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Info</em>' attribute.
	 * @see #getNoteInfo()
	 * @generated
	 */
	void setNoteInfo(String value);

	/**
	 * Returns the value of the '<em><b>Note Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Name</em>' attribute.
	 * @see #setNoteName(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNoteData_NoteName()
	 * @model
	 * @generated
	 */
	String getNoteName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteName <em>Note Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Name</em>' attribute.
	 * @see #getNoteName()
	 * @generated
	 */
	void setNoteName(String value);

	/**
	 * Returns the value of the '<em><b>Note Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Party</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Party</em>' attribute.
	 * @see #setNoteParty(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNoteData_NoteParty()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getNoteParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizEntityNoteData#getNoteParty <em>Note Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Party</em>' attribute.
	 * @see #getNoteParty()
	 * @generated
	 */
	void setNoteParty(String value);

} // BizEntityNoteData
