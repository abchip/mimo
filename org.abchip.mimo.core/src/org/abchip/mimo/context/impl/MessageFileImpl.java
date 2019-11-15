/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context.impl;

import java.util.List;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.MessageDescription;
import org.abchip.mimo.context.MessageFile;
import org.abchip.mimo.entity.impl.EntityNameableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.MessageFileImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.MessageFileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.MessageFileImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageFileImpl extends EntityNameableImpl implements MessageFile {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.MESSAGE_FILE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MessageDescription> getMessages() {
		return (List<MessageDescription>)eGet(ContextPackage.Literals.MESSAGE_FILE__MESSAGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eGet(ContextPackage.Literals.MESSAGE_FILE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(ContextPackage.Literals.MESSAGE_FILE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public <E extends Enum<E>> MessageDescription lookup(Enum<E> name) {
		return lookup(name.name());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public <E extends Enum<E>> MessageDescription lookup(String name) {

		for (MessageDescription messageDescription : getMessages())
			if (messageDescription.getName().equals(name))
				return messageDescription;

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eGet(ContextPackage.Literals.MESSAGE_FILE__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eSet(ContextPackage.Literals.MESSAGE_FILE__TEXT, newText);
	}
} // MessageFileImpl
