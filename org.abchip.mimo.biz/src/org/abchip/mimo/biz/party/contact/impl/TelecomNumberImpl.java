/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telecom Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.TelecomNumberImpl#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.TelecomNumberImpl#getAskForName <em>Ask For Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.TelecomNumberImpl#getContactNumber <em>Contact Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.TelecomNumberImpl#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelecomNumberImpl extends ContactMechImpl implements TelecomNumber {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecomNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.TELECOM_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAreaCode() {
		return (String)eGet(ContactPackage.Literals.TELECOM_NUMBER__AREA_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaCode(String newAreaCode) {
		eSet(ContactPackage.Literals.TELECOM_NUMBER__AREA_CODE, newAreaCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAskForName() {
		return (String)eGet(ContactPackage.Literals.TELECOM_NUMBER__ASK_FOR_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAskForName(String newAskForName) {
		eSet(ContactPackage.Literals.TELECOM_NUMBER__ASK_FOR_NAME, newAskForName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactNumber() {
		return (String)eGet(ContactPackage.Literals.TELECOM_NUMBER__CONTACT_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactNumber(String newContactNumber) {
		eSet(ContactPackage.Literals.TELECOM_NUMBER__CONTACT_NUMBER, newContactNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryCode() {
		return (String)eGet(ContactPackage.Literals.TELECOM_NUMBER__COUNTRY_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryCode(String newCountryCode) {
		eSet(ContactPackage.Literals.TELECOM_NUMBER__COUNTRY_CODE, newCountryCode);
	}

} //TelecomNumberImpl
