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
import org.abchip.mimo.biz.party.need.NeedPackage;
import org.abchip.mimo.biz.party.need.PartyNeed;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getPartyNeedId <em>Party Need Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getDatetimeRecorded <em>Datetime Recorded</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getNeedTypeId <em>Need Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getPartyTypeId <em>Party Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl#getVisitId <em>Visit Id</em>}</li>
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
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_EVENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected String communicationEventId = COMMUNICATION_EVENT_ID_EDEFAULT;
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
	 * The default value of the '{@link #getNeedTypeId() <em>Need Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String NEED_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNeedTypeId() <em>Need Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedTypeId()
	 * @generated
	 * @ordered
	 */
	protected String needTypeId = NEED_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyTypeId() <em>Party Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyTypeId() <em>Party Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyTypeId()
	 * @generated
	 * @ordered
	 */
	protected String partyTypeId = PARTY_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CATEGORY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String productCategoryId = PRODUCT_CATEGORY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;
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
		Date oldDatetimeRecorded = datetimeRecorded;
		datetimeRecorded = newDatetimeRecorded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__DATETIME_RECORDED, oldDatetimeRecorded, datetimeRecorded));
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__DESCRIPTION, oldDescription, description));
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
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__PARTY_ID, oldPartyId, partyId));
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
		String oldPartyNeedId = partyNeedId;
		partyNeedId = newPartyNeedId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__PARTY_NEED_ID, oldPartyNeedId, partyNeedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyTypeId() {
		return partyTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyTypeId(String newPartyTypeId) {
		String oldPartyTypeId = partyTypeId;
		partyTypeId = newPartyTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__PARTY_TYPE_ID, oldPartyTypeId, partyTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		String oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		String oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
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
		String oldVisitId = visitId;
		visitId = newVisitId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__VISIT_ID, oldVisitId, visitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNeedTypeId() {
		return needTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedTypeId(String newNeedTypeId) {
		String oldNeedTypeId = needTypeId;
		needTypeId = newNeedTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__NEED_TYPE_ID, oldNeedTypeId, needTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventId() {
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(String newCommunicationEventId) {
		String oldCommunicationEventId = communicationEventId;
		communicationEventId = newCommunicationEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedPackage.PARTY_NEED__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
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
			case NeedPackage.PARTY_NEED__PARTY_ID:
				return getPartyId();
			case NeedPackage.PARTY_NEED__ROLE_TYPE_ID:
				return getRoleTypeId();
			case NeedPackage.PARTY_NEED__COMMUNICATION_EVENT_ID:
				return getCommunicationEventId();
			case NeedPackage.PARTY_NEED__DATETIME_RECORDED:
				return getDatetimeRecorded();
			case NeedPackage.PARTY_NEED__DESCRIPTION:
				return getDescription();
			case NeedPackage.PARTY_NEED__NEED_TYPE_ID:
				return getNeedTypeId();
			case NeedPackage.PARTY_NEED__PARTY_TYPE_ID:
				return getPartyTypeId();
			case NeedPackage.PARTY_NEED__PRODUCT_CATEGORY_ID:
				return getProductCategoryId();
			case NeedPackage.PARTY_NEED__PRODUCT_ID:
				return getProductId();
			case NeedPackage.PARTY_NEED__VISIT_ID:
				return getVisitId();
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
			case NeedPackage.PARTY_NEED__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__DATETIME_RECORDED:
				setDatetimeRecorded((Date)newValue);
				return;
			case NeedPackage.PARTY_NEED__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__NEED_TYPE_ID:
				setNeedTypeId((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__PARTY_TYPE_ID:
				setPartyTypeId((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__PRODUCT_CATEGORY_ID:
				setProductCategoryId((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case NeedPackage.PARTY_NEED__VISIT_ID:
				setVisitId((String)newValue);
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
			case NeedPackage.PARTY_NEED__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__COMMUNICATION_EVENT_ID:
				setCommunicationEventId(COMMUNICATION_EVENT_ID_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__DATETIME_RECORDED:
				setDatetimeRecorded(DATETIME_RECORDED_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__NEED_TYPE_ID:
				setNeedTypeId(NEED_TYPE_ID_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__PARTY_TYPE_ID:
				setPartyTypeId(PARTY_TYPE_ID_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__PRODUCT_CATEGORY_ID:
				setProductCategoryId(PRODUCT_CATEGORY_ID_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case NeedPackage.PARTY_NEED__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
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
			case NeedPackage.PARTY_NEED__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case NeedPackage.PARTY_NEED__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case NeedPackage.PARTY_NEED__COMMUNICATION_EVENT_ID:
				return COMMUNICATION_EVENT_ID_EDEFAULT == null ? communicationEventId != null : !COMMUNICATION_EVENT_ID_EDEFAULT.equals(communicationEventId);
			case NeedPackage.PARTY_NEED__DATETIME_RECORDED:
				return DATETIME_RECORDED_EDEFAULT == null ? datetimeRecorded != null : !DATETIME_RECORDED_EDEFAULT.equals(datetimeRecorded);
			case NeedPackage.PARTY_NEED__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case NeedPackage.PARTY_NEED__NEED_TYPE_ID:
				return NEED_TYPE_ID_EDEFAULT == null ? needTypeId != null : !NEED_TYPE_ID_EDEFAULT.equals(needTypeId);
			case NeedPackage.PARTY_NEED__PARTY_TYPE_ID:
				return PARTY_TYPE_ID_EDEFAULT == null ? partyTypeId != null : !PARTY_TYPE_ID_EDEFAULT.equals(partyTypeId);
			case NeedPackage.PARTY_NEED__PRODUCT_CATEGORY_ID:
				return PRODUCT_CATEGORY_ID_EDEFAULT == null ? productCategoryId != null : !PRODUCT_CATEGORY_ID_EDEFAULT.equals(productCategoryId);
			case NeedPackage.PARTY_NEED__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case NeedPackage.PARTY_NEED__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
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
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", communicationEventId: ");
		result.append(communicationEventId);
		result.append(", datetimeRecorded: ");
		result.append(datetimeRecorded);
		result.append(", description: ");
		result.append(description);
		result.append(", needTypeId: ");
		result.append(needTypeId);
		result.append(", partyTypeId: ");
		result.append(partyTypeId);
		result.append(", productCategoryId: ");
		result.append(productCategoryId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", visitId: ");
		result.append(visitId);
		result.append(')');
		return result.toString();
	}

} //PartyNeedImpl
