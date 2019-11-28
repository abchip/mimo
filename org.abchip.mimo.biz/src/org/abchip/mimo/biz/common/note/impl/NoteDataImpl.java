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

import org.abchip.mimo.biz.accounting.invoice.InvoiceNote;
import org.abchip.mimo.biz.common.note.NoteData;
import org.abchip.mimo.biz.common.note.NotePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.campaign.MarketingCampaignNote;
import org.abchip.mimo.biz.order.order.OrderHeaderNote;
import org.abchip.mimo.biz.order.quote.QuoteNote;
import org.abchip.mimo.biz.order.request.CustRequestNote;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyNote;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortNote;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(NotePackage.Literals.NOTE_DATA__NOTE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteId(String newNoteId) {
		eSet(NotePackage.Literals.NOTE_DATA__NOTE_ID, newNoteId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMoreInfoItemId() {
		return (String)eGet(NotePackage.Literals.NOTE_DATA__MORE_INFO_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoreInfoItemId(String newMoreInfoItemId) {
		eSet(NotePackage.Literals.NOTE_DATA__MORE_INFO_ITEM_ID, newMoreInfoItemId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMoreInfoItemName() {
		return (String)eGet(NotePackage.Literals.NOTE_DATA__MORE_INFO_ITEM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoreInfoItemName(String newMoreInfoItemName) {
		eSet(NotePackage.Literals.NOTE_DATA__MORE_INFO_ITEM_NAME, newMoreInfoItemName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMoreInfoUrl() {
		return (String)eGet(NotePackage.Literals.NOTE_DATA__MORE_INFO_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoreInfoUrl(String newMoreInfoUrl) {
		eSet(NotePackage.Literals.NOTE_DATA__MORE_INFO_URL, newMoreInfoUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getNoteDateTime() {
		return (Date)eGet(NotePackage.Literals.NOTE_DATA__NOTE_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteDateTime(Date newNoteDateTime) {
		eSet(NotePackage.Literals.NOTE_DATA__NOTE_DATE_TIME, newNoteDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteInfo() {
		return (String)eGet(NotePackage.Literals.NOTE_DATA__NOTE_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteInfo(String newNoteInfo) {
		eSet(NotePackage.Literals.NOTE_DATA__NOTE_INFO, newNoteInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteName() {
		return (String)eGet(NotePackage.Literals.NOTE_DATA__NOTE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteName(String newNoteName) {
		eSet(NotePackage.Literals.NOTE_DATA__NOTE_NAME, newNoteName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getNoteParty() {
		return (Party)eGet(NotePackage.Literals.NOTE_DATA__NOTE_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteParty(Party newNoteParty) {
		eSet(NotePackage.Literals.NOTE_DATA__NOTE_PARTY, newNoteParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<CustRequestNote> custRequestNotes() {
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
	public List<InvoiceNote> invoiceNotes() {
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
	public List<MarketingCampaignNote> marketingCampaignNotes() {
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
	public List<OrderHeaderNote> orderHeaderNotes() {
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
	public List<PartyNote> partyNotes() {
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
	public List<QuoteNote> quoteNotes() {
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
	public List<WorkEffortNote> workEffortNotes() {
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
	public List<WorkEffort> workEfforts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //NoteDataImpl
