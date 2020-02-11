/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position;

import java.util.Date;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empl Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEmplPositionId <em>Empl Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getActualFromDate <em>Actual From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getActualThruDate <em>Actual Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEstimatedFromDate <em>Estimated From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEstimatedThruDate <em>Estimated Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isExemptFlag <em>Exempt Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isFulltimeFlag <em>Fulltime Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isSalaryFlag <em>Salary Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isTemporaryFlag <em>Temporary Flag</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition()
 * @model
 * @generated
 */
public interface EmplPosition extends BizEntityTyped<EmplPositionType> {
	/**
	 * Returns the value of the '<em><b>Actual From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual From Date</em>' attribute.
	 * @see #setActualFromDate(Date)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_ActualFromDate()
	 * @model
	 * @generated
	 */
	Date getActualFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getActualFromDate <em>Actual From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual From Date</em>' attribute.
	 * @see #getActualFromDate()
	 * @generated
	 */
	void setActualFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Actual Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Thru Date</em>' attribute.
	 * @see #setActualThruDate(Date)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_ActualThruDate()
	 * @model
	 * @generated
	 */
	Date getActualThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getActualThruDate <em>Actual Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Thru Date</em>' attribute.
	 * @see #getActualThruDate()
	 * @generated
	 */
	void setActualThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Id</em>' attribute.
	 * @see #setBudgetId(String)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_BudgetId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getBudgetId <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Id</em>' attribute.
	 * @see #getBudgetId()
	 * @generated
	 */
	void setBudgetId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #setBudgetItemSeqId(String)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_BudgetItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getBudgetItemSeqId <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #getBudgetItemSeqId()
	 * @generated
	 */
	void setBudgetItemSeqId(String value);

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
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_EmplPositionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEmplPositionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEmplPositionId <em>Empl Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Id</em>' attribute.
	 * @see #getEmplPositionId()
	 * @generated
	 */
	void setEmplPositionId(String value);

	/**
	 * Returns the value of the '<em><b>Empl Position Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Position Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Type Id</em>' reference.
	 * @see #setEmplPositionTypeId(EmplPositionType)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_EmplPositionTypeId()
	 * @model keys="emplPositionTypeId"
	 * @generated
	 */
	EmplPositionType getEmplPositionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEmplPositionTypeId <em>Empl Position Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Type Id</em>' reference.
	 * @see #getEmplPositionTypeId()
	 * @generated
	 */
	void setEmplPositionTypeId(EmplPositionType value);

	/**
	 * Returns the value of the '<em><b>Estimated From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated From Date</em>' attribute.
	 * @see #setEstimatedFromDate(Date)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_EstimatedFromDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEstimatedFromDate <em>Estimated From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated From Date</em>' attribute.
	 * @see #getEstimatedFromDate()
	 * @generated
	 */
	void setEstimatedFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Thru Date</em>' attribute.
	 * @see #setEstimatedThruDate(Date)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_EstimatedThruDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getEstimatedThruDate <em>Estimated Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Thru Date</em>' attribute.
	 * @see #getEstimatedThruDate()
	 * @generated
	 */
	void setEstimatedThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Exempt Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exempt Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exempt Flag</em>' attribute.
	 * @see #setExemptFlag(boolean)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_ExemptFlag()
	 * @model required="true"
	 * @generated
	 */
	boolean isExemptFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isExemptFlag <em>Exempt Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exempt Flag</em>' attribute.
	 * @see #isExemptFlag()
	 * @generated
	 */
	void setExemptFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Fulltime Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulltime Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulltime Flag</em>' attribute.
	 * @see #setFulltimeFlag(boolean)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_FulltimeFlag()
	 * @model required="true"
	 * @generated
	 */
	boolean isFulltimeFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isFulltimeFlag <em>Fulltime Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulltime Flag</em>' attribute.
	 * @see #isFulltimeFlag()
	 * @generated
	 */
	void setFulltimeFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Salary Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary Flag</em>' attribute.
	 * @see #setSalaryFlag(boolean)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_SalaryFlag()
	 * @model required="true"
	 * @generated
	 */
	boolean isSalaryFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isSalaryFlag <em>Salary Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary Flag</em>' attribute.
	 * @see #isSalaryFlag()
	 * @generated
	 */
	void setSalaryFlag(boolean value);

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
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Temporary Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporary Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporary Flag</em>' attribute.
	 * @see #setTemporaryFlag(boolean)
	 * @see org.abchip.mimo.biz.humanres.position.PositionPackage#getEmplPosition_TemporaryFlag()
	 * @model required="true"
	 * @generated
	 */
	boolean isTemporaryFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.position.EmplPosition#isTemporaryFlag <em>Temporary Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporary Flag</em>' attribute.
	 * @see #isTemporaryFlag()
	 * @generated
	 */
	void setTemporaryFlag(boolean value);

} // EmplPosition
