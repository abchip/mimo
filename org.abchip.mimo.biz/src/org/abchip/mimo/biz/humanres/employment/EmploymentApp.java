/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

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
 * @model
 * @generated
 */
public interface EmploymentApp extends BizEntity {
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
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
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
	 * Returns the value of the '<em><b>Applying Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applying Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applying Party Id</em>' attribute.
	 * @see #setApplyingPartyId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_ApplyingPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getApplyingPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApplyingPartyId <em>Applying Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applying Party Id</em>' attribute.
	 * @see #getApplyingPartyId()
	 * @generated
	 */
	void setApplyingPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Approver Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approver Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approver Party Id</em>' attribute.
	 * @see #setApproverPartyId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_ApproverPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getApproverPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getApproverPartyId <em>Approver Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver Party Id</em>' attribute.
	 * @see #getApproverPartyId()
	 * @generated
	 */
	void setApproverPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Empl Position Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Position Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Id</em>' attribute.
	 * @see #setEmplPositionId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_EmplPositionId()
	 * @model annotation="mimo-ent-domain frame='EmplPosition'"
	 * @generated
	 */
	String getEmplPositionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getEmplPositionId <em>Empl Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Id</em>' attribute.
	 * @see #getEmplPositionId()
	 * @generated
	 */
	void setEmplPositionId(String value);

	/**
	 * Returns the value of the '<em><b>Employment App Source Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employment App Source Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employment App Source Type Id</em>' attribute.
	 * @see #setEmploymentAppSourceTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_EmploymentAppSourceTypeId()
	 * @model annotation="mimo-ent-domain frame='EmploymentAppSourceType'"
	 * @generated
	 */
	String getEmploymentAppSourceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getEmploymentAppSourceTypeId <em>Employment App Source Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment App Source Type Id</em>' attribute.
	 * @see #getEmploymentAppSourceTypeId()
	 * @generated
	 */
	void setEmploymentAppSourceTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Job Requisition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Requisition Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Requisition Id</em>' attribute.
	 * @see #setJobRequisitionId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_JobRequisitionId()
	 * @model annotation="mimo-ent-domain frame='JobRequisition'"
	 * @generated
	 */
	String getJobRequisitionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getJobRequisitionId <em>Job Requisition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Requisition Id</em>' attribute.
	 * @see #getJobRequisitionId()
	 * @generated
	 */
	void setJobRequisitionId(String value);

	/**
	 * Returns the value of the '<em><b>Referred By Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred By Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By Party Id</em>' attribute.
	 * @see #setReferredByPartyId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_ReferredByPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getReferredByPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getReferredByPartyId <em>Referred By Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred By Party Id</em>' attribute.
	 * @see #getReferredByPartyId()
	 * @generated
	 */
	void setReferredByPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmploymentApp_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmploymentApp#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

} // EmploymentApp
