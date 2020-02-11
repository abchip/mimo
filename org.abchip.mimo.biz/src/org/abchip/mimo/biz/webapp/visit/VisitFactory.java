/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage
 * @generated
 */
public interface VisitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisitFactory eINSTANCE = org.abchip.mimo.biz.webapp.visit.impl.VisitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Browser Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Browser Type</em>'.
	 * @generated
	 */
	BrowserType createBrowserType();

	/**
	 * Returns a new object of class '<em>Platform Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Type</em>'.
	 * @generated
	 */
	PlatformType createPlatformType();

	/**
	 * Returns a new object of class '<em>Protocol Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Type</em>'.
	 * @generated
	 */
	ProtocolType createProtocolType();

	/**
	 * Returns a new object of class '<em>Server Hit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Hit</em>'.
	 * @generated
	 */
	ServerHit createServerHit();

	/**
	 * Returns a new object of class '<em>Server Hit Bin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Hit Bin</em>'.
	 * @generated
	 */
	ServerHitBin createServerHitBin();

	/**
	 * Returns a new object of class '<em>Server Hit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Hit Type</em>'.
	 * @generated
	 */
	ServerHitType createServerHitType();

	/**
	 * Returns a new object of class '<em>User Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Agent</em>'.
	 * @generated
	 */
	UserAgent createUserAgent();

	/**
	 * Returns a new object of class '<em>User Agent Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Agent Method Type</em>'.
	 * @generated
	 */
	UserAgentMethodType createUserAgentMethodType();

	/**
	 * Returns a new object of class '<em>User Agent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Agent Type</em>'.
	 * @generated
	 */
	UserAgentType createUserAgentType();

	/**
	 * Returns a new object of class '<em>Visit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visit</em>'.
	 * @generated
	 */
	Visit createVisit();

	/**
	 * Returns a new object of class '<em>Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visitor</em>'.
	 * @generated
	 */
	Visitor createVisitor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VisitPackage getVisitPackage();

} //VisitFactory
