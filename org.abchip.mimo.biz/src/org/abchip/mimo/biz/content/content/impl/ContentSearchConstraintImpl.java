/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Search Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getContentSearchResultId <em>Content Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getConstraintSeqId <em>Constraint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getAnyPrefix <em>Any Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getAnySuffix <em>Any Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getHighValue <em>High Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#isIncludeSubCategories <em>Include Sub Categories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getInfoString <em>Info String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#isIsAnd <em>Is And</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentSearchConstraintImpl#isRemoveStems <em>Remove Stems</em>}</li>
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
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintName(String newConstraintName) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_NAME, newConstraintName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintSeqId() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintSeqId(String newConstraintSeqId) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID, newConstraintSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnyPrefix() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__ANY_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnyPrefix(String newAnyPrefix) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__ANY_PREFIX, newAnyPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnySuffix() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__ANY_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnySuffix(String newAnySuffix) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__ANY_SUFFIX, newAnySuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentSearchResult getContentSearchResultId() {
		return (ContentSearchResult)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentSearchResultId(ContentSearchResult newContentSearchResultId) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__CONTENT_SEARCH_RESULT_ID, newContentSearchResultId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHighValue() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__HIGH_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighValue(String newHighValue) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__HIGH_VALUE, newHighValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeSubCategories() {
		return (Boolean)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeSubCategories(boolean newIncludeSubCategories) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES, newIncludeSubCategories);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfoString() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__INFO_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoString(String newInfoString) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__INFO_STRING, newInfoString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAnd() {
		return (Boolean)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__IS_AND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAnd(boolean newIsAnd) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__IS_AND, newIsAnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLowValue() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__LOW_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowValue(String newLowValue) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__LOW_VALUE, newLowValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoveStems() {
		return (Boolean)eGet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__REMOVE_STEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveStems(boolean newRemoveStems) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_CONSTRAINT__REMOVE_STEMS, newRemoveStems);
	}

} //ContentSearchConstraintImpl
