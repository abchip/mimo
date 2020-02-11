/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Assoc Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssocPredicate#getContentAssocPredicateId <em>Content Assoc Predicate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssocPredicate#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssocPredicate()
 * @model annotation="mimo-ent-frame title='Content Association Predicate' dictionary='ContentEntityLabels' formula='description'"
 * @generated
 */
public interface ContentAssocPredicate extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Content Assoc Predicate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Assoc Predicate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Assoc Predicate Id</em>' attribute.
	 * @see #setContentAssocPredicateId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssocPredicate_ContentAssocPredicateId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentAssocPredicateId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssocPredicate#getContentAssocPredicateId <em>Content Assoc Predicate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Assoc Predicate Id</em>' attribute.
	 * @see #getContentAssocPredicateId()
	 * @generated
	 */
	void setContentAssocPredicateId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssocPredicate_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssocPredicate#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ContentAssocPredicate
