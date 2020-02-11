/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.keyword.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.keyword.KeywordPackage;
import org.abchip.mimo.biz.common.keyword.KeywordThesaurus;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keyword Thesaurus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.keyword.impl.KeywordThesaurusImpl#getAlternateKeyword <em>Alternate Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.keyword.impl.KeywordThesaurusImpl#getEnteredKeyword <em>Entered Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.keyword.impl.KeywordThesaurusImpl#getRelationshipEnumId <em>Relationship Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeywordThesaurusImpl extends BizEntityImpl implements KeywordThesaurus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeywordThesaurusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KeywordPackage.Literals.KEYWORD_THESAURUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlternateKeyword() {
		return (String)eGet(KeywordPackage.Literals.KEYWORD_THESAURUS__ALTERNATE_KEYWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternateKeyword(String newAlternateKeyword) {
		eSet(KeywordPackage.Literals.KEYWORD_THESAURUS__ALTERNATE_KEYWORD, newAlternateKeyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnteredKeyword() {
		return (String)eGet(KeywordPackage.Literals.KEYWORD_THESAURUS__ENTERED_KEYWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnteredKeyword(String newEnteredKeyword) {
		eSet(KeywordPackage.Literals.KEYWORD_THESAURUS__ENTERED_KEYWORD, newEnteredKeyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRelationshipEnumId() {
		return (Enumeration)eGet(KeywordPackage.Literals.KEYWORD_THESAURUS__RELATIONSHIP_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipEnumId(Enumeration newRelationshipEnumId) {
		eSet(KeywordPackage.Literals.KEYWORD_THESAURUS__RELATIONSHIP_ENUM_ID, newRelationshipEnumId);
	}

} //KeywordThesaurusImpl
