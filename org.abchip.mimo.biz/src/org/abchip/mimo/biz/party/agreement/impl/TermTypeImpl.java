/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.abchip.mimo.biz.party.agreement.TermType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.TermTypeImpl#getTermTypeId <em>Term Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.TermTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.TermTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.TermTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.TermTypeImpl#getTermTypeAttrs <em>Term Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermTypeImpl extends BizEntityImpl implements TermType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getTermTypeId() <em>Term Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermTypeId() <em>Term Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermTypeId()
	 * @generated
	 * @ordered
	 */
	protected String termTypeId = TERM_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected TermType parentTypeId;

	/**
	 * The cached value of the '{@link #getTermTypeAttrs() <em>Term Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> termTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.TERM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.TERM_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.TERM_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (TermType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementPackage.TERM_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(TermType newParentTypeId) {
		TermType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.TERM_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTermTypeId() {
		return termTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermTypeId(String newTermTypeId) {
		String oldTermTypeId = termTypeId;
		termTypeId = newTermTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.TERM_TYPE__TERM_TYPE_ID, oldTermTypeId, termTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getTermTypeAttrs() {
		if (termTypeAttrs == null) {
			termTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, AgreementPackage.TERM_TYPE__TERM_TYPE_ATTRS);
		}
		return termTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> agreementTerms() {
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
	public List<String> billingAccountTerms() {
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
	public List<String> childTermTypes() {
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
	public List<String> invoiceTerms() {
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
			case AgreementPackage.TERM_TYPE__TERM_TYPE_ID:
				return getTermTypeId();
			case AgreementPackage.TERM_TYPE__DESCRIPTION:
				return getDescription();
			case AgreementPackage.TERM_TYPE__HAS_TABLE:
				return isHasTable();
			case AgreementPackage.TERM_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case AgreementPackage.TERM_TYPE__TERM_TYPE_ATTRS:
				return getTermTypeAttrs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgreementPackage.TERM_TYPE__TERM_TYPE_ID:
				setTermTypeId((String)newValue);
				return;
			case AgreementPackage.TERM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AgreementPackage.TERM_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case AgreementPackage.TERM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((TermType)newValue);
				return;
			case AgreementPackage.TERM_TYPE__TERM_TYPE_ATTRS:
				getTermTypeAttrs().clear();
				getTermTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case AgreementPackage.TERM_TYPE__TERM_TYPE_ID:
				setTermTypeId(TERM_TYPE_ID_EDEFAULT);
				return;
			case AgreementPackage.TERM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AgreementPackage.TERM_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case AgreementPackage.TERM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((TermType)null);
				return;
			case AgreementPackage.TERM_TYPE__TERM_TYPE_ATTRS:
				getTermTypeAttrs().clear();
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
			case AgreementPackage.TERM_TYPE__TERM_TYPE_ID:
				return TERM_TYPE_ID_EDEFAULT == null ? termTypeId != null : !TERM_TYPE_ID_EDEFAULT.equals(termTypeId);
			case AgreementPackage.TERM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AgreementPackage.TERM_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case AgreementPackage.TERM_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case AgreementPackage.TERM_TYPE__TERM_TYPE_ATTRS:
				return termTypeAttrs != null && !termTypeAttrs.isEmpty();
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
		result.append(" (termTypeId: ");
		result.append(termTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", termTypeAttrs: ");
		result.append(termTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //TermTypeImpl
