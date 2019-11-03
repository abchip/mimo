/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import java.math.BigDecimal;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxLength <em>Box Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxWeight <em>Box Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getDimensionUomId <em>Dimension Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getWeightUomId <em>Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getCarrierShipmentBoxTypes <em>Carrier Shipment Box Types</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ShipmentBoxType extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Box Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Height</em>' attribute.
	 * @see #setBoxHeight(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType_BoxHeight()
	 * @model
	 * @generated
	 */
	BigDecimal getBoxHeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxHeight <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Height</em>' attribute.
	 * @see #getBoxHeight()
	 * @generated
	 */
	void setBoxHeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Box Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Length</em>' attribute.
	 * @see #setBoxLength(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType_BoxLength()
	 * @model
	 * @generated
	 */
	BigDecimal getBoxLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxLength <em>Box Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Length</em>' attribute.
	 * @see #getBoxLength()
	 * @generated
	 */
	void setBoxLength(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Box Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Weight</em>' attribute.
	 * @see #setBoxWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType_BoxWeight()
	 * @model
	 * @generated
	 */
	BigDecimal getBoxWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxWeight <em>Box Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Weight</em>' attribute.
	 * @see #getBoxWeight()
	 * @generated
	 */
	void setBoxWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Box Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Width</em>' attribute.
	 * @see #setBoxWidth(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType_BoxWidth()
	 * @model
	 * @generated
	 */
	BigDecimal getBoxWidth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxWidth <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Width</em>' attribute.
	 * @see #getBoxWidth()
	 * @generated
	 */
	void setBoxWidth(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Dimension Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Uom Id</em>' attribute.
	 * @see #setDimensionUomId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType_DimensionUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getDimensionUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getDimensionUomId <em>Dimension Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Uom Id</em>' attribute.
	 * @see #getDimensionUomId()
	 * @generated
	 */
	void setDimensionUomId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Box Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Box Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Box Type Id</em>' attribute.
	 * @see #setShipmentBoxTypeId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType_ShipmentBoxTypeId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShipmentBoxTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Box Type Id</em>' attribute.
	 * @see #getShipmentBoxTypeId()
	 * @generated
	 */
	void setShipmentBoxTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Weight Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Uom Id</em>' attribute.
	 * @see #setWeightUomId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType_WeightUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getWeightUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getWeightUomId <em>Weight Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Uom Id</em>' attribute.
	 * @see #getWeightUomId()
	 * @generated
	 */
	void setWeightUomId(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Shipment Box Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Shipment Box Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Shipment Box Types</em>' attribute list.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentBoxType_CarrierShipmentBoxTypes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CarrierShipmentBoxType'"
	 * @generated
	 */
	List<String> getCarrierShipmentBoxTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='defaultShipmentBoxTypeId'"
	 * @generated
	 */
	List<String> defaultProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentPackage' route='shipmentBoxTypeId'"
	 * @generated
	 */
	List<String> shipmentPackages();

} // ShipmentBoxType
