/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.tracking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage
 * @generated
 */
public interface TrackingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrackingFactory eINSTANCE = org.abchip.mimo.biz.marketing.tracking.impl.TrackingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code</em>'.
	 * @generated
	 */
	TrackingCode createTrackingCode();

	/**
	 * Returns a new object of class '<em>Code Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Order</em>'.
	 * @generated
	 */
	TrackingCodeOrder createTrackingCodeOrder();

	/**
	 * Returns a new object of class '<em>Code Order Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Order Return</em>'.
	 * @generated
	 */
	TrackingCodeOrderReturn createTrackingCodeOrderReturn();

	/**
	 * Returns a new object of class '<em>Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Type</em>'.
	 * @generated
	 */
	TrackingCodeType createTrackingCodeType();

	/**
	 * Returns a new object of class '<em>Code Visit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Visit</em>'.
	 * @generated
	 */
	TrackingCodeVisit createTrackingCodeVisit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TrackingPackage getTrackingPackage();

} //TrackingFactory
