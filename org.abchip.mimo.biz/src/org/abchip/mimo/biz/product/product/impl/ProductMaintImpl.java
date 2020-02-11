/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductMaint;
import org.abchip.mimo.biz.product.product.ProductMaintType;
import org.abchip.mimo.biz.product.product.ProductMeterType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Maint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getProductMaintSeqId <em>Product Maint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getIntervalQuantity <em>Interval Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getIntervalUomId <em>Interval Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getMaintName <em>Maint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getMaintTemplateWorkEffortId <em>Maint Template Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getProductMaintTypeId <em>Product Maint Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getRepeatCount <em>Repeat Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductMaintImpl extends BizEntityImpl implements ProductMaint {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductMaintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_MAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getIntervalQuantity() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT_MAINT__INTERVAL_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalQuantity(BigDecimal newIntervalQuantity) {
		eSet(ProductPackage.Literals.PRODUCT_MAINT__INTERVAL_QUANTITY, newIntervalQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getIntervalUomId() {
		return (Uom)eGet(ProductPackage.Literals.PRODUCT_MAINT__INTERVAL_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalUomId(Uom newIntervalUomId) {
		eSet(ProductPackage.Literals.PRODUCT_MAINT__INTERVAL_UOM_ID, newIntervalUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaintName() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_MAINT__MAINT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintName(String newMaintName) {
		eSet(ProductPackage.Literals.PRODUCT_MAINT__MAINT_NAME, newMaintName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getMaintTemplateWorkEffortId() {
		return (WorkEffort)eGet(ProductPackage.Literals.PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintTemplateWorkEffortId(WorkEffort newMaintTemplateWorkEffortId) {
		eSet(ProductPackage.Literals.PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID, newMaintTemplateWorkEffortId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductMaintSeqId() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductMaintSeqId(String newProductMaintSeqId) {
		eSet(ProductPackage.Literals.PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID, newProductMaintSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRepeatCount() {
		return (Long)eGet(ProductPackage.Literals.PRODUCT_MAINT__REPEAT_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatCount(long newRepeatCount) {
		eSet(ProductPackage.Literals.PRODUCT_MAINT__REPEAT_COUNT, newRepeatCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(ProductPackage.Literals.PRODUCT_MAINT__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(ProductPackage.Literals.PRODUCT_MAINT__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductMaintType getProductMaintTypeId() {
		return (ProductMaintType)eGet(ProductPackage.Literals.PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductMaintTypeId(ProductMaintType newProductMaintTypeId) {
		eSet(ProductPackage.Literals.PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID, newProductMaintTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductMeterType getIntervalMeterTypeId() {
		return (ProductMeterType)eGet(ProductPackage.Literals.PRODUCT_MAINT__INTERVAL_METER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalMeterTypeId(ProductMeterType newIntervalMeterTypeId) {
		eSet(ProductPackage.Literals.PRODUCT_MAINT__INTERVAL_METER_TYPE_ID, newIntervalMeterTypeId);
	}

} //ProductMaintImpl
