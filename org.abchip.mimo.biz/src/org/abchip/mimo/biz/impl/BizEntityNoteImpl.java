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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected BizEntityNoteData note;
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
	public BizEntityNoteData getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(BizEntityNoteData newNote) {
		note = newNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BizPackage.BIZ_ENTITY_NOTE__NOTE_ID:
				return getNoteId();
			case BizPackage.BIZ_ENTITY_NOTE__NOTE:
				return getNote();
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
			case BizPackage.BIZ_ENTITY_NOTE__NOTE_ID:
				setNoteId((String)newValue);
				return;
			case BizPackage.BIZ_ENTITY_NOTE__NOTE:
				setNote((BizEntityNoteData)newValue);
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
			case BizPackage.BIZ_ENTITY_NOTE__NOTE_ID:
				setNoteId(NOTE_ID_EDEFAULT);
				return;
			case BizPackage.BIZ_ENTITY_NOTE__NOTE:
				setNote((BizEntityNoteData)null);
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
			case BizPackage.BIZ_ENTITY_NOTE__NOTE_ID:
				return NOTE_ID_EDEFAULT == null ? noteId != null : !NOTE_ID_EDEFAULT.equals(noteId);
			case BizPackage.BIZ_ENTITY_NOTE__NOTE:
				return note != null;
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
		result.append(')');
		return result.toString();
	}

} //BizEntityNoteImpl
