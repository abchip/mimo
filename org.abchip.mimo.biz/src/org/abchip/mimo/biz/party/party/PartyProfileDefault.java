/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Profile Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultBillAddr <em>Default Bill Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultPayMeth <em>Default Pay Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultShipAddr <em>Default Ship Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultShipMeth <em>Default Ship Meth</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyProfileDefault()
 * @model
 * @generated
 */
public interface PartyProfileDefault extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Default Bill Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Bill Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Bill Addr</em>' attribute.
	 * @see #setDefaultBillAddr(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyProfileDefault_DefaultBillAddr()
	 * @model
	 * @generated
	 */
	String getDefaultBillAddr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultBillAddr <em>Default Bill Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Bill Addr</em>' attribute.
	 * @see #getDefaultBillAddr()
	 * @generated
	 */
	void setDefaultBillAddr(String value);

	/**
	 * Returns the value of the '<em><b>Default Pay Meth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Pay Meth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Pay Meth</em>' attribute.
	 * @see #setDefaultPayMeth(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyProfileDefault_DefaultPayMeth()
	 * @model
	 * @generated
	 */
	String getDefaultPayMeth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultPayMeth <em>Default Pay Meth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Pay Meth</em>' attribute.
	 * @see #getDefaultPayMeth()
	 * @generated
	 */
	void setDefaultPayMeth(String value);

	/**
	 * Returns the value of the '<em><b>Default Ship Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Ship Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Ship Addr</em>' attribute.
	 * @see #setDefaultShipAddr(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyProfileDefault_DefaultShipAddr()
	 * @model
	 * @generated
	 */
	String getDefaultShipAddr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultShipAddr <em>Default Ship Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Ship Addr</em>' attribute.
	 * @see #getDefaultShipAddr()
	 * @generated
	 */
	void setDefaultShipAddr(String value);

	/**
	 * Returns the value of the '<em><b>Default Ship Meth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Ship Meth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Ship Meth</em>' attribute.
	 * @see #setDefaultShipMeth(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyProfileDefault_DefaultShipMeth()
	 * @model
	 * @generated
	 */
	String getDefaultShipMeth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultShipMeth <em>Default Ship Meth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Ship Meth</em>' attribute.
	 * @see #getDefaultShipMeth()
	 * @generated
	 */
	void setDefaultShipMeth(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyProfileDefault_ProductStoreId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyProfileDefault_PartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

} // PartyProfileDefault
