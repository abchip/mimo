/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl#getBoxLength <em>Box Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl#getBoxWeight <em>Box Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl#getDimensionUomId <em>Dimension Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl#getWeightUomId <em>Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl#getCarrierShipmentBoxTypes <em>Carrier Shipment Box Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentBoxTypeImpl extends BizEntityImpl implements ShipmentBoxType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getShipmentBoxTypeId() <em>Shipment Box Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentBoxTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_BOX_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentBoxTypeId() <em>Shipment Box Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentBoxTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentBoxTypeId = SHIPMENT_BOX_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getBoxWeight() <em>Box Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BOX_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxWeight() <em>Box Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal boxWeight = BOX_WEIGHT_EDEFAULT;

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
	 * The cached value of the '{@link #getCarrierShipmentBoxTypes() <em>Carrier Shipment Box Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierShipmentBoxTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> carrierShipmentBoxTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_BOX_TYPE;
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
	public BigDecimal getBoxWeight() {
		return boxWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxWeight(BigDecimal newBoxWeight) {
		boxWeight = newBoxWeight;
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
	public String getShipmentBoxTypeId() {
		return shipmentBoxTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentBoxTypeId(String newShipmentBoxTypeId) {
		shipmentBoxTypeId = newShipmentBoxTypeId;
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
	public List<String> getCarrierShipmentBoxTypes() {
		if (carrierShipmentBoxTypes == null) {
			carrierShipmentBoxTypes = new BasicInternalEList<String>(String.class);
		}
		return carrierShipmentBoxTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> defaultProducts() {
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
	public List<String> shipmentPackages() {
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
			case Shipment_Package.SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				return getShipmentBoxTypeId();
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_HEIGHT:
				return getBoxHeight();
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_LENGTH:
				return getBoxLength();
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_WEIGHT:
				return getBoxWeight();
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_WIDTH:
				return getBoxWidth();
			case Shipment_Package.SHIPMENT_BOX_TYPE__DESCRIPTION:
				return getDescription();
			case Shipment_Package.SHIPMENT_BOX_TYPE__DIMENSION_UOM_ID:
				if (resolve) return getDimensionUomId();
				return basicGetDimensionUomId();
			case Shipment_Package.SHIPMENT_BOX_TYPE__WEIGHT_UOM_ID:
				if (resolve) return getWeightUomId();
				return basicGetWeightUomId();
			case Shipment_Package.SHIPMENT_BOX_TYPE__CARRIER_SHIPMENT_BOX_TYPES:
				return getCarrierShipmentBoxTypes();
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
			case Shipment_Package.SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				setShipmentBoxTypeId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_HEIGHT:
				setBoxHeight((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_LENGTH:
				setBoxLength((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_WEIGHT:
				setBoxWeight((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_WIDTH:
				setBoxWidth((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__DIMENSION_UOM_ID:
				setDimensionUomId((Uom)newValue);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__WEIGHT_UOM_ID:
				setWeightUomId((Uom)newValue);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__CARRIER_SHIPMENT_BOX_TYPES:
				getCarrierShipmentBoxTypes().clear();
				getCarrierShipmentBoxTypes().addAll((Collection<? extends String>)newValue);
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
			case Shipment_Package.SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				setShipmentBoxTypeId(SHIPMENT_BOX_TYPE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_HEIGHT:
				setBoxHeight(BOX_HEIGHT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_LENGTH:
				setBoxLength(BOX_LENGTH_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_WEIGHT:
				setBoxWeight(BOX_WEIGHT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_WIDTH:
				setBoxWidth(BOX_WIDTH_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__DIMENSION_UOM_ID:
				setDimensionUomId((Uom)null);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__WEIGHT_UOM_ID:
				setWeightUomId((Uom)null);
				return;
			case Shipment_Package.SHIPMENT_BOX_TYPE__CARRIER_SHIPMENT_BOX_TYPES:
				getCarrierShipmentBoxTypes().clear();
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
			case Shipment_Package.SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID:
				return SHIPMENT_BOX_TYPE_ID_EDEFAULT == null ? shipmentBoxTypeId != null : !SHIPMENT_BOX_TYPE_ID_EDEFAULT.equals(shipmentBoxTypeId);
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_HEIGHT:
				return BOX_HEIGHT_EDEFAULT == null ? boxHeight != null : !BOX_HEIGHT_EDEFAULT.equals(boxHeight);
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_LENGTH:
				return BOX_LENGTH_EDEFAULT == null ? boxLength != null : !BOX_LENGTH_EDEFAULT.equals(boxLength);
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_WEIGHT:
				return BOX_WEIGHT_EDEFAULT == null ? boxWeight != null : !BOX_WEIGHT_EDEFAULT.equals(boxWeight);
			case Shipment_Package.SHIPMENT_BOX_TYPE__BOX_WIDTH:
				return BOX_WIDTH_EDEFAULT == null ? boxWidth != null : !BOX_WIDTH_EDEFAULT.equals(boxWidth);
			case Shipment_Package.SHIPMENT_BOX_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Shipment_Package.SHIPMENT_BOX_TYPE__DIMENSION_UOM_ID:
				return dimensionUomId != null;
			case Shipment_Package.SHIPMENT_BOX_TYPE__WEIGHT_UOM_ID:
				return weightUomId != null;
			case Shipment_Package.SHIPMENT_BOX_TYPE__CARRIER_SHIPMENT_BOX_TYPES:
				return carrierShipmentBoxTypes != null && !carrierShipmentBoxTypes.isEmpty();
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
		result.append(" (shipmentBoxTypeId: ");
		result.append(shipmentBoxTypeId);
		result.append(", boxHeight: ");
		result.append(boxHeight);
		result.append(", boxLength: ");
		result.append(boxLength);
		result.append(", boxWeight: ");
		result.append(boxWeight);
		result.append(", boxWidth: ");
		result.append(boxWidth);
		result.append(", description: ");
		result.append(description);
		result.append(", carrierShipmentBoxTypes: ");
		result.append(carrierShipmentBoxTypes);
		result.append(')');
		return result.toString();
	}

} //ShipmentBoxTypeImpl
