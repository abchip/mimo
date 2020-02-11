/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context;

import java.util.List;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.MessageDescription#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.context.MessageDescription#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.abchip.mimo.context.MessageDescription#getMessageHelp <em>Message Help</em>}</li>
 *   <li>{@link org.abchip.mimo.context.MessageDescription#getMessageText <em>Message Text</em>}</li>
 *   <li>{@link org.abchip.mimo.context.MessageDescription#getMessageDataFields <em>Message Data Fields</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getMessageDescription()
 * @model
 * @generated
 */
public interface MessageDescription extends Entity {
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
	 * @see org.abchip.mimo.context.ContextPackage#getMessageDescription_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.MessageDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(int)
	 * @see org.abchip.mimo.context.ContextPackage#getMessageDescription_Severity()
	 * @model
	 * @generated
	 */
	int getSeverity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.MessageDescription#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(int value);

	/**
	 * Returns the value of the '<em><b>Message Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Help</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Help</em>' attribute.
	 * @see #setMessageHelp(String)
	 * @see org.abchip.mimo.context.ContextPackage#getMessageDescription_MessageHelp()
	 * @model
	 * @generated
	 */
	String getMessageHelp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.MessageDescription#getMessageHelp <em>Message Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Help</em>' attribute.
	 * @see #getMessageHelp()
	 * @generated
	 */
	void setMessageHelp(String value);

	/**
	 * Returns the value of the '<em><b>Message Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Text</em>' attribute.
	 * @see #setMessageText(String)
	 * @see org.abchip.mimo.context.ContextPackage#getMessageDescription_MessageText()
	 * @model
	 * @generated
	 */
	String getMessageText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.MessageDescription#getMessageText <em>Message Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Text</em>' attribute.
	 * @see #getMessageText()
	 * @generated
	 */
	void setMessageText(String value);

	/**
	 * Returns the value of the '<em><b>Message Data Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.context.MessageDataField}<code>&lt;?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Data Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Data Fields</em>' containment reference list.
	 * @see org.abchip.mimo.context.ContextPackage#getMessageDescription_MessageDataFields()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<MessageDataField<?>> getMessageDataFields();

} // MessageDescription
