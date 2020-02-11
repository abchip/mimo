/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.List;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccountClass;
import org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember;
import org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization;
import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.accounting.ledger.GlResourceType;
import org.abchip.mimo.biz.accounting.ledger.GlXbrlClass;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getAccountCode <em>Account Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getAccountName <em>Account Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountClassId <em>Gl Account Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountGroupMembers <em>Gl Account Group Members</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountOrganizations <em>Gl Account Organizations</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlAccountTypeId <em>Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlResourceTypeId <em>Gl Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getGlXbrlClassId <em>Gl Xbrl Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getParentGlAccountId <em>Parent Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlAccountImpl extends BizEntityTypedImpl<GlAccountType> implements GlAccount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountCode() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountCode(String newAccountCode) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_CODE, newAccountCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountName() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountName(String newAccountName) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_NAME, newAccountName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__EXTERNAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__EXTERNAL_ID, newExternalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getGlAccountTypeId() {
		return (GlAccountType)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountTypeId(GlAccountType newGlAccountTypeId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_TYPE_ID, newGlAccountTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountClass getGlAccountClassId() {
		return (GlAccountClass)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountClassId(GlAccountClass newGlAccountClassId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_CLASS_ID, newGlAccountClassId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<GlAccountGroupMember> getGlAccountGroupMembers() {
		return (List<GlAccountGroupMember>)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<GlAccountOrganization> getGlAccountOrganizations() {
		return (List<GlAccountOrganization>)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlResourceType getGlResourceTypeId() {
		return (GlResourceType)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_RESOURCE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlResourceTypeId(GlResourceType newGlResourceTypeId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_RESOURCE_TYPE_ID, newGlResourceTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlXbrlClass getGlXbrlClassId() {
		return (GlXbrlClass)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_XBRL_CLASS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlXbrlClassId(GlXbrlClass newGlXbrlClassId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_XBRL_CLASS_ID, newGlXbrlClassId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getParentGlAccountId() {
		return (GlAccount)eGet(LedgerPackage.Literals.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentGlAccountId(GlAccount newParentGlAccountId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__PARENT_GL_ACCOUNT_ID, newParentGlAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(String newGlAccountId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_ID, newGlAccountId);
	}

} //GlAccountImpl
