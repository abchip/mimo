/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableId <em>Deliverable Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableName <em>Deliverable Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableTypeId <em>Deliverable Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getDeliverable()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Deliverable extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Deliverable Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliverable Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable Id</em>' attribute.
	 * @see #setDeliverableId(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getDeliverable_DeliverableId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDeliverableId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableId <em>Deliverable Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverable Id</em>' attribute.
	 * @see #getDeliverableId()
	 * @generated
	 */
	void setDeliverableId(String value);

	/**
	 * Returns the value of the '<em><b>Deliverable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliverable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable Name</em>' attribute.
	 * @see #setDeliverableName(String)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getDeliverable_DeliverableName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getDeliverableName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableName <em>Deliverable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverable Name</em>' attribute.
	 * @see #getDeliverableName()
	 * @generated
	 */
	void setDeliverableName(String value);

	/**
	 * Returns the value of the '<em><b>Deliverable Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliverable Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable Type Id</em>' reference.
	 * @see #setDeliverableTypeId(DeliverableType)
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getDeliverable_DeliverableTypeId()
	 * @model keys="deliverableTypeId"
	 * @generated
	 */
	DeliverableType getDeliverableTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDeliverableTypeId <em>Deliverable Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverable Type Id</em>' reference.
	 * @see #getDeliverableTypeId()
	 * @generated
	 */
	void setDeliverableTypeId(DeliverableType value);

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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#getDeliverable_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.workeffort.Deliverable#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Deliverable
