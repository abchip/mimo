/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductContent;
import org.abchip.mimo.biz.product.product.ProductContentType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getProductContentTypeId <em>Product Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getUseRoleTypeId <em>Use Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl#getUseTimeUomId <em>Use Time Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductContentImpl extends BizEntityTypedImpl<ProductContentType> implements ProductContent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getPurchaseFromDate() <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PURCHASE_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseFromDate() <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date purchaseFromDate = PURCHASE_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchaseThruDate() <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PURCHASE_THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseThruDate() <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date purchaseThruDate = PURCHASE_THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

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
	 * The default value of the '{@link #getUseCountLimit() <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCountLimit()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_COUNT_LIMIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseCountLimit() <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCountLimit()
	 * @generated
	 * @ordered
	 */
	protected long useCountLimit = USE_COUNT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseTime() <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTime()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseTime() <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTime()
	 * @generated
	 * @ordered
	 */
	protected long useTime = USE_TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected Content contentId;

	/**
	 * The cached value of the '{@link #getProductContentTypeId() <em>Product Content Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductContentType productContentTypeId;

	/**
	 * The cached value of the '{@link #getUseRoleTypeId() <em>Use Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType useRoleTypeId;

	/**
	 * The cached value of the '{@link #getUseTimeUomId() <em>Use Time Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom useTimeUomId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getContentId() {
		if (contentId != null && ((EObject)contentId).eIsProxy()) {
			InternalEObject oldContentId = (InternalEObject)contentId;
			contentId = (Content)eResolveProxy(oldContentId);
			if (contentId != oldContentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_CONTENT__CONTENT_ID, oldContentId, contentId));
			}
		}
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(Content newContentId) {
		Content oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__CONTENT_ID, oldContentId, contentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseFromDate() {
		return purchaseFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseFromDate(Date newPurchaseFromDate) {
		Date oldPurchaseFromDate = purchaseFromDate;
		purchaseFromDate = newPurchaseFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__PURCHASE_FROM_DATE, oldPurchaseFromDate, purchaseFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseThruDate() {
		return purchaseThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseThruDate(Date newPurchaseThruDate) {
		Date oldPurchaseThruDate = purchaseThruDate;
		purchaseThruDate = newPurchaseThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__PURCHASE_THRU_DATE, oldPurchaseThruDate, purchaseThruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseCountLimit() {
		return useCountLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCountLimit(long newUseCountLimit) {
		long oldUseCountLimit = useCountLimit;
		useCountLimit = newUseCountLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__USE_COUNT_LIMIT, oldUseCountLimit, useCountLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getUseRoleTypeId() {
		if (useRoleTypeId != null && ((EObject)useRoleTypeId).eIsProxy()) {
			InternalEObject oldUseRoleTypeId = (InternalEObject)useRoleTypeId;
			useRoleTypeId = (RoleType)eResolveProxy(oldUseRoleTypeId);
			if (useRoleTypeId != oldUseRoleTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_CONTENT__USE_ROLE_TYPE_ID, oldUseRoleTypeId, useRoleTypeId));
			}
		}
		return useRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetUseRoleTypeId() {
		return useRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseRoleTypeId(RoleType newUseRoleTypeId) {
		RoleType oldUseRoleTypeId = useRoleTypeId;
		useRoleTypeId = newUseRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__USE_ROLE_TYPE_ID, oldUseRoleTypeId, useRoleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseTime() {
		return useTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTime(long newUseTime) {
		long oldUseTime = useTime;
		useTime = newUseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__USE_TIME, oldUseTime, useTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUseTimeUomId() {
		if (useTimeUomId != null && ((EObject)useTimeUomId).eIsProxy()) {
			InternalEObject oldUseTimeUomId = (InternalEObject)useTimeUomId;
			useTimeUomId = (Uom)eResolveProxy(oldUseTimeUomId);
			if (useTimeUomId != oldUseTimeUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_CONTENT__USE_TIME_UOM_ID, oldUseTimeUomId, useTimeUomId));
			}
		}
		return useTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUseTimeUomId() {
		return useTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeUomId(Uom newUseTimeUomId) {
		Uom oldUseTimeUomId = useTimeUomId;
		useTimeUomId = newUseTimeUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__USE_TIME_UOM_ID, oldUseTimeUomId, useTimeUomId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_CONTENT__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductContentType getProductContentTypeId() {
		if (productContentTypeId != null && ((EObject)productContentTypeId).eIsProxy()) {
			InternalEObject oldProductContentTypeId = (InternalEObject)productContentTypeId;
			productContentTypeId = (ProductContentType)eResolveProxy(oldProductContentTypeId);
			if (productContentTypeId != oldProductContentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE_ID, oldProductContentTypeId, productContentTypeId));
			}
		}
		return productContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductContentType basicGetProductContentTypeId() {
		return productContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductContentTypeId(ProductContentType newProductContentTypeId) {
		ProductContentType oldProductContentTypeId = productContentTypeId;
		productContentTypeId = newProductContentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE_ID, oldProductContentTypeId, productContentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_CONTENT__FROM_DATE:
				return getFromDate();
			case ProductPackage.PRODUCT_CONTENT__PURCHASE_FROM_DATE:
				return getPurchaseFromDate();
			case ProductPackage.PRODUCT_CONTENT__PURCHASE_THRU_DATE:
				return getPurchaseThruDate();
			case ProductPackage.PRODUCT_CONTENT__SEQUENCE_NUM:
				return getSequenceNum();
			case ProductPackage.PRODUCT_CONTENT__THRU_DATE:
				return getThruDate();
			case ProductPackage.PRODUCT_CONTENT__USE_COUNT_LIMIT:
				return getUseCountLimit();
			case ProductPackage.PRODUCT_CONTENT__USE_TIME:
				return getUseTime();
			case ProductPackage.PRODUCT_CONTENT__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case ProductPackage.PRODUCT_CONTENT__CONTENT_ID:
				if (resolve) return getContentId();
				return basicGetContentId();
			case ProductPackage.PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE_ID:
				if (resolve) return getProductContentTypeId();
				return basicGetProductContentTypeId();
			case ProductPackage.PRODUCT_CONTENT__USE_ROLE_TYPE_ID:
				if (resolve) return getUseRoleTypeId();
				return basicGetUseRoleTypeId();
			case ProductPackage.PRODUCT_CONTENT__USE_TIME_UOM_ID:
				if (resolve) return getUseTimeUomId();
				return basicGetUseTimeUomId();
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
			case ProductPackage.PRODUCT_CONTENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__PURCHASE_FROM_DATE:
				setPurchaseFromDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__PURCHASE_THRU_DATE:
				setPurchaseThruDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__USE_COUNT_LIMIT:
				setUseCountLimit((Long)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__USE_TIME:
				setUseTime((Long)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__CONTENT_ID:
				setContentId((Content)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE_ID:
				setProductContentTypeId((ProductContentType)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__USE_ROLE_TYPE_ID:
				setUseRoleTypeId((RoleType)newValue);
				return;
			case ProductPackage.PRODUCT_CONTENT__USE_TIME_UOM_ID:
				setUseTimeUomId((Uom)newValue);
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
			case ProductPackage.PRODUCT_CONTENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CONTENT__PURCHASE_FROM_DATE:
				setPurchaseFromDate(PURCHASE_FROM_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CONTENT__PURCHASE_THRU_DATE:
				setPurchaseThruDate(PURCHASE_THRU_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CONTENT__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CONTENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CONTENT__USE_COUNT_LIMIT:
				setUseCountLimit(USE_COUNT_LIMIT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CONTENT__USE_TIME:
				setUseTime(USE_TIME_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CONTENT__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case ProductPackage.PRODUCT_CONTENT__CONTENT_ID:
				setContentId((Content)null);
				return;
			case ProductPackage.PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE_ID:
				setProductContentTypeId((ProductContentType)null);
				return;
			case ProductPackage.PRODUCT_CONTENT__USE_ROLE_TYPE_ID:
				setUseRoleTypeId((RoleType)null);
				return;
			case ProductPackage.PRODUCT_CONTENT__USE_TIME_UOM_ID:
				setUseTimeUomId((Uom)null);
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
			case ProductPackage.PRODUCT_CONTENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ProductPackage.PRODUCT_CONTENT__PURCHASE_FROM_DATE:
				return PURCHASE_FROM_DATE_EDEFAULT == null ? purchaseFromDate != null : !PURCHASE_FROM_DATE_EDEFAULT.equals(purchaseFromDate);
			case ProductPackage.PRODUCT_CONTENT__PURCHASE_THRU_DATE:
				return PURCHASE_THRU_DATE_EDEFAULT == null ? purchaseThruDate != null : !PURCHASE_THRU_DATE_EDEFAULT.equals(purchaseThruDate);
			case ProductPackage.PRODUCT_CONTENT__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case ProductPackage.PRODUCT_CONTENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case ProductPackage.PRODUCT_CONTENT__USE_COUNT_LIMIT:
				return useCountLimit != USE_COUNT_LIMIT_EDEFAULT;
			case ProductPackage.PRODUCT_CONTENT__USE_TIME:
				return useTime != USE_TIME_EDEFAULT;
			case ProductPackage.PRODUCT_CONTENT__PRODUCT_ID:
				return productId != null;
			case ProductPackage.PRODUCT_CONTENT__CONTENT_ID:
				return contentId != null;
			case ProductPackage.PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE_ID:
				return productContentTypeId != null;
			case ProductPackage.PRODUCT_CONTENT__USE_ROLE_TYPE_ID:
				return useRoleTypeId != null;
			case ProductPackage.PRODUCT_CONTENT__USE_TIME_UOM_ID:
				return useTimeUomId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", purchaseFromDate: ");
		result.append(purchaseFromDate);
		result.append(", purchaseThruDate: ");
		result.append(purchaseThruDate);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", useCountLimit: ");
		result.append(useCountLimit);
		result.append(", useTime: ");
		result.append(useTime);
		result.append(')');
		return result.toString();
	}

} //ProductContentImpl
