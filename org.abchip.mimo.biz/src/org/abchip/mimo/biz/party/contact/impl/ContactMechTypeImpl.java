/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Mech Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl#getContactMechTypeAttrs <em>Contact Mech Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl#getContactMechTypePurposes <em>Contact Mech Type Purposes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactMechTypeImpl extends BizEntityTypeImpl<ContactMech> implements ContactMechType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactMechTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.CONTACT_MECH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ContactPackage.Literals.CONTACT_MECH_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ContactPackage.Literals.CONTACT_MECH_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(ContactPackage.Literals.CONTACT_MECH_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(ContactPackage.Literals.CONTACT_MECH_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType getParentTypeId() {
		return (ContactMechType)eGet(ContactPackage.Literals.CONTACT_MECH_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ContactMechType newParentTypeId) {
		eSet(ContactPackage.Literals.CONTACT_MECH_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getContactMechTypeAttrs() {
		return (List<String>)eGet(ContactPackage.Literals.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ATTRS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getContactMechTypePurposes() {
		return (List<String>)eGet(ContactPackage.Literals.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_PURPOSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childContactMechTypes() {
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
	public List<String> communicationEvents() {
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
	public List<String> contacMechTypeCommunicationEventTypes() {
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
	public List<String> contactLists() {
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
	public List<String> contactMechs() {
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
	public List<String> validContactMechRoles() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContactPackage.CONTACT_MECH_TYPE___CHILD_CONTACT_MECH_TYPES:
				return childContactMechTypes();
			case ContactPackage.CONTACT_MECH_TYPE___COMMUNICATION_EVENTS:
				return communicationEvents();
			case ContactPackage.CONTACT_MECH_TYPE___CONTAC_MECH_TYPE_COMMUNICATION_EVENT_TYPES:
				return contacMechTypeCommunicationEventTypes();
			case ContactPackage.CONTACT_MECH_TYPE___CONTACT_LISTS:
				return contactLists();
			case ContactPackage.CONTACT_MECH_TYPE___CONTACT_MECHS:
				return contactMechs();
			case ContactPackage.CONTACT_MECH_TYPE___VALID_CONTACT_MECH_ROLES:
				return validContactMechRoles();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechTypeId() {
		return (String)eGet(ContactPackage.Literals.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(String newContactMechTypeId) {
		eSet(ContactPackage.Literals.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ID, newContactMechTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isPostalAddress() {
		return getContactMechTypeId().equals("POSTAL_ADDRESS");
	}

} //ContactMechTypeImpl
