/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.product.product.ProductMaintType;
import org.abchip.mimo.biz.product.product.ProductMeterType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset Maint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalQuantity <em>Interval Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintTypeId <em>Product Maint Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getScheduleWorkEffortId <em>Schedule Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalUomId <em>Interval Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getPurchaseOrderId <em>Purchase Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint()
 * @model
 * @generated
 */
public interface FixedAssetMaint extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Interval Meter Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Meter Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Meter Type Id</em>' reference.
	 * @see #setIntervalMeterTypeId(ProductMeterType)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_IntervalMeterTypeId()
	 * @model keys="productMeterTypeId"
	 * @generated
	 */
	ProductMeterType getIntervalMeterTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Meter Type Id</em>' reference.
	 * @see #getIntervalMeterTypeId()
	 * @generated
	 */
	void setIntervalMeterTypeId(ProductMeterType value);

	/**
	 * Returns the value of the '<em><b>Interval Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Quantity</em>' attribute.
	 * @see #setIntervalQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_IntervalQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getIntervalQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalQuantity <em>Interval Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Quantity</em>' attribute.
	 * @see #getIntervalQuantity()
	 * @generated
	 */
	void setIntervalQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Interval Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Uom Id</em>' reference.
	 * @see #setIntervalUomId(Uom)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_IntervalUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getIntervalUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalUomId <em>Interval Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Uom Id</em>' reference.
	 * @see #getIntervalUomId()
	 * @generated
	 */
	void setIntervalUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Maint Hist Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Hist Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Hist Seq Id</em>' attribute.
	 * @see #setMaintHistSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_MaintHistSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getMaintHistSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getMaintHistSeqId <em>Maint Hist Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Hist Seq Id</em>' attribute.
	 * @see #getMaintHistSeqId()
	 * @generated
	 */
	void setMaintHistSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Maint Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Maint Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Maint Seq Id</em>' attribute.
	 * @see #setProductMaintSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_ProductMaintSeqId()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getProductMaintSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Seq Id</em>' attribute.
	 * @see #getProductMaintSeqId()
	 * @generated
	 */
	void setProductMaintSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Maint Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Maint Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Maint Type Id</em>' reference.
	 * @see #setProductMaintTypeId(ProductMaintType)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_ProductMaintTypeId()
	 * @model keys="productMaintTypeId"
	 * @generated
	 */
	ProductMaintType getProductMaintTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintTypeId <em>Product Maint Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Type Id</em>' reference.
	 * @see #getProductMaintTypeId()
	 * @generated
	 */
	void setProductMaintTypeId(ProductMaintType value);

	/**
	 * Returns the value of the '<em><b>Purchase Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Order Id</em>' reference.
	 * @see #setPurchaseOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_PurchaseOrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getPurchaseOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getPurchaseOrderId <em>Purchase Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Order Id</em>' reference.
	 * @see #getPurchaseOrderId()
	 * @generated
	 */
	void setPurchaseOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Schedule Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Work Effort Id</em>' reference.
	 * @see #setScheduleWorkEffortId(WorkEffort)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_ScheduleWorkEffortId()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getScheduleWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getScheduleWorkEffortId <em>Schedule Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Work Effort Id</em>' reference.
	 * @see #getScheduleWorkEffortId()
	 * @generated
	 */
	void setScheduleWorkEffortId(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #setFixedAssetId(FixedAsset)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_FixedAssetId()
	 * @model keys="fixedAssetId"
	 * @generated
	 */
	FixedAsset getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getFixedAssetId <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(FixedAsset value);

} // FixedAssetMaint
