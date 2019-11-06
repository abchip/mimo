/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.need.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.party.need.NeedPackage;
import org.abchip.mimo.biz.party.need.NeedType;
import org.abchip.mimo.biz.party.need.PartyNeed;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyType;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getPartyNeedId <em>Party Need Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getDatetimeRecorded <em>Datetime Recorded</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getNeedTypeId <em>Need Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getPartyTypeId <em>Party Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyNeedImpl extends BizEntityImpl implements PartyNeed {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPartyNeedId() <em>Party Need Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyNeedId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_NEED_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyNeedId() <em>Party Need Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyNeedId()
	 * @generated
	 * @ordered
	 */
	protected String partyNeedId = PARTY_NEED_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatetimeRecorded() <em>Datetime Recorded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeRecorded()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATETIME_RECORDED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatetimeRecorded() <em>Datetime Recorded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeRecorded()
	 * @generated
	 * @ordered
	 */
	protected Date datetimeRecorded = DATETIME_RECORDED_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getNeedTypeId() <em>Need Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedTypeId()
	 * @generated
	 * @ordered
	 */
	protected NeedType needTypeId;
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
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;
	/**
	 * The cached value of the '{@link #getPartyTypeId() <em>Party Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyTypeId()
	 * @generated
	 * @ordered
	 */
	protected PartyType partyTypeId;
	/**
	 * The cached value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected CommunicationEvent communicationEventId;
	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;
	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategoryId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyNeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeedPackage.Literals.PARTY_NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeRecorded() {
		return datetimeRecorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeRecorded(Date newDatetimeRecorded) {
		datetimeRecorded = newDatetimeRecorded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
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
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyNeedId() {
		return partyNeedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyNeedId(String newPartyNeedId) {
		partyNeedId = newPartyNeedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyType getPartyTypeId() {
		if (partyTypeId != null && ((EObject)partyTypeId).eIsProxy()) {
			InternalEObject oldPartyTypeId = (InternalEObject)partyTypeId;
			partyTypeId = (PartyType)eResolveProxy(oldPartyTypeId);
			if (partyTypeId != oldPartyTypeId) {
			}
		}
		return partyTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyType basicGetPartyTypeId() {
		return partyTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyTypeId(PartyType newPartyTypeId) {
		partyTypeId = newPartyTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		if (productCategoryId != null && ((EObject)productCategoryId).eIsProxy()) {
			InternalEObject oldProductCategoryId = (InternalEObject)productCategoryId;
			productCategoryId = (ProductCategory)eResolveProxy(oldProductCategoryId);
			if (productCategoryId != oldProductCategoryId) {
			}
		}
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		productCategoryId = newProductCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		productId = newProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		roleTypeId = newRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		visitId = newVisitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeedType getNeedTypeId() {
		if (needTypeId != null && ((EObject)needTypeId).eIsProxy()) {
			InternalEObject oldNeedTypeId = (InternalEObject)needTypeId;
			needTypeId = (NeedType)eResolveProxy(oldNeedTypeId);
			if (needTypeId != oldNeedTypeId) {
			}
		}
		return needTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeedType basicGetNeedTypeId() {
		return needTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedTypeId(NeedType newNeedTypeId) {
		needTypeId = newNeedTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEvent getCommunicationEventId() {
		if (communicationEventId != null && ((EObject)communicationEventId).eIsProxy()) {
			InternalEObject oldCommunicationEventId = (InternalEObject)communicationEventId;
			communicationEventId = (CommunicationEvent)eResolveProxy(oldCommunicationEventId);
			if (communicationEventId != oldCommunicationEventId) {
			}
		}
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationEvent basicGetCommunicationEventId() {
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(CommunicationEvent newCommunicationEventId) {
		communicationEventId = newCommunicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeedPackage.PARTY_NEED__PARTY_NEED_ID:
				return getPartyNeedId();
			case NeedPackage.PARTY_NEED__DATETIME_RECORDED:
				return getDatetimeRecorded();
			case NeedPackage.PARTY_NEED__DESCRIPTION:
				return getDescription();
			case NeedPackage.PARTY_NEED__VISIT_ID:
				return getVisitId();
			case NeedPackage.PARTY_NEED__NEED_TYPE_ID:
				if (resolve) return getNeedTypeId();
				return basicGetNeedTypeId();
			case NeedPackage.PARTY_NEED__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case NeedPackage.PARTY_NEED__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case NeedPackage.PARTY_NEED__PARTY_TYPE_ID:
				if (resolve) return getPartyTypeId();
				return basicGetPartyTypeId();
			case NeedPackage.PARTY_NEED__COMMUNICATION_EVENT_ID:
				if (resolve) return getCommunicationEventId();
				return basicGetCommunicationEventId();
			case NeedPackage.PARTY_NEED__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case NeedPackage.PARTY_NEED__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
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
			case NeedPackage.PARTY_NEED__PARTY_NEED_ID:
				setPartyNeedId((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__DATETIME_RECORDED:
				setDatetimeRecorded((Date)newValue);
				return;
			case NeedPackage.PARTY_NEED__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__NEED_TYPE_ID:
				setNeedTypeId((NeedType)newValue);
				return;
			case NeedPackage.PARTY_NEED__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case NeedPackage.PARTY_NEED__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case NeedPackage.PARTY_NEED__PARTY_TYPE_ID:
				setPartyTypeId((PartyType)newValue);
				return;
			case NeedPackage.PARTY_NEED__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((CommunicationEvent)newValue);
				return;
			case NeedPackage.PARTY_NEED__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case NeedPackage.PARTY_NEED__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
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
			case NeedPackage.PARTY_NEED__PARTY_NEED_ID:
				setPartyNeedId(PARTY_NEED_ID_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__DATETIME_RECORDED:
				setDatetimeRecorded(DATETIME_RECORDED_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__NEED_TYPE_ID:
				setNeedTypeId((NeedType)null);
				return;
			case NeedPackage.PARTY_NEED__PARTY_ID:
				setPartyId((Party)null);
				return;
			case NeedPackage.PARTY_NEED__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case NeedPackage.PARTY_NEED__PARTY_TYPE_ID:
				setPartyTypeId((PartyType)null);
				return;
			case NeedPackage.PARTY_NEED__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((CommunicationEvent)null);
				return;
			case NeedPackage.PARTY_NEED__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case NeedPackage.PARTY_NEED__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
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
			case NeedPackage.PARTY_NEED__PARTY_NEED_ID:
				return PARTY_NEED_ID_EDEFAULT == null ? partyNeedId != null : !PARTY_NEED_ID_EDEFAULT.equals(partyNeedId);
			case NeedPackage.PARTY_NEED__DATETIME_RECORDED:
				return DATETIME_RECORDED_EDEFAULT == null ? datetimeRecorded != null : !DATETIME_RECORDED_EDEFAULT.equals(datetimeRecorded);
			case NeedPackage.PARTY_NEED__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case NeedPackage.PARTY_NEED__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case NeedPackage.PARTY_NEED__NEED_TYPE_ID:
				return needTypeId != null;
			case NeedPackage.PARTY_NEED__PARTY_ID:
				return partyId != null;
			case NeedPackage.PARTY_NEED__ROLE_TYPE_ID:
				return roleTypeId != null;
			case NeedPackage.PARTY_NEED__PARTY_TYPE_ID:
				return partyTypeId != null;
			case NeedPackage.PARTY_NEED__COMMUNICATION_EVENT_ID:
				return communicationEventId != null;
			case NeedPackage.PARTY_NEED__PRODUCT_ID:
				return productId != null;
			case NeedPackage.PARTY_NEED__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
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
		result.append(" (partyNeedId: ");
		result.append(partyNeedId);
		result.append(", datetimeRecorded: ");
		result.append(datetimeRecorded);
		result.append(", description: ");
		result.append(description);
		result.append(", visitId: ");
		result.append(visitId);
		result.append(')');
		return result.toString();
	}

} //PartyNeedImpl
