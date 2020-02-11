/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.cert;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>X509 Issuer Provision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCertProvisionId <em>Cert Provision Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCityLocality <em>City Locality</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCountry <em>Country</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getOrganizationalUnit <em>Organizational Unit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getStateProvince <em>State Province</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.cert.CertPackage#getX509IssuerProvision()
 * @model annotation="mimo-ent-frame title='Valid issuer data for authentication of x.509 certificates'"
 * @generated
 */
public interface X509IssuerProvision extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cert Provision Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cert Provision Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cert Provision Id</em>' attribute.
	 * @see #setCertProvisionId(String)
	 * @see org.abchip.mimo.biz.security.cert.CertPackage#getX509IssuerProvision_CertProvisionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCertProvisionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCertProvisionId <em>Cert Provision Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cert Provision Id</em>' attribute.
	 * @see #getCertProvisionId()
	 * @generated
	 */
	void setCertProvisionId(String value);

	/**
	 * Returns the value of the '<em><b>City Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Locality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Locality</em>' attribute.
	 * @see #setCityLocality(String)
	 * @see org.abchip.mimo.biz.security.cert.CertPackage#getX509IssuerProvision_CityLocality()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCityLocality();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCityLocality <em>City Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Locality</em>' attribute.
	 * @see #getCityLocality()
	 * @generated
	 */
	void setCityLocality(String value);

	/**
	 * Returns the value of the '<em><b>Common Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Name</em>' attribute.
	 * @see #setCommonName(String)
	 * @see org.abchip.mimo.biz.security.cert.CertPackage#getX509IssuerProvision_CommonName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCommonName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCommonName <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Name</em>' attribute.
	 * @see #getCommonName()
	 * @generated
	 */
	void setCommonName(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.abchip.mimo.biz.security.cert.CertPackage#getX509IssuerProvision_Country()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute.
	 * @see #setOrganizationName(String)
	 * @see org.abchip.mimo.biz.security.cert.CertPackage#getX509IssuerProvision_OrganizationName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getOrganizationName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getOrganizationName <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Name</em>' attribute.
	 * @see #getOrganizationName()
	 * @generated
	 */
	void setOrganizationName(String value);

	/**
	 * Returns the value of the '<em><b>Organizational Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizational Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizational Unit</em>' attribute.
	 * @see #setOrganizationalUnit(String)
	 * @see org.abchip.mimo.biz.security.cert.CertPackage#getX509IssuerProvision_OrganizationalUnit()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getOrganizationalUnit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getOrganizationalUnit <em>Organizational Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizational Unit</em>' attribute.
	 * @see #getOrganizationalUnit()
	 * @generated
	 */
	void setOrganizationalUnit(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.abchip.mimo.biz.security.cert.CertPackage#getX509IssuerProvision_SerialNumber()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>State Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Province</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Province</em>' attribute.
	 * @see #setStateProvince(String)
	 * @see org.abchip.mimo.biz.security.cert.CertPackage#getX509IssuerProvision_StateProvince()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getStateProvince();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getStateProvince <em>State Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Province</em>' attribute.
	 * @see #getStateProvince()
	 * @generated
	 */
	void setStateProvince(String value);

} // X509IssuerProvision
