/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.abchip.mimo.biz.party.agreement.AgreementTerm;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getAgreementTermId <em>Agreement Term Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getMaxQuantity <em>Max Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getMinQuantity <em>Min Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getTermDays <em>Term Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getTermTypeId <em>Term Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getTermValue <em>Term Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getTextValue <em>Text Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTermImpl#getAgreementTermAttributes <em>Agreement Term Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementTermImpl extends BizEntityImpl implements AgreementTerm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getAgreementTermId() <em>Agreement Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementTermId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_TERM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementTermId() <em>Agreement Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementTermId()
	 * @generated
	 * @ordered
	 */
	protected String agreementTermId = AGREEMENT_TERM_ID_EDEFAULT;
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
	 * The default value of the '{@link #getAgreementItemSeqId() <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ITEM_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAgreementItemSeqId() <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String agreementItemSeqId = AGREEMENT_ITEM_SEQ_ID_EDEFAULT;
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
	 * The default value of the '{@link #getInvoiceItemTypeId() <em>Invoice Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceItemTypeId() <em>Invoice Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemTypeId = INVOICE_ITEM_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxQuantity() <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_QUANTITY_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getMaxQuantity() <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQuantity()
	 * @generated
	 * @ordered
	 */
	protected double maxQuantity = MAX_QUANTITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getMinQuantity() <em>Min Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_QUANTITY_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getMinQuantity() <em>Min Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQuantity()
	 * @generated
	 * @ordered
	 */
	protected double minQuantity = MIN_QUANTITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getTermDays() <em>Term Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDays()
	 * @generated
	 * @ordered
	 */
	protected static final long TERM_DAYS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getTermDays() <em>Term Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDays()
	 * @generated
	 * @ordered
	 */
	protected long termDays = TERM_DAYS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTermTypeId() <em>Term Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTermTypeId() <em>Term Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermTypeId()
	 * @generated
	 * @ordered
	 */
	protected String termTypeId = TERM_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTermValue() <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TERM_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTermValue() <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal termValue = TERM_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTextValue() <em>Text Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTextValue() <em>Text Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextValue()
	 * @generated
	 * @ordered
	 */
	protected String textValue = TEXT_VALUE_EDEFAULT;
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
	 * The cached value of the '{@link #getAgreementTermAttributes() <em>Agreement Term Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementTermAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> agreementTermAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.AGREEMENT_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementItemSeqId() {
		return agreementItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemSeqId(String newAgreementItemSeqId) {
		String oldAgreementItemSeqId = agreementItemSeqId;
		agreementItemSeqId = newAgreementItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__AGREEMENT_ITEM_SEQ_ID, oldAgreementItemSeqId, agreementItemSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemTypeId() {
		return invoiceItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemTypeId(String newInvoiceItemTypeId) {
		String oldInvoiceItemTypeId = invoiceItemTypeId;
		invoiceItemTypeId = newInvoiceItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__INVOICE_ITEM_TYPE_ID, oldInvoiceItemTypeId, invoiceItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxQuantity() {
		return maxQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxQuantity(double newMaxQuantity) {
		double oldMaxQuantity = maxQuantity;
		maxQuantity = newMaxQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__MAX_QUANTITY, oldMaxQuantity, maxQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinQuantity() {
		return minQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinQuantity(double newMinQuantity) {
		double oldMinQuantity = minQuantity;
		minQuantity = newMinQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__MIN_QUANTITY, oldMinQuantity, minQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTermDays() {
		return termDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermDays(long newTermDays) {
		long oldTermDays = termDays;
		termDays = newTermDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__TERM_DAYS, oldTermDays, termDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTermValue() {
		return termValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermValue(BigDecimal newTermValue) {
		BigDecimal oldTermValue = termValue;
		termValue = newTermValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__TERM_VALUE, oldTermValue, termValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextValue() {
		return textValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextValue(String newTextValue) {
		String oldTextValue = textValue;
		textValue = newTextValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__TEXT_VALUE, oldTextValue, textValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAgreementTermAttributes() {
		if (agreementTermAttributes == null) {
			agreementTermAttributes = new EDataTypeUniqueEList<String>(String.class, this, AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ATTRIBUTES);
		}
		return agreementTermAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTermTypeId() {
		return termTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermTypeId(String newTermTypeId) {
		String oldTermTypeId = termTypeId;
		termTypeId = newTermTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__TERM_TYPE_ID, oldTermTypeId, termTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__AGREEMENT_ID, oldAgreementId, agreementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementTermId() {
		return agreementTermId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementTermId(String newAgreementTermId) {
		String oldAgreementTermId = agreementTermId;
		agreementTermId = newAgreementTermId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ID, oldAgreementTermId, agreementTermId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ID:
				return getAgreementTermId();
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_ID:
				return getAgreementId();
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_ITEM_SEQ_ID:
				return getAgreementItemSeqId();
			case AgreementPackage.AGREEMENT_TERM__DESCRIPTION:
				return getDescription();
			case AgreementPackage.AGREEMENT_TERM__FROM_DATE:
				return getFromDate();
			case AgreementPackage.AGREEMENT_TERM__INVOICE_ITEM_TYPE_ID:
				return getInvoiceItemTypeId();
			case AgreementPackage.AGREEMENT_TERM__MAX_QUANTITY:
				return getMaxQuantity();
			case AgreementPackage.AGREEMENT_TERM__MIN_QUANTITY:
				return getMinQuantity();
			case AgreementPackage.AGREEMENT_TERM__TERM_DAYS:
				return getTermDays();
			case AgreementPackage.AGREEMENT_TERM__TERM_TYPE_ID:
				return getTermTypeId();
			case AgreementPackage.AGREEMENT_TERM__TERM_VALUE:
				return getTermValue();
			case AgreementPackage.AGREEMENT_TERM__TEXT_VALUE:
				return getTextValue();
			case AgreementPackage.AGREEMENT_TERM__THRU_DATE:
				return getThruDate();
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ATTRIBUTES:
				return getAgreementTermAttributes();
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
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ID:
				setAgreementTermId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_ID:
				setAgreementId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__MAX_QUANTITY:
				setMaxQuantity((Double)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__MIN_QUANTITY:
				setMinQuantity((Double)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__TERM_DAYS:
				setTermDays((Long)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__TERM_TYPE_ID:
				setTermTypeId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__TERM_VALUE:
				setTermValue((BigDecimal)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__TEXT_VALUE:
				setTextValue((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ATTRIBUTES:
				getAgreementTermAttributes().clear();
				getAgreementTermAttributes().addAll((Collection<? extends String>)newValue);
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
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ID:
				setAgreementTermId(AGREEMENT_TERM_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_ID:
				setAgreementId(AGREEMENT_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId(AGREEMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId(INVOICE_ITEM_TYPE_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__MAX_QUANTITY:
				setMaxQuantity(MAX_QUANTITY_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__MIN_QUANTITY:
				setMinQuantity(MIN_QUANTITY_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__TERM_DAYS:
				setTermDays(TERM_DAYS_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__TERM_TYPE_ID:
				setTermTypeId(TERM_TYPE_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__TERM_VALUE:
				setTermValue(TERM_VALUE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__TEXT_VALUE:
				setTextValue(TEXT_VALUE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ATTRIBUTES:
				getAgreementTermAttributes().clear();
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
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ID:
				return AGREEMENT_TERM_ID_EDEFAULT == null ? agreementTermId != null : !AGREEMENT_TERM_ID_EDEFAULT.equals(agreementTermId);
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_ID:
				return AGREEMENT_ID_EDEFAULT == null ? agreementId != null : !AGREEMENT_ID_EDEFAULT.equals(agreementId);
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_ITEM_SEQ_ID:
				return AGREEMENT_ITEM_SEQ_ID_EDEFAULT == null ? agreementItemSeqId != null : !AGREEMENT_ITEM_SEQ_ID_EDEFAULT.equals(agreementItemSeqId);
			case AgreementPackage.AGREEMENT_TERM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AgreementPackage.AGREEMENT_TERM__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case AgreementPackage.AGREEMENT_TERM__INVOICE_ITEM_TYPE_ID:
				return INVOICE_ITEM_TYPE_ID_EDEFAULT == null ? invoiceItemTypeId != null : !INVOICE_ITEM_TYPE_ID_EDEFAULT.equals(invoiceItemTypeId);
			case AgreementPackage.AGREEMENT_TERM__MAX_QUANTITY:
				return maxQuantity != MAX_QUANTITY_EDEFAULT;
			case AgreementPackage.AGREEMENT_TERM__MIN_QUANTITY:
				return minQuantity != MIN_QUANTITY_EDEFAULT;
			case AgreementPackage.AGREEMENT_TERM__TERM_DAYS:
				return termDays != TERM_DAYS_EDEFAULT;
			case AgreementPackage.AGREEMENT_TERM__TERM_TYPE_ID:
				return TERM_TYPE_ID_EDEFAULT == null ? termTypeId != null : !TERM_TYPE_ID_EDEFAULT.equals(termTypeId);
			case AgreementPackage.AGREEMENT_TERM__TERM_VALUE:
				return TERM_VALUE_EDEFAULT == null ? termValue != null : !TERM_VALUE_EDEFAULT.equals(termValue);
			case AgreementPackage.AGREEMENT_TERM__TEXT_VALUE:
				return TEXT_VALUE_EDEFAULT == null ? textValue != null : !TEXT_VALUE_EDEFAULT.equals(textValue);
			case AgreementPackage.AGREEMENT_TERM__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case AgreementPackage.AGREEMENT_TERM__AGREEMENT_TERM_ATTRIBUTES:
				return agreementTermAttributes != null && !agreementTermAttributes.isEmpty();
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
		result.append(" (agreementTermId: ");
		result.append(agreementTermId);
		result.append(", agreementId: ");
		result.append(agreementId);
		result.append(", agreementItemSeqId: ");
		result.append(agreementItemSeqId);
		result.append(", description: ");
		result.append(description);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", invoiceItemTypeId: ");
		result.append(invoiceItemTypeId);
		result.append(", maxQuantity: ");
		result.append(maxQuantity);
		result.append(", minQuantity: ");
		result.append(minQuantity);
		result.append(", termDays: ");
		result.append(termDays);
		result.append(", termTypeId: ");
		result.append(termTypeId);
		result.append(", termValue: ");
		result.append(termValue);
		result.append(", textValue: ");
		result.append(textValue);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", agreementTermAttributes: ");
		result.append(agreementTermAttributes);
		result.append(')');
		return result.toString();
	}

} //AgreementTermImpl
