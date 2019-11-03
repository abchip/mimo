/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntityTyped;

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
 * @model
 * @generated
 */
public interface ProductMaint extends BizEntityTyped<ProductMaintType> {
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
	 * @model
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
	 * Returns the value of the '<em><b>Interval Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Uom Id</em>' attribute.
	 * @see #setIntervalUomId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_IntervalUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getIntervalUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalUomId <em>Interval Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Uom Id</em>' attribute.
	 * @see #getIntervalUomId()
	 * @generated
	 */
	void setIntervalUomId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Maint Template Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Template Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Template Work Effort Id</em>' attribute.
	 * @see #setMaintTemplateWorkEffortId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_MaintTemplateWorkEffortId()
	 * @model annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getMaintTemplateWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getMaintTemplateWorkEffortId <em>Maint Template Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Template Work Effort Id</em>' attribute.
	 * @see #getMaintTemplateWorkEffortId()
	 * @generated
	 */
	void setMaintTemplateWorkEffortId(String value);

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
	 * @model annotation="mimo-ent-slot key='true'"
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
	 * @model
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
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_ProductId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Product Maint Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Maint Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Maint Type Id</em>' attribute.
	 * @see #setProductMaintTypeId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_ProductMaintTypeId()
	 * @model annotation="mimo-ent-domain frame='ProductMaintType'"
	 * @generated
	 */
	String getProductMaintTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductMaintTypeId <em>Product Maint Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Type Id</em>' attribute.
	 * @see #getProductMaintTypeId()
	 * @generated
	 */
	void setProductMaintTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Interval Meter Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Meter Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Meter Type Id</em>' attribute.
	 * @see #setIntervalMeterTypeId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMaint_IntervalMeterTypeId()
	 * @model annotation="mimo-ent-domain frame='ProductMeterType'"
	 * @generated
	 */
	String getIntervalMeterTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Meter Type Id</em>' attribute.
	 * @see #getIntervalMeterTypeId()
	 * @generated
	 */
	void setIntervalMeterTypeId(String value);

} // ProductMaint
