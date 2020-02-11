/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit.impl;

import org.abchip.mimo.biz.webapp.visit.*;
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
public class VisitFactoryImpl extends EFactoryImpl implements VisitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisitFactory init() {
		try {
			VisitFactory theVisitFactory = (VisitFactory)EPackage.Registry.INSTANCE.getEFactory(VisitPackage.eNS_URI);
			if (theVisitFactory != null) {
				return theVisitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisitFactoryImpl() {
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
			case VisitPackage.BROWSER_TYPE: return (EObject)createBrowserType();
			case VisitPackage.PLATFORM_TYPE: return (EObject)createPlatformType();
			case VisitPackage.PROTOCOL_TYPE: return (EObject)createProtocolType();
			case VisitPackage.SERVER_HIT: return (EObject)createServerHit();
			case VisitPackage.SERVER_HIT_BIN: return (EObject)createServerHitBin();
			case VisitPackage.SERVER_HIT_TYPE: return (EObject)createServerHitType();
			case VisitPackage.USER_AGENT: return (EObject)createUserAgent();
			case VisitPackage.USER_AGENT_METHOD_TYPE: return (EObject)createUserAgentMethodType();
			case VisitPackage.USER_AGENT_TYPE: return (EObject)createUserAgentType();
			case VisitPackage.VISIT: return (EObject)createVisit();
			case VisitPackage.VISITOR: return (EObject)createVisitor();
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
	public BrowserType createBrowserType() {
		BrowserTypeImpl browserType = new BrowserTypeImpl();
		return browserType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformType createPlatformType() {
		PlatformTypeImpl platformType = new PlatformTypeImpl();
		return platformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtocolType createProtocolType() {
		ProtocolTypeImpl protocolType = new ProtocolTypeImpl();
		return protocolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerHit createServerHit() {
		ServerHitImpl serverHit = new ServerHitImpl();
		return serverHit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerHitBin createServerHitBin() {
		ServerHitBinImpl serverHitBin = new ServerHitBinImpl();
		return serverHitBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerHitType createServerHitType() {
		ServerHitTypeImpl serverHitType = new ServerHitTypeImpl();
		return serverHitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAgent createUserAgent() {
		UserAgentImpl userAgent = new UserAgentImpl();
		return userAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAgentMethodType createUserAgentMethodType() {
		UserAgentMethodTypeImpl userAgentMethodType = new UserAgentMethodTypeImpl();
		return userAgentMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAgentType createUserAgentType() {
		UserAgentTypeImpl userAgentType = new UserAgentTypeImpl();
		return userAgentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visit createVisit() {
		VisitImpl visit = new VisitImpl();
		return visit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visitor createVisitor() {
		VisitorImpl visitor = new VisitorImpl();
		return visitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisitPackage getVisitPackage() {
		return (VisitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisitPackage getPackage() {
		return VisitPackage.eINSTANCE;
	}

} //VisitFactoryImpl
