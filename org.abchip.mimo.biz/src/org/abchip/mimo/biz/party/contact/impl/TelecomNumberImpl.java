/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import java.util.List;

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
	 * The default value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected String areaCode = AREA_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAskForName() <em>Ask For Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAskForName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASK_FOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAskForName() <em>Ask For Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAskForName()
	 * @generated
	 * @ordered
	 */
	protected String askForName = ASK_FOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactNumber() <em>Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContactNumber() <em>Contact Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactNumber()
	 * @generated
	 * @ordered
	 */
	protected String contactNumber = CONTACT_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected String countryCode = COUNTRY_CODE_EDEFAULT;

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
		return areaCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaCode(String newAreaCode) {
		areaCode = newAreaCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAskForName() {
		return askForName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAskForName(String newAskForName) {
		askForName = newAskForName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactNumber(String newContactNumber) {
		contactNumber = newContactNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryCode(String newCountryCode) {
		countryCode = newCountryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> destinationShipments() {
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
			case ContactPackage.TELECOM_NUMBER__AREA_CODE:
				return getAreaCode();
			case ContactPackage.TELECOM_NUMBER__ASK_FOR_NAME:
				return getAskForName();
			case ContactPackage.TELECOM_NUMBER__CONTACT_NUMBER:
				return getContactNumber();
			case ContactPackage.TELECOM_NUMBER__COUNTRY_CODE:
				return getCountryCode();
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
			case ContactPackage.TELECOM_NUMBER__AREA_CODE:
				setAreaCode((String)newValue);
				return;
			case ContactPackage.TELECOM_NUMBER__ASK_FOR_NAME:
				setAskForName((String)newValue);
				return;
			case ContactPackage.TELECOM_NUMBER__CONTACT_NUMBER:
				setContactNumber((String)newValue);
				return;
			case ContactPackage.TELECOM_NUMBER__COUNTRY_CODE:
				setCountryCode((String)newValue);
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
			case ContactPackage.TELECOM_NUMBER__AREA_CODE:
				setAreaCode(AREA_CODE_EDEFAULT);
				return;
			case ContactPackage.TELECOM_NUMBER__ASK_FOR_NAME:
				setAskForName(ASK_FOR_NAME_EDEFAULT);
				return;
			case ContactPackage.TELECOM_NUMBER__CONTACT_NUMBER:
				setContactNumber(CONTACT_NUMBER_EDEFAULT);
				return;
			case ContactPackage.TELECOM_NUMBER__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
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
			case ContactPackage.TELECOM_NUMBER__AREA_CODE:
				return AREA_CODE_EDEFAULT == null ? areaCode != null : !AREA_CODE_EDEFAULT.equals(areaCode);
			case ContactPackage.TELECOM_NUMBER__ASK_FOR_NAME:
				return ASK_FOR_NAME_EDEFAULT == null ? askForName != null : !ASK_FOR_NAME_EDEFAULT.equals(askForName);
			case ContactPackage.TELECOM_NUMBER__CONTACT_NUMBER:
				return CONTACT_NUMBER_EDEFAULT == null ? contactNumber != null : !CONTACT_NUMBER_EDEFAULT.equals(contactNumber);
			case ContactPackage.TELECOM_NUMBER__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
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
		result.append(" (areaCode: ");
		result.append(areaCode);
		result.append(", askForName: ");
		result.append(askForName);
		result.append(", contactNumber: ");
		result.append(contactNumber);
		result.append(", countryCode: ");
		result.append(countryCode);
		result.append(')');
		return result.toString();
	}

} //TelecomNumberImpl
