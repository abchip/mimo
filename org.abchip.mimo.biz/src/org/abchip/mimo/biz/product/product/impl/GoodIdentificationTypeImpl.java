/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.product.GoodIdentification;
import org.abchip.mimo.biz.product.product.GoodIdentificationType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Good Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#getGoodIdentificationTypeId <em>Good Identification Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#getGoodIdentifications <em>Good Identifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoodIdentificationTypeImpl extends BizEntityTypeImpl<GoodIdentification> implements GoodIdentificationType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoodIdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<GoodIdentification> getGoodIdentifications() {
		return (List<GoodIdentification>)eGet(ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoodIdentificationType getParentTypeId() {
		return (GoodIdentificationType)eGet(ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(GoodIdentificationType newParentTypeId) {
		eSet(ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGoodIdentificationTypeId() {
		return (String)eGet(ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoodIdentificationTypeId(String newGoodIdentificationTypeId) {
		eSet(ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID, newGoodIdentificationTypeId);
	}

} //GoodIdentificationTypeImpl
