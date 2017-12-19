/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.context;

import java.util.List;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Textable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message File</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.MessageFile#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.abchip.mimo.context.MessageFile#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.context.MessageFile#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getMessageFile()
 * @model
 * @generated
 */
public interface MessageFile extends EntityNameable, Textable {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.context.MessageDescription}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see org.abchip.mimo.context.ContextPackage#getMessageFile_Messages()
	 * @model containment="true"
	 * @generated
	 */
	List<MessageDescription> getMessages();

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
	 * @see org.abchip.mimo.context.ContextPackage#getMessageFile_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.MessageFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.abchip.mimo.context.ContextPackage#getMessageFile_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.MessageFile#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameType="org.abchip.mimo.util.JavaEnum" nameRequired="true" EBounds="org.abchip.mimo.util.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> MessageDescription lookup(Enum<E> name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" nameRequired="true" EBounds="org.abchip.mimo.util.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> MessageDescription lookup(String name);

} // MessageFile
