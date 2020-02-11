/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getProductAssocTypeId <em>Product Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getProductIdTo <em>Product Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getEstimateCalcMethod <em>Estimate Calc Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getRoutingWorkEffortId <em>Routing Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getScrapFactor <em>Scrap Factor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductAssoc#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc()
 * @model annotation="mimo-ent-frame title='Product Association' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductAssoc extends BizEntityTyped<ProductAssocType> {
	/**
	 * Returns the value of the '<em><b>Estimate Calc Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimate Calc Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimate Calc Method</em>' reference.
	 * @see #setEstimateCalcMethod(CustomMethod)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_EstimateCalcMethod()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getEstimateCalcMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getEstimateCalcMethod <em>Estimate Calc Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimate Calc Method</em>' reference.
	 * @see #getEstimateCalcMethod()
	 * @generated
	 */
	void setEstimateCalcMethod(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' attribute.
	 * @see #setInstruction(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_Instruction()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getInstruction();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getInstruction <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' attribute.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_Reason()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Recurrence Info Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Info Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Info Id</em>' reference.
	 * @see #setRecurrenceInfoId(RecurrenceInfo)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_RecurrenceInfoId()
	 * @model keys="recurrenceInfoId"
	 * @generated
	 */
	RecurrenceInfo getRecurrenceInfoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getRecurrenceInfoId <em>Recurrence Info Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info Id</em>' reference.
	 * @see #getRecurrenceInfoId()
	 * @generated
	 */
	void setRecurrenceInfoId(RecurrenceInfo value);

	/**
	 * Returns the value of the '<em><b>Routing Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Work Effort Id</em>' reference.
	 * @see #setRoutingWorkEffortId(WorkEffort)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_RoutingWorkEffortId()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getRoutingWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getRoutingWorkEffortId <em>Routing Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Work Effort Id</em>' reference.
	 * @see #getRoutingWorkEffortId()
	 * @generated
	 */
	void setRoutingWorkEffortId(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Scrap Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scrap Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrap Factor</em>' attribute.
	 * @see #setScrapFactor(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_ScrapFactor()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getScrapFactor();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getScrapFactor <em>Scrap Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrap Factor</em>' attribute.
	 * @see #getScrapFactor()
	 * @generated
	 */
	void setScrapFactor(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Assoc Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Assoc Type Id</em>' reference.
	 * @see #setProductAssocTypeId(ProductAssocType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_ProductAssocTypeId()
	 * @model keys="productAssocTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductAssocType getProductAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getProductAssocTypeId <em>Product Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Assoc Type Id</em>' reference.
	 * @see #getProductAssocTypeId()
	 * @generated
	 */
	void setProductAssocTypeId(ProductAssocType value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Product Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id To</em>' reference.
	 * @see #setProductIdTo(Product)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductAssoc_ProductIdTo()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getProductIdTo <em>Product Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id To</em>' reference.
	 * @see #getProductIdTo()
	 * @generated
	 */
	void setProductIdTo(Product value);

} // ProductAssoc
