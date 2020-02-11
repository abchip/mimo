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
 * A representation of the model object '<em><b>Content Search Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getContentSearchResultId <em>Content Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getConstraintSeqId <em>Constraint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getAnyPrefix <em>Any Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getAnySuffix <em>Any Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getHighValue <em>High Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#isIncludeSubCategories <em>Include Sub Categories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getInfoString <em>Info String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#isIsAnd <em>Is And</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#isRemoveStems <em>Remove Stems</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint()
 * @model annotation="mimo-ent-frame title='Content Search Result Constraint'"
 * @generated
 */
public interface ContentSearchConstraint extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Name</em>' attribute.
	 * @see #setConstraintName(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_ConstraintName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getConstraintName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getConstraintName <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Name</em>' attribute.
	 * @see #getConstraintName()
	 * @generated
	 */
	void setConstraintName(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Seq Id</em>' attribute.
	 * @see #setConstraintSeqId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_ConstraintSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConstraintSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getConstraintSeqId <em>Constraint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Seq Id</em>' attribute.
	 * @see #getConstraintSeqId()
	 * @generated
	 */
	void setConstraintSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Any Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Prefix</em>' attribute.
	 * @see #setAnyPrefix(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_AnyPrefix()
	 * @model
	 * @generated
	 */
	String getAnyPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getAnyPrefix <em>Any Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Prefix</em>' attribute.
	 * @see #getAnyPrefix()
	 * @generated
	 */
	void setAnyPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Any Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Suffix</em>' attribute.
	 * @see #setAnySuffix(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_AnySuffix()
	 * @model
	 * @generated
	 */
	String getAnySuffix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getAnySuffix <em>Any Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Suffix</em>' attribute.
	 * @see #getAnySuffix()
	 * @generated
	 */
	void setAnySuffix(String value);

	/**
	 * Returns the value of the '<em><b>Content Search Result Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Search Result Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Search Result Id</em>' reference.
	 * @see #setContentSearchResultId(ContentSearchResult)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_ContentSearchResultId()
	 * @model keys="contentSearchResultId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContentSearchResult getContentSearchResultId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getContentSearchResultId <em>Content Search Result Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Search Result Id</em>' reference.
	 * @see #getContentSearchResultId()
	 * @generated
	 */
	void setContentSearchResultId(ContentSearchResult value);

	/**
	 * Returns the value of the '<em><b>High Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Value</em>' attribute.
	 * @see #setHighValue(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_HighValue()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getHighValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getHighValue <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Value</em>' attribute.
	 * @see #getHighValue()
	 * @generated
	 */
	void setHighValue(String value);

	/**
	 * Returns the value of the '<em><b>Include Sub Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Sub Categories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Sub Categories</em>' attribute.
	 * @see #setIncludeSubCategories(boolean)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_IncludeSubCategories()
	 * @model
	 * @generated
	 */
	boolean isIncludeSubCategories();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#isIncludeSubCategories <em>Include Sub Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Sub Categories</em>' attribute.
	 * @see #isIncludeSubCategories()
	 * @generated
	 */
	void setIncludeSubCategories(boolean value);

	/**
	 * Returns the value of the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info String</em>' attribute.
	 * @see #setInfoString(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_InfoString()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getInfoString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getInfoString <em>Info String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info String</em>' attribute.
	 * @see #getInfoString()
	 * @generated
	 */
	void setInfoString(String value);

	/**
	 * Returns the value of the '<em><b>Is And</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is And</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is And</em>' attribute.
	 * @see #setIsAnd(boolean)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_IsAnd()
	 * @model
	 * @generated
	 */
	boolean isIsAnd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#isIsAnd <em>Is And</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is And</em>' attribute.
	 * @see #isIsAnd()
	 * @generated
	 */
	void setIsAnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Low Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Value</em>' attribute.
	 * @see #setLowValue(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_LowValue()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLowValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#getLowValue <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Value</em>' attribute.
	 * @see #getLowValue()
	 * @generated
	 */
	void setLowValue(String value);

	/**
	 * Returns the value of the '<em><b>Remove Stems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Stems</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Stems</em>' attribute.
	 * @see #setRemoveStems(boolean)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentSearchConstraint_RemoveStems()
	 * @model
	 * @generated
	 */
	boolean isRemoveStems();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentSearchConstraint#isRemoveStems <em>Remove Stems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Stems</em>' attribute.
	 * @see #isRemoveStems()
	 * @generated
	 */
	void setRemoveStems(boolean value);

} // ContentSearchConstraint
