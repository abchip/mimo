/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.category.ProductCategoryLink;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getLinkSeqId <em>Link Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getDetailSubScreen <em>Detail Sub Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getDetailText <em>Detail Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getImageTwoUrl <em>Image Two Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getLinkInfo <em>Link Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getTitleText <em>Title Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getLinkTypeEnumId <em>Link Type Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryLinkImpl extends BizEntityImpl implements ProductCategoryLink {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getLinkSeqId() <em>Link Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkSeqId() <em>Link Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkSeqId()
	 * @generated
	 * @ordered
	 */
	protected String linkSeqId = LINK_SEQ_ID_EDEFAULT;

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
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailSubScreen() <em>Detail Sub Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailSubScreen()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_SUB_SCREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailSubScreen() <em>Detail Sub Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailSubScreen()
	 * @generated
	 * @ordered
	 */
	protected String detailSubScreen = DETAIL_SUB_SCREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailText() <em>Detail Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailText()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailText() <em>Detail Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailText()
	 * @generated
	 * @ordered
	 */
	protected String detailText = DETAIL_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageTwoUrl() <em>Image Two Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageTwoUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_TWO_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageTwoUrl() <em>Image Two Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageTwoUrl()
	 * @generated
	 * @ordered
	 */
	protected String imageTwoUrl = IMAGE_TWO_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String imageUrl = IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkInfo() <em>Link Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkInfo() <em>Link Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkInfo()
	 * @generated
	 * @ordered
	 */
	protected String linkInfo = LINK_INFO_EDEFAULT;

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
	 * The default value of the '{@link #getTitleText() <em>Title Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleText()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleText() <em>Title Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleText()
	 * @generated
	 * @ordered
	 */
	protected String titleText = TITLE_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategoryId;

	/**
	 * The cached value of the '{@link #getLinkTypeEnumId() <em>Link Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration linkTypeEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailSubScreen() {
		return detailSubScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailSubScreen(String newDetailSubScreen) {
		detailSubScreen = newDetailSubScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailText() {
		return detailText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailText(String newDetailText) {
		detailText = newDetailText;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageTwoUrl() {
		return imageTwoUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageTwoUrl(String newImageTwoUrl) {
		imageTwoUrl = newImageTwoUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageUrl(String newImageUrl) {
		imageUrl = newImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkInfo() {
		return linkInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkInfo(String newLinkInfo) {
		linkInfo = newLinkInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkSeqId() {
		return linkSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkSeqId(String newLinkSeqId) {
		linkSeqId = newLinkSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getLinkTypeEnumId() {
		if (linkTypeEnumId != null && ((EObject)linkTypeEnumId).eIsProxy()) {
			InternalEObject oldLinkTypeEnumId = (InternalEObject)linkTypeEnumId;
			linkTypeEnumId = (Enumeration)eResolveProxy(oldLinkTypeEnumId);
			if (linkTypeEnumId != oldLinkTypeEnumId) {
			}
		}
		return linkTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetLinkTypeEnumId() {
		return linkTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkTypeEnumId(Enumeration newLinkTypeEnumId) {
		linkTypeEnumId = newLinkTypeEnumId;
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
		sequenceNum = newSequenceNum;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleText() {
		return titleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleText(String newTitleText) {
		titleText = newTitleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		if (productCategoryId != null && ((EObject)productCategoryId).eIsProxy()) {
			InternalEObject oldProductCategoryId = (InternalEObject)productCategoryId;
			productCategoryId = (ProductCategory)eResolveProxy(oldProductCategoryId);
			if (productCategoryId != oldProductCategoryId) {
			}
		}
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		productCategoryId = newProductCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_SEQ_ID:
				return getLinkSeqId();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__FROM_DATE:
				return getFromDate();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__COMMENTS:
				return getComments();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__DETAIL_SUB_SCREEN:
				return getDetailSubScreen();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__DETAIL_TEXT:
				return getDetailText();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__IMAGE_TWO_URL:
				return getImageTwoUrl();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__IMAGE_URL:
				return getImageUrl();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_INFO:
				return getLinkInfo();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__SEQUENCE_NUM:
				return getSequenceNum();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__THRU_DATE:
				return getThruDate();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__TITLE_TEXT:
				return getTitleText();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_TYPE_ENUM_ID:
				if (resolve) return getLinkTypeEnumId();
				return basicGetLinkTypeEnumId();
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
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_SEQ_ID:
				setLinkSeqId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__COMMENTS:
				setComments((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__DETAIL_SUB_SCREEN:
				setDetailSubScreen((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__DETAIL_TEXT:
				setDetailText((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__IMAGE_TWO_URL:
				setImageTwoUrl((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__IMAGE_URL:
				setImageUrl((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_INFO:
				setLinkInfo((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__TITLE_TEXT:
				setTitleText((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_TYPE_ENUM_ID:
				setLinkTypeEnumId((Enumeration)newValue);
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
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_SEQ_ID:
				setLinkSeqId(LINK_SEQ_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__DETAIL_SUB_SCREEN:
				setDetailSubScreen(DETAIL_SUB_SCREEN_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__DETAIL_TEXT:
				setDetailText(DETAIL_TEXT_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__IMAGE_TWO_URL:
				setImageTwoUrl(IMAGE_TWO_URL_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__IMAGE_URL:
				setImageUrl(IMAGE_URL_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_INFO:
				setLinkInfo(LINK_INFO_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__TITLE_TEXT:
				setTitleText(TITLE_TEXT_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_TYPE_ENUM_ID:
				setLinkTypeEnumId((Enumeration)null);
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
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_SEQ_ID:
				return LINK_SEQ_ID_EDEFAULT == null ? linkSeqId != null : !LINK_SEQ_ID_EDEFAULT.equals(linkSeqId);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__DETAIL_SUB_SCREEN:
				return DETAIL_SUB_SCREEN_EDEFAULT == null ? detailSubScreen != null : !DETAIL_SUB_SCREEN_EDEFAULT.equals(detailSubScreen);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__DETAIL_TEXT:
				return DETAIL_TEXT_EDEFAULT == null ? detailText != null : !DETAIL_TEXT_EDEFAULT.equals(detailText);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__IMAGE_TWO_URL:
				return IMAGE_TWO_URL_EDEFAULT == null ? imageTwoUrl != null : !IMAGE_TWO_URL_EDEFAULT.equals(imageTwoUrl);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? imageUrl != null : !IMAGE_URL_EDEFAULT.equals(imageUrl);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_INFO:
				return LINK_INFO_EDEFAULT == null ? linkInfo != null : !LINK_INFO_EDEFAULT.equals(linkInfo);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__TITLE_TEXT:
				return TITLE_TEXT_EDEFAULT == null ? titleText != null : !TITLE_TEXT_EDEFAULT.equals(titleText);
			case CategoryPackage.PRODUCT_CATEGORY_LINK__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
			case CategoryPackage.PRODUCT_CATEGORY_LINK__LINK_TYPE_ENUM_ID:
				return linkTypeEnumId != null;
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
		result.append(" (linkSeqId: ");
		result.append(linkSeqId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", detailSubScreen: ");
		result.append(detailSubScreen);
		result.append(", detailText: ");
		result.append(detailText);
		result.append(", imageTwoUrl: ");
		result.append(imageTwoUrl);
		result.append(", imageUrl: ");
		result.append(imageUrl);
		result.append(", linkInfo: ");
		result.append(linkInfo);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", titleText: ");
		result.append(titleText);
		result.append(')');
		return result.toString();
	}

} //ProductCategoryLinkImpl
