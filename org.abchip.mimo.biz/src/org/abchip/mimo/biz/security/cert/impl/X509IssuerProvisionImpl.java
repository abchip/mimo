/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.cert.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.cert.CertPackage;
import org.abchip.mimo.biz.security.cert.X509IssuerProvision;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(CertPackage.Literals.X509_ISSUER_PROVISION__CERT_PROVISION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertProvisionId(String newCertProvisionId) {
		eSet(CertPackage.Literals.X509_ISSUER_PROVISION__CERT_PROVISION_ID, newCertProvisionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCityLocality() {
		return (String)eGet(CertPackage.Literals.X509_ISSUER_PROVISION__CITY_LOCALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityLocality(String newCityLocality) {
		eSet(CertPackage.Literals.X509_ISSUER_PROVISION__CITY_LOCALITY, newCityLocality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommonName() {
		return (String)eGet(CertPackage.Literals.X509_ISSUER_PROVISION__COMMON_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommonName(String newCommonName) {
		eSet(CertPackage.Literals.X509_ISSUER_PROVISION__COMMON_NAME, newCommonName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return (String)eGet(CertPackage.Literals.X509_ISSUER_PROVISION__COUNTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		eSet(CertPackage.Literals.X509_ISSUER_PROVISION__COUNTRY, newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationName() {
		return (String)eGet(CertPackage.Literals.X509_ISSUER_PROVISION__ORGANIZATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationName(String newOrganizationName) {
		eSet(CertPackage.Literals.X509_ISSUER_PROVISION__ORGANIZATION_NAME, newOrganizationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationalUnit() {
		return (String)eGet(CertPackage.Literals.X509_ISSUER_PROVISION__ORGANIZATIONAL_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationalUnit(String newOrganizationalUnit) {
		eSet(CertPackage.Literals.X509_ISSUER_PROVISION__ORGANIZATIONAL_UNIT, newOrganizationalUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return (String)eGet(CertPackage.Literals.X509_ISSUER_PROVISION__SERIAL_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		eSet(CertPackage.Literals.X509_ISSUER_PROVISION__SERIAL_NUMBER, newSerialNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateProvince() {
		return (String)eGet(CertPackage.Literals.X509_ISSUER_PROVISION__STATE_PROVINCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateProvince(String newStateProvince) {
		eSet(CertPackage.Literals.X509_ISSUER_PROVISION__STATE_PROVINCE, newStateProvince);
	}

} //X509IssuerProvisionImpl
