/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductGroupOrder;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.service.schedule.JobSandbox;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Group Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl#getGroupOrderId <em>Group Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl#getReqOrderQty <em>Req Order Qty</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl#getSoldOrderQty <em>Sold Order Qty</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl#getJobId <em>Job Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductGroupOrderImpl extends BizEntityImpl implements ProductGroupOrder {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getGroupOrderId() <em>Group Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupOrderId() <em>Group Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupOrderId()
	 * @generated
	 * @ordered
	 */
	protected String groupOrderId = GROUP_ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqOrderQty() <em>Req Order Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqOrderQty()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REQ_ORDER_QTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqOrderQty() <em>Req Order Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqOrderQty()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reqOrderQty = REQ_ORDER_QTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoldOrderQty() <em>Sold Order Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldOrderQty()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SOLD_ORDER_QTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoldOrderQty() <em>Sold Order Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldOrderQty()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal soldOrderQty = SOLD_ORDER_QTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getJobId() <em>Job Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobId()
	 * @generated
	 * @ordered
	 */
	protected JobSandbox jobId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductGroupOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_GROUP_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_GROUP_ORDER__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupOrderId() {
		return groupOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupOrderId(String newGroupOrderId) {
		String oldGroupOrderId = groupOrderId;
		groupOrderId = newGroupOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_GROUP_ORDER__GROUP_ORDER_ID, oldGroupOrderId, groupOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobSandbox getJobId() {
		if (jobId != null && ((EObject)jobId).eIsProxy()) {
			InternalEObject oldJobId = (InternalEObject)jobId;
			jobId = (JobSandbox)eResolveProxy(oldJobId);
			if (jobId != oldJobId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_GROUP_ORDER__JOB_ID, oldJobId, jobId));
			}
		}
		return jobId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSandbox basicGetJobId() {
		return jobId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobId(JobSandbox newJobId) {
		JobSandbox oldJobId = jobId;
		jobId = newJobId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_GROUP_ORDER__JOB_ID, oldJobId, jobId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReqOrderQty() {
		return reqOrderQty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReqOrderQty(BigDecimal newReqOrderQty) {
		BigDecimal oldReqOrderQty = reqOrderQty;
		reqOrderQty = newReqOrderQty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_GROUP_ORDER__REQ_ORDER_QTY, oldReqOrderQty, reqOrderQty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSoldOrderQty() {
		return soldOrderQty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoldOrderQty(BigDecimal newSoldOrderQty) {
		BigDecimal oldSoldOrderQty = soldOrderQty;
		soldOrderQty = newSoldOrderQty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_GROUP_ORDER__SOLD_ORDER_QTY, oldSoldOrderQty, soldOrderQty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_GROUP_ORDER__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_GROUP_ORDER__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_GROUP_ORDER__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_GROUP_ORDER__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_GROUP_ORDER__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_GROUP_ORDER__GROUP_ORDER_ID:
				return getGroupOrderId();
			case ProductPackage.PRODUCT_GROUP_ORDER__FROM_DATE:
				return getFromDate();
			case ProductPackage.PRODUCT_GROUP_ORDER__REQ_ORDER_QTY:
				return getReqOrderQty();
			case ProductPackage.PRODUCT_GROUP_ORDER__SOLD_ORDER_QTY:
				return getSoldOrderQty();
			case ProductPackage.PRODUCT_GROUP_ORDER__THRU_DATE:
				return getThruDate();
			case ProductPackage.PRODUCT_GROUP_ORDER__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case ProductPackage.PRODUCT_GROUP_ORDER__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case ProductPackage.PRODUCT_GROUP_ORDER__JOB_ID:
				if (resolve) return getJobId();
				return basicGetJobId();
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
			case ProductPackage.PRODUCT_GROUP_ORDER__GROUP_ORDER_ID:
				setGroupOrderId((String)newValue);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__REQ_ORDER_QTY:
				setReqOrderQty((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__SOLD_ORDER_QTY:
				setSoldOrderQty((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__JOB_ID:
				setJobId((JobSandbox)newValue);
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
			case ProductPackage.PRODUCT_GROUP_ORDER__GROUP_ORDER_ID:
				setGroupOrderId(GROUP_ORDER_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__REQ_ORDER_QTY:
				setReqOrderQty(REQ_ORDER_QTY_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__SOLD_ORDER_QTY:
				setSoldOrderQty(SOLD_ORDER_QTY_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case ProductPackage.PRODUCT_GROUP_ORDER__JOB_ID:
				setJobId((JobSandbox)null);
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
			case ProductPackage.PRODUCT_GROUP_ORDER__GROUP_ORDER_ID:
				return GROUP_ORDER_ID_EDEFAULT == null ? groupOrderId != null : !GROUP_ORDER_ID_EDEFAULT.equals(groupOrderId);
			case ProductPackage.PRODUCT_GROUP_ORDER__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ProductPackage.PRODUCT_GROUP_ORDER__REQ_ORDER_QTY:
				return REQ_ORDER_QTY_EDEFAULT == null ? reqOrderQty != null : !REQ_ORDER_QTY_EDEFAULT.equals(reqOrderQty);
			case ProductPackage.PRODUCT_GROUP_ORDER__SOLD_ORDER_QTY:
				return SOLD_ORDER_QTY_EDEFAULT == null ? soldOrderQty != null : !SOLD_ORDER_QTY_EDEFAULT.equals(soldOrderQty);
			case ProductPackage.PRODUCT_GROUP_ORDER__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case ProductPackage.PRODUCT_GROUP_ORDER__PRODUCT_ID:
				return productId != null;
			case ProductPackage.PRODUCT_GROUP_ORDER__STATUS_ID:
				return statusId != null;
			case ProductPackage.PRODUCT_GROUP_ORDER__JOB_ID:
				return jobId != null;
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
		result.append(" (groupOrderId: ");
		result.append(groupOrderId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", reqOrderQty: ");
		result.append(reqOrderQty);
		result.append(", soldOrderQty: ");
		result.append(soldOrderQty);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductGroupOrderImpl
