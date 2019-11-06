/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.note.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.common.note.NoteData;
import org.abchip.mimo.biz.common.note.NotePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl#getNoteId <em>Note Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl#getMoreInfoItemId <em>More Info Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl#getMoreInfoItemName <em>More Info Item Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl#getMoreInfoUrl <em>More Info Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl#getNoteDateTime <em>Note Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl#getNoteInfo <em>Note Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl#getNoteName <em>Note Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.note.impl.NoteDataImpl#getNoteParty <em>Note Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteDataImpl extends BizEntityImpl implements NoteData {
	/**
	 * The default value of the '{@link #getNoteId() <em>Note Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteId()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNoteId() <em>Note Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteId()
	 * @generated
	 * @ordered
	 */
	protected String noteId = NOTE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getMoreInfoItemId() <em>More Info Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoreInfoItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String MORE_INFO_ITEM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMoreInfoItemId() <em>More Info Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoreInfoItemId()
	 * @generated
	 * @ordered
	 */
	protected String moreInfoItemId = MORE_INFO_ITEM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getMoreInfoItemName() <em>More Info Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoreInfoItemName()
	 * @generated
	 * @ordered
	 */
	protected static final String MORE_INFO_ITEM_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMoreInfoItemName() <em>More Info Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoreInfoItemName()
	 * @generated
	 * @ordered
	 */
	protected String moreInfoItemName = MORE_INFO_ITEM_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getMoreInfoUrl() <em>More Info Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoreInfoUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String MORE_INFO_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMoreInfoUrl() <em>More Info Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoreInfoUrl()
	 * @generated
	 * @ordered
	 */
	protected String moreInfoUrl = MORE_INFO_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getNoteDateTime() <em>Note Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date NOTE_DATE_TIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNoteDateTime() <em>Note Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date noteDateTime = NOTE_DATE_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getNoteInfo() <em>Note Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_INFO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNoteInfo() <em>Note Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteInfo()
	 * @generated
	 * @ordered
	 */
	protected String noteInfo = NOTE_INFO_EDEFAULT;
	/**
	 * The default value of the '{@link #getNoteName() <em>Note Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteName()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNoteName() <em>Note Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteName()
	 * @generated
	 * @ordered
	 */
	protected String noteName = NOTE_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getNoteParty() <em>Note Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteParty()
	 * @generated
	 * @ordered
	 */
	protected Party noteParty;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotePackage.Literals.NOTE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteId() {
		return noteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteId(String newNoteId) {
		noteId = newNoteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMoreInfoItemId() {
		return moreInfoItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoreInfoItemId(String newMoreInfoItemId) {
		moreInfoItemId = newMoreInfoItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMoreInfoItemName() {
		return moreInfoItemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoreInfoItemName(String newMoreInfoItemName) {
		moreInfoItemName = newMoreInfoItemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMoreInfoUrl() {
		return moreInfoUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoreInfoUrl(String newMoreInfoUrl) {
		moreInfoUrl = newMoreInfoUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getNoteDateTime() {
		return noteDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteDateTime(Date newNoteDateTime) {
		noteDateTime = newNoteDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteInfo() {
		return noteInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteInfo(String newNoteInfo) {
		noteInfo = newNoteInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteName() {
		return noteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteName(String newNoteName) {
		noteName = newNoteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getNoteParty() {
		if (noteParty != null && ((EObject)noteParty).eIsProxy()) {
			InternalEObject oldNoteParty = (InternalEObject)noteParty;
			noteParty = (Party)eResolveProxy(oldNoteParty);
			if (noteParty != oldNoteParty) {
			}
		}
		return noteParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetNoteParty() {
		return noteParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteParty(Party newNoteParty) {
		noteParty = newNoteParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> custRequestNotes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoiceNotes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> marketingCampaignNotes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderHeaderNotes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> partyNotes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> quoteNotes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> workEffortNotes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> workEfforts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NotePackage.NOTE_DATA__NOTE_ID:
				return getNoteId();
			case NotePackage.NOTE_DATA__MORE_INFO_ITEM_ID:
				return getMoreInfoItemId();
			case NotePackage.NOTE_DATA__MORE_INFO_ITEM_NAME:
				return getMoreInfoItemName();
			case NotePackage.NOTE_DATA__MORE_INFO_URL:
				return getMoreInfoUrl();
			case NotePackage.NOTE_DATA__NOTE_DATE_TIME:
				return getNoteDateTime();
			case NotePackage.NOTE_DATA__NOTE_INFO:
				return getNoteInfo();
			case NotePackage.NOTE_DATA__NOTE_NAME:
				return getNoteName();
			case NotePackage.NOTE_DATA__NOTE_PARTY:
				if (resolve) return getNoteParty();
				return basicGetNoteParty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NotePackage.NOTE_DATA__NOTE_ID:
				setNoteId((String)newValue);
				return;
			case NotePackage.NOTE_DATA__MORE_INFO_ITEM_ID:
				setMoreInfoItemId((String)newValue);
				return;
			case NotePackage.NOTE_DATA__MORE_INFO_ITEM_NAME:
				setMoreInfoItemName((String)newValue);
				return;
			case NotePackage.NOTE_DATA__MORE_INFO_URL:
				setMoreInfoUrl((String)newValue);
				return;
			case NotePackage.NOTE_DATA__NOTE_DATE_TIME:
				setNoteDateTime((Date)newValue);
				return;
			case NotePackage.NOTE_DATA__NOTE_INFO:
				setNoteInfo((String)newValue);
				return;
			case NotePackage.NOTE_DATA__NOTE_NAME:
				setNoteName((String)newValue);
				return;
			case NotePackage.NOTE_DATA__NOTE_PARTY:
				setNoteParty((Party)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NotePackage.NOTE_DATA__NOTE_ID:
				setNoteId(NOTE_ID_EDEFAULT);
				return;
			case NotePackage.NOTE_DATA__MORE_INFO_ITEM_ID:
				setMoreInfoItemId(MORE_INFO_ITEM_ID_EDEFAULT);
				return;
			case NotePackage.NOTE_DATA__MORE_INFO_ITEM_NAME:
				setMoreInfoItemName(MORE_INFO_ITEM_NAME_EDEFAULT);
				return;
			case NotePackage.NOTE_DATA__MORE_INFO_URL:
				setMoreInfoUrl(MORE_INFO_URL_EDEFAULT);
				return;
			case NotePackage.NOTE_DATA__NOTE_DATE_TIME:
				setNoteDateTime(NOTE_DATE_TIME_EDEFAULT);
				return;
			case NotePackage.NOTE_DATA__NOTE_INFO:
				setNoteInfo(NOTE_INFO_EDEFAULT);
				return;
			case NotePackage.NOTE_DATA__NOTE_NAME:
				setNoteName(NOTE_NAME_EDEFAULT);
				return;
			case NotePackage.NOTE_DATA__NOTE_PARTY:
				setNoteParty((Party)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NotePackage.NOTE_DATA__NOTE_ID:
				return NOTE_ID_EDEFAULT == null ? noteId != null : !NOTE_ID_EDEFAULT.equals(noteId);
			case NotePackage.NOTE_DATA__MORE_INFO_ITEM_ID:
				return MORE_INFO_ITEM_ID_EDEFAULT == null ? moreInfoItemId != null : !MORE_INFO_ITEM_ID_EDEFAULT.equals(moreInfoItemId);
			case NotePackage.NOTE_DATA__MORE_INFO_ITEM_NAME:
				return MORE_INFO_ITEM_NAME_EDEFAULT == null ? moreInfoItemName != null : !MORE_INFO_ITEM_NAME_EDEFAULT.equals(moreInfoItemName);
			case NotePackage.NOTE_DATA__MORE_INFO_URL:
				return MORE_INFO_URL_EDEFAULT == null ? moreInfoUrl != null : !MORE_INFO_URL_EDEFAULT.equals(moreInfoUrl);
			case NotePackage.NOTE_DATA__NOTE_DATE_TIME:
				return NOTE_DATE_TIME_EDEFAULT == null ? noteDateTime != null : !NOTE_DATE_TIME_EDEFAULT.equals(noteDateTime);
			case NotePackage.NOTE_DATA__NOTE_INFO:
				return NOTE_INFO_EDEFAULT == null ? noteInfo != null : !NOTE_INFO_EDEFAULT.equals(noteInfo);
			case NotePackage.NOTE_DATA__NOTE_NAME:
				return NOTE_NAME_EDEFAULT == null ? noteName != null : !NOTE_NAME_EDEFAULT.equals(noteName);
			case NotePackage.NOTE_DATA__NOTE_PARTY:
				return noteParty != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (noteId: ");
		result.append(noteId);
		result.append(", moreInfoItemId: ");
		result.append(moreInfoItemId);
		result.append(", moreInfoItemName: ");
		result.append(moreInfoItemName);
		result.append(", moreInfoUrl: ");
		result.append(moreInfoUrl);
		result.append(", noteDateTime: ");
		result.append(noteDateTime);
		result.append(", noteInfo: ");
		result.append(noteInfo);
		result.append(", noteName: ");
		result.append(noteName);
		result.append(')');
		return result.toString();
	}

} //NoteDataImpl
