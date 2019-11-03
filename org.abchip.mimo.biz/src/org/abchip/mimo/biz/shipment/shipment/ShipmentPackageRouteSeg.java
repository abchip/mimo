/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Package Route Seg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getBoxNumber <em>Box Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getCodAmount <em>Cod Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getInsuredAmount <em>Insured Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getInternationalInvoice <em>International Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelHtml <em>Label Html</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelImage <em>Label Image</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelIntlSignImage <em>Label Intl Sign Image</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#isLabelPrinted <em>Label Printed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageOtherCost <em>Package Other Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageServiceCost <em>Package Service Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageTransportCost <em>Package Transport Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getTrackingCode <em>Tracking Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg()
 * @model
 * @generated
 */
public interface ShipmentPackageRouteSeg extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Box Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Number</em>' attribute.
	 * @see #setBoxNumber(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_BoxNumber()
	 * @model
	 * @generated
	 */
	String getBoxNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getBoxNumber <em>Box Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Number</em>' attribute.
	 * @see #getBoxNumber()
	 * @generated
	 */
	void setBoxNumber(String value);

	/**
	 * Returns the value of the '<em><b>Cod Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Amount</em>' attribute.
	 * @see #setCodAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_CodAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getCodAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getCodAmount <em>Cod Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Amount</em>' attribute.
	 * @see #getCodAmount()
	 * @generated
	 */
	void setCodAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Insured Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insured Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insured Amount</em>' attribute.
	 * @see #setInsuredAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_InsuredAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getInsuredAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getInsuredAmount <em>Insured Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insured Amount</em>' attribute.
	 * @see #getInsuredAmount()
	 * @generated
	 */
	void setInsuredAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>International Invoice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>International Invoice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>International Invoice</em>' attribute.
	 * @see #setInternationalInvoice(byte[])
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_InternationalInvoice()
	 * @model
	 * @generated
	 */
	byte[] getInternationalInvoice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getInternationalInvoice <em>International Invoice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>International Invoice</em>' attribute.
	 * @see #getInternationalInvoice()
	 * @generated
	 */
	void setInternationalInvoice(byte[] value);

	/**
	 * Returns the value of the '<em><b>Label Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Html</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Html</em>' attribute.
	 * @see #setLabelHtml(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_LabelHtml()
	 * @model
	 * @generated
	 */
	String getLabelHtml();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelHtml <em>Label Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Html</em>' attribute.
	 * @see #getLabelHtml()
	 * @generated
	 */
	void setLabelHtml(String value);

	/**
	 * Returns the value of the '<em><b>Label Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Image</em>' attribute.
	 * @see #setLabelImage(byte[])
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_LabelImage()
	 * @model
	 * @generated
	 */
	byte[] getLabelImage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelImage <em>Label Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Image</em>' attribute.
	 * @see #getLabelImage()
	 * @generated
	 */
	void setLabelImage(byte[] value);

	/**
	 * Returns the value of the '<em><b>Label Intl Sign Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Intl Sign Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Intl Sign Image</em>' attribute.
	 * @see #setLabelIntlSignImage(byte[])
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_LabelIntlSignImage()
	 * @model
	 * @generated
	 */
	byte[] getLabelIntlSignImage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelIntlSignImage <em>Label Intl Sign Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Intl Sign Image</em>' attribute.
	 * @see #getLabelIntlSignImage()
	 * @generated
	 */
	void setLabelIntlSignImage(byte[] value);

	/**
	 * Returns the value of the '<em><b>Label Printed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Printed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Printed</em>' attribute.
	 * @see #setLabelPrinted(boolean)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_LabelPrinted()
	 * @model
	 * @generated
	 */
	boolean isLabelPrinted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#isLabelPrinted <em>Label Printed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Printed</em>' attribute.
	 * @see #isLabelPrinted()
	 * @generated
	 */
	void setLabelPrinted(boolean value);

	/**
	 * Returns the value of the '<em><b>Package Other Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Other Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Other Cost</em>' attribute.
	 * @see #setPackageOtherCost(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_PackageOtherCost()
	 * @model
	 * @generated
	 */
	BigDecimal getPackageOtherCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageOtherCost <em>Package Other Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Other Cost</em>' attribute.
	 * @see #getPackageOtherCost()
	 * @generated
	 */
	void setPackageOtherCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Package Service Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Service Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Service Cost</em>' attribute.
	 * @see #setPackageServiceCost(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_PackageServiceCost()
	 * @model
	 * @generated
	 */
	BigDecimal getPackageServiceCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageServiceCost <em>Package Service Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Service Cost</em>' attribute.
	 * @see #getPackageServiceCost()
	 * @generated
	 */
	void setPackageServiceCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Package Transport Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Transport Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Transport Cost</em>' attribute.
	 * @see #setPackageTransportCost(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_PackageTransportCost()
	 * @model
	 * @generated
	 */
	BigDecimal getPackageTransportCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageTransportCost <em>Package Transport Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Transport Cost</em>' attribute.
	 * @see #getPackageTransportCost()
	 * @generated
	 */
	void setPackageTransportCost(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_ShipmentId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Shipment'"
	 * @generated
	 */
	String getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentId <em>Shipment Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_ShipmentPackageSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShipmentPackageSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Package Seq Id</em>' attribute.
	 * @see #getShipmentPackageSeqId()
	 * @generated
	 */
	void setShipmentPackageSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Route Segment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Route Segment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Route Segment Id</em>' attribute.
	 * @see #setShipmentRouteSegmentId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_ShipmentRouteSegmentId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShipmentRouteSegmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Route Segment Id</em>' attribute.
	 * @see #getShipmentRouteSegmentId()
	 * @generated
	 */
	void setShipmentRouteSegmentId(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code</em>' attribute.
	 * @see #setTrackingCode(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentPackageRouteSeg_TrackingCode()
	 * @model
	 * @generated
	 */
	String getTrackingCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getTrackingCode <em>Tracking Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Code</em>' attribute.
	 * @see #getTrackingCode()
	 * @generated
	 */
	void setTrackingCode(String value);

} // ShipmentPackageRouteSeg
