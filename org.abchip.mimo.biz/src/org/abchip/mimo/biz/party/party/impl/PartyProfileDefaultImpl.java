/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Profile Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getDefaultBillAddr <em>Default Bill Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getDefaultPayMeth <em>Default Pay Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getDefaultShipAddr <em>Default Ship Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl#getDefaultShipMeth <em>Default Ship Meth</em>}</li>
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
		return (String)eGet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultBillAddr(String newDefaultBillAddr) {
		eSet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR, newDefaultBillAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultPayMeth() {
		return (String)eGet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPayMeth(String newDefaultPayMeth) {
		eSet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH, newDefaultPayMeth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultShipAddr() {
		return (String)eGet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultShipAddr(String newDefaultShipAddr) {
		eSet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR, newDefaultShipAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultShipMeth() {
		return (String)eGet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultShipMeth(String newDefaultShipMeth) {
		eSet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH, newDefaultShipMeth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		return (ProductStore)eGet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(PartyPackage.Literals.PARTY_PROFILE_DEFAULT__PARTY_ID, newPartyId);
	}

} //PartyProfileDefaultImpl
