/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.cert.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.cert.CertPackage;
import org.abchip.mimo.biz.security.cert.X509IssuerProvision;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>X509 Issuer Provision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl#getCertProvisionId <em>Cert Provision Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl#getCityLocality <em>City Locality</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl#getOrganizationalUnit <em>Organizational Unit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl#getStateProvince <em>State Province</em>}</li>
 * </ul>
 *
 * @generated
 */
public class X509IssuerProvisionImpl extends BizEntityImpl implements X509IssuerProvision {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCertProvisionId() <em>Cert Provision Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertProvisionId()
	 * @generated
	 * @ordered
	 */
	protected static final String CERT_PROVISION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertProvisionId() <em>Cert Provision Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertProvisionId()
	 * @generated
	 * @ordered
	 */
	protected String certProvisionId = CERT_PROVISION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCityLocality() <em>City Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityLocality()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_LOCALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCityLocality() <em>City Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityLocality()
	 * @generated
	 * @ordered
	 */
	protected String cityLocality = CITY_LOCALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
	protected String commonName = COMMON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected String organizationName = ORGANIZATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationalUnit() <em>Organizational Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationalUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATIONAL_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationalUnit() <em>Organizational Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationalUnit()
	 * @generated
	 * @ordered
	 */
	protected String organizationalUnit = ORGANIZATIONAL_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateProvince() <em>State Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_PROVINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateProvince() <em>State Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProvince()
	 * @generated
	 * @ordered
	 */
	protected String stateProvince = STATE_PROVINCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected X509IssuerProvisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CertPackage.Literals.X509_ISSUER_PROVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertProvisionId() {
		return certProvisionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertProvisionId(String newCertProvisionId) {
		String oldCertProvisionId = certProvisionId;
		certProvisionId = newCertProvisionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertPackage.X509_ISSUER_PROVISION__CERT_PROVISION_ID, oldCertProvisionId, certProvisionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCityLocality() {
		return cityLocality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityLocality(String newCityLocality) {
		String oldCityLocality = cityLocality;
		cityLocality = newCityLocality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertPackage.X509_ISSUER_PROVISION__CITY_LOCALITY, oldCityLocality, cityLocality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommonName() {
		return commonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommonName(String newCommonName) {
		String oldCommonName = commonName;
		commonName = newCommonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertPackage.X509_ISSUER_PROVISION__COMMON_NAME, oldCommonName, commonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertPackage.X509_ISSUER_PROVISION__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationName(String newOrganizationName) {
		String oldOrganizationName = organizationName;
		organizationName = newOrganizationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertPackage.X509_ISSUER_PROVISION__ORGANIZATION_NAME, oldOrganizationName, organizationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationalUnit() {
		return organizationalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationalUnit(String newOrganizationalUnit) {
		String oldOrganizationalUnit = organizationalUnit;
		organizationalUnit = newOrganizationalUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertPackage.X509_ISSUER_PROVISION__ORGANIZATIONAL_UNIT, oldOrganizationalUnit, organizationalUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertPackage.X509_ISSUER_PROVISION__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateProvince() {
		return stateProvince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateProvince(String newStateProvince) {
		String oldStateProvince = stateProvince;
		stateProvince = newStateProvince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertPackage.X509_ISSUER_PROVISION__STATE_PROVINCE, oldStateProvince, stateProvince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CertPackage.X509_ISSUER_PROVISION__CERT_PROVISION_ID:
				return getCertProvisionId();
			case CertPackage.X509_ISSUER_PROVISION__CITY_LOCALITY:
				return getCityLocality();
			case CertPackage.X509_ISSUER_PROVISION__COMMON_NAME:
				return getCommonName();
			case CertPackage.X509_ISSUER_PROVISION__COUNTRY:
				return getCountry();
			case CertPackage.X509_ISSUER_PROVISION__ORGANIZATION_NAME:
				return getOrganizationName();
			case CertPackage.X509_ISSUER_PROVISION__ORGANIZATIONAL_UNIT:
				return getOrganizationalUnit();
			case CertPackage.X509_ISSUER_PROVISION__SERIAL_NUMBER:
				return getSerialNumber();
			case CertPackage.X509_ISSUER_PROVISION__STATE_PROVINCE:
				return getStateProvince();
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
			case CertPackage.X509_ISSUER_PROVISION__CERT_PROVISION_ID:
				setCertProvisionId((String)newValue);
				return;
			case CertPackage.X509_ISSUER_PROVISION__CITY_LOCALITY:
				setCityLocality((String)newValue);
				return;
			case CertPackage.X509_ISSUER_PROVISION__COMMON_NAME:
				setCommonName((String)newValue);
				return;
			case CertPackage.X509_ISSUER_PROVISION__COUNTRY:
				setCountry((String)newValue);
				return;
			case CertPackage.X509_ISSUER_PROVISION__ORGANIZATION_NAME:
				setOrganizationName((String)newValue);
				return;
			case CertPackage.X509_ISSUER_PROVISION__ORGANIZATIONAL_UNIT:
				setOrganizationalUnit((String)newValue);
				return;
			case CertPackage.X509_ISSUER_PROVISION__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CertPackage.X509_ISSUER_PROVISION__STATE_PROVINCE:
				setStateProvince((String)newValue);
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
			case CertPackage.X509_ISSUER_PROVISION__CERT_PROVISION_ID:
				setCertProvisionId(CERT_PROVISION_ID_EDEFAULT);
				return;
			case CertPackage.X509_ISSUER_PROVISION__CITY_LOCALITY:
				setCityLocality(CITY_LOCALITY_EDEFAULT);
				return;
			case CertPackage.X509_ISSUER_PROVISION__COMMON_NAME:
				setCommonName(COMMON_NAME_EDEFAULT);
				return;
			case CertPackage.X509_ISSUER_PROVISION__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case CertPackage.X509_ISSUER_PROVISION__ORGANIZATION_NAME:
				setOrganizationName(ORGANIZATION_NAME_EDEFAULT);
				return;
			case CertPackage.X509_ISSUER_PROVISION__ORGANIZATIONAL_UNIT:
				setOrganizationalUnit(ORGANIZATIONAL_UNIT_EDEFAULT);
				return;
			case CertPackage.X509_ISSUER_PROVISION__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CertPackage.X509_ISSUER_PROVISION__STATE_PROVINCE:
				setStateProvince(STATE_PROVINCE_EDEFAULT);
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
			case CertPackage.X509_ISSUER_PROVISION__CERT_PROVISION_ID:
				return CERT_PROVISION_ID_EDEFAULT == null ? certProvisionId != null : !CERT_PROVISION_ID_EDEFAULT.equals(certProvisionId);
			case CertPackage.X509_ISSUER_PROVISION__CITY_LOCALITY:
				return CITY_LOCALITY_EDEFAULT == null ? cityLocality != null : !CITY_LOCALITY_EDEFAULT.equals(cityLocality);
			case CertPackage.X509_ISSUER_PROVISION__COMMON_NAME:
				return COMMON_NAME_EDEFAULT == null ? commonName != null : !COMMON_NAME_EDEFAULT.equals(commonName);
			case CertPackage.X509_ISSUER_PROVISION__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case CertPackage.X509_ISSUER_PROVISION__ORGANIZATION_NAME:
				return ORGANIZATION_NAME_EDEFAULT == null ? organizationName != null : !ORGANIZATION_NAME_EDEFAULT.equals(organizationName);
			case CertPackage.X509_ISSUER_PROVISION__ORGANIZATIONAL_UNIT:
				return ORGANIZATIONAL_UNIT_EDEFAULT == null ? organizationalUnit != null : !ORGANIZATIONAL_UNIT_EDEFAULT.equals(organizationalUnit);
			case CertPackage.X509_ISSUER_PROVISION__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CertPackage.X509_ISSUER_PROVISION__STATE_PROVINCE:
				return STATE_PROVINCE_EDEFAULT == null ? stateProvince != null : !STATE_PROVINCE_EDEFAULT.equals(stateProvince);
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
		result.append(" (certProvisionId: ");
		result.append(certProvisionId);
		result.append(", cityLocality: ");
		result.append(cityLocality);
		result.append(", commonName: ");
		result.append(commonName);
		result.append(", country: ");
		result.append(country);
		result.append(", organizationName: ");
		result.append(organizationName);
		result.append(", organizationalUnit: ");
		result.append(organizationalUnit);
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", stateProvince: ");
		result.append(stateProvince);
		result.append(')');
		return result.toString();
	}

} //X509IssuerProvisionImpl
