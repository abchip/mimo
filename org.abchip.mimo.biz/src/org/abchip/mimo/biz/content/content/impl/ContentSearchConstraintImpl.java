/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentSearchConstraint;
import org.abchip.mimo.biz.content.content.ContentSearchResult;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Search Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getConstraintSeqId <em>Constraint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#isAnyPrefix <em>Any Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#isAnySuffix <em>Any Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getHighValue <em>High Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#isIncludeSubCategories <em>Include Sub Categories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getInfoString <em>Info String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#isIsAnd <em>Is And</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#isRemoveStems <em>Remove Stems</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getContentSearchResultId <em>Content Search Result Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentSearchConstraintImpl extends BizEntityImpl implements ContentSearchConstraint {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getConstraintSeqId() <em>Constraint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintSeqId() <em>Constraint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSeqId()
	 * @generated
	 * @ordered
	 */
	protected String constraintSeqId = CONSTRAINT_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnyPrefix() <em>Any Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANY_PREFIX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnyPrefix() <em>Any Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnyPrefix()
	 * @generated
	 * @ordered
	 */
	protected boolean anyPrefix = ANY_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnySuffix() <em>Any Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnySuffix()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANY_SUFFIX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnySuffix() <em>Any Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnySuffix()
	 * @generated
	 * @ordered
	 */
	protected boolean anySuffix = ANY_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighValue()
	 * @generated
	 * @ordered
	 */
	protected static final String HIGH_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighValue()
	 * @generated
	 * @ordered
	 */
	protected String highValue = HIGH_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeSubCategories() <em>Include Sub Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubCategories()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_SUB_CATEGORIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeSubCategories() <em>Include Sub Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubCategories()
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubCategories = INCLUDE_SUB_CATEGORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoString() <em>Info String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoString()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoString() <em>Info String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoString()
	 * @generated
	 * @ordered
	 */
	protected String infoString = INFO_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAnd() <em>Is And</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAnd() <em>Is And</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAnd()
	 * @generated
	 * @ordered
	 */
	protected boolean isAnd = IS_AND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowValue()
	 * @generated
	 * @ordered
	 */
	protected static final String LOW_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowValue()
	 * @generated
	 * @ordered
	 */
	protected String lowValue = LOW_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoveStems() <em>Remove Stems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveStems()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_STEMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveStems() <em>Remove Stems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveStems()
	 * @generated
	 * @ordered
	 */
	protected boolean removeStems = REMOVE_STEMS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContentSearchResultId() <em>Content Search Result Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentSearchResultId()
	 * @generated
	 * @ordered
	 */
	protected ContentSearchResult contentSearchResultId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentSearchConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintName(String newConstraintName) {
		String oldConstraintName = constraintName;
		constraintName = newConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_NAME, oldConstraintName, constraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintSeqId() {
		return constraintSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintSeqId(String newConstraintSeqId) {
		String oldConstraintSeqId = constraintSeqId;
		constraintSeqId = newConstraintSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID, oldConstraintSeqId, constraintSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnyPrefix() {
		return anyPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnyPrefix(boolean newAnyPrefix) {
		boolean oldAnyPrefix = anyPrefix;
		anyPrefix = newAnyPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_PREFIX, oldAnyPrefix, anyPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnySuffix() {
		return anySuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnySuffix(boolean newAnySuffix) {
		boolean oldAnySuffix = anySuffix;
		anySuffix = newAnySuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_SUFFIX, oldAnySuffix, anySuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentSearchResult getContentSearchResultId() {
		if (contentSearchResultId != null && ((EObject)contentSearchResultId).eIsProxy()) {
			InternalEObject oldContentSearchResultId = (InternalEObject)contentSearchResultId;
			contentSearchResultId = (ContentSearchResult)eResolveProxy(oldContentSearchResultId);
			if (contentSearchResultId != oldContentSearchResultId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT_ID, oldContentSearchResultId, contentSearchResultId));
			}
		}
		return contentSearchResultId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentSearchResult basicGetContentSearchResultId() {
		return contentSearchResultId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentSearchResultId(ContentSearchResult newContentSearchResultId) {
		ContentSearchResult oldContentSearchResultId = contentSearchResultId;
		contentSearchResultId = newContentSearchResultId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT_ID, oldContentSearchResultId, contentSearchResultId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHighValue() {
		return highValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighValue(String newHighValue) {
		String oldHighValue = highValue;
		highValue = newHighValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__HIGH_VALUE, oldHighValue, highValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeSubCategories() {
		return includeSubCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeSubCategories(boolean newIncludeSubCategories) {
		boolean oldIncludeSubCategories = includeSubCategories;
		includeSubCategories = newIncludeSubCategories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES, oldIncludeSubCategories, includeSubCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfoString() {
		return infoString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoString(String newInfoString) {
		String oldInfoString = infoString;
		infoString = newInfoString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__INFO_STRING, oldInfoString, infoString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAnd() {
		return isAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAnd(boolean newIsAnd) {
		boolean oldIsAnd = isAnd;
		isAnd = newIsAnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__IS_AND, oldIsAnd, isAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLowValue() {
		return lowValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowValue(String newLowValue) {
		String oldLowValue = lowValue;
		lowValue = newLowValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__LOW_VALUE, oldLowValue, lowValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoveStems() {
		return removeStems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveStems(boolean newRemoveStems) {
		boolean oldRemoveStems = removeStems;
		removeStems = newRemoveStems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_SEARCH_CONSTRAINT__REMOVE_STEMS, oldRemoveStems, removeStems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID:
				return getConstraintSeqId();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_PREFIX:
				return isAnyPrefix();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_SUFFIX:
				return isAnySuffix();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_NAME:
				return getConstraintName();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__HIGH_VALUE:
				return getHighValue();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES:
				return isIncludeSubCategories();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__INFO_STRING:
				return getInfoString();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__IS_AND:
				return isIsAnd();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__LOW_VALUE:
				return getLowValue();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__REMOVE_STEMS:
				return isRemoveStems();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT_ID:
				if (resolve) return getContentSearchResultId();
				return basicGetContentSearchResultId();
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
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID:
				setConstraintSeqId((String)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_PREFIX:
				setAnyPrefix((Boolean)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_SUFFIX:
				setAnySuffix((Boolean)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__HIGH_VALUE:
				setHighValue((String)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES:
				setIncludeSubCategories((Boolean)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__INFO_STRING:
				setInfoString((String)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__IS_AND:
				setIsAnd((Boolean)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__LOW_VALUE:
				setLowValue((String)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__REMOVE_STEMS:
				setRemoveStems((Boolean)newValue);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT_ID:
				setContentSearchResultId((ContentSearchResult)newValue);
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
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID:
				setConstraintSeqId(CONSTRAINT_SEQ_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_PREFIX:
				setAnyPrefix(ANY_PREFIX_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_SUFFIX:
				setAnySuffix(ANY_SUFFIX_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__HIGH_VALUE:
				setHighValue(HIGH_VALUE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES:
				setIncludeSubCategories(INCLUDE_SUB_CATEGORIES_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__INFO_STRING:
				setInfoString(INFO_STRING_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__IS_AND:
				setIsAnd(IS_AND_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__LOW_VALUE:
				setLowValue(LOW_VALUE_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__REMOVE_STEMS:
				setRemoveStems(REMOVE_STEMS_EDEFAULT);
				return;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT_ID:
				setContentSearchResultId((ContentSearchResult)null);
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
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID:
				return CONSTRAINT_SEQ_ID_EDEFAULT == null ? constraintSeqId != null : !CONSTRAINT_SEQ_ID_EDEFAULT.equals(constraintSeqId);
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_PREFIX:
				return anyPrefix != ANY_PREFIX_EDEFAULT;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__ANY_SUFFIX:
				return anySuffix != ANY_SUFFIX_EDEFAULT;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__HIGH_VALUE:
				return HIGH_VALUE_EDEFAULT == null ? highValue != null : !HIGH_VALUE_EDEFAULT.equals(highValue);
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES:
				return includeSubCategories != INCLUDE_SUB_CATEGORIES_EDEFAULT;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__INFO_STRING:
				return INFO_STRING_EDEFAULT == null ? infoString != null : !INFO_STRING_EDEFAULT.equals(infoString);
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__IS_AND:
				return isAnd != IS_AND_EDEFAULT;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__LOW_VALUE:
				return LOW_VALUE_EDEFAULT == null ? lowValue != null : !LOW_VALUE_EDEFAULT.equals(lowValue);
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__REMOVE_STEMS:
				return removeStems != REMOVE_STEMS_EDEFAULT;
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT_ID:
				return contentSearchResultId != null;
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
		result.append(" (constraintSeqId: ");
		result.append(constraintSeqId);
		result.append(", anyPrefix: ");
		result.append(anyPrefix);
		result.append(", anySuffix: ");
		result.append(anySuffix);
		result.append(", constraintName: ");
		result.append(constraintName);
		result.append(", highValue: ");
		result.append(highValue);
		result.append(", includeSubCategories: ");
		result.append(includeSubCategories);
		result.append(", infoString: ");
		result.append(infoString);
		result.append(", isAnd: ");
		result.append(isAnd);
		result.append(", lowValue: ");
		result.append(lowValue);
		result.append(", removeStems: ");
		result.append(removeStems);
		result.append(')');
		return result.toString();
	}

} //ContentSearchConstraintImpl
