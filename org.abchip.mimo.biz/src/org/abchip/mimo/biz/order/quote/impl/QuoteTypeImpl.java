/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.order.quote.Quote;
import org.abchip.mimo.biz.order.quote.QuotePackage;
import org.abchip.mimo.biz.order.quote.QuoteType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quote Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTypeImpl#getQuoteTypeId <em>Quote Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteTypeImpl#getQuoteTypeAttrs <em>Quote Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuoteTypeImpl extends BizEntityTypeImpl<Quote> implements QuoteType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getQuoteTypeId() <em>Quote Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteTypeId() <em>Quote Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteTypeId()
	 * @generated
	 * @ordered
	 */
	protected String quoteTypeId = QUOTE_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String parentTypeId = PARENT_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuoteTypeAttrs() <em>Quote Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> quoteTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuoteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuotePackage.Literals.QUOTE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(String newParentTypeId) {
		String oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteTypeId() {
		return quoteTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteTypeId(String newQuoteTypeId) {
		String oldQuoteTypeId = quoteTypeId;
		quoteTypeId = newQuoteTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ID, oldQuoteTypeId, quoteTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getQuoteTypeAttrs() {
		if (quoteTypeAttrs == null) {
			quoteTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ATTRS);
		}
		return quoteTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childQuoteTypes() {
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
	public List<String> partyPrefDocTypeTpls() {
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
	public List<String> quotes() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ID:
				return getQuoteTypeId();
			case QuotePackage.QUOTE_TYPE__DESCRIPTION:
				return getDescription();
			case QuotePackage.QUOTE_TYPE__HAS_TABLE:
				return isHasTable();
			case QuotePackage.QUOTE_TYPE__PARENT_TYPE_ID:
				return getParentTypeId();
			case QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ATTRS:
				return getQuoteTypeAttrs();
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
			case QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ID:
				setQuoteTypeId((String)newValue);
				return;
			case QuotePackage.QUOTE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QuotePackage.QUOTE_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case QuotePackage.QUOTE_TYPE__PARENT_TYPE_ID:
				setParentTypeId((String)newValue);
				return;
			case QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ATTRS:
				getQuoteTypeAttrs().clear();
				getQuoteTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ID:
				setQuoteTypeId(QUOTE_TYPE_ID_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TYPE__PARENT_TYPE_ID:
				setParentTypeId(PARENT_TYPE_ID_EDEFAULT);
				return;
			case QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ATTRS:
				getQuoteTypeAttrs().clear();
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
			case QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ID:
				return QUOTE_TYPE_ID_EDEFAULT == null ? quoteTypeId != null : !QUOTE_TYPE_ID_EDEFAULT.equals(quoteTypeId);
			case QuotePackage.QUOTE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QuotePackage.QUOTE_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case QuotePackage.QUOTE_TYPE__PARENT_TYPE_ID:
				return PARENT_TYPE_ID_EDEFAULT == null ? parentTypeId != null : !PARENT_TYPE_ID_EDEFAULT.equals(parentTypeId);
			case QuotePackage.QUOTE_TYPE__QUOTE_TYPE_ATTRS:
				return quoteTypeAttrs != null && !quoteTypeAttrs.isEmpty();
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
		result.append(" (quoteTypeId: ");
		result.append(quoteTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", parentTypeId: ");
		result.append(parentTypeId);
		result.append(", quoteTypeAttrs: ");
		result.append(quoteTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //QuoteTypeImpl
