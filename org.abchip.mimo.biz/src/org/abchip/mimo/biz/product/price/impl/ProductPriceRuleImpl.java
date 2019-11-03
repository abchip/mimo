/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.ProductPriceRule;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Price Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl#isIsSale <em>Is Sale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl#getProductPriceActions <em>Product Price Actions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl#getProductPriceConds <em>Product Price Conds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPriceRuleImpl extends BizEntityImpl implements ProductPriceRule {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductPriceRuleId() <em>Product Price Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPriceRuleId() <em>Product Price Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceRuleId()
	 * @generated
	 * @ordered
	 */
	protected String productPriceRuleId = PRODUCT_PRICE_RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSale() <em>Is Sale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSale()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SALE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSale() <em>Is Sale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSale()
	 * @generated
	 * @ordered
	 */
	protected boolean isSale = IS_SALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleName() <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleName()
	 * @generated
	 * @ordered
	 */
	protected String ruleName = RULE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductPriceActions() <em>Product Price Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceActions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productPriceActions;

	/**
	 * The cached value of the '{@link #getProductPriceConds() <em>Product Price Conds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceConds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productPriceConds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPriceRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRODUCT_PRICE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_RULE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_RULE__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSale() {
		return isSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSale(boolean newIsSale) {
		boolean oldIsSale = isSale;
		isSale = newIsSale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_RULE__IS_SALE, oldIsSale, isSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleName() {
		return ruleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleName(String newRuleName) {
		String oldRuleName = ruleName;
		ruleName = newRuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_RULE__RULE_NAME, oldRuleName, ruleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_RULE__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductPriceActions() {
		if (productPriceActions == null) {
			productPriceActions = new EDataTypeUniqueEList<String>(String.class, this, PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_ACTIONS);
		}
		return productPriceActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductPriceConds() {
		if (productPriceConds == null) {
			productPriceConds = new EDataTypeUniqueEList<String>(String.class, this, PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_CONDS);
		}
		return productPriceConds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderItemPriceInfos() {
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
	public String getProductPriceRuleId() {
		return productPriceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceRuleId(String newProductPriceRuleId) {
		String oldProductPriceRuleId = productPriceRuleId;
		productPriceRuleId = newProductPriceRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_RULE_ID, oldProductPriceRuleId, productPriceRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_RULE_ID:
				return getProductPriceRuleId();
			case PricePackage.PRODUCT_PRICE_RULE__DESCRIPTION:
				return getDescription();
			case PricePackage.PRODUCT_PRICE_RULE__FROM_DATE:
				return getFromDate();
			case PricePackage.PRODUCT_PRICE_RULE__IS_SALE:
				return isIsSale();
			case PricePackage.PRODUCT_PRICE_RULE__RULE_NAME:
				return getRuleName();
			case PricePackage.PRODUCT_PRICE_RULE__THRU_DATE:
				return getThruDate();
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_ACTIONS:
				return getProductPriceActions();
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_CONDS:
				return getProductPriceConds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__IS_SALE:
				setIsSale((Boolean)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__RULE_NAME:
				setRuleName((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_ACTIONS:
				getProductPriceActions().clear();
				getProductPriceActions().addAll((Collection<? extends String>)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_CONDS:
				getProductPriceConds().clear();
				getProductPriceConds().addAll((Collection<? extends String>)newValue);
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
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId(PRODUCT_PRICE_RULE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__IS_SALE:
				setIsSale(IS_SALE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__RULE_NAME:
				setRuleName(RULE_NAME_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_ACTIONS:
				getProductPriceActions().clear();
				return;
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_CONDS:
				getProductPriceConds().clear();
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
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_RULE_ID:
				return PRODUCT_PRICE_RULE_ID_EDEFAULT == null ? productPriceRuleId != null : !PRODUCT_PRICE_RULE_ID_EDEFAULT.equals(productPriceRuleId);
			case PricePackage.PRODUCT_PRICE_RULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PricePackage.PRODUCT_PRICE_RULE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PricePackage.PRODUCT_PRICE_RULE__IS_SALE:
				return isSale != IS_SALE_EDEFAULT;
			case PricePackage.PRODUCT_PRICE_RULE__RULE_NAME:
				return RULE_NAME_EDEFAULT == null ? ruleName != null : !RULE_NAME_EDEFAULT.equals(ruleName);
			case PricePackage.PRODUCT_PRICE_RULE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_ACTIONS:
				return productPriceActions != null && !productPriceActions.isEmpty();
			case PricePackage.PRODUCT_PRICE_RULE__PRODUCT_PRICE_CONDS:
				return productPriceConds != null && !productPriceConds.isEmpty();
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
		result.append(" (productPriceRuleId: ");
		result.append(productPriceRuleId);
		result.append(", description: ");
		result.append(description);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", isSale: ");
		result.append(isSale);
		result.append(", ruleName: ");
		result.append(ruleName);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", productPriceActions: ");
		result.append(productPriceActions);
		result.append(", productPriceConds: ");
		result.append(productPriceConds);
		result.append(')');
		return result.toString();
	}

} //ProductPriceRuleImpl
