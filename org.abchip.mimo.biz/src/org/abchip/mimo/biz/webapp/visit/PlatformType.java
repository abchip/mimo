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
 * A representation of the model object '<em><b>Platform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformTypeId <em>Platform Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformName <em>Platform Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformVersion <em>Platform Version</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getPlatformType()
 * @model
 * @generated
 */
public interface PlatformType extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Platform Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Type Id</em>' attribute.
	 * @see #setPlatformTypeId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getPlatformType_PlatformTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPlatformTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformTypeId <em>Platform Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Type Id</em>' attribute.
	 * @see #getPlatformTypeId()
	 * @generated
	 */
	void setPlatformTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Name</em>' attribute.
	 * @see #setPlatformName(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getPlatformType_PlatformName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getPlatformName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformName <em>Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Name</em>' attribute.
	 * @see #getPlatformName()
	 * @generated
	 */
	void setPlatformName(String value);

	/**
	 * Returns the value of the '<em><b>Platform Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Version</em>' attribute.
	 * @see #setPlatformVersion(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getPlatformType_PlatformVersion()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getPlatformVersion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.PlatformType#getPlatformVersion <em>Platform Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Version</em>' attribute.
	 * @see #getPlatformVersion()
	 * @generated
	 */
	void setPlatformVersion(String value);

} // PlatformType
