/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory;

import java.util.List;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variance Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.VarianceReason#getVarianceReasonId <em>Variance Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.VarianceReason#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.VarianceReason#getVarianceReasonGlAccounts <em>Variance Reason Gl Accounts</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getVarianceReason()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface VarianceReason extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getVarianceReason_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.VarianceReason#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Variance Reason Gl Accounts</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variance Reason Gl Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variance Reason Gl Accounts</em>' reference list.
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getVarianceReason_VarianceReasonGlAccounts()
	 * @model derived="true"
	 * @generated
	 */
	List<VarianceReasonGlAccount> getVarianceReasonGlAccounts();

	/**
	 * Returns the value of the '<em><b>Variance Reason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variance Reason Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variance Reason Id</em>' attribute.
	 * @see #setVarianceReasonId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getVarianceReason_VarianceReasonId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVarianceReasonId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.VarianceReason#getVarianceReasonId <em>Variance Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variance Reason Id</em>' attribute.
	 * @see #getVarianceReasonId()
	 * @generated
	 */
	void setVarianceReasonId(String value);

} // VarianceReason
