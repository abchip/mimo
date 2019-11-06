/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.content.content.ContentKeyword;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentKeywordImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentKeywordImpl#getRelevancyWeight <em>Relevancy Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentKeywordImpl#getContentId <em>Content Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentKeywordImpl extends BizEntityImpl implements ContentKeyword {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected String keyword = KEYWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelevancyWeight() <em>Relevancy Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevancyWeight()
	 * @generated
	 * @ordered
	 */
	protected static final long RELEVANCY_WEIGHT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRelevancyWeight() <em>Relevancy Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevancyWeight()
	 * @generated
	 * @ordered
	 */
	protected long relevancyWeight = RELEVANCY_WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected Content contentId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_KEYWORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getContentId() {
		if (contentId != null && ((EObject)contentId).eIsProxy()) {
			InternalEObject oldContentId = (InternalEObject)contentId;
			contentId = (Content)eResolveProxy(oldContentId);
			if (contentId != oldContentId) {
			}
		}
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(Content newContentId) {
		contentId = newContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyword(String newKeyword) {
		keyword = newKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRelevancyWeight() {
		return relevancyWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelevancyWeight(long newRelevancyWeight) {
		relevancyWeight = newRelevancyWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_KEYWORD__KEYWORD:
				return getKeyword();
			case ContentPackage.CONTENT_KEYWORD__RELEVANCY_WEIGHT:
				return getRelevancyWeight();
			case ContentPackage.CONTENT_KEYWORD__CONTENT_ID:
				if (resolve) return getContentId();
				return basicGetContentId();
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
			case ContentPackage.CONTENT_KEYWORD__KEYWORD:
				setKeyword((String)newValue);
				return;
			case ContentPackage.CONTENT_KEYWORD__RELEVANCY_WEIGHT:
				setRelevancyWeight((Long)newValue);
				return;
			case ContentPackage.CONTENT_KEYWORD__CONTENT_ID:
				setContentId((Content)newValue);
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
			case ContentPackage.CONTENT_KEYWORD__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
				return;
			case ContentPackage.CONTENT_KEYWORD__RELEVANCY_WEIGHT:
				setRelevancyWeight(RELEVANCY_WEIGHT_EDEFAULT);
				return;
			case ContentPackage.CONTENT_KEYWORD__CONTENT_ID:
				setContentId((Content)null);
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
			case ContentPackage.CONTENT_KEYWORD__KEYWORD:
				return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
			case ContentPackage.CONTENT_KEYWORD__RELEVANCY_WEIGHT:
				return relevancyWeight != RELEVANCY_WEIGHT_EDEFAULT;
			case ContentPackage.CONTENT_KEYWORD__CONTENT_ID:
				return contentId != null;
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
		result.append(" (keyword: ");
		result.append(keyword);
		result.append(", relevancyWeight: ");
		result.append(relevancyWeight);
		result.append(')');
		return result.toString();
	}

} //ContentKeywordImpl
