/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.impl;

import org.abchip.mimo.biz.BizEntityNote;
import org.abchip.mimo.biz.BizEntityNoteData;
import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biz Entity Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteImpl#getNoteId <em>Note Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BizEntityNoteImpl extends BizEntityImpl implements BizEntityNote {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BizEntityNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BizPackage.Literals.BIZ_ENTITY_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteId() {
		return (String)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE__NOTE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteId(String newNoteId) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE__NOTE_ID, newNoteId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizEntityNoteData getNote() {
		return (BizEntityNoteData)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE__NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(BizEntityNoteData newNote) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE__NOTE, newNote);
	}

} //BizEntityNoteImpl
