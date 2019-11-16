/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.party.agreement.AgreementItem;
import org.abchip.mimo.biz.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#getAgreementItemTypeId <em>Agreement Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#getAgreementItemTypeAttrs <em>Agreement Item Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementItemTypeImpl extends BizEntityTypeImpl<AgreementItem> implements AgreementItemType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.AGREEMENT_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementItemType getParentTypeId() {
		return (AgreementItemType)eGet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(AgreementItemType newParentTypeId) {
		eSet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAgreementItemTypeAttrs() {
		return (List<String>)eGet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ATTRS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> agreementItems() {
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
	public List<String> childAgreementItemTypes() {
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
			case AgreementPackage.AGREEMENT_ITEM_TYPE___AGREEMENT_ITEMS:
				return agreementItems();
			case AgreementPackage.AGREEMENT_ITEM_TYPE___CHILD_AGREEMENT_ITEM_TYPES:
				return childAgreementItemTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementItemTypeId() {
		return (String)eGet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemTypeId(String newAgreementItemTypeId) {
		eSet(AgreementPackage.Literals.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID, newAgreementItemTypeId);
	}

} //AgreementItemTypeImpl
