/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Package Route Seg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getBoxNumber <em>Box Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getCodAmount <em>Cod Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getInsuredAmount <em>Insured Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getInternationalInvoice <em>International Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getLabelHtml <em>Label Html</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getLabelImage <em>Label Image</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getLabelIntlSignImage <em>Label Intl Sign Image</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#isLabelPrinted <em>Label Printed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getPackageOtherCost <em>Package Other Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getPackageServiceCost <em>Package Service Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getPackageTransportCost <em>Package Transport Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getTrackingCode <em>Tracking Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentPackageRouteSegImpl extends BizEntityImpl implements ShipmentPackageRouteSeg {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentPackageRouteSegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBoxNumber() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxNumber(String newBoxNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER, newBoxNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCodAmount() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodAmount(BigDecimal newCodAmount) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT, newCodAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getInsuredAmount() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsuredAmount(BigDecimal newInsuredAmount) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT, newInsuredAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getInternationalInvoice() {
		return (byte[])eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternationalInvoice(byte[] newInternationalInvoice) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE, newInternationalInvoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelHtml() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelHtml(String newLabelHtml) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML, newLabelHtml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getLabelImage() {
		return (byte[])eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelImage(byte[] newLabelImage) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE, newLabelImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getLabelIntlSignImage() {
		return (byte[])eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelIntlSignImage(byte[] newLabelIntlSignImage) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE, newLabelIntlSignImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLabelPrinted() {
		return (Boolean)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelPrinted(boolean newLabelPrinted) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED, newLabelPrinted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPackageOtherCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageOtherCost(BigDecimal newPackageOtherCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST, newPackageOtherCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPackageServiceCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageServiceCost(BigDecimal newPackageServiceCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST, newPackageServiceCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPackageTransportCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageTransportCost(BigDecimal newPackageTransportCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST, newPackageTransportCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipmentId() {
		return (Shipment)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(Shipment newShipmentId) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID, newShipmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentPackageSeqId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentPackageSeqId(String newShipmentPackageSeqId) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID, newShipmentPackageSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentRouteSegmentId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentRouteSegmentId(String newShipmentRouteSegmentId) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID, newShipmentRouteSegmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingCode() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCode(String newTrackingCode) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE, newTrackingCode);
	}

} //ShipmentPackageRouteSegImpl
