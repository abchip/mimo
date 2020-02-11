/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication.impl;

import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp;
import org.abchip.mimo.biz.party.communication.CommunicationEventPurpose;
import org.abchip.mimo.biz.party.communication.CommunicationPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Event Prp Typ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#getCommunicationEventPurposes <em>Communication Event Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationEventPrpTypImpl extends BizEntityTypeImpl<CommunicationEventPurpose> implements CommunicationEventPrpTyp {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationEventPrpTypImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventPrpTyp getParentTypeId() {
		return (CommunicationEventPrpTyp)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(CommunicationEventPrpTyp newParentTypeId) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventPrpTypId() {
		return (String)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventPrpTypId(String newCommunicationEventPrpTypId) {
		eSet(CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID, newCommunicationEventPrpTypId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CommunicationEventPurpose> getCommunicationEventPurposes() {
		return (List<CommunicationEventPurpose>)eGet(CommunicationPackage.Literals.COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES, true);
	}

} //CommunicationEventPrpTypImpl
