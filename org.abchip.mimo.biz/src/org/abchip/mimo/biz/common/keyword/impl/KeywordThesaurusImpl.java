/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keyword Thesaurus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.keyword.impl.KeywordThesaurusImpl#getEnteredKeyword <em>Entered Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.keyword.impl.KeywordThesaurusImpl#getAlternateKeyword <em>Alternate Keyword</em>}</li>
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
	 * The default value of the '{@link #getEnteredKeyword() <em>Entered Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteredKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTERED_KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnteredKeyword() <em>Entered Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteredKeyword()
	 * @generated
	 * @ordered
	 */
	protected String enteredKeyword = ENTERED_KEYWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getAlternateKeyword() <em>Alternate Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATE_KEYWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAlternateKeyword() <em>Alternate Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateKeyword()
	 * @generated
	 * @ordered
	 */
	protected String alternateKeyword = ALTERNATE_KEYWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationshipEnumId() <em>Relationship Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration relationshipEnumId;

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
		return alternateKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternateKeyword(String newAlternateKeyword) {
		alternateKeyword = newAlternateKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnteredKeyword() {
		return enteredKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnteredKeyword(String newEnteredKeyword) {
		enteredKeyword = newEnteredKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRelationshipEnumId() {
		if (relationshipEnumId != null && ((EObject)relationshipEnumId).eIsProxy()) {
			InternalEObject oldRelationshipEnumId = (InternalEObject)relationshipEnumId;
			relationshipEnumId = (Enumeration)eResolveProxy(oldRelationshipEnumId);
			if (relationshipEnumId != oldRelationshipEnumId) {
			}
		}
		return relationshipEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetRelationshipEnumId() {
		return relationshipEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipEnumId(Enumeration newRelationshipEnumId) {
		relationshipEnumId = newRelationshipEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KeywordPackage.KEYWORD_THESAURUS__ENTERED_KEYWORD:
				return getEnteredKeyword();
			case KeywordPackage.KEYWORD_THESAURUS__ALTERNATE_KEYWORD:
				return getAlternateKeyword();
			case KeywordPackage.KEYWORD_THESAURUS__RELATIONSHIP_ENUM_ID:
				if (resolve) return getRelationshipEnumId();
				return basicGetRelationshipEnumId();
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
			case KeywordPackage.KEYWORD_THESAURUS__ENTERED_KEYWORD:
				setEnteredKeyword((String)newValue);
				return;
			case KeywordPackage.KEYWORD_THESAURUS__ALTERNATE_KEYWORD:
				setAlternateKeyword((String)newValue);
				return;
			case KeywordPackage.KEYWORD_THESAURUS__RELATIONSHIP_ENUM_ID:
				setRelationshipEnumId((Enumeration)newValue);
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
			case KeywordPackage.KEYWORD_THESAURUS__ENTERED_KEYWORD:
				setEnteredKeyword(ENTERED_KEYWORD_EDEFAULT);
				return;
			case KeywordPackage.KEYWORD_THESAURUS__ALTERNATE_KEYWORD:
				setAlternateKeyword(ALTERNATE_KEYWORD_EDEFAULT);
				return;
			case KeywordPackage.KEYWORD_THESAURUS__RELATIONSHIP_ENUM_ID:
				setRelationshipEnumId((Enumeration)null);
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
			case KeywordPackage.KEYWORD_THESAURUS__ENTERED_KEYWORD:
				return ENTERED_KEYWORD_EDEFAULT == null ? enteredKeyword != null : !ENTERED_KEYWORD_EDEFAULT.equals(enteredKeyword);
			case KeywordPackage.KEYWORD_THESAURUS__ALTERNATE_KEYWORD:
				return ALTERNATE_KEYWORD_EDEFAULT == null ? alternateKeyword != null : !ALTERNATE_KEYWORD_EDEFAULT.equals(alternateKeyword);
			case KeywordPackage.KEYWORD_THESAURUS__RELATIONSHIP_ENUM_ID:
				return relationshipEnumId != null;
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
		result.append(" (enteredKeyword: ");
		result.append(enteredKeyword);
		result.append(", alternateKeyword: ");
		result.append(alternateKeyword);
		result.append(')');
		return result.toString();
	}

} //KeywordThesaurusImpl
