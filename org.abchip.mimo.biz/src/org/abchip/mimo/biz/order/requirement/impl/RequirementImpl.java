/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.requirement.Requirement;
import org.abchip.mimo.biz.order.requirement.RequirementPackage;
import org.abchip.mimo.biz.order.requirement.RequirementType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getDeliverableId <em>Deliverable Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getEstimatedBudget <em>Estimated Budget</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getRequiredByDate <em>Required By Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getRequirementStartDate <em>Requirement Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getRequirementTypeId <em>Requirement Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getRequirementAttributes <em>Requirement Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getRequirementStatuss <em>Requirement Statuss</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementImpl#getWorkRequirementFulfillments <em>Work Requirement Fulfillments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends BizEntityTypedImpl<RequirementType> implements Requirement {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRequirementId() <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementId() <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected String requirementId = REQUIREMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliverableId() <em>Deliverable Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverableId()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERABLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliverableId() <em>Deliverable Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverableId()
	 * @generated
	 * @ordered
	 */
	protected String deliverableId = DELIVERABLE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getEstimatedBudget() <em>Estimated Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedBudget()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ESTIMATED_BUDGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedBudget() <em>Estimated Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedBudget()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal estimatedBudget = ESTIMATED_BUDGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String facilityId = FACILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetId = FIXED_ASSET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredByDate() <em>Required By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredByDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REQUIRED_BY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredByDate() <em>Required By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredByDate()
	 * @generated
	 * @ordered
	 */
	protected Date requiredByDate = REQUIRED_BY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequirementStartDate() <em>Requirement Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REQUIREMENT_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementStartDate() <em>Requirement Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date requirementStartDate = REQUIREMENT_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequirementTypeId() <em>Requirement Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementTypeId() <em>Requirement Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementTypeId()
	 * @generated
	 * @ordered
	 */
	protected String requirementTypeId = REQUIREMENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCase() <em>Use Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected String useCase = USE_CASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirementAttributes() <em>Requirement Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requirementAttributes;

	/**
	 * The cached value of the '{@link #getRequirementStatuss() <em>Requirement Statuss</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementStatuss()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requirementStatuss;

	/**
	 * The cached value of the '{@link #getWorkRequirementFulfillments() <em>Work Requirement Fulfillments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkRequirementFulfillments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workRequirementFulfillments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliverableId() {
		return deliverableId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverableId(String newDeliverableId) {
		String oldDeliverableId = deliverableId;
		deliverableId = newDeliverableId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__DELIVERABLE_ID, oldDeliverableId, deliverableId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedBudget() {
		return estimatedBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedBudget(BigDecimal newEstimatedBudget) {
		BigDecimal oldEstimatedBudget = estimatedBudget;
		estimatedBudget = newEstimatedBudget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__ESTIMATED_BUDGET, oldEstimatedBudget, estimatedBudget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		String oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		String oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		BigDecimal oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getRequiredByDate() {
		return requiredByDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredByDate(Date newRequiredByDate) {
		Date oldRequiredByDate = requiredByDate;
		requiredByDate = newRequiredByDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__REQUIRED_BY_DATE, oldRequiredByDate, requiredByDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequirementId() {
		return requirementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementId(String newRequirementId) {
		String oldRequirementId = requirementId;
		requirementId = newRequirementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__REQUIREMENT_ID, oldRequirementId, requirementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getRequirementStartDate() {
		return requirementStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementStartDate(Date newRequirementStartDate) {
		Date oldRequirementStartDate = requirementStartDate;
		requirementStartDate = newRequirementStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__REQUIREMENT_START_DATE, oldRequirementStartDate, requirementStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequirementTypeId() {
		return requirementTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementTypeId(String newRequirementTypeId) {
		String oldRequirementTypeId = requirementTypeId;
		requirementTypeId = newRequirementTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__REQUIREMENT_TYPE_ID, oldRequirementTypeId, requirementTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseCase() {
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCase(String newUseCase) {
		String oldUseCase = useCase;
		useCase = newUseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.REQUIREMENT__USE_CASE, oldUseCase, useCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getRequirementAttributes() {
		if (requirementAttributes == null) {
			requirementAttributes = new EDataTypeUniqueEList<String>(String.class, this, RequirementPackage.REQUIREMENT__REQUIREMENT_ATTRIBUTES);
		}
		return requirementAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getRequirementStatuss() {
		if (requirementStatuss == null) {
			requirementStatuss = new EDataTypeUniqueEList<String>(String.class, this, RequirementPackage.REQUIREMENT__REQUIREMENT_STATUSS);
		}
		return requirementStatuss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkRequirementFulfillments() {
		if (workRequirementFulfillments == null) {
			workRequirementFulfillments = new EDataTypeUniqueEList<String>(String.class, this, RequirementPackage.REQUIREMENT__WORK_REQUIREMENT_FULFILLMENTS);
		}
		return workRequirementFulfillments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> desiredFeatures() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				return getRequirementId();
			case RequirementPackage.REQUIREMENT__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case RequirementPackage.REQUIREMENT__CREATED_DATE:
				return getCreatedDate();
			case RequirementPackage.REQUIREMENT__DELIVERABLE_ID:
				return getDeliverableId();
			case RequirementPackage.REQUIREMENT__DESCRIPTION:
				return getDescription();
			case RequirementPackage.REQUIREMENT__ESTIMATED_BUDGET:
				return getEstimatedBudget();
			case RequirementPackage.REQUIREMENT__FACILITY_ID:
				return getFacilityId();
			case RequirementPackage.REQUIREMENT__FIXED_ASSET_ID:
				return getFixedAssetId();
			case RequirementPackage.REQUIREMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case RequirementPackage.REQUIREMENT__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case RequirementPackage.REQUIREMENT__PRODUCT_ID:
				return getProductId();
			case RequirementPackage.REQUIREMENT__QUANTITY:
				return getQuantity();
			case RequirementPackage.REQUIREMENT__REASON:
				return getReason();
			case RequirementPackage.REQUIREMENT__REQUIRED_BY_DATE:
				return getRequiredByDate();
			case RequirementPackage.REQUIREMENT__REQUIREMENT_START_DATE:
				return getRequirementStartDate();
			case RequirementPackage.REQUIREMENT__REQUIREMENT_TYPE_ID:
				return getRequirementTypeId();
			case RequirementPackage.REQUIREMENT__STATUS_ID:
				return getStatusId();
			case RequirementPackage.REQUIREMENT__USE_CASE:
				return getUseCase();
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ATTRIBUTES:
				return getRequirementAttributes();
			case RequirementPackage.REQUIREMENT__REQUIREMENT_STATUSS:
				return getRequirementStatuss();
			case RequirementPackage.REQUIREMENT__WORK_REQUIREMENT_FULFILLMENTS:
				return getWorkRequirementFulfillments();
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
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				setRequirementId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case RequirementPackage.REQUIREMENT__DELIVERABLE_ID:
				setDeliverableId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__ESTIMATED_BUDGET:
				setEstimatedBudget((BigDecimal)newValue);
				return;
			case RequirementPackage.REQUIREMENT__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case RequirementPackage.REQUIREMENT__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case RequirementPackage.REQUIREMENT__REASON:
				setReason((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__REQUIRED_BY_DATE:
				setRequiredByDate((Date)newValue);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_START_DATE:
				setRequirementStartDate((Date)newValue);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_TYPE_ID:
				setRequirementTypeId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__USE_CASE:
				setUseCase((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ATTRIBUTES:
				getRequirementAttributes().clear();
				getRequirementAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_STATUSS:
				getRequirementStatuss().clear();
				getRequirementStatuss().addAll((Collection<? extends String>)newValue);
				return;
			case RequirementPackage.REQUIREMENT__WORK_REQUIREMENT_FULFILLMENTS:
				getWorkRequirementFulfillments().clear();
				getWorkRequirementFulfillments().addAll((Collection<? extends String>)newValue);
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
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				setRequirementId(REQUIREMENT_ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__DELIVERABLE_ID:
				setDeliverableId(DELIVERABLE_ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__ESTIMATED_BUDGET:
				setEstimatedBudget(ESTIMATED_BUDGET_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__REQUIRED_BY_DATE:
				setRequiredByDate(REQUIRED_BY_DATE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_START_DATE:
				setRequirementStartDate(REQUIREMENT_START_DATE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_TYPE_ID:
				setRequirementTypeId(REQUIREMENT_TYPE_ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__USE_CASE:
				setUseCase(USE_CASE_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ATTRIBUTES:
				getRequirementAttributes().clear();
				return;
			case RequirementPackage.REQUIREMENT__REQUIREMENT_STATUSS:
				getRequirementStatuss().clear();
				return;
			case RequirementPackage.REQUIREMENT__WORK_REQUIREMENT_FULFILLMENTS:
				getWorkRequirementFulfillments().clear();
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
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ID:
				return REQUIREMENT_ID_EDEFAULT == null ? requirementId != null : !REQUIREMENT_ID_EDEFAULT.equals(requirementId);
			case RequirementPackage.REQUIREMENT__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case RequirementPackage.REQUIREMENT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case RequirementPackage.REQUIREMENT__DELIVERABLE_ID:
				return DELIVERABLE_ID_EDEFAULT == null ? deliverableId != null : !DELIVERABLE_ID_EDEFAULT.equals(deliverableId);
			case RequirementPackage.REQUIREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequirementPackage.REQUIREMENT__ESTIMATED_BUDGET:
				return ESTIMATED_BUDGET_EDEFAULT == null ? estimatedBudget != null : !ESTIMATED_BUDGET_EDEFAULT.equals(estimatedBudget);
			case RequirementPackage.REQUIREMENT__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case RequirementPackage.REQUIREMENT__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case RequirementPackage.REQUIREMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case RequirementPackage.REQUIREMENT__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case RequirementPackage.REQUIREMENT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case RequirementPackage.REQUIREMENT__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case RequirementPackage.REQUIREMENT__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case RequirementPackage.REQUIREMENT__REQUIRED_BY_DATE:
				return REQUIRED_BY_DATE_EDEFAULT == null ? requiredByDate != null : !REQUIRED_BY_DATE_EDEFAULT.equals(requiredByDate);
			case RequirementPackage.REQUIREMENT__REQUIREMENT_START_DATE:
				return REQUIREMENT_START_DATE_EDEFAULT == null ? requirementStartDate != null : !REQUIREMENT_START_DATE_EDEFAULT.equals(requirementStartDate);
			case RequirementPackage.REQUIREMENT__REQUIREMENT_TYPE_ID:
				return REQUIREMENT_TYPE_ID_EDEFAULT == null ? requirementTypeId != null : !REQUIREMENT_TYPE_ID_EDEFAULT.equals(requirementTypeId);
			case RequirementPackage.REQUIREMENT__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case RequirementPackage.REQUIREMENT__USE_CASE:
				return USE_CASE_EDEFAULT == null ? useCase != null : !USE_CASE_EDEFAULT.equals(useCase);
			case RequirementPackage.REQUIREMENT__REQUIREMENT_ATTRIBUTES:
				return requirementAttributes != null && !requirementAttributes.isEmpty();
			case RequirementPackage.REQUIREMENT__REQUIREMENT_STATUSS:
				return requirementStatuss != null && !requirementStatuss.isEmpty();
			case RequirementPackage.REQUIREMENT__WORK_REQUIREMENT_FULFILLMENTS:
				return workRequirementFulfillments != null && !workRequirementFulfillments.isEmpty();
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
		result.append(" (requirementId: ");
		result.append(requirementId);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", deliverableId: ");
		result.append(deliverableId);
		result.append(", description: ");
		result.append(description);
		result.append(", estimatedBudget: ");
		result.append(estimatedBudget);
		result.append(", facilityId: ");
		result.append(facilityId);
		result.append(", fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", productId: ");
		result.append(productId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", reason: ");
		result.append(reason);
		result.append(", requiredByDate: ");
		result.append(requiredByDate);
		result.append(", requirementStartDate: ");
		result.append(requirementStartDate);
		result.append(", requirementTypeId: ");
		result.append(requirementTypeId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", useCase: ");
		result.append(useCase);
		result.append(", requirementAttributes: ");
		result.append(requirementAttributes);
		result.append(", requirementStatuss: ");
		result.append(requirementStatuss);
		result.append(", workRequirementFulfillments: ");
		result.append(workRequirementFulfillments);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
