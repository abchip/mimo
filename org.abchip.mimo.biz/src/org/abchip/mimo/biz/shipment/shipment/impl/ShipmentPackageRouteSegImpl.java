/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Package Route Seg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getBoxNumber <em>Box Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getCodAmount <em>Cod Amount</em>}</li>
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
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
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
	 * The default value of the '{@link #getShipmentRouteSegmentId() <em>Shipment Route Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentRouteSegmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentRouteSegmentId() <em>Shipment Route Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentRouteSegmentId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentRouteSegmentId = SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoxNumber() <em>Box Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BOX_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoxNumber() <em>Box Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxNumber()
	 * @generated
	 * @ordered
	 */
	protected String boxNumber = BOX_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodAmount() <em>Cod Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COD_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodAmount() <em>Cod Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal codAmount = COD_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsuredAmount() <em>Insured Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuredAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INSURED_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsuredAmount() <em>Insured Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuredAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal insuredAmount = INSURED_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternationalInvoice() <em>International Invoice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationalInvoice()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] INTERNATIONAL_INVOICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternationalInvoice() <em>International Invoice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationalInvoice()
	 * @generated
	 * @ordered
	 */
	protected byte[] internationalInvoice = INTERNATIONAL_INVOICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelHtml() <em>Label Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelHtml()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_HTML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelHtml() <em>Label Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelHtml()
	 * @generated
	 * @ordered
	 */
	protected String labelHtml = LABEL_HTML_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelImage() <em>Label Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelImage()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] LABEL_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelImage() <em>Label Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelImage()
	 * @generated
	 * @ordered
	 */
	protected byte[] labelImage = LABEL_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelIntlSignImage() <em>Label Intl Sign Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelIntlSignImage()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] LABEL_INTL_SIGN_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelIntlSignImage() <em>Label Intl Sign Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelIntlSignImage()
	 * @generated
	 * @ordered
	 */
	protected byte[] labelIntlSignImage = LABEL_INTL_SIGN_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLabelPrinted() <em>Label Printed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabelPrinted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LABEL_PRINTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLabelPrinted() <em>Label Printed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabelPrinted()
	 * @generated
	 * @ordered
	 */
	protected boolean labelPrinted = LABEL_PRINTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageOtherCost() <em>Package Other Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageOtherCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PACKAGE_OTHER_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageOtherCost() <em>Package Other Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageOtherCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal packageOtherCost = PACKAGE_OTHER_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageServiceCost() <em>Package Service Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageServiceCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PACKAGE_SERVICE_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageServiceCost() <em>Package Service Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageServiceCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal packageServiceCost = PACKAGE_SERVICE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageTransportCost() <em>Package Transport Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageTransportCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PACKAGE_TRANSPORT_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageTransportCost() <em>Package Transport Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageTransportCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal packageTransportCost = PACKAGE_TRANSPORT_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackingCode() <em>Tracking Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCode()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingCode() <em>Tracking Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCode()
	 * @generated
	 * @ordered
	 */
	protected String trackingCode = TRACKING_CODE_EDEFAULT;

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
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

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
		return boxNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxNumber(String newBoxNumber) {
		String oldBoxNumber = boxNumber;
		boxNumber = newBoxNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER, oldBoxNumber, boxNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCodAmount() {
		return codAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodAmount(BigDecimal newCodAmount) {
		BigDecimal oldCodAmount = codAmount;
		codAmount = newCodAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT, oldCodAmount, codAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		Uom oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getInsuredAmount() {
		return insuredAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsuredAmount(BigDecimal newInsuredAmount) {
		BigDecimal oldInsuredAmount = insuredAmount;
		insuredAmount = newInsuredAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT, oldInsuredAmount, insuredAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getInternationalInvoice() {
		return internationalInvoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternationalInvoice(byte[] newInternationalInvoice) {
		byte[] oldInternationalInvoice = internationalInvoice;
		internationalInvoice = newInternationalInvoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE, oldInternationalInvoice, internationalInvoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelHtml() {
		return labelHtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelHtml(String newLabelHtml) {
		String oldLabelHtml = labelHtml;
		labelHtml = newLabelHtml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML, oldLabelHtml, labelHtml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getLabelImage() {
		return labelImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelImage(byte[] newLabelImage) {
		byte[] oldLabelImage = labelImage;
		labelImage = newLabelImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE, oldLabelImage, labelImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getLabelIntlSignImage() {
		return labelIntlSignImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelIntlSignImage(byte[] newLabelIntlSignImage) {
		byte[] oldLabelIntlSignImage = labelIntlSignImage;
		labelIntlSignImage = newLabelIntlSignImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE, oldLabelIntlSignImage, labelIntlSignImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLabelPrinted() {
		return labelPrinted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelPrinted(boolean newLabelPrinted) {
		boolean oldLabelPrinted = labelPrinted;
		labelPrinted = newLabelPrinted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED, oldLabelPrinted, labelPrinted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPackageOtherCost() {
		return packageOtherCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageOtherCost(BigDecimal newPackageOtherCost) {
		BigDecimal oldPackageOtherCost = packageOtherCost;
		packageOtherCost = newPackageOtherCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST, oldPackageOtherCost, packageOtherCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPackageServiceCost() {
		return packageServiceCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageServiceCost(BigDecimal newPackageServiceCost) {
		BigDecimal oldPackageServiceCost = packageServiceCost;
		packageServiceCost = newPackageServiceCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST, oldPackageServiceCost, packageServiceCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPackageTransportCost() {
		return packageTransportCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageTransportCost(BigDecimal newPackageTransportCost) {
		BigDecimal oldPackageTransportCost = packageTransportCost;
		packageTransportCost = newPackageTransportCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST, oldPackageTransportCost, packageTransportCost));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID, oldShipmentId, shipmentId));
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
		Shipment oldShipmentId = shipmentId;
		shipmentId = newShipmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID, oldShipmentId, shipmentId));
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
		String oldShipmentPackageSeqId = shipmentPackageSeqId;
		shipmentPackageSeqId = newShipmentPackageSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID, oldShipmentPackageSeqId, shipmentPackageSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentRouteSegmentId() {
		return shipmentRouteSegmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentRouteSegmentId(String newShipmentRouteSegmentId) {
		String oldShipmentRouteSegmentId = shipmentRouteSegmentId;
		shipmentRouteSegmentId = newShipmentRouteSegmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID, oldShipmentRouteSegmentId, shipmentRouteSegmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingCode() {
		return trackingCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCode(String newTrackingCode) {
		String oldTrackingCode = trackingCode;
		trackingCode = newTrackingCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE, oldTrackingCode, trackingCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID:
				return getShipmentPackageSeqId();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID:
				return getShipmentRouteSegmentId();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER:
				return getBoxNumber();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT:
				return getCodAmount();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT:
				return getInsuredAmount();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE:
				return getInternationalInvoice();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML:
				return getLabelHtml();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE:
				return getLabelImage();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE:
				return getLabelIntlSignImage();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED:
				return isLabelPrinted();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST:
				return getPackageOtherCost();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST:
				return getPackageServiceCost();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST:
				return getPackageTransportCost();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE:
				return getTrackingCode();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID:
				if (resolve) return getShipmentId();
				return basicGetShipmentId();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
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
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID:
				setShipmentPackageSeqId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID:
				setShipmentRouteSegmentId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER:
				setBoxNumber((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT:
				setCodAmount((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT:
				setInsuredAmount((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE:
				setInternationalInvoice((byte[])newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML:
				setLabelHtml((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE:
				setLabelImage((byte[])newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE:
				setLabelIntlSignImage((byte[])newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED:
				setLabelPrinted((Boolean)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST:
				setPackageOtherCost((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST:
				setPackageServiceCost((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST:
				setPackageTransportCost((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE:
				setTrackingCode((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID:
				setShipmentId((Shipment)newValue);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
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
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID:
				setShipmentPackageSeqId(SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID:
				setShipmentRouteSegmentId(SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER:
				setBoxNumber(BOX_NUMBER_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT:
				setCodAmount(COD_AMOUNT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT:
				setInsuredAmount(INSURED_AMOUNT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE:
				setInternationalInvoice(INTERNATIONAL_INVOICE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML:
				setLabelHtml(LABEL_HTML_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE:
				setLabelImage(LABEL_IMAGE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE:
				setLabelIntlSignImage(LABEL_INTL_SIGN_IMAGE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED:
				setLabelPrinted(LABEL_PRINTED_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST:
				setPackageOtherCost(PACKAGE_OTHER_COST_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST:
				setPackageServiceCost(PACKAGE_SERVICE_COST_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST:
				setPackageTransportCost(PACKAGE_TRANSPORT_COST_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE:
				setTrackingCode(TRACKING_CODE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID:
				setShipmentId((Shipment)null);
				return;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
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
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID:
				return SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT == null ? shipmentPackageSeqId != null : !SHIPMENT_PACKAGE_SEQ_ID_EDEFAULT.equals(shipmentPackageSeqId);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID:
				return SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT == null ? shipmentRouteSegmentId != null : !SHIPMENT_ROUTE_SEGMENT_ID_EDEFAULT.equals(shipmentRouteSegmentId);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER:
				return BOX_NUMBER_EDEFAULT == null ? boxNumber != null : !BOX_NUMBER_EDEFAULT.equals(boxNumber);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT:
				return COD_AMOUNT_EDEFAULT == null ? codAmount != null : !COD_AMOUNT_EDEFAULT.equals(codAmount);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT:
				return INSURED_AMOUNT_EDEFAULT == null ? insuredAmount != null : !INSURED_AMOUNT_EDEFAULT.equals(insuredAmount);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE:
				return INTERNATIONAL_INVOICE_EDEFAULT == null ? internationalInvoice != null : !INTERNATIONAL_INVOICE_EDEFAULT.equals(internationalInvoice);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML:
				return LABEL_HTML_EDEFAULT == null ? labelHtml != null : !LABEL_HTML_EDEFAULT.equals(labelHtml);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE:
				return LABEL_IMAGE_EDEFAULT == null ? labelImage != null : !LABEL_IMAGE_EDEFAULT.equals(labelImage);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE:
				return LABEL_INTL_SIGN_IMAGE_EDEFAULT == null ? labelIntlSignImage != null : !LABEL_INTL_SIGN_IMAGE_EDEFAULT.equals(labelIntlSignImage);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED:
				return labelPrinted != LABEL_PRINTED_EDEFAULT;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST:
				return PACKAGE_OTHER_COST_EDEFAULT == null ? packageOtherCost != null : !PACKAGE_OTHER_COST_EDEFAULT.equals(packageOtherCost);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST:
				return PACKAGE_SERVICE_COST_EDEFAULT == null ? packageServiceCost != null : !PACKAGE_SERVICE_COST_EDEFAULT.equals(packageServiceCost);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST:
				return PACKAGE_TRANSPORT_COST_EDEFAULT == null ? packageTransportCost != null : !PACKAGE_TRANSPORT_COST_EDEFAULT.equals(packageTransportCost);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE:
				return TRACKING_CODE_EDEFAULT == null ? trackingCode != null : !TRACKING_CODE_EDEFAULT.equals(trackingCode);
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID:
				return shipmentId != null;
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID:
				return currencyUomId != null;
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
		result.append(", shipmentRouteSegmentId: ");
		result.append(shipmentRouteSegmentId);
		result.append(", boxNumber: ");
		result.append(boxNumber);
		result.append(", codAmount: ");
		result.append(codAmount);
		result.append(", insuredAmount: ");
		result.append(insuredAmount);
		result.append(", internationalInvoice: ");
		result.append(internationalInvoice);
		result.append(", labelHtml: ");
		result.append(labelHtml);
		result.append(", labelImage: ");
		result.append(labelImage);
		result.append(", labelIntlSignImage: ");
		result.append(labelIntlSignImage);
		result.append(", labelPrinted: ");
		result.append(labelPrinted);
		result.append(", packageOtherCost: ");
		result.append(packageOtherCost);
		result.append(", packageServiceCost: ");
		result.append(packageServiceCost);
		result.append(", packageTransportCost: ");
		result.append(packageTransportCost);
		result.append(", trackingCode: ");
		result.append(trackingCode);
		result.append(')');
		return result.toString();
	}

} //ShipmentPackageRouteSegImpl
