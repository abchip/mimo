/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment;

import java.util.Date;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.humanres.position.EmplPosition;
import org.abchip.mimo.biz.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employment App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApplicationDate <em>Application Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApplyingPartyId <em>Applying Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApproverPartyId <em>Approver Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getEmplPositionId <em>Empl Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getEmploymentAppSourceTypeId <em>Employment App Source Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getReferredByPartyId <em>Referred By Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp()
 * @model annotation="mimo-ent-frame title='Employment Application'"
 * @generated
 */
public interface EmploymentApp extends BizEntityTyped<EmploymentAppSourceType> {
	/**
	 * Returns the value of the '<em><b>Application Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Date</em>' attribute.
	 * @see #setApplicationDate(Date)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_ApplicationDate()
	 * @model
	 * @generated
	 */
	Date getApplicationDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApplicationDate <em>Application Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Date</em>' attribute.
	 * @see #getApplicationDate()
	 * @generated
	 */
	void setApplicationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Id</em>' attribute.
	 * @see #setApplicationId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_ApplicationId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getApplicationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApplicationId <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Id</em>' attribute.
	 * @see #getApplicationId()
	 * @generated
	 */
	void setApplicationId(String value);

	/**
	 * Returns the value of the '<em><b>Applying Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applying Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applying Party Id</em>' reference.
	 * @see #setApplyingPartyId(Party)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_ApplyingPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getApplyingPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApplyingPartyId <em>Applying Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applying Party Id</em>' reference.
	 * @see #getApplyingPartyId()
	 * @generated
	 */
	void setApplyingPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Approver Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approver Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approver Party Id</em>' reference.
	 * @see #setApproverPartyId(Party)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_ApproverPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getApproverPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApproverPartyId <em>Approver Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver Party Id</em>' reference.
	 * @see #getApproverPartyId()
	 * @generated
	 */
	void setApproverPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Empl Position Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Position Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Id</em>' reference.
	 * @see #setEmplPositionId(EmplPosition)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_EmplPositionId()
	 * @model keys="emplPositionId"
	 * @generated
	 */
	EmplPosition getEmplPositionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getEmplPositionId <em>Empl Position Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Id</em>' reference.
	 * @see #getEmplPositionId()
	 * @generated
	 */
	void setEmplPositionId(EmplPosition value);

	/**
	 * Returns the value of the '<em><b>Employment App Source Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employment App Source Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employment App Source Type Id</em>' reference.
	 * @see #setEmploymentAppSourceTypeId(EmploymentAppSourceType)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_EmploymentAppSourceTypeId()
	 * @model keys="employmentAppSourceTypeId"
	 * @generated
	 */
	EmploymentAppSourceType getEmploymentAppSourceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getEmploymentAppSourceTypeId <em>Employment App Source Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment App Source Type Id</em>' reference.
	 * @see #getEmploymentAppSourceTypeId()
	 * @generated
	 */
	void setEmploymentAppSourceTypeId(EmploymentAppSourceType value);

	/**
	 * Returns the value of the '<em><b>Job Requisition Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Requisition Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Requisition Id</em>' reference.
	 * @see #setJobRequisitionId(JobRequisition)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_JobRequisitionId()
	 * @model keys="jobRequisitionId"
	 * @generated
	 */
	JobRequisition getJobRequisitionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getJobRequisitionId <em>Job Requisition Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Requisition Id</em>' reference.
	 * @see #getJobRequisitionId()
	 * @generated
	 */
	void setJobRequisitionId(JobRequisition value);

	/**
	 * Returns the value of the '<em><b>Referred By Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred By Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By Party Id</em>' reference.
	 * @see #setReferredByPartyId(Party)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_ReferredByPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getReferredByPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getReferredByPartyId <em>Referred By Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred By Party Id</em>' reference.
	 * @see #getReferredByPartyId()
	 * @generated
	 */
	void setReferredByPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

} // EmploymentApp
