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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset Maint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalQuantity <em>Interval Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalUomId <em>Interval Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintTypeId <em>Product Maint Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getPurchaseOrderId <em>Purchase Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getScheduleWorkEffortId <em>Schedule Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint()
 * @model
 * @generated
 */
public interface FixedAssetMaint extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Interval Meter Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Meter Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Meter Type Id</em>' attribute.
	 * @see #setIntervalMeterTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_IntervalMeterTypeId()
	 * @model annotation="mimo-ent-domain frame='ProductMeterType'"
	 * @generated
	 */
	String getIntervalMeterTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Meter Type Id</em>' attribute.
	 * @see #getIntervalMeterTypeId()
	 * @generated
	 */
	void setIntervalMeterTypeId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Interval Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Uom Id</em>' attribute.
	 * @see #setIntervalUomId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_IntervalUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getIntervalUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalUomId <em>Interval Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Uom Id</em>' attribute.
	 * @see #getIntervalUomId()
	 * @generated
	 */
	void setIntervalUomId(String value);

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
	 * @model annotation="mimo-ent-slot key='true'"
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
	 * @model
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
	 * Returns the value of the '<em><b>Product Maint Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Maint Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Maint Type Id</em>' attribute.
	 * @see #setProductMaintTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_ProductMaintTypeId()
	 * @model annotation="mimo-ent-domain frame='ProductMaintType'"
	 * @generated
	 */
	String getProductMaintTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintTypeId <em>Product Maint Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Type Id</em>' attribute.
	 * @see #getProductMaintTypeId()
	 * @generated
	 */
	void setProductMaintTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Purchase Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Order Id</em>' attribute.
	 * @see #setPurchaseOrderId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_PurchaseOrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getPurchaseOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getPurchaseOrderId <em>Purchase Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Order Id</em>' attribute.
	 * @see #getPurchaseOrderId()
	 * @generated
	 */
	void setPurchaseOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Schedule Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Work Effort Id</em>' attribute.
	 * @see #setScheduleWorkEffortId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_ScheduleWorkEffortId()
	 * @model annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getScheduleWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getScheduleWorkEffortId <em>Schedule Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Work Effort Id</em>' attribute.
	 * @see #getScheduleWorkEffortId()
	 * @generated
	 */
	void setScheduleWorkEffortId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_FixedAssetId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='FixedAsset'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

} // FixedAssetMaint
