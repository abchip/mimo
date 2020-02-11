/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.cert;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.security.cert.CertFactory
 * @model kind="package"
 * @generated
 */
public interface CertPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cert";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/security/cert";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-cert";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CertPackage eINSTANCE = org.abchip.mimo.biz.security.cert.impl.CertPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl <em>X509 Issuer Provision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl
	 * @see org.abchip.mimo.biz.security.cert.impl.CertPackageImpl#getX509IssuerProvision()
	 * @generated
	 */
	int X509_ISSUER_PROVISION = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cert Provision Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__CERT_PROVISION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>City Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__CITY_LOCALITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Common Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__COMMON_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__COUNTRY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__ORGANIZATION_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organizational Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__ORGANIZATIONAL_UNIT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__SERIAL_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>State Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION__STATE_PROVINCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>X509 Issuer Provision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X509_ISSUER_PROVISION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision <em>X509 Issuer Provision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X509 Issuer Provision</em>'.
	 * @see org.abchip.mimo.biz.security.cert.X509IssuerProvision
	 * @generated
	 */
	EClass getX509IssuerProvision();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCertProvisionId <em>Cert Provision Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cert Provision Id</em>'.
	 * @see org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCertProvisionId()
	 * @see #getX509IssuerProvision()
	 * @generated
	 */
	EAttribute getX509IssuerProvision_CertProvisionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCityLocality <em>City Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Locality</em>'.
	 * @see org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCityLocality()
	 * @see #getX509IssuerProvision()
	 * @generated
	 */
	EAttribute getX509IssuerProvision_CityLocality();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCommonName <em>Common Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Common Name</em>'.
	 * @see org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCommonName()
	 * @see #getX509IssuerProvision()
	 * @generated
	 */
	EAttribute getX509IssuerProvision_CommonName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.abchip.mimo.biz.security.cert.X509IssuerProvision#getCountry()
	 * @see #getX509IssuerProvision()
	 * @generated
	 */
	EAttribute getX509IssuerProvision_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getOrganizationName <em>Organization Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Name</em>'.
	 * @see org.abchip.mimo.biz.security.cert.X509IssuerProvision#getOrganizationName()
	 * @see #getX509IssuerProvision()
	 * @generated
	 */
	EAttribute getX509IssuerProvision_OrganizationName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getOrganizationalUnit <em>Organizational Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organizational Unit</em>'.
	 * @see org.abchip.mimo.biz.security.cert.X509IssuerProvision#getOrganizationalUnit()
	 * @see #getX509IssuerProvision()
	 * @generated
	 */
	EAttribute getX509IssuerProvision_OrganizationalUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see org.abchip.mimo.biz.security.cert.X509IssuerProvision#getSerialNumber()
	 * @see #getX509IssuerProvision()
	 * @generated
	 */
	EAttribute getX509IssuerProvision_SerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.cert.X509IssuerProvision#getStateProvince <em>State Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Province</em>'.
	 * @see org.abchip.mimo.biz.security.cert.X509IssuerProvision#getStateProvince()
	 * @see #getX509IssuerProvision()
	 * @generated
	 */
	EAttribute getX509IssuerProvision_StateProvince();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CertFactory getCertFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl <em>X509 Issuer Provision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.security.cert.impl.X509IssuerProvisionImpl
		 * @see org.abchip.mimo.biz.security.cert.impl.CertPackageImpl#getX509IssuerProvision()
		 * @generated
		 */
		EClass X509_ISSUER_PROVISION = eINSTANCE.getX509IssuerProvision();

		/**
		 * The meta object literal for the '<em><b>Cert Provision Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_PROVISION__CERT_PROVISION_ID = eINSTANCE.getX509IssuerProvision_CertProvisionId();

		/**
		 * The meta object literal for the '<em><b>City Locality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_PROVISION__CITY_LOCALITY = eINSTANCE.getX509IssuerProvision_CityLocality();

		/**
		 * The meta object literal for the '<em><b>Common Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_PROVISION__COMMON_NAME = eINSTANCE.getX509IssuerProvision_CommonName();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_PROVISION__COUNTRY = eINSTANCE.getX509IssuerProvision_Country();

		/**
		 * The meta object literal for the '<em><b>Organization Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_PROVISION__ORGANIZATION_NAME = eINSTANCE.getX509IssuerProvision_OrganizationName();

		/**
		 * The meta object literal for the '<em><b>Organizational Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_PROVISION__ORGANIZATIONAL_UNIT = eINSTANCE.getX509IssuerProvision_OrganizationalUnit();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_PROVISION__SERIAL_NUMBER = eINSTANCE.getX509IssuerProvision_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>State Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X509_ISSUER_PROVISION__STATE_PROVINCE = eINSTANCE.getX509IssuerProvision_StateProvince();

	}

} //CertPackage
