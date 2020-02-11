/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import java.util.List;
import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountType;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getFinAccountTypeAttrs <em>Fin Account Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getFinAccountTypeGlAccounts <em>Fin Account Type Gl Accounts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#isIsRefundable <em>Is Refundable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getReplenishEnumId <em>Replenish Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountTypeImpl extends BizEntityTypeImpl<FinAccount> implements FinAccountType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FinAccountTypeAttr> getFinAccountTypeAttrs() {
		return (List<FinAccountTypeAttr>)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ATTRS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FinAccountTypeGlAccount> getFinAccountTypeGlAccounts() {
		return (List<FinAccountTypeGlAccount>)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_GL_ACCOUNTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRefundable() {
		return (Boolean)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__IS_REFUNDABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRefundable(boolean newIsRefundable) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__IS_REFUNDABLE, newIsRefundable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReplenishEnumId() {
		return (Enumeration)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__REPLENISH_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishEnumId(Enumeration newReplenishEnumId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__REPLENISH_ENUM_ID, newReplenishEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountType getParentTypeId() {
		return (FinAccountType)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(FinAccountType newParentTypeId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountTypeId() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTypeId(String newFinAccountTypeId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID, newFinAccountTypeId);
	}

} //FinAccountTypeImpl
