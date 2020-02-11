/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactMechAttribute;
import org.abchip.mimo.biz.party.contact.ContactMechLink;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechImpl#getContactMechAttributes <em>Contact Mech Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechImpl#getFromContactMechLinks <em>From Contact Mech Links</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechImpl#getInfoString <em>Info String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactMechImpl extends BizEntityTypedImpl<ContactMechType> implements ContactMech {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactMechImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.CONTACT_MECH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfoString() {
		return (String)eGet(ContactPackage.Literals.CONTACT_MECH__INFO_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoString(String newInfoString) {
		eSet(ContactPackage.Literals.CONTACT_MECH__INFO_STRING, newInfoString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType getContactMechTypeId() {
		return (ContactMechType)eGet(ContactPackage.Literals.CONTACT_MECH__CONTACT_MECH_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(ContactMechType newContactMechTypeId) {
		eSet(ContactPackage.Literals.CONTACT_MECH__CONTACT_MECH_TYPE_ID, newContactMechTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ContactMechLink> getFromContactMechLinks() {
		return (List<ContactMechLink>)eGet(ContactPackage.Literals.CONTACT_MECH__FROM_CONTACT_MECH_LINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return (String)eGet(ContactPackage.Literals.CONTACT_MECH__CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		eSet(ContactPackage.Literals.CONTACT_MECH__CONTACT_MECH_ID, newContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ContactMechAttribute> getContactMechAttributes() {
		return (List<ContactMechAttribute>)eGet(ContactPackage.Literals.CONTACT_MECH__CONTACT_MECH_ATTRIBUTES, true);
	}

} //ContactMechImpl
