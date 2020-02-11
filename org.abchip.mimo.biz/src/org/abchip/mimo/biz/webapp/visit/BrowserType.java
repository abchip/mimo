/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browser Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserTypeId <em>Browser Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserName <em>Browser Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserVersion <em>Browser Version</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getBrowserType()
 * @model
 * @generated
 */
public interface BrowserType extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Browser Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Browser Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser Type Id</em>' attribute.
	 * @see #setBrowserTypeId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getBrowserType_BrowserTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBrowserTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserTypeId <em>Browser Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browser Type Id</em>' attribute.
	 * @see #getBrowserTypeId()
	 * @generated
	 */
	void setBrowserTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Browser Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Browser Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser Name</em>' attribute.
	 * @see #setBrowserName(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getBrowserType_BrowserName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getBrowserName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserName <em>Browser Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browser Name</em>' attribute.
	 * @see #getBrowserName()
	 * @generated
	 */
	void setBrowserName(String value);

	/**
	 * Returns the value of the '<em><b>Browser Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Browser Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser Version</em>' attribute.
	 * @see #setBrowserVersion(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getBrowserType_BrowserVersion()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getBrowserVersion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.BrowserType#getBrowserVersion <em>Browser Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browser Version</em>' attribute.
	 * @see #getBrowserVersion()
	 * @generated
	 */
	void setBrowserVersion(String value);

} // BrowserType
