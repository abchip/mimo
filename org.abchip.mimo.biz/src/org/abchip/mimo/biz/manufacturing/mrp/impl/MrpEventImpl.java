/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.mrp.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.manufacturing.mrp.MrpEvent;
import org.abchip.mimo.biz.manufacturing.mrp.MrpEventType;
import org.abchip.mimo.biz.manufacturing.mrp.MrpPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mrp Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getMrpId <em>Mrp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getEventDate <em>Event Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getMrpEventTypeId <em>Mrp Event Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#isIsLate <em>Is Late</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MrpEventImpl extends BizEntityTypedImpl<MrpEventType> implements MrpEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getMrpId() <em>Mrp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMrpId()
	 * @generated
	 * @ordered
	 */
	protected static final String MRP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMrpId() <em>Mrp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMrpId()
	 * @generated
	 * @ordered
	 */
	protected String mrpId = MRP_ID_EDEFAULT;

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
	 * The default value of the '{@link #getEventDate() <em>Event Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EVENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventDate() <em>Event Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDate()
	 * @generated
	 * @ordered
	 */
	protected Date eventDate = EVENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMrpEventTypeId() <em>Mrp Event Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMrpEventTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String MRP_EVENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMrpEventTypeId() <em>Mrp Event Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMrpEventTypeId()
	 * @generated
	 * @ordered
	 */
	protected String mrpEventTypeId = MRP_EVENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected String eventName = EVENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String facilityId = FACILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLate() <em>Is Late</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLate() <em>Is Late</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLate()
	 * @generated
	 * @ordered
	 */
	protected boolean isLate = IS_LATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected double quantity = QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MrpEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MrpPackage.Literals.MRP_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMrpId() {
		return mrpId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMrpId(String newMrpId) {
		String oldMrpId = mrpId;
		mrpId = newMrpId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrpPackage.MRP_EVENT__MRP_ID, oldMrpId, mrpId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MrpPackage.MRP_EVENT__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEventDate() {
		return eventDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventDate(Date newEventDate) {
		Date oldEventDate = eventDate;
		eventDate = newEventDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrpPackage.MRP_EVENT__EVENT_DATE, oldEventDate, eventDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMrpEventTypeId() {
		return mrpEventTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMrpEventTypeId(String newMrpEventTypeId) {
		String oldMrpEventTypeId = mrpEventTypeId;
		mrpEventTypeId = newMrpEventTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrpPackage.MRP_EVENT__MRP_EVENT_TYPE_ID, oldMrpEventTypeId, mrpEventTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventName(String newEventName) {
		String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrpPackage.MRP_EVENT__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		String oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrpPackage.MRP_EVENT__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLate() {
		return isLate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLate(boolean newIsLate) {
		boolean oldIsLate = isLate;
		isLate = newIsLate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrpPackage.MRP_EVENT__IS_LATE, oldIsLate, isLate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(double newQuantity) {
		double oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrpPackage.MRP_EVENT__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MrpPackage.MRP_EVENT__MRP_ID:
				return getMrpId();
			case MrpPackage.MRP_EVENT__PRODUCT_ID:
				return getProductId();
			case MrpPackage.MRP_EVENT__EVENT_DATE:
				return getEventDate();
			case MrpPackage.MRP_EVENT__MRP_EVENT_TYPE_ID:
				return getMrpEventTypeId();
			case MrpPackage.MRP_EVENT__EVENT_NAME:
				return getEventName();
			case MrpPackage.MRP_EVENT__FACILITY_ID:
				return getFacilityId();
			case MrpPackage.MRP_EVENT__IS_LATE:
				return isIsLate();
			case MrpPackage.MRP_EVENT__QUANTITY:
				return getQuantity();
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
			case MrpPackage.MRP_EVENT__MRP_ID:
				setMrpId((String)newValue);
				return;
			case MrpPackage.MRP_EVENT__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case MrpPackage.MRP_EVENT__EVENT_DATE:
				setEventDate((Date)newValue);
				return;
			case MrpPackage.MRP_EVENT__MRP_EVENT_TYPE_ID:
				setMrpEventTypeId((String)newValue);
				return;
			case MrpPackage.MRP_EVENT__EVENT_NAME:
				setEventName((String)newValue);
				return;
			case MrpPackage.MRP_EVENT__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case MrpPackage.MRP_EVENT__IS_LATE:
				setIsLate((Boolean)newValue);
				return;
			case MrpPackage.MRP_EVENT__QUANTITY:
				setQuantity((Double)newValue);
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
			case MrpPackage.MRP_EVENT__MRP_ID:
				setMrpId(MRP_ID_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__EVENT_DATE:
				setEventDate(EVENT_DATE_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__MRP_EVENT_TYPE_ID:
				setMrpEventTypeId(MRP_EVENT_TYPE_ID_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__IS_LATE:
				setIsLate(IS_LATE_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
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
			case MrpPackage.MRP_EVENT__MRP_ID:
				return MRP_ID_EDEFAULT == null ? mrpId != null : !MRP_ID_EDEFAULT.equals(mrpId);
			case MrpPackage.MRP_EVENT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case MrpPackage.MRP_EVENT__EVENT_DATE:
				return EVENT_DATE_EDEFAULT == null ? eventDate != null : !EVENT_DATE_EDEFAULT.equals(eventDate);
			case MrpPackage.MRP_EVENT__MRP_EVENT_TYPE_ID:
				return MRP_EVENT_TYPE_ID_EDEFAULT == null ? mrpEventTypeId != null : !MRP_EVENT_TYPE_ID_EDEFAULT.equals(mrpEventTypeId);
			case MrpPackage.MRP_EVENT__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
			case MrpPackage.MRP_EVENT__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case MrpPackage.MRP_EVENT__IS_LATE:
				return isLate != IS_LATE_EDEFAULT;
			case MrpPackage.MRP_EVENT__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
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
		result.append(" (mrpId: ");
		result.append(mrpId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", eventDate: ");
		result.append(eventDate);
		result.append(", mrpEventTypeId: ");
		result.append(mrpEventTypeId);
		result.append(", eventName: ");
		result.append(eventName);
		result.append(", facilityId: ");
		result.append(facilityId);
		result.append(", isLate: ");
		result.append(isLate);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //MrpEventImpl
