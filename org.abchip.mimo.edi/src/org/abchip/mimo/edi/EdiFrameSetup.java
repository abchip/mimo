/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi;

import org.abchip.mimo.entity.EntityNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edi Frame Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.EdiFrameSetup#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.EdiFrameSetup#getEntityCondition <em>Entity Condition</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.EdiFrameSetup#getEntityEvent <em>Entity Event</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.edi.EDIPackage#getEdiFrameSetup()
 * @model
 * @generated
 */
public interface EdiFrameSetup extends EntityNameable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.edi.EDIPackage#getEdiFrameSetup_Name()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent frame='frame'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.EdiFrameSetup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entity Condition</b></em>' attribute.
	 * The default value is <code>"Selected"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.edi.EntityCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Condition</em>' attribute.
	 * @see org.abchip.mimo.edi.EntityCondition
	 * @see #setEntityCondition(EntityCondition)
	 * @see org.abchip.mimo.edi.EDIPackage#getEdiFrameSetup_EntityCondition()
	 * @model default="Selected" required="true"
	 * @generated
	 */
	EntityCondition getEntityCondition();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.EdiFrameSetup#getEntityCondition <em>Entity Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Condition</em>' attribute.
	 * @see org.abchip.mimo.edi.EntityCondition
	 * @see #getEntityCondition()
	 * @generated
	 */
	void setEntityCondition(EntityCondition value);

	/**
	 * Returns the value of the '<em><b>Entity Event</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.edi.EntityEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Event</em>' attribute.
	 * @see org.abchip.mimo.edi.EntityEvent
	 * @see #setEntityEvent(EntityEvent)
	 * @see org.abchip.mimo.edi.EDIPackage#getEdiFrameSetup_EntityEvent()
	 * @model required="true"
	 * @generated
	 */
	EntityEvent getEntityEvent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.EdiFrameSetup#getEntityEvent <em>Entity Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Event</em>' attribute.
	 * @see org.abchip.mimo.edi.EntityEvent
	 * @see #getEntityEvent()
	 * @generated
	 */
	void setEntityEvent(EntityEvent value);

} // EdiFrameSetup
