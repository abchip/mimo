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
import org.abchip.mimo.context.MessageDataField;
import org.abchip.mimo.context.MessageDescription;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.MessageDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.MessageDescriptionImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.MessageDescriptionImpl#getMessageHelp <em>Message Help</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.MessageDescriptionImpl#getMessageText <em>Message Text</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.MessageDescriptionImpl#getMessageDataFields <em>Message Data Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDescriptionImpl extends EntityImpl implements MessageDescription {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.MESSAGE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eGet(ContextPackage.Literals.MESSAGE_DESCRIPTION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(ContextPackage.Literals.MESSAGE_DESCRIPTION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSeverity() {
		return (Integer)eGet(ContextPackage.Literals.MESSAGE_DESCRIPTION__SEVERITY, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(int newSeverity) {
		eSet(ContextPackage.Literals.MESSAGE_DESCRIPTION__SEVERITY, newSeverity);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageHelp() {
		return (String)eGet(ContextPackage.Literals.MESSAGE_DESCRIPTION__MESSAGE_HELP, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageHelp(String newMessageHelp) {
		eSet(ContextPackage.Literals.MESSAGE_DESCRIPTION__MESSAGE_HELP, newMessageHelp);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageText() {
		return (String)eGet(ContextPackage.Literals.MESSAGE_DESCRIPTION__MESSAGE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageText(String newMessageText) {
		eSet(ContextPackage.Literals.MESSAGE_DESCRIPTION__MESSAGE_TEXT, newMessageText);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MessageDataField<?>> getMessageDataFields() {
		return (List<MessageDataField<?>>)eGet(ContextPackage.Literals.MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // MessageDescriptionImpl
