/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account Trans Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#getFinAccountTransTypeAttrs <em>Fin Account Trans Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountTransTypeImpl extends BizEntityTypeImpl<FinAccountTrans> implements FinAccountTransType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountTransTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTransType getParentTypeId() {
		return (FinAccountTransType)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(FinAccountTransType newParentTypeId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getFinAccountTransTypeAttrs() {
		return (List<String>)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childFinAccountTransTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> finAccountTranss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE___CHILD_FIN_ACCOUNT_TRANS_TYPES:
				return childFinAccountTransTypes();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE___FIN_ACCOUNT_TRANSS:
				return finAccountTranss();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountTransTypeId() {
		return (String)eGet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransTypeId(String newFinAccountTransTypeId) {
		eSet(FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID, newFinAccountTransTypeId);
	}

} //FinAccountTransTypeImpl
