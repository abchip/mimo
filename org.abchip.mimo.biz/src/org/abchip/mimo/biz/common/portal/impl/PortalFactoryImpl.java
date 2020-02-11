/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal.impl;

import org.abchip.mimo.biz.common.portal.*;
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
public class PortalFactoryImpl extends EFactoryImpl implements PortalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortalFactory init() {
		try {
			PortalFactory thePortalFactory = (PortalFactory)EPackage.Registry.INSTANCE.getEFactory(PortalPackage.eNS_URI);
			if (thePortalFactory != null) {
				return thePortalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PortalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortalFactoryImpl() {
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
			case PortalPackage.PORTAL_PAGE: return (EObject)createPortalPage();
			case PortalPackage.PORTAL_PAGE_COLUMN: return (EObject)createPortalPageColumn();
			case PortalPackage.PORTAL_PAGE_PORTLET: return (EObject)createPortalPagePortlet();
			case PortalPackage.PORTAL_PORTLET: return (EObject)createPortalPortlet();
			case PortalPackage.PORTLET_ATTRIBUTE: return (EObject)createPortletAttribute();
			case PortalPackage.PORTLET_CATEGORY: return (EObject)createPortletCategory();
			case PortalPackage.PORTLET_PORTLET_CATEGORY: return (EObject)createPortletPortletCategory();
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
	public PortalPage createPortalPage() {
		PortalPageImpl portalPage = new PortalPageImpl();
		return portalPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPageColumn createPortalPageColumn() {
		PortalPageColumnImpl portalPageColumn = new PortalPageColumnImpl();
		return portalPageColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPagePortlet createPortalPagePortlet() {
		PortalPagePortletImpl portalPagePortlet = new PortalPagePortletImpl();
		return portalPagePortlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPortlet createPortalPortlet() {
		PortalPortletImpl portalPortlet = new PortalPortletImpl();
		return portalPortlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortletAttribute createPortletAttribute() {
		PortletAttributeImpl portletAttribute = new PortletAttributeImpl();
		return portletAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortletCategory createPortletCategory() {
		PortletCategoryImpl portletCategory = new PortletCategoryImpl();
		return portletCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortletPortletCategory createPortletPortletCategory() {
		PortletPortletCategoryImpl portletPortletCategory = new PortletPortletCategoryImpl();
		return portletPortletCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPackage getPortalPackage() {
		return (PortalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PortalPackage getPackage() {
		return PortalPackage.eINSTANCE;
	}

} //PortalFactoryImpl
