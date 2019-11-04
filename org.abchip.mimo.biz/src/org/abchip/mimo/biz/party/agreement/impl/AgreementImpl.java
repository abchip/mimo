/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.agreement.Agreement;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.abchip.mimo.biz.party.agreement.AgreementType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getAgreementDate <em>Agreement Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getTextData <em>Text Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getAgreementTypeId <em>Agreement Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getAgreementAttributes <em>Agreement Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementImpl#getAgreementItems <em>Agreement Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementImpl extends BizEntityTypedImpl<AgreementType> implements Agreement {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getAgreementId() <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAgreementId() <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected String agreementId = AGREEMENT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAgreementDate() <em>Agreement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date AGREEMENT_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAgreementDate() <em>Agreement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementDate()
	 * @generated
	 * @ordered
	 */
	protected Date agreementDate = AGREEMENT_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTextData() <em>Text Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextData()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTextData() <em>Text Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextData()
	 * @generated
	 * @ordered
	 */
	protected String textData = TEXT_DATA_EDEFAULT;
	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;
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
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdFrom;
	/**
	 * The cached value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeIdFrom;
	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdTo;
	/**
	 * The cached value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeIdTo;
	/**
	 * The cached value of the '{@link #getAgreementTypeId() <em>Agreement Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementTypeId()
	 * @generated
	 * @ordered
	 */
	protected AgreementType agreementTypeId;

	/**
	 * The cached value of the '{@link #getAgreementAttributes() <em>Agreement Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> agreementAttributes;
	/**
	 * The cached value of the '{@link #getAgreementItems() <em>Agreement Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> agreementItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAgreementDate() {
		return agreementDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementDate(Date newAgreementDate) {
		Date oldAgreementDate = agreementDate;
		agreementDate = newAgreementDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__AGREEMENT_DATE, oldAgreementDate, agreementDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		if (partyIdFrom != null && ((EObject)partyIdFrom).eIsProxy()) {
			InternalEObject oldPartyIdFrom = (InternalEObject)partyIdFrom;
			partyIdFrom = (Party)eResolveProxy(oldPartyIdFrom);
			if (partyIdFrom != oldPartyIdFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementPackage.AGREEMENT__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
			}
		}
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		Party oldPartyIdFrom = partyIdFrom;
		partyIdFrom = newPartyIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdTo() {
		if (partyIdTo != null && ((EObject)partyIdTo).eIsProxy()) {
			InternalEObject oldPartyIdTo = (InternalEObject)partyIdTo;
			partyIdTo = (Party)eResolveProxy(oldPartyIdTo);
			if (partyIdTo != oldPartyIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementPackage.AGREEMENT__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
			}
		}
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		Party oldPartyIdTo = partyIdTo;
		partyIdTo = newPartyIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementPackage.AGREEMENT__PRODUCT_ID, oldProductId, productId));
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
		Product oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdFrom() {
		if (roleTypeIdFrom != null && ((EObject)roleTypeIdFrom).eIsProxy()) {
			InternalEObject oldRoleTypeIdFrom = (InternalEObject)roleTypeIdFrom;
			roleTypeIdFrom = (RoleType)eResolveProxy(oldRoleTypeIdFrom);
			if (roleTypeIdFrom != oldRoleTypeIdFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementPackage.AGREEMENT__ROLE_TYPE_ID_FROM, oldRoleTypeIdFrom, roleTypeIdFrom));
			}
		}
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeIdFrom() {
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdFrom(RoleType newRoleTypeIdFrom) {
		RoleType oldRoleTypeIdFrom = roleTypeIdFrom;
		roleTypeIdFrom = newRoleTypeIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__ROLE_TYPE_ID_FROM, oldRoleTypeIdFrom, roleTypeIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdTo() {
		if (roleTypeIdTo != null && ((EObject)roleTypeIdTo).eIsProxy()) {
			InternalEObject oldRoleTypeIdTo = (InternalEObject)roleTypeIdTo;
			roleTypeIdTo = (RoleType)eResolveProxy(oldRoleTypeIdTo);
			if (roleTypeIdTo != oldRoleTypeIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementPackage.AGREEMENT__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
			}
		}
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(RoleType newRoleTypeIdTo) {
		RoleType oldRoleTypeIdTo = roleTypeIdTo;
		roleTypeIdTo = newRoleTypeIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextData() {
		return textData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextData(String newTextData) {
		String oldTextData = textData;
		textData = newTextData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__TEXT_DATA, oldTextData, textData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAgreementAttributes() {
		if (agreementAttributes == null) {
			agreementAttributes = new EDataTypeUniqueEList<String>(String.class, this, AgreementPackage.AGREEMENT__AGREEMENT_ATTRIBUTES);
		}
		return agreementAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAgreementItems() {
		if (agreementItems == null) {
			agreementItems = new EDataTypeUniqueEList<String>(String.class, this, AgreementPackage.AGREEMENT__AGREEMENT_ITEMS);
		}
		return agreementItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> addendums() {
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
	public List<String> agreementTerms() {
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
	public List<String> supplierOrderItemShipGroups() {
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
	public AgreementType getAgreementTypeId() {
		if (agreementTypeId != null && ((EObject)agreementTypeId).eIsProxy()) {
			InternalEObject oldAgreementTypeId = (InternalEObject)agreementTypeId;
			agreementTypeId = (AgreementType)eResolveProxy(oldAgreementTypeId);
			if (agreementTypeId != oldAgreementTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementPackage.AGREEMENT__AGREEMENT_TYPE_ID, oldAgreementTypeId, agreementTypeId));
			}
		}
		return agreementTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementType basicGetAgreementTypeId() {
		return agreementTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementTypeId(AgreementType newAgreementTypeId) {
		AgreementType oldAgreementTypeId = agreementTypeId;
		agreementTypeId = newAgreementTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__AGREEMENT_TYPE_ID, oldAgreementTypeId, agreementTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementId() {
		return agreementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementId(String newAgreementId) {
		String oldAgreementId = agreementId;
		agreementId = newAgreementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT__AGREEMENT_ID, oldAgreementId, agreementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementPackage.AGREEMENT__AGREEMENT_ID:
				return getAgreementId();
			case AgreementPackage.AGREEMENT__AGREEMENT_DATE:
				return getAgreementDate();
			case AgreementPackage.AGREEMENT__DESCRIPTION:
				return getDescription();
			case AgreementPackage.AGREEMENT__FROM_DATE:
				return getFromDate();
			case AgreementPackage.AGREEMENT__TEXT_DATA:
				return getTextData();
			case AgreementPackage.AGREEMENT__THRU_DATE:
				return getThruDate();
			case AgreementPackage.AGREEMENT__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case AgreementPackage.AGREEMENT__PARTY_ID_FROM:
				if (resolve) return getPartyIdFrom();
				return basicGetPartyIdFrom();
			case AgreementPackage.AGREEMENT__ROLE_TYPE_ID_FROM:
				if (resolve) return getRoleTypeIdFrom();
				return basicGetRoleTypeIdFrom();
			case AgreementPackage.AGREEMENT__PARTY_ID_TO:
				if (resolve) return getPartyIdTo();
				return basicGetPartyIdTo();
			case AgreementPackage.AGREEMENT__ROLE_TYPE_ID_TO:
				if (resolve) return getRoleTypeIdTo();
				return basicGetRoleTypeIdTo();
			case AgreementPackage.AGREEMENT__AGREEMENT_TYPE_ID:
				if (resolve) return getAgreementTypeId();
				return basicGetAgreementTypeId();
			case AgreementPackage.AGREEMENT__AGREEMENT_ATTRIBUTES:
				return getAgreementAttributes();
			case AgreementPackage.AGREEMENT__AGREEMENT_ITEMS:
				return getAgreementItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgreementPackage.AGREEMENT__AGREEMENT_ID:
				setAgreementId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT__AGREEMENT_DATE:
				setAgreementDate((Date)newValue);
				return;
			case AgreementPackage.AGREEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AgreementPackage.AGREEMENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case AgreementPackage.AGREEMENT__TEXT_DATA:
				setTextData((String)newValue);
				return;
			case AgreementPackage.AGREEMENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case AgreementPackage.AGREEMENT__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case AgreementPackage.AGREEMENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)newValue);
				return;
			case AgreementPackage.AGREEMENT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((RoleType)newValue);
				return;
			case AgreementPackage.AGREEMENT__PARTY_ID_TO:
				setPartyIdTo((Party)newValue);
				return;
			case AgreementPackage.AGREEMENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((RoleType)newValue);
				return;
			case AgreementPackage.AGREEMENT__AGREEMENT_TYPE_ID:
				setAgreementTypeId((AgreementType)newValue);
				return;
			case AgreementPackage.AGREEMENT__AGREEMENT_ATTRIBUTES:
				getAgreementAttributes().clear();
				getAgreementAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case AgreementPackage.AGREEMENT__AGREEMENT_ITEMS:
				getAgreementItems().clear();
				getAgreementItems().addAll((Collection<? extends String>)newValue);
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
			case AgreementPackage.AGREEMENT__AGREEMENT_ID:
				setAgreementId(AGREEMENT_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT__AGREEMENT_DATE:
				setAgreementDate(AGREEMENT_DATE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT__TEXT_DATA:
				setTextData(TEXT_DATA_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case AgreementPackage.AGREEMENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)null);
				return;
			case AgreementPackage.AGREEMENT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((RoleType)null);
				return;
			case AgreementPackage.AGREEMENT__PARTY_ID_TO:
				setPartyIdTo((Party)null);
				return;
			case AgreementPackage.AGREEMENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((RoleType)null);
				return;
			case AgreementPackage.AGREEMENT__AGREEMENT_TYPE_ID:
				setAgreementTypeId((AgreementType)null);
				return;
			case AgreementPackage.AGREEMENT__AGREEMENT_ATTRIBUTES:
				getAgreementAttributes().clear();
				return;
			case AgreementPackage.AGREEMENT__AGREEMENT_ITEMS:
				getAgreementItems().clear();
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
			case AgreementPackage.AGREEMENT__AGREEMENT_ID:
				return AGREEMENT_ID_EDEFAULT == null ? agreementId != null : !AGREEMENT_ID_EDEFAULT.equals(agreementId);
			case AgreementPackage.AGREEMENT__AGREEMENT_DATE:
				return AGREEMENT_DATE_EDEFAULT == null ? agreementDate != null : !AGREEMENT_DATE_EDEFAULT.equals(agreementDate);
			case AgreementPackage.AGREEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AgreementPackage.AGREEMENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case AgreementPackage.AGREEMENT__TEXT_DATA:
				return TEXT_DATA_EDEFAULT == null ? textData != null : !TEXT_DATA_EDEFAULT.equals(textData);
			case AgreementPackage.AGREEMENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case AgreementPackage.AGREEMENT__PRODUCT_ID:
				return productId != null;
			case AgreementPackage.AGREEMENT__PARTY_ID_FROM:
				return partyIdFrom != null;
			case AgreementPackage.AGREEMENT__ROLE_TYPE_ID_FROM:
				return roleTypeIdFrom != null;
			case AgreementPackage.AGREEMENT__PARTY_ID_TO:
				return partyIdTo != null;
			case AgreementPackage.AGREEMENT__ROLE_TYPE_ID_TO:
				return roleTypeIdTo != null;
			case AgreementPackage.AGREEMENT__AGREEMENT_TYPE_ID:
				return agreementTypeId != null;
			case AgreementPackage.AGREEMENT__AGREEMENT_ATTRIBUTES:
				return agreementAttributes != null && !agreementAttributes.isEmpty();
			case AgreementPackage.AGREEMENT__AGREEMENT_ITEMS:
				return agreementItems != null && !agreementItems.isEmpty();
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
		result.append(" (agreementId: ");
		result.append(agreementId);
		result.append(", agreementDate: ");
		result.append(agreementDate);
		result.append(", description: ");
		result.append(description);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", textData: ");
		result.append(textData);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", agreementAttributes: ");
		result.append(agreementAttributes);
		result.append(", agreementItems: ");
		result.append(agreementItems);
		result.append(')');
		return result.toString();
	}

} //AgreementImpl
