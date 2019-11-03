/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import java.math.BigDecimal;
import java.util.Date;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxLength <em>Box Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getDimensionUomId <em>Dimension Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getInsuredValue <em>Insured Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getWeightUomId <em>Weight Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage()
 * @model
 * @generated
 */
public interface ShipmentPackage extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Id</em>' attribute.
	 * @see #setShipmentId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_ShipmentId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Shipment'"
	 * @generated
	 */
	String getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentId <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' attribute.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Package Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Package Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Package Seq Id</em>' attribute.
	 * @see #setShipmentPackageSeqId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_ShipmentPackageSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShipmentPackageSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Package Seq Id</em>' attribute.
	 * @see #getShipmentPackageSeqId()
	 * @generated
	 */
	void setShipmentPackageSeqId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_BoxHeight()
	 * @model
	 * @generated
	 */
	BigDecimal getBoxHeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxHeight <em>Box Height</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_BoxLength()
	 * @model
	 * @generated
	 */
	BigDecimal getBoxLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxLength <em>Box Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Length</em>' attribute.
	 * @see #getBoxLength()
	 * @generated
	 */
	void setBoxLength(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_BoxWidth()
	 * @model
	 * @generated
	 */
	BigDecimal getBoxWidth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxWidth <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Width</em>' attribute.
	 * @see #getBoxWidth()
	 * @generated
	 */
	void setBoxWidth(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(Date)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_DateCreated()
	 * @model
	 * @generated
	 */
	Date getDateCreated();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(Date value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_DimensionUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getDimensionUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getDimensionUomId <em>Dimension Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Uom Id</em>' attribute.
	 * @see #getDimensionUomId()
	 * @generated
	 */
	void setDimensionUomId(String value);

	/**
	 * Returns the value of the '<em><b>Insured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insured Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insured Value</em>' attribute.
	 * @see #setInsuredValue(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_InsuredValue()
	 * @model
	 * @generated
	 */
	BigDecimal getInsuredValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getInsuredValue <em>Insured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insured Value</em>' attribute.
	 * @see #getInsuredValue()
	 * @generated
	 */
	void setInsuredValue(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_ShipmentBoxTypeId()
	 * @model annotation="mimo-ent-domain frame='ShipmentBoxType'"
	 * @generated
	 */
	String getShipmentBoxTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Box Type Id</em>' attribute.
	 * @see #getShipmentBoxTypeId()
	 * @generated
	 */
	void setShipmentBoxTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_Weight()
	 * @model
	 * @generated
	 */
	BigDecimal getWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackage_WeightUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getWeightUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getWeightUomId <em>Weight Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Uom Id</em>' attribute.
	 * @see #getWeightUomId()
	 * @generated
	 */
	void setWeightUomId(String value);

} // ShipmentPackage
