/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant.impl;

import org.abchip.mimo.biz.entity.tenant.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TenantFactoryImpl extends EFactoryImpl implements TenantFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TenantFactory init() {
		try {
			TenantFactory theTenantFactory = (TenantFactory)EPackage.Registry.INSTANCE.getEFactory(TenantPackage.eNS_URI);
			if (theTenantFactory != null) {
				return theTenantFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TenantFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TenantFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TenantPackage.COMPONENT: return (EObject)createComponent();
			case TenantPackage.TENANT: return (EObject)createTenant();
			case TenantPackage.TENANT_COMPONENT: return (EObject)createTenantComponent();
			case TenantPackage.TENANT_DATA_SOURCE: return (EObject)createTenantDataSource();
			case TenantPackage.TENANT_DOMAIN_NAME: return (EObject)createTenantDomainName();
			case TenantPackage.TENANT_KEY_ENCRYPTING_KEY: return (EObject)createTenantKeyEncryptingKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tenant createTenant() {
		TenantImpl tenant = new TenantImpl();
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TenantComponent createTenantComponent() {
		TenantComponentImpl tenantComponent = new TenantComponentImpl();
		return tenantComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TenantDataSource createTenantDataSource() {
		TenantDataSourceImpl tenantDataSource = new TenantDataSourceImpl();
		return tenantDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TenantDomainName createTenantDomainName() {
		TenantDomainNameImpl tenantDomainName = new TenantDomainNameImpl();
		return tenantDomainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TenantKeyEncryptingKey createTenantKeyEncryptingKey() {
		TenantKeyEncryptingKeyImpl tenantKeyEncryptingKey = new TenantKeyEncryptingKeyImpl();
		return tenantKeyEncryptingKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TenantPackage getTenantPackage() {
		return (TenantPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TenantPackage getPackage() {
		return TenantPackage.eINSTANCE;
	}

} //TenantFactoryImpl
