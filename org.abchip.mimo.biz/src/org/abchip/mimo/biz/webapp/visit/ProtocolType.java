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
 * A representation of the model object '<em><b>Protocol Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ProtocolType#getProtocolTypeId <em>Protocol Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ProtocolType#getProtocolName <em>Protocol Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getProtocolType()
 * @model
 * @generated
 */
public interface ProtocolType extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Protocol Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Type Id</em>' attribute.
	 * @see #setProtocolTypeId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getProtocolType_ProtocolTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProtocolTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ProtocolType#getProtocolTypeId <em>Protocol Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Type Id</em>' attribute.
	 * @see #getProtocolTypeId()
	 * @generated
	 */
	void setProtocolTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Protocol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Name</em>' attribute.
	 * @see #setProtocolName(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getProtocolType_ProtocolName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getProtocolName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ProtocolType#getProtocolName <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Name</em>' attribute.
	 * @see #getProtocolName()
	 * @generated
	 */
	void setProtocolName(String value);

} // ProtocolType
