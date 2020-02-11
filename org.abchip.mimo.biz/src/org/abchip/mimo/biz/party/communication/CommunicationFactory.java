/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage
 * @generated
 */
public interface CommunicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationFactory eINSTANCE = org.abchip.mimo.biz.party.communication.impl.CommunicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Comm Content Assoc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Content Assoc Type</em>'.
	 * @generated
	 */
	CommContentAssocType createCommContentAssocType();

	/**
	 * Returns a new object of class '<em>Comm Event Content Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Event Content Assoc</em>'.
	 * @generated
	 */
	CommEventContentAssoc createCommEventContentAssoc();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	CommunicationEvent createCommunicationEvent();

	/**
	 * Returns a new object of class '<em>Event Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Product</em>'.
	 * @generated
	 */
	CommunicationEventProduct createCommunicationEventProduct();

	/**
	 * Returns a new object of class '<em>Event Prp Typ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Prp Typ</em>'.
	 * @generated
	 */
	CommunicationEventPrpTyp createCommunicationEventPrpTyp();

	/**
	 * Returns a new object of class '<em>Event Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Purpose</em>'.
	 * @generated
	 */
	CommunicationEventPurpose createCommunicationEventPurpose();

	/**
	 * Returns a new object of class '<em>Event Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Role</em>'.
	 * @generated
	 */
	CommunicationEventRole createCommunicationEventRole();

	/**
	 * Returns a new object of class '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Type</em>'.
	 * @generated
	 */
	CommunicationEventType createCommunicationEventType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationPackage getCommunicationPackage();

} //CommunicationFactory
