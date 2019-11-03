/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getResultTemplate <em>Result Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getSurveyApplTypeId <em>Survey Appl Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getSurveyTemplate <em>Survey Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl#getThruDate <em>Thru Date</em>}</li>
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
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreId = PRODUCT_STORE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getSurveyApplTypeId() <em>Survey Appl Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyApplTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_APPL_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyApplTypeId() <em>Survey Appl Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyApplTypeId()
	 * @generated
	 * @ordered
	 */
	protected String surveyApplTypeId = SURVEY_APPL_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurveyId() <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyId() <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected String surveyId = SURVEY_ID_EDEFAULT;

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
	public String getSurveyApplTypeId() {
		return surveyApplTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyApplTypeId(String newSurveyApplTypeId) {
		String oldSurveyApplTypeId = surveyApplTypeId;
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
	public String getSurveyId() {
		return surveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyId(String newSurveyId) {
		String oldSurveyId = surveyId;
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
	public String getProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		String oldProductStoreId = productStoreId;
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
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
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
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID:
				return getProductCategoryId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID:
				return getProductId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID:
				return getProductStoreId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE:
				return getResultTemplate();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM:
				return getSequenceNum();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID:
				return getSurveyApplTypeId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID:
				return getSurveyId();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE:
				return getSurveyTemplate();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__THRU_DATE:
				return getThruDate();
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
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID:
				setProductCategoryId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE:
				setResultTemplate((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID:
				setSurveyApplTypeId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID:
				setSurveyId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE:
				setSurveyTemplate((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__THRU_DATE:
				setThruDate((Date)newValue);
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
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID:
				setProductCategoryId(PRODUCT_CATEGORY_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE:
				setResultTemplate(RESULT_TEMPLATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID:
				setSurveyApplTypeId(SURVEY_APPL_TYPE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID:
				setSurveyId(SURVEY_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE:
				setSurveyTemplate(SURVEY_TEMPLATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID:
				return PRODUCT_CATEGORY_ID_EDEFAULT == null ? productCategoryId != null : !PRODUCT_CATEGORY_ID_EDEFAULT.equals(productCategoryId);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE:
				return RESULT_TEMPLATE_EDEFAULT == null ? resultTemplate != null : !RESULT_TEMPLATE_EDEFAULT.equals(resultTemplate);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID:
				return SURVEY_APPL_TYPE_ID_EDEFAULT == null ? surveyApplTypeId != null : !SURVEY_APPL_TYPE_ID_EDEFAULT.equals(surveyApplTypeId);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_ID:
				return SURVEY_ID_EDEFAULT == null ? surveyId != null : !SURVEY_ID_EDEFAULT.equals(surveyId);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE:
				return SURVEY_TEMPLATE_EDEFAULT == null ? surveyTemplate != null : !SURVEY_TEMPLATE_EDEFAULT.equals(surveyTemplate);
			case StorePackage.PRODUCT_STORE_SURVEY_APPL__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(", productCategoryId: ");
		result.append(productCategoryId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", productStoreId: ");
		result.append(productStoreId);
		result.append(", resultTemplate: ");
		result.append(resultTemplate);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", surveyApplTypeId: ");
		result.append(surveyApplTypeId);
		result.append(", surveyId: ");
		result.append(surveyId);
		result.append(", surveyTemplate: ");
		result.append(surveyTemplate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductStoreSurveyApplImpl
