/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.common.portal.PortalPackage
 * @generated
 */
public interface PortalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortalFactory eINSTANCE = org.abchip.mimo.biz.common.portal.impl.PortalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	PortalPage createPortalPage();

	/**
	 * Returns a new object of class '<em>Page Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Column</em>'.
	 * @generated
	 */
	PortalPageColumn createPortalPageColumn();

	/**
	 * Returns a new object of class '<em>Page Portlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Portlet</em>'.
	 * @generated
	 */
	PortalPagePortlet createPortalPagePortlet();

	/**
	 * Returns a new object of class '<em>Portlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portlet</em>'.
	 * @generated
	 */
	PortalPortlet createPortalPortlet();

	/**
	 * Returns a new object of class '<em>Portlet Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portlet Attribute</em>'.
	 * @generated
	 */
	PortletAttribute createPortletAttribute();

	/**
	 * Returns a new object of class '<em>Portlet Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portlet Category</em>'.
	 * @generated
	 */
	PortletCategory createPortletCategory();

	/**
	 * Returns a new object of class '<em>Portlet Portlet Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portlet Portlet Category</em>'.
	 * @generated
	 */
	PortletPortletCategory createPortletPortletCategory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PortalPackage getPortalPackage();

} //PortalFactory
