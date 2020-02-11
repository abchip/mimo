/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.status.impl;

import java.util.List;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.status.StatusPackage;
import org.abchip.mimo.biz.common.status.StatusType;
import org.abchip.mimo.biz.common.status.StatusValidChange;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.shipment.shipment.ShipmentStatus;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl#getMainStatusValidChanges <em>Main Status Valid Changes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl#getShipmentStatuss <em>Shipment Statuss</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl#getStatusTypeId <em>Status Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusItemImpl extends BizEntityTypedImpl<StatusType> implements StatusItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatusPackage.Literals.STATUS_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(StatusPackage.Literals.STATUS_ITEM__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(StatusPackage.Literals.STATUS_ITEM__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<StatusValidChange> getMainStatusValidChanges() {
		return (List<StatusValidChange>)eGet(StatusPackage.Literals.STATUS_ITEM__MAIN_STATUS_VALID_CHANGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequenceId() {
		return (String)eGet(StatusPackage.Literals.STATUS_ITEM__SEQUENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceId(String newSequenceId) {
		eSet(StatusPackage.Literals.STATUS_ITEM__SEQUENCE_ID, newSequenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ShipmentStatus> getShipmentStatuss() {
		return (List<ShipmentStatus>)eGet(StatusPackage.Literals.STATUS_ITEM__SHIPMENT_STATUSS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusCode() {
		return (String)eGet(StatusPackage.Literals.STATUS_ITEM__STATUS_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusCode(String newStatusCode) {
		eSet(StatusPackage.Literals.STATUS_ITEM__STATUS_CODE, newStatusCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusType getStatusTypeId() {
		return (StatusType)eGet(StatusPackage.Literals.STATUS_ITEM__STATUS_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusTypeId(StatusType newStatusTypeId) {
		eSet(StatusPackage.Literals.STATUS_ITEM__STATUS_TYPE_ID, newStatusTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return (String)eGet(StatusPackage.Literals.STATUS_ITEM__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		eSet(StatusPackage.Literals.STATUS_ITEM__STATUS_ID, newStatusId);
	}

} //StatusItemImpl
