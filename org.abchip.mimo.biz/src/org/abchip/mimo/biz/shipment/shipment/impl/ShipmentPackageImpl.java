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
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType;
import org.abchip.mimo.biz.shipment.shipment.ShipmentPackage;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getBoxLength <em>Box Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getInsuredValue <em>Insured Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getDimensionUomId <em>Dimension Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl#getWeightUomId <em>Weight Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentPackageImpl extends BizEntityImpl implements ShipmentPackage {
	/**
	 * The default value of the '{@link #getShipmentPackageSeqId() <em>Shipment Package Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentPackageSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentPackageSeqId() <em>Shipment Package Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentPackageSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentPackageSeqId = SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoxHeight() <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BOX_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxHeight() <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxHeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal boxHeight = BOX_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoxLength() <em>Box Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BOX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxLength() <em>Box Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxLength()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal boxLength = BOX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoxWidth() <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BOX_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxWidth() <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWidth()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal boxWidth = BOX_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected Date dateCreated = DATE_CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsuredValue() <em>Insured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuredValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INSURED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsuredValue() <em>Insured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuredValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal insuredValue = INSURED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipmentId;

	/**
	 * The cached value of the '{@link #getShipmentBoxTypeId() <em>Shipment Box Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentBoxTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentBoxType shipmentBoxTypeId;

	/**
	 * The cached value of the '{@link #getDimensionUomId() <em>Dimension Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom dimensionUomId;

	/**
	 * The cached value of the '{@link #getWeightUomId() <em>Weight Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom weightUomId;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipmentId() {
		if (shipmentId != null && ((EObject)shipmentId).eIsProxy()) {
			InternalEObject oldShipmentId = (InternalEObject)shipmentId;
			shipmentId = (Shipment)eResolveProxy(oldShipmentId);
			if (shipmentId != oldShipmentId) {
			}
		}
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(Shipment newShipmentId) {
		shipmentId = newShipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentPackageSeqId() {
		return shipmentPackageSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentPackageSeqId(String newShipmentPackageSeqId) {
		shipmentPackageSeqId = newShipmentPackageSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBoxHeight() {
		return boxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxHeight(BigDecimal newBoxHeight) {
		boxHeight = newBoxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBoxLength() {
		return boxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxLength(BigDecimal newBoxLength) {
		boxLength = newBoxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBoxWidth() {
		return boxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxWidth(BigDecimal newBoxWidth) {
		boxWidth = newBoxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateCreated(Date newDateCreated) {
		dateCreated = newDateCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDimensionUomId() {
		if (dimensionUomId != null && ((EObject)dimensionUomId).eIsProxy()) {
			InternalEObject oldDimensionUomId = (InternalEObject)dimensionUomId;
			dimensionUomId = (Uom)eResolveProxy(oldDimensionUomId);
			if (dimensionUomId != oldDimensionUomId) {
			}
		}
		return dimensionUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetDimensionUomId() {
		return dimensionUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDimensionUomId(Uom newDimensionUomId) {
		dimensionUomId = newDimensionUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getInsuredValue() {
		return insuredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsuredValue(BigDecimal newInsuredValue) {
		insuredValue = newInsuredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentBoxType getShipmentBoxTypeId() {
		if (shipmentBoxTypeId != null && ((EObject)shipmentBoxTypeId).eIsProxy()) {
			InternalEObject oldShipmentBoxTypeId = (InternalEObject)shipmentBoxTypeId;
			shipmentBoxTypeId = (ShipmentBoxType)eResolveProxy(oldShipmentBoxTypeId);
			if (shipmentBoxTypeId != oldShipmentBoxTypeId) {
			}
		}
		return shipmentBoxTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentBoxType basicGetShipmentBoxTypeId() {
		return shipmentBoxTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentBoxTypeId(ShipmentBoxType newShipmentBoxTypeId) {
		shipmentBoxTypeId = newShipmentBoxTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(BigDecimal newWeight) {
		weight = newWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getWeightUomId() {
		if (weightUomId != null && ((EObject)weightUomId).eIsProxy()) {
			InternalEObject oldWeightUomId = (InternalEObject)weightUomId;
			weightUomId = (Uom)eResolveProxy(oldWeightUomId);
			if (weightUomId != oldWeightUomId) {
			}
		}
		return weightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetWeightUomId() {
		return weightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUomId(Uom newWeightUomId) {
		weightUomId = newWeightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_PACKAGE_SEQ_ID:
				return getShipmentPackageSeqId();
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_HEIGHT:
				return getBoxHeight();
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_LENGTH:
				return getBoxLength();
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_WIDTH:
				return getBoxWidth();
			case Shipment_Package.SHIPMENT_PACKAGE__DATE_CREATED:
				return getDateCreated();
			case Shipment_Package.SHIPMENT_PACKAGE__INSURED_VALUE:
				return getInsuredValue();
			case Shipment_Package.SHIPMENT_PACKAGE__WEIGHT:
				return getWeight();
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_ID:
				if (resolve) return getShipmentId();
				return basicGetShipmentId();
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_BOX_TYPE_ID:
				if (resolve) return getShipmentBoxTypeId();
				return basicGetShipmentBoxTypeId();
			case Shipment_Package.SHIPMENT_PACKAGE__DIMENSION_UOM_ID:
				if (resolve) return getDimensionUomId();
				return basicGetDimensionUomId();
			case Shipment_Package.SHIPMENT_PACKAGE__WEIGHT_UOM_ID:
				if (resolve) return getWeightUomId();
				return basicGetWeightUomId();
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
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_PACKAGE_SEQ_ID:
				setShipmentPackageSeqId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_HEIGHT:
				setBoxHeight((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_LENGTH:
				setBoxLength((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_WIDTH:
				setBoxWidth((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__DATE_CREATED:
				setDateCreated((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__INSURED_VALUE:
				setInsuredValue((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__WEIGHT:
				setWeight((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_ID:
				setShipmentId((Shipment)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_BOX_TYPE_ID:
				setShipmentBoxTypeId((ShipmentBoxType)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__DIMENSION_UOM_ID:
				setDimensionUomId((Uom)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__WEIGHT_UOM_ID:
				setWeightUomId((Uom)newValue);
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
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_PACKAGE_SEQ_ID:
				setShipmentPackageSeqId(SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_HEIGHT:
				setBoxHeight(BOX_HEIGHT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_LENGTH:
				setBoxLength(BOX_LENGTH_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_WIDTH:
				setBoxWidth(BOX_WIDTH_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__INSURED_VALUE:
				setInsuredValue(INSURED_VALUE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_ID:
				setShipmentId((Shipment)null);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_BOX_TYPE_ID:
				setShipmentBoxTypeId((ShipmentBoxType)null);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__DIMENSION_UOM_ID:
				setDimensionUomId((Uom)null);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE__WEIGHT_UOM_ID:
				setWeightUomId((Uom)null);
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
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_PACKAGE_SEQ_ID:
				return SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT == null ? shipmentPackageSeqId != null : !SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT.equals(shipmentPackageSeqId);
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_HEIGHT:
				return BOX_HEIGHT_EDEFAULT == null ? boxHeight != null : !BOX_HEIGHT_EDEFAULT.equals(boxHeight);
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_LENGTH:
				return BOX_LENGTH_EDEFAULT == null ? boxLength != null : !BOX_LENGTH_EDEFAULT.equals(boxLength);
			case Shipment_Package.SHIPMENT_PACKAGE__BOX_WIDTH:
				return BOX_WIDTH_EDEFAULT == null ? boxWidth != null : !BOX_WIDTH_EDEFAULT.equals(boxWidth);
			case Shipment_Package.SHIPMENT_PACKAGE__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case Shipment_Package.SHIPMENT_PACKAGE__INSURED_VALUE:
				return INSURED_VALUE_EDEFAULT == null ? insuredValue != null : !INSURED_VALUE_EDEFAULT.equals(insuredValue);
			case Shipment_Package.SHIPMENT_PACKAGE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_ID:
				return shipmentId != null;
			case Shipment_Package.SHIPMENT_PACKAGE__SHIPMENT_BOX_TYPE_ID:
				return shipmentBoxTypeId != null;
			case Shipment_Package.SHIPMENT_PACKAGE__DIMENSION_UOM_ID:
				return dimensionUomId != null;
			case Shipment_Package.SHIPMENT_PACKAGE__WEIGHT_UOM_ID:
				return weightUomId != null;
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
		result.append(" (shipmentPackageSeqId: ");
		result.append(shipmentPackageSeqId);
		result.append(", boxHeight: ");
		result.append(boxHeight);
		result.append(", boxLength: ");
		result.append(boxLength);
		result.append(", boxWidth: ");
		result.append(boxWidth);
		result.append(", dateCreated: ");
		result.append(dateCreated);
		result.append(", insuredValue: ");
		result.append(insuredValue);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //ShipmentPackageImpl
