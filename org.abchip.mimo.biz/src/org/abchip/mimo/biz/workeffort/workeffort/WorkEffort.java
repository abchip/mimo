/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.note.NoteData;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.order.reservations.AccommodationSpot;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.abchip.mimo.biz.service.schedule.RuntimeData;
import org.abchip.mimo.biz.service.schedule.TemporalExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getAccommodationMapId <em>Accommodation Map Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getAccommodationSpotId <em>Accommodation Spot Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualCompletionDate <em>Actual Completion Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualMilliSeconds <em>Actual Milli Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualSetupMillis <em>Actual Setup Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCommunicationEventWorkEffs <em>Communication Event Work Effs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCurrentStatusId <em>Current Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimateCalcMethod <em>Estimate Calc Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedCompletionDate <em>Estimated Completion Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedMilliSeconds <em>Estimated Milli Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedSetupMillis <em>Estimated Setup Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getInfoUrl <em>Info Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastStatusUpdate <em>Last Status Update</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLocationDesc <em>Location Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getMoneyUomId <em>Money Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getNoteId <em>Note Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityProduced <em>Quantity Produced</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityRejected <em>Quantity Rejected</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityToProduce <em>Quantity To Produce</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRuntimeDataId <em>Runtime Data Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getScopeEnumId <em>Scope Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#isSendNotificationEmail <em>Send Notification Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getServiceLoaderName <em>Service Loader Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getShowAsEnumId <em>Show As Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getSpecialTerms <em>Special Terms</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTempExprId <em>Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTimeTransparency <em>Time Transparency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTotalMilliSecondsAllowed <em>Total Milli Seconds Allowed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTotalMoneyAllowed <em>Total Money Allowed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getUniversalId <em>Universal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortAttributes <em>Work Effort Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortDeliverableProds <em>Work Effort Deliverable Prods</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortEventReminders <em>Work Effort Event Reminders</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortFixedAssetStds <em>Work Effort Fixed Asset Stds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortInventoryAssigns <em>Work Effort Inventory Assigns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortInventoryProduceds <em>Work Effort Inventory Produceds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortKeywords <em>Work Effort Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortName <em>Work Effort Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortNotes <em>Work Effort Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortParentId <em>Work Effort Parent Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortPurposeTypeId <em>Work Effort Purpose Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortSkillStandards <em>Work Effort Skill Standards</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortTypeId <em>Work Effort Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface WorkEffort extends BizEntityTyped<WorkEffortType> {
	/**
	 * Returns the value of the '<em><b>Accommodation Map Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Map Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Map Id</em>' reference.
	 * @see #setAccommodationMapId(AccommodationMap)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_AccommodationMapId()
	 * @model keys="accommodationMapId"
	 * @generated
	 */
	AccommodationMap getAccommodationMapId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getAccommodationMapId <em>Accommodation Map Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Map Id</em>' reference.
	 * @see #getAccommodationMapId()
	 * @generated
	 */
	void setAccommodationMapId(AccommodationMap value);

	/**
	 * Returns the value of the '<em><b>Accommodation Spot Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Spot Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Spot Id</em>' reference.
	 * @see #setAccommodationSpotId(AccommodationSpot)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_AccommodationSpotId()
	 * @model keys="accommodationSpotId"
	 * @generated
	 */
	AccommodationSpot getAccommodationSpotId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getAccommodationSpotId <em>Accommodation Spot Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Spot Id</em>' reference.
	 * @see #getAccommodationSpotId()
	 * @generated
	 */
	void setAccommodationSpotId(AccommodationSpot value);

	/**
	 * Returns the value of the '<em><b>Actual Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Completion Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Completion Date</em>' attribute.
	 * @see #setActualCompletionDate(Date)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ActualCompletionDate()
	 * @model
	 * @generated
	 */
	Date getActualCompletionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualCompletionDate <em>Actual Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Completion Date</em>' attribute.
	 * @see #getActualCompletionDate()
	 * @generated
	 */
	void setActualCompletionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Actual Milli Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Milli Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Milli Seconds</em>' attribute.
	 * @see #setActualMilliSeconds(double)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ActualMilliSeconds()
	 * @model
	 * @generated
	 */
	double getActualMilliSeconds();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualMilliSeconds <em>Actual Milli Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Milli Seconds</em>' attribute.
	 * @see #getActualMilliSeconds()
	 * @generated
	 */
	void setActualMilliSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Actual Setup Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Setup Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Setup Millis</em>' attribute.
	 * @see #setActualSetupMillis(double)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ActualSetupMillis()
	 * @model
	 * @generated
	 */
	double getActualSetupMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualSetupMillis <em>Actual Setup Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Setup Millis</em>' attribute.
	 * @see #getActualSetupMillis()
	 * @generated
	 */
	void setActualSetupMillis(double value);

	/**
	 * Returns the value of the '<em><b>Actual Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Start Date</em>' attribute.
	 * @see #setActualStartDate(Date)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ActualStartDate()
	 * @model
	 * @generated
	 */
	Date getActualStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getActualStartDate <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start Date</em>' attribute.
	 * @see #getActualStartDate()
	 * @generated
	 */
	void setActualStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Communication Event Work Effs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Work Effs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Work Effs</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_CommunicationEventWorkEffs()
	 * @model derived="true"
	 * @generated
	 */
	List<CommunicationEventWorkEff> getCommunicationEventWorkEffs();

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Current Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Status Id</em>' reference.
	 * @see #setCurrentStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_CurrentStatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getCurrentStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getCurrentStatusId <em>Current Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Status Id</em>' reference.
	 * @see #getCurrentStatusId()
	 * @generated
	 */
	void setCurrentStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimateCalcMethod()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getEstimateCalcMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimateCalcMethod <em>Estimate Calc Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimate Calc Method</em>' reference.
	 * @see #getEstimateCalcMethod()
	 * @generated
	 */
	void setEstimateCalcMethod(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Estimated Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Completion Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Completion Date</em>' attribute.
	 * @see #setEstimatedCompletionDate(Date)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimatedCompletionDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedCompletionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedCompletionDate <em>Estimated Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Completion Date</em>' attribute.
	 * @see #getEstimatedCompletionDate()
	 * @generated
	 */
	void setEstimatedCompletionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Milli Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Milli Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Milli Seconds</em>' attribute.
	 * @see #setEstimatedMilliSeconds(double)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimatedMilliSeconds()
	 * @model
	 * @generated
	 */
	double getEstimatedMilliSeconds();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedMilliSeconds <em>Estimated Milli Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Milli Seconds</em>' attribute.
	 * @see #getEstimatedMilliSeconds()
	 * @generated
	 */
	void setEstimatedMilliSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Estimated Setup Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Setup Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Setup Millis</em>' attribute.
	 * @see #setEstimatedSetupMillis(double)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimatedSetupMillis()
	 * @model
	 * @generated
	 */
	double getEstimatedSetupMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedSetupMillis <em>Estimated Setup Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Setup Millis</em>' attribute.
	 * @see #getEstimatedSetupMillis()
	 * @generated
	 */
	void setEstimatedSetupMillis(double value);

	/**
	 * Returns the value of the '<em><b>Estimated Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Start Date</em>' attribute.
	 * @see #setEstimatedStartDate(Date)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimatedStartDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getEstimatedStartDate <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Start Date</em>' attribute.
	 * @see #getEstimatedStartDate()
	 * @generated
	 */
	void setEstimatedStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' reference.
	 * @see #setFacilityId(Facility)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_FacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getFacilityId <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' reference.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #setFixedAssetId(FixedAsset)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_FixedAssetId()
	 * @model keys="fixedAssetId"
	 *        annotation="mimo-ent-slot help='Deprecated - use the WorkEffortFixedAssetAssign entity instead'"
	 * @generated
	 */
	FixedAsset getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getFixedAssetId <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Info Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Url</em>' attribute.
	 * @see #setInfoUrl(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_InfoUrl()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getInfoUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getInfoUrl <em>Info Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Url</em>' attribute.
	 * @see #getInfoUrl()
	 * @generated
	 */
	void setInfoUrl(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Status Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Status Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Status Update</em>' attribute.
	 * @see #setLastStatusUpdate(Date)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_LastStatusUpdate()
	 * @model
	 * @generated
	 */
	Date getLastStatusUpdate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLastStatusUpdate <em>Last Status Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Status Update</em>' attribute.
	 * @see #getLastStatusUpdate()
	 * @generated
	 */
	void setLastStatusUpdate(Date value);

	/**
	 * Returns the value of the '<em><b>Location Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Desc</em>' attribute.
	 * @see #setLocationDesc(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_LocationDesc()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getLocationDesc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getLocationDesc <em>Location Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Desc</em>' attribute.
	 * @see #getLocationDesc()
	 * @generated
	 */
	void setLocationDesc(String value);

	/**
	 * Returns the value of the '<em><b>Money Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Money Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Money Uom Id</em>' reference.
	 * @see #setMoneyUomId(Uom)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_MoneyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getMoneyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getMoneyUomId <em>Money Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Money Uom Id</em>' reference.
	 * @see #getMoneyUomId()
	 * @generated
	 */
	void setMoneyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Note Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Id</em>' reference.
	 * @see #setNoteId(NoteData)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_NoteId()
	 * @model keys="noteId"
	 * @generated
	 */
	NoteData getNoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getNoteId <em>Note Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Id</em>' reference.
	 * @see #getNoteId()
	 * @generated
	 */
	void setNoteId(NoteData value);

	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #setPercentComplete(long)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_PercentComplete()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPercentComplete();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(long value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(long)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_Priority()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPriority();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(long value);

	/**
	 * Returns the value of the '<em><b>Quantity Produced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Produced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Produced</em>' attribute.
	 * @see #setQuantityProduced(BigDecimal)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_QuantityProduced()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityProduced();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityProduced <em>Quantity Produced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Produced</em>' attribute.
	 * @see #getQuantityProduced()
	 * @generated
	 */
	void setQuantityProduced(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Rejected</em>' attribute.
	 * @see #setQuantityRejected(BigDecimal)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_QuantityRejected()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityRejected();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityRejected <em>Quantity Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Rejected</em>' attribute.
	 * @see #getQuantityRejected()
	 * @generated
	 */
	void setQuantityRejected(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity To Produce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity To Produce</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity To Produce</em>' attribute.
	 * @see #setQuantityToProduce(BigDecimal)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_QuantityToProduce()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityToProduce();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getQuantityToProduce <em>Quantity To Produce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity To Produce</em>' attribute.
	 * @see #getQuantityToProduce()
	 * @generated
	 */
	void setQuantityToProduce(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_RecurrenceInfoId()
	 * @model keys="recurrenceInfoId"
	 *        annotation="mimo-ent-slot help='Deprecated - use the tempExprId field instead'"
	 * @generated
	 */
	RecurrenceInfo getRecurrenceInfoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRecurrenceInfoId <em>Recurrence Info Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info Id</em>' reference.
	 * @see #getRecurrenceInfoId()
	 * @generated
	 */
	void setRecurrenceInfoId(RecurrenceInfo value);

	/**
	 * Returns the value of the '<em><b>Reserv2nd PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv2nd PP Perc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv2nd PP Perc</em>' attribute.
	 * @see #setReserv2ndPPPerc(BigDecimal)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_Reserv2ndPPPerc()
	 * @model annotation="mimo-ent-slot help='reservationSecondPersonPricePercentage: percentage of the end price for the 2nd person renting this asset connected to the workEffort'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReserv2ndPPPerc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv2nd PP Perc</em>' attribute.
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 */
	void setReserv2ndPPPerc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Nth PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Nth PP Perc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Nth PP Perc</em>' attribute.
	 * @see #setReservNthPPPerc(BigDecimal)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ReservNthPPPerc()
	 * @model annotation="mimo-ent-slot help='reservationNthPersonPricePercentage: percentage of the end price for the Nth (2+) person renting this asset connected to the workEffort'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservNthPPPerc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Nth PP Perc</em>' attribute.
	 * @see #getReservNthPPPerc()
	 * @generated
	 */
	void setReservNthPPPerc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Persons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Persons</em>' attribute.
	 * @see #setReservPersons(BigDecimal)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ReservPersons()
	 * @model annotation="mimo-ent-slot help='the number of persons renting the attached asset'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservPersons();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getReservPersons <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Persons</em>' attribute.
	 * @see #getReservPersons()
	 * @generated
	 */
	void setReservPersons(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #setRevisionNumber(long)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_RevisionNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getRevisionNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(long value);

	/**
	 * Returns the value of the '<em><b>Send Notification Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Notification Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Notification Email</em>' attribute.
	 * @see #setSendNotificationEmail(boolean)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_SendNotificationEmail()
	 * @model required="true"
	 * @generated
	 */
	boolean isSendNotificationEmail();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#isSendNotificationEmail <em>Send Notification Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Notification Email</em>' attribute.
	 * @see #isSendNotificationEmail()
	 * @generated
	 */
	void setSendNotificationEmail(boolean value);

	/**
	 * Returns the value of the '<em><b>Runtime Data Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Data Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Data Id</em>' reference.
	 * @see #setRuntimeDataId(RuntimeData)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_RuntimeDataId()
	 * @model keys="runtimeDataId"
	 * @generated
	 */
	RuntimeData getRuntimeDataId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getRuntimeDataId <em>Runtime Data Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Data Id</em>' reference.
	 * @see #getRuntimeDataId()
	 * @generated
	 */
	void setRuntimeDataId(RuntimeData value);

	/**
	 * Returns the value of the '<em><b>Scope Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Enum Id</em>' reference.
	 * @see #setScopeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ScopeEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getScopeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getScopeEnumId <em>Scope Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Enum Id</em>' reference.
	 * @see #getScopeEnumId()
	 * @generated
	 */
	void setScopeEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Service Loader Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Loader Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Loader Name</em>' attribute.
	 * @see #setServiceLoaderName(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ServiceLoaderName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getServiceLoaderName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getServiceLoaderName <em>Service Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Loader Name</em>' attribute.
	 * @see #getServiceLoaderName()
	 * @generated
	 */
	void setServiceLoaderName(String value);

	/**
	 * Returns the value of the '<em><b>Show As Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show As Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show As Enum Id</em>' attribute.
	 * @see #setShowAsEnumId(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ShowAsEnumId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShowAsEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getShowAsEnumId <em>Show As Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show As Enum Id</em>' attribute.
	 * @see #getShowAsEnumId()
	 * @generated
	 */
	void setShowAsEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Reference Id</em>' attribute.
	 * @see #setSourceReferenceId(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_SourceReferenceId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSourceReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getSourceReferenceId <em>Source Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference Id</em>' attribute.
	 * @see #getSourceReferenceId()
	 * @generated
	 */
	void setSourceReferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Special Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Terms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Terms</em>' attribute.
	 * @see #setSpecialTerms(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_SpecialTerms()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSpecialTerms();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getSpecialTerms <em>Special Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Terms</em>' attribute.
	 * @see #getSpecialTerms()
	 * @generated
	 */
	void setSpecialTerms(String value);

	/**
	 * Returns the value of the '<em><b>Temp Expr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Expr Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Expr Id</em>' reference.
	 * @see #setTempExprId(TemporalExpression)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_TempExprId()
	 * @model keys="tempExprId"
	 * @generated
	 */
	TemporalExpression getTempExprId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTempExprId <em>Temp Expr Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Expr Id</em>' reference.
	 * @see #getTempExprId()
	 * @generated
	 */
	void setTempExprId(TemporalExpression value);

	/**
	 * Returns the value of the '<em><b>Time Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Transparency</em>' attribute.
	 * @see #setTimeTransparency(long)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_TimeTransparency()
	 * @model annotation="mimo-ent-slot help='Deprecated - use the availabilityStatusId field in the assignment entities instead'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTimeTransparency();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTimeTransparency <em>Time Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Transparency</em>' attribute.
	 * @see #getTimeTransparency()
	 * @generated
	 */
	void setTimeTransparency(long value);

	/**
	 * Returns the value of the '<em><b>Total Milli Seconds Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Milli Seconds Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Milli Seconds Allowed</em>' attribute.
	 * @see #setTotalMilliSecondsAllowed(double)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_TotalMilliSecondsAllowed()
	 * @model
	 * @generated
	 */
	double getTotalMilliSecondsAllowed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTotalMilliSecondsAllowed <em>Total Milli Seconds Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Milli Seconds Allowed</em>' attribute.
	 * @see #getTotalMilliSecondsAllowed()
	 * @generated
	 */
	void setTotalMilliSecondsAllowed(double value);

	/**
	 * Returns the value of the '<em><b>Total Money Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Money Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Money Allowed</em>' attribute.
	 * @see #setTotalMoneyAllowed(BigDecimal)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_TotalMoneyAllowed()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getTotalMoneyAllowed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getTotalMoneyAllowed <em>Total Money Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Money Allowed</em>' attribute.
	 * @see #getTotalMoneyAllowed()
	 * @generated
	 */
	void setTotalMoneyAllowed(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Universal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universal Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universal Id</em>' attribute.
	 * @see #setUniversalId(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_UniversalId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getUniversalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getUniversalId <em>Universal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universal Id</em>' attribute.
	 * @see #getUniversalId()
	 * @generated
	 */
	void setUniversalId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortAttribute> getWorkEffortAttributes();

	/**
	 * Returns the value of the '<em><b>Work Effort Deliverable Prods</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortDeliverableProd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Deliverable Prods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Deliverable Prods</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortDeliverableProds()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortDeliverableProd> getWorkEffortDeliverableProds();

	/**
	 * Returns the value of the '<em><b>Work Effort Event Reminders</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Event Reminders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Event Reminders</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortEventReminders()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortEventReminder> getWorkEffortEventReminders();

	/**
	 * Returns the value of the '<em><b>Work Effort Fixed Asset Stds</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Fixed Asset Stds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Fixed Asset Stds</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortFixedAssetStds()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortFixedAssetStd> getWorkEffortFixedAssetStds();

	/**
	 * Returns the value of the '<em><b>Work Effort Inventory Assigns</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Inventory Assigns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Inventory Assigns</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortInventoryAssigns()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortInventoryAssign> getWorkEffortInventoryAssigns();

	/**
	 * Returns the value of the '<em><b>Work Effort Inventory Produceds</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryProduced}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Inventory Produceds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Inventory Produceds</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortInventoryProduceds()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortInventoryProduced> getWorkEffortInventoryProduceds();

	/**
	 * Returns the value of the '<em><b>Work Effort Keywords</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Keywords</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Keywords</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortKeywords()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortKeyword> getWorkEffortKeywords();

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Name</em>' attribute.
	 * @see #setWorkEffortName(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getWorkEffortName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortName <em>Work Effort Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Name</em>' attribute.
	 * @see #getWorkEffortName()
	 * @generated
	 */
	void setWorkEffortName(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Notes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortNote> getWorkEffortNotes();

	/**
	 * Returns the value of the '<em><b>Work Effort Parent Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Parent Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Parent Id</em>' reference.
	 * @see #setWorkEffortParentId(WorkEffort)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortParentId()
	 * @model keys="workEffortId"
	 *        annotation="mimo-ent-slot help='The primary parent (or the like); it should be one of the parent WorkEfforts already setup in WorkEffortAssoc'"
	 * @generated
	 */
	WorkEffort getWorkEffortParentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortParentId <em>Work Effort Parent Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Parent Id</em>' reference.
	 * @see #getWorkEffortParentId()
	 * @generated
	 */
	void setWorkEffortParentId(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Work Effort Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Purpose Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Purpose Type Id</em>' reference.
	 * @see #setWorkEffortPurposeTypeId(WorkEffortPurposeType)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortPurposeTypeId()
	 * @model keys="workEffortPurposeTypeId"
	 * @generated
	 */
	WorkEffortPurposeType getWorkEffortPurposeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortPurposeTypeId <em>Work Effort Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Purpose Type Id</em>' reference.
	 * @see #getWorkEffortPurposeTypeId()
	 * @generated
	 */
	void setWorkEffortPurposeTypeId(WorkEffortPurposeType value);

	/**
	 * Returns the value of the '<em><b>Work Effort Skill Standards</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Skill Standards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Skill Standards</em>' reference list.
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortSkillStandards()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortSkillStandard> getWorkEffortSkillStandards();

	/**
	 * Returns the value of the '<em><b>Work Effort Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Type Id</em>' reference.
	 * @see #setWorkEffortTypeId(WorkEffortType)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortTypeId()
	 * @model keys="workEffortTypeId"
	 * @generated
	 */
	WorkEffortType getWorkEffortTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.WorkEffort#getWorkEffortTypeId <em>Work Effort Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Type Id</em>' reference.
	 * @see #getWorkEffortTypeId()
	 * @generated
	 */
	void setWorkEffortTypeId(WorkEffortType value);

} // WorkEffort
