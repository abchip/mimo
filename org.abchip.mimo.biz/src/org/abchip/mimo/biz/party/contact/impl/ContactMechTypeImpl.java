/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
	 * The default value of the '{@link #getContactMechTypeId() <em>Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_TYPE_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getContactMechTypeId() <em>Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechTypeId = CONTACT_MECH_TYPE_ID_EDEFAULT;
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
	protected ContactMechType parentTypeId;

	/**
	 * The cached value of the '{@link #getContactMechTypeAttrs() <em>Contact Mech Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contactMechTypeAttrs;
	/**
	 * The cached value of the '{@link #getContactMechTypePurposes() <em>Contact Mech Type Purposes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypePurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contactMechTypePurposes;

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
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
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
		hasTable = newHasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (ContactMechType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMechType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ContactMechType newParentTypeId) {
		parentTypeId = newParentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getContactMechTypeAttrs() {
		if (contactMechTypeAttrs == null) {
			contactMechTypeAttrs = new BasicInternalEList<String>(String.class);
		}
		return contactMechTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getContactMechTypePurposes() {
		if (contactMechTypePurposes == null) {
			contactMechTypePurposes = new BasicInternalEList<String>(String.class);
		}
		return contactMechTypePurposes;
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
	public String getContactMechTypeId() {
		return contactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(String newContactMechTypeId) {
		contactMechTypeId = newContactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ID:
				return getContactMechTypeId();
			case ContactPackage.CONTACT_MECH_TYPE__DESCRIPTION:
				return getDescription();
			case ContactPackage.CONTACT_MECH_TYPE__HAS_TABLE:
				return isHasTable();
			case ContactPackage.CONTACT_MECH_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ATTRS:
				return getContactMechTypeAttrs();
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_PURPOSES:
				return getContactMechTypePurposes();
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
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId((String)newValue);
				return;
			case ContactPackage.CONTACT_MECH_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContactPackage.CONTACT_MECH_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case ContactPackage.CONTACT_MECH_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ContactMechType)newValue);
				return;
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ATTRS:
				getContactMechTypeAttrs().clear();
				getContactMechTypeAttrs().addAll((Collection<? extends String>)newValue);
				return;
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_PURPOSES:
				getContactMechTypePurposes().clear();
				getContactMechTypePurposes().addAll((Collection<? extends String>)newValue);
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
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId(CONTACT_MECH_TYPE_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_MECH_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContactPackage.CONTACT_MECH_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case ContactPackage.CONTACT_MECH_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ContactMechType)null);
				return;
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ATTRS:
				getContactMechTypeAttrs().clear();
				return;
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_PURPOSES:
				getContactMechTypePurposes().clear();
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
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ID:
				return CONTACT_MECH_TYPE_ID_EDEFAULT == null ? contactMechTypeId != null : !CONTACT_MECH_TYPE_ID_EDEFAULT.equals(contactMechTypeId);
			case ContactPackage.CONTACT_MECH_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContactPackage.CONTACT_MECH_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case ContactPackage.CONTACT_MECH_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ATTRS:
				return contactMechTypeAttrs != null && !contactMechTypeAttrs.isEmpty();
			case ContactPackage.CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_PURPOSES:
				return contactMechTypePurposes != null && !contactMechTypePurposes.isEmpty();
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
		result.append(" (contactMechTypeId: ");
		result.append(contactMechTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", contactMechTypeAttrs: ");
		result.append(contactMechTypeAttrs);
		result.append(", contactMechTypePurposes: ");
		result.append(contactMechTypePurposes);
		result.append(')');
		return result.toString();
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
