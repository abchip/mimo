/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Maint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalQuantity <em>Interval Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalUomId <em>Interval Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMaint#getMaintName <em>Maint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMaint#getMaintTemplateWorkEffortId <em>Maint Template Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductMaintTypeId <em>Product Maint Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMaint#getRepeatCount <em>Repeat Count</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint()
 * @model annotation="mimo-ent-frame help='This is used to specify the details for scheduled maintenance.' title='Product Maintenance' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductMaint extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_IntervalQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getIntervalQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalQuantity <em>Interval Quantity</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_IntervalUomId()
	 * @model keys="uomId"
	 *        annotation="mimo-ent-slot help='UOM for intervalQuantity; if used intervalMeterTypeId is generally not used (ie one or the other)'"
	 * @generated
	 */
	Uom getIntervalUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalUomId <em>Interval Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Uom Id</em>' reference.
	 * @see #getIntervalUomId()
	 * @generated
	 */
	void setIntervalUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Maint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Name</em>' attribute.
	 * @see #setMaintName(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_MaintName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getMaintName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getMaintName <em>Maint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Name</em>' attribute.
	 * @see #getMaintName()
	 * @generated
	 */
	void setMaintName(String value);

	/**
	 * Returns the value of the '<em><b>Maint Template Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Template Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Template Work Effort Id</em>' reference.
	 * @see #setMaintTemplateWorkEffortId(WorkEffort)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_MaintTemplateWorkEffortId()
	 * @model keys="workEffortId"
	 *        annotation="mimo-ent-slot help='Template of Maintenance Plan. WorkEffort may have WorkEffortAssocs for tasks/breakdown detailes'"
	 * @generated
	 */
	WorkEffort getMaintTemplateWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getMaintTemplateWorkEffortId <em>Maint Template Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Template Work Effort Id</em>' reference.
	 * @see #getMaintTemplateWorkEffortId()
	 * @generated
	 */
	void setMaintTemplateWorkEffortId(WorkEffort value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_ProductMaintSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductMaintSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Seq Id</em>' attribute.
	 * @see #getProductMaintSeqId()
	 * @generated
	 */
	void setProductMaintSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Count</em>' attribute.
	 * @see #setRepeatCount(long)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_RepeatCount()
	 * @model annotation="mimo-ent-slot help='If 0 or null means no limit to repeat count; can be used with multiple ProductMaint records for a single ProductMaintType in cases where maintenance intervals are not evenly distributed, or only need to be done once like a break-in period'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getRepeatCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getRepeatCount <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Count</em>' attribute.
	 * @see #getRepeatCount()
	 * @generated
	 */
	void setRepeatCount(long value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Product Maint Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Maint Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Maint Type Id</em>' reference.
	 * @see #setProductMaintTypeId(ProductMaintType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_ProductMaintTypeId()
	 * @model keys="productMaintTypeId"
	 * @generated
	 */
	ProductMaintType getProductMaintTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductMaintTypeId <em>Product Maint Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Type Id</em>' reference.
	 * @see #getProductMaintTypeId()
	 * @generated
	 */
	void setProductMaintTypeId(ProductMaintType value);

	/**
	 * Returns the value of the '<em><b>Interval Meter Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Meter Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Meter Type Id</em>' reference.
	 * @see #setIntervalMeterTypeId(ProductMeterType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_IntervalMeterTypeId()
	 * @model keys="productMeterTypeId"
	 *        annotation="mimo-ent-slot help='Meter Type for intervalQuantity; if used intervalUomId is generally not used (ie one or the other)'"
	 * @generated
	 */
	ProductMeterType getIntervalMeterTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Meter Type Id</em>' reference.
	 * @see #getIntervalMeterTypeId()
	 * @generated
	 */
	void setIntervalMeterTypeId(ProductMeterType value);

} // ProductMaint
