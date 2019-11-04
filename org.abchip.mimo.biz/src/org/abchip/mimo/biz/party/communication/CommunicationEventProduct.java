/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Event Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventProduct#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventProduct#getCommunicationEventId <em>Communication Event Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventProduct()
 * @model
 * @generated
 */
public interface CommunicationEventProduct extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventProduct_ProductId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEventProduct#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Id</em>' reference.
	 * @see #setCommunicationEventId(CommunicationEvent)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventProduct_CommunicationEventId()
	 * @model keys="communicationEventId"
	 * @generated
	 */
	CommunicationEvent getCommunicationEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEventProduct#getCommunicationEventId <em>Communication Event Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Id</em>' reference.
	 * @see #getCommunicationEventId()
	 * @generated
	 */
	void setCommunicationEventId(CommunicationEvent value);

} // CommunicationEventProduct
