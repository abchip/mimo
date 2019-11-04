/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.util.Date;

import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.content.survey.SurveyApplType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Survey Appl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getProductStoreSurveyId <em>Product Store Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getResultTemplate <em>Result Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getSurveyTemplate <em>Survey Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getSurveyApplTypeId <em>Survey Appl Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreSurveyApplImpl extends BizEntityImpl implements ProductStoreSurveyAppl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductStoreSurveyId() <em>Product Store Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreSurveyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_SURVEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreSurveyId() <em>Product Store Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreSurveyId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreSurveyId = PRODUCT_STORE_SURVEY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultTemplate() <em>Result Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultTemplate() <em>Result Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultTemplate()
	 * @generated
	 * @ordered
	 */
	protected String resultTemplate = RESULT_TEMPLATE_EDEFAULT;

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
	 * The default value of the '{@link #getSurveyTemplate() <em>Survey Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyTemplate() <em>Survey Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyTemplate()
	 * @generated
	 * @ordered
	 */
	protected String surveyTemplate = SURVEY_TEMPLATE_EDEFAULT;

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
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getSurveyId() <em>Survey Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected Survey surveyId;

	/**
	 * The cached value of the '{@link #getSurveyApplTypeId() <em>Survey Appl Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyApplTypeId()
	 * @generated
	 * @ordered
	 */
	protected SurveyApplType surveyApplTypeId;

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
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategoryId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreSurveyApplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_SURVEY_APPL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreSurveyId() {
		return productStoreSurveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreSurveyId(String newProductStoreSurveyId) {
		String oldProductStoreSurveyId = productStoreSurveyId;
		productStoreSurveyId = newProductStoreSurveyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_SURVEY_ID, oldProductStoreSurveyId, productStoreSurveyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultTemplate() {
		return resultTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultTemplate(String newResultTemplate) {
		String oldResultTemplate = resultTemplate;
		resultTemplate = newResultTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE, oldResultTemplate, resultTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyApplType getSurveyApplTypeId() {
		if (surveyApplTypeId != null && ((EObject)surveyApplTypeId).eIsProxy()) {
			InternalEObject oldSurveyApplTypeId = (InternalEObject)surveyApplTypeId;
			surveyApplTypeId = (SurveyApplType)eResolveProxy(oldSurveyApplTypeId);
			if (surveyApplTypeId != oldSurveyApplTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID, oldSurveyApplTypeId, surveyApplTypeId));
			}
		}
		return surveyApplTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyApplType basicGetSurveyApplTypeId() {
		return surveyApplTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyApplTypeId(SurveyApplType newSurveyApplTypeId) {
		SurveyApplType oldSurveyApplTypeId = surveyApplTypeId;
		surveyApplTypeId = newSurveyApplTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID, oldSurveyApplTypeId, surveyApplTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Survey getSurveyId() {
		if (surveyId != null && ((EObject)surveyId).eIsProxy()) {
			InternalEObject oldSurveyId = (InternalEObject)surveyId;
			surveyId = (Survey)eResolveProxy(oldSurveyId);
			if (surveyId != oldSurveyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID, oldSurveyId, surveyId));
			}
		}
		return surveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey basicGetSurveyId() {
		return surveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyId(Survey newSurveyId) {
		Survey oldSurveyId = surveyId;
		surveyId = newSurveyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID, oldSurveyId, surveyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyTemplate() {
		return surveyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyTemplate(String newSurveyTemplate) {
		String oldSurveyTemplate = surveyTemplate;
		surveyTemplate = newSurveyTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE, oldSurveyTemplate, surveyTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID, oldProductId, productId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
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
		ProductCategory oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_SURVEY_ID:
				return getProductStoreSurveyId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__FROM_DATE:
				return getFromDate();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__GROUP_NAME:
				return getGroupName();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE:
				return getResultTemplate();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM:
				return getSequenceNum();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE:
				return getSurveyTemplate();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__THRU_DATE:
				return getThruDate();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID:
				if (resolve) return getSurveyId();
				return basicGetSurveyId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID:
				if (resolve) return getSurveyApplTypeId();
				return basicGetSurveyApplTypeId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
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
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_SURVEY_ID:
				setProductStoreSurveyId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE:
				setResultTemplate((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE:
				setSurveyTemplate((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID:
				setSurveyId((Survey)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID:
				setSurveyApplTypeId((SurveyApplType)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
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
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_SURVEY_ID:
				setProductStoreSurveyId(PRODUCT_STORE_SURVEY_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE:
				setResultTemplate(RESULT_TEMPLATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE:
				setSurveyTemplate(SURVEY_TEMPLATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID:
				setSurveyId((Survey)null);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID:
				setSurveyApplTypeId((SurveyApplType)null);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
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
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_SURVEY_ID:
				return PRODUCT_STORE_SURVEY_ID_EDEFAULT == null ? productStoreSurveyId != null : !PRODUCT_STORE_SURVEY_ID_EDEFAULT.equals(productStoreSurveyId);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE:
				return RESULT_TEMPLATE_EDEFAULT == null ? resultTemplate != null : !RESULT_TEMPLATE_EDEFAULT.equals(resultTemplate);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE:
				return SURVEY_TEMPLATE_EDEFAULT == null ? surveyTemplate != null : !SURVEY_TEMPLATE_EDEFAULT.equals(surveyTemplate);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID:
				return productStoreId != null;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID:
				return surveyId != null;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID:
				return surveyApplTypeId != null;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID:
				return productId != null;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
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
		result.append(" (productStoreSurveyId: ");
		result.append(productStoreSurveyId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(", resultTemplate: ");
		result.append(resultTemplate);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", surveyTemplate: ");
		result.append(surveyTemplate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductStoreSurveyApplImpl
