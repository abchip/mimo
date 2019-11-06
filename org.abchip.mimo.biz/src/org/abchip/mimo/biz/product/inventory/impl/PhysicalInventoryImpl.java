/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.PhysicalInventory;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.PhysicalInventoryImpl#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.PhysicalInventoryImpl#getGeneralComments <em>General Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.PhysicalInventoryImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.PhysicalInventoryImpl#getPhysicalInventoryDate <em>Physical Inventory Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalInventoryImpl extends BizEntityImpl implements PhysicalInventory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPhysicalInventoryId() <em>Physical Inventory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalInventoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_INVENTORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalInventoryId() <em>Physical Inventory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalInventoryId()
	 * @generated
	 * @ordered
	 */
	protected String physicalInventoryId = PHYSICAL_INVENTORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneralComments() <em>General Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralComments()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERAL_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneralComments() <em>General Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralComments()
	 * @generated
	 * @ordered
	 */
	protected String generalComments = GENERAL_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalInventoryDate() <em>Physical Inventory Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalInventoryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PHYSICAL_INVENTORY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalInventoryDate() <em>Physical Inventory Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalInventoryDate()
	 * @generated
	 * @ordered
	 */
	protected Date physicalInventoryDate = PHYSICAL_INVENTORY_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalInventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.PHYSICAL_INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneralComments() {
		return generalComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneralComments(String newGeneralComments) {
		generalComments = newGeneralComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPhysicalInventoryDate() {
		return physicalInventoryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventoryDate(Date newPhysicalInventoryDate) {
		physicalInventoryDate = newPhysicalInventoryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTranss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> inventoryItemDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> inventoryItemVariances() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicalInventoryId() {
		return physicalInventoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventoryId(String newPhysicalInventoryId) {
		physicalInventoryId = newPhysicalInventoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_ID:
				return getPhysicalInventoryId();
			case InventoryPackage.PHYSICAL_INVENTORY__GENERAL_COMMENTS:
				return getGeneralComments();
			case InventoryPackage.PHYSICAL_INVENTORY__PARTY_ID:
				return getPartyId();
			case InventoryPackage.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_DATE:
				return getPhysicalInventoryDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InventoryPackage.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId((String)newValue);
				return;
			case InventoryPackage.PHYSICAL_INVENTORY__GENERAL_COMMENTS:
				setGeneralComments((String)newValue);
				return;
			case InventoryPackage.PHYSICAL_INVENTORY__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case InventoryPackage.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_DATE:
				setPhysicalInventoryDate((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InventoryPackage.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId(PHYSICAL_INVENTORY_ID_EDEFAULT);
				return;
			case InventoryPackage.PHYSICAL_INVENTORY__GENERAL_COMMENTS:
				setGeneralComments(GENERAL_COMMENTS_EDEFAULT);
				return;
			case InventoryPackage.PHYSICAL_INVENTORY__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case InventoryPackage.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_DATE:
				setPhysicalInventoryDate(PHYSICAL_INVENTORY_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InventoryPackage.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_ID:
				return PHYSICAL_INVENTORY_ID_EDEFAULT == null ? physicalInventoryId != null : !PHYSICAL_INVENTORY_ID_EDEFAULT.equals(physicalInventoryId);
			case InventoryPackage.PHYSICAL_INVENTORY__GENERAL_COMMENTS:
				return GENERAL_COMMENTS_EDEFAULT == null ? generalComments != null : !GENERAL_COMMENTS_EDEFAULT.equals(generalComments);
			case InventoryPackage.PHYSICAL_INVENTORY__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case InventoryPackage.PHYSICAL_INVENTORY__PHYSICAL_INVENTORY_DATE:
				return PHYSICAL_INVENTORY_DATE_EDEFAULT == null ? physicalInventoryDate != null : !PHYSICAL_INVENTORY_DATE_EDEFAULT.equals(physicalInventoryDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (physicalInventoryId: ");
		result.append(physicalInventoryId);
		result.append(", generalComments: ");
		result.append(generalComments);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", physicalInventoryDate: ");
		result.append(physicalInventoryDate);
		result.append(')');
		return result.toString();
	}

} //PhysicalInventoryImpl
