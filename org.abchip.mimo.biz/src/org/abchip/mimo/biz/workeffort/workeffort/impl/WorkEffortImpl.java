/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.note.NoteData;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.reservations.AccommodationSpot;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.abchip.mimo.biz.service.schedule.RuntimeData;
import org.abchip.mimo.biz.service.schedule.TemporalExpression;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getActualCompletionDate <em>Actual Completion Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getActualMilliSeconds <em>Actual Milli Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getActualSetupMillis <em>Actual Setup Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getEstimatedCompletionDate <em>Estimated Completion Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getEstimatedMilliSeconds <em>Estimated Milli Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getEstimatedSetupMillis <em>Estimated Setup Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getInfoUrl <em>Info Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getLastStatusUpdate <em>Last Status Update</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getLocationDesc <em>Location Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getQuantityProduced <em>Quantity Produced</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getQuantityRejected <em>Quantity Rejected</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getQuantityToProduce <em>Quantity To Produce</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#isSendNotificationEmail <em>Send Notification Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getServiceLoaderName <em>Service Loader Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getShowAsEnumId <em>Show As Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getSpecialTerms <em>Special Terms</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getTimeTransparency <em>Time Transparency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getTotalMilliSecondsAllowed <em>Total Milli Seconds Allowed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getTotalMoneyAllowed <em>Total Money Allowed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getUniversalId <em>Universal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortName <em>Work Effort Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortTypeId <em>Work Effort Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortPurposeTypeId <em>Work Effort Purpose Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortParentId <em>Work Effort Parent Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getCurrentStatusId <em>Current Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getScopeEnumId <em>Scope Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getMoneyUomId <em>Money Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getTempExprId <em>Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getRuntimeDataId <em>Runtime Data Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getNoteId <em>Note Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getEstimateCalcMethod <em>Estimate Calc Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getAccommodationMapId <em>Accommodation Map Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getAccommodationSpotId <em>Accommodation Spot Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getCommunicationEventWorkEffs <em>Communication Event Work Effs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortAttributes <em>Work Effort Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortDeliverableProds <em>Work Effort Deliverable Prods</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortEventReminders <em>Work Effort Event Reminders</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortFixedAssetStds <em>Work Effort Fixed Asset Stds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortInventoryAssigns <em>Work Effort Inventory Assigns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortInventoryProduceds <em>Work Effort Inventory Produceds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortKeywords <em>Work Effort Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortNotes <em>Work Effort Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortSkillStandards <em>Work Effort Skill Standards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortImpl extends BizEntityTypedImpl<WorkEffortType> implements WorkEffort {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualCompletionDate() <em>Actual Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCompletionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_COMPLETION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualCompletionDate() <em>Actual Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCompletionDate()
	 * @generated
	 * @ordered
	 */
	protected Date actualCompletionDate = ACTUAL_COMPLETION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualMilliSeconds() <em>Actual Milli Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualMilliSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_MILLI_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualMilliSeconds() <em>Actual Milli Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualMilliSeconds()
	 * @generated
	 * @ordered
	 */
	protected double actualMilliSeconds = ACTUAL_MILLI_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualSetupMillis() <em>Actual Setup Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualSetupMillis()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_SETUP_MILLIS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualSetupMillis() <em>Actual Setup Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualSetupMillis()
	 * @generated
	 * @ordered
	 */
	protected double actualSetupMillis = ACTUAL_SETUP_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualStartDate() <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualStartDate() <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date actualStartDate = ACTUAL_START_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getEstimatedCompletionDate() <em>Estimated Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCompletionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_COMPLETION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedCompletionDate() <em>Estimated Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCompletionDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedCompletionDate = ESTIMATED_COMPLETION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedMilliSeconds() <em>Estimated Milli Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedMilliSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double ESTIMATED_MILLI_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEstimatedMilliSeconds() <em>Estimated Milli Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedMilliSeconds()
	 * @generated
	 * @ordered
	 */
	protected double estimatedMilliSeconds = ESTIMATED_MILLI_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedSetupMillis() <em>Estimated Setup Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedSetupMillis()
	 * @generated
	 * @ordered
	 */
	protected static final double ESTIMATED_SETUP_MILLIS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEstimatedSetupMillis() <em>Estimated Setup Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedSetupMillis()
	 * @generated
	 * @ordered
	 */
	protected double estimatedSetupMillis = ESTIMATED_SETUP_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedStartDate() <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedStartDate() <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedStartDate = ESTIMATED_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoUrl() <em>Info Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoUrl() <em>Info Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoUrl()
	 * @generated
	 * @ordered
	 */
	protected String infoUrl = INFO_URL_EDEFAULT;

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
	 * The default value of the '{@link #getLastStatusUpdate() <em>Last Status Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStatusUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_STATUS_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastStatusUpdate() <em>Last Status Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStatusUpdate()
	 * @generated
	 * @ordered
	 */
	protected Date lastStatusUpdate = LAST_STATUS_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationDesc() <em>Location Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationDesc() <em>Location Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDesc()
	 * @generated
	 * @ordered
	 */
	protected String locationDesc = LOCATION_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final long PERCENT_COMPLETE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected long percentComplete = PERCENT_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final long PRIORITY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected long priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityProduced() <em>Quantity Produced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityProduced()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_PRODUCED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityProduced() <em>Quantity Produced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityProduced()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityProduced = QUANTITY_PRODUCED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityRejected() <em>Quantity Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityRejected()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_REJECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityRejected() <em>Quantity Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityRejected()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityRejected = QUANTITY_REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityToProduce() <em>Quantity To Produce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityToProduce()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_TO_PRODUCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityToProduce() <em>Quantity To Produce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityToProduce()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityToProduce = QUANTITY_TO_PRODUCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserv2ndPPPerc() <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV2ND_PP_PERC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserv2ndPPPerc() <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reserv2ndPPPerc = RESERV2ND_PP_PERC_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservNthPPPerc() <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservNthPPPerc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_NTH_PP_PERC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservNthPPPerc() <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservNthPPPerc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservNthPPPerc = RESERV_NTH_PP_PERC_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservPersons() <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservPersons()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_PERSONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservPersons() <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservPersons()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservPersons = RESERV_PERSONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long REVISION_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected long revisionNumber = REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isSendNotificationEmail() <em>Send Notification Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendNotificationEmail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEND_NOTIFICATION_EMAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSendNotificationEmail() <em>Send Notification Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendNotificationEmail()
	 * @generated
	 * @ordered
	 */
	protected boolean sendNotificationEmail = SEND_NOTIFICATION_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceLoaderName() <em>Service Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLoaderName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_LOADER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceLoaderName() <em>Service Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLoaderName()
	 * @generated
	 * @ordered
	 */
	protected String serviceLoaderName = SERVICE_LOADER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowAsEnumId() <em>Show As Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowAsEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOW_AS_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowAsEnumId() <em>Show As Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowAsEnumId()
	 * @generated
	 * @ordered
	 */
	protected String showAsEnumId = SHOW_AS_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceReferenceId() <em>Source Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReferenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_REFERENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceReferenceId() <em>Source Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReferenceId()
	 * @generated
	 * @ordered
	 */
	protected String sourceReferenceId = SOURCE_REFERENCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecialTerms() <em>Special Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialTerms()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_TERMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialTerms() <em>Special Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialTerms()
	 * @generated
	 * @ordered
	 */
	protected String specialTerms = SPECIAL_TERMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeTransparency() <em>Time Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_TRANSPARENCY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeTransparency() <em>Time Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTransparency()
	 * @generated
	 * @ordered
	 */
	protected long timeTransparency = TIME_TRANSPARENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalMilliSecondsAllowed() <em>Total Milli Seconds Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMilliSecondsAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_MILLI_SECONDS_ALLOWED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalMilliSecondsAllowed() <em>Total Milli Seconds Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMilliSecondsAllowed()
	 * @generated
	 * @ordered
	 */
	protected double totalMilliSecondsAllowed = TOTAL_MILLI_SECONDS_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalMoneyAllowed() <em>Total Money Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMoneyAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_MONEY_ALLOWED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalMoneyAllowed() <em>Total Money Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMoneyAllowed()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalMoneyAllowed = TOTAL_MONEY_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniversalId() <em>Universal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversalId()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIVERSAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniversalId() <em>Universal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversalId()
	 * @generated
	 * @ordered
	 */
	protected String universalId = UNIVERSAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkEffortName() <em>Work Effort Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortName() <em>Work Effort Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortName()
	 * @generated
	 * @ordered
	 */
	protected String workEffortName = WORK_EFFORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkEffortTypeId() <em>Work Effort Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortTypeId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffortType workEffortTypeId;

	/**
	 * The cached value of the '{@link #getWorkEffortPurposeTypeId() <em>Work Effort Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffortPurposeType workEffortPurposeTypeId;

	/**
	 * The cached value of the '{@link #getWorkEffortParentId() <em>Work Effort Parent Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortParentId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortParentId;

	/**
	 * The cached value of the '{@link #getCurrentStatusId() <em>Current Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem currentStatusId;

	/**
	 * The cached value of the '{@link #getScopeEnumId() <em>Scope Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration scopeEnumId;

	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility facilityId;

	/**
	 * The cached value of the '{@link #getMoneyUomId() <em>Money Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoneyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom moneyUomId;

	/**
	 * The cached value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected RecurrenceInfo recurrenceInfoId;

	/**
	 * The cached value of the '{@link #getTempExprId() <em>Temp Expr Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempExprId()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression tempExprId;

	/**
	 * The cached value of the '{@link #getRuntimeDataId() <em>Runtime Data Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeDataId()
	 * @generated
	 * @ordered
	 */
	protected RuntimeData runtimeDataId;

	/**
	 * The cached value of the '{@link #getNoteId() <em>Note Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteId()
	 * @generated
	 * @ordered
	 */
	protected NoteData noteId;

	/**
	 * The cached value of the '{@link #getEstimateCalcMethod() <em>Estimate Calc Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimateCalcMethod()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod estimateCalcMethod;

	/**
	 * The cached value of the '{@link #getAccommodationMapId() <em>Accommodation Map Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationMapId()
	 * @generated
	 * @ordered
	 */
	protected AccommodationMap accommodationMapId;

	/**
	 * The cached value of the '{@link #getAccommodationSpotId() <em>Accommodation Spot Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccommodationSpotId()
	 * @generated
	 * @ordered
	 */
	protected AccommodationSpot accommodationSpotId;

	/**
	 * The cached value of the '{@link #getCommunicationEventWorkEffs() <em>Communication Event Work Effs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventWorkEffs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> communicationEventWorkEffs;

	/**
	 * The cached value of the '{@link #getWorkEffortAttributes() <em>Work Effort Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortAttributes;

	/**
	 * The cached value of the '{@link #getWorkEffortDeliverableProds() <em>Work Effort Deliverable Prods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortDeliverableProds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortDeliverableProds;

	/**
	 * The cached value of the '{@link #getWorkEffortEventReminders() <em>Work Effort Event Reminders</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortEventReminders()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortEventReminders;

	/**
	 * The cached value of the '{@link #getWorkEffortFixedAssetStds() <em>Work Effort Fixed Asset Stds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortFixedAssetStds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortFixedAssetStds;

	/**
	 * The cached value of the '{@link #getWorkEffortInventoryAssigns() <em>Work Effort Inventory Assigns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortInventoryAssigns()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortInventoryAssigns;

	/**
	 * The cached value of the '{@link #getWorkEffortInventoryProduceds() <em>Work Effort Inventory Produceds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortInventoryProduceds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortInventoryProduceds;

	/**
	 * The cached value of the '{@link #getWorkEffortKeywords() <em>Work Effort Keywords</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortKeywords;

	/**
	 * The cached value of the '{@link #getWorkEffortNotes() <em>Work Effort Notes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortNotes;

	/**
	 * The cached value of the '{@link #getWorkEffortSkillStandards() <em>Work Effort Skill Standards</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortSkillStandards()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workEffortSkillStandards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccommodationMap getAccommodationMapId() {
		if (accommodationMapId != null && ((EObject)accommodationMapId).eIsProxy()) {
			InternalEObject oldAccommodationMapId = (InternalEObject)accommodationMapId;
			accommodationMapId = (AccommodationMap)eResolveProxy(oldAccommodationMapId);
			if (accommodationMapId != oldAccommodationMapId) {
			}
		}
		return accommodationMapId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccommodationMap basicGetAccommodationMapId() {
		return accommodationMapId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationMapId(AccommodationMap newAccommodationMapId) {
		accommodationMapId = newAccommodationMapId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccommodationSpot getAccommodationSpotId() {
		if (accommodationSpotId != null && ((EObject)accommodationSpotId).eIsProxy()) {
			InternalEObject oldAccommodationSpotId = (InternalEObject)accommodationSpotId;
			accommodationSpotId = (AccommodationSpot)eResolveProxy(oldAccommodationSpotId);
			if (accommodationSpotId != oldAccommodationSpotId) {
			}
		}
		return accommodationSpotId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccommodationSpot basicGetAccommodationSpotId() {
		return accommodationSpotId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationSpotId(AccommodationSpot newAccommodationSpotId) {
		accommodationSpotId = newAccommodationSpotId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualCompletionDate() {
		return actualCompletionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCompletionDate(Date newActualCompletionDate) {
		actualCompletionDate = newActualCompletionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getActualMilliSeconds() {
		return actualMilliSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualMilliSeconds(double newActualMilliSeconds) {
		actualMilliSeconds = newActualMilliSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getActualSetupMillis() {
		return actualSetupMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualSetupMillis(double newActualSetupMillis) {
		actualSetupMillis = newActualSetupMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualStartDate() {
		return actualStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualStartDate(Date newActualStartDate) {
		actualStartDate = newActualStartDate;
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
		createdByUserLogin = newCreatedByUserLogin;
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
		createdDate = newCreatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getCurrentStatusId() {
		if (currentStatusId != null && ((EObject)currentStatusId).eIsProxy()) {
			InternalEObject oldCurrentStatusId = (InternalEObject)currentStatusId;
			currentStatusId = (StatusItem)eResolveProxy(oldCurrentStatusId);
			if (currentStatusId != oldCurrentStatusId) {
			}
		}
		return currentStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetCurrentStatusId() {
		return currentStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentStatusId(StatusItem newCurrentStatusId) {
		currentStatusId = newCurrentStatusId;
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
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getEstimateCalcMethod() {
		if (estimateCalcMethod != null && ((EObject)estimateCalcMethod).eIsProxy()) {
			InternalEObject oldEstimateCalcMethod = (InternalEObject)estimateCalcMethod;
			estimateCalcMethod = (CustomMethod)eResolveProxy(oldEstimateCalcMethod);
			if (estimateCalcMethod != oldEstimateCalcMethod) {
			}
		}
		return estimateCalcMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetEstimateCalcMethod() {
		return estimateCalcMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimateCalcMethod(CustomMethod newEstimateCalcMethod) {
		estimateCalcMethod = newEstimateCalcMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedCompletionDate() {
		return estimatedCompletionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedCompletionDate(Date newEstimatedCompletionDate) {
		estimatedCompletionDate = newEstimatedCompletionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedMilliSeconds() {
		return estimatedMilliSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedMilliSeconds(double newEstimatedMilliSeconds) {
		estimatedMilliSeconds = newEstimatedMilliSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedSetupMillis() {
		return estimatedSetupMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedSetupMillis(double newEstimatedSetupMillis) {
		estimatedSetupMillis = newEstimatedSetupMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedStartDate() {
		return estimatedStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedStartDate(Date newEstimatedStartDate) {
		estimatedStartDate = newEstimatedStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		if (facilityId != null && ((EObject)facilityId).eIsProxy()) {
			InternalEObject oldFacilityId = (InternalEObject)facilityId;
			facilityId = (Facility)eResolveProxy(oldFacilityId);
			if (facilityId != oldFacilityId) {
			}
		}
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		facilityId = newFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		fixedAssetId = newFixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfoUrl() {
		return infoUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoUrl(String newInfoUrl) {
		infoUrl = newInfoUrl;
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
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
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
		lastModifiedDate = newLastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastStatusUpdate() {
		return lastStatusUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastStatusUpdate(Date newLastStatusUpdate) {
		lastStatusUpdate = newLastStatusUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationDesc() {
		return locationDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationDesc(String newLocationDesc) {
		locationDesc = newLocationDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getMoneyUomId() {
		if (moneyUomId != null && ((EObject)moneyUomId).eIsProxy()) {
			InternalEObject oldMoneyUomId = (InternalEObject)moneyUomId;
			moneyUomId = (Uom)eResolveProxy(oldMoneyUomId);
			if (moneyUomId != oldMoneyUomId) {
			}
		}
		return moneyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetMoneyUomId() {
		return moneyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoneyUomId(Uom newMoneyUomId) {
		moneyUomId = newMoneyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteData getNoteId() {
		if (noteId != null && ((EObject)noteId).eIsProxy()) {
			InternalEObject oldNoteId = (InternalEObject)noteId;
			noteId = (NoteData)eResolveProxy(oldNoteId);
			if (noteId != oldNoteId) {
			}
		}
		return noteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteData basicGetNoteId() {
		return noteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteId(NoteData newNoteId) {
		noteId = newNoteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPercentComplete() {
		return percentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentComplete(long newPercentComplete) {
		percentComplete = newPercentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(long newPriority) {
		priority = newPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityProduced() {
		return quantityProduced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityProduced(BigDecimal newQuantityProduced) {
		quantityProduced = newQuantityProduced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityRejected() {
		return quantityRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityRejected(BigDecimal newQuantityRejected) {
		quantityRejected = newQuantityRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityToProduce() {
		return quantityToProduce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityToProduce(BigDecimal newQuantityToProduce) {
		quantityToProduce = newQuantityToProduce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceInfo getRecurrenceInfoId() {
		if (recurrenceInfoId != null && ((EObject)recurrenceInfoId).eIsProxy()) {
			InternalEObject oldRecurrenceInfoId = (InternalEObject)recurrenceInfoId;
			recurrenceInfoId = (RecurrenceInfo)eResolveProxy(oldRecurrenceInfoId);
			if (recurrenceInfoId != oldRecurrenceInfoId) {
			}
		}
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrenceInfo basicGetRecurrenceInfoId() {
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(RecurrenceInfo newRecurrenceInfoId) {
		recurrenceInfoId = newRecurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReserv2ndPPPerc() {
		return reserv2ndPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserv2ndPPPerc(BigDecimal newReserv2ndPPPerc) {
		reserv2ndPPPerc = newReserv2ndPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservNthPPPerc() {
		return reservNthPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservNthPPPerc(BigDecimal newReservNthPPPerc) {
		reservNthPPPerc = newReservNthPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservPersons() {
		return reservPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservPersons(BigDecimal newReservPersons) {
		reservPersons = newReservPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRevisionNumber() {
		return revisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionNumber(long newRevisionNumber) {
		revisionNumber = newRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeData getRuntimeDataId() {
		if (runtimeDataId != null && ((EObject)runtimeDataId).eIsProxy()) {
			InternalEObject oldRuntimeDataId = (InternalEObject)runtimeDataId;
			runtimeDataId = (RuntimeData)eResolveProxy(oldRuntimeDataId);
			if (runtimeDataId != oldRuntimeDataId) {
			}
		}
		return runtimeDataId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeData basicGetRuntimeDataId() {
		return runtimeDataId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeDataId(RuntimeData newRuntimeDataId) {
		runtimeDataId = newRuntimeDataId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getScopeEnumId() {
		if (scopeEnumId != null && ((EObject)scopeEnumId).eIsProxy()) {
			InternalEObject oldScopeEnumId = (InternalEObject)scopeEnumId;
			scopeEnumId = (Enumeration)eResolveProxy(oldScopeEnumId);
			if (scopeEnumId != oldScopeEnumId) {
			}
		}
		return scopeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetScopeEnumId() {
		return scopeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopeEnumId(Enumeration newScopeEnumId) {
		scopeEnumId = newScopeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSendNotificationEmail() {
		return sendNotificationEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendNotificationEmail(boolean newSendNotificationEmail) {
		sendNotificationEmail = newSendNotificationEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceLoaderName() {
		return serviceLoaderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceLoaderName(String newServiceLoaderName) {
		serviceLoaderName = newServiceLoaderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShowAsEnumId() {
		return showAsEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowAsEnumId(String newShowAsEnumId) {
		showAsEnumId = newShowAsEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceReferenceId() {
		return sourceReferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceReferenceId(String newSourceReferenceId) {
		sourceReferenceId = newSourceReferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecialTerms() {
		return specialTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialTerms(String newSpecialTerms) {
		specialTerms = newSpecialTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExpression getTempExprId() {
		if (tempExprId != null && ((EObject)tempExprId).eIsProxy()) {
			InternalEObject oldTempExprId = (InternalEObject)tempExprId;
			tempExprId = (TemporalExpression)eResolveProxy(oldTempExprId);
			if (tempExprId != oldTempExprId) {
			}
		}
		return tempExprId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression basicGetTempExprId() {
		return tempExprId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempExprId(TemporalExpression newTempExprId) {
		tempExprId = newTempExprId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeTransparency() {
		return timeTransparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeTransparency(long newTimeTransparency) {
		timeTransparency = newTimeTransparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalMilliSecondsAllowed() {
		return totalMilliSecondsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalMilliSecondsAllowed(double newTotalMilliSecondsAllowed) {
		totalMilliSecondsAllowed = newTotalMilliSecondsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalMoneyAllowed() {
		return totalMoneyAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalMoneyAllowed(BigDecimal newTotalMoneyAllowed) {
		totalMoneyAllowed = newTotalMoneyAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUniversalId() {
		return universalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversalId(String newUniversalId) {
		universalId = newUniversalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		workEffortId = newWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortName() {
		return workEffortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortName(String newWorkEffortName) {
		workEffortName = newWorkEffortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortParentId() {
		if (workEffortParentId != null && ((EObject)workEffortParentId).eIsProxy()) {
			InternalEObject oldWorkEffortParentId = (InternalEObject)workEffortParentId;
			workEffortParentId = (WorkEffort)eResolveProxy(oldWorkEffortParentId);
			if (workEffortParentId != oldWorkEffortParentId) {
			}
		}
		return workEffortParentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortParentId() {
		return workEffortParentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortParentId(WorkEffort newWorkEffortParentId) {
		workEffortParentId = newWorkEffortParentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortPurposeType getWorkEffortPurposeTypeId() {
		if (workEffortPurposeTypeId != null && ((EObject)workEffortPurposeTypeId).eIsProxy()) {
			InternalEObject oldWorkEffortPurposeTypeId = (InternalEObject)workEffortPurposeTypeId;
			workEffortPurposeTypeId = (WorkEffortPurposeType)eResolveProxy(oldWorkEffortPurposeTypeId);
			if (workEffortPurposeTypeId != oldWorkEffortPurposeTypeId) {
			}
		}
		return workEffortPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffortPurposeType basicGetWorkEffortPurposeTypeId() {
		return workEffortPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortPurposeTypeId(WorkEffortPurposeType newWorkEffortPurposeTypeId) {
		workEffortPurposeTypeId = newWorkEffortPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortType getWorkEffortTypeId() {
		if (workEffortTypeId != null && ((EObject)workEffortTypeId).eIsProxy()) {
			InternalEObject oldWorkEffortTypeId = (InternalEObject)workEffortTypeId;
			workEffortTypeId = (WorkEffortType)eResolveProxy(oldWorkEffortTypeId);
			if (workEffortTypeId != oldWorkEffortTypeId) {
			}
		}
		return workEffortTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffortType basicGetWorkEffortTypeId() {
		return workEffortTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortTypeId(WorkEffortType newWorkEffortTypeId) {
		workEffortTypeId = newWorkEffortTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCommunicationEventWorkEffs() {
		if (communicationEventWorkEffs == null) {
			communicationEventWorkEffs = new BasicInternalEList<String>(String.class);
		}
		return communicationEventWorkEffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortAttributes() {
		if (workEffortAttributes == null) {
			workEffortAttributes = new BasicInternalEList<String>(String.class);
		}
		return workEffortAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortDeliverableProds() {
		if (workEffortDeliverableProds == null) {
			workEffortDeliverableProds = new BasicInternalEList<String>(String.class);
		}
		return workEffortDeliverableProds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortEventReminders() {
		if (workEffortEventReminders == null) {
			workEffortEventReminders = new BasicInternalEList<String>(String.class);
		}
		return workEffortEventReminders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortFixedAssetStds() {
		if (workEffortFixedAssetStds == null) {
			workEffortFixedAssetStds = new BasicInternalEList<String>(String.class);
		}
		return workEffortFixedAssetStds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortInventoryAssigns() {
		if (workEffortInventoryAssigns == null) {
			workEffortInventoryAssigns = new BasicInternalEList<String>(String.class);
		}
		return workEffortInventoryAssigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortInventoryProduceds() {
		if (workEffortInventoryProduceds == null) {
			workEffortInventoryProduceds = new BasicInternalEList<String>(String.class);
		}
		return workEffortInventoryProduceds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortKeywords() {
		if (workEffortKeywords == null) {
			workEffortKeywords = new BasicInternalEList<String>(String.class);
		}
		return workEffortKeywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortNotes() {
		if (workEffortNotes == null) {
			workEffortNotes = new BasicInternalEList<String>(String.class);
		}
		return workEffortNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWorkEffortSkillStandards() {
		if (workEffortSkillStandards == null) {
			workEffortSkillStandards = new BasicInternalEList<String>(String.class);
		}
		return workEffortSkillStandards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTranss() {
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
	public List<String> childWorkEfforts() {
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
	public List<String> costComponents() {
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
	public List<String> custRequestWorkEfforts() {
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
	public List<String> estimatedArrivalShipments() {
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
	public List<String> estimatedShipShipments() {
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
	public List<String> inventoryItemDetails() {
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
	public List<String> maintTemplateProductMaints() {
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
	public List<String> orderHeaderWorkEfforts() {
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
	public List<String> quoteItems() {
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
	public List<String> quoteWorkEfforts() {
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
	public List<String> salesOpportunityWorkEfforts() {
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
	public List<String> scheduleFixedAssetMaints() {
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
	public List<String> shoppingListWorkEfforts() {
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
	public List<String> timeEntries() {
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
	public List<String> workRequirementFulfillments() {
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
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_ID:
				return getWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_COMPLETION_DATE:
				return getActualCompletionDate();
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_MILLI_SECONDS:
				return getActualMilliSeconds();
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_SETUP_MILLIS:
				return getActualSetupMillis();
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_START_DATE:
				return getActualStartDate();
			case WorkeffortPackage.WORK_EFFORT__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case WorkeffortPackage.WORK_EFFORT__CREATED_DATE:
				return getCreatedDate();
			case WorkeffortPackage.WORK_EFFORT__DESCRIPTION:
				return getDescription();
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_COMPLETION_DATE:
				return getEstimatedCompletionDate();
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_MILLI_SECONDS:
				return getEstimatedMilliSeconds();
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_SETUP_MILLIS:
				return getEstimatedSetupMillis();
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_START_DATE:
				return getEstimatedStartDate();
			case WorkeffortPackage.WORK_EFFORT__INFO_URL:
				return getInfoUrl();
			case WorkeffortPackage.WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case WorkeffortPackage.WORK_EFFORT__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case WorkeffortPackage.WORK_EFFORT__LAST_STATUS_UPDATE:
				return getLastStatusUpdate();
			case WorkeffortPackage.WORK_EFFORT__LOCATION_DESC:
				return getLocationDesc();
			case WorkeffortPackage.WORK_EFFORT__PERCENT_COMPLETE:
				return getPercentComplete();
			case WorkeffortPackage.WORK_EFFORT__PRIORITY:
				return getPriority();
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_PRODUCED:
				return getQuantityProduced();
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_REJECTED:
				return getQuantityRejected();
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_TO_PRODUCE:
				return getQuantityToProduce();
			case WorkeffortPackage.WORK_EFFORT__RESERV2ND_PP_PERC:
				return getReserv2ndPPPerc();
			case WorkeffortPackage.WORK_EFFORT__RESERV_NTH_PP_PERC:
				return getReservNthPPPerc();
			case WorkeffortPackage.WORK_EFFORT__RESERV_PERSONS:
				return getReservPersons();
			case WorkeffortPackage.WORK_EFFORT__REVISION_NUMBER:
				return getRevisionNumber();
			case WorkeffortPackage.WORK_EFFORT__SEND_NOTIFICATION_EMAIL:
				return isSendNotificationEmail();
			case WorkeffortPackage.WORK_EFFORT__SERVICE_LOADER_NAME:
				return getServiceLoaderName();
			case WorkeffortPackage.WORK_EFFORT__SHOW_AS_ENUM_ID:
				return getShowAsEnumId();
			case WorkeffortPackage.WORK_EFFORT__SOURCE_REFERENCE_ID:
				return getSourceReferenceId();
			case WorkeffortPackage.WORK_EFFORT__SPECIAL_TERMS:
				return getSpecialTerms();
			case WorkeffortPackage.WORK_EFFORT__TIME_TRANSPARENCY:
				return getTimeTransparency();
			case WorkeffortPackage.WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED:
				return getTotalMilliSecondsAllowed();
			case WorkeffortPackage.WORK_EFFORT__TOTAL_MONEY_ALLOWED:
				return getTotalMoneyAllowed();
			case WorkeffortPackage.WORK_EFFORT__UNIVERSAL_ID:
				return getUniversalId();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_NAME:
				return getWorkEffortName();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_TYPE_ID:
				if (resolve) return getWorkEffortTypeId();
				return basicGetWorkEffortTypeId();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE_ID:
				if (resolve) return getWorkEffortPurposeTypeId();
				return basicGetWorkEffortPurposeTypeId();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_PARENT_ID:
				if (resolve) return getWorkEffortParentId();
				return basicGetWorkEffortParentId();
			case WorkeffortPackage.WORK_EFFORT__CURRENT_STATUS_ID:
				if (resolve) return getCurrentStatusId();
				return basicGetCurrentStatusId();
			case WorkeffortPackage.WORK_EFFORT__SCOPE_ENUM_ID:
				if (resolve) return getScopeEnumId();
				return basicGetScopeEnumId();
			case WorkeffortPackage.WORK_EFFORT__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case WorkeffortPackage.WORK_EFFORT__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
			case WorkeffortPackage.WORK_EFFORT__MONEY_UOM_ID:
				if (resolve) return getMoneyUomId();
				return basicGetMoneyUomId();
			case WorkeffortPackage.WORK_EFFORT__RECURRENCE_INFO_ID:
				if (resolve) return getRecurrenceInfoId();
				return basicGetRecurrenceInfoId();
			case WorkeffortPackage.WORK_EFFORT__TEMP_EXPR_ID:
				if (resolve) return getTempExprId();
				return basicGetTempExprId();
			case WorkeffortPackage.WORK_EFFORT__RUNTIME_DATA_ID:
				if (resolve) return getRuntimeDataId();
				return basicGetRuntimeDataId();
			case WorkeffortPackage.WORK_EFFORT__NOTE_ID:
				if (resolve) return getNoteId();
				return basicGetNoteId();
			case WorkeffortPackage.WORK_EFFORT__ESTIMATE_CALC_METHOD:
				if (resolve) return getEstimateCalcMethod();
				return basicGetEstimateCalcMethod();
			case WorkeffortPackage.WORK_EFFORT__ACCOMMODATION_MAP_ID:
				if (resolve) return getAccommodationMapId();
				return basicGetAccommodationMapId();
			case WorkeffortPackage.WORK_EFFORT__ACCOMMODATION_SPOT_ID:
				if (resolve) return getAccommodationSpotId();
				return basicGetAccommodationSpotId();
			case WorkeffortPackage.WORK_EFFORT__COMMUNICATION_EVENT_WORK_EFFS:
				return getCommunicationEventWorkEffs();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_ATTRIBUTES:
				return getWorkEffortAttributes();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_DELIVERABLE_PRODS:
				return getWorkEffortDeliverableProds();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_EVENT_REMINDERS:
				return getWorkEffortEventReminders();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_STDS:
				return getWorkEffortFixedAssetStds();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_INVENTORY_ASSIGNS:
				return getWorkEffortInventoryAssigns();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_INVENTORY_PRODUCEDS:
				return getWorkEffortInventoryProduceds();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_KEYWORDS:
				return getWorkEffortKeywords();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_NOTES:
				return getWorkEffortNotes();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_SKILL_STANDARDS:
				return getWorkEffortSkillStandards();
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
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_COMPLETION_DATE:
				setActualCompletionDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_MILLI_SECONDS:
				setActualMilliSeconds((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_SETUP_MILLIS:
				setActualSetupMillis((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_START_DATE:
				setActualStartDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_COMPLETION_DATE:
				setEstimatedCompletionDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_MILLI_SECONDS:
				setEstimatedMilliSeconds((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_SETUP_MILLIS:
				setEstimatedSetupMillis((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_START_DATE:
				setEstimatedStartDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__INFO_URL:
				setInfoUrl((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__LAST_STATUS_UPDATE:
				setLastStatusUpdate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__LOCATION_DESC:
				setLocationDesc((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__PERCENT_COMPLETE:
				setPercentComplete((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__PRIORITY:
				setPriority((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_PRODUCED:
				setQuantityProduced((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_REJECTED:
				setQuantityRejected((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_TO_PRODUCE:
				setQuantityToProduce((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__RESERV2ND_PP_PERC:
				setReserv2ndPPPerc((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__RESERV_NTH_PP_PERC:
				setReservNthPPPerc((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__RESERV_PERSONS:
				setReservPersons((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__REVISION_NUMBER:
				setRevisionNumber((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__SEND_NOTIFICATION_EMAIL:
				setSendNotificationEmail((Boolean)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__SERVICE_LOADER_NAME:
				setServiceLoaderName((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__SHOW_AS_ENUM_ID:
				setShowAsEnumId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__SOURCE_REFERENCE_ID:
				setSourceReferenceId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__SPECIAL_TERMS:
				setSpecialTerms((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__TIME_TRANSPARENCY:
				setTimeTransparency((Long)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED:
				setTotalMilliSecondsAllowed((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__TOTAL_MONEY_ALLOWED:
				setTotalMoneyAllowed((BigDecimal)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__UNIVERSAL_ID:
				setUniversalId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_NAME:
				setWorkEffortName((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_TYPE_ID:
				setWorkEffortTypeId((WorkEffortType)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE_ID:
				setWorkEffortPurposeTypeId((WorkEffortPurposeType)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_PARENT_ID:
				setWorkEffortParentId((WorkEffort)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__CURRENT_STATUS_ID:
				setCurrentStatusId((StatusItem)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__SCOPE_ENUM_ID:
				setScopeEnumId((Enumeration)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__FACILITY_ID:
				setFacilityId((Facility)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__MONEY_UOM_ID:
				setMoneyUomId((Uom)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((RecurrenceInfo)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__TEMP_EXPR_ID:
				setTempExprId((TemporalExpression)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__RUNTIME_DATA_ID:
				setRuntimeDataId((RuntimeData)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__NOTE_ID:
				setNoteId((NoteData)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATE_CALC_METHOD:
				setEstimateCalcMethod((CustomMethod)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACCOMMODATION_MAP_ID:
				setAccommodationMapId((AccommodationMap)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACCOMMODATION_SPOT_ID:
				setAccommodationSpotId((AccommodationSpot)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__COMMUNICATION_EVENT_WORK_EFFS:
				getCommunicationEventWorkEffs().clear();
				getCommunicationEventWorkEffs().addAll((Collection<? extends String>)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_ATTRIBUTES:
				getWorkEffortAttributes().clear();
				getWorkEffortAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_DELIVERABLE_PRODS:
				getWorkEffortDeliverableProds().clear();
				getWorkEffortDeliverableProds().addAll((Collection<? extends String>)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_EVENT_REMINDERS:
				getWorkEffortEventReminders().clear();
				getWorkEffortEventReminders().addAll((Collection<? extends String>)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_STDS:
				getWorkEffortFixedAssetStds().clear();
				getWorkEffortFixedAssetStds().addAll((Collection<? extends String>)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_INVENTORY_ASSIGNS:
				getWorkEffortInventoryAssigns().clear();
				getWorkEffortInventoryAssigns().addAll((Collection<? extends String>)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_INVENTORY_PRODUCEDS:
				getWorkEffortInventoryProduceds().clear();
				getWorkEffortInventoryProduceds().addAll((Collection<? extends String>)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_KEYWORDS:
				getWorkEffortKeywords().clear();
				getWorkEffortKeywords().addAll((Collection<? extends String>)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_NOTES:
				getWorkEffortNotes().clear();
				getWorkEffortNotes().addAll((Collection<? extends String>)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_SKILL_STANDARDS:
				getWorkEffortSkillStandards().clear();
				getWorkEffortSkillStandards().addAll((Collection<? extends String>)newValue);
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
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_COMPLETION_DATE:
				setActualCompletionDate(ACTUAL_COMPLETION_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_MILLI_SECONDS:
				setActualMilliSeconds(ACTUAL_MILLI_SECONDS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_SETUP_MILLIS:
				setActualSetupMillis(ACTUAL_SETUP_MILLIS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_START_DATE:
				setActualStartDate(ACTUAL_START_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_COMPLETION_DATE:
				setEstimatedCompletionDate(ESTIMATED_COMPLETION_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_MILLI_SECONDS:
				setEstimatedMilliSeconds(ESTIMATED_MILLI_SECONDS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_SETUP_MILLIS:
				setEstimatedSetupMillis(ESTIMATED_SETUP_MILLIS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_START_DATE:
				setEstimatedStartDate(ESTIMATED_START_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__INFO_URL:
				setInfoUrl(INFO_URL_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__LAST_STATUS_UPDATE:
				setLastStatusUpdate(LAST_STATUS_UPDATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__LOCATION_DESC:
				setLocationDesc(LOCATION_DESC_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__PERCENT_COMPLETE:
				setPercentComplete(PERCENT_COMPLETE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_PRODUCED:
				setQuantityProduced(QUANTITY_PRODUCED_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_REJECTED:
				setQuantityRejected(QUANTITY_REJECTED_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_TO_PRODUCE:
				setQuantityToProduce(QUANTITY_TO_PRODUCE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__RESERV2ND_PP_PERC:
				setReserv2ndPPPerc(RESERV2ND_PP_PERC_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__RESERV_NTH_PP_PERC:
				setReservNthPPPerc(RESERV_NTH_PP_PERC_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__RESERV_PERSONS:
				setReservPersons(RESERV_PERSONS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__SEND_NOTIFICATION_EMAIL:
				setSendNotificationEmail(SEND_NOTIFICATION_EMAIL_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__SERVICE_LOADER_NAME:
				setServiceLoaderName(SERVICE_LOADER_NAME_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__SHOW_AS_ENUM_ID:
				setShowAsEnumId(SHOW_AS_ENUM_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__SOURCE_REFERENCE_ID:
				setSourceReferenceId(SOURCE_REFERENCE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__SPECIAL_TERMS:
				setSpecialTerms(SPECIAL_TERMS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__TIME_TRANSPARENCY:
				setTimeTransparency(TIME_TRANSPARENCY_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED:
				setTotalMilliSecondsAllowed(TOTAL_MILLI_SECONDS_ALLOWED_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__TOTAL_MONEY_ALLOWED:
				setTotalMoneyAllowed(TOTAL_MONEY_ALLOWED_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__UNIVERSAL_ID:
				setUniversalId(UNIVERSAL_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_NAME:
				setWorkEffortName(WORK_EFFORT_NAME_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_TYPE_ID:
				setWorkEffortTypeId((WorkEffortType)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE_ID:
				setWorkEffortPurposeTypeId((WorkEffortPurposeType)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_PARENT_ID:
				setWorkEffortParentId((WorkEffort)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__CURRENT_STATUS_ID:
				setCurrentStatusId((StatusItem)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__SCOPE_ENUM_ID:
				setScopeEnumId((Enumeration)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__FACILITY_ID:
				setFacilityId((Facility)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__MONEY_UOM_ID:
				setMoneyUomId((Uom)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((RecurrenceInfo)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__TEMP_EXPR_ID:
				setTempExprId((TemporalExpression)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__RUNTIME_DATA_ID:
				setRuntimeDataId((RuntimeData)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__NOTE_ID:
				setNoteId((NoteData)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATE_CALC_METHOD:
				setEstimateCalcMethod((CustomMethod)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACCOMMODATION_MAP_ID:
				setAccommodationMapId((AccommodationMap)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__ACCOMMODATION_SPOT_ID:
				setAccommodationSpotId((AccommodationSpot)null);
				return;
			case WorkeffortPackage.WORK_EFFORT__COMMUNICATION_EVENT_WORK_EFFS:
				getCommunicationEventWorkEffs().clear();
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_ATTRIBUTES:
				getWorkEffortAttributes().clear();
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_DELIVERABLE_PRODS:
				getWorkEffortDeliverableProds().clear();
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_EVENT_REMINDERS:
				getWorkEffortEventReminders().clear();
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_STDS:
				getWorkEffortFixedAssetStds().clear();
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_INVENTORY_ASSIGNS:
				getWorkEffortInventoryAssigns().clear();
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_INVENTORY_PRODUCEDS:
				getWorkEffortInventoryProduceds().clear();
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_KEYWORDS:
				getWorkEffortKeywords().clear();
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_NOTES:
				getWorkEffortNotes().clear();
				return;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_SKILL_STANDARDS:
				getWorkEffortSkillStandards().clear();
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
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_COMPLETION_DATE:
				return ACTUAL_COMPLETION_DATE_EDEFAULT == null ? actualCompletionDate != null : !ACTUAL_COMPLETION_DATE_EDEFAULT.equals(actualCompletionDate);
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_MILLI_SECONDS:
				return actualMilliSeconds != ACTUAL_MILLI_SECONDS_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_SETUP_MILLIS:
				return actualSetupMillis != ACTUAL_SETUP_MILLIS_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__ACTUAL_START_DATE:
				return ACTUAL_START_DATE_EDEFAULT == null ? actualStartDate != null : !ACTUAL_START_DATE_EDEFAULT.equals(actualStartDate);
			case WorkeffortPackage.WORK_EFFORT__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case WorkeffortPackage.WORK_EFFORT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case WorkeffortPackage.WORK_EFFORT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_COMPLETION_DATE:
				return ESTIMATED_COMPLETION_DATE_EDEFAULT == null ? estimatedCompletionDate != null : !ESTIMATED_COMPLETION_DATE_EDEFAULT.equals(estimatedCompletionDate);
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_MILLI_SECONDS:
				return estimatedMilliSeconds != ESTIMATED_MILLI_SECONDS_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_SETUP_MILLIS:
				return estimatedSetupMillis != ESTIMATED_SETUP_MILLIS_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATED_START_DATE:
				return ESTIMATED_START_DATE_EDEFAULT == null ? estimatedStartDate != null : !ESTIMATED_START_DATE_EDEFAULT.equals(estimatedStartDate);
			case WorkeffortPackage.WORK_EFFORT__INFO_URL:
				return INFO_URL_EDEFAULT == null ? infoUrl != null : !INFO_URL_EDEFAULT.equals(infoUrl);
			case WorkeffortPackage.WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case WorkeffortPackage.WORK_EFFORT__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case WorkeffortPackage.WORK_EFFORT__LAST_STATUS_UPDATE:
				return LAST_STATUS_UPDATE_EDEFAULT == null ? lastStatusUpdate != null : !LAST_STATUS_UPDATE_EDEFAULT.equals(lastStatusUpdate);
			case WorkeffortPackage.WORK_EFFORT__LOCATION_DESC:
				return LOCATION_DESC_EDEFAULT == null ? locationDesc != null : !LOCATION_DESC_EDEFAULT.equals(locationDesc);
			case WorkeffortPackage.WORK_EFFORT__PERCENT_COMPLETE:
				return percentComplete != PERCENT_COMPLETE_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_PRODUCED:
				return QUANTITY_PRODUCED_EDEFAULT == null ? quantityProduced != null : !QUANTITY_PRODUCED_EDEFAULT.equals(quantityProduced);
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_REJECTED:
				return QUANTITY_REJECTED_EDEFAULT == null ? quantityRejected != null : !QUANTITY_REJECTED_EDEFAULT.equals(quantityRejected);
			case WorkeffortPackage.WORK_EFFORT__QUANTITY_TO_PRODUCE:
				return QUANTITY_TO_PRODUCE_EDEFAULT == null ? quantityToProduce != null : !QUANTITY_TO_PRODUCE_EDEFAULT.equals(quantityToProduce);
			case WorkeffortPackage.WORK_EFFORT__RESERV2ND_PP_PERC:
				return RESERV2ND_PP_PERC_EDEFAULT == null ? reserv2ndPPPerc != null : !RESERV2ND_PP_PERC_EDEFAULT.equals(reserv2ndPPPerc);
			case WorkeffortPackage.WORK_EFFORT__RESERV_NTH_PP_PERC:
				return RESERV_NTH_PP_PERC_EDEFAULT == null ? reservNthPPPerc != null : !RESERV_NTH_PP_PERC_EDEFAULT.equals(reservNthPPPerc);
			case WorkeffortPackage.WORK_EFFORT__RESERV_PERSONS:
				return RESERV_PERSONS_EDEFAULT == null ? reservPersons != null : !RESERV_PERSONS_EDEFAULT.equals(reservPersons);
			case WorkeffortPackage.WORK_EFFORT__REVISION_NUMBER:
				return revisionNumber != REVISION_NUMBER_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__SEND_NOTIFICATION_EMAIL:
				return sendNotificationEmail != SEND_NOTIFICATION_EMAIL_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__SERVICE_LOADER_NAME:
				return SERVICE_LOADER_NAME_EDEFAULT == null ? serviceLoaderName != null : !SERVICE_LOADER_NAME_EDEFAULT.equals(serviceLoaderName);
			case WorkeffortPackage.WORK_EFFORT__SHOW_AS_ENUM_ID:
				return SHOW_AS_ENUM_ID_EDEFAULT == null ? showAsEnumId != null : !SHOW_AS_ENUM_ID_EDEFAULT.equals(showAsEnumId);
			case WorkeffortPackage.WORK_EFFORT__SOURCE_REFERENCE_ID:
				return SOURCE_REFERENCE_ID_EDEFAULT == null ? sourceReferenceId != null : !SOURCE_REFERENCE_ID_EDEFAULT.equals(sourceReferenceId);
			case WorkeffortPackage.WORK_EFFORT__SPECIAL_TERMS:
				return SPECIAL_TERMS_EDEFAULT == null ? specialTerms != null : !SPECIAL_TERMS_EDEFAULT.equals(specialTerms);
			case WorkeffortPackage.WORK_EFFORT__TIME_TRANSPARENCY:
				return timeTransparency != TIME_TRANSPARENCY_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED:
				return totalMilliSecondsAllowed != TOTAL_MILLI_SECONDS_ALLOWED_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT__TOTAL_MONEY_ALLOWED:
				return TOTAL_MONEY_ALLOWED_EDEFAULT == null ? totalMoneyAllowed != null : !TOTAL_MONEY_ALLOWED_EDEFAULT.equals(totalMoneyAllowed);
			case WorkeffortPackage.WORK_EFFORT__UNIVERSAL_ID:
				return UNIVERSAL_ID_EDEFAULT == null ? universalId != null : !UNIVERSAL_ID_EDEFAULT.equals(universalId);
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_NAME:
				return WORK_EFFORT_NAME_EDEFAULT == null ? workEffortName != null : !WORK_EFFORT_NAME_EDEFAULT.equals(workEffortName);
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_TYPE_ID:
				return workEffortTypeId != null;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE_ID:
				return workEffortPurposeTypeId != null;
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_PARENT_ID:
				return workEffortParentId != null;
			case WorkeffortPackage.WORK_EFFORT__CURRENT_STATUS_ID:
				return currentStatusId != null;
			case WorkeffortPackage.WORK_EFFORT__SCOPE_ENUM_ID:
				return scopeEnumId != null;
			case WorkeffortPackage.WORK_EFFORT__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case WorkeffortPackage.WORK_EFFORT__FACILITY_ID:
				return facilityId != null;
			case WorkeffortPackage.WORK_EFFORT__MONEY_UOM_ID:
				return moneyUomId != null;
			case WorkeffortPackage.WORK_EFFORT__RECURRENCE_INFO_ID:
				return recurrenceInfoId != null;
			case WorkeffortPackage.WORK_EFFORT__TEMP_EXPR_ID:
				return tempExprId != null;
			case WorkeffortPackage.WORK_EFFORT__RUNTIME_DATA_ID:
				return runtimeDataId != null;
			case WorkeffortPackage.WORK_EFFORT__NOTE_ID:
				return noteId != null;
			case WorkeffortPackage.WORK_EFFORT__ESTIMATE_CALC_METHOD:
				return estimateCalcMethod != null;
			case WorkeffortPackage.WORK_EFFORT__ACCOMMODATION_MAP_ID:
				return accommodationMapId != null;
			case WorkeffortPackage.WORK_EFFORT__ACCOMMODATION_SPOT_ID:
				return accommodationSpotId != null;
			case WorkeffortPackage.WORK_EFFORT__COMMUNICATION_EVENT_WORK_EFFS:
				return communicationEventWorkEffs != null && !communicationEventWorkEffs.isEmpty();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_ATTRIBUTES:
				return workEffortAttributes != null && !workEffortAttributes.isEmpty();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_DELIVERABLE_PRODS:
				return workEffortDeliverableProds != null && !workEffortDeliverableProds.isEmpty();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_EVENT_REMINDERS:
				return workEffortEventReminders != null && !workEffortEventReminders.isEmpty();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_STDS:
				return workEffortFixedAssetStds != null && !workEffortFixedAssetStds.isEmpty();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_INVENTORY_ASSIGNS:
				return workEffortInventoryAssigns != null && !workEffortInventoryAssigns.isEmpty();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_INVENTORY_PRODUCEDS:
				return workEffortInventoryProduceds != null && !workEffortInventoryProduceds.isEmpty();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_KEYWORDS:
				return workEffortKeywords != null && !workEffortKeywords.isEmpty();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_NOTES:
				return workEffortNotes != null && !workEffortNotes.isEmpty();
			case WorkeffortPackage.WORK_EFFORT__WORK_EFFORT_SKILL_STANDARDS:
				return workEffortSkillStandards != null && !workEffortSkillStandards.isEmpty();
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
		result.append(" (workEffortId: ");
		result.append(workEffortId);
		result.append(", actualCompletionDate: ");
		result.append(actualCompletionDate);
		result.append(", actualMilliSeconds: ");
		result.append(actualMilliSeconds);
		result.append(", actualSetupMillis: ");
		result.append(actualSetupMillis);
		result.append(", actualStartDate: ");
		result.append(actualStartDate);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", description: ");
		result.append(description);
		result.append(", estimatedCompletionDate: ");
		result.append(estimatedCompletionDate);
		result.append(", estimatedMilliSeconds: ");
		result.append(estimatedMilliSeconds);
		result.append(", estimatedSetupMillis: ");
		result.append(estimatedSetupMillis);
		result.append(", estimatedStartDate: ");
		result.append(estimatedStartDate);
		result.append(", infoUrl: ");
		result.append(infoUrl);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", lastStatusUpdate: ");
		result.append(lastStatusUpdate);
		result.append(", locationDesc: ");
		result.append(locationDesc);
		result.append(", percentComplete: ");
		result.append(percentComplete);
		result.append(", priority: ");
		result.append(priority);
		result.append(", quantityProduced: ");
		result.append(quantityProduced);
		result.append(", quantityRejected: ");
		result.append(quantityRejected);
		result.append(", quantityToProduce: ");
		result.append(quantityToProduce);
		result.append(", reserv2ndPPPerc: ");
		result.append(reserv2ndPPPerc);
		result.append(", reservNthPPPerc: ");
		result.append(reservNthPPPerc);
		result.append(", reservPersons: ");
		result.append(reservPersons);
		result.append(", revisionNumber: ");
		result.append(revisionNumber);
		result.append(", sendNotificationEmail: ");
		result.append(sendNotificationEmail);
		result.append(", serviceLoaderName: ");
		result.append(serviceLoaderName);
		result.append(", showAsEnumId: ");
		result.append(showAsEnumId);
		result.append(", sourceReferenceId: ");
		result.append(sourceReferenceId);
		result.append(", specialTerms: ");
		result.append(specialTerms);
		result.append(", timeTransparency: ");
		result.append(timeTransparency);
		result.append(", totalMilliSecondsAllowed: ");
		result.append(totalMilliSecondsAllowed);
		result.append(", totalMoneyAllowed: ");
		result.append(totalMoneyAllowed);
		result.append(", universalId: ");
		result.append(universalId);
		result.append(", workEffortName: ");
		result.append(workEffortName);
		result.append(", communicationEventWorkEffs: ");
		result.append(communicationEventWorkEffs);
		result.append(", workEffortAttributes: ");
		result.append(workEffortAttributes);
		result.append(", workEffortDeliverableProds: ");
		result.append(workEffortDeliverableProds);
		result.append(", workEffortEventReminders: ");
		result.append(workEffortEventReminders);
		result.append(", workEffortFixedAssetStds: ");
		result.append(workEffortFixedAssetStds);
		result.append(", workEffortInventoryAssigns: ");
		result.append(workEffortInventoryAssigns);
		result.append(", workEffortInventoryProduceds: ");
		result.append(workEffortInventoryProduceds);
		result.append(", workEffortKeywords: ");
		result.append(workEffortKeywords);
		result.append(", workEffortNotes: ");
		result.append(workEffortNotes);
		result.append(", workEffortSkillStandards: ");
		result.append(workEffortSkillStandards);
		result.append(')');
		return result.toString();
	}

} //WorkEffortImpl
