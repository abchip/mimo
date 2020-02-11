/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.tracking;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracking Code Visit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeVisit#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeVisit#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeVisit#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeVisit#getSourceEnumId <em>Source Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeVisit()
 * @model
 * @generated
 */
public interface TrackingCodeVisit extends BizEntity {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeVisit_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeVisit#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Source Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Enum Id</em>' reference.
	 * @see #setSourceEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeVisit_SourceEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getSourceEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeVisit#getSourceEnumId <em>Source Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Enum Id</em>' reference.
	 * @see #getSourceEnumId()
	 * @generated
	 */
	void setSourceEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Tracking Code Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Code Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code Id</em>' reference.
	 * @see #setTrackingCodeId(TrackingCode)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeVisit_TrackingCodeId()
	 * @model keys="trackingCodeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TrackingCode getTrackingCodeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeVisit#getTrackingCodeId <em>Tracking Code Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Code Id</em>' reference.
	 * @see #getTrackingCodeId()
	 * @generated
	 */
	void setTrackingCodeId(TrackingCode value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeVisit_VisitId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeVisit#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

} // TrackingCodeVisit
