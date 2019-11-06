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
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mrp Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getMrpId <em>Mrp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getEventDate <em>Event Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#isIsLate <em>Is Late</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getMrpEventTypeId <em>Mrp Event Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.impl.MrpEventImpl#getFacilityId <em>Facility Id</em>}</li>
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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getMrpEventTypeId() <em>Mrp Event Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMrpEventTypeId()
	 * @generated
	 * @ordered
	 */
	protected MrpEventType mrpEventTypeId;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility facilityId;

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
		mrpId = newMrpId;
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
		eventDate = newEventDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MrpEventType getMrpEventTypeId() {
		if (mrpEventTypeId != null && ((EObject)mrpEventTypeId).eIsProxy()) {
			InternalEObject oldMrpEventTypeId = (InternalEObject)mrpEventTypeId;
			mrpEventTypeId = (MrpEventType)eResolveProxy(oldMrpEventTypeId);
			if (mrpEventTypeId != oldMrpEventTypeId) {
			}
		}
		return mrpEventTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MrpEventType basicGetMrpEventTypeId() {
		return mrpEventTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMrpEventTypeId(MrpEventType newMrpEventTypeId) {
		mrpEventTypeId = newMrpEventTypeId;
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
		eventName = newEventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		if (facilityId != null && ((EObject)facilityId).eIsProxy()) {
			InternalEObject oldFacilityId = (InternalEObject)facilityId;
			facilityId = (Facility)eResolveProxy(oldFacilityId);
			if (facilityId != oldFacilityId) {
			}
		}
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		facilityId = newFacilityId;
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
		isLate = newIsLate;
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
		quantity = newQuantity;
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
			case MrpPackage.MRP_EVENT__EVENT_DATE:
				return getEventDate();
			case MrpPackage.MRP_EVENT__EVENT_NAME:
				return getEventName();
			case MrpPackage.MRP_EVENT__IS_LATE:
				return isIsLate();
			case MrpPackage.MRP_EVENT__QUANTITY:
				return getQuantity();
			case MrpPackage.MRP_EVENT__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case MrpPackage.MRP_EVENT__MRP_EVENT_TYPE_ID:
				if (resolve) return getMrpEventTypeId();
				return basicGetMrpEventTypeId();
			case MrpPackage.MRP_EVENT__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
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
			case MrpPackage.MRP_EVENT__EVENT_DATE:
				setEventDate((Date)newValue);
				return;
			case MrpPackage.MRP_EVENT__EVENT_NAME:
				setEventName((String)newValue);
				return;
			case MrpPackage.MRP_EVENT__IS_LATE:
				setIsLate((Boolean)newValue);
				return;
			case MrpPackage.MRP_EVENT__QUANTITY:
				setQuantity((Double)newValue);
				return;
			case MrpPackage.MRP_EVENT__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case MrpPackage.MRP_EVENT__MRP_EVENT_TYPE_ID:
				setMrpEventTypeId((MrpEventType)newValue);
				return;
			case MrpPackage.MRP_EVENT__FACILITY_ID:
				setFacilityId((Facility)newValue);
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
			case MrpPackage.MRP_EVENT__EVENT_DATE:
				setEventDate(EVENT_DATE_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__IS_LATE:
				setIsLate(IS_LATE_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case MrpPackage.MRP_EVENT__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case MrpPackage.MRP_EVENT__MRP_EVENT_TYPE_ID:
				setMrpEventTypeId((MrpEventType)null);
				return;
			case MrpPackage.MRP_EVENT__FACILITY_ID:
				setFacilityId((Facility)null);
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
			case MrpPackage.MRP_EVENT__EVENT_DATE:
				return EVENT_DATE_EDEFAULT == null ? eventDate != null : !EVENT_DATE_EDEFAULT.equals(eventDate);
			case MrpPackage.MRP_EVENT__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
			case MrpPackage.MRP_EVENT__IS_LATE:
				return isLate != IS_LATE_EDEFAULT;
			case MrpPackage.MRP_EVENT__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case MrpPackage.MRP_EVENT__PRODUCT_ID:
				return productId != null;
			case MrpPackage.MRP_EVENT__MRP_EVENT_TYPE_ID:
				return mrpEventTypeId != null;
			case MrpPackage.MRP_EVENT__FACILITY_ID:
				return facilityId != null;
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
		result.append(", eventDate: ");
		result.append(eventDate);
		result.append(", eventName: ");
		result.append(eventName);
		result.append(", isLate: ");
		result.append(isLate);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //MrpEventImpl
