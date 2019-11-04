/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.category.ProductCategoryType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getCategoryImageUrl <em>Category Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getDetailScreen <em>Detail Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getLinkOneImageUrl <em>Link One Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getLinkTwoImageUrl <em>Link Two Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#isShowInSelect <em>Show In Select</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getProductCategoryTypeId <em>Product Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getPrimaryParentCategoryId <em>Primary Parent Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getProductCategoryAttributes <em>Product Category Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryImpl extends BizEntityTypedImpl<ProductCategoryType> implements ProductCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String productCategoryId = PRODUCT_CATEGORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryImageUrl() <em>Category Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryImageUrl() <em>Category Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String categoryImageUrl = CATEGORY_IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected String categoryName = CATEGORY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailScreen() <em>Detail Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailScreen()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_SCREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailScreen() <em>Detail Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailScreen()
	 * @generated
	 * @ordered
	 */
	protected String detailScreen = DETAIL_SCREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkOneImageUrl() <em>Link One Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkOneImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_ONE_IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkOneImageUrl() <em>Link One Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkOneImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String linkOneImageUrl = LINK_ONE_IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkTwoImageUrl() <em>Link Two Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTwoImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_TWO_IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkTwoImageUrl() <em>Link Two Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTwoImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String linkTwoImageUrl = LINK_TWO_IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected String longDescription = LONG_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowInSelect() <em>Show In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowInSelect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_IN_SELECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowInSelect() <em>Show In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowInSelect()
	 * @generated
	 * @ordered
	 */
	protected boolean showInSelect = SHOW_IN_SELECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductCategoryTypeId() <em>Product Category Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategoryType productCategoryTypeId;

	/**
	 * The cached value of the '{@link #getPrimaryParentCategoryId() <em>Primary Parent Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryParentCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory primaryParentCategoryId;

	/**
	 * The cached value of the '{@link #getProductCategoryAttributes() <em>Product Category Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productCategoryAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategoryImageUrl() {
		return categoryImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryImageUrl(String newCategoryImageUrl) {
		String oldCategoryImageUrl = categoryImageUrl;
		categoryImageUrl = newCategoryImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__CATEGORY_IMAGE_URL, oldCategoryImageUrl, categoryImageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryName(String newCategoryName) {
		String oldCategoryName = categoryName;
		categoryName = newCategoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__CATEGORY_NAME, oldCategoryName, categoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailScreen() {
		return detailScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailScreen(String newDetailScreen) {
		String oldDetailScreen = detailScreen;
		detailScreen = newDetailScreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__DETAIL_SCREEN, oldDetailScreen, detailScreen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkOneImageUrl() {
		return linkOneImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkOneImageUrl(String newLinkOneImageUrl) {
		String oldLinkOneImageUrl = linkOneImageUrl;
		linkOneImageUrl = newLinkOneImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL, oldLinkOneImageUrl, linkOneImageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkTwoImageUrl() {
		return linkTwoImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkTwoImageUrl(String newLinkTwoImageUrl) {
		String oldLinkTwoImageUrl = linkTwoImageUrl;
		linkTwoImageUrl = newLinkTwoImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL, oldLinkTwoImageUrl, linkTwoImageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDescription(String newLongDescription) {
		String oldLongDescription = longDescription;
		longDescription = newLongDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__LONG_DESCRIPTION, oldLongDescription, longDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductCategoryAttributes() {
		if (productCategoryAttributes == null) {
			productCategoryAttributes = new EDataTypeUniqueEList<String>(String.class, this, CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ATTRIBUTES);
		}
		return productCategoryAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> primaryChildProductCategories() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> primaryProducts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productStoreSurveyAppls() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> salesForecastDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> subscriptions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> taxAuthorityRateProducts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryType getProductCategoryTypeId() {
		if (productCategoryTypeId != null && ((EObject)productCategoryTypeId).eIsProxy()) {
			InternalEObject oldProductCategoryTypeId = (InternalEObject)productCategoryTypeId;
			productCategoryTypeId = (ProductCategoryType)eResolveProxy(oldProductCategoryTypeId);
			if (productCategoryTypeId != oldProductCategoryTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID, oldProductCategoryTypeId, productCategoryTypeId));
			}
		}
		return productCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategoryType basicGetProductCategoryTypeId() {
		return productCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryTypeId(ProductCategoryType newProductCategoryTypeId) {
		ProductCategoryType oldProductCategoryTypeId = productCategoryTypeId;
		productCategoryTypeId = newProductCategoryTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID, oldProductCategoryTypeId, productCategoryTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowInSelect() {
		return showInSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowInSelect(boolean newShowInSelect) {
		boolean oldShowInSelect = showInSelect;
		showInSelect = newShowInSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__SHOW_IN_SELECT, oldShowInSelect, showInSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getPrimaryParentCategoryId() {
		if (primaryParentCategoryId != null && ((EObject)primaryParentCategoryId).eIsProxy()) {
			InternalEObject oldPrimaryParentCategoryId = (InternalEObject)primaryParentCategoryId;
			primaryParentCategoryId = (ProductCategory)eResolveProxy(oldPrimaryParentCategoryId);
			if (primaryParentCategoryId != oldPrimaryParentCategoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CategoryPackage.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID, oldPrimaryParentCategoryId, primaryParentCategoryId));
			}
		}
		return primaryParentCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetPrimaryParentCategoryId() {
		return primaryParentCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryParentCategoryId(ProductCategory newPrimaryParentCategoryId) {
		ProductCategory oldPrimaryParentCategoryId = primaryParentCategoryId;
		primaryParentCategoryId = newPrimaryParentCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID, oldPrimaryParentCategoryId, primaryParentCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		String oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID:
				return getProductCategoryId();
			case CategoryPackage.PRODUCT_CATEGORY__CATEGORY_IMAGE_URL:
				return getCategoryImageUrl();
			case CategoryPackage.PRODUCT_CATEGORY__CATEGORY_NAME:
				return getCategoryName();
			case CategoryPackage.PRODUCT_CATEGORY__DESCRIPTION:
				return getDescription();
			case CategoryPackage.PRODUCT_CATEGORY__DETAIL_SCREEN:
				return getDetailScreen();
			case CategoryPackage.PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL:
				return getLinkOneImageUrl();
			case CategoryPackage.PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL:
				return getLinkTwoImageUrl();
			case CategoryPackage.PRODUCT_CATEGORY__LONG_DESCRIPTION:
				return getLongDescription();
			case CategoryPackage.PRODUCT_CATEGORY__SHOW_IN_SELECT:
				return isShowInSelect();
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID:
				if (resolve) return getProductCategoryTypeId();
				return basicGetProductCategoryTypeId();
			case CategoryPackage.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID:
				if (resolve) return getPrimaryParentCategoryId();
				return basicGetPrimaryParentCategoryId();
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ATTRIBUTES:
				return getProductCategoryAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID:
				setProductCategoryId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__CATEGORY_IMAGE_URL:
				setCategoryImageUrl((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__CATEGORY_NAME:
				setCategoryName((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__DETAIL_SCREEN:
				setDetailScreen((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL:
				setLinkOneImageUrl((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL:
				setLinkTwoImageUrl((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__LONG_DESCRIPTION:
				setLongDescription((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__SHOW_IN_SELECT:
				setShowInSelect((Boolean)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID:
				setProductCategoryTypeId((ProductCategoryType)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID:
				setPrimaryParentCategoryId((ProductCategory)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ATTRIBUTES:
				getProductCategoryAttributes().clear();
				getProductCategoryAttributes().addAll((Collection<? extends String>)newValue);
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
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID:
				setProductCategoryId(PRODUCT_CATEGORY_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__CATEGORY_IMAGE_URL:
				setCategoryImageUrl(CATEGORY_IMAGE_URL_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__CATEGORY_NAME:
				setCategoryName(CATEGORY_NAME_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__DETAIL_SCREEN:
				setDetailScreen(DETAIL_SCREEN_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL:
				setLinkOneImageUrl(LINK_ONE_IMAGE_URL_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL:
				setLinkTwoImageUrl(LINK_TWO_IMAGE_URL_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__LONG_DESCRIPTION:
				setLongDescription(LONG_DESCRIPTION_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__SHOW_IN_SELECT:
				setShowInSelect(SHOW_IN_SELECT_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID:
				setProductCategoryTypeId((ProductCategoryType)null);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID:
				setPrimaryParentCategoryId((ProductCategory)null);
				return;
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ATTRIBUTES:
				getProductCategoryAttributes().clear();
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
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID:
				return PRODUCT_CATEGORY_ID_EDEFAULT == null ? productCategoryId != null : !PRODUCT_CATEGORY_ID_EDEFAULT.equals(productCategoryId);
			case CategoryPackage.PRODUCT_CATEGORY__CATEGORY_IMAGE_URL:
				return CATEGORY_IMAGE_URL_EDEFAULT == null ? categoryImageUrl != null : !CATEGORY_IMAGE_URL_EDEFAULT.equals(categoryImageUrl);
			case CategoryPackage.PRODUCT_CATEGORY__CATEGORY_NAME:
				return CATEGORY_NAME_EDEFAULT == null ? categoryName != null : !CATEGORY_NAME_EDEFAULT.equals(categoryName);
			case CategoryPackage.PRODUCT_CATEGORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CategoryPackage.PRODUCT_CATEGORY__DETAIL_SCREEN:
				return DETAIL_SCREEN_EDEFAULT == null ? detailScreen != null : !DETAIL_SCREEN_EDEFAULT.equals(detailScreen);
			case CategoryPackage.PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL:
				return LINK_ONE_IMAGE_URL_EDEFAULT == null ? linkOneImageUrl != null : !LINK_ONE_IMAGE_URL_EDEFAULT.equals(linkOneImageUrl);
			case CategoryPackage.PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL:
				return LINK_TWO_IMAGE_URL_EDEFAULT == null ? linkTwoImageUrl != null : !LINK_TWO_IMAGE_URL_EDEFAULT.equals(linkTwoImageUrl);
			case CategoryPackage.PRODUCT_CATEGORY__LONG_DESCRIPTION:
				return LONG_DESCRIPTION_EDEFAULT == null ? longDescription != null : !LONG_DESCRIPTION_EDEFAULT.equals(longDescription);
			case CategoryPackage.PRODUCT_CATEGORY__SHOW_IN_SELECT:
				return showInSelect != SHOW_IN_SELECT_EDEFAULT;
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID:
				return productCategoryTypeId != null;
			case CategoryPackage.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID:
				return primaryParentCategoryId != null;
			case CategoryPackage.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ATTRIBUTES:
				return productCategoryAttributes != null && !productCategoryAttributes.isEmpty();
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
		result.append(" (productCategoryId: ");
		result.append(productCategoryId);
		result.append(", categoryImageUrl: ");
		result.append(categoryImageUrl);
		result.append(", categoryName: ");
		result.append(categoryName);
		result.append(", description: ");
		result.append(description);
		result.append(", detailScreen: ");
		result.append(detailScreen);
		result.append(", linkOneImageUrl: ");
		result.append(linkOneImageUrl);
		result.append(", linkTwoImageUrl: ");
		result.append(linkTwoImageUrl);
		result.append(", longDescription: ");
		result.append(longDescription);
		result.append(", showInSelect: ");
		result.append(showInSelect);
		result.append(", productCategoryAttributes: ");
		result.append(productCategoryAttributes);
		result.append(')');
		return result.toString();
	}

} //ProductCategoryImpl
