/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.order.request.RequestPackage
 * @generated
 */
public interface RequestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequestFactory eINSTANCE = org.abchip.mimo.biz.order.request.impl.RequestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cust Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request</em>'.
	 * @generated
	 */
	CustRequest createCustRequest();

	/**
	 * Returns a new object of class '<em>Cust Request Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Attribute</em>'.
	 * @generated
	 */
	CustRequestAttribute createCustRequestAttribute();

	/**
	 * Returns a new object of class '<em>Cust Request Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Category</em>'.
	 * @generated
	 */
	CustRequestCategory createCustRequestCategory();

	/**
	 * Returns a new object of class '<em>Cust Request Comm Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Comm Event</em>'.
	 * @generated
	 */
	CustRequestCommEvent createCustRequestCommEvent();

	/**
	 * Returns a new object of class '<em>Cust Request Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Content</em>'.
	 * @generated
	 */
	CustRequestContent createCustRequestContent();

	/**
	 * Returns a new object of class '<em>Cust Request Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Item</em>'.
	 * @generated
	 */
	CustRequestItem createCustRequestItem();

	/**
	 * Returns a new object of class '<em>Cust Request Item Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Item Note</em>'.
	 * @generated
	 */
	CustRequestItemNote createCustRequestItemNote();

	/**
	 * Returns a new object of class '<em>Cust Request Item Work Effort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Item Work Effort</em>'.
	 * @generated
	 */
	CustRequestItemWorkEffort createCustRequestItemWorkEffort();

	/**
	 * Returns a new object of class '<em>Cust Request Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Note</em>'.
	 * @generated
	 */
	CustRequestNote createCustRequestNote();

	/**
	 * Returns a new object of class '<em>Cust Request Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Party</em>'.
	 * @generated
	 */
	CustRequestParty createCustRequestParty();

	/**
	 * Returns a new object of class '<em>Cust Request Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Resolution</em>'.
	 * @generated
	 */
	CustRequestResolution createCustRequestResolution();

	/**
	 * Returns a new object of class '<em>Cust Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Status</em>'.
	 * @generated
	 */
	CustRequestStatus createCustRequestStatus();

	/**
	 * Returns a new object of class '<em>Cust Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Type</em>'.
	 * @generated
	 */
	CustRequestType createCustRequestType();

	/**
	 * Returns a new object of class '<em>Cust Request Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Type Attr</em>'.
	 * @generated
	 */
	CustRequestTypeAttr createCustRequestTypeAttr();

	/**
	 * Returns a new object of class '<em>Cust Request Work Effort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request Work Effort</em>'.
	 * @generated
	 */
	CustRequestWorkEffort createCustRequestWorkEffort();

	/**
	 * Returns a new object of class '<em>Responding Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responding Party</em>'.
	 * @generated
	 */
	RespondingParty createRespondingParty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequestPackage getRequestPackage();

} //RequestFactory
