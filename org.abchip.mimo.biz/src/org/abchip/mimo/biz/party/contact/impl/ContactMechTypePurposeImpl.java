/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.abchip.mimo.biz.party.contact.ContactMechTypePurpose;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Mech Type Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypePurposeImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypePurposeImpl#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactMechTypePurposeImpl extends BizEntityImpl implements ContactMechTypePurpose {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactMechTypePurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.CONTACT_MECH_TYPE_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType getContactMechTypeId() {
		return (ContactMechType)eGet(ContactPackage.Literals.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(ContactMechType newContactMechTypeId) {
		eSet(ContactPackage.Literals.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE_ID, newContactMechTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechPurposeType getContactMechPurposeTypeId() {
		return (ContactMechPurposeType)eGet(ContactPackage.Literals.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechPurposeTypeId(ContactMechPurposeType newContactMechPurposeTypeId) {
		eSet(ContactPackage.Literals.CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID, newContactMechPurposeTypeId);
	}

} //ContactMechTypePurposeImpl
