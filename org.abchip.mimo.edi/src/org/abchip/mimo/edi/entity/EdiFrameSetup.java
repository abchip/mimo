/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.entity;

import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edi Frame Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getEntityCondition <em>Entity Condition</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getEntityEvent <em>Entity Event</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.entity.EdiFrameSetup#isEncrypt <em>Encrypt</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.edi.entity.EntityPackage#getEdiFrameSetup()
 * @model
 * @generated
 */
public interface EdiFrameSetup extends EntityIdentifiable {
	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see org.abchip.mimo.edi.entity.EntityPackage#getEdiFrameSetup_MessageType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='MessageType'"
	 * @generated
	 */
	String getMessageType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(String value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #setFrame(String)
	 * @see org.abchip.mimo.edi.entity.EntityPackage#getEdiFrameSetup_Frame()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Frame'"
	 * @generated
	 */
	String getFrame();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(String value);

	/**
	 * Returns the value of the '<em><b>Entity Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.edi.entity.EntityCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Condition</em>' attribute.
	 * @see org.abchip.mimo.edi.entity.EntityCondition
	 * @see #setEntityCondition(EntityCondition)
	 * @see org.abchip.mimo.edi.entity.EntityPackage#getEdiFrameSetup_EntityCondition()
	 * @model required="true"
	 * @generated
	 */
	EntityCondition getEntityCondition();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getEntityCondition <em>Entity Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Condition</em>' attribute.
	 * @see org.abchip.mimo.edi.entity.EntityCondition
	 * @see #getEntityCondition()
	 * @generated
	 */
	void setEntityCondition(EntityCondition value);

	/**
	 * Returns the value of the '<em><b>Entity Event</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.edi.entity.EntityEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Event</em>' attribute.
	 * @see org.abchip.mimo.edi.entity.EntityEvent
	 * @see #setEntityEvent(EntityEvent)
	 * @see org.abchip.mimo.edi.entity.EntityPackage#getEdiFrameSetup_EntityEvent()
	 * @model required="true"
	 * @generated
	 */
	EntityEvent getEntityEvent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#getEntityEvent <em>Entity Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Event</em>' attribute.
	 * @see org.abchip.mimo.edi.entity.EntityEvent
	 * @see #getEntityEvent()
	 * @generated
	 */
	void setEntityEvent(EntityEvent value);

	/**
	 * Returns the value of the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypt</em>' attribute.
	 * @see #setEncrypt(boolean)
	 * @see org.abchip.mimo.edi.entity.EntityPackage#getEdiFrameSetup_Encrypt()
	 * @model required="true"
	 * @generated
	 */
	boolean isEncrypt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.entity.EdiFrameSetup#isEncrypt <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt</em>' attribute.
	 * @see #isEncrypt()
	 * @generated
	 */
	void setEncrypt(boolean value);

} // EdiFrameSetup
