/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.shipment.shipment.Delivery;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getDeliveryId <em>Delivery Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getActualArrivalDate <em>Actual Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getEndMileage <em>End Mileage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getFuelUsed <em>Fuel Used</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getStartMileage <em>Start Mileage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl#getDestFacilityId <em>Dest Facility Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryImpl extends BizEntityImpl implements Delivery {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getDeliveryId() <em>Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryId()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryId() <em>Delivery Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryId()
	 * @generated
	 * @ordered
	 */
	protected String deliveryId = DELIVERY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualArrivalDate() <em>Actual Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_ARRIVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualArrivalDate() <em>Actual Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected Date actualArrivalDate = ACTUAL_ARRIVAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualStartDate() <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualStartDate() <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date actualStartDate = ACTUAL_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndMileage() <em>End Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndMileage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal END_MILEAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndMileage() <em>End Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndMileage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal endMileage = END_MILEAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedArrivalDate() <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_ARRIVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedArrivalDate() <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedArrivalDate = ESTIMATED_ARRIVAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedStartDate() <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedStartDate() <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedStartDate = ESTIMATED_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelUsed() <em>Fuel Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelUsed()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FUEL_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuelUsed() <em>Fuel Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelUsed()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fuelUsed = FUEL_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartMileage() <em>Start Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMileage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal START_MILEAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartMileage() <em>Start Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartMileage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal startMileage = START_MILEAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;

	/**
	 * The cached value of the '{@link #getOriginFacilityId() <em>Origin Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility originFacilityId;

	/**
	 * The cached value of the '{@link #getDestFacilityId() <em>Dest Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility destFacilityId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.DELIVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualArrivalDate() {
		return actualArrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualArrivalDate(Date newActualArrivalDate) {
		Date oldActualArrivalDate = actualArrivalDate;
		actualArrivalDate = newActualArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__ACTUAL_ARRIVAL_DATE, oldActualArrivalDate, actualArrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualStartDate() {
		return actualStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualStartDate(Date newActualStartDate) {
		Date oldActualStartDate = actualStartDate;
		actualStartDate = newActualStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__ACTUAL_START_DATE, oldActualStartDate, actualStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliveryId() {
		return deliveryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryId(String newDeliveryId) {
		String oldDeliveryId = deliveryId;
		deliveryId = newDeliveryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__DELIVERY_ID, oldDeliveryId, deliveryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getDestFacilityId() {
		if (destFacilityId != null && ((EObject)destFacilityId).eIsProxy()) {
			InternalEObject oldDestFacilityId = (InternalEObject)destFacilityId;
			destFacilityId = (Facility)eResolveProxy(oldDestFacilityId);
			if (destFacilityId != oldDestFacilityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.DELIVERY__DEST_FACILITY_ID, oldDestFacilityId, destFacilityId));
			}
		}
		return destFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetDestFacilityId() {
		return destFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestFacilityId(Facility newDestFacilityId) {
		Facility oldDestFacilityId = destFacilityId;
		destFacilityId = newDestFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__DEST_FACILITY_ID, oldDestFacilityId, destFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEndMileage() {
		return endMileage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndMileage(BigDecimal newEndMileage) {
		BigDecimal oldEndMileage = endMileage;
		endMileage = newEndMileage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__END_MILEAGE, oldEndMileage, endMileage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedArrivalDate() {
		return estimatedArrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedArrivalDate(Date newEstimatedArrivalDate) {
		Date oldEstimatedArrivalDate = estimatedArrivalDate;
		estimatedArrivalDate = newEstimatedArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__ESTIMATED_ARRIVAL_DATE, oldEstimatedArrivalDate, estimatedArrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedStartDate() {
		return estimatedStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedStartDate(Date newEstimatedStartDate) {
		Date oldEstimatedStartDate = estimatedStartDate;
		estimatedStartDate = newEstimatedStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__ESTIMATED_START_DATE, oldEstimatedStartDate, estimatedStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.DELIVERY__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		FixedAsset oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFuelUsed() {
		return fuelUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuelUsed(BigDecimal newFuelUsed) {
		BigDecimal oldFuelUsed = fuelUsed;
		fuelUsed = newFuelUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__FUEL_USED, oldFuelUsed, fuelUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getOriginFacilityId() {
		if (originFacilityId != null && ((EObject)originFacilityId).eIsProxy()) {
			InternalEObject oldOriginFacilityId = (InternalEObject)originFacilityId;
			originFacilityId = (Facility)eResolveProxy(oldOriginFacilityId);
			if (originFacilityId != oldOriginFacilityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.DELIVERY__ORIGIN_FACILITY_ID, oldOriginFacilityId, originFacilityId));
			}
		}
		return originFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetOriginFacilityId() {
		return originFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginFacilityId(Facility newOriginFacilityId) {
		Facility oldOriginFacilityId = originFacilityId;
		originFacilityId = newOriginFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__ORIGIN_FACILITY_ID, oldOriginFacilityId, originFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStartMileage() {
		return startMileage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartMileage(BigDecimal newStartMileage) {
		BigDecimal oldStartMileage = startMileage;
		startMileage = newStartMileage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.DELIVERY__START_MILEAGE, oldStartMileage, startMileage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> shipmentRouteSegments() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.DELIVERY__DELIVERY_ID:
				return getDeliveryId();
			case Shipment_Package.DELIVERY__ACTUAL_ARRIVAL_DATE:
				return getActualArrivalDate();
			case Shipment_Package.DELIVERY__ACTUAL_START_DATE:
				return getActualStartDate();
			case Shipment_Package.DELIVERY__END_MILEAGE:
				return getEndMileage();
			case Shipment_Package.DELIVERY__ESTIMATED_ARRIVAL_DATE:
				return getEstimatedArrivalDate();
			case Shipment_Package.DELIVERY__ESTIMATED_START_DATE:
				return getEstimatedStartDate();
			case Shipment_Package.DELIVERY__FUEL_USED:
				return getFuelUsed();
			case Shipment_Package.DELIVERY__START_MILEAGE:
				return getStartMileage();
			case Shipment_Package.DELIVERY__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case Shipment_Package.DELIVERY__ORIGIN_FACILITY_ID:
				if (resolve) return getOriginFacilityId();
				return basicGetOriginFacilityId();
			case Shipment_Package.DELIVERY__DEST_FACILITY_ID:
				if (resolve) return getDestFacilityId();
				return basicGetDestFacilityId();
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
			case Shipment_Package.DELIVERY__DELIVERY_ID:
				setDeliveryId((String)newValue);
				return;
			case Shipment_Package.DELIVERY__ACTUAL_ARRIVAL_DATE:
				setActualArrivalDate((Date)newValue);
				return;
			case Shipment_Package.DELIVERY__ACTUAL_START_DATE:
				setActualStartDate((Date)newValue);
				return;
			case Shipment_Package.DELIVERY__END_MILEAGE:
				setEndMileage((BigDecimal)newValue);
				return;
			case Shipment_Package.DELIVERY__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate((Date)newValue);
				return;
			case Shipment_Package.DELIVERY__ESTIMATED_START_DATE:
				setEstimatedStartDate((Date)newValue);
				return;
			case Shipment_Package.DELIVERY__FUEL_USED:
				setFuelUsed((BigDecimal)newValue);
				return;
			case Shipment_Package.DELIVERY__START_MILEAGE:
				setStartMileage((BigDecimal)newValue);
				return;
			case Shipment_Package.DELIVERY__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case Shipment_Package.DELIVERY__ORIGIN_FACILITY_ID:
				setOriginFacilityId((Facility)newValue);
				return;
			case Shipment_Package.DELIVERY__DEST_FACILITY_ID:
				setDestFacilityId((Facility)newValue);
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
			case Shipment_Package.DELIVERY__DELIVERY_ID:
				setDeliveryId(DELIVERY_ID_EDEFAULT);
				return;
			case Shipment_Package.DELIVERY__ACTUAL_ARRIVAL_DATE:
				setActualArrivalDate(ACTUAL_ARRIVAL_DATE_EDEFAULT);
				return;
			case Shipment_Package.DELIVERY__ACTUAL_START_DATE:
				setActualStartDate(ACTUAL_START_DATE_EDEFAULT);
				return;
			case Shipment_Package.DELIVERY__END_MILEAGE:
				setEndMileage(END_MILEAGE_EDEFAULT);
				return;
			case Shipment_Package.DELIVERY__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate(ESTIMATED_ARRIVAL_DATE_EDEFAULT);
				return;
			case Shipment_Package.DELIVERY__ESTIMATED_START_DATE:
				setEstimatedStartDate(ESTIMATED_START_DATE_EDEFAULT);
				return;
			case Shipment_Package.DELIVERY__FUEL_USED:
				setFuelUsed(FUEL_USED_EDEFAULT);
				return;
			case Shipment_Package.DELIVERY__START_MILEAGE:
				setStartMileage(START_MILEAGE_EDEFAULT);
				return;
			case Shipment_Package.DELIVERY__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case Shipment_Package.DELIVERY__ORIGIN_FACILITY_ID:
				setOriginFacilityId((Facility)null);
				return;
			case Shipment_Package.DELIVERY__DEST_FACILITY_ID:
				setDestFacilityId((Facility)null);
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
			case Shipment_Package.DELIVERY__DELIVERY_ID:
				return DELIVERY_ID_EDEFAULT == null ? deliveryId != null : !DELIVERY_ID_EDEFAULT.equals(deliveryId);
			case Shipment_Package.DELIVERY__ACTUAL_ARRIVAL_DATE:
				return ACTUAL_ARRIVAL_DATE_EDEFAULT == null ? actualArrivalDate != null : !ACTUAL_ARRIVAL_DATE_EDEFAULT.equals(actualArrivalDate);
			case Shipment_Package.DELIVERY__ACTUAL_START_DATE:
				return ACTUAL_START_DATE_EDEFAULT == null ? actualStartDate != null : !ACTUAL_START_DATE_EDEFAULT.equals(actualStartDate);
			case Shipment_Package.DELIVERY__END_MILEAGE:
				return END_MILEAGE_EDEFAULT == null ? endMileage != null : !END_MILEAGE_EDEFAULT.equals(endMileage);
			case Shipment_Package.DELIVERY__ESTIMATED_ARRIVAL_DATE:
				return ESTIMATED_ARRIVAL_DATE_EDEFAULT == null ? estimatedArrivalDate != null : !ESTIMATED_ARRIVAL_DATE_EDEFAULT.equals(estimatedArrivalDate);
			case Shipment_Package.DELIVERY__ESTIMATED_START_DATE:
				return ESTIMATED_START_DATE_EDEFAULT == null ? estimatedStartDate != null : !ESTIMATED_START_DATE_EDEFAULT.equals(estimatedStartDate);
			case Shipment_Package.DELIVERY__FUEL_USED:
				return FUEL_USED_EDEFAULT == null ? fuelUsed != null : !FUEL_USED_EDEFAULT.equals(fuelUsed);
			case Shipment_Package.DELIVERY__START_MILEAGE:
				return START_MILEAGE_EDEFAULT == null ? startMileage != null : !START_MILEAGE_EDEFAULT.equals(startMileage);
			case Shipment_Package.DELIVERY__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case Shipment_Package.DELIVERY__ORIGIN_FACILITY_ID:
				return originFacilityId != null;
			case Shipment_Package.DELIVERY__DEST_FACILITY_ID:
				return destFacilityId != null;
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
		result.append(" (deliveryId: ");
		result.append(deliveryId);
		result.append(", actualArrivalDate: ");
		result.append(actualArrivalDate);
		result.append(", actualStartDate: ");
		result.append(actualStartDate);
		result.append(", endMileage: ");
		result.append(endMileage);
		result.append(", estimatedArrivalDate: ");
		result.append(estimatedArrivalDate);
		result.append(", estimatedStartDate: ");
		result.append(estimatedStartDate);
		result.append(", fuelUsed: ");
		result.append(fuelUsed);
		result.append(", startMileage: ");
		result.append(startMileage);
		result.append(')');
		return result.toString();
	}

} //DeliveryImpl
