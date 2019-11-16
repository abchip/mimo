/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.PartyProfileDefault;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Profile Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getDefaultBillAddr <em>Default Bill Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getDefaultPayMeth <em>Default Pay Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getDefaultShipAddr <em>Default Ship Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getDefaultShipMeth <em>Default Ship Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getProductStoreId <em>Product Store Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyProfileDefaultImpl extends BizEntityImpl implements PartyProfileDefault {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getDefaultBillAddr() <em>Default Bill Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBillAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_BILL_ADDR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefaultBillAddr() <em>Default Bill Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBillAddr()
	 * @generated
	 * @ordered
	 */
	protected String defaultBillAddr = DEFAULT_BILL_ADDR_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultPayMeth() <em>Default Pay Meth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPayMeth()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PAY_METH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefaultPayMeth() <em>Default Pay Meth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPayMeth()
	 * @generated
	 * @ordered
	 */
	protected String defaultPayMeth = DEFAULT_PAY_METH_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultShipAddr() <em>Default Ship Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultShipAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SHIP_ADDR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefaultShipAddr() <em>Default Ship Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultShipAddr()
	 * @generated
	 * @ordered
	 */
	protected String defaultShipAddr = DEFAULT_SHIP_ADDR_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultShipMeth() <em>Default Ship Meth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultShipMeth()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SHIP_METH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefaultShipMeth() <em>Default Ship Meth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultShipMeth()
	 * @generated
	 * @ordered
	 */
	protected String defaultShipMeth = DEFAULT_SHIP_METH_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;
	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyProfileDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_PROFILE_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultBillAddr() {
		return defaultBillAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultBillAddr(String newDefaultBillAddr) {
		String oldDefaultBillAddr = defaultBillAddr;
		defaultBillAddr = newDefaultBillAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR, oldDefaultBillAddr, defaultBillAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultPayMeth() {
		return defaultPayMeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPayMeth(String newDefaultPayMeth) {
		String oldDefaultPayMeth = defaultPayMeth;
		defaultPayMeth = newDefaultPayMeth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH, oldDefaultPayMeth, defaultPayMeth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultShipAddr() {
		return defaultShipAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultShipAddr(String newDefaultShipAddr) {
		String oldDefaultShipAddr = defaultShipAddr;
		defaultShipAddr = newDefaultShipAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR, oldDefaultShipAddr, defaultShipAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultShipMeth() {
		return defaultShipMeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultShipMeth(String newDefaultShipMeth) {
		String oldDefaultShipMeth = defaultShipMeth;
		defaultShipMeth = newDefaultShipMeth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH, oldDefaultShipMeth, defaultShipMeth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_PROFILE_DEFAULT__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_PROFILE_DEFAULT__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR:
				return getDefaultBillAddr();
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH:
				return getDefaultPayMeth();
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR:
				return getDefaultShipAddr();
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH:
				return getDefaultShipMeth();
			case PartyPackage.PARTY_PROFILE_DEFAULT__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case PartyPackage.PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
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
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR:
				setDefaultBillAddr((String)newValue);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH:
				setDefaultPayMeth((String)newValue);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR:
				setDefaultShipAddr((String)newValue);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH:
				setDefaultShipMeth((String)newValue);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
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
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR:
				setDefaultBillAddr(DEFAULT_BILL_ADDR_EDEFAULT);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH:
				setDefaultPayMeth(DEFAULT_PAY_METH_EDEFAULT);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR:
				setDefaultShipAddr(DEFAULT_SHIP_ADDR_EDEFAULT);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH:
				setDefaultShipMeth(DEFAULT_SHIP_METH_EDEFAULT);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__PARTY_ID:
				setPartyId((Party)null);
				return;
			case PartyPackage.PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
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
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR:
				return DEFAULT_BILL_ADDR_EDEFAULT == null ? defaultBillAddr != null : !DEFAULT_BILL_ADDR_EDEFAULT.equals(defaultBillAddr);
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH:
				return DEFAULT_PAY_METH_EDEFAULT == null ? defaultPayMeth != null : !DEFAULT_PAY_METH_EDEFAULT.equals(defaultPayMeth);
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR:
				return DEFAULT_SHIP_ADDR_EDEFAULT == null ? defaultShipAddr != null : !DEFAULT_SHIP_ADDR_EDEFAULT.equals(defaultShipAddr);
			case PartyPackage.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH:
				return DEFAULT_SHIP_METH_EDEFAULT == null ? defaultShipMeth != null : !DEFAULT_SHIP_METH_EDEFAULT.equals(defaultShipMeth);
			case PartyPackage.PARTY_PROFILE_DEFAULT__PARTY_ID:
				return partyId != null;
			case PartyPackage.PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID:
				return productStoreId != null;
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
		result.append(" (defaultBillAddr: ");
		result.append(defaultBillAddr);
		result.append(", defaultPayMeth: ");
		result.append(defaultPayMeth);
		result.append(", defaultShipAddr: ");
		result.append(defaultShipAddr);
		result.append(", defaultShipMeth: ");
		result.append(defaultShipMeth);
		result.append(')');
		return result.toString();
	}

} //PartyProfileDefaultImpl
