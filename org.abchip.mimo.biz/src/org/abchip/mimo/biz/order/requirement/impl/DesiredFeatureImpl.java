/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.requirement.DesiredFeature;
import org.abchip.mimo.biz.order.requirement.RequirementPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Desired Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.DesiredFeatureImpl#getDesiredFeatureId <em>Desired Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.DesiredFeatureImpl#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.DesiredFeatureImpl#isOptionalInd <em>Optional Ind</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.DesiredFeatureImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesiredFeatureImpl extends BizEntityImpl implements DesiredFeature {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getDesiredFeatureId() <em>Desired Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIRED_FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredFeatureId() <em>Desired Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String desiredFeatureId = DESIRED_FEATURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequirementId() <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementId() <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementId()
	 * @generated
	 * @ordered
	 */
	protected String requirementId = REQUIREMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptionalInd() <em>Optional Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalInd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_IND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptionalInd() <em>Optional Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalInd()
	 * @generated
	 * @ordered
	 */
	protected boolean optionalInd = OPTIONAL_IND_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureId = PRODUCT_FEATURE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesiredFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.DESIRED_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesiredFeatureId() {
		return desiredFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredFeatureId(String newDesiredFeatureId) {
		String oldDesiredFeatureId = desiredFeatureId;
		desiredFeatureId = newDesiredFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.DESIRED_FEATURE__DESIRED_FEATURE_ID, oldDesiredFeatureId, desiredFeatureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		String oldProductFeatureId = productFeatureId;
		productFeatureId = newProductFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.DESIRED_FEATURE__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequirementId() {
		return requirementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementId(String newRequirementId) {
		String oldRequirementId = requirementId;
		requirementId = newRequirementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.DESIRED_FEATURE__REQUIREMENT_ID, oldRequirementId, requirementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOptionalInd() {
		return optionalInd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptionalInd(boolean newOptionalInd) {
		boolean oldOptionalInd = optionalInd;
		optionalInd = newOptionalInd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementPackage.DESIRED_FEATURE__OPTIONAL_IND, oldOptionalInd, optionalInd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementPackage.DESIRED_FEATURE__DESIRED_FEATURE_ID:
				return getDesiredFeatureId();
			case RequirementPackage.DESIRED_FEATURE__REQUIREMENT_ID:
				return getRequirementId();
			case RequirementPackage.DESIRED_FEATURE__OPTIONAL_IND:
				return isOptionalInd();
			case RequirementPackage.DESIRED_FEATURE__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementPackage.DESIRED_FEATURE__DESIRED_FEATURE_ID:
				setDesiredFeatureId((String)newValue);
				return;
			case RequirementPackage.DESIRED_FEATURE__REQUIREMENT_ID:
				setRequirementId((String)newValue);
				return;
			case RequirementPackage.DESIRED_FEATURE__OPTIONAL_IND:
				setOptionalInd((Boolean)newValue);
				return;
			case RequirementPackage.DESIRED_FEATURE__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequirementPackage.DESIRED_FEATURE__DESIRED_FEATURE_ID:
				setDesiredFeatureId(DESIRED_FEATURE_ID_EDEFAULT);
				return;
			case RequirementPackage.DESIRED_FEATURE__REQUIREMENT_ID:
				setRequirementId(REQUIREMENT_ID_EDEFAULT);
				return;
			case RequirementPackage.DESIRED_FEATURE__OPTIONAL_IND:
				setOptionalInd(OPTIONAL_IND_EDEFAULT);
				return;
			case RequirementPackage.DESIRED_FEATURE__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequirementPackage.DESIRED_FEATURE__DESIRED_FEATURE_ID:
				return DESIRED_FEATURE_ID_EDEFAULT == null ? desiredFeatureId != null : !DESIRED_FEATURE_ID_EDEFAULT.equals(desiredFeatureId);
			case RequirementPackage.DESIRED_FEATURE__REQUIREMENT_ID:
				return REQUIREMENT_ID_EDEFAULT == null ? requirementId != null : !REQUIREMENT_ID_EDEFAULT.equals(requirementId);
			case RequirementPackage.DESIRED_FEATURE__OPTIONAL_IND:
				return optionalInd != OPTIONAL_IND_EDEFAULT;
			case RequirementPackage.DESIRED_FEATURE__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (desiredFeatureId: ");
		result.append(desiredFeatureId);
		result.append(", requirementId: ");
		result.append(requirementId);
		result.append(", optionalInd: ");
		result.append(optionalInd);
		result.append(", productFeatureId: ");
		result.append(productFeatureId);
		result.append(')');
		return result.toString();
	}

} //DesiredFeatureImpl
