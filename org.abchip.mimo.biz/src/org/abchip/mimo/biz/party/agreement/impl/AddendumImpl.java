/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.agreement.Addendum;
import org.abchip.mimo.biz.party.agreement.Agreement;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addendum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAddendumId <em>Addendum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAddendumCreationDate <em>Addendum Creation Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAddendumEffectiveDate <em>Addendum Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAddendumText <em>Addendum Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddendumImpl extends BizEntityImpl implements Addendum {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddendumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.ADDENDUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAddendumCreationDate() {
		return (Date)eGet(AgreementPackage.Literals.ADDENDUM__ADDENDUM_CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddendumCreationDate(Date newAddendumCreationDate) {
		eSet(AgreementPackage.Literals.ADDENDUM__ADDENDUM_CREATION_DATE, newAddendumCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAddendumEffectiveDate() {
		return (Date)eGet(AgreementPackage.Literals.ADDENDUM__ADDENDUM_EFFECTIVE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddendumEffectiveDate(Date newAddendumEffectiveDate) {
		eSet(AgreementPackage.Literals.ADDENDUM__ADDENDUM_EFFECTIVE_DATE, newAddendumEffectiveDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddendumId() {
		return (String)eGet(AgreementPackage.Literals.ADDENDUM__ADDENDUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddendumId(String newAddendumId) {
		eSet(AgreementPackage.Literals.ADDENDUM__ADDENDUM_ID, newAddendumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddendumText() {
		return (String)eGet(AgreementPackage.Literals.ADDENDUM__ADDENDUM_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddendumText(String newAddendumText) {
		eSet(AgreementPackage.Literals.ADDENDUM__ADDENDUM_TEXT, newAddendumText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementItemSeqId() {
		return (String)eGet(AgreementPackage.Literals.ADDENDUM__AGREEMENT_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemSeqId(String newAgreementItemSeqId) {
		eSet(AgreementPackage.Literals.ADDENDUM__AGREEMENT_ITEM_SEQ_ID, newAgreementItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agreement getAgreementId() {
		return (Agreement)eGet(AgreementPackage.Literals.ADDENDUM__AGREEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementId(Agreement newAgreementId) {
		eSet(AgreementPackage.Literals.ADDENDUM__AGREEMENT_ID, newAgreementId);
	}

} //AddendumImpl
