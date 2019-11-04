/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.promo.ProductPromoCodeParty;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Code Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodePartyImpl#getProductPromoCodeId <em>Product Promo Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCodePartyImpl#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPromoCodePartyImpl extends BizEntityImpl implements ProductPromoCodeParty {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductPromoCodeId() <em>Product Promo Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_CODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoCodeId() <em>Product Promo Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoCodeId = PRODUCT_PROMO_CODE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPromoCodePartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromoPackage.Literals.PRODUCT_PROMO_CODE_PARTY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_CODE_PARTY__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_CODE_PARTY__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoCodeId() {
		return productPromoCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCodeId(String newProductPromoCodeId) {
		String oldProductPromoCodeId = productPromoCodeId;
		productPromoCodeId = newProductPromoCodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_CODE_PARTY__PRODUCT_PROMO_CODE_ID, oldProductPromoCodeId, productPromoCodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromoPackage.PRODUCT_PROMO_CODE_PARTY__PRODUCT_PROMO_CODE_ID:
				return getProductPromoCodeId();
			case PromoPackage.PRODUCT_PROMO_CODE_PARTY__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
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
			case PromoPackage.PRODUCT_PROMO_CODE_PARTY__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE_PARTY__PARTY_ID:
				setPartyId((Party)newValue);
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
			case PromoPackage.PRODUCT_PROMO_CODE_PARTY__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId(PRODUCT_PROMO_CODE_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_CODE_PARTY__PARTY_ID:
				setPartyId((Party)null);
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
			case PromoPackage.PRODUCT_PROMO_CODE_PARTY__PRODUCT_PROMO_CODE_ID:
				return PRODUCT_PROMO_CODE_ID_EDEFAULT == null ? productPromoCodeId != null : !PRODUCT_PROMO_CODE_ID_EDEFAULT.equals(productPromoCodeId);
			case PromoPackage.PRODUCT_PROMO_CODE_PARTY__PARTY_ID:
				return partyId != null;
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
		result.append(" (productPromoCodeId: ");
		result.append(productPromoCodeId);
		result.append(')');
		return result.toString();
	}

} //ProductPromoCodePartyImpl
