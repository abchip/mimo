/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.manufacturing.mrp;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.product.Product;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mrp Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getMrpEventTypeId <em>Mrp Event Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getEventDate <em>Event Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getMrpId <em>Mrp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#isIsLate <em>Is Late</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpPackage#getMrpEvent()
 * @model
 * @generated
 */
public interface MrpEvent extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Mrp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mrp Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mrp Id</em>' attribute.
	 * @see #setMrpId(String)
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpPackage#getMrpEvent_MrpId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getMrpId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getMrpId <em>Mrp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mrp Id</em>' attribute.
	 * @see #getMrpId()
	 * @generated
	 */
	void setMrpId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpPackage#getMrpEvent_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Date</em>' attribute.
	 * @see #setEventDate(Date)
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpPackage#getMrpEvent_EventDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getEventDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getEventDate <em>Event Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Date</em>' attribute.
	 * @see #getEventDate()
	 * @generated
	 */
	void setEventDate(Date value);

	/**
	 * Returns the value of the '<em><b>Mrp Event Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mrp Event Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mrp Event Type Id</em>' reference.
	 * @see #setMrpEventTypeId(MrpEventType)
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpPackage#getMrpEvent_MrpEventTypeId()
	 * @model keys="mrpEventTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	MrpEventType getMrpEventTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getMrpEventTypeId <em>Mrp Event Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mrp Event Type Id</em>' reference.
	 * @see #getMrpEventTypeId()
	 * @generated
	 */
	void setMrpEventTypeId(MrpEventType value);

	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' attribute.
	 * @see #setEventName(String)
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpPackage#getMrpEvent_EventName()
	 * @model
	 * @generated
	 */
	String getEventName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getEventName <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' attribute.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(String value);

	/**
	 * Returns the value of the '<em><b>Is Late</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Late</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Late</em>' attribute.
	 * @see #setIsLate(boolean)
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpPackage#getMrpEvent_IsLate()
	 * @model
	 * @generated
	 */
	boolean isIsLate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#isIsLate <em>Is Late</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Late</em>' attribute.
	 * @see #isIsLate()
	 * @generated
	 */
	void setIsLate(boolean value);

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
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpPackage#getMrpEvent_FacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getFacilityId <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' reference.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(double)
	 * @see org.abchip.mimo.biz.manufacturing.mrp.MrpPackage#getMrpEvent_Quantity()
	 * @model
	 * @generated
	 */
	double getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.manufacturing.mrp.MrpEvent#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(double value);

} // MrpEvent
