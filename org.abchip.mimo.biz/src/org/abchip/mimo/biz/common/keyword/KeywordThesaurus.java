/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.keyword;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyword Thesaurus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getAlternateKeyword <em>Alternate Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getEnteredKeyword <em>Entered Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getRelationshipEnumId <em>Relationship Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.keyword.KeywordPackage#getKeywordThesaurus()
 * @model
 * @generated
 */
public interface KeywordThesaurus extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Alternate Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternate Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate Keyword</em>' attribute.
	 * @see #setAlternateKeyword(String)
	 * @see org.abchip.mimo.biz.common.keyword.KeywordPackage#getKeywordThesaurus_AlternateKeyword()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAlternateKeyword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getAlternateKeyword <em>Alternate Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate Keyword</em>' attribute.
	 * @see #getAlternateKeyword()
	 * @generated
	 */
	void setAlternateKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Entered Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entered Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entered Keyword</em>' attribute.
	 * @see #setEnteredKeyword(String)
	 * @see org.abchip.mimo.biz.common.keyword.KeywordPackage#getKeywordThesaurus_EnteredKeyword()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getEnteredKeyword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getEnteredKeyword <em>Entered Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entered Keyword</em>' attribute.
	 * @see #getEnteredKeyword()
	 * @generated
	 */
	void setEnteredKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Relationship Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Enum Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Enum Id</em>' reference.
	 * @see #setRelationshipEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.common.keyword.KeywordPackage#getKeywordThesaurus_RelationshipEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getRelationshipEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getRelationshipEnumId <em>Relationship Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Enum Id</em>' reference.
	 * @see #getRelationshipEnumId()
	 * @generated
	 */
	void setRelationshipEnumId(Enumeration value);

} // KeywordThesaurus
